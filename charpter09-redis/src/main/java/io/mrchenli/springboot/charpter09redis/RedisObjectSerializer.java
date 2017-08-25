package io.mrchenli.springboot.charpter09redis;

import org.springframework.core.convert.converter.Converter;
import org.springframework.core.serializer.support.DeserializingConverter;
import org.springframework.core.serializer.support.SerializingConverter;
import org.springframework.data.redis.serializer.RedisSerializer;
import org.springframework.data.redis.serializer.SerializationException;

public class RedisObjectSerializer implements RedisSerializer {

    private Converter<Object,byte[]> serializer = new SerializingConverter();
    private Converter<byte[],Object> deserializer = new DeserializingConverter();

    static final byte[] EMPTY_ARRAY = new byte[0];

    @Override
    public byte[] serialize(Object o) throws SerializationException {
        if(o==null){
            return EMPTY_ARRAY;
        }
        try {
            return serializer.convert(o);
        }catch (Exception ex){
            return EMPTY_ARRAY;
        }
    }

    @Override
    public Object deserialize(byte[] bytes) throws SerializationException {
        if(isEmpty(bytes)){
            return null;
        }
        try {
            return deserializer.convert(bytes);
        }catch (Exception ex){
            throw new SerializationException("connot deserialize",ex);
        }
    }

    private boolean isEmpty(byte[] data){
        return (data==null||data.length==0);
    }

}
