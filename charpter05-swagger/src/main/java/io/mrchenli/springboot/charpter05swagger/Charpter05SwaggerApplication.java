package io.mrchenli.springboot.charpter05swagger;

import com.didispace.swagger.EnableSwagger2Doc;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2Doc
public class Charpter05SwaggerApplication {

	public static void main(String[] args) {
		SpringApplication.run(Charpter05SwaggerApplication.class, args);
	}

}
