package com.attrabit.ecom.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.RequiredArgsConstructor;

import java.sql.Timestamp;

@Entity
@Table(name = "entity_files")
@Data
//@RequiredArgsConstructor
public class EntityFiles {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "file_id", referencedColumnName = "id", nullable = false)
    private Files file;

    @Column(name = "entity_type", nullable = false)
    private String entityType;

    @Column(name = "entity_id", nullable = false)
    private Long entityId;

    @Column(name = "zone", nullable = false)
    private String zone;

    @Column(name = "created_at")
    private Timestamp createdAt;

    @Column(name = "updated_at")
    private Timestamp updatedAt;

    // Constructors, getters, and setters
    // ...
}
