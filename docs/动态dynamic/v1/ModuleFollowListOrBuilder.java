// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: bilibili/app/dynamic/v1/dynamic.proto

package com.bapis.bilibili.app.dynamic.v1;

public interface ModuleFollowListOrBuilder extends
    // @@protoc_insertion_point(interface_extends:bilibili.app.dynamic.v1.ModuleFollowList)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * 查看全部的跳转链接
   * </pre>
   *
   * <code>string view_all_link = 1;</code>
   * @return The viewAllLink.
   */
  String getViewAllLink();
  /**
   * <pre>
   * 查看全部的跳转链接
   * </pre>
   *
   * <code>string view_all_link = 1;</code>
   * @return The bytes for viewAllLink.
   */
  com.google.protobuf.ByteString
      getViewAllLinkBytes();

  /**
   * <code>repeated .bilibili.app.dynamic.v1.FollowListItem list = 2;</code>
   */
  java.util.List<FollowListItem>
      getListList();
  /**
   * <code>repeated .bilibili.app.dynamic.v1.FollowListItem list = 2;</code>
   */
  FollowListItem getList(int index);
  /**
   * <code>repeated .bilibili.app.dynamic.v1.FollowListItem list = 2;</code>
   */
  int getListCount();
  /**
   * <code>repeated .bilibili.app.dynamic.v1.FollowListItem list = 2;</code>
   */
  java.util.List<? extends FollowListItemOrBuilder>
      getListOrBuilderList();
  /**
   * <code>repeated .bilibili.app.dynamic.v1.FollowListItem list = 2;</code>
   */
  FollowListItemOrBuilder getListOrBuilder(
      int index);
}
