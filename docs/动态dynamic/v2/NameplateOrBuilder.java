// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: bilibili/app/dynamic/v2/dynamic.proto

package com.bapis.bilibili.app.dynamic.v2;

public interface NameplateOrBuilder extends
    // @@protoc_insertion_point(interface_extends:bilibili.app.dynamic.v2.Nameplate)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * nid
   * </pre>
   *
   * <code>int64 nid = 1;</code>
   * @return The nid.
   */
  long getNid();

  /**
   * <pre>
   * 名称
   * </pre>
   *
   * <code>string name = 2;</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <pre>
   * 名称
   * </pre>
   *
   * <code>string name = 2;</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <pre>
   * 图片地址
   * </pre>
   *
   * <code>string image = 3;</code>
   * @return The image.
   */
  java.lang.String getImage();
  /**
   * <pre>
   * 图片地址
   * </pre>
   *
   * <code>string image = 3;</code>
   * @return The bytes for image.
   */
  com.google.protobuf.ByteString
      getImageBytes();

  /**
   * <pre>
   * 小图地址
   * </pre>
   *
   * <code>string image_small = 4;</code>
   * @return The imageSmall.
   */
  java.lang.String getImageSmall();
  /**
   * <pre>
   * 小图地址
   * </pre>
   *
   * <code>string image_small = 4;</code>
   * @return The bytes for imageSmall.
   */
  com.google.protobuf.ByteString
      getImageSmallBytes();

  /**
   * <pre>
   * 等级
   * </pre>
   *
   * <code>string level = 5;</code>
   * @return The level.
   */
  java.lang.String getLevel();
  /**
   * <pre>
   * 等级
   * </pre>
   *
   * <code>string level = 5;</code>
   * @return The bytes for level.
   */
  com.google.protobuf.ByteString
      getLevelBytes();

  /**
   * <pre>
   * 获取条件
   * </pre>
   *
   * <code>string condition = 6;</code>
   * @return The condition.
   */
  java.lang.String getCondition();
  /**
   * <pre>
   * 获取条件
   * </pre>
   *
   * <code>string condition = 6;</code>
   * @return The bytes for condition.
   */
  com.google.protobuf.ByteString
      getConditionBytes();
}
