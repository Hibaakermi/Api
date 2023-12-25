package com.example.API.Model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import static jakarta.persistence.GenerationType.IDENTITY;

@Setter
@Getter

@Entity
@Table(name = "Property")
public class PropertyEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    @Column(name = "address")
    private String address;

    @Column(name = "price")
    private Double price;


    public PropertyEntity(Long id, String address, Double price ) {
        this.id = id;
        this.address = address;
        this.price = price;
    }

    public PropertyEntity () {

    }

}
