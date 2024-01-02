package com.jonatasmateus.dscommerce.dto;

import com.jonatasmateus.dscommerce.entities.Product;

public class ProductDTO {

    private Long id;
    private String name;
    private String description;
    private Double price;
    private String imgURL;

    public ProductDTO() {
    }

    public ProductDTO(Long id, String name, String description, Double price, String imgURL) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.price = price;
        this.imgURL = imgURL;
    }

    public ProductDTO(Product entity) {
        id = entity.getId();
        name = entity.getName();
        description = entity.getDescription();
        price = entity.getPrice();
        imgURL = entity.getImgURL();
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public Double getPrice() {
        return price;
    }

    public String getImgURL() {
        return imgURL;
    }
}
