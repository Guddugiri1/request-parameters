package com.request.parameters.request.parameters;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/users")
public class UserController {

    // Example URL: /api/users?age=25
    @GetMapping
    public String getUsersByAge(@RequestParam int age) {
        return "Users with age " + age;
    }
}

