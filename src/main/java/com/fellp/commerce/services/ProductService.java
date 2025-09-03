package com.fellp.commerce.services;

import com.fellp.commerce.dto.ProductDTO;
import com.fellp.commerce.entities.Product;
import com.fellp.commerce.repositories.ProductReposiry;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
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

    @Transactional(readOnly = true)
    public Page<ProductDTO> findAll(Pageable pageable) {
        Page<Product> result = productReposiry.findAll(pageable);
        return result.map(x -> new ProductDTO(x));
    }
}
