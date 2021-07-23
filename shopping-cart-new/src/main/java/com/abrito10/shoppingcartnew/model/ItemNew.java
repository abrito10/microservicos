package com.abrito10.shoppingcartnew.model;

import org.springframework.data.elasticsearch.annotations.Document;

@Document(indexName = "item", type = "prod")
public class ItemNew {

    private Integer productId;
    private Integer amount;

    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }
}
