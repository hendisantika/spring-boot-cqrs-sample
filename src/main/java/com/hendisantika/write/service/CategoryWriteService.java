package com.hendisantika.write.service;

import com.hendisantika.write.dto.CategoryWriteDTO;

/**
 * Created by IntelliJ IDEA.
 * Project : spring-boot-cqrs-sample
 * User: powercommerce
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 20/03/22
 * Time: 07.41
 * To change this template use File | Settings | File Templates.
 */
public interface CategoryWriteService {
    void store(CategoryWriteDTO category);

    void update(CategoryWriteDTO category);

    void deactivate(Long id);

    void delete(Long id);
}
