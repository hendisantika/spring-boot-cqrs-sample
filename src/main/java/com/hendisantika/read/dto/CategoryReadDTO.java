package com.hendisantika.read.dto;

import com.hendisantika.entity.Product;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

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
@Getter
@Setter
public class CategoryReadDTO implements Serializable {
    private Long id;
    private String name;
    private String description;
    private Date createdAt;
    private List<Product> products = new ArrayList<>();
}
