package com.sanjeev.cgproject.controller;


import com.sanjeev.cgproject.model.UserForm;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@SessionAttributes("userForm")
public class FormController {

    @ModelAttribute("userForm")
    public UserForm userForm() {
        return new UserForm();
    }

    // Page 1
    @GetMapping("/")
    public String page1() {
        return "page1";
    }

    @PostMapping("/processPage1")
    public String processPage1(@ModelAttribute("userForm") UserForm userForm) {
        return "redirect:/page2";
    }

    // Page 2
    @GetMapping("/page2")
    public String page2(@ModelAttribute("userForm") UserForm userForm) {
        return "page2";
    }

    @PostMapping("/processPage2")
    public String processPage2(@ModelAttribute("userForm") UserForm userForm) {
        return "redirect:/page3";
    }

    // Page 3
    @GetMapping("/page3")
    public String page3(@ModelAttribute("userForm") UserForm userForm) {
        return "page3";
    }

    @PostMapping("/processPage3")
    public String processPage3(@ModelAttribute("userForm") UserForm userForm) {
        return "redirect:/summary";
    }

    // Summary Page
    @GetMapping("/summary")
    public String summary(@ModelAttribute("userForm") UserForm userForm) {
        return "summary";
    }
}
