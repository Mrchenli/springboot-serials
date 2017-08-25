package io.mrchenli.springboot.charpter09redis;

import io.mrchenli.springboot.charpter09redis.domain.User;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.data.redis.connection.jedis.JedisConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.serializer.StringRedisSerializer;

@Configuration
public class RedisConfig {

    @Bean
    @Qualifier("jedisConnectionFactory")
    JedisConnectionFactory jedisConnectionFactory(){
        return new JedisConnectionFactory();
    }

    @Bean
    public RedisTemplate<String,User> redisTemplate(@Qualifier("jedisConnectionFactory") RedisConnectionFactory factory){
        RedisTemplate<String,User> template = new RedisTemplate<>();
        template.setConnectionFactory(factory);
        template.setKeySerializer(new StringRedisSerializer());
        template.setValueSerializer(new RedisObjectSerializer());
        return template;
    }

}
