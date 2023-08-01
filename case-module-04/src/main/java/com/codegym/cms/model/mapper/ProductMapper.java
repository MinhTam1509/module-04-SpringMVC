package com.codegym.cms.model.mapper;

import com.codegym.cms.model.dto.ProductDto;
import com.codegym.cms.model.entity.Product;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ProductMapper {

    public List<ProductDto> entitiesToDtos(List<Product> productList) {
        return productList.stream()
                .map(this::entityToDto)
                .toList();
    }

    public ProductDto entityToDto(Product product) {
        ProductDto result = new ProductDto();
        BeanUtils.copyProperties(product, result);
        return result;
    }
}
