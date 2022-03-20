package com.hendisantika.read.controller;

import com.hendisantika.read.dto.CategoryReadDTO;
import com.hendisantika.read.service.CategoryReadService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * Project : spring-boot-cqrs-sample
 * User: powercommerce
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 20/03/22
 * Time: 07.38
 * To change this template use File | Settings | File Templates.
 */
@Slf4j
@RestController
@RequestMapping(value = "/category/read", produces = MediaType.APPLICATION_JSON_VALUE)
public class CategoryReadController {

    private final CategoryReadService categoryReadService;

    public CategoryReadController(CategoryReadService categoryReadService) {
        this.categoryReadService = categoryReadService;
    }

    @GetMapping
    public ResponseEntity<List<CategoryReadDTO>> getAll() {
        List<CategoryReadDTO> categories = categoryReadService.getAll();
        return new ResponseEntity<>(categories, HttpStatus.OK);
    }

    @GetMapping(value = "/active")
    public ResponseEntity<List<CategoryReadDTO>> getAllActive() {
        List<CategoryReadDTO> categories = categoryReadService.getAllActive();
        return new ResponseEntity<>(categories, HttpStatus.OK);
    }
}
