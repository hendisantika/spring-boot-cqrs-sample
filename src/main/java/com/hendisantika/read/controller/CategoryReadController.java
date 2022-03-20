package com.hendisantika.read.controller;

import com.hendisantika.entity.Category;
import com.hendisantika.read.dto.CategoryReadDTO;
import com.hendisantika.read.service.CategoryReadService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

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
@Tag(name = "Read Category", description = "Endpoints for managing Read category")
public class CategoryReadController {

    private final CategoryReadService categoryReadService;

    public CategoryReadController(CategoryReadService categoryReadService) {
        this.categoryReadService = categoryReadService;
    }

    @Operation(
            summary = "List All Categories",
            description = "List All Categories.",
            tags = {"Category"})
    @ApiResponses(value = {
            @io.swagger.v3.oas.annotations.responses.ApiResponse(
                    description = "Success",
                    responseCode = "200",
                    content = @Content(mediaType = "application/json", schema = @Schema(implementation =
                            Category.class))
            ),
            @io.swagger.v3.oas.annotations.responses.ApiResponse(description = "Not found", responseCode = "404",
                    content = @Content),
            @io.swagger.v3.oas.annotations.responses.ApiResponse(description = "Internal error", responseCode = "500"
                    , content = @Content)
    })
    @GetMapping
    public ResponseEntity<List<CategoryReadDTO>> getAll() {
        List<CategoryReadDTO> categories = categoryReadService.getAll();
        return new ResponseEntity<>(categories, HttpStatus.OK);
    }

    @Operation(
            summary = "List All Active Categories",
            description = "List All Active Categories.",
            tags = {"Category"})
    @ApiResponses(value = {
            @io.swagger.v3.oas.annotations.responses.ApiResponse(
                    description = "Success",
                    responseCode = "200",
                    content = @Content(mediaType = "application/json", schema = @Schema(implementation =
                            Category.class))
            ),
            @io.swagger.v3.oas.annotations.responses.ApiResponse(description = "Not found", responseCode = "404",
                    content = @Content),
            @io.swagger.v3.oas.annotations.responses.ApiResponse(description = "Internal error", responseCode = "500"
                    , content = @Content)
    })
    @GetMapping(value = "/active")
    public ResponseEntity<List<CategoryReadDTO>> getAllActive() {
        List<CategoryReadDTO> categories = categoryReadService.getAllActive();
        return new ResponseEntity<>(categories, HttpStatus.OK);
    }

    @Operation(
            summary = "List All Active Categories by Pagination",
            description = "List All Active Categories by Pagination.",
            tags = {"Category"})
    @ApiResponses(value = {
            @io.swagger.v3.oas.annotations.responses.ApiResponse(
                    description = "Success",
                    responseCode = "200",
                    content = @Content(mediaType = "application/json", schema = @Schema(implementation =
                            Category.class))
            ),
            @io.swagger.v3.oas.annotations.responses.ApiResponse(description = "Not found", responseCode = "404",
                    content = @Content),
            @io.swagger.v3.oas.annotations.responses.ApiResponse(description = "Internal error", responseCode = "500"
                    , content = @Content)
    })
    @GetMapping(value = "/page")
    public ResponseEntity<List<CategoryReadDTO>> getPage(Pageable pageable) {
        List<CategoryReadDTO> categories = categoryReadService.getPage(pageable);
        return new ResponseEntity<>(categories, HttpStatus.OK);
    }

    @Operation(
            summary = "List All Active Categories by ID",
            description = "List All Active Categories by ID.",
            tags = {"Category"})
    @ApiResponses(value = {
            @io.swagger.v3.oas.annotations.responses.ApiResponse(
                    description = "Success",
                    responseCode = "200",
                    content = @Content(mediaType = "application/json", schema = @Schema(implementation =
                            Category.class))
            ),
            @io.swagger.v3.oas.annotations.responses.ApiResponse(description = "Not found", responseCode = "404",
                    content = @Content),
            @io.swagger.v3.oas.annotations.responses.ApiResponse(description = "Internal error", responseCode = "500"
                    , content = @Content)
    })
    @GetMapping(value = "/{id}")
    public ResponseEntity<CategoryReadDTO> getById(@PathVariable Long id) {
        Optional<CategoryReadDTO> categoryOptional = categoryReadService.getById(id);
        return categoryOptional
                .map(category -> new ResponseEntity<>(category, HttpStatus.OK))
                .orElse(new ResponseEntity<>(HttpStatus.NO_CONTENT));
    }
}
