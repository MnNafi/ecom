package com.attrabit.ecom.model;

import jakarta.persistence.*;

import java.sql.Timestamp;

@Entity
@Table(name = "option_values")
public class OptionValues {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "option_id", nullable = false, updatable = false)
    private Options option;

    @Column(name = "price", precision = 18, scale = 4)
    private Double price;

    @Column(name = "price_type", nullable = false)
    private String priceType;

    @Column(name = "position", nullable = false)
    private Integer position;

    @Column(name = "created_at")
    private Timestamp createdAt;

    @Column(name = "updated_at")
    private Timestamp updatedAt;

    // getters and setters omitted for brevity
}
