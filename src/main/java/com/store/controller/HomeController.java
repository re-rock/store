package com.store.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.ui.Model;

@Controller
public class HomeController {

    /**
     * ホーム画面のGET用メソッド
     */
    @GetMapping("/home")
    public String getHome(Model model) {
        model.addAttribute("contents", "home :: home_contents");

        System.out.println("test1");
        System.out.println("test2");
        return "base";
    }
}
