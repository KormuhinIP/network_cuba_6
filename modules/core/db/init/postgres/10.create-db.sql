-- begin NETWORKV6_MAKER
create table NETWORKV6_MAKER (
    NAME varchar(25),
    UUID uuid,
    --
    FULL_NAME varchar(255) not null,
    USER_ID uuid,
    --
    primary key (NAME)
)^
-- end NETWORKV6_MAKER
-- begin NETWORKV6_GOODS
create table NETWORKV6_GOODS (
    NAME varchar(25),
    UUID uuid,
    --
    MAKER_NAME varchar(25) not null,
    COST decimal(19, 2) not null,
    --
    primary key (NAME)
)^
-- end NETWORKV6_GOODS
-- begin NETWORKV6_NETWORK
create table NETWORKV6_NETWORK (
    NAME varchar(25),
    UUID uuid,
    --
    FULL_NAME varchar(255) not null,
    --
    primary key (NAME)
)^
-- end NETWORKV6_NETWORK
-- begin NETWORKV6_SHOP
create table NETWORKV6_SHOP (
    NUMBER_ varchar(10),
    UUID uuid,
    --
    NAME varchar(255) not null,
    NETWORK_NAME varchar(25) not null,
    --
    primary key (NUMBER_)
)^
-- end NETWORKV6_SHOP
