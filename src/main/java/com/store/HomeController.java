package com.store;

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

        return "layout";
    }
}
