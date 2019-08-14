-- 1-创建数据库
CREATE DATABASE if not exists test001;
use test001;

-- 2-创建表
drop table if exists `user`;
CREATE TABLE `user`
(
    id      		bigint           auto_increment  primary key        COMMENT '编号',
    name        	varchar(255)     UNIQUE                  			COMMENT '用户名',
    money     		decimal(11,2)   NOT NULL                            COMMENT '财富',
    `des`           text                                        		COMMENT '描述',
	create_time     datetime        DEFAULT  CURRENT_TIMESTAMP          COMMENT '创建时间',
	update_time		datetime											COMMENT '更新时间'
) COMMENT = '用户信息表';
-- 3-创建索引
CREATE INDEX user_name_index ON `user`(name);

-- 查看表
show tables;

-- 表结构
DESCRIBE `user`;

-- 增:
INSERT INTO test001.`user` (name, money, create_time, des) values
('admin-1', 251, CURRENT_TIMESTAMP, '管理员...'),
('admin-2', 252, CURRENT_TIMESTAMP, '管理员...'),
('admin-3', 253, CURRENT_TIMESTAMP, '管理员...'),
('admin-4', 254, CURRENT_TIMESTAMP, '管理员...'),
('admin-5', 255, CURRENT_TIMESTAMP, '管理员...'),
('admin-6', 256, CURRENT_TIMESTAMP, '管理员...'),
('admin-7', 257, CURRENT_TIMESTAMP, '管理员...'),
('admin-8', 258, CURRENT_TIMESTAMP, '管理员...'),
('admin-9', 259, CURRENT_TIMESTAMP, '管理员...'),
('admin-10', 260, CURRENT_TIMESTAMP, '管理员...');

-- 删
DELETE FROM  test001.`user` WHERE id=3;

-- 改
UPDATE test001.`user` SET money=2500, des='admin' WHERE id=1;

-- 查
select * from test001.`user` limit 10;


