// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: bilibili/app/dynamic/v2/dynamic.proto

package com.bapis.bilibili.app.dynamic.v2;

public interface AdditionalButtonOrBuilder extends
    // @@protoc_insertion_point(interface_extends:bilibili.app.dynamic.v2.AdditionalButton)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * 按钮类型
   * </pre>
   *
   * <code>.bilibili.app.dynamic.v2.AddButtonType type = 1;</code>
   * @return The enum numeric value on the wire for type.
   */
  int getTypeValue();
  /**
   * <pre>
   * 按钮类型
   * </pre>
   *
   * <code>.bilibili.app.dynamic.v2.AddButtonType type = 1;</code>
   * @return The type.
   */
  com.bapis.bilibili.app.dynamic.v2.AddButtonType getType();

  /**
   * <pre>
   * jump-跳转样式
   * </pre>
   *
   * <code>.bilibili.app.dynamic.v2.AdditionalButtonStyle jump_style = 2;</code>
   * @return Whether the jumpStyle field is set.
   */
  boolean hasJumpStyle();
  /**
   * <pre>
   * jump-跳转样式
   * </pre>
   *
   * <code>.bilibili.app.dynamic.v2.AdditionalButtonStyle jump_style = 2;</code>
   * @return The jumpStyle.
   */
  com.bapis.bilibili.app.dynamic.v2.AdditionalButtonStyle getJumpStyle();
  /**
   * <pre>
   * jump-跳转样式
   * </pre>
   *
   * <code>.bilibili.app.dynamic.v2.AdditionalButtonStyle jump_style = 2;</code>
   */
  com.bapis.bilibili.app.dynamic.v2.AdditionalButtonStyleOrBuilder getJumpStyleOrBuilder();

  /**
   * <pre>
   * jump-跳转链接
   * </pre>
   *
   * <code>string jump_url = 3;</code>
   * @return The jumpUrl.
   */
  java.lang.String getJumpUrl();
  /**
   * <pre>
   * jump-跳转链接
   * </pre>
   *
   * <code>string jump_url = 3;</code>
   * @return The bytes for jumpUrl.
   */
  com.google.protobuf.ByteString
      getJumpUrlBytes();

  /**
   * <pre>
   * button-未点样式
   * </pre>
   *
   * <code>.bilibili.app.dynamic.v2.AdditionalButtonStyle uncheck = 4;</code>
   * @return Whether the uncheck field is set.
   */
  boolean hasUncheck();
  /**
   * <pre>
   * button-未点样式
   * </pre>
   *
   * <code>.bilibili.app.dynamic.v2.AdditionalButtonStyle uncheck = 4;</code>
   * @return The uncheck.
   */
  com.bapis.bilibili.app.dynamic.v2.AdditionalButtonStyle getUncheck();
  /**
   * <pre>
   * button-未点样式
   * </pre>
   *
   * <code>.bilibili.app.dynamic.v2.AdditionalButtonStyle uncheck = 4;</code>
   */
  com.bapis.bilibili.app.dynamic.v2.AdditionalButtonStyleOrBuilder getUncheckOrBuilder();

  /**
   * <pre>
   * button-已点样式
   * </pre>
   *
   * <code>.bilibili.app.dynamic.v2.AdditionalButtonStyle check = 5;</code>
   * @return Whether the check field is set.
   */
  boolean hasCheck();
  /**
   * <pre>
   * button-已点样式
   * </pre>
   *
   * <code>.bilibili.app.dynamic.v2.AdditionalButtonStyle check = 5;</code>
   * @return The check.
   */
  com.bapis.bilibili.app.dynamic.v2.AdditionalButtonStyle getCheck();
  /**
   * <pre>
   * button-已点样式
   * </pre>
   *
   * <code>.bilibili.app.dynamic.v2.AdditionalButtonStyle check = 5;</code>
   */
  com.bapis.bilibili.app.dynamic.v2.AdditionalButtonStyleOrBuilder getCheckOrBuilder();

  /**
   * <pre>
   * button-当前状态
   * </pre>
   *
   * <code>.bilibili.app.dynamic.v2.AdditionalButtonStatus status = 6;</code>
   * @return The enum numeric value on the wire for status.
   */
  int getStatusValue();
  /**
   * <pre>
   * button-当前状态
   * </pre>
   *
   * <code>.bilibili.app.dynamic.v2.AdditionalButtonStatus status = 6;</code>
   * @return The status.
   */
  com.bapis.bilibili.app.dynamic.v2.AdditionalButtonStatus getStatus();
}
