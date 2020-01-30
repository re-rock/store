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
        System.out.println("revert押した状態でさらにPush!");
        model.addAttribute("contents", "home :: home_contents");
        System.out.println("revertの練習です。");
        System.out.println("revertを実行してみる");
        return "base";
    }
}
