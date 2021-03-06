// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: bilibili/app/dynamic/v2/dynamic.proto

package com.bapis.bilibili.app.dynamic.v2;

/**
 * <pre>
 * AdditionalType 枚举-动态附加卡
 * </pre>
 *
 * Protobuf enum {@code bilibili.app.dynamic.v2.AdditionalType}
 */
public enum AdditionalType
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <pre>
   * 占位
   * </pre>
   *
   * <code>additional_none = 0;</code>
   */
  additional_none(0),
  /**
   * <pre>
   * 附加卡-追番
   * </pre>
   *
   * <code>additional_type_pgc = 1;</code>
   */
  additional_type_pgc(1),
  /**
   * <pre>
   * 附加卡-商品
   * </pre>
   *
   * <code>additional_type_goods = 2;</code>
   */
  additional_type_goods(2),
  /**
   * <pre>
   * 附加卡投票
   * </pre>
   *
   * <code>additional_type_vote = 3;</code>
   */
  additional_type_vote(3),
  UNRECOGNIZED(-1),
  ;

  /**
   * <pre>
   * 占位
   * </pre>
   *
   * <code>additional_none = 0;</code>
   */
  public static final int additional_none_VALUE = 0;
  /**
   * <pre>
   * 附加卡-追番
   * </pre>
   *
   * <code>additional_type_pgc = 1;</code>
   */
  public static final int additional_type_pgc_VALUE = 1;
  /**
   * <pre>
   * 附加卡-商品
   * </pre>
   *
   * <code>additional_type_goods = 2;</code>
   */
  public static final int additional_type_goods_VALUE = 2;
  /**
   * <pre>
   * 附加卡投票
   * </pre>
   *
   * <code>additional_type_vote = 3;</code>
   */
  public static final int additional_type_vote_VALUE = 3;


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
  public static AdditionalType valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static AdditionalType forNumber(int value) {
    switch (value) {
      case 0: return additional_none;
      case 1: return additional_type_pgc;
      case 2: return additional_type_goods;
      case 3: return additional_type_vote;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<AdditionalType>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      AdditionalType> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<AdditionalType>() {
          public AdditionalType findValueByNumber(int number) {
            return AdditionalType.forNumber(number);
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
    return com.bapis.bilibili.app.dynamic.v2.DynamicOuterClass.getDescriptor().getEnumTypes().get(13);
  }

  private static final AdditionalType[] VALUES = values();

  public static AdditionalType valueOf(
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

  private AdditionalType(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:bilibili.app.dynamic.v2.AdditionalType)
}

