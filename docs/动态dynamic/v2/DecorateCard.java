// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: bilibili/app/dynamic/v2/dynamic.proto

package com.bapis.bilibili.app.dynamic.v2;

/**
 * <pre>
 * DecorateCard 装扮卡片
 * </pre>
 *
 * Protobuf type {@code bilibili.app.dynamic.v2.DecorateCard}
 */
public final class DecorateCard extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:bilibili.app.dynamic.v2.DecorateCard)
    DecorateCardOrBuilder {
private static final long serialVersionUID = 0L;
  // Use DecorateCard.newBuilder() to construct.
  private DecorateCard(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private DecorateCard() {
    cardUrl_ = "";
    jumpUrl_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new DecorateCard();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private DecorateCard(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
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
          case 8: {

            id_ = input.readInt64();
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            cardUrl_ = s;
            break;
          }
          case 26: {
            java.lang.String s = input.readStringRequireUtf8();

            jumpUrl_ = s;
            break;
          }
          case 34: {
            com.bapis.bilibili.app.dynamic.v2.DecoCardFan.Builder subBuilder = null;
            if (fan_ != null) {
              subBuilder = fan_.toBuilder();
            }
            fan_ = input.readMessage(com.bapis.bilibili.app.dynamic.v2.DecoCardFan.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(fan_);
              fan_ = subBuilder.buildPartial();
            }

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
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.bapis.bilibili.app.dynamic.v2.DynamicOuterClass.internal_static_bilibili_app_dynamic_v2_DecorateCard_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.bapis.bilibili.app.dynamic.v2.DynamicOuterClass.internal_static_bilibili_app_dynamic_v2_DecorateCard_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.bapis.bilibili.app.dynamic.v2.DecorateCard.class, com.bapis.bilibili.app.dynamic.v2.DecorateCard.Builder.class);
  }

  public static final int ID_FIELD_NUMBER = 1;
  private long id_;
  /**
   * <pre>
   * 装扮卡片id
   * </pre>
   *
   * <code>int64 id = 1;</code>
   * @return The id.
   */
  @java.lang.Override
  public long getId() {
    return id_;
  }

  public static final int CARD_URL_FIELD_NUMBER = 2;
  private volatile java.lang.Object cardUrl_;
  /**
   * <pre>
   * 装扮卡片链接
   * </pre>
   *
   * <code>string card_url = 2;</code>
   * @return The cardUrl.
   */
  @java.lang.Override
  public java.lang.String getCardUrl() {
    java.lang.Object ref = cardUrl_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      cardUrl_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * 装扮卡片链接
   * </pre>
   *
   * <code>string card_url = 2;</code>
   * @return The bytes for cardUrl.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getCardUrlBytes() {
    java.lang.Object ref = cardUrl_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      cardUrl_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int JUMP_URL_FIELD_NUMBER = 3;
  private volatile java.lang.Object jumpUrl_;
  /**
   * <pre>
   * 装扮卡片点击跳转链接
   * </pre>
   *
   * <code>string jump_url = 3;</code>
   * @return The jumpUrl.
   */
  @java.lang.Override
  public java.lang.String getJumpUrl() {
    java.lang.Object ref = jumpUrl_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      jumpUrl_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * 装扮卡片点击跳转链接
   * </pre>
   *
   * <code>string jump_url = 3;</code>
   * @return The bytes for jumpUrl.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getJumpUrlBytes() {
    java.lang.Object ref = jumpUrl_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      jumpUrl_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int FAN_FIELD_NUMBER = 4;
  private com.bapis.bilibili.app.dynamic.v2.DecoCardFan fan_;
  /**
   * <pre>
   * 粉丝样式
   * </pre>
   *
   * <code>.bilibili.app.dynamic.v2.DecoCardFan fan = 4;</code>
   * @return Whether the fan field is set.
   */
  @java.lang.Override
  public boolean hasFan() {
    return fan_ != null;
  }
  /**
   * <pre>
   * 粉丝样式
   * </pre>
   *
   * <code>.bilibili.app.dynamic.v2.DecoCardFan fan = 4;</code>
   * @return The fan.
   */
  @java.lang.Override
  public com.bapis.bilibili.app.dynamic.v2.DecoCardFan getFan() {
    return fan_ == null ? com.bapis.bilibili.app.dynamic.v2.DecoCardFan.getDefaultInstance() : fan_;
  }
  /**
   * <pre>
   * 粉丝样式
   * </pre>
   *
   * <code>.bilibili.app.dynamic.v2.DecoCardFan fan = 4;</code>
   */
  @java.lang.Override
  public com.bapis.bilibili.app.dynamic.v2.DecoCardFanOrBuilder getFanOrBuilder() {
    return getFan();
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
    if (id_ != 0L) {
      output.writeInt64(1, id_);
    }
    if (!getCardUrlBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, cardUrl_);
    }
    if (!getJumpUrlBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, jumpUrl_);
    }
    if (fan_ != null) {
      output.writeMessage(4, getFan());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (id_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(1, id_);
    }
    if (!getCardUrlBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, cardUrl_);
    }
    if (!getJumpUrlBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, jumpUrl_);
    }
    if (fan_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(4, getFan());
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
    if (!(obj instanceof com.bapis.bilibili.app.dynamic.v2.DecorateCard)) {
      return super.equals(obj);
    }
    com.bapis.bilibili.app.dynamic.v2.DecorateCard other = (com.bapis.bilibili.app.dynamic.v2.DecorateCard) obj;

    if (getId()
        != other.getId()) return false;
    if (!getCardUrl()
        .equals(other.getCardUrl())) return false;
    if (!getJumpUrl()
        .equals(other.getJumpUrl())) return false;
    if (hasFan() != other.hasFan()) return false;
    if (hasFan()) {
      if (!getFan()
          .equals(other.getFan())) return false;
    }
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
    hash = (37 * hash) + ID_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getId());
    hash = (37 * hash) + CARD_URL_FIELD_NUMBER;
    hash = (53 * hash) + getCardUrl().hashCode();
    hash = (37 * hash) + JUMP_URL_FIELD_NUMBER;
    hash = (53 * hash) + getJumpUrl().hashCode();
    if (hasFan()) {
      hash = (37 * hash) + FAN_FIELD_NUMBER;
      hash = (53 * hash) + getFan().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.bapis.bilibili.app.dynamic.v2.DecorateCard parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.bapis.bilibili.app.dynamic.v2.DecorateCard parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.bapis.bilibili.app.dynamic.v2.DecorateCard parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.bapis.bilibili.app.dynamic.v2.DecorateCard parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.bapis.bilibili.app.dynamic.v2.DecorateCard parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.bapis.bilibili.app.dynamic.v2.DecorateCard parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.bapis.bilibili.app.dynamic.v2.DecorateCard parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.bapis.bilibili.app.dynamic.v2.DecorateCard parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.bapis.bilibili.app.dynamic.v2.DecorateCard parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.bapis.bilibili.app.dynamic.v2.DecorateCard parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.bapis.bilibili.app.dynamic.v2.DecorateCard parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.bapis.bilibili.app.dynamic.v2.DecorateCard parseFrom(
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
  public static Builder newBuilder(com.bapis.bilibili.app.dynamic.v2.DecorateCard prototype) {
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
   * DecorateCard 装扮卡片
   * </pre>
   *
   * Protobuf type {@code bilibili.app.dynamic.v2.DecorateCard}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:bilibili.app.dynamic.v2.DecorateCard)
      com.bapis.bilibili.app.dynamic.v2.DecorateCardOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.bapis.bilibili.app.dynamic.v2.DynamicOuterClass.internal_static_bilibili_app_dynamic_v2_DecorateCard_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.bapis.bilibili.app.dynamic.v2.DynamicOuterClass.internal_static_bilibili_app_dynamic_v2_DecorateCard_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.bapis.bilibili.app.dynamic.v2.DecorateCard.class, com.bapis.bilibili.app.dynamic.v2.DecorateCard.Builder.class);
    }

    // Construct using com.bapis.bilibili.app.dynamic.v2.DecorateCard.newBuilder()
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
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      id_ = 0L;

      cardUrl_ = "";

      jumpUrl_ = "";

      if (fanBuilder_ == null) {
        fan_ = null;
      } else {
        fan_ = null;
        fanBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.bapis.bilibili.app.dynamic.v2.DynamicOuterClass.internal_static_bilibili_app_dynamic_v2_DecorateCard_descriptor;
    }

    @java.lang.Override
    public com.bapis.bilibili.app.dynamic.v2.DecorateCard getDefaultInstanceForType() {
      return com.bapis.bilibili.app.dynamic.v2.DecorateCard.getDefaultInstance();
    }

    @java.lang.Override
    public com.bapis.bilibili.app.dynamic.v2.DecorateCard build() {
      com.bapis.bilibili.app.dynamic.v2.DecorateCard result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.bapis.bilibili.app.dynamic.v2.DecorateCard buildPartial() {
      com.bapis.bilibili.app.dynamic.v2.DecorateCard result = new com.bapis.bilibili.app.dynamic.v2.DecorateCard(this);
      result.id_ = id_;
      result.cardUrl_ = cardUrl_;
      result.jumpUrl_ = jumpUrl_;
      if (fanBuilder_ == null) {
        result.fan_ = fan_;
      } else {
        result.fan_ = fanBuilder_.build();
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
      if (other instanceof com.bapis.bilibili.app.dynamic.v2.DecorateCard) {
        return mergeFrom((com.bapis.bilibili.app.dynamic.v2.DecorateCard)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.bapis.bilibili.app.dynamic.v2.DecorateCard other) {
      if (other == com.bapis.bilibili.app.dynamic.v2.DecorateCard.getDefaultInstance()) return this;
      if (other.getId() != 0L) {
        setId(other.getId());
      }
      if (!other.getCardUrl().isEmpty()) {
        cardUrl_ = other.cardUrl_;
        onChanged();
      }
      if (!other.getJumpUrl().isEmpty()) {
        jumpUrl_ = other.jumpUrl_;
        onChanged();
      }
      if (other.hasFan()) {
        mergeFan(other.getFan());
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
      com.bapis.bilibili.app.dynamic.v2.DecorateCard parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.bapis.bilibili.app.dynamic.v2.DecorateCard) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private long id_ ;
    /**
     * <pre>
     * 装扮卡片id
     * </pre>
     *
     * <code>int64 id = 1;</code>
     * @return The id.
     */
    @java.lang.Override
    public long getId() {
      return id_;
    }
    /**
     * <pre>
     * 装扮卡片id
     * </pre>
     *
     * <code>int64 id = 1;</code>
     * @param value The id to set.
     * @return This builder for chaining.
     */
    public Builder setId(long value) {
      
      id_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 装扮卡片id
     * </pre>
     *
     * <code>int64 id = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearId() {
      
      id_ = 0L;
      onChanged();
      return this;
    }

    private java.lang.Object cardUrl_ = "";
    /**
     * <pre>
     * 装扮卡片链接
     * </pre>
     *
     * <code>string card_url = 2;</code>
     * @return The cardUrl.
     */
    public java.lang.String getCardUrl() {
      java.lang.Object ref = cardUrl_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        cardUrl_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * 装扮卡片链接
     * </pre>
     *
     * <code>string card_url = 2;</code>
     * @return The bytes for cardUrl.
     */
    public com.google.protobuf.ByteString
        getCardUrlBytes() {
      java.lang.Object ref = cardUrl_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        cardUrl_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * 装扮卡片链接
     * </pre>
     *
     * <code>string card_url = 2;</code>
     * @param value The cardUrl to set.
     * @return This builder for chaining.
     */
    public Builder setCardUrl(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      cardUrl_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 装扮卡片链接
     * </pre>
     *
     * <code>string card_url = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearCardUrl() {
      
      cardUrl_ = getDefaultInstance().getCardUrl();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 装扮卡片链接
     * </pre>
     *
     * <code>string card_url = 2;</code>
     * @param value The bytes for cardUrl to set.
     * @return This builder for chaining.
     */
    public Builder setCardUrlBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      cardUrl_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object jumpUrl_ = "";
    /**
     * <pre>
     * 装扮卡片点击跳转链接
     * </pre>
     *
     * <code>string jump_url = 3;</code>
     * @return The jumpUrl.
     */
    public java.lang.String getJumpUrl() {
      java.lang.Object ref = jumpUrl_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        jumpUrl_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * 装扮卡片点击跳转链接
     * </pre>
     *
     * <code>string jump_url = 3;</code>
     * @return The bytes for jumpUrl.
     */
    public com.google.protobuf.ByteString
        getJumpUrlBytes() {
      java.lang.Object ref = jumpUrl_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        jumpUrl_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * 装扮卡片点击跳转链接
     * </pre>
     *
     * <code>string jump_url = 3;</code>
     * @param value The jumpUrl to set.
     * @return This builder for chaining.
     */
    public Builder setJumpUrl(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      jumpUrl_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 装扮卡片点击跳转链接
     * </pre>
     *
     * <code>string jump_url = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearJumpUrl() {
      
      jumpUrl_ = getDefaultInstance().getJumpUrl();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 装扮卡片点击跳转链接
     * </pre>
     *
     * <code>string jump_url = 3;</code>
     * @param value The bytes for jumpUrl to set.
     * @return This builder for chaining.
     */
    public Builder setJumpUrlBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      jumpUrl_ = value;
      onChanged();
      return this;
    }

    private com.bapis.bilibili.app.dynamic.v2.DecoCardFan fan_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.bapis.bilibili.app.dynamic.v2.DecoCardFan, com.bapis.bilibili.app.dynamic.v2.DecoCardFan.Builder, com.bapis.bilibili.app.dynamic.v2.DecoCardFanOrBuilder> fanBuilder_;
    /**
     * <pre>
     * 粉丝样式
     * </pre>
     *
     * <code>.bilibili.app.dynamic.v2.DecoCardFan fan = 4;</code>
     * @return Whether the fan field is set.
     */
    public boolean hasFan() {
      return fanBuilder_ != null || fan_ != null;
    }
    /**
     * <pre>
     * 粉丝样式
     * </pre>
     *
     * <code>.bilibili.app.dynamic.v2.DecoCardFan fan = 4;</code>
     * @return The fan.
     */
    public com.bapis.bilibili.app.dynamic.v2.DecoCardFan getFan() {
      if (fanBuilder_ == null) {
        return fan_ == null ? com.bapis.bilibili.app.dynamic.v2.DecoCardFan.getDefaultInstance() : fan_;
      } else {
        return fanBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * 粉丝样式
     * </pre>
     *
     * <code>.bilibili.app.dynamic.v2.DecoCardFan fan = 4;</code>
     */
    public Builder setFan(com.bapis.bilibili.app.dynamic.v2.DecoCardFan value) {
      if (fanBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        fan_ = value;
        onChanged();
      } else {
        fanBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * 粉丝样式
     * </pre>
     *
     * <code>.bilibili.app.dynamic.v2.DecoCardFan fan = 4;</code>
     */
    public Builder setFan(
        com.bapis.bilibili.app.dynamic.v2.DecoCardFan.Builder builderForValue) {
      if (fanBuilder_ == null) {
        fan_ = builderForValue.build();
        onChanged();
      } else {
        fanBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * 粉丝样式
     * </pre>
     *
     * <code>.bilibili.app.dynamic.v2.DecoCardFan fan = 4;</code>
     */
    public Builder mergeFan(com.bapis.bilibili.app.dynamic.v2.DecoCardFan value) {
      if (fanBuilder_ == null) {
        if (fan_ != null) {
          fan_ =
            com.bapis.bilibili.app.dynamic.v2.DecoCardFan.newBuilder(fan_).mergeFrom(value).buildPartial();
        } else {
          fan_ = value;
        }
        onChanged();
      } else {
        fanBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * 粉丝样式
     * </pre>
     *
     * <code>.bilibili.app.dynamic.v2.DecoCardFan fan = 4;</code>
     */
    public Builder clearFan() {
      if (fanBuilder_ == null) {
        fan_ = null;
        onChanged();
      } else {
        fan_ = null;
        fanBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * 粉丝样式
     * </pre>
     *
     * <code>.bilibili.app.dynamic.v2.DecoCardFan fan = 4;</code>
     */
    public com.bapis.bilibili.app.dynamic.v2.DecoCardFan.Builder getFanBuilder() {
      
      onChanged();
      return getFanFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * 粉丝样式
     * </pre>
     *
     * <code>.bilibili.app.dynamic.v2.DecoCardFan fan = 4;</code>
     */
    public com.bapis.bilibili.app.dynamic.v2.DecoCardFanOrBuilder getFanOrBuilder() {
      if (fanBuilder_ != null) {
        return fanBuilder_.getMessageOrBuilder();
      } else {
        return fan_ == null ?
            com.bapis.bilibili.app.dynamic.v2.DecoCardFan.getDefaultInstance() : fan_;
      }
    }
    /**
     * <pre>
     * 粉丝样式
     * </pre>
     *
     * <code>.bilibili.app.dynamic.v2.DecoCardFan fan = 4;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.bapis.bilibili.app.dynamic.v2.DecoCardFan, com.bapis.bilibili.app.dynamic.v2.DecoCardFan.Builder, com.bapis.bilibili.app.dynamic.v2.DecoCardFanOrBuilder> 
        getFanFieldBuilder() {
      if (fanBuilder_ == null) {
        fanBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.bapis.bilibili.app.dynamic.v2.DecoCardFan, com.bapis.bilibili.app.dynamic.v2.DecoCardFan.Builder, com.bapis.bilibili.app.dynamic.v2.DecoCardFanOrBuilder>(
                getFan(),
                getParentForChildren(),
                isClean());
        fan_ = null;
      }
      return fanBuilder_;
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


    // @@protoc_insertion_point(builder_scope:bilibili.app.dynamic.v2.DecorateCard)
  }

  // @@protoc_insertion_point(class_scope:bilibili.app.dynamic.v2.DecorateCard)
  private static final com.bapis.bilibili.app.dynamic.v2.DecorateCard DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.bapis.bilibili.app.dynamic.v2.DecorateCard();
  }

  public static com.bapis.bilibili.app.dynamic.v2.DecorateCard getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<DecorateCard>
      PARSER = new com.google.protobuf.AbstractParser<DecorateCard>() {
    @java.lang.Override
    public DecorateCard parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new DecorateCard(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<DecorateCard> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<DecorateCard> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.bapis.bilibili.app.dynamic.v2.DecorateCard getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

