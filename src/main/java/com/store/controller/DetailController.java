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
public class DetailController {

//    @Autowired
//    ItemService ItemService;

    /**
     * カテゴリー画面のGET用メソッド
     */
    @GetMapping("/detail/{itemId}")
    public String getCategory (@PathVariable("itemId") String itemId, Model model) {

        // 対象カテゴリの画像ファイル名
        model.addAttribute("title", "detail item page!");
        model.addAttribute("contents", "item :: item_contents");

        return "base";
    }
}
