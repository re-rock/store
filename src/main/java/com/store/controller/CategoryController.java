package com.store.controller;

import com.store.domain.model.Item;
import com.store.domain.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

import static com.store.Constants.CATEGORY_NAME_MAP;

@Controller
public class CategoryController {

    @Autowired
    CategoryService categoryService;

    /**
     * カテゴリー画面のGET用メソッド
     */
    @GetMapping("/category/{type}")
    public String getCategory (@PathVariable("type") String type, Model model) {
        // 選択されたカテゴリー
        String categoryType = type;
        try {
            // カテゴリー毎の登録商品数を取得
            int totalCategoryItems = categoryService.countCategoryItems(categoryType);
            System.out.println(totalCategoryItems);
            model.addAttribute("totalCategoryItems", totalCategoryItems);
            // カテゴリー毎の全商品情報を取得
            List<Item> itemList = categoryService.selectCategoryItems(categoryType);
            model.addAttribute("itemList", itemList);
        } catch (DataAccessException e) {
            model.addAttribute("title", "DB処理失敗");
        }
        model.addAttribute("title", CATEGORY_NAME_MAP.get(type));
        // 対象カテゴリの画像ファイル名
        model.addAttribute("imgFileName", type);
        model.addAttribute("contents", "category :: category_contents");

        return "base";
    }
}
