// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: bilibili/app/dynamic/v2/dynamic.proto

package com.bapis.bilibili.app.dynamic.v2;

public interface DynOGVFollowReqOrBuilder extends
    // @@protoc_insertion_point(interface_extends:bilibili.app.dynamic.v2.DynOGVFollowReq)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.bilibili.app.dynamic.v2.FollowType follow_type = 1;</code>
   * @return The enum numeric value on the wire for followType.
   */
  int getFollowTypeValue();
  /**
   * <code>.bilibili.app.dynamic.v2.FollowType follow_type = 1;</code>
   * @return The followType.
   */
  com.bapis.bilibili.app.dynamic.v2.FollowType getFollowType();

  /**
   * <code>string dyn_id = 2;</code>
   * @return The dynId.
   */
  java.lang.String getDynId();
  /**
   * <code>string dyn_id = 2;</code>
   * @return The bytes for dynId.
   */
  com.google.protobuf.ByteString
      getDynIdBytes();
}
