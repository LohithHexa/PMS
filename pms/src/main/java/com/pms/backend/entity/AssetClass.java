package com.pms.backend.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "asset_classes")
public class AssetClass {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "class_name", nullable = false)
    private String className;

    @Column(name = "description")
    private String description;

    @Column(name = "sub_class_name")
    private String subClassName;

    @Column(name = "sub_class_description")
    private String subClassDescription;

    @Column(name = "risk")
    private String risk;

    @Column(name = "investment_horizon")
    private String investmentHorizon;

    // Getters and setters
}
