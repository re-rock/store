package com.store.domain.service;

import com.store.domain.model.Item;
import com.store.domain.repository.ItemMapper;
import com.store.domain.repository.ItemMapperImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

import static com.store.Constants.CATEGORIES;

@Service
public class CategoryService {

    @Autowired
    ItemMapper itemMapper;


    public int countItemsNumber() {

        int count = itemMapper.count();
        return count;
    }

    // カテゴリータイプから該当商品をDBから取得する
    public List<Item> selectItemsOfCategory(String categoryType) {

        List<Item> items = itemMapper.selectItems(categoryType);

        return items;
    }
}
