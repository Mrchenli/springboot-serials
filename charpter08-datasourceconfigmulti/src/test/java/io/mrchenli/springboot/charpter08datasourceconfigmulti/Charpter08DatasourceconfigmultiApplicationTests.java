package io.mrchenli.springboot.charpter08datasourceconfigmulti;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.test.context.junit4.SpringRunner;

import javax.sql.DataSource;

@RunWith(SpringRunner.class)
@SpringBootTest
public class Charpter08DatasourceconfigmultiApplicationTests {

	@Autowired
	@Qualifier("primaryJdbcTemplate")
	protected JdbcTemplate jdbcTemplate1;

	@Autowired
	@Qualifier("secondaryJdbcTemplate")
	protected JdbcTemplate jdbcTemplate2;




	@Test
	public void test(){

		//往第一个数据源中插入一条数据
		jdbcTemplate1.update("INSERT  INTO  tb_test_user(id,name,age) VALUES (?,?,?)",7,"temp1",12);

		jdbcTemplate2.update("INSERT  INTO  tb_test_user(id,name,age) VALUES (?,?,?)",8,"temp2",18);

	}


}
