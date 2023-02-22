package com.attrabit.ecom.model;

import jakarta.persistence.*;
import lombok.Data;

import java.sql.Timestamp;

@Entity
@Table(name = "attributes")
@Data
public class Attributes {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "attribute_set_id", referencedColumnName = "id", nullable = false,
            foreignKey = @ForeignKey(name = "fk_attributes_attribute_sets"))
    private AttributeSets attributeSet;

    @Column(name = "is_filterable", nullable = false)
    private boolean isFilterable;

    @Column(name = "created_at")
    private Timestamp createdAt;

    @Column(name = "updated_at")
    private Timestamp updatedAt;

    @Column(name = "slug")
    private String slug;

    // getters and setters
}
