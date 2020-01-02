package com.store.controller;

import com.store.domain.model.Item;
import com.store.domain.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@Controller
public class CategoryController {

    @Autowired
    CategoryService categoryService;

    /**
     * カテゴリー画面のGET用メソッド
     */
    @GetMapping("/category/{type}")
    public String getCategory (
            @PathVariable("type") String type,
            Model model) {

        // 選択されたカテゴリー
        String categoryType = type;


        // TODO TEST
        int count = categoryService.countItemsNumber();

        List<Item> items = categoryService.selectItemsOfCategory(categoryType);
        System.out.println(items);

        // 対象カテゴリのアイテムをDBから取得

        // DBアクセス->formに保存する

        // 取得したデータをモデルに設定

        model.addAttribute("title", categoryType);
        model.addAttribute("count", count);
        model.addAttribute("items", items);
        model.addAttribute("contents", "category :: category_contents");

        return "base";
    }
}
