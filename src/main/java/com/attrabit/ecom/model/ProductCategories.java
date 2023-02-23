package com.attrabit.ecom.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "product_categories")
@Data
public class ProductCategories {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(cascade=CascadeType.ALL)
    @JoinColumn(name = "product_id", referencedColumnName = "id")
    private Products product;

    @ManyToOne (cascade = CascadeType.ALL)
    @JoinColumn(name = "category_id", referencedColumnName = "id")
    private Categories category;

    // Constructors, getters, and setters

//    public ProductCategories() {}
//
//    public ProductCategories(Products product, Categories category) {
//        this.product = product;
//        this.category = category;
//    }
//
//    public Long getId() {
//        return id;
//    }
//
//    public void setId(Long id) {
//        this.id = id;
//    }
//
//    public Products getProduct() {
//        return product;
//    }
//
//    public void setProduct(Products product) {
//        this.product = product;
//    }
//
//    public Categories getCategory() {
//        return category;
//    }
//
//    public void setCategory(Categories category) {
//        this.category = category;
//    }
}
