package com.example.sampleaffablebean.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import javax.xml.transform.sax.SAXResult;
import java.time.LocalDateTime;

@Entity
@Getter
@Setter
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private double price;
    private String description;

    @Column(name = "last_update")
    private LocalDateTime lastUpdate;

    @JoinColumn(name = "category_id")
    @ManyToOne
    private Category category;
}
