// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: bilibili/app/dynamic/v2/dynamic.proto

package com.bapis.bilibili.app.dynamic.v2;

public interface MdlDynCourSeasonOrBuilder extends
    // @@protoc_insertion_point(interface_extends:bilibili.app.dynamic.v2.MdlDynCourSeason)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * 标题
   * </pre>
   *
   * <code>string title = 1;</code>
   * @return The title.
   */
  java.lang.String getTitle();
  /**
   * <pre>
   * 标题
   * </pre>
   *
   * <code>string title = 1;</code>
   * @return The bytes for title.
   */
  com.google.protobuf.ByteString
      getTitleBytes();

  /**
   * <pre>
   * 封面图
   * </pre>
   *
   * <code>string cover = 2;</code>
   * @return The cover.
   */
  java.lang.String getCover();
  /**
   * <pre>
   * 封面图
   * </pre>
   *
   * <code>string cover = 2;</code>
   * @return The bytes for cover.
   */
  com.google.protobuf.ByteString
      getCoverBytes();

  /**
   * <pre>
   * 跳转地址
   * </pre>
   *
   * <code>string uri = 3;</code>
   * @return The uri.
   */
  java.lang.String getUri();
  /**
   * <pre>
   * 跳转地址
   * </pre>
   *
   * <code>string uri = 3;</code>
   * @return The bytes for uri.
   */
  com.google.protobuf.ByteString
      getUriBytes();

  /**
   * <pre>
   * 展示项 1（更新信息）
   * </pre>
   *
   * <code>string text_1 = 4;</code>
   * @return The text1.
   */
  java.lang.String getText1();
  /**
   * <pre>
   * 展示项 1（更新信息）
   * </pre>
   *
   * <code>string text_1 = 4;</code>
   * @return The bytes for text1.
   */
  com.google.protobuf.ByteString
      getText1Bytes();

  /**
   * <pre>
   * 描述信息
   * </pre>
   *
   * <code>string desc = 5;</code>
   * @return The desc.
   */
  java.lang.String getDesc();
  /**
   * <pre>
   * 描述信息
   * </pre>
   *
   * <code>string desc = 5;</code>
   * @return The bytes for desc.
   */
  com.google.protobuf.ByteString
      getDescBytes();

  /**
   * <pre>
   * 角标
   * </pre>
   *
   * <code>.bilibili.app.dynamic.v2.VideoBadge badge = 6;</code>
   * @return Whether the badge field is set.
   */
  boolean hasBadge();
  /**
   * <pre>
   * 角标
   * </pre>
   *
   * <code>.bilibili.app.dynamic.v2.VideoBadge badge = 6;</code>
   * @return The badge.
   */
  com.bapis.bilibili.app.dynamic.v2.VideoBadge getBadge();
  /**
   * <pre>
   * 角标
   * </pre>
   *
   * <code>.bilibili.app.dynamic.v2.VideoBadge badge = 6;</code>
   */
  com.bapis.bilibili.app.dynamic.v2.VideoBadgeOrBuilder getBadgeOrBuilder();
}
