# 用户接口

## 1. 获取用户信息

### API：

GET `https://api.bilibili.com/x/space/acc/info`

### 参数：

1. `mid` ： 带查询用户UID
2. `jsonp` : 结果类型 默认 jsonp

### 响应data

User

## 2. 当前登录用户信息

### API

GET `http://api.bilibili.com/x/space/myinfo`

### 参数

无，需要cookie认证

### 响应data

User

