package com.store.domain.service;

import com.store.domain.model.Item;
import com.store.domain.repository.ItemDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
@Service
public class CategoryService {

    @Autowired
    ItemDao itemDao;


    public int countItemsNumber() {

        int count = itemDao.count();
        return count;
    }

    // カテゴリータイプから該当商品をDBから取得する
    public List<Item> selectItems(String categoryType) {

        List<Item> items = itemDao.selectItems(categoryType);

        return items;
    }
}
