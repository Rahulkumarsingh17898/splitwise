package com.example.splitwise.controller;

import com.example.splitwise.dtos.CreateUserRequest;
import com.example.splitwise.models.User;
import com.example.splitwise.services.UserService;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Controller;

@Controller
@AllArgsConstructor
public class UserController {
    private UserService userService;
    public User createUser(CreateUserRequest request){

   return userService.createUser(request.toUser());
    }
}
