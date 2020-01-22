package com.store.domain.service;

import com.store.domain.model.Item;
import com.store.domain.repository.ItemDao;
import com.store.domain.repository.ItemMybatisDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
@Service("ItemService")
public class ItemService {

    @Autowired
    ItemMybatisDao itemMybatisDao;

    // select item information from db
    public Item selectItemInfo(String itemId) {
        try {
            return itemMybatisDao.selectItemInfo(itemId);
        } catch (DataAccessException e) {
            throw e;
        }
    }

    public List<String> convertFeatureArray(String features) {
        // convert to Array from String at comma
        return null;
    }
}
