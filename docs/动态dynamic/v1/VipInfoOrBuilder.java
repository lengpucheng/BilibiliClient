// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: bilibili/app/dynamic/v1/dynamic.proto

package com.bapis.bilibili.app.dynamic.v1;

public interface VipInfoOrBuilder extends
    // @@protoc_insertion_point(interface_extends:bilibili.app.dynamic.v1.VipInfo)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * 大会员类型
   * </pre>
   *
   * <code>int32 Type = 1;</code>
   * @return The type.
   */
  int getType();

  /**
   * <pre>
   * 大会员状态
   * </pre>
   *
   * <code>int32 status = 2;</code>
   * @return The status.
   */
  int getStatus();

  /**
   * <pre>
   * 到期时间
   * </pre>
   *
   * <code>int64 due_date = 3;</code>
   * @return The dueDate.
   */
  long getDueDate();

  /**
   * <pre>
   * 标签
   * </pre>
   *
   * <code>.bilibili.app.dynamic.v1.VipLabel label = 4;</code>
   * @return Whether the label field is set.
   */
  boolean hasLabel();
  /**
   * <pre>
   * 标签
   * </pre>
   *
   * <code>.bilibili.app.dynamic.v1.VipLabel label = 4;</code>
   * @return The label.
   */
  VipLabel getLabel();
  /**
   * <pre>
   * 标签
   * </pre>
   *
   * <code>.bilibili.app.dynamic.v1.VipLabel label = 4;</code>
   */
  VipLabelOrBuilder getLabelOrBuilder();

  /**
   * <pre>
   * 主题
   * </pre>
   *
   * <code>int32 theme_type = 5;</code>
   * @return The themeType.
   */
  int getThemeType();
}
