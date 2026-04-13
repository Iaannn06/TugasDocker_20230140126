package com.tugas.praktikum6.controller;


import com.tugas.praktikum6.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class UserController {
    private List<User> userList = new ArrayList<>();

    @GetMapping("/")
    public String loginPage(){
        return "login";
    }


}
