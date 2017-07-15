package com.aaron.hyper.po;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * <p>产品</p>
 * Created by AARON on 2017/7/15.
 */
public class Product implements Serializable {

    private static final long serialVersionUID = -5451149468527661317L;

    private Long productId;

    private String productName;

    private BigDecimal productPrice;

    public Long getProductId() {
        return productId;
    }

    public Product setProductId(Long productId) {
        this.productId = productId;
        return this;
    }

    public String getProductName() {
        return productName;
    }

    public Product setProductName(String productName) {
        this.productName = productName;
        return this;
    }

    public BigDecimal getProductPrice() {
        return productPrice;
    }

    public Product setProductPrice(BigDecimal productPrice) {
        this.productPrice = productPrice;
        return this;
    }
}
