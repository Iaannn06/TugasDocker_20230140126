package com.tugas.praktikum6.controller;


import com.tugas.praktikum6.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.ui.Model;
import java.util.ArrayList;
import java.util.List;

@Controller
public class UserController {
    private List<User> userList = new ArrayList<>();

    @GetMapping("/")
    public String loginPage(){
        return "login";
    }

    @PostMapping("/login")
    public String login(@RequestParam String username, @RequestParam String password, Model model) {
        if ("admin".equals(username) && "20230140126".equals(password)) {
            return "redirect:/home";
        }
        model.addAttribute("error", "Username atau Password salah!");
        return "login";
    }

    @GetMapping("/home")
    public String home(Model model) {
        model.addAttribute("users", userList);
        return "home";
    }

    @GetMapping("/form")
    public String formPage(Model model) {
        model.addAttribute("user", new User());
        return "form";
    }

    @PostMapping("/submit")
    public String submitData(@ModelAttribute User user) {
        userList.add(user);
        return "redirect:/home";
    }

}
