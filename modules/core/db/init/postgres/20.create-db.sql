-- begin NETWORKV6_MAKER
alter table NETWORKV6_MAKER add constraint FK_NETWORKV6_MAKER_ON_USER foreign key (USER_ID) references SEC_USER(ID)^
create index IDX_NETWORKV6_MAKER_ON_USER on NETWORKV6_MAKER (USER_ID)^
-- end NETWORKV6_MAKER
-- begin NETWORKV6_GOODS
alter table NETWORKV6_GOODS add constraint FK_NETWORKV6_GOODS_ON_MAKER_NAME foreign key (MAKER_NAME) references NETWORKV6_MAKER(NAME)^
create index IDX_NETWORKV6_GOODS_ON_MAKER_NAME on NETWORKV6_GOODS (MAKER_NAME)^
-- end NETWORKV6_GOODS
-- begin NETWORKV6_SHOP
alter table NETWORKV6_SHOP add constraint FK_NETWORKV6_SHOP_ON_NETWORK_NAME foreign key (NETWORK_NAME) references NETWORKV6_NETWORK(NAME)^
create index IDX_NETWORKV6_SHOP_ON_NETWORK_NAME on NETWORKV6_SHOP (NETWORK_NAME)^
-- end NETWORKV6_SHOP
