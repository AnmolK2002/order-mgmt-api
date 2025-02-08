package com.prime.oms.ordermgmt.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(schema = "oms", name = "order_items") 
public class OrderItem {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "product_name")
    private String productName;
    
    
    private int quantity;
    private double price;

    
}
