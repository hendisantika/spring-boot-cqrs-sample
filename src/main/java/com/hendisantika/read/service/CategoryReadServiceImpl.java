package com.hendisantika.read.service;

import com.hendisantika.read.dto.CategoryReadDTO;
import com.hendisantika.read.mapper.CategoryMapper;
import com.hendisantika.repository.CategoryRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by IntelliJ IDEA.
 * Project : spring-boot-cqrs-sample
 * User: powercommerce
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 20/03/22
 * Time: 07.36
 * To change this template use File | Settings | File Templates.
 */
@Service
@Transactional
public class CategoryReadServiceImpl implements CategoryReadService {

    private final CategoryRepository categoryRepository;
    private final CategoryMapper categoryMapper;

    public CategoryReadServiceImpl(CategoryRepository categoryRepository, CategoryMapper categoryMapper) {
        this.categoryRepository = categoryRepository;
        this.categoryMapper = categoryMapper;
    }

    @Override
    public List<CategoryReadDTO> getAll() {
        return categoryRepository.findAll()
                .stream()
                .map(categoryMapper::convertToReadDTO)
                .collect(Collectors.toList());
    }
}
