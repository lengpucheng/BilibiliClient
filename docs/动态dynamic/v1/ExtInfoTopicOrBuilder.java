// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: bilibili/app/dynamic/v1/dynamic.proto

package com.bapis.bilibili.app.dynamic.v1;

public interface ExtInfoTopicOrBuilder extends
    // @@protoc_insertion_point(interface_extends:bilibili.app.dynamic.v1.ExtInfoTopic)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * 标题 - 话题名
   * </pre>
   *
   * <code>string title = 1;</code>
   * @return The title.
   */
  String getTitle();
  /**
   * <pre>
   * 标题 - 话题名
   * </pre>
   *
   * <code>string title = 1;</code>
   * @return The bytes for title.
   */
  com.google.protobuf.ByteString
      getTitleBytes();

  /**
   * <pre>
   * 跳转地址
   * </pre>
   *
   * <code>string uri = 2;</code>
   * @return The uri.
   */
  String getUri();
  /**
   * <pre>
   * 跳转地址
   * </pre>
   *
   * <code>string uri = 2;</code>
   * @return The bytes for uri.
   */
  com.google.protobuf.ByteString
      getUriBytes();

  /**
   * <pre>
   * 小图标
   * </pre>
   *
   * <code>string icon = 3;</code>
   * @return The icon.
   */
  String getIcon();
  /**
   * <pre>
   * 小图标
   * </pre>
   *
   * <code>string icon = 3;</code>
   * @return The bytes for icon.
   */
  com.google.protobuf.ByteString
      getIconBytes();
}
