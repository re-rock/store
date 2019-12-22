package com.store.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MensController {

    /**
     * Mens OuterWear画面のGET用メソッド
     */
    @GetMapping("/mens_outerwear")
    public String getMensOuterwear(Model model) {

        model.addAttribute("contents", "mens_outerwear :: mens_outerwear_contents");

        return "base";
    }

    /**
     * Mens T-Shirts画面のGET用メソッド
     */
    @GetMapping("/mens_tshirts")
    public String getMensTShirts(Model model) {

        model.addAttribute("contents", "mens_tshirts :: mens_tshirts_contents");

        return "base";
    }
}
