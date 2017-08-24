package io.mrchenli.springboot.charpter05swagger.web;

import io.mrchenli.springboot.charpter05swagger.pojo.User;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
@RequestMapping("/users")
public class UserController2 {

    static Map<Long,User> users = Collections.synchronizedMap(new HashMap<>());

    @RequestMapping(value = "/",method = RequestMethod.GET)
    public List<User> getUserList(){
        List<User> list = new ArrayList<>(users.values());
        return list;
    }
    @RequestMapping(value = "/",method = RequestMethod.POST)
    public String postUser(@RequestBody User user){
        users.put(user.getId(),user);
        return "success";
    }
    @RequestMapping(value = "/{id}",method = RequestMethod.GET)
    public User getUser(@PathVariable Long id){
        return users.get(id);
    }

    @RequestMapping(value = "/{id}",method = RequestMethod.PUT)
    public String putUser(@PathVariable Long id ,@RequestBody User user){
        User u = users.get(id);
        u.setName(user.getName());
        u.setAge(user.getAge());
        users.put(id,u);
        return "success ";
    }

    @RequestMapping(value = "/{id}",method = RequestMethod.DELETE)
    public String deleteUser(@PathVariable Long id){
        users.remove(id);
        return "success";
    }



}
