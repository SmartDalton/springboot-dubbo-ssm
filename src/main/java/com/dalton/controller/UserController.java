package com.dalton.controller;

import com.dalton.dao.User;
import com.dalton.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

    @RestController
    @RequestMapping("/testBoot")
    public class UserController {
        @Autowired
        private UserService userService;

        @RequestMapping("getUser/{id}")
        public String GetUser(@PathVariable int id){
            return userService.Sel(id).toString();
        }

        @RequestMapping("insert/{userName}/{password}")
        public String InsertUser(@PathVariable("userName") String userName,
                                 @PathVariable("password") String password){
            User user=new User();
           user.setUserName(userName);
           user.setPassword(password);
            userService.insert(user);
            return "success";
        }

}
