package com.attrabit.ecom.model;

import jakarta.persistence.*;
import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

@Entity
@Table(name = "products")
@Data
public class Products {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "brand_id", referencedColumnName = "id", foreignKey = @ForeignKey(name = "fk_products_brand"), nullable = true)
    private Brands brand;

    @Column(name = "tax_class_id")
    private Long taxClassId;

    @Column(name = "slug", nullable = false)
    private String slug;

    @Column(name = "price", nullable = false)
    private BigDecimal price;

    @Column(name = "special_price")
    private BigDecimal specialPrice;

    @Column(name = "special_price_type")
    private String specialPriceType;

    @Column(name = "special_price_start_date")
    private Date specialPriceStartDate;

    @Column(name = "special_price_end_date")
    private Date specialPriceEndDate;

    @Column(name = "selling_price")
    private BigDecimal sellingPrice;

    @Column(name = "sku")
    private String sku;

    @Column(name = "manage_stock", nullable = false)
    private Boolean manageStock;

    @Column(name = "qty")
    private Integer qty;

    @Column(name = "in_stock", nullable = false)
    private Boolean inStock;

    @Column(name = "viewed", nullable = false)
    private Integer viewed;

    @Column(name = "is_active", nullable = false)
    private Boolean isActive;

    @Column(name = "new_from")
    private Date newFrom;

    @Column(name = "new_to")
    private Date newTo;

    @Column(name = "deleted_at")
    private Date deletedAt;

    @Column(name = "created_at")
    private Date createdAt;

    @Column(name = "updated_at")
    private Date updatedAt;

    @Column(name = "virtual", nullable = false)
    private Boolean virtual;

    // Getters and Setters (omitted for brevity)
}

