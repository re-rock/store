package com.store.controller;

import com.store.domain.model.Item;
import com.store.domain.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

import static com.store.Constants.CATEGORY_NAME_MAP;

@Controller
public class ItemController {

    @Autowired
    ItemService ItemService;

    /**
     * カテゴリー画面のGET用メソッド
     */
    @GetMapping("/detail/{itemId}")
    public String getCategory(@PathVariable("itemId") String itemId, Model model) {

        // get selected item information form db
        Item item = ItemService.selectItemInfo(itemId);

        model.addAttribute("item", item);
        model.addAttribute("contents", "item :: item_contents");

        return "base";
    }
}
