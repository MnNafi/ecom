package com.attrabit.ecom.model;

import jakarta.persistence.*;

@Entity
@Table(name = "cross_sell_products")
public class CrossSellProducts {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "product_id", nullable = false)
    private Products product;

    @ManyToOne
    @JoinColumn(name = "cross_sell_product_id", nullable = false)
    private Products crossSellProduct;

    // constructors, getters and setters
}
