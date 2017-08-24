package io.mrchenli.springboot.charpter07jdbctemplate.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public void create(String name, Integer age) {
        jdbcTemplate.update("insert into TB_TEST_USER(NAME,AGE) VALUES (?,?)",name,age);
    }

    @Override
    public void deleteByName(String name) {
        jdbcTemplate.update("delete from TB_TEST_USER WHERE  NAME =?",name);
    }

    @Override
    public Integer getAllUsers() {
        return jdbcTemplate.queryForObject("select count(1) from TB_TEST_USER",Integer.class);
    }

    @Override
    public void deleteAllUsers() {
        jdbcTemplate.update("DELETE  FROM  TB_TEST_USER ");
    }
}
