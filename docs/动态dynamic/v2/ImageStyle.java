// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: bilibili/app/dynamic/v2/dynamic.proto

package com.bapis.bilibili.app.dynamic.v2;

/**
 * <pre>
 * ImageStyle 枚举-附加卡样式
 * </pre>
 *
 * Protobuf enum {@code bilibili.app.dynamic.v2.ImageStyle}
 */
public enum ImageStyle
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <code>add_style_vertical = 0;</code>
   */
  add_style_vertical(0),
  /**
   * <code>add_style_square = 1;</code>
   */
  add_style_square(1),
  UNRECOGNIZED(-1),
  ;

  /**
   * <code>add_style_vertical = 0;</code>
   */
  public static final int add_style_vertical_VALUE = 0;
  /**
   * <code>add_style_square = 1;</code>
   */
  public static final int add_style_square_VALUE = 1;


  public final int getNumber() {
    if (this == UNRECOGNIZED) {
      throw new java.lang.IllegalArgumentException(
          "Can't get the number of an unknown enum value.");
    }
    return value;
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   * @deprecated Use {@link #forNumber(int)} instead.
   */
  @java.lang.Deprecated
  public static ImageStyle valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static ImageStyle forNumber(int value) {
    switch (value) {
      case 0: return add_style_vertical;
      case 1: return add_style_square;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<ImageStyle>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      ImageStyle> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<ImageStyle>() {
          public ImageStyle findValueByNumber(int number) {
            return ImageStyle.forNumber(number);
          }
        };

  public final com.google.protobuf.Descriptors.EnumValueDescriptor
      getValueDescriptor() {
    if (this == UNRECOGNIZED) {
      throw new java.lang.IllegalStateException(
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
    return com.bapis.bilibili.app.dynamic.v2.DynamicOuterClass.getDescriptor().getEnumTypes().get(14);
  }

  private static final ImageStyle[] VALUES = values();

  public static ImageStyle valueOf(
      com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
    if (desc.getType() != getDescriptor()) {
      throw new java.lang.IllegalArgumentException(
        "EnumValueDescriptor is not for this type.");
    }
    if (desc.getIndex() == -1) {
      return UNRECOGNIZED;
    }
    return VALUES[desc.getIndex()];
  }

  private final int value;

  private ImageStyle(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:bilibili.app.dynamic.v2.ImageStyle)
}

