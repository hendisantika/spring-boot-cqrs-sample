create table category
(
    id          bigint       not null auto_increment,
    is_active   bit          not null,
    created_at  datetime(6) not null,
    description varchar(255),
    name        varchar(255) not null,
    primary key (id)
) engine=InnoDB;