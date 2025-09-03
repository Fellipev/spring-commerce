package com.fellp.commerce.services;

import com.fellp.commerce.dto.ProductDTO;
import com.fellp.commerce.entities.Product;
import com.fellp.commerce.repositories.ProductReposiry;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Service
public class ProductService {

    @Autowired
    private ProductReposiry productReposiry;

    @Transactional(readOnly = true)
    public ProductDTO findById(Long id) {
        Optional<Product> result = productReposiry.findById(id);
        Product product = result.get();

        return new ProductDTO(product);
    }
}
