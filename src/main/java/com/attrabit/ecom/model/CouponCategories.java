package com.attrabit.ecom.model;

import jakarta.persistence.*;

@Entity
@Table(name = "coupon_categories")
public class CouponCategories {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "coupon_id", referencedColumnName = "id", nullable = false, foreignKey = @ForeignKey(name = "fk_coupon_categories_coupon_id"))
    private Coupons coupon;

    @ManyToOne
    @JoinColumn(name = "category_id", referencedColumnName = "id", nullable = false, foreignKey = @ForeignKey(name = "fk_coupon_categories_category_id"))
    private Categories category;

    @Column(name = "exclude", nullable = false)
    private boolean exclude;

    // getters and setters
}
