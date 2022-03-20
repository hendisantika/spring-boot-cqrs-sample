package com.hendisantika.read.controller;

import com.hendisantika.read.service.CategoryReadService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
}
