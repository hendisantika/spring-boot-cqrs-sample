package com.hendisantika.write.controller;

import com.hendisantika.write.service.CategoryWriteService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
}
