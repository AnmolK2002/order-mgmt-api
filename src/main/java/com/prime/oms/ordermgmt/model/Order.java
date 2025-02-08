package com.prime.oms.ordermgmt.model;

import jakarta.persistence.*;
import lombok.Data;
import java.time.LocalDateTime;
import java.util.List;

@Data
@Entity
@Table(schema = "oms", name = "orders")
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String orderId;
    
    @Column(name = "customer_name")
    private String customerName;
    
    private String shippingAddress;
    
    @Enumerated(EnumType.STRING)
    private OrderStatus status; // ENUM for order status

    private LocalDateTime createdAt;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name = "order_id")
    private List<OrderItem> items;
}
