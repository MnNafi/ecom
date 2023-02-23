package com.attrabit.ecom.model;

import jakarta.persistence.*;

@Entity
@Table(name = "product_options")
public class ProductOptions {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @ManyToOne
    @JoinColumn(name = "product_id", referencedColumnName = "id", nullable = false, foreignKey = @ForeignKey(name = "FK_product_options_products"))
    private Products product;

    @ManyToOne
    @JoinColumn(name = "option_id", referencedColumnName = "id", nullable = false, foreignKey = @ForeignKey(name = "FK_product_options_options"))
    private Options option;

    public ProductOptions() {
    }

    public ProductOptions(Products product, Options option) {
        this.product = product;
        this.option = option;
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

    public Options getOption() {
        return option;
    }

    public void setOption(Options option) {
        this.option = option;
    }
}
