// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: bilibili/app/dynamic/v2/dynamic.proto

package com.bapis.bilibili.app.dynamic.v2;

public interface ModuleLikeUserOrBuilder extends
    // @@protoc_insertion_point(interface_extends:bilibili.app.dynamic.v2.ModuleLikeUser)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * 点赞用户
   * </pre>
   *
   * <code>repeated .bilibili.app.dynamic.v2.LikeUser like_users = 1;</code>
   */
  java.util.List<com.bapis.bilibili.app.dynamic.v2.LikeUser> 
      getLikeUsersList();
  /**
   * <pre>
   * 点赞用户
   * </pre>
   *
   * <code>repeated .bilibili.app.dynamic.v2.LikeUser like_users = 1;</code>
   */
  com.bapis.bilibili.app.dynamic.v2.LikeUser getLikeUsers(int index);
  /**
   * <pre>
   * 点赞用户
   * </pre>
   *
   * <code>repeated .bilibili.app.dynamic.v2.LikeUser like_users = 1;</code>
   */
  int getLikeUsersCount();
  /**
   * <pre>
   * 点赞用户
   * </pre>
   *
   * <code>repeated .bilibili.app.dynamic.v2.LikeUser like_users = 1;</code>
   */
  java.util.List<? extends com.bapis.bilibili.app.dynamic.v2.LikeUserOrBuilder> 
      getLikeUsersOrBuilderList();
  /**
   * <pre>
   * 点赞用户
   * </pre>
   *
   * <code>repeated .bilibili.app.dynamic.v2.LikeUser like_users = 1;</code>
   */
  com.bapis.bilibili.app.dynamic.v2.LikeUserOrBuilder getLikeUsersOrBuilder(
      int index);

  /**
   * <pre>
   * 文案
   * </pre>
   *
   * <code>string display_text = 2;</code>
   * @return The displayText.
   */
  java.lang.String getDisplayText();
  /**
   * <pre>
   * 文案
   * </pre>
   *
   * <code>string display_text = 2;</code>
   * @return The bytes for displayText.
   */
  com.google.protobuf.ByteString
      getDisplayTextBytes();
}
