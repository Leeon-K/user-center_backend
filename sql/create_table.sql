-- auto-generated definition
create table user
(
    id           bigint auto_increment comment '主键'
        primary key,
    userAccount  varchar(256)                           null comment '账号',
    avatarUrl    varchar(1024)                          null comment '头像',
    gender       tinyint                                null comment '性别',
    userPassword varchar(512)                           null comment '密码',
    phone        varchar(256)                           null comment '电话',
    email        varchar(256)                           null comment '邮箱',
    userStatus   int          default 0                 not null comment '账号状态',
    createtime   datetime     default CURRENT_TIMESTAMP null comment '时间',
    updatetime   datetime     default CURRENT_TIMESTAMP not null comment '更新时间',
    isDelete     int          default 0                 not null comment '删除是否',
    username     varchar(256)                           null comment '用户名',
    userrole     varchar(256) default 'user'            not null comment 'admin-管理员  user-普通用户',
    vipCode      varchar(256)                           null comment '"用户vip编号"'
)
    comment '用户';

