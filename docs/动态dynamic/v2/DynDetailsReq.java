// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: bilibili/app/dynamic/v2/dynamic.proto

package com.bapis.bilibili.app.dynamic.v2;

/**
 * <pre>
 * DynDetailsReq 批量动态id获取动态详情请求参数
 * </pre>
 *
 * Protobuf type {@code bilibili.app.dynamic.v2.DynDetailsReq}
 */
public final class DynDetailsReq extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:bilibili.app.dynamic.v2.DynDetailsReq)
    DynDetailsReqOrBuilder {
private static final long serialVersionUID = 0L;
  // Use DynDetailsReq.newBuilder() to construct.
  private DynDetailsReq(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private DynDetailsReq() {
    dynamicIds_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new DynDetailsReq();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private DynDetailsReq(
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
          case 10: {
            java.lang.String s = input.readStringRequireUtf8();

            dynamicIds_ = s;
            break;
          }
          case 18: {
            com.bapis.bilibili.app.dynamic.v2.PlayurlParam.Builder subBuilder = null;
            if (playurlParam_ != null) {
              subBuilder = playurlParam_.toBuilder();
            }
            playurlParam_ = input.readMessage(com.bapis.bilibili.app.dynamic.v2.PlayurlParam.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(playurlParam_);
              playurlParam_ = subBuilder.buildPartial();
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
    return com.bapis.bilibili.app.dynamic.v2.DynamicOuterClass.internal_static_bilibili_app_dynamic_v2_DynDetailsReq_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.bapis.bilibili.app.dynamic.v2.DynamicOuterClass.internal_static_bilibili_app_dynamic_v2_DynDetailsReq_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.bapis.bilibili.app.dynamic.v2.DynDetailsReq.class, com.bapis.bilibili.app.dynamic.v2.DynDetailsReq.Builder.class);
  }

  public static final int DYNAMIC_IDS_FIELD_NUMBER = 1;
  private volatile java.lang.Object dynamicIds_;
  /**
   * <pre>
   * 动态id
   * </pre>
   *
   * <code>string dynamic_ids = 1;</code>
   * @return The dynamicIds.
   */
  @java.lang.Override
  public java.lang.String getDynamicIds() {
    java.lang.Object ref = dynamicIds_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      dynamicIds_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * 动态id
   * </pre>
   *
   * <code>string dynamic_ids = 1;</code>
   * @return The bytes for dynamicIds.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getDynamicIdsBytes() {
    java.lang.Object ref = dynamicIds_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      dynamicIds_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int PLAYURL_PARAM_FIELD_NUMBER = 2;
  private com.bapis.bilibili.app.dynamic.v2.PlayurlParam playurlParam_;
  /**
   * <pre>
   * 秒开参数
   * </pre>
   *
   * <code>.bilibili.app.dynamic.v2.PlayurlParam playurl_param = 2;</code>
   * @return Whether the playurlParam field is set.
   */
  @java.lang.Override
  public boolean hasPlayurlParam() {
    return playurlParam_ != null;
  }
  /**
   * <pre>
   * 秒开参数
   * </pre>
   *
   * <code>.bilibili.app.dynamic.v2.PlayurlParam playurl_param = 2;</code>
   * @return The playurlParam.
   */
  @java.lang.Override
  public com.bapis.bilibili.app.dynamic.v2.PlayurlParam getPlayurlParam() {
    return playurlParam_ == null ? com.bapis.bilibili.app.dynamic.v2.PlayurlParam.getDefaultInstance() : playurlParam_;
  }
  /**
   * <pre>
   * 秒开参数
   * </pre>
   *
   * <code>.bilibili.app.dynamic.v2.PlayurlParam playurl_param = 2;</code>
   */
  @java.lang.Override
  public com.bapis.bilibili.app.dynamic.v2.PlayurlParamOrBuilder getPlayurlParamOrBuilder() {
    return getPlayurlParam();
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
    if (!getDynamicIdsBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, dynamicIds_);
    }
    if (playurlParam_ != null) {
      output.writeMessage(2, getPlayurlParam());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getDynamicIdsBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, dynamicIds_);
    }
    if (playurlParam_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getPlayurlParam());
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
    if (!(obj instanceof com.bapis.bilibili.app.dynamic.v2.DynDetailsReq)) {
      return super.equals(obj);
    }
    com.bapis.bilibili.app.dynamic.v2.DynDetailsReq other = (com.bapis.bilibili.app.dynamic.v2.DynDetailsReq) obj;

    if (!getDynamicIds()
        .equals(other.getDynamicIds())) return false;
    if (hasPlayurlParam() != other.hasPlayurlParam()) return false;
    if (hasPlayurlParam()) {
      if (!getPlayurlParam()
          .equals(other.getPlayurlParam())) return false;
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
    hash = (37 * hash) + DYNAMIC_IDS_FIELD_NUMBER;
    hash = (53 * hash) + getDynamicIds().hashCode();
    if (hasPlayurlParam()) {
      hash = (37 * hash) + PLAYURL_PARAM_FIELD_NUMBER;
      hash = (53 * hash) + getPlayurlParam().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.bapis.bilibili.app.dynamic.v2.DynDetailsReq parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.bapis.bilibili.app.dynamic.v2.DynDetailsReq parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.bapis.bilibili.app.dynamic.v2.DynDetailsReq parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.bapis.bilibili.app.dynamic.v2.DynDetailsReq parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.bapis.bilibili.app.dynamic.v2.DynDetailsReq parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.bapis.bilibili.app.dynamic.v2.DynDetailsReq parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.bapis.bilibili.app.dynamic.v2.DynDetailsReq parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.bapis.bilibili.app.dynamic.v2.DynDetailsReq parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.bapis.bilibili.app.dynamic.v2.DynDetailsReq parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.bapis.bilibili.app.dynamic.v2.DynDetailsReq parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.bapis.bilibili.app.dynamic.v2.DynDetailsReq parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.bapis.bilibili.app.dynamic.v2.DynDetailsReq parseFrom(
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
  public static Builder newBuilder(com.bapis.bilibili.app.dynamic.v2.DynDetailsReq prototype) {
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
   * DynDetailsReq 批量动态id获取动态详情请求参数
   * </pre>
   *
   * Protobuf type {@code bilibili.app.dynamic.v2.DynDetailsReq}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:bilibili.app.dynamic.v2.DynDetailsReq)
      com.bapis.bilibili.app.dynamic.v2.DynDetailsReqOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.bapis.bilibili.app.dynamic.v2.DynamicOuterClass.internal_static_bilibili_app_dynamic_v2_DynDetailsReq_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.bapis.bilibili.app.dynamic.v2.DynamicOuterClass.internal_static_bilibili_app_dynamic_v2_DynDetailsReq_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.bapis.bilibili.app.dynamic.v2.DynDetailsReq.class, com.bapis.bilibili.app.dynamic.v2.DynDetailsReq.Builder.class);
    }

    // Construct using com.bapis.bilibili.app.dynamic.v2.DynDetailsReq.newBuilder()
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
      dynamicIds_ = "";

      if (playurlParamBuilder_ == null) {
        playurlParam_ = null;
      } else {
        playurlParam_ = null;
        playurlParamBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.bapis.bilibili.app.dynamic.v2.DynamicOuterClass.internal_static_bilibili_app_dynamic_v2_DynDetailsReq_descriptor;
    }

    @java.lang.Override
    public com.bapis.bilibili.app.dynamic.v2.DynDetailsReq getDefaultInstanceForType() {
      return com.bapis.bilibili.app.dynamic.v2.DynDetailsReq.getDefaultInstance();
    }

    @java.lang.Override
    public com.bapis.bilibili.app.dynamic.v2.DynDetailsReq build() {
      com.bapis.bilibili.app.dynamic.v2.DynDetailsReq result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.bapis.bilibili.app.dynamic.v2.DynDetailsReq buildPartial() {
      com.bapis.bilibili.app.dynamic.v2.DynDetailsReq result = new com.bapis.bilibili.app.dynamic.v2.DynDetailsReq(this);
      result.dynamicIds_ = dynamicIds_;
      if (playurlParamBuilder_ == null) {
        result.playurlParam_ = playurlParam_;
      } else {
        result.playurlParam_ = playurlParamBuilder_.build();
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
      if (other instanceof com.bapis.bilibili.app.dynamic.v2.DynDetailsReq) {
        return mergeFrom((com.bapis.bilibili.app.dynamic.v2.DynDetailsReq)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.bapis.bilibili.app.dynamic.v2.DynDetailsReq other) {
      if (other == com.bapis.bilibili.app.dynamic.v2.DynDetailsReq.getDefaultInstance()) return this;
      if (!other.getDynamicIds().isEmpty()) {
        dynamicIds_ = other.dynamicIds_;
        onChanged();
      }
      if (other.hasPlayurlParam()) {
        mergePlayurlParam(other.getPlayurlParam());
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
      com.bapis.bilibili.app.dynamic.v2.DynDetailsReq parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.bapis.bilibili.app.dynamic.v2.DynDetailsReq) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object dynamicIds_ = "";
    /**
     * <pre>
     * 动态id
     * </pre>
     *
     * <code>string dynamic_ids = 1;</code>
     * @return The dynamicIds.
     */
    public java.lang.String getDynamicIds() {
      java.lang.Object ref = dynamicIds_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        dynamicIds_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * 动态id
     * </pre>
     *
     * <code>string dynamic_ids = 1;</code>
     * @return The bytes for dynamicIds.
     */
    public com.google.protobuf.ByteString
        getDynamicIdsBytes() {
      java.lang.Object ref = dynamicIds_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        dynamicIds_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * 动态id
     * </pre>
     *
     * <code>string dynamic_ids = 1;</code>
     * @param value The dynamicIds to set.
     * @return This builder for chaining.
     */
    public Builder setDynamicIds(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      dynamicIds_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 动态id
     * </pre>
     *
     * <code>string dynamic_ids = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearDynamicIds() {
      
      dynamicIds_ = getDefaultInstance().getDynamicIds();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 动态id
     * </pre>
     *
     * <code>string dynamic_ids = 1;</code>
     * @param value The bytes for dynamicIds to set.
     * @return This builder for chaining.
     */
    public Builder setDynamicIdsBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      dynamicIds_ = value;
      onChanged();
      return this;
    }

    private com.bapis.bilibili.app.dynamic.v2.PlayurlParam playurlParam_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.bapis.bilibili.app.dynamic.v2.PlayurlParam, com.bapis.bilibili.app.dynamic.v2.PlayurlParam.Builder, com.bapis.bilibili.app.dynamic.v2.PlayurlParamOrBuilder> playurlParamBuilder_;
    /**
     * <pre>
     * 秒开参数
     * </pre>
     *
     * <code>.bilibili.app.dynamic.v2.PlayurlParam playurl_param = 2;</code>
     * @return Whether the playurlParam field is set.
     */
    public boolean hasPlayurlParam() {
      return playurlParamBuilder_ != null || playurlParam_ != null;
    }
    /**
     * <pre>
     * 秒开参数
     * </pre>
     *
     * <code>.bilibili.app.dynamic.v2.PlayurlParam playurl_param = 2;</code>
     * @return The playurlParam.
     */
    public com.bapis.bilibili.app.dynamic.v2.PlayurlParam getPlayurlParam() {
      if (playurlParamBuilder_ == null) {
        return playurlParam_ == null ? com.bapis.bilibili.app.dynamic.v2.PlayurlParam.getDefaultInstance() : playurlParam_;
      } else {
        return playurlParamBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * 秒开参数
     * </pre>
     *
     * <code>.bilibili.app.dynamic.v2.PlayurlParam playurl_param = 2;</code>
     */
    public Builder setPlayurlParam(com.bapis.bilibili.app.dynamic.v2.PlayurlParam value) {
      if (playurlParamBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        playurlParam_ = value;
        onChanged();
      } else {
        playurlParamBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * 秒开参数
     * </pre>
     *
     * <code>.bilibili.app.dynamic.v2.PlayurlParam playurl_param = 2;</code>
     */
    public Builder setPlayurlParam(
        com.bapis.bilibili.app.dynamic.v2.PlayurlParam.Builder builderForValue) {
      if (playurlParamBuilder_ == null) {
        playurlParam_ = builderForValue.build();
        onChanged();
      } else {
        playurlParamBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * 秒开参数
     * </pre>
     *
     * <code>.bilibili.app.dynamic.v2.PlayurlParam playurl_param = 2;</code>
     */
    public Builder mergePlayurlParam(com.bapis.bilibili.app.dynamic.v2.PlayurlParam value) {
      if (playurlParamBuilder_ == null) {
        if (playurlParam_ != null) {
          playurlParam_ =
            com.bapis.bilibili.app.dynamic.v2.PlayurlParam.newBuilder(playurlParam_).mergeFrom(value).buildPartial();
        } else {
          playurlParam_ = value;
        }
        onChanged();
      } else {
        playurlParamBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * 秒开参数
     * </pre>
     *
     * <code>.bilibili.app.dynamic.v2.PlayurlParam playurl_param = 2;</code>
     */
    public Builder clearPlayurlParam() {
      if (playurlParamBuilder_ == null) {
        playurlParam_ = null;
        onChanged();
      } else {
        playurlParam_ = null;
        playurlParamBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * 秒开参数
     * </pre>
     *
     * <code>.bilibili.app.dynamic.v2.PlayurlParam playurl_param = 2;</code>
     */
    public com.bapis.bilibili.app.dynamic.v2.PlayurlParam.Builder getPlayurlParamBuilder() {
      
      onChanged();
      return getPlayurlParamFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * 秒开参数
     * </pre>
     *
     * <code>.bilibili.app.dynamic.v2.PlayurlParam playurl_param = 2;</code>
     */
    public com.bapis.bilibili.app.dynamic.v2.PlayurlParamOrBuilder getPlayurlParamOrBuilder() {
      if (playurlParamBuilder_ != null) {
        return playurlParamBuilder_.getMessageOrBuilder();
      } else {
        return playurlParam_ == null ?
            com.bapis.bilibili.app.dynamic.v2.PlayurlParam.getDefaultInstance() : playurlParam_;
      }
    }
    /**
     * <pre>
     * 秒开参数
     * </pre>
     *
     * <code>.bilibili.app.dynamic.v2.PlayurlParam playurl_param = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.bapis.bilibili.app.dynamic.v2.PlayurlParam, com.bapis.bilibili.app.dynamic.v2.PlayurlParam.Builder, com.bapis.bilibili.app.dynamic.v2.PlayurlParamOrBuilder> 
        getPlayurlParamFieldBuilder() {
      if (playurlParamBuilder_ == null) {
        playurlParamBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.bapis.bilibili.app.dynamic.v2.PlayurlParam, com.bapis.bilibili.app.dynamic.v2.PlayurlParam.Builder, com.bapis.bilibili.app.dynamic.v2.PlayurlParamOrBuilder>(
                getPlayurlParam(),
                getParentForChildren(),
                isClean());
        playurlParam_ = null;
      }
      return playurlParamBuilder_;
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


    // @@protoc_insertion_point(builder_scope:bilibili.app.dynamic.v2.DynDetailsReq)
  }

  // @@protoc_insertion_point(class_scope:bilibili.app.dynamic.v2.DynDetailsReq)
  private static final com.bapis.bilibili.app.dynamic.v2.DynDetailsReq DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.bapis.bilibili.app.dynamic.v2.DynDetailsReq();
  }

  public static com.bapis.bilibili.app.dynamic.v2.DynDetailsReq getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<DynDetailsReq>
      PARSER = new com.google.protobuf.AbstractParser<DynDetailsReq>() {
    @java.lang.Override
    public DynDetailsReq parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new DynDetailsReq(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<DynDetailsReq> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<DynDetailsReq> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.bapis.bilibili.app.dynamic.v2.DynDetailsReq getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

