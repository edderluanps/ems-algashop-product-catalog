package com.algaworks.algashop.product.catalog.application.category.management;

import com.algaworks.algashop.product.catalog.application.PageModel;
import com.algaworks.algashop.product.catalog.application.category.query.CategoryDetailOutput;
import com.algaworks.algashop.product.catalog.application.category.query.CategoryQueryService;
import jakarta.validation.Valid;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class CategoryManagementService implements CategoryQueryService {
    public UUID create(@Valid CategoryInput input) {
        return null;
    }

    public void update(UUID categoryId, CategoryInput input) {
    }

    public void disable(UUID categoryId) {

    }

    @Override
    public PageModel<CategoryDetailOutput> filter(Integer size, Integer number) {
        return null;
    }

    @Override
    public CategoryDetailOutput findById(UUID categoryId) {
        return null;
    }
}