// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: bilibili/app/dynamic/v1/dynamic.proto

package com.bapis.bilibili.app.dynamic.v1;

public interface SVideoModuleStatOrBuilder extends
    // @@protoc_insertion_point(interface_extends:bilibili.app.dynamic.v1.SVideoModuleStat)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>repeated .bilibili.app.dynamic.v1.SVideoStatInfo stat_info = 1;</code>
   */
  java.util.List<SVideoStatInfo>
      getStatInfoList();
  /**
   * <code>repeated .bilibili.app.dynamic.v1.SVideoStatInfo stat_info = 1;</code>
   */
  SVideoStatInfo getStatInfo(int index);
  /**
   * <code>repeated .bilibili.app.dynamic.v1.SVideoStatInfo stat_info = 1;</code>
   */
  int getStatInfoCount();
  /**
   * <code>repeated .bilibili.app.dynamic.v1.SVideoStatInfo stat_info = 1;</code>
   */
  java.util.List<? extends SVideoStatInfoOrBuilder>
      getStatInfoOrBuilderList();
  /**
   * <code>repeated .bilibili.app.dynamic.v1.SVideoStatInfo stat_info = 1;</code>
   */
  SVideoStatInfoOrBuilder getStatInfoOrBuilder(
      int index);

  /**
   * <code>.bilibili.app.dynamic.v1.ShareInfo share_info = 2;</code>
   * @return Whether the shareInfo field is set.
   */
  boolean hasShareInfo();
  /**
   * <code>.bilibili.app.dynamic.v1.ShareInfo share_info = 2;</code>
   * @return The shareInfo.
   */
  ShareInfo getShareInfo();
  /**
   * <code>.bilibili.app.dynamic.v1.ShareInfo share_info = 2;</code>
   */
  ShareInfoOrBuilder getShareInfoOrBuilder();
}
