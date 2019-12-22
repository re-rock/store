package com.store.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LadiesController {

    /**
     * Ladies OuterWear画面のGET用メソッド
     */
    @GetMapping("/ladies_outerwear")
    public String getLadiesOuterwear(Model model) {

        model.addAttribute("contents", "ladies_outerwear :: ladies_outerwear_contents");

        return "base";
    }

    /**
     * Ladies T-Shirts画面のGET用メソッド
     */
    @GetMapping("/ladies_tshirts")
    public String getLadiesTShirts(Model model) {

        model.addAttribute("contents", "ladies_tshirts :: ladies_tshirts_contents");

        return "base";
    }
}
