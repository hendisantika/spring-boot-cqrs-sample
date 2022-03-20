package com.hendisantika.write.dto;

import lombok.Getter;
import lombok.NonNull;
import lombok.Setter;

import java.io.Serializable;

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
@Getter
@Setter
public class CategoryWriteDTO implements Serializable {

    private Long id;
    private @NonNull String name;
    private String description;

    @Override
    public String toString() {
        return "CategoryWriteDTO{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
