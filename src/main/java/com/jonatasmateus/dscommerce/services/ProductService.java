package com.jonatasmateus.dscommerce.services;

import com.jonatasmateus.dscommerce.dto.ProductDTO;
import com.jonatasmateus.dscommerce.entities.Product;
import com.jonatasmateus.dscommerce.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Service
public class ProductService {

    @Autowired
    private ProductRepository repository;

    @Transactional(readOnly = true)
    public ProductDTO findById(Long id) {
        Product product = repository.findById(id).get();
        return new ProductDTO(product);
    }
}
