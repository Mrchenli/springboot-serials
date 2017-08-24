package io.mrchenli.springboot.charpter05swagger.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import springfox.documentation.annotations.ApiIgnore;

@RestController
public class HelloController {


    @RequestMapping(value = "/hello",method = RequestMethod.GET)
    public String index(){
        return "Hello World";
    }

}
