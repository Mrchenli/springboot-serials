package io.mrchenli.springboot.charpter04thymeleaf.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloWorldController {

    @ResponseBody
    @RequestMapping("/hello")
    public String hello(){return "Hello World";}

    @RequestMapping("/")
    public String index(ModelMap map){
        map.addAttribute("host","io.mrchenli.springboot");
        return "index";
    }

}
