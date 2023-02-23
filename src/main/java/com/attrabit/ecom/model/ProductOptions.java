package com.attrabit.ecom.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "product_options")
@Data
public class ProductOptions {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @ManyToOne
    @JoinColumn(name = "product_id", referencedColumnName = "id", nullable = false, foreignKey = @ForeignKey(name = "FK_product_options_products"))
    private Products product;

    @ManyToOne
    @JoinColumn(name = "option_id", referencedColumnName = "id", nullable = false, foreignKey = @ForeignKey(name = "FK_product_options_options"))
    private Options option;

}
