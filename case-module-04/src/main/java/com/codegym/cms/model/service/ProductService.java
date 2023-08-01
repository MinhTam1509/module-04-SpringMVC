package com.codegym.cms.model.service;

import com.codegym.cms.model.dto.ProductDto;

import java.util.List;

public interface ProductService {

    List<ProductDto> findAllProduct();

    ProductDto findById(Long id);
}
