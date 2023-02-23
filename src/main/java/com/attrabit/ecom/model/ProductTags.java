package com.attrabit.ecom.model;

import jakarta.persistence.*;

@Entity
@Table(name = "product_tags")
public class ProductTags {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @ManyToOne
    @JoinColumn(name = "product_id", referencedColumnName = "id", nullable = false, foreignKey = @ForeignKey(name = "FK_product_tags_products"))
    private Products product;

    @ManyToOne
    @JoinColumn(name = "tag_id", referencedColumnName = "id", nullable = false, foreignKey = @ForeignKey(name = "FK_product_tags_tags"))
    private Tags tag;

    public ProductTags() {
    }

    public ProductTags(Products product, Tags tag) {
        this.product = product;
        this.tag = tag;
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

    public Tags getTag() {
        return tag;
    }

    public void setTag(Tags tag) {
        this.tag = tag;
    }
}
