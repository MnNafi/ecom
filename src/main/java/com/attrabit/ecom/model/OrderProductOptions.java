package com.attrabit.ecom.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "order_product_options")
@Data
public class OrderProductOptions {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "order_product_id")
    private OrderProducts orderProduct;

    @ManyToOne
    @JoinColumn(name = "option_id")
    private Options option;

    @Column(columnDefinition = "TEXT")
    private String value;

}
