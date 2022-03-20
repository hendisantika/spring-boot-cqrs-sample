package com.hendisantika.write.service;

import com.hendisantika.entity.Category;
import com.hendisantika.repository.CategoryRepository;
import com.hendisantika.write.dto.CategoryWriteDTO;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by IntelliJ IDEA.
 * Project : spring-boot-cqrs-sample
 * User: powercommerce
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 20/03/22
 * Time: 07.42
 * To change this template use File | Settings | File Templates.
 */
@Service
@Transactional
public class CategoryWriteServiceImpl implements CategoryWriteService {

    private final CategoryRepository categoryRepository;

    public CategoryWriteServiceImpl(CategoryRepository categoryRepository) {
        this.categoryRepository = categoryRepository;
    }

    @Override
    public void store(CategoryWriteDTO category) {
        Category categoryEntity = new Category(category.getName(), category.getDescription());
        categoryRepository.save(categoryEntity);
    }

    @Override
    public void update(CategoryWriteDTO category) {
        Category categoryEntity = new Category(category.getId(), category.getName(), category.getDescription());
        categoryRepository.save(categoryEntity);
    }
}
