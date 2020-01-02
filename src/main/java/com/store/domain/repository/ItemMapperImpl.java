package com.store.domain.repository;

import com.store.domain.model.Item;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;


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
    public List<Item> selectTargets(String categoryType) throws DataAccessException {
        return null;
    }
}
