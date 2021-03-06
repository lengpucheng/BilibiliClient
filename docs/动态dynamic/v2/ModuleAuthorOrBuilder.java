// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: bilibili/app/dynamic/v2/dynamic.proto

package com.bapis.bilibili.app.dynamic.v2;

public interface ModuleAuthorOrBuilder extends
    // @@protoc_insertion_point(interface_extends:bilibili.app.dynamic.v2.ModuleAuthor)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * 用户mid
   * </pre>
   *
   * <code>int64 mid = 1;</code>
   * @return The mid.
   */
  long getMid();

  /**
   * <pre>
   * 时间标签
   * </pre>
   *
   * <code>string ptime_label_text = 2;</code>
   * @return The ptimeLabelText.
   */
  java.lang.String getPtimeLabelText();
  /**
   * <pre>
   * 时间标签
   * </pre>
   *
   * <code>string ptime_label_text = 2;</code>
   * @return The bytes for ptimeLabelText.
   */
  com.google.protobuf.ByteString
      getPtimeLabelTextBytes();

  /**
   * <pre>
   * 用户详情
   * </pre>
   *
   * <code>.bilibili.app.dynamic.v2.UserInfo author = 3;</code>
   * @return Whether the author field is set.
   */
  boolean hasAuthor();
  /**
   * <pre>
   * 用户详情
   * </pre>
   *
   * <code>.bilibili.app.dynamic.v2.UserInfo author = 3;</code>
   * @return The author.
   */
  com.bapis.bilibili.app.dynamic.v2.UserInfo getAuthor();
  /**
   * <pre>
   * 用户详情
   * </pre>
   *
   * <code>.bilibili.app.dynamic.v2.UserInfo author = 3;</code>
   */
  com.bapis.bilibili.app.dynamic.v2.UserInfoOrBuilder getAuthorOrBuilder();

  /**
   * <pre>
   * 装扮卡片
   * </pre>
   *
   * <code>.bilibili.app.dynamic.v2.DecorateCard decorate_card = 4;</code>
   * @return Whether the decorateCard field is set.
   */
  boolean hasDecorateCard();
  /**
   * <pre>
   * 装扮卡片
   * </pre>
   *
   * <code>.bilibili.app.dynamic.v2.DecorateCard decorate_card = 4;</code>
   * @return The decorateCard.
   */
  com.bapis.bilibili.app.dynamic.v2.DecorateCard getDecorateCard();
  /**
   * <pre>
   * 装扮卡片
   * </pre>
   *
   * <code>.bilibili.app.dynamic.v2.DecorateCard decorate_card = 4;</code>
   */
  com.bapis.bilibili.app.dynamic.v2.DecorateCardOrBuilder getDecorateCardOrBuilder();

  /**
   * <pre>
   * 点击跳转链接
   * </pre>
   *
   * <code>string uri = 5;</code>
   * @return The uri.
   */
  java.lang.String getUri();
  /**
   * <pre>
   * 点击跳转链接
   * </pre>
   *
   * <code>string uri = 5;</code>
   * @return The bytes for uri.
   */
  com.google.protobuf.ByteString
      getUriBytes();

  /**
   * <pre>
   * 三点信息
   * </pre>
   *
   * <code>repeated .bilibili.app.dynamic.v2.ThreePointItem tp_list = 6;</code>
   */
  java.util.List<com.bapis.bilibili.app.dynamic.v2.ThreePointItem> 
      getTpListList();
  /**
   * <pre>
   * 三点信息
   * </pre>
   *
   * <code>repeated .bilibili.app.dynamic.v2.ThreePointItem tp_list = 6;</code>
   */
  com.bapis.bilibili.app.dynamic.v2.ThreePointItem getTpList(int index);
  /**
   * <pre>
   * 三点信息
   * </pre>
   *
   * <code>repeated .bilibili.app.dynamic.v2.ThreePointItem tp_list = 6;</code>
   */
  int getTpListCount();
  /**
   * <pre>
   * 三点信息
   * </pre>
   *
   * <code>repeated .bilibili.app.dynamic.v2.ThreePointItem tp_list = 6;</code>
   */
  java.util.List<? extends com.bapis.bilibili.app.dynamic.v2.ThreePointItemOrBuilder> 
      getTpListOrBuilderList();
  /**
   * <pre>
   * 三点信息
   * </pre>
   *
   * <code>repeated .bilibili.app.dynamic.v2.ThreePointItem tp_list = 6;</code>
   */
  com.bapis.bilibili.app.dynamic.v2.ThreePointItemOrBuilder getTpListOrBuilder(
      int index);
}
