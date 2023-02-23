package com.attrabit.ecom.model;

import jakarta.persistence.*;

@Entity
@Table(name = "migrations")
public class Migrations {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(nullable = false)
    private String migration;

    @Column(nullable = false)
    private int batch;

    // Constructors, getters, and setters
    public Migrations() {}

    public Migrations(String migration, int batch) {
        this.migration = migration;
        this.batch = batch;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMigration() {
        return migration;
    }

    public void setMigration(String migration) {
        this.migration = migration;
    }

    public int getBatch() {
        return batch;
    }

    public void setBatch(int batch) {
        this.batch = batch;
    }
}
