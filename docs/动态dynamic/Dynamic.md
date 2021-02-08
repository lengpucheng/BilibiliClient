# 动态接口

## 1. 获取动态详情

### API

GET `https://api.vc.bilibili.com/dynamic_svr/v1/dynamic_svr/get_dynamic_detail`

### 参数

1. `dynamic_id` : 动态id

### 响应data

```
card--
    |-desc : DynamicData 
    |-card : DynamicDetail 
    |-content : DynamicRepost 仅转发
```

## 2. 获取用户动态列表

### API

GET `https://api.vc.bilibili.com/dynamic_svr/v1/dynamic_svr/space_history`

### 参数

1. `visitor_uid` : 参观者id 未登录 默认0 非必须
2. `host_uid` : 用户uid 必选
3. `offset_dynamic_id` : 偏移量 第一次为0
4. `platform` : 平台 默认 web 非必须

### 响应data

```shell
-- has_more : 是否有更多
-- next_offset : 下一次的偏移量
-- _gt_ : 未知
-- cards : [card]
```

