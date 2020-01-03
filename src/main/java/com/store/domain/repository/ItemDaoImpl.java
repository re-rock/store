package com.store.domain.repository;

import com.store.domain.model.Item;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;


@Repository
public class ItemDaoImpl implements ItemDao {

    @Autowired
    JdbcTemplate jdbc;

    @Override
    public int count() throws DataAccessException {

        int count = jdbc.queryForObject("SELECT COUNT(*) FROM item", Integer.class);
        return count;
    }

    @Override
    public Item selectOne() throws DataAccessException {

        String sql = "SELECT * FROM item WHERE item_id = ?";

        // ItemRowMapper itemRowMapper = new ItemRowMapper();
        // BeanPropertyRowMapper
        RowMapper<Item> rowMapper = new BeanPropertyRowMapper<>(Item.class);

        return jdbc.queryForObject(sql, rowMapper, 1);
    }

    @Override
    public List<Item> selectItems(String categoryType) throws DataAccessException {

        String sql = "SELECT * FROM item WHERE item_category = ?";
        // List<Map<String, Object>> itemsMap = jdbcTemplate.queryForList("SELECT * FROM item WHERE item_category = ?", categoryType);

        // 1. RowMapperの方法
        // ItemRowMapper itemRowMapper = new ItemRowMapper();
        // 2. BeanPropertyRowMapperの方法
        // RowMapper<Item> rowMapper = new BeanPropertyRowMapper<>(Item.class);
        // 3 ResultSetExtractorの方法
        ItemResultSetExtractor extractor = new ItemResultSetExtractor();

        return jdbc.query(sql, extractor, categoryType);
    }
}
