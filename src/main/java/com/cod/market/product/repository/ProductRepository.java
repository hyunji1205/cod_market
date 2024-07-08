package com.cod.market.product.repository;

import com.cod.market.product.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.ResponseBody;

@ResponseBody
public interface ProductRepository extends JpaRepository<Product, Long> {
}
