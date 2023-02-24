package com.attrabit.ecom.model;

import jakarta.persistence.*;
import lombok.Data;

import java.sql.Timestamp;

@Entity
@Table(name = "wish_lists")
@Data
public class WishLists {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

//    @ManyToOne
//    @JoinColumn(name = "user_id", referencedColumnName = "id", nullable = false,
//            foreignKey = @ForeignKey(name = "wish_lists_users_fk",
//                    onUpdate = ForeignKeyAction.RESTRICT, onDelete = ForeignKeyAction.CASCADE))
//    private Users user;
//
//    @ManyToOne
//    @JoinColumn(name = "product_id", referencedColumnName = "id", nullable = false,
//            foreignKey = @ForeignKey(name = "wish_lists_products_fk",
//                    onUpdate = ForeignKeyAction.RESTRICT, onDelete = ForeignKeyAction.CASCADE))
//    private Products product;

    @Column(name = "created_at")
    private Timestamp createdAt;

    @Column(name = "updated_at")
    private Timestamp updatedAt;

    // Constructors, getters and setters
}
