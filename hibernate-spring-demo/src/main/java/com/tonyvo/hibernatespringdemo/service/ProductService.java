package com.tonyvo.hibernatespringdemo.service;


import com.tonyvo.hibernatespringdemo.dto.ProductDto;

import java.util.List;

public interface ProductService {

    List<ProductDto> getAllProduct();
}
