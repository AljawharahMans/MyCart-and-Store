package com.udacity.store.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "orders")
@Data
@NoArgsConstructor
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long id;

    @Column(name = "name")
    String name;

    @Column(name = "total")
    double total;

    @Column(name = "address")
    String address;

    @Column(name = "creditCart")
    String creditCart;


    public Order(String name, String address, double total, String creditCart) {
        this.name = name;
        this.address = address;
        this.total = total;
        this.creditCart = creditCart;
    }

}
