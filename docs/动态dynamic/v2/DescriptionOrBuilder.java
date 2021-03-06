// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: bilibili/app/dynamic/v2/dynamic.proto

package com.bapis.bilibili.app.dynamic.v2;

public interface DescriptionOrBuilder extends
    // @@protoc_insertion_point(interface_extends:bilibili.app.dynamic.v2.Description)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * 文本内容
   * </pre>
   *
   * <code>string text = 1;</code>
   * @return The text.
   */
  java.lang.String getText();
  /**
   * <pre>
   * 文本内容
   * </pre>
   *
   * <code>string text = 1;</code>
   * @return The bytes for text.
   */
  com.google.protobuf.ByteString
      getTextBytes();

  /**
   * <pre>
   * 文本类型
   * </pre>
   *
   * <code>.bilibili.app.dynamic.v2.DescType type = 2;</code>
   * @return The enum numeric value on the wire for type.
   */
  int getTypeValue();
  /**
   * <pre>
   * 文本类型
   * </pre>
   *
   * <code>.bilibili.app.dynamic.v2.DescType type = 2;</code>
   * @return The type.
   */
  com.bapis.bilibili.app.dynamic.v2.DescType getType();

  /**
   * <pre>
   * 点击跳转链接
   * </pre>
   *
   * <code>string uri = 3;</code>
   * @return The uri.
   */
  java.lang.String getUri();
  /**
   * <pre>
   * 点击跳转链接
   * </pre>
   *
   * <code>string uri = 3;</code>
   * @return The bytes for uri.
   */
  com.google.protobuf.ByteString
      getUriBytes();

  /**
   * <pre>
   * emoji类型
   * </pre>
   *
   * <code>.bilibili.app.dynamic.v2.EmojiType emoji_type = 4;</code>
   * @return The enum numeric value on the wire for emojiType.
   */
  int getEmojiTypeValue();
  /**
   * <pre>
   * emoji类型
   * </pre>
   *
   * <code>.bilibili.app.dynamic.v2.EmojiType emoji_type = 4;</code>
   * @return The emojiType.
   */
  com.bapis.bilibili.app.dynamic.v2.EmojiType getEmojiType();

  /**
   * <pre>
   * 商品类型
   * </pre>
   *
   * <code>string goods_type = 5;</code>
   * @return The goodsType.
   */
  java.lang.String getGoodsType();
  /**
   * <pre>
   * 商品类型
   * </pre>
   *
   * <code>string goods_type = 5;</code>
   * @return The bytes for goodsType.
   */
  com.google.protobuf.ByteString
      getGoodsTypeBytes();

  /**
   * <pre>
   * 前置Icon
   * </pre>
   *
   * <code>string icon_url = 6;</code>
   * @return The iconUrl.
   */
  java.lang.String getIconUrl();
  /**
   * <pre>
   * 前置Icon
   * </pre>
   *
   * <code>string icon_url = 6;</code>
   * @return The bytes for iconUrl.
   */
  com.google.protobuf.ByteString
      getIconUrlBytes();

  /**
   * <pre>
   * icon_name
   * </pre>
   *
   * <code>string icon_name = 7;</code>
   * @return The iconName.
   */
  java.lang.String getIconName();
  /**
   * <pre>
   * icon_name
   * </pre>
   *
   * <code>string icon_name = 7;</code>
   * @return The bytes for iconName.
   */
  com.google.protobuf.ByteString
      getIconNameBytes();
}
