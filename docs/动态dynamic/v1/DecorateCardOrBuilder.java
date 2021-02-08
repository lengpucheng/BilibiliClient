// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: bilibili/app/dynamic/v1/dynamic.proto

package com.bapis.bilibili.app.dynamic.v1;

public interface DecorateCardOrBuilder extends
    // @@protoc_insertion_point(interface_extends:bilibili.app.dynamic.v1.DecorateCard)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * 装扮卡片id
   * </pre>
   *
   * <code>int64 id = 1;</code>
   * @return The id.
   */
  long getId();

  /**
   * <pre>
   * 装扮卡片链接
   * </pre>
   *
   * <code>string card_url = 2;</code>
   * @return The cardUrl.
   */
  String getCardUrl();
  /**
   * <pre>
   * 装扮卡片链接
   * </pre>
   *
   * <code>string card_url = 2;</code>
   * @return The bytes for cardUrl.
   */
  com.google.protobuf.ByteString
      getCardUrlBytes();

  /**
   * <pre>
   * 装扮卡片点击跳转链接
   * </pre>
   *
   * <code>string jump_url = 3;</code>
   * @return The jumpUrl.
   */
  String getJumpUrl();
  /**
   * <pre>
   * 装扮卡片点击跳转链接
   * </pre>
   *
   * <code>string jump_url = 3;</code>
   * @return The bytes for jumpUrl.
   */
  com.google.protobuf.ByteString
      getJumpUrlBytes();

  /**
   * <pre>
   * 粉丝样式
   * </pre>
   *
   * <code>.bilibili.app.dynamic.v1.DecoCardFan fan = 4;</code>
   * @return Whether the fan field is set.
   */
  boolean hasFan();
  /**
   * <pre>
   * 粉丝样式
   * </pre>
   *
   * <code>.bilibili.app.dynamic.v1.DecoCardFan fan = 4;</code>
   * @return The fan.
   */
  DecoCardFan getFan();
  /**
   * <pre>
   * 粉丝样式
   * </pre>
   *
   * <code>.bilibili.app.dynamic.v1.DecoCardFan fan = 4;</code>
   */
  DecoCardFanOrBuilder getFanOrBuilder();
}
