package com.attrabit.ecom.model;

import jakarta.persistence.*;

@Entity
@Table(name = "up_sell_products")
public class UpSellProducts {

    @Id
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "product_id", nullable = false)
    private Products product;

    @Id
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "up_sell_product_id", nullable = false)
    private Products upSellProduct;

    // default constructor
    public UpSellProducts() {}

    // constructor with fields
    public UpSellProducts(Products product, Products upSellProduct) {
        this.product = product;
        this.upSellProduct = upSellProduct;
    }

    // getters and setters
    public Products getProduct() {
        return product;
    }

    public void setProduct(Products product) {
        this.product = product;
    }

    public Products getUpSellProduct() {
        return upSellProduct;
    }

    public void setUpSellProduct(Products upSellProduct) {
        this.upSellProduct = upSellProduct;
    }
}
