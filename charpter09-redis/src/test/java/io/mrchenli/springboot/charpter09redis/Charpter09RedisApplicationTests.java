package io.mrchenli.springboot.charpter09redis;

import com.alibaba.fastjson.JSON;
import io.mrchenli.springboot.charpter09redis.domain.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.HashMap;
import java.util.Map;

@RunWith(SpringRunner.class)
@SpringBootTest
public class Charpter09RedisApplicationTests {

	@Autowired
	private StringRedisTemplate stringRedisTemplate;

	@Autowired
	private RedisTemplate redisTemplate;





	@Test
	public void test() throws Exception{
		//保存字符串
		stringRedisTemplate.opsForValue().set("aaa","111");
		//保存对象
		User user = new User("超人",20);
		redisTemplate.opsForValue().set(user.getUsername(),user);

		user = new User("大熊",30);
		redisTemplate.opsForValue().set(user.getUsername(),user);

		user = new User("静香",18);
		redisTemplate.opsForValue().set(user.getUsername(),user);

	}

	@Test
	public void test01(){
		Map m = new HashMap();
		m.put("a","1");
		m.put("b","2");
		m.put("c","3");
		redisTemplate.opsForValue().set("map",m);
	}

	@Test
	public void test02(){
		System.out.println(((User)redisTemplate.opsForValue().get("静香")).getAge());
		System.out.println(JSON.toJSONString(redisTemplate.opsForValue().get("map")));
	}


}
