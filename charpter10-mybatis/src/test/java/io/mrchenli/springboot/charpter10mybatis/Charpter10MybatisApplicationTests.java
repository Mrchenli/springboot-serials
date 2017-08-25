package io.mrchenli.springboot.charpter10mybatis;

import io.mrchenli.springboot.charpter10mybatis.domain.User;
import io.mrchenli.springboot.charpter10mybatis.domain.UserMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

@RunWith(SpringRunner.class)
@SpringBootTest
@Transactional
public class Charpter10MybatisApplicationTests {

	@Autowired
	private UserMapper userMapper;

	@Test
	@Rollback
	public void findByName() throws Exception {
		userMapper.insert("AAA",20);
		User u = userMapper.findByName("AAA");
		System.out.println("name:"+u.getName()+"  age:"+u.getAge());
	}

}
