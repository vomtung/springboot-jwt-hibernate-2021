package com.tonyvo.hibernatespringdemo.service;

import com.tonyvo.hibernatespringdemo.dto.ProductDto;
import com.tonyvo.hibernatespringdemo.mapper.ProductMapper;
import com.tonyvo.hibernatespringdemo.repository.ProductRepository;
import org.mapstruct.factory.Mappers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {

    private final ProductMapper productMapper = Mappers.getMapper(ProductMapper.class);

    @Autowired
    private ProductRepository productRepository;

    public List<ProductDto> getAllProduct() {
        return productMapper.toDtos(productRepository.findAll());
    }
}
