// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: bilibili/app/dynamic/v2/dynamic.proto

package com.bapis.bilibili.app.dynamic.v2;

public interface LikeInfoOrBuilder extends
    // @@protoc_insertion_point(interface_extends:bilibili.app.dynamic.v2.LikeInfo)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * 点赞动画
   * </pre>
   *
   * <code>.bilibili.app.dynamic.v2.LikeAnimation animation = 1;</code>
   * @return Whether the animation field is set.
   */
  boolean hasAnimation();
  /**
   * <pre>
   * 点赞动画
   * </pre>
   *
   * <code>.bilibili.app.dynamic.v2.LikeAnimation animation = 1;</code>
   * @return The animation.
   */
  com.bapis.bilibili.app.dynamic.v2.LikeAnimation getAnimation();
  /**
   * <pre>
   * 点赞动画
   * </pre>
   *
   * <code>.bilibili.app.dynamic.v2.LikeAnimation animation = 1;</code>
   */
  com.bapis.bilibili.app.dynamic.v2.LikeAnimationOrBuilder getAnimationOrBuilder();

  /**
   * <pre>
   * 是否点赞
   * </pre>
   *
   * <code>bool is_like = 2;</code>
   * @return The isLike.
   */
  boolean getIsLike();
}
