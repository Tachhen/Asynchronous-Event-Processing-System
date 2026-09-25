package com.EPS.eps.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.EPS.eps.Entity.Product;

public interface ProductRepository extends JpaRepository<Product,Long> {
    
}
