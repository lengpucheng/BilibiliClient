<h1 align="center">BilibiliClient</h1>

BilibiliClient —— 基于HttpClient 的 哔哩哔哩 API ,根据JSON反向完成的BiliBili Java 包 **将会持续更新**

# 使用方法

（以目前版本为例 1.0.2)

## 1、引入

可以通过Jar 包下载的方式导入 (不推荐)

推荐使用Maven或其他包管理工具引入(见MavenSearch)

```xml
 <dependency>
  <groupId>cn.hll520.linclient</groupId>
  <artifactId>BilibiliClient</artifactId>
  <version>1.0.2</version>
  <dependency>
```

## 2、配置

调用 `BaseClientConfig`的静态方法对相关属进行配置，目前支持如下配置

```java
public class Config {
    public static void main(String[] args) {
        // 协议
        BaseClientConfig.setProtocol(String protocol);
        // 服务host
        BaseClientConfig.setHost(String host);
        // 服务host Vc
        BaseClientConfig.setHostVc(String hostVc);
        // 配置端口
        BaseClientConfig.setPort(Integer port);
        // 配置请求
        BaseClientConfig.setRequestConfig(RequestConfig config);

        // 配置仅对 之后 执行的请求有效 且会 更改 之后的全部全局配置
    }
}
```

## 3、使用

```java
public class Test {
    public static void main(String[] args) {
        // 实例化应该 BiliClient 对象
        BiliClient biliClient = BiliClientFactor.getClient();
        // 调用 Client 对象的 相关条件方法
        BiliCondition biliCondition = biliClient.video();
        // 设置条件参数
        BiliAbel<?> able = biliCondition.withBvid("BV1Ut4y1X7SS");
        // 获取 get 单个、list 多个   add delete update 暂不支持
        Video video = able.get();

        // 一般直接执行链式调用
        DynamicItems list = biliClient.dynamic.withHostUid(392819792L).list();

        // 其中 list 调用 可以传入 偏移或分页参数
    }
}
```

**其他使用方法请参考单元测试类**

# 目前支持

+ `Dynamic 动态` [动态文档](docs/动态dynamic/Dynamic.md)
  + 根据动态ID获取动态数据
  + 根据用户ID获取用户动态列表(目前支持普通动态、视频动态、转发动态)
+ `User 用户相关` [用户文档](docs/用户user/User.md)
  + 根据用户ID获取用户详情
  + 获取当前登录用户信息
+ `Relation 用户关系` [关系文档](docs/关系relation/Relation.md)
  + 根据用户ID获取用户粉丝详情
  + 根据用户ID获取用户关注详情
+ `Video 视频相关` [视频文档](docs/视频video/Video.md)
  + 根据AV获取视频信息
  + 根据BV获取视频信息

+ `DynamicTools` 包含一些静态方法**对动态进行分类和数据整理**

# 参考鸣谢

+ [`bilibili-API-collect` API对照参考](https://github.com/SocialSisterYi/bilibili-API-collect)
+ [`yujincheng08` 提供的接口文档](https://github.com/yujincheng08)

# 说明

1. 本项目遵守MIT协议,基于本项目的任何开发请保留License
2. **本项目仅用于学习目的！** 因使用本项目而导致的各种情况均与开发者无关
3. 若因不可抗力或小破站要求,本项目可能随时中止或存档
