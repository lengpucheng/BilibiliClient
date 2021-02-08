# 关系接口

## 1. 粉丝列表

### API

GET `https://api.bilibili.com/x/relation/followers`

### 参数

1. `vmid` : 被观察者ID
2. `pn`: 页数 默认为1 非必须 **非自己仅可查看前5页**
3. `ps`: 每页大小 默认为50 非必须 范围1-50
4. `order` : 排序方式 默认DESC 非必须
4. `jsonp` : 请求格式 默认 jsonp 非必须

### 响应data

```shell
-- list [ 
  {mid,uname,sign,face,mtime } // 其余和User 相同
  ]
-- re_version : 乐观锁版本
-- total : 粉丝数量
```

## 2. 关注列表

### API

GET `http://api.bilibili.com/x/relation/followings`

### 参数

1. `vmid` : 被观察者ID
2. `pn`: 页数 默认为1 非必须 **非自己仅可查看前5页**
3. `ps`: 每页大小 默认为50 非必须 范围1-50
4. `order_type` : 排序方式 默认DESC 非必须
4. `jsonp` : 请求格式 默认 jsonp 非必须

### 响应data

```shell
-- list [ 
  {mid,uname,sign,face,mtime} // 其余和User 相同
  ]
-- re_version : 乐观锁版本
-- total : 粉丝数量
```

