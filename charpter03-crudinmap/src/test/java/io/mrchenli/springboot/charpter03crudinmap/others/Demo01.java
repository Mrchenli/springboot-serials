package io.mrchenli.springboot.charpter03crudinmap.others;

import org.junit.Test;

/**
 * Long 的hashcode 的值
 * hashcode 返回的就是long的值 那map以hashcode 做为key 的话 自增的userid来讲 一个数组下标存一个user了
 */
public class Demo01 {


    @Test
    public void test01(){
        Long a = 11L;
        Long b = a ;
        Long c = 12L;
        System.out.println(a.hashCode());
        System.out.println(b.hashCode());
        System.out.println(c.hashCode());
    }

}
