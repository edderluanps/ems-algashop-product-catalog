package com.algaworks.algashop.product.catalog.application.product.management;

import com.algaworks.algashop.product.catalog.application.PageModel;
import com.algaworks.algashop.product.catalog.application.product.query.ProductDetailOutput;
import com.algaworks.algashop.product.catalog.application.product.query.ProductQueryService;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class ProductManagementApplicationService implements ProductQueryService {
    public UUID create(ProductInput input) {
        return null;
    }

    public void update(UUID productId, ProductInput input) {

    }

    public void disable(UUID productId) {

    }

    @Override
    public ProductDetailOutput findById(UUID productId) {
        return null;
    }

    @Override
    public PageModel<ProductDetailOutput> filter(Integer size, Integer number) {
        return null;
    }
}