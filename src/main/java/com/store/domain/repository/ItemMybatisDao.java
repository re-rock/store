package com.store.domain.repository;

import com.store.domain.model.Item;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface ItemMybatisDao {

    // カテゴリー毎の登録商品数を取得
    int countCategoryItems(String categoryType);

    // 選択されたカテゴリーの全商品情報を取得
    List<Item> selectItems(String categoryType);
}
