// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: bilibili/app/dynamic/v2/dynamic.proto

package com.bapis.bilibili.app.dynamic.v2;

public interface CardVideoUpListOrBuilder extends
    // @@protoc_insertion_point(interface_extends:bilibili.app.dynamic.v2.CardVideoUpList)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * 标题展示文案
   * </pre>
   *
   * <code>string title = 1;</code>
   * @return The title.
   */
  java.lang.String getTitle();
  /**
   * <pre>
   * 标题展示文案
   * </pre>
   *
   * <code>string title = 1;</code>
   * @return The bytes for title.
   */
  com.google.protobuf.ByteString
      getTitleBytes();

  /**
   * <pre>
   * up主列表
   * </pre>
   *
   * <code>repeated .bilibili.app.dynamic.v2.UpListItem list = 2;</code>
   */
  java.util.List<com.bapis.bilibili.app.dynamic.v2.UpListItem> 
      getListList();
  /**
   * <pre>
   * up主列表
   * </pre>
   *
   * <code>repeated .bilibili.app.dynamic.v2.UpListItem list = 2;</code>
   */
  com.bapis.bilibili.app.dynamic.v2.UpListItem getList(int index);
  /**
   * <pre>
   * up主列表
   * </pre>
   *
   * <code>repeated .bilibili.app.dynamic.v2.UpListItem list = 2;</code>
   */
  int getListCount();
  /**
   * <pre>
   * up主列表
   * </pre>
   *
   * <code>repeated .bilibili.app.dynamic.v2.UpListItem list = 2;</code>
   */
  java.util.List<? extends com.bapis.bilibili.app.dynamic.v2.UpListItemOrBuilder> 
      getListOrBuilderList();
  /**
   * <pre>
   * up主列表
   * </pre>
   *
   * <code>repeated .bilibili.app.dynamic.v2.UpListItem list = 2;</code>
   */
  com.bapis.bilibili.app.dynamic.v2.UpListItemOrBuilder getListOrBuilder(
      int index);
}
