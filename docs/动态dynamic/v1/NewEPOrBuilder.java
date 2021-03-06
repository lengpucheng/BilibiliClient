// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: bilibili/app/dynamic/v1/dynamic.proto

package com.bapis.bilibili.app.dynamic.v1;

public interface NewEPOrBuilder extends
    // @@protoc_insertion_point(interface_extends:bilibili.app.dynamic.v1.NewEP)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * 最新话epid
   * </pre>
   *
   * <code>int32 id = 1;</code>
   * @return The id.
   */
  int getId();

  /**
   * <pre>
   * 更新至XX话
   * </pre>
   *
   * <code>string index_show = 2;</code>
   * @return The indexShow.
   */
  String getIndexShow();
  /**
   * <pre>
   * 更新至XX话
   * </pre>
   *
   * <code>string index_show = 2;</code>
   * @return The bytes for indexShow.
   */
  com.google.protobuf.ByteString
      getIndexShowBytes();

  /**
   * <pre>
   * 更新剧集的封面
   * </pre>
   *
   * <code>string cover = 3;</code>
   * @return The cover.
   */
  String getCover();
  /**
   * <pre>
   * 更新剧集的封面
   * </pre>
   *
   * <code>string cover = 3;</code>
   * @return The bytes for cover.
   */
  com.google.protobuf.ByteString
      getCoverBytes();
}
