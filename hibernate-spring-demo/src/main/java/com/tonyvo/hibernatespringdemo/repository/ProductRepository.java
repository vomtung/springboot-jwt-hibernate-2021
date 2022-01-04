package com.tonyvo.hibernatespringdemo.repository;

import com.tonyvo.hibernatespringdemo.entity.ProductEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<ProductEntity, Long> {
}
