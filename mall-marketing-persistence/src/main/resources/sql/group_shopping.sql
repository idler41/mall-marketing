USE `mall_activity`;
DROP TABLE IF EXISTS `t_activity`;
CREATE TABLE `t_activity` (
`id` INT ( 11 ) NOT NULL AUTO_INCREMENT COMMENT '活动id',
`name` VARCHAR ( 64 ) NOT NULL COMMENT '活动名称',
`introduction` VARCHAR ( 255 ) NULL DEFAULT NULL COMMENT '活动介绍',
`act_status` TINYINT ( 4 ) NOT NULL DEFAULT '1' COMMENT '活动状态 1-待上线 2-已上线, 3-已结束，4-已关闭',
`act_type` SMALLINT ( 6 ) NOT NULL COMMENT '活动类型 0-拼团 1-双倍佣金 2-免单 3-权益',
`start_time` datetime NOT NULL COMMENT '活动开始时间',
`end_time` datetime NOT NULL COMMENT '结束时间',
`preheat_time` INT ( 11 ) NOT NULL COMMENT '活动预热提前时间(单位：秒)',
`is_delete` TINYINT ( 1 ) NOT NULL DEFAULT '0' COMMENT '删除标识  0-未删除 1-已删除',
`create_time` TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
`update_time` TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
PRIMARY KEY ( `id` ) USING BTREE
) ENGINE = INNODB DEFAULT CHARSET = utf8mb4 COMMENT = '活动表';

DROP TABLE IF EXISTS `t_act_rule`;
CREATE TABLE `t_act_rule` (
`id` INT ( 11 ) NOT NULL AUTO_INCREMENT COMMENT '活动规则id',
`act_id` INT ( 11 ) NOT NULL COMMENT '活动id',
`rule_json` VARCHAR ( 2000 ) NOT NULL DEFAULT '' COMMENT '活动规则json',
`is_delete` TINYINT ( 1 ) NOT NULL DEFAULT '0' COMMENT '删除标识  0-未删除 1-已删除',
`create_time` TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
`update_time` TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
PRIMARY KEY ( `id` ) USING BTREE
) ENGINE = INNODB DEFAULT CHARSET = utf8mb4 COMMENT = '活动规则表';

DROP TABLE IF EXISTS `t_group_spu`;
CREATE TABLE `t_group_spu` (
`id` INT ( 11 ) NOT NULL AUTO_INCREMENT COMMENT '活动商品id',
`act_id` INT ( 11 ) NOT NULL COMMENT '活动id',
`act_rule_id` INT ( 11 ) NOT NULL COMMENT '活动规则id',
`spu_id` INT ( 11 ) NOT NULL COMMENT '原商品id',
`title` VARCHAR ( 255 ) NOT NULL DEFAULT '' COMMENT '促销套餐标题',
`spu_name` VARCHAR ( 64 ) NOT NULL DEFAULT '' COMMENT '商品名称',
`spu_desc` VARCHAR ( 255 ) NOT NULL DEFAULT '' COMMENT '商品描述',
`spu_img` VARCHAR ( 512 ) NOT NULL DEFAULT '' COMMENT '商品图片',
`spu_price` BIGINT ( 20 ) NOT NULL COMMENT '商品拼团售价',
`seller_id` INT ( 11 ) NOT NULL COMMENT '商家用户id',
`audit_status` TINYINT ( 4 ) NOT NULL DEFAULT '0' COMMENT '审核状态 0-未审核 1-审核通过 2-审核拒绝',
`spu_status` TINYINT ( 4 ) NOT NULL DEFAULT '0' COMMENT '商品状态 0-下架 1-上架',
`group_finish_amount` INT ( 11 ) NOT NULL DEFAULT '0' COMMENT '已成团数量',
`is_delete` TINYINT ( 1 ) NOT NULL DEFAULT '0' COMMENT '删除标识  0-未删除 1-已删除',
`create_time` TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
`update_time` TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
PRIMARY KEY ( `id` ),
KEY `idx_act_id` ( `act_id` ),
KEY `idx_spu_id` ( `spu_id` ),
KEY `idx_seller_id` ( `seller_id` ) 
) ENGINE = INNODB DEFAULT CHARSET = utf8mb4 COMMENT = '拼团商品表';

DROP TABLE IF EXISTS `t_group_sku`;
CREATE TABLE `t_group_sku` (
`id` INT ( 11 ) NOT NULL AUTO_INCREMENT COMMENT '活动货品id',
`act_id` INT ( 11 ) NOT NULL COMMENT '活动id',
`act_spu_id` INT ( 11 ) NOT NULL COMMENT '活动商品id',
`sku_id` INT ( 11 ) NOT NULL COMMENT '原货品id',
`sku_name` VARCHAR ( 64 ) NOT NULL DEFAULT '' COMMENT '货品名称',
`sku_desc` VARCHAR ( 255 ) NOT NULL DEFAULT '' COMMENT '货品描述',
`sku_img` VARCHAR ( 512 ) NOT NULL COMMENT '货品图片',
`is_first_show` TINYINT ( 1 ) DEFAULT '0' COMMENT '优先展示 0-否 1-是',
`sku_status` TINYINT ( 4 ) NOT NULL DEFAULT '0' COMMENT '货品状态 0-下架 1-上架',
`mall_price` BIGINT ( 20 ) NOT NULL COMMENT '货品商城价(单位分)',
`act_price` BIGINT ( 20 ) NOT NULL COMMENT '货品活动价(单位分)',
`act_commission_rate` INT ( 11 ) DEFAULT NULL COMMENT '佣金比例 如: 20代表20%',
`act_commission` INT ( 11 ) DEFAULT NULL COMMENT '佣金金额(单位分)',
`act_service_rate` INT ( 11 ) DEFAULT NULL COMMENT '服务费比例 如: 20代表20%',
`act_service` INT ( 11 ) DEFAULT NULL COMMENT '服务费金额(单位分)',
`is_delete` TINYINT ( 1 ) NOT NULL DEFAULT '0' COMMENT '删除标识  0-未删除 1-已删除',
`create_time` TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
`update_time` TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
PRIMARY KEY ( `id` ),
KEY `idx_act_spu_id` ( `act_spu_id` ),
KEY `idx_sku_id` ( `sku_id` ) 
) ENGINE = INNODB DEFAULT CHARSET = utf8mb4 COMMENT = '拼团货品表';

DROP TABLE IF EXISTS `t_group_log`;
CREATE TABLE `t_group_log` (
`id` INT ( 11 ) NOT NULL AUTO_INCREMENT COMMENT '成团日志id',
`act_spu_id` INT ( 11 ) NOT NULL COMMENT '活动商品id',
`group_id` VARCHAR ( 32 ) NOT NULL COMMENT '开团id',
`leader_id` INT ( 11 ) NOT NULL COMMENT '团长用户id',
`start_time` datetime NOT NULL COMMENT '团开始时间',
`finish_time` datetime DEFAULT NULL COMMENT '拼团完成时间',
`last_member_id` INT ( 11 ) NOT NULL COMMENT '最后成团用户id',
`is_delete` TINYINT ( 1 ) NOT NULL DEFAULT '0' COMMENT '删除标识  0-未删除 1-已删除',
`create_time` TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
`update_time` TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
PRIMARY KEY ( `id` ),
KEY `idx_act_spu_id` ( `act_spu_id` ) 
) ENGINE = INNODB DEFAULT CHARSET = utf8mb4 COMMENT = '成团日志表';

-- 分库分表

DROP TABLE IF EXISTS `t_group_shopping`;
CREATE TABLE `t_group_shopping` (
`id` VARCHAR ( 32 ) NOT NULL COMMENT '开团id',
`parent_id` VARCHAR ( 32 ) DEFAULT '' COMMENT '原始拼团id',
`act_id` INT ( 11 ) NOT NULL COMMENT '活动id',
`act_spu_id` INT ( 11 ) NOT NULL COMMENT '活动商品id',
`act_sku_id` INT ( 11 ) NOT NULL COMMENT '活动货品id',
`spu_id` INT ( 11 ) NOT NULL COMMENT '商品id',
`sku_id` INT ( 11 ) NOT NULL COMMENT '货品id',
`spu_name` VARCHAR ( 255 ) DEFAULT NULL COMMENT '商品名称',
`seller_id` INT ( 11 ) NOT NULL COMMENT '商家id',
`seller_name` VARCHAR ( 32 ) NOT NULL COMMENT '商家名称',
`price` BIGINT ( 20 ) NOT NULL COMMENT '购买单价',
`number` INT ( 11 ) NOT NULL DEFAULT '0' COMMENT '购买数量',
`leader_id` INT ( 11 ) NOT NULL COMMENT '团长用户id',
`leader_nick_name` VARCHAR ( 50 ) NOT NULL COMMENT '团长昵称',
`leader_avatar` VARCHAR ( 500 ) NOT NULL COMMENT '团长头像',
`order_sn` VARCHAR ( 64 ) NOT NULL COMMENT '开团订单编号',
`order_psn` VARCHAR ( 64 ) NOT NULL COMMENT '开团父订单编号',
`id_red_packet` TINYINT ( 1 ) NOT NULL DEFAULT '0' COMMENT '红包标记: 0-没有红包 1-有红包',
`group_type` TINYINT ( 1 ) NOT NULL DEFAULT '0' COMMENT '团类型: 0-普通拼团 1-拼团赚',
`group_status` TINYINT ( 4 ) NOT NULL DEFAULT '0' COMMENT '团状态：0-待成团 1-已成团 2-已失效',
`group_size` INT ( 11 ) NOT NULL DEFAULT '0' COMMENT '团大小，如2人团、10人团',
`group_member_amount` INT ( 11 ) NOT NULL DEFAULT '0' COMMENT '已参团人数',
`expire_time` datetime NOT NULL COMMENT '团过期时间',
`start_time` datetime NOT NULL COMMENT '团开始时间',
`finish_time` datetime DEFAULT NULL COMMENT '拼团完成时间',
`robot_work_minutes` INT ( 11 ) NOT NULL DEFAULT '0' COMMENT '成团补齐机器人实际工作时间(单位分钟)',
`robot_work_min_minutes` INT ( 11 ) NOT NULL DEFAULT '0' COMMENT '成团补齐机器人工作最小开始时间(单位分钟)',
`robot_work_max_minutes` INT ( 11 ) NOT NULL DEFAULT '0' COMMENT '成团补齐机器人工作最大开始时间(单位分钟)',
`create_time` TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
`update_time` TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
PRIMARY KEY ( `id` ),
KEY `idx_order_sn` ( `order_sn` ),
KEY `idx_leader_id` ( `leader_id` ) 
) ENGINE = INNODB DEFAULT CHARSET = utf8mb4 COMMENT = '拼团-团信息表';

DROP TABLE IF EXISTS `t_group_member`;
CREATE TABLE `t_group_member` (
`id` VARCHAR ( 32 ) NOT NULL COMMENT '参团id',
`group_id` VARCHAR ( 32 ) NOT NULL COMMENT '开团id',
`member_id` INT ( 11 ) NOT NULL COMMENT '团成员用户id',
`member_nick_name` VARCHAR ( 50 ) NOT NULL COMMENT '会员昵称',
`member_avatar` VARCHAR ( 500 ) NOT NULL COMMENT '会员头像地址',
`member_type` TINYINT ( 4 ) NOT NULL DEFAULT '0' COMMENT '团成员类型：0-团长，1-普通成员',
`order_sn` VARCHAR ( 64 ) NOT NULL COMMENT '订单编号',
`order_psn` VARCHAR ( 64 ) NOT NULL COMMENT '订单父编号',
`order_pay_time` datetime NOT NULL COMMENT '订单付款时间',
`act_sku_id` INT ( 11 ) NOT NULL COMMENT '活动货品id',
`price` BIGINT ( 20 ) NOT NULL COMMENT '购买单价',
`number` INT ( 11 ) NOT NULL DEFAULT '0' COMMENT '购买数量',
`create_time` TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
`update_time` TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
PRIMARY KEY ( `id` ),
KEY `idx_group_id` ( `group_id` ),
KEY `idx_order_sn` ( `order_sn` ),
KEY `idx_member_id` ( `member_id` ) 
) ENGINE = INNODB DEFAULT CHARSET = utf8mb4 COMMENT = '拼团-团成员记录表';
