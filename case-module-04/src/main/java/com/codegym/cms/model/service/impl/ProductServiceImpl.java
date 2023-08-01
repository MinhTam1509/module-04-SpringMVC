package com.codegym.cms.model.service.impl;

import com.codegym.cms.model.dto.ProductDto;
import com.codegym.cms.model.mapper.ProductMapper;
import com.codegym.cms.model.repository.ProductRepository;
import com.codegym.cms.model.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductRepository productRepository;

    @Autowired
    private ProductMapper productMapper;

    @Override
    public List<ProductDto> findAllProduct() {
        return productMapper.entitiesToDtos(productRepository.findAll());
    }

    @Override
    public ProductDto findById(Long id) {
        return productMapper.entityToDto(productRepository.findById(id).orElse(null));
    }
}
