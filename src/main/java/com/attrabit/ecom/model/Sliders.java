package com.attrabit.ecom.model;

import jakarta.persistence.*;
import lombok.Data;

import java.sql.Timestamp;

@Entity
@Table(name = "sliders")
@Data
public class Sliders {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private Integer speed;

    @Column
    private Boolean autoplay;

    @Column(name = "autoplay_speed")
    private Integer autoplaySpeed;

    @Column
    private Boolean fade;

    @Column
    private Boolean dots;

    @Column
    private Boolean arrows;

    @Column(name = "created_at")
    private Timestamp createdAt;

    @Column(name = "updated_at")
    private Timestamp updatedAt;

    // constructors, getters, and setters
}
