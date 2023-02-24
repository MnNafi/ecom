//package com.attrabit.ecom.model;
//
//import jakarta.persistence.*;
//import lombok.Data;
//
//@Entity
//@Table(name = "order_product_option_values")
//@Data
//public class OrderProductOptionValues {
//
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private Long id;
//
//    @ManyToOne(fetch = FetchType.LAZY)
//    @JoinColumn(name = "order_product_option_id", referencedColumnName = "id")
//    private OrderProductOptions orderProductOption;
//
////    @ManyToOne(fetch = FetchType.LAZY)
////    @JoinColumn(name = "option_value_id", referencedColumnName = "id")
////    private OptionValues optionValue;
//
//    @Column(name = "price")
//    private Double price;
//
//    // constructors, getters and setters
//}
