package io.mrchenli.springboot.charpter03crudinmap;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.RequestBuilder;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;

@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureMockMvc
public class Charpter03CrudinmapApplicationTests {

	private static Logger logger = LoggerFactory.getLogger(Charpter03CrudinmapApplicationTests.class);

	@Autowired
	private MockMvc mvc;


	@Test
	public void testUserController() throws Exception{
		RequestBuilder request = null;
		String result = null;

		//1.get查一下user列表,应该为空
		request = get("/users/");
		result = mvc.perform(request).andReturn().getResponse().getContentAsString();
		logger.info("result is ==>{}", result);

		//2.post 提交一个user
		request = post("/users/")
				.param("id","1")
				.param("name","root")
				.param("age","24");
		result = mvc.perform(request).andReturn().getResponse().getContentAsString();
		logger.info("result is ==>{}",result);

		//3.get 一个id 为1 的user
		request = get("/users/1");
		result = mvc.perform(request).andReturn().getResponse().getContentAsString();
		logger.info("result is ==>{}",result);

		//4. put 修改id为1的user
		request = put("/users/1")
				.param("name","mrchenli")
				.param("age","18");
		result = mvc.perform(request).andReturn().getResponse().getContentAsString();
		logger.info("result is ==>{}",result);

		//5.get 一个id 为1 的user
		request = get("/users/1");
		result = mvc.perform(request).andReturn().getResponse().getContentAsString();
		logger.info("result is ==>{}",result);

		//6. del id 为1 的user
		request = delete("/users/1");
		result = mvc.perform(request).andReturn().getResponse().getContentAsString();
		logger.info("result is ==>{}",result);
		// 7.查下列表
		request = get("/users/");
		result = mvc.perform(request).andReturn().getResponse().getContentAsString();
		logger.info("result is ==>{}",result);
	}

}
