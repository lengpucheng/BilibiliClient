// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: bilibili/app/dynamic/v2/dynamic.proto

package com.bapis.bilibili.app.dynamic.v2;

public interface AdditionVoteOrBuilder extends
    // @@protoc_insertion_point(interface_extends:bilibili.app.dynamic.v2.AdditionVote)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * 封面图
   * </pre>
   *
   * <code>string image_url = 1;</code>
   * @return The imageUrl.
   */
  java.lang.String getImageUrl();
  /**
   * <pre>
   * 封面图
   * </pre>
   *
   * <code>string image_url = 1;</code>
   * @return The bytes for imageUrl.
   */
  com.google.protobuf.ByteString
      getImageUrlBytes();

  /**
   * <pre>
   * 标题
   * </pre>
   *
   * <code>string title = 2;</code>
   * @return The title.
   */
  java.lang.String getTitle();
  /**
   * <pre>
   * 标题
   * </pre>
   *
   * <code>string title = 2;</code>
   * @return The bytes for title.
   */
  com.google.protobuf.ByteString
      getTitleBytes();

  /**
   * <pre>
   * 展示项1
   * </pre>
   *
   * <code>string text_1 = 3;</code>
   * @return The text1.
   */
  java.lang.String getText1();
  /**
   * <pre>
   * 展示项1
   * </pre>
   *
   * <code>string text_1 = 3;</code>
   * @return The bytes for text1.
   */
  com.google.protobuf.ByteString
      getText1Bytes();

  /**
   * <pre>
   * button文案
   * </pre>
   *
   * <code>string button_text = 4;</code>
   * @return The buttonText.
   */
  java.lang.String getButtonText();
  /**
   * <pre>
   * button文案
   * </pre>
   *
   * <code>string button_text = 4;</code>
   * @return The bytes for buttonText.
   */
  com.google.protobuf.ByteString
      getButtonTextBytes();

  /**
   * <pre>
   * 点击跳转链接
   * </pre>
   *
   * <code>string url = 5;</code>
   * @return The url.
   */
  java.lang.String getUrl();
  /**
   * <pre>
   * 点击跳转链接
   * </pre>
   *
   * <code>string url = 5;</code>
   * @return The bytes for url.
   */
  com.google.protobuf.ByteString
      getUrlBytes();
}
