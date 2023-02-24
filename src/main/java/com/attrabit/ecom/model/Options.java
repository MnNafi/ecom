package com.attrabit.ecom.model;

import jakarta.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "options")
public class Options {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "type", nullable = false)
    private String type;

    @Column(name = "is_required", nullable = false)
    private boolean isRequired;

    @Column(name = "is_global", nullable = false)
    private boolean isGlobal;

    @Column(name = "position")
    private Long position;

    @Column(name = "deleted_at")
    private Timestamp deletedAt;

    @Column(name = "created_at")
    private Timestamp createdAt;

    @Column(name = "updated_at")
    private Timestamp updatedAt;

    // constructors, getters and setters
}
