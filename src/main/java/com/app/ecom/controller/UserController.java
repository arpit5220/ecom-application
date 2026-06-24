package com.app.ecom.controller;

import com.app.ecom.service.UserService;
import com.app.ecom.model.User;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;

    @GetMapping("/api/users")
    public List<User> getAllUsers(){
         return userService.fetchAllUsers();
    }

    @PostMapping("/api/users")
    public String createUser(@RequestBody User user){
        userService.creteUser(user);
        return "User Added Successfully";
    }
}
