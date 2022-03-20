package com.hendisantika.read.mapper;

import com.hendisantika.entity.Category;
import com.hendisantika.read.dto.CategoryReadDTO;
import org.mapstruct.Mapper;

/**
 * Created by IntelliJ IDEA.
 * Project : spring-boot-cqrs-sample
 * User: powercommerce
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 20/03/22
 * Time: 07.34
 * To change this template use File | Settings | File Templates.
 */
@Mapper(componentModel = "spring")
public interface CategoryMapper {

    CategoryReadDTO convertToReadDTO(Category category);
}
