// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: bilibili/app/dynamic/v2/dynamic.proto

package com.bapis.bilibili.app.dynamic.v2;

public interface DynVideoUpdOffsetReqOrBuilder extends
    // @@protoc_insertion_point(interface_extends:bilibili.app.dynamic.v2.DynVideoUpdOffsetReq)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * 被访问者的UID
   * </pre>
   *
   * <code>int64 host_uid = 1;</code>
   * @return The hostUid.
   */
  long getHostUid();

  /**
   * <pre>
   * 用户已读进度
   * </pre>
   *
   * <code>string read_offset = 2;</code>
   * @return The readOffset.
   */
  java.lang.String getReadOffset();
  /**
   * <pre>
   * 用户已读进度
   * </pre>
   *
   * <code>string read_offset = 2;</code>
   * @return The bytes for readOffset.
   */
  com.google.protobuf.ByteString
      getReadOffsetBytes();
}
