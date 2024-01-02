package com.jonatasmateus.dscommerce.repositories;

import com.jonatasmateus.dscommerce.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository <Product, Long> {
}
