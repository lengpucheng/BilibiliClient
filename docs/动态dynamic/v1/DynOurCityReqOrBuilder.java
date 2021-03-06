// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: bilibili/app/dynamic/v1/dynamic.proto

package com.bapis.bilibili.app.dynamic.v1;

public interface DynOurCityReqOrBuilder extends
    // @@protoc_insertion_point(interface_extends:bilibili.app.dynamic.v1.DynOurCityReq)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * 城市ID
   * </pre>
   *
   * <code>int64 city_id = 1;</code>
   * @return The cityId.
   */
  long getCityId();

  /**
   * <pre>
   * 纬度
   * </pre>
   *
   * <code>double lat = 2;</code>
   * @return The lat.
   */
  double getLat();

  /**
   * <pre>
   * 经度
   * </pre>
   *
   * <code>double lng = 3;</code>
   * @return The lng.
   */
  double getLng();

  /**
   * <pre>
   * 透传上一次接口请求返回的offset
   * </pre>
   *
   * <code>string offset = 4;</code>
   * @return The offset.
   */
  String getOffset();
  /**
   * <pre>
   * 透传上一次接口请求返回的offset
   * </pre>
   *
   * <code>string offset = 4;</code>
   * @return The bytes for offset.
   */
  com.google.protobuf.ByteString
      getOffsetBytes();

  /**
   * <pre>
   * 每页元素个数
   * </pre>
   *
   * <code>int32 page_size = 5;</code>
   * @return The pageSize.
   */
  int getPageSize();

  /**
   * <pre>
   * 青少年模式 teenagers_mode=1 开启青少年模式
   * </pre>
   *
   * <code>int32 teenagers_mode = 6;</code>
   * @return The teenagersMode.
   */
  int getTeenagersMode();

  /**
   * <pre>
   * 秒开清晰度（秒开用）
   * </pre>
   *
   * <code>int32 qn = 7;</code>
   * @return The qn.
   */
  int getQn();

  /**
   * <pre>
   * 功能版本号（秒开用）
   * </pre>
   *
   * <code>int32 fnver = 8;</code>
   * @return The fnver.
   */
  int getFnver();

  /**
   * <pre>
   * 功能标识（秒开用）
   * </pre>
   *
   * <code>int32 fnval = 9;</code>
   * @return The fnval.
   */
  int getFnval();

  /**
   * <pre>
   * 返回url是否强制使用域名（秒开用）
   * </pre>
   *
   * <code>int32 force_host = 10;</code>
   * @return The forceHost.
   */
  int getForceHost();

  /**
   * <pre>
   * 是否需要4k视频，fourk=1 表示需要，其他表示不需要
   * </pre>
   *
   * <code>int32 fourk = 11;</code>
   * @return The fourk.
   */
  int getFourk();

  /**
   * <pre>
   * 是否开启lbs 0关闭;1开启
   * </pre>
   *
   * <code>int32 lbs_state = 12;</code>
   * @return The lbsState.
   */
  int getLbsState();
}
