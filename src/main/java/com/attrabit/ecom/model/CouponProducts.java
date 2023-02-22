package com.attrabit.ecom.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "coupons_products")
@Data
public class CouponProducts {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "coupon_id", referencedColumnName = "id", nullable = false,
            foreignKey = @ForeignKey(name = "fk_coupons_products_coupons"))
    private Coupons coupon;

    @ManyToOne
    @JoinColumn(name = "product_id", referencedColumnName = "id", nullable = false,
            foreignKey = @ForeignKey(name = "fk_coupons_products_products"))
    private Products product;

    @Column(name = "exclude", columnDefinition = "TINYINT(1)")
    private boolean exclude;

    // getters and setters
    // ...
}
