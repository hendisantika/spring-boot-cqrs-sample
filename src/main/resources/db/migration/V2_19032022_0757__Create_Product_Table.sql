create table product
(
    id           bigint         not null auto_increment,
    is_active    bit            not null,
    catalog_name varchar(255)   not null,
    created_at   datetime(6) not null,
    price        decimal(19, 2) not null,
    category_id  bigint         not null,
    primary key (id)
) engine=InnoDB;

alter table product
    add constraint FK1mtsbur82frn64de7balymq9s
        foreign key (category_id)
            references category (id);