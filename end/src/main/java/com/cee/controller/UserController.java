package com.cee.controller;

import com.cee.common.result.Result;
import com.cee.model.User;
import com.cee.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/user")
public class UserController {


    @Autowired
    private UserService userService;


    @PostMapping ("/login")
    @ResponseBody
    public Result login(User user){
        Map<String,Object> info = userService.loginUser(user);
        return Result.ok(info);
    }

//    =======================================================================


    @GetMapping("/userById/{id}")
    @ResponseBody
    public User userById(@PathVariable("id") long id){
        return userService.getUserById(id);
    }

    @GetMapping("/userList/{username}")
    @ResponseBody
    public List<User> userList(@PathVariable("username") String username){
        User user = new User();
        user.setUsername(username);
        return userService.getUserList(user);
    }


    //获取用户id信息接口
    @GetMapping("/info")
    public Result getUserInfo(HttpServletRequest request) {
       //
        User user = new User();
        user.setUsername("test");
        user.setId(1L);
        return Result.ok(user);
    }

    @GetMapping("/a/{username}")
    @ResponseBody
    public void addUser(@PathVariable("username") String username){
        User user = new User();
        user.setUsername(username);
        userService.addUser(user);
    }

    @PutMapping("/u/{id}/{username}")
    @ResponseBody
    public void updateUser(@PathVariable("id") long id, @PathVariable("username") String username){
        User user = new User();
        user.setUsername(username);
        userService.addUser(user);
    }

    @PutMapping("/{id}")
    @ResponseBody
    public void deleteUser(@PathVariable("username") String username){
        User user = new User();
        user.setUsername(username);
        userService.deleteUser(user);
    }


}
