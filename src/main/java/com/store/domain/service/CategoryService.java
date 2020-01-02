package com.store.domain.service;

import com.store.domain.model.Item;
import com.store.domain.repository.ItemMapper;
import com.store.domain.repository.ItemMapperImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import static com.store.Constants.CATEGORIES;

@Service
public class CategoryService {

    @Autowired
    ItemMapper itemMapper;

//    // GETリクエストのクエリパラメータから遷移先を設定
//    public String generatePath(String categoryType) {
//
//        String type = null;
//        for (String category : CATEGORIES) {
//            if (category == categoryType) {
//                type = categoryType;
//            }
//        }
//        return type;
//    }

}
