// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: bilibili/app/dynamic/v1/dynamic.proto

package com.bapis.bilibili.app.dynamic.v1;

public interface SVideoModuleDescOrBuilder extends
    // @@protoc_insertion_point(interface_extends:bilibili.app.dynamic.v1.SVideoModuleDesc)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * 文本内容
   * </pre>
   *
   * <code>string text = 1;</code>
   * @return The text.
   */
  String getText();
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
}
