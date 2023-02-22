package com.attrabit.ecom.model;

import jakarta.persistence.*;
import lombok.Data;

import java.sql.Timestamp;
import java.util.Set;

@Entity
@Table(name = "users")
@Data
public class Roles {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "permissions", columnDefinition = "text")
    private String permissions;

    @Column(name = "created_at")
    private Timestamp createdAt;

    @Column(name = "updated_at")
    private Timestamp updatedAt;

    @OneToMany(mappedBy = "role", cascade = CascadeType.ALL)
    private Set<RolesTranslations> translations;

    @OneToMany(mappedBy = "role", cascade = CascadeType.ALL)
    private Set<UserRoles> userRoles;

    // getters and setters
}