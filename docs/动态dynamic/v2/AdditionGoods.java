// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: bilibili/app/dynamic/v2/dynamic.proto

package com.bapis.bilibili.app.dynamic.v2;

/**
 * <pre>
 * AdditionGoods 动态-附加卡-商品卡
 * </pre>
 *
 * Protobuf type {@code bilibili.app.dynamic.v2.AdditionGoods}
 */
public final class AdditionGoods extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:bilibili.app.dynamic.v2.AdditionGoods)
    AdditionGoodsOrBuilder {
private static final long serialVersionUID = 0L;
  // Use AdditionGoods.newBuilder() to construct.
  private AdditionGoods(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private AdditionGoods() {
    rcmdDesc_ = "";
    goodsItems_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new AdditionGoods();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private AdditionGoods(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    int mutable_bitField0_ = 0;
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          case 10: {
            java.lang.String s = input.readStringRequireUtf8();

            rcmdDesc_ = s;
            break;
          }
          case 18: {
            if (!((mutable_bitField0_ & 0x00000001) != 0)) {
              goodsItems_ = new java.util.ArrayList<com.bapis.bilibili.app.dynamic.v2.GoodsItem>();
              mutable_bitField0_ |= 0x00000001;
            }
            goodsItems_.add(
                input.readMessage(com.bapis.bilibili.app.dynamic.v2.GoodsItem.parser(), extensionRegistry));
            break;
          }
          default: {
            if (!parseUnknownField(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      if (((mutable_bitField0_ & 0x00000001) != 0)) {
        goodsItems_ = java.util.Collections.unmodifiableList(goodsItems_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.bapis.bilibili.app.dynamic.v2.DynamicOuterClass.internal_static_bilibili_app_dynamic_v2_AdditionGoods_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.bapis.bilibili.app.dynamic.v2.DynamicOuterClass.internal_static_bilibili_app_dynamic_v2_AdditionGoods_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.bapis.bilibili.app.dynamic.v2.AdditionGoods.class, com.bapis.bilibili.app.dynamic.v2.AdditionGoods.Builder.class);
  }

  public static final int RCMD_DESC_FIELD_NUMBER = 1;
  private volatile java.lang.Object rcmdDesc_;
  /**
   * <pre>
   * 推荐文案
   * </pre>
   *
   * <code>string rcmd_desc = 1;</code>
   * @return The rcmdDesc.
   */
  @java.lang.Override
  public java.lang.String getRcmdDesc() {
    java.lang.Object ref = rcmdDesc_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      rcmdDesc_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * 推荐文案
   * </pre>
   *
   * <code>string rcmd_desc = 1;</code>
   * @return The bytes for rcmdDesc.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getRcmdDescBytes() {
    java.lang.Object ref = rcmdDesc_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      rcmdDesc_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int GOODS_ITEMS_FIELD_NUMBER = 2;
  private java.util.List<com.bapis.bilibili.app.dynamic.v2.GoodsItem> goodsItems_;
  /**
   * <pre>
   * 商品信息
   * </pre>
   *
   * <code>repeated .bilibili.app.dynamic.v2.GoodsItem goods_items = 2;</code>
   */
  @java.lang.Override
  public java.util.List<com.bapis.bilibili.app.dynamic.v2.GoodsItem> getGoodsItemsList() {
    return goodsItems_;
  }
  /**
   * <pre>
   * 商品信息
   * </pre>
   *
   * <code>repeated .bilibili.app.dynamic.v2.GoodsItem goods_items = 2;</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.bapis.bilibili.app.dynamic.v2.GoodsItemOrBuilder> 
      getGoodsItemsOrBuilderList() {
    return goodsItems_;
  }
  /**
   * <pre>
   * 商品信息
   * </pre>
   *
   * <code>repeated .bilibili.app.dynamic.v2.GoodsItem goods_items = 2;</code>
   */
  @java.lang.Override
  public int getGoodsItemsCount() {
    return goodsItems_.size();
  }
  /**
   * <pre>
   * 商品信息
   * </pre>
   *
   * <code>repeated .bilibili.app.dynamic.v2.GoodsItem goods_items = 2;</code>
   */
  @java.lang.Override
  public com.bapis.bilibili.app.dynamic.v2.GoodsItem getGoodsItems(int index) {
    return goodsItems_.get(index);
  }
  /**
   * <pre>
   * 商品信息
   * </pre>
   *
   * <code>repeated .bilibili.app.dynamic.v2.GoodsItem goods_items = 2;</code>
   */
  @java.lang.Override
  public com.bapis.bilibili.app.dynamic.v2.GoodsItemOrBuilder getGoodsItemsOrBuilder(
      int index) {
    return goodsItems_.get(index);
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (!getRcmdDescBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, rcmdDesc_);
    }
    for (int i = 0; i < goodsItems_.size(); i++) {
      output.writeMessage(2, goodsItems_.get(i));
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getRcmdDescBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, rcmdDesc_);
    }
    for (int i = 0; i < goodsItems_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, goodsItems_.get(i));
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof com.bapis.bilibili.app.dynamic.v2.AdditionGoods)) {
      return super.equals(obj);
    }
    com.bapis.bilibili.app.dynamic.v2.AdditionGoods other = (com.bapis.bilibili.app.dynamic.v2.AdditionGoods) obj;

    if (!getRcmdDesc()
        .equals(other.getRcmdDesc())) return false;
    if (!getGoodsItemsList()
        .equals(other.getGoodsItemsList())) return false;
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + RCMD_DESC_FIELD_NUMBER;
    hash = (53 * hash) + getRcmdDesc().hashCode();
    if (getGoodsItemsCount() > 0) {
      hash = (37 * hash) + GOODS_ITEMS_FIELD_NUMBER;
      hash = (53 * hash) + getGoodsItemsList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.bapis.bilibili.app.dynamic.v2.AdditionGoods parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.bapis.bilibili.app.dynamic.v2.AdditionGoods parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.bapis.bilibili.app.dynamic.v2.AdditionGoods parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.bapis.bilibili.app.dynamic.v2.AdditionGoods parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.bapis.bilibili.app.dynamic.v2.AdditionGoods parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.bapis.bilibili.app.dynamic.v2.AdditionGoods parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.bapis.bilibili.app.dynamic.v2.AdditionGoods parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.bapis.bilibili.app.dynamic.v2.AdditionGoods parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.bapis.bilibili.app.dynamic.v2.AdditionGoods parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.bapis.bilibili.app.dynamic.v2.AdditionGoods parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.bapis.bilibili.app.dynamic.v2.AdditionGoods parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.bapis.bilibili.app.dynamic.v2.AdditionGoods parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.bapis.bilibili.app.dynamic.v2.AdditionGoods prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * <pre>
   * AdditionGoods 动态-附加卡-商品卡
   * </pre>
   *
   * Protobuf type {@code bilibili.app.dynamic.v2.AdditionGoods}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:bilibili.app.dynamic.v2.AdditionGoods)
      com.bapis.bilibili.app.dynamic.v2.AdditionGoodsOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.bapis.bilibili.app.dynamic.v2.DynamicOuterClass.internal_static_bilibili_app_dynamic_v2_AdditionGoods_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.bapis.bilibili.app.dynamic.v2.DynamicOuterClass.internal_static_bilibili_app_dynamic_v2_AdditionGoods_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.bapis.bilibili.app.dynamic.v2.AdditionGoods.class, com.bapis.bilibili.app.dynamic.v2.AdditionGoods.Builder.class);
    }

    // Construct using com.bapis.bilibili.app.dynamic.v2.AdditionGoods.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
        getGoodsItemsFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      rcmdDesc_ = "";

      if (goodsItemsBuilder_ == null) {
        goodsItems_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        goodsItemsBuilder_.clear();
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.bapis.bilibili.app.dynamic.v2.DynamicOuterClass.internal_static_bilibili_app_dynamic_v2_AdditionGoods_descriptor;
    }

    @java.lang.Override
    public com.bapis.bilibili.app.dynamic.v2.AdditionGoods getDefaultInstanceForType() {
      return com.bapis.bilibili.app.dynamic.v2.AdditionGoods.getDefaultInstance();
    }

    @java.lang.Override
    public com.bapis.bilibili.app.dynamic.v2.AdditionGoods build() {
      com.bapis.bilibili.app.dynamic.v2.AdditionGoods result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.bapis.bilibili.app.dynamic.v2.AdditionGoods buildPartial() {
      com.bapis.bilibili.app.dynamic.v2.AdditionGoods result = new com.bapis.bilibili.app.dynamic.v2.AdditionGoods(this);
      int from_bitField0_ = bitField0_;
      result.rcmdDesc_ = rcmdDesc_;
      if (goodsItemsBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          goodsItems_ = java.util.Collections.unmodifiableList(goodsItems_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.goodsItems_ = goodsItems_;
      } else {
        result.goodsItems_ = goodsItemsBuilder_.build();
      }
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.bapis.bilibili.app.dynamic.v2.AdditionGoods) {
        return mergeFrom((com.bapis.bilibili.app.dynamic.v2.AdditionGoods)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.bapis.bilibili.app.dynamic.v2.AdditionGoods other) {
      if (other == com.bapis.bilibili.app.dynamic.v2.AdditionGoods.getDefaultInstance()) return this;
      if (!other.getRcmdDesc().isEmpty()) {
        rcmdDesc_ = other.rcmdDesc_;
        onChanged();
      }
      if (goodsItemsBuilder_ == null) {
        if (!other.goodsItems_.isEmpty()) {
          if (goodsItems_.isEmpty()) {
            goodsItems_ = other.goodsItems_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureGoodsItemsIsMutable();
            goodsItems_.addAll(other.goodsItems_);
          }
          onChanged();
        }
      } else {
        if (!other.goodsItems_.isEmpty()) {
          if (goodsItemsBuilder_.isEmpty()) {
            goodsItemsBuilder_.dispose();
            goodsItemsBuilder_ = null;
            goodsItems_ = other.goodsItems_;
            bitField0_ = (bitField0_ & ~0x00000001);
            goodsItemsBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getGoodsItemsFieldBuilder() : null;
          } else {
            goodsItemsBuilder_.addAllMessages(other.goodsItems_);
          }
        }
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      com.bapis.bilibili.app.dynamic.v2.AdditionGoods parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.bapis.bilibili.app.dynamic.v2.AdditionGoods) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.lang.Object rcmdDesc_ = "";
    /**
     * <pre>
     * 推荐文案
     * </pre>
     *
     * <code>string rcmd_desc = 1;</code>
     * @return The rcmdDesc.
     */
    public java.lang.String getRcmdDesc() {
      java.lang.Object ref = rcmdDesc_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        rcmdDesc_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * 推荐文案
     * </pre>
     *
     * <code>string rcmd_desc = 1;</code>
     * @return The bytes for rcmdDesc.
     */
    public com.google.protobuf.ByteString
        getRcmdDescBytes() {
      java.lang.Object ref = rcmdDesc_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        rcmdDesc_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * 推荐文案
     * </pre>
     *
     * <code>string rcmd_desc = 1;</code>
     * @param value The rcmdDesc to set.
     * @return This builder for chaining.
     */
    public Builder setRcmdDesc(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      rcmdDesc_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 推荐文案
     * </pre>
     *
     * <code>string rcmd_desc = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearRcmdDesc() {
      
      rcmdDesc_ = getDefaultInstance().getRcmdDesc();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 推荐文案
     * </pre>
     *
     * <code>string rcmd_desc = 1;</code>
     * @param value The bytes for rcmdDesc to set.
     * @return This builder for chaining.
     */
    public Builder setRcmdDescBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      rcmdDesc_ = value;
      onChanged();
      return this;
    }

    private java.util.List<com.bapis.bilibili.app.dynamic.v2.GoodsItem> goodsItems_ =
      java.util.Collections.emptyList();
    private void ensureGoodsItemsIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        goodsItems_ = new java.util.ArrayList<com.bapis.bilibili.app.dynamic.v2.GoodsItem>(goodsItems_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.bapis.bilibili.app.dynamic.v2.GoodsItem, com.bapis.bilibili.app.dynamic.v2.GoodsItem.Builder, com.bapis.bilibili.app.dynamic.v2.GoodsItemOrBuilder> goodsItemsBuilder_;

    /**
     * <pre>
     * 商品信息
     * </pre>
     *
     * <code>repeated .bilibili.app.dynamic.v2.GoodsItem goods_items = 2;</code>
     */
    public java.util.List<com.bapis.bilibili.app.dynamic.v2.GoodsItem> getGoodsItemsList() {
      if (goodsItemsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(goodsItems_);
      } else {
        return goodsItemsBuilder_.getMessageList();
      }
    }
    /**
     * <pre>
     * 商品信息
     * </pre>
     *
     * <code>repeated .bilibili.app.dynamic.v2.GoodsItem goods_items = 2;</code>
     */
    public int getGoodsItemsCount() {
      if (goodsItemsBuilder_ == null) {
        return goodsItems_.size();
      } else {
        return goodsItemsBuilder_.getCount();
      }
    }
    /**
     * <pre>
     * 商品信息
     * </pre>
     *
     * <code>repeated .bilibili.app.dynamic.v2.GoodsItem goods_items = 2;</code>
     */
    public com.bapis.bilibili.app.dynamic.v2.GoodsItem getGoodsItems(int index) {
      if (goodsItemsBuilder_ == null) {
        return goodsItems_.get(index);
      } else {
        return goodsItemsBuilder_.getMessage(index);
      }
    }
    /**
     * <pre>
     * 商品信息
     * </pre>
     *
     * <code>repeated .bilibili.app.dynamic.v2.GoodsItem goods_items = 2;</code>
     */
    public Builder setGoodsItems(
        int index, com.bapis.bilibili.app.dynamic.v2.GoodsItem value) {
      if (goodsItemsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureGoodsItemsIsMutable();
        goodsItems_.set(index, value);
        onChanged();
      } else {
        goodsItemsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * 商品信息
     * </pre>
     *
     * <code>repeated .bilibili.app.dynamic.v2.GoodsItem goods_items = 2;</code>
     */
    public Builder setGoodsItems(
        int index, com.bapis.bilibili.app.dynamic.v2.GoodsItem.Builder builderForValue) {
      if (goodsItemsBuilder_ == null) {
        ensureGoodsItemsIsMutable();
        goodsItems_.set(index, builderForValue.build());
        onChanged();
      } else {
        goodsItemsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * 商品信息
     * </pre>
     *
     * <code>repeated .bilibili.app.dynamic.v2.GoodsItem goods_items = 2;</code>
     */
    public Builder addGoodsItems(com.bapis.bilibili.app.dynamic.v2.GoodsItem value) {
      if (goodsItemsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureGoodsItemsIsMutable();
        goodsItems_.add(value);
        onChanged();
      } else {
        goodsItemsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <pre>
     * 商品信息
     * </pre>
     *
     * <code>repeated .bilibili.app.dynamic.v2.GoodsItem goods_items = 2;</code>
     */
    public Builder addGoodsItems(
        int index, com.bapis.bilibili.app.dynamic.v2.GoodsItem value) {
      if (goodsItemsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureGoodsItemsIsMutable();
        goodsItems_.add(index, value);
        onChanged();
      } else {
        goodsItemsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * 商品信息
     * </pre>
     *
     * <code>repeated .bilibili.app.dynamic.v2.GoodsItem goods_items = 2;</code>
     */
    public Builder addGoodsItems(
        com.bapis.bilibili.app.dynamic.v2.GoodsItem.Builder builderForValue) {
      if (goodsItemsBuilder_ == null) {
        ensureGoodsItemsIsMutable();
        goodsItems_.add(builderForValue.build());
        onChanged();
      } else {
        goodsItemsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * 商品信息
     * </pre>
     *
     * <code>repeated .bilibili.app.dynamic.v2.GoodsItem goods_items = 2;</code>
     */
    public Builder addGoodsItems(
        int index, com.bapis.bilibili.app.dynamic.v2.GoodsItem.Builder builderForValue) {
      if (goodsItemsBuilder_ == null) {
        ensureGoodsItemsIsMutable();
        goodsItems_.add(index, builderForValue.build());
        onChanged();
      } else {
        goodsItemsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * 商品信息
     * </pre>
     *
     * <code>repeated .bilibili.app.dynamic.v2.GoodsItem goods_items = 2;</code>
     */
    public Builder addAllGoodsItems(
        java.lang.Iterable<? extends com.bapis.bilibili.app.dynamic.v2.GoodsItem> values) {
      if (goodsItemsBuilder_ == null) {
        ensureGoodsItemsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, goodsItems_);
        onChanged();
      } else {
        goodsItemsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <pre>
     * 商品信息
     * </pre>
     *
     * <code>repeated .bilibili.app.dynamic.v2.GoodsItem goods_items = 2;</code>
     */
    public Builder clearGoodsItems() {
      if (goodsItemsBuilder_ == null) {
        goodsItems_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        goodsItemsBuilder_.clear();
      }
      return this;
    }
    /**
     * <pre>
     * 商品信息
     * </pre>
     *
     * <code>repeated .bilibili.app.dynamic.v2.GoodsItem goods_items = 2;</code>
     */
    public Builder removeGoodsItems(int index) {
      if (goodsItemsBuilder_ == null) {
        ensureGoodsItemsIsMutable();
        goodsItems_.remove(index);
        onChanged();
      } else {
        goodsItemsBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <pre>
     * 商品信息
     * </pre>
     *
     * <code>repeated .bilibili.app.dynamic.v2.GoodsItem goods_items = 2;</code>
     */
    public com.bapis.bilibili.app.dynamic.v2.GoodsItem.Builder getGoodsItemsBuilder(
        int index) {
      return getGoodsItemsFieldBuilder().getBuilder(index);
    }
    /**
     * <pre>
     * 商品信息
     * </pre>
     *
     * <code>repeated .bilibili.app.dynamic.v2.GoodsItem goods_items = 2;</code>
     */
    public com.bapis.bilibili.app.dynamic.v2.GoodsItemOrBuilder getGoodsItemsOrBuilder(
        int index) {
      if (goodsItemsBuilder_ == null) {
        return goodsItems_.get(index);  } else {
        return goodsItemsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <pre>
     * 商品信息
     * </pre>
     *
     * <code>repeated .bilibili.app.dynamic.v2.GoodsItem goods_items = 2;</code>
     */
    public java.util.List<? extends com.bapis.bilibili.app.dynamic.v2.GoodsItemOrBuilder> 
         getGoodsItemsOrBuilderList() {
      if (goodsItemsBuilder_ != null) {
        return goodsItemsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(goodsItems_);
      }
    }
    /**
     * <pre>
     * 商品信息
     * </pre>
     *
     * <code>repeated .bilibili.app.dynamic.v2.GoodsItem goods_items = 2;</code>
     */
    public com.bapis.bilibili.app.dynamic.v2.GoodsItem.Builder addGoodsItemsBuilder() {
      return getGoodsItemsFieldBuilder().addBuilder(
          com.bapis.bilibili.app.dynamic.v2.GoodsItem.getDefaultInstance());
    }
    /**
     * <pre>
     * 商品信息
     * </pre>
     *
     * <code>repeated .bilibili.app.dynamic.v2.GoodsItem goods_items = 2;</code>
     */
    public com.bapis.bilibili.app.dynamic.v2.GoodsItem.Builder addGoodsItemsBuilder(
        int index) {
      return getGoodsItemsFieldBuilder().addBuilder(
          index, com.bapis.bilibili.app.dynamic.v2.GoodsItem.getDefaultInstance());
    }
    /**
     * <pre>
     * 商品信息
     * </pre>
     *
     * <code>repeated .bilibili.app.dynamic.v2.GoodsItem goods_items = 2;</code>
     */
    public java.util.List<com.bapis.bilibili.app.dynamic.v2.GoodsItem.Builder> 
         getGoodsItemsBuilderList() {
      return getGoodsItemsFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.bapis.bilibili.app.dynamic.v2.GoodsItem, com.bapis.bilibili.app.dynamic.v2.GoodsItem.Builder, com.bapis.bilibili.app.dynamic.v2.GoodsItemOrBuilder> 
        getGoodsItemsFieldBuilder() {
      if (goodsItemsBuilder_ == null) {
        goodsItemsBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.bapis.bilibili.app.dynamic.v2.GoodsItem, com.bapis.bilibili.app.dynamic.v2.GoodsItem.Builder, com.bapis.bilibili.app.dynamic.v2.GoodsItemOrBuilder>(
                goodsItems_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        goodsItems_ = null;
      }
      return goodsItemsBuilder_;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:bilibili.app.dynamic.v2.AdditionGoods)
  }

  // @@protoc_insertion_point(class_scope:bilibili.app.dynamic.v2.AdditionGoods)
  private static final com.bapis.bilibili.app.dynamic.v2.AdditionGoods DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.bapis.bilibili.app.dynamic.v2.AdditionGoods();
  }

  public static com.bapis.bilibili.app.dynamic.v2.AdditionGoods getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<AdditionGoods>
      PARSER = new com.google.protobuf.AbstractParser<AdditionGoods>() {
    @java.lang.Override
    public AdditionGoods parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new AdditionGoods(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<AdditionGoods> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<AdditionGoods> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.bapis.bilibili.app.dynamic.v2.AdditionGoods getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

