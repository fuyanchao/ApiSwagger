package com.lenfu.Controller;

import com.lenfu.model.User;
import com.lenfu.service.user.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * Created by Len Fu on 2018/1/16.
 */
@Api(value = "/user",tags = "用户信息")
@RestController
@RequestMapping(value = "/user")
public class UserController {

    @Autowired
    private UserService userService;

    @ResponseBody
    @PostMapping(value = "/add", produces = {"application/json;charset=UTF-8"})
    @ApiImplicitParam(name ="user", value = "添加用户信息",required =true,dataType = "User")
    public int addUser(@RequestParam(name = "user") User user){
        return userService.addUser(user);
    }
    @ResponseBody
    @DeleteMapping(value = "/delete",produces = {"application/json;charset=UTF-8"})
    @ApiImplicitParam(name = "userid",value = "用户Id",required = true,dataType = "int")
    public int deleteUser(@RequestParam(value = "userid") int userId){
        return  userService.deleteByPrimaryKey(userId);
    }
    @ResponseBody
    @GetMapping(value = "/all/{pageNum}/{pageSize}", produces = {"application/json;charset=UTF-8"})
    public Object findAllUser(@PathVariable("pageNum") int pageNum, @PathVariable("pageSize") int pageSize){

        return userService.findAllUser(pageNum,pageSize);
    }
}
