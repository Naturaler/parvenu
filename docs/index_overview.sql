create table if not exists index_overview
(
    id               int           not null primary key auto_increment comment '自增主键',
    index_id         int           not null default -1 comment '指数id标识',
    index_code       varchar(20)   not null default '' comment '指数代码',
    indx_sname       varchar(50)   not null default '' comment '指数名称',
    index_ename      varchar(100)  not null default '' comment '指数名称-英文',
    num              varchar(10)   not null default '' comment '成分股数量',
    tclose           varchar(10)   not null default '' comment '最新收盘',
    yld_1_mon        varchar(10)   not null default '' comment '一个月收益率(%)',
    base_point       varchar(10)   not null default '' comment 'base_point',
    base_date        datetime      not null default now() comment 'base_date',
    online_date      datetime      not null default now() comment 'online_date',
    is_custom        tinyint       not null default -1 comment '是否定制',
    index_c_intro    varchar(500)  not null default '' comment '指数说明',
    index_e_intro    varchar(1000) not null default '' comment '指数说明-英文',
    index_c_fullname varchar(100)  not null default '' comment '指数全称',
    index_e_fullname varchar(200)  not null default '' comment '指数全称-英文',
    class_series     varchar(20)   not null default '' comment '指数类别',
    class_eseries    varchar(40)   not null default '' comment '指数类别-英文',
    class_region     varchar(20)   not null default '' comment '地区覆盖',
    class_eregion    varchar(40)   not null default '' comment '地区覆盖-英文',
    class_assets     varchar(20)   not null default '' comment '资产类别',
    class_eassets    varchar(40)   not null default '' comment '资产类别-英文',
    class_classify   varchar(20)   not null default '' comment '资产分类',
    class_eclassify  varchar(40)   not null default '' comment '资产类别-英文',
    class_currency   varchar(20)   not null default '' comment '币种',
    class_ecurrency  varchar(40)   not null default '' comment '币种-英文',
    class_hot        varchar(20)   not null default '' comment '热点',
    class_ehot       varchar(40)   not null default '' comment '热点-英文',
    insert_time      datetime      not null default now() comment '插入时间',
    update_time      datetime      not null default now() comment '更新时间'
)