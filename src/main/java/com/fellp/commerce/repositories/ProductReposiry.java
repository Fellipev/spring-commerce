package com.fellp.commerce.repositories;

import com.fellp.commerce.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductReposiry extends JpaRepository<Product, Long> {
}
