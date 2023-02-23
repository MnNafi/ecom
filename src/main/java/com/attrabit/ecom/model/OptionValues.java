package com.attrabit.ecom.model;//package com.attrabit.ecom.model;
//
//import jakarta.persistence.*;
//import lombok.Data;
//
//import java.util.Date;
//
//@Entity
//@Table(name = "option_values")
//@Data
//public class OptionValues {
//
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private Long id;
//
//    @ManyToOne
//    @JoinColumn(name = "option_id", nullable = false, updatable = false)
//    private Options option;
//
//    @Column(name = "price", precision = 18, scale = 4)
//    private Double price;
//
//    @Column(name = "price_type", nullable = false)
//    private String priceType;
//
//    @Column(name = "position", nullable = false)
//    private Date position;
//
//    @Column(name = "created_at")
//    private Date createdAt;
//
//    @Column(name = "updated_at")
//    private Date updatedAt;
//
//    // getters and setters omitted for brevity
//}
