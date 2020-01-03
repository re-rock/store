package com.store.domain.repository;

import com.store.domain.model.Item;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface ItemMybatisDao {

    // TODO テスト用全件取得
//  int countItemsNumber();
//    @Select("SELECT COUNT(*) FROM item")
    int countItemsNumber();

//    public Item selectOne();

    // 選択されたカテゴリーの全商品を取得
    public List<Item> selectItems(String categoryType);
}
