// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: bilibili/app/dynamic/v1/dynamic.proto

package com.bapis.bilibili.app.dynamic.v1;

public interface ShareInfoOrBuilder extends
    // @@protoc_insertion_point(interface_extends:bilibili.app.dynamic.v1.ShareInfo)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * 稿件 aid
   * </pre>
   *
   * <code>int64 aid = 1;</code>
   * @return The aid.
   */
  long getAid();

  /**
   * <pre>
   * 稿件 bvid
   * </pre>
   *
   * <code>string bvid = 2;</code>
   * @return The bvid.
   */
  String getBvid();
  /**
   * <pre>
   * 稿件 bvid
   * </pre>
   *
   * <code>string bvid = 2;</code>
   * @return The bytes for bvid.
   */
  com.google.protobuf.ByteString
      getBvidBytes();

  /**
   * <pre>
   * 标题
   * </pre>
   *
   * <code>string title = 3;</code>
   * @return The title.
   */
  String getTitle();
  /**
   * <pre>
   * 标题
   * </pre>
   *
   * <code>string title = 3;</code>
   * @return The bytes for title.
   */
  com.google.protobuf.ByteString
      getTitleBytes();

  /**
   * <pre>
   * 副标题
   * </pre>
   *
   * <code>string subtitle = 4;</code>
   * @return The subtitle.
   */
  String getSubtitle();
  /**
   * <pre>
   * 副标题
   * </pre>
   *
   * <code>string subtitle = 4;</code>
   * @return The bytes for subtitle.
   */
  com.google.protobuf.ByteString
      getSubtitleBytes();

  /**
   * <pre>
   * 稿件封面
   * </pre>
   *
   * <code>string cover = 5;</code>
   * @return The cover.
   */
  String getCover();
  /**
   * <pre>
   * 稿件封面
   * </pre>
   *
   * <code>string cover = 5;</code>
   * @return The bytes for cover.
   */
  com.google.protobuf.ByteString
      getCoverBytes();

  /**
   * <pre>
   * up mid
   * </pre>
   *
   * <code>int64 mid = 6;</code>
   * @return The mid.
   */
  long getMid();

  /**
   * <pre>
   * up name
   * </pre>
   *
   * <code>string name = 7;</code>
   * @return The name.
   */
  String getName();
  /**
   * <pre>
   * up name
   * </pre>
   *
   * <code>string name = 7;</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();
}
