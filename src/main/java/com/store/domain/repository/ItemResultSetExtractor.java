package com.store.domain.repository;

import com.store.domain.model.Item;
import org.springframework.dao.DataAccessException;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.ResultSetExtractor;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


public class ItemResultSetExtractor implements ResultSetExtractor<List<Item>> {

    @Override
    public List<Item> extractData(ResultSet rs) throws SQLException, DataAccessException {

        // Item格納用List
        List<Item> itemList = new ArrayList<>();

        //取得件数分のloop
        while (rs.next()) {

            //Listに追加するインスタンスを生成する
            Item item = new Item();

            //取得したレコードをUserインスタンスにセット
            item.setItemId(rs.getLong("item_id"));
            item.setItemName(rs.getString("item_name"));
            item.setItemCategory(rs.getString("item_name"));
            item.setPrice(rs.getInt("price"));
            item.setStockS(rs.getInt("stock_s"));
            item.setStockM(rs.getInt("stock_m"));
            item.setStockL(rs.getInt("stock_l"));
            item.setDescription(rs.getString("description"));
            item.setFeatures(rs.getString("features"));
            //ListにUserを追加
            itemList.add(item);
        }

        //１件も無かった場合は例外を投げる
        if (itemList.size() == 0) {
            throw new EmptyResultDataAccessException(1);
        }

        return itemList;
    }
}
