package com.hendisantika.read.service;

import com.hendisantika.read.dto.CategoryReadDTO;
import org.springframework.data.domain.Pageable;

import java.util.List;
import java.util.Optional;

/**
 * Created by IntelliJ IDEA.
 * Project : spring-boot-cqrs-sample
 * User: powercommerce
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 20/03/22
 * Time: 07.35
 * To change this template use File | Settings | File Templates.
 */
public interface CategoryReadService {
    List<CategoryReadDTO> getAll();

    List<CategoryReadDTO> getAllActive();

    List<CategoryReadDTO> getPage(Pageable pageable);

    Optional<CategoryReadDTO> getById(Long id);
}
