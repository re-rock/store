package com.store.domain.repository;

import com.store.domain.model.Item;
import org.springframework.dao.DataAccessException;

import java.util.List;

public interface ItemMapper {

    // 選択されたカテゴリーの全商品を取得
    public List<Item> selectTargets(String categoryType) throws DataAccessException;
}
