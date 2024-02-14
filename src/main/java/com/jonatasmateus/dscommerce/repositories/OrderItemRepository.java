package com.jonatasmateus.dscommerce.repositories;

import com.jonatasmateus.dscommerce.entities.OrderItem;
import com.jonatasmateus.dscommerce.entities.OrderItemPK;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK> {

}
