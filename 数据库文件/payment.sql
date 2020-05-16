-- 支付模块的payment表
create table payment
(
    id     bigint auto_increment comment 'ID'
        primary key,
    serial varchar(200) default '' null
);