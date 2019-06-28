drop table if exists user;
create table user (
  id bigint not null auto_increment,
  user_name varchar(32) not null comment 'label: 登录用户名',
  password varchar(128) not null comment 'label: 密码加密',
  mobile varchar(16) default null comment 'label: 手机号',
  email varchar(64) default null comment 'label: 手机号',
  nick_name varchar(64) default null comment 'label: 昵称',

  deleted tinyint(1) default 0 comment 'label: 是否删除',

  updated_at timestamp not null default current_timestamp on update current_timestamp,
  created_at datetime not null,
  primary key (id)
) engine=InnoDB default charset=utf8 comment 'label: 用户表';
