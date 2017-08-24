package io.mrchenli.springboot.charpter07jdbctemplate.service;

public interface UserService {


    void create(String name,Integer age);

    void deleteByName(String name);

    Integer getAllUsers();

    void deleteAllUsers();

}
