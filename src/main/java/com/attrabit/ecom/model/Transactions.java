package com.attrabit.ecom.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;

@Entity
@Table(name = "transactions")
@Data
public class Transactions {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

//    @ManyToOne
//    @JoinColumn(name = "order_id", referencedColumnName = "id", nullable = false,
//            foreignKey = @ForeignKey(name = "transactions_orders_fk",
//                    onUpdate = ForeignKeyAction.RESTRICT, onDelete = ForeignKeyAction.CASCADE))
//    private Orders order;

    @Column(name = "transaction_id", nullable = false)
    private String transactionId;

    @Column(name = "payment_method", nullable = false)
    private String paymentMethod;

    @Column(name = "deleted_at")
    private Date deletedAt;

    @Column(name = "created_at")
    private Date createdAt;

    @Column(name = "updated_at")
    private Date updatedAt;

    // Constructor, getters, and setters
}
