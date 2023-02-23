package com.attrabit.ecom.model;

import jakarta.persistence.*;
import lombok.Data;

import java.sql.Timestamp;

@Entity
@Table(name = "slider_slides")
@Data
public class SliderSlides {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "slider_id", nullable = false, referencedColumnName = "id", foreignKey = @ForeignKey(name = "FK_slider_slides_sliders"))
    private Sliders slider;

    @Column(name = "options")
    private String options;

    @Column(name = "call_to_action_url")
    private String callToActionUrl;

    @Column(name = "open_in_new_window")
    private Boolean openInNewWindow;

    @Column(name = "position")
    private Integer position;

    @Column(name = "created_at")
    private Timestamp createdAt;

    @Column(name = "updated_at")
    private Timestamp updatedAt;

    // constructors, getters, and setters
}
