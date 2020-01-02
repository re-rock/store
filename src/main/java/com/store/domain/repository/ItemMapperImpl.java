package com.store.domain.repository;

import com.store.domain.model.Item;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;


@Repository
public class ItemMapperImpl implements ItemMapper {

    @Autowired
    JdbcTemplate jdbcTemplate;

//    public List<Item> selectItems(String categoryType) throws DataAccessException {
//
//        // １件取得
//        Map<String, Object> map = jdbc.queryForMap("SELECT * FROM m_user"
//                + " WHERE user_id = ?", userId);
//
//        // 結果返却用の変数
//        Item item = new Item();
//
//        // 取得したデータを結果返却用の変数にセットしていく
//        //item.set((String) map.get("role")); //ロール
//    }

    @Override
    public int count() throws DataAccessException {

        int count = jdbcTemplate.queryForObject("SELECT COUNT(*) FROM item", Integer.class);
        return count;
    }

    @Override
    public List<Item> selectItems(String categoryType) throws DataAccessException {

        List<Map<String, Object>> itemsMap = jdbcTemplate.queryForList("SELECT * FROM item WHERE item_category = ?", categoryType);
        List<Item> itemList = new ArrayList<>();

        for(Map<String, Object> map : itemsMap) {

            // Itemインスタンス作成
            Item item = new Item();
            item.setItemId((Long) map.get("item_id"));
            item.setItemName((String) map.get("item_name"));
            item.setItemCategory((String) map.get("item_category"));
            item.setPrice((Integer) map.get("price"));
            item.setStockS((Integer) map.get("stock_s"));
            item.setStockM((Integer) map.get("stock_m"));
            item.setStockL((Integer) map.get("stock_l"));
            item.setDescription((String) map.get("description"));
            item.setFeatures((String) map.get("features"));

            itemList.add(item);
        }
        return itemList;
    }
}
