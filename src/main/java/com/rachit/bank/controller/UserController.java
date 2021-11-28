package com.rachit.bank.controller;

import com.rachit.bank.dto.request.RegisterRequest;
import com.rachit.bank.dto.response.UserResponse;
import com.rachit.bank.service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
@AllArgsConstructor
public class UserController {

    private final UserService userService;

    @PostMapping("/register")
    public UserResponse register(@RequestBody RegisterRequest request){
        //code to register user and return userId
        Long userId = userService.register(request);
        return UserResponse.builder()
                .userId(userId).build();
    }
}
