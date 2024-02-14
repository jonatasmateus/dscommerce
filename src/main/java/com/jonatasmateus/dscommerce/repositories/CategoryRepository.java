package com.jonatasmateus.dscommerce.repositories;

import com.jonatasmateus.dscommerce.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
