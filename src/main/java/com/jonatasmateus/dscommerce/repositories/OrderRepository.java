package com.jonatasmateus.dscommerce.repositories;

import com.jonatasmateus.dscommerce.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
