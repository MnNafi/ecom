package com.attrabit.ecom.model;

import jakarta.persistence.*;

@Entity
@Table(name = "order_product_options")
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

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public OrderProducts getOrderProduct() {
        return orderProduct;
    }

    public void setOrderProduct(OrderProducts orderProduct) {
        this.orderProduct = orderProduct;
    }

    public Options getOption() {
        return option;
    }

    public void setOption(Options option) {
        this.option = option;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
