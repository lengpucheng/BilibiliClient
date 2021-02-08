// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: bilibili/app/dynamic/v1/dynamic.proto

package com.bapis.bilibili.app.dynamic.v1;

/**
 * <pre>
 * 播放器类型
 * </pre>
 *
 * Protobuf enum {@code bilibili.app.dynamic.v1.MediaType}
 */
public enum MediaType
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <pre>
   * 本地
   * </pre>
   *
   * <code>MediaTypeNone = 0;</code>
   */
  MediaTypeNone(0),
  /**
   * <pre>
   * UGC
   * </pre>
   *
   * <code>MediaTypeUGC = 1;</code>
   */
  MediaTypeUGC(1),
  /**
   * <pre>
   * PGC
   * </pre>
   *
   * <code>MediaTypePGC = 2;</code>
   */
  MediaTypePGC(2),
  /**
   * <pre>
   * 直播
   * </pre>
   *
   * <code>MediaTypeLive = 3;</code>
   */
  MediaTypeLive(3),
  /**
   * <pre>
   * 小视频
   * </pre>
   *
   * <code>MediaTypeVCS = 4;</code>
   */
  MediaTypeVCS(4),
  UNRECOGNIZED(-1),
  ;

  /**
   * <pre>
   * 本地
   * </pre>
   *
   * <code>MediaTypeNone = 0;</code>
   */
  public static final int MediaTypeNone_VALUE = 0;
  /**
   * <pre>
   * UGC
   * </pre>
   *
   * <code>MediaTypeUGC = 1;</code>
   */
  public static final int MediaTypeUGC_VALUE = 1;
  /**
   * <pre>
   * PGC
   * </pre>
   *
   * <code>MediaTypePGC = 2;</code>
   */
  public static final int MediaTypePGC_VALUE = 2;
  /**
   * <pre>
   * 直播
   * </pre>
   *
   * <code>MediaTypeLive = 3;</code>
   */
  public static final int MediaTypeLive_VALUE = 3;
  /**
   * <pre>
   * 小视频
   * </pre>
   *
   * <code>MediaTypeVCS = 4;</code>
   */
  public static final int MediaTypeVCS_VALUE = 4;


  public final int getNumber() {
    if (this == UNRECOGNIZED) {
      throw new IllegalArgumentException(
          "Can't get the number of an unknown enum value.");
    }
    return value;
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   * @deprecated Use {@link #forNumber(int)} instead.
   */
  @Deprecated
  public static MediaType valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static MediaType forNumber(int value) {
    switch (value) {
      case 0: return MediaTypeNone;
      case 1: return MediaTypeUGC;
      case 2: return MediaTypePGC;
      case 3: return MediaTypeLive;
      case 4: return MediaTypeVCS;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<MediaType>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      MediaType> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<MediaType>() {
          public MediaType findValueByNumber(int number) {
            return MediaType.forNumber(number);
          }
        };

  public final com.google.protobuf.Descriptors.EnumValueDescriptor
      getValueDescriptor() {
    if (this == UNRECOGNIZED) {
      throw new IllegalStateException(
          "Can't get the descriptor of an unrecognized enum value.");
    }
    return getDescriptor().getValues().get(ordinal());
  }
  public final com.google.protobuf.Descriptors.EnumDescriptor
      getDescriptorForType() {
    return getDescriptor();
  }
  public static final com.google.protobuf.Descriptors.EnumDescriptor
      getDescriptor() {
    return DynamicOuterClass.getDescriptor().getEnumTypes().get(2);
  }

  private static final MediaType[] VALUES = values();

  public static MediaType valueOf(
      com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
    if (desc.getType() != getDescriptor()) {
      throw new IllegalArgumentException(
        "EnumValueDescriptor is not for this type.");
    }
    if (desc.getIndex() == -1) {
      return UNRECOGNIZED;
    }
    return VALUES[desc.getIndex()];
  }

  private final int value;

  private MediaType(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:bilibili.app.dynamic.v1.MediaType)
}

