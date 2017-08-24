package io.mrchenli.springboot.charpter07jdbctemplate;

import io.mrchenli.springboot.charpter07jdbctemplate.service.UserService;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class Charpter07JdbctemplateApplicationTests {

	@Autowired
	private UserService userService;

	@Test
	public void test(){
		userService.create("a",1);
		userService.create("b",2);

		Assert.assertEquals(2,userService.getAllUsers().intValue());

		userService.deleteByName("a");

		Assert.assertEquals(1,userService.getAllUsers().intValue());

	}

}
