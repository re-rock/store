package com.store.domain.model;

import lombok.Data;

@Data
public class Item {
    private long itemId; // 商品ID
    private String itemName; // 商品名
    private String itemCategory; // カテゴリー
    private int price; // 価格
    private int stockS; // Sサイズ在庫
    private int stockM; // Mサイズ在庫
    private int stockL; // Lサイズ在庫
    private String description; // 商品概要
    private String features; // 商品特徴

    public long getItemId() {
        return itemId;
    }

    public void setItemId(long itemId) {
        this.itemId = itemId;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public String getItemCategory() {
        return itemCategory;
    }

    public void setItemCategory(String itemCategory) {
        this.itemCategory = itemCategory;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getStockS() {
        return stockS;
    }

    public void setStockS(int stockS) {
        this.stockS = stockS;
    }

    public int getStockM() {
        return stockM;
    }

    public void setStockM(int stockM) {
        this.stockM = stockM;
    }

    public int getStockL() {
        return stockL;
    }

    public void setStockL(int stockL) {
        this.stockL = stockL;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getFeatures() {
        return features;
    }

    public void setFeatures(String features) {
        this.features = features;
    }
}
