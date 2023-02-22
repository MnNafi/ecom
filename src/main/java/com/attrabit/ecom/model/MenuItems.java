//package com.attrabit.ecom.model;
//
//import jakarta.persistence.*;
//import lombok.Data;
//
//import java.time.LocalDateTime;
//
//@Entity
//@Table(name = "menu_items")
//@Data
//public class MenuItems {
//
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private Long id;
//
//    @ManyToOne
//    @JoinColumn(name = "menu_id")
//    private Menus menu;
//
//    @ManyToOne
//    @JoinColumn(name = "parent_id")
//    private MenuItems parent;
//
//    @ManyToOne
//    @JoinColumn(name = "category_id")
//    private Categories category;
//
//    @ManyToOne
//    @JoinColumn(name = "page_id")
//    private Page page;
//
//    @Column(name = "type")
//    private String type;
//
//    @Column(name = "url")
//    private String url;
//
//    @Column(name = "icon")
//    private String icon;
//
//    @Column(name = "target")
//    private String target;
//
//    @Column(name = "position")
//    private Long position;
//
//    @Column(name = "is_root")
//    private Boolean isRoot;
//
//    @Column(name = "is_fluid")
//    private Boolean isFluid;
//
//    @Column(name = "is_active")
//    private Boolean isActive;
//
//    @Column(name = "created_at")
//    private LocalDateTime createdAt;
//
//    @Column(name = "updated_at")
//    private LocalDateTime updatedAt;
//
//    // Constructors, getters, and setters
//    // ...
//}
