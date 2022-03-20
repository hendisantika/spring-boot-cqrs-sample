package com.hendisantika.repository;

import com.hendisantika.entity.Category;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * Project : spring-boot-cqrs-sample
 * User: powercommerce
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 20/03/22
 * Time: 07.31
 * To change this template use File | Settings | File Templates.
 */
public interface CategoryRepository extends JpaRepository<Category, Long> {
    @Modifying
    @Query(value = "update Category category set category.createdAt = CURRENT_DATE where category.id = :id")
    void deactivate(@Param("id") Long id);

    List<Category> findByActiveTrue();

    Page<Category> findByActiveTrue(Pageable pageable);
}
