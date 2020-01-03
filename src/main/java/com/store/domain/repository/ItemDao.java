package com.store.domain.repository;

import com.store.domain.model.Item;
import org.springframework.dao.DataAccessException;

import java.util.List;

public interface ItemDao {

    // TODO テスト用全件取得
    public int countItemsNumber() throws DataAccessException;

    public Item selectOne() throws DataAccessException;

    // 選択されたカテゴリーの全商品を取得
    public List<Item> selectItems(String categoryType) throws DataAccessException;
}
