package com.spring.web.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.spring.web.Repository.UserRepository;


import com.spring.web.Entity.User;

@Controller
public class MainController {

    @Autowired
    private UserRepository userRepository;
    
    @GetMapping("/index")
    public String index(Model model) {
        model.addAttribute("user", new User());
        return "index";
    }

    @PostMapping(path = "/index")
    public String newUser (@ModelAttribute User user, Model model) {
        userRepository.save(user);
        model.addAttribute("message", "User saved successfully");
        return "redirect:/index";
    }

}
