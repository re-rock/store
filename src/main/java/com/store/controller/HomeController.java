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
        System.out.println("test3");
        System.out.println("test4");
        System.out.println("test5");
        System.out.println("test6");
        System.out.println("test7");
        System.out.println("test8");
        System.out.println("test8");
        System.out.println("test10");

        return "base";
    }
}
