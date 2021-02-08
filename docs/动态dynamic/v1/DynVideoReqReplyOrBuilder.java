// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: bilibili/app/dynamic/v1/dynamic.proto

package com.bapis.bilibili.app.dynamic.v1;

public interface DynVideoReqReplyOrBuilder extends
    // @@protoc_insertion_point(interface_extends:bilibili.app.dynamic.v1.DynVideoReqReply)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * 动态列表
   * </pre>
   *
   * <code>repeated .bilibili.app.dynamic.v1.DynamicItem list = 1;</code>
   */
  java.util.List<DynamicItem>
      getListList();
  /**
   * <pre>
   * 动态列表
   * </pre>
   *
   * <code>repeated .bilibili.app.dynamic.v1.DynamicItem list = 1;</code>
   */
  DynamicItem getList(int index);
  /**
   * <pre>
   * 动态列表
   * </pre>
   *
   * <code>repeated .bilibili.app.dynamic.v1.DynamicItem list = 1;</code>
   */
  int getListCount();
  /**
   * <pre>
   * 动态列表
   * </pre>
   *
   * <code>repeated .bilibili.app.dynamic.v1.DynamicItem list = 1;</code>
   */
  java.util.List<? extends DynamicItemOrBuilder>
      getListOrBuilderList();
  /**
   * <pre>
   * 动态列表
   * </pre>
   *
   * <code>repeated .bilibili.app.dynamic.v1.DynamicItem list = 1;</code>
   */
  DynamicItemOrBuilder getListOrBuilder(
      int index);

  /**
   * <pre>
   * 更新的动态数
   * </pre>
   *
   * <code>int32 update_num = 2;</code>
   * @return The updateNum.
   */
  int getUpdateNum();

  /**
   * <pre>
   * 历史偏移
   * </pre>
   *
   * <code>string history_offset = 3;</code>
   * @return The historyOffset.
   */
  String getHistoryOffset();
  /**
   * <pre>
   * 历史偏移
   * </pre>
   *
   * <code>string history_offset = 3;</code>
   * @return The bytes for historyOffset.
   */
  com.google.protobuf.ByteString
      getHistoryOffsetBytes();

  /**
   * <pre>
   * 更新基础信息
   * </pre>
   *
   * <code>string update_baseline = 4;</code>
   * @return The updateBaseline.
   */
  String getUpdateBaseline();
  /**
   * <pre>
   * 更新基础信息
   * </pre>
   *
   * <code>string update_baseline = 4;</code>
   * @return The bytes for updateBaseline.
   */
  com.google.protobuf.ByteString
      getUpdateBaselineBytes();

  /**
   * <pre>
   * 是否还有更多数据
   * </pre>
   *
   * <code>int32 has_more = 5;</code>
   * @return The hasMore.
   */
  int getHasMore();
}
