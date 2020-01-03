package com.store.domain.repository;

import com.store.domain.model.Item;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;

public class ItemRowMapper implements RowMapper<Item> {

    @Override
    public Item mapRow(ResultSet rs, int rowNum) throws SQLException {

        // 戻り値用のItemインスタンス作成
        Item item = new Item();

        // ResultSetの取得結果をItemインスタンスに設定
        item.setItemId(rs.getLong("item_id"));
        item.setItemName(rs.getString("item_name"));
        item.setItemCategory(rs.getString("item_name"));
        item.setPrice(rs.getInt("price"));
        item.setStockS(rs.getInt("stock_s"));
        item.setStockM(rs.getInt("stock_m"));
        item.setStockL(rs.getInt("stock_l"));
        item.setDescription(rs.getString("description"));
        item.setFeatures(rs.getString("features"));

        return item;
    }
}
