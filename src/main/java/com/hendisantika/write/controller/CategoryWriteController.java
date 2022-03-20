package com.hendisantika.write.controller;

import com.hendisantika.write.dto.CategoryWriteDTO;
import com.hendisantika.write.service.CategoryWriteService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

/**
 * Created by IntelliJ IDEA.
 * Project : spring-boot-cqrs-sample
 * User: powercommerce
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 20/03/22
 * Time: 07.44
 * To change this template use File | Settings | File Templates.
 */
@Slf4j
@RestController
@RequestMapping(value = "/category/write")
public class CategoryWriteController {

    private final CategoryWriteService categoryWriteService;

    public CategoryWriteController(CategoryWriteService categoryWriteService) {
        this.categoryWriteService = categoryWriteService;
    }

    @PostMapping
    public ResponseEntity<Void> store(CategoryWriteDTO category) {
        categoryWriteService.store(category);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @PutMapping
    public ResponseEntity<Void> update(CategoryWriteDTO category) {
        categoryWriteService.update(category);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @PutMapping(value = "/{id}")
    public ResponseEntity<Void> deactivate(@PathVariable Long id) {
        categoryWriteService.deactivate(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
