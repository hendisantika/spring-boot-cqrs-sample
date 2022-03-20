package com.hendisantika.repository;

import com.hendisantika.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;

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
public interface CategoryRepository extends JpaRepository<Category, Long>
}
