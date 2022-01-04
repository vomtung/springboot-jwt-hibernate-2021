/*
 * Copyright 2021 (c) All rights by Robert Bosch GmbH.
 * We reserve all rights of disposal such as copying and passing on to third parties.
 */
package com.tonyvo.hibernatespringdemo.mapper;
import com.tonyvo.hibernatespringdemo.dto.ProductDto;
import com.tonyvo.hibernatespringdemo.entity.ProductEntity;
import org.mapstruct.Mapper;

import java.util.List;

/**
 * The Interface ProductMapper.
 */
@Mapper
public interface ProductMapper {

    ProductDto toDto(ProductEntity productEntity);

    List<ProductDto> toDtos(List<ProductEntity> productDtos);
}
