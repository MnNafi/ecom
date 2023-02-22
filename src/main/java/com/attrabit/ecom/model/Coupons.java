package com.attrabit.ecom.model;

import jakarta.persistence.*;

import java.math.BigDecimal;
import java.util.Date;

@Entity
@Table(name = "coupons")
public class Coupons {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String code;

    @Column(precision = 18, scale = 4)
    private BigDecimal value;

    @Column(nullable = false)
    private boolean isPercent;

    @Column(nullable = false)
    private boolean freeShipping;

    @Column(precision = 18, scale = 4)
    private BigDecimal minimumSpend;

    @Column(precision = 18, scale = 4)
    private BigDecimal maximumSpend;

    @Column
    private Integer usageLimitPerCoupon;

    @Column
    private Integer usageLimitPerCustomer;

    @Column(nullable = false)
    private int used;

    @Column(nullable = false)
    private boolean isActive;

    @Column
    @Temporal(TemporalType.DATE)
    private Date startDate;

    @Column
    @Temporal(TemporalType.DATE)
    private Date endDate;

    @Column
    private Date deletedAt;

    @Column
    private Date createdAt;

    @Column
    private Date updatedAt;

    // Getters and setters
}