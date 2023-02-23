package com.attrabit.ecom.model;

import jakarta.persistence.*;

@Entity
@Table(name = "related_products")
public class RelatedProducts {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @ManyToOne
    @JoinColumn(name = "product_id", referencedColumnName = "id")
    private Products product;

    @ManyToOne
    @JoinColumn(name = "related_product_id", referencedColumnName = "id")
    private Products relatedProduct;

    public RelatedProducts() {
    }

    public RelatedProducts(Products product, Products relatedProduct) {
        this.product = product;
        this.relatedProduct = relatedProduct;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Products getProduct() {
        return product;
    }

    public void setProduct(Products product) {
        this.product = product;
    }

    public Products getRelatedProduct() {
        return relatedProduct;
    }

    public void setRelatedProduct(Products relatedProduct) {
        this.relatedProduct = relatedProduct;
    }
}
