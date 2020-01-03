package com.store.domain.service;

import com.store.domain.model.Item;
import com.store.domain.repository.ItemMybatisDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
@Service("CategoryService")
public class CategoryService {

    @Autowired
    ItemMybatisDao itemMybatisDao;

    public int countItemsNumber() {

        int count = itemMybatisDao.countItemsNumber();
        return count;
    }

    // カテゴリータイプから該当商品をDBから取得する
    public List<Item> selectItems(String categoryType) {

        List<Item> items = itemMybatisDao.selectItems(categoryType);
        return items;
    }
}
