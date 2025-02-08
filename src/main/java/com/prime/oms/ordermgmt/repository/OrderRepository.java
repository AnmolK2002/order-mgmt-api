package com.prime.oms.ordermgmt.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.prime.oms.ordermgmt.model.Order;

@Repository
public interface OrderRepository extends JpaRepository<Order, Long> {
    Order findByCustomerName(String customerName);
}

