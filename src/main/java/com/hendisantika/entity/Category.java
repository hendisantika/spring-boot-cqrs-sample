package com.hendisantika.entity;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.*;
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
 * Time: 07.28
 * To change this template use File | Settings | File Templates.
 */
@Entity
@Table(name = "category")
@Getter
@Setter
@DynamicInsert
@DynamicUpdate
public class Category implements Serializable {

    private static final long serialVersionUID = 2020081313470000L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false, updatable = false)
    private Long id;

    @Column(nullable = false)
    private String name;

    @Column
    private String description;

    @Column(name = "created_at", nullable = false)
    private Date createdAt = new Date();

    @Column(name = "is_active", nullable = false)
    private boolean active = true;

    @JsonManagedReference
    @OneToMany(mappedBy = "category")
    private List<Product> products = new ArrayList<>();


    public Category(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public Category(Long id, String name, String description) {
        this.id = id;
        this.name = name;
        this.description = description;
    }
}
