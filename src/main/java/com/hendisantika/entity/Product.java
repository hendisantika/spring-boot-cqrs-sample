package com.hendisantika.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * Created by IntelliJ IDEA.
 * Project : spring-boot-cqrs-sample
 * User: powercommerce
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 20/03/22
 * Time: 07.29
 * To change this template use File | Settings | File Templates.
 */
@Entity
@Table(name = "product")
@Getter
@Setter
@DynamicInsert
@DynamicUpdate
public class Product implements Serializable {

    private static final long serialVersionUID = 2020081313570000L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false, updatable = false)
    private Long id;

    @Column(name = "catalog_name", nullable = false)
    private String catalogName;

    @Column(nullable = false)
    private BigDecimal price;

    @ManyToOne
    @JsonBackReference
    @JoinColumn(name = "category_id", nullable = false)
    private Category category;

    @Column(name = "created_at", nullable = false)
    private Date createdAt = new Date();

    @Column(name = "is_active", nullable = false)
    private boolean active = true;
}
