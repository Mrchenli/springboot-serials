package io.mrchenli.springboot.charpter06exceptionhandler.web;

import io.mrchenli.springboot.charpter06exceptionhandler.exception.MyException;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloWorldController {

    @RequestMapping("/hello")
    public String hello() throws Exception {
        throw new Exception("发生错误");//要么立即处理 要么往上抛
    }
    @RequestMapping("/json")
    public String json(){
        throw new MyException("发生错误2");
    }
    @RequestMapping("/")
    public String index(ModelMap map){
        map.addAttribute("host","io.mrchenli.springboot");
        return "index";
    }

    public void testE() throws Exception{
        System.out.println("test exception");//非运行时异常的源头
    }

}
