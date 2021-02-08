// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: bilibili/app/dynamic/v1/dynamic.proto

package com.bapis.bilibili.app.dynamic.v1;

/**
 * <pre>
 * DynDetailsReq 批量动态id获取动态详情请求参数
 * </pre>
 *
 * Protobuf type {@code bilibili.app.dynamic.v1.DynDetailsReq}
 */
public final class DynDetailsReq extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:bilibili.app.dynamic.v1.DynDetailsReq)
    DynDetailsReqOrBuilder {
private static final long serialVersionUID = 0L;
  // Use DynDetailsReq.newBuilder() to construct.
  private DynDetailsReq(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private DynDetailsReq() {
    dynamicIds_ = "";
  }

  @Override
  @SuppressWarnings({"unused"})
  protected Object newInstance(
      UnusedPrivateParameter unused) {
    return new DynDetailsReq();
  }

  @Override
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
      throw new NullPointerException();
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

            teenagersMode_ = input.readInt32();
            break;
          }
          case 18: {
            String s = input.readStringRequireUtf8();

            dynamicIds_ = s;
            break;
          }
          case 24: {

            qn_ = input.readInt32();
            break;
          }
          case 32: {

            fnver_ = input.readInt32();
            break;
          }
          case 40: {

            fnval_ = input.readInt32();
            break;
          }
          case 48: {

            forceHost_ = input.readInt32();
            break;
          }
          case 56: {

            fourk_ = input.readInt32();
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
    return DynamicOuterClass.internal_static_bilibili_app_dynamic_v1_DynDetailsReq_descriptor;
  }

  @Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return DynamicOuterClass.internal_static_bilibili_app_dynamic_v1_DynDetailsReq_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            DynDetailsReq.class, Builder.class);
  }

  public static final int TEENAGERS_MODE_FIELD_NUMBER = 1;
  private int teenagersMode_;
  /**
   * <pre>
   * 青少年模式 teenagers_mode=1 开启青少年模式
   * </pre>
   *
   * <code>int32 teenagers_mode = 1;</code>
   * @return The teenagersMode.
   */
  @Override
  public int getTeenagersMode() {
    return teenagersMode_;
  }

  public static final int DYNAMIC_IDS_FIELD_NUMBER = 2;
  private volatile Object dynamicIds_;
  /**
   * <pre>
   * 动态id
   * </pre>
   *
   * <code>string dynamic_ids = 2;</code>
   * @return The dynamicIds.
   */
  @Override
  public String getDynamicIds() {
    Object ref = dynamicIds_;
    if (ref instanceof String) {
      return (String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      String s = bs.toStringUtf8();
      dynamicIds_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * 动态id
   * </pre>
   *
   * <code>string dynamic_ids = 2;</code>
   * @return The bytes for dynamicIds.
   */
  @Override
  public com.google.protobuf.ByteString
      getDynamicIdsBytes() {
    Object ref = dynamicIds_;
    if (ref instanceof String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (String) ref);
      dynamicIds_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int QN_FIELD_NUMBER = 3;
  private int qn_;
  /**
   * <pre>
   * 秒开清晰度（秒开用）
   * </pre>
   *
   * <code>int32 qn = 3;</code>
   * @return The qn.
   */
  @Override
  public int getQn() {
    return qn_;
  }

  public static final int FNVER_FIELD_NUMBER = 4;
  private int fnver_;
  /**
   * <pre>
   * 功能版本号（秒开用）
   * </pre>
   *
   * <code>int32 fnver = 4;</code>
   * @return The fnver.
   */
  @Override
  public int getFnver() {
    return fnver_;
  }

  public static final int FNVAL_FIELD_NUMBER = 5;
  private int fnval_;
  /**
   * <pre>
   * 功能标识（秒开用）
   * </pre>
   *
   * <code>int32 fnval = 5;</code>
   * @return The fnval.
   */
  @Override
  public int getFnval() {
    return fnval_;
  }

  public static final int FORCE_HOST_FIELD_NUMBER = 6;
  private int forceHost_;
  /**
   * <pre>
   * 返回url是否强制使用域名（秒开用）
   * </pre>
   *
   * <code>int32 force_host = 6;</code>
   * @return The forceHost.
   */
  @Override
  public int getForceHost() {
    return forceHost_;
  }

  public static final int FOURK_FIELD_NUMBER = 7;
  private int fourk_;
  /**
   * <pre>
   * 是否需要4k视频，fourk=1 表示需要，其他表示不需要
   * </pre>
   *
   * <code>int32 fourk = 7;</code>
   * @return The fourk.
   */
  @Override
  public int getFourk() {
    return fourk_;
  }

  private byte memoizedIsInitialized = -1;
  @Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (teenagersMode_ != 0) {
      output.writeInt32(1, teenagersMode_);
    }
    if (!getDynamicIdsBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, dynamicIds_);
    }
    if (qn_ != 0) {
      output.writeInt32(3, qn_);
    }
    if (fnver_ != 0) {
      output.writeInt32(4, fnver_);
    }
    if (fnval_ != 0) {
      output.writeInt32(5, fnval_);
    }
    if (forceHost_ != 0) {
      output.writeInt32(6, forceHost_);
    }
    if (fourk_ != 0) {
      output.writeInt32(7, fourk_);
    }
    unknownFields.writeTo(output);
  }

  @Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (teenagersMode_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(1, teenagersMode_);
    }
    if (!getDynamicIdsBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, dynamicIds_);
    }
    if (qn_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(3, qn_);
    }
    if (fnver_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(4, fnver_);
    }
    if (fnval_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(5, fnval_);
    }
    if (forceHost_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(6, forceHost_);
    }
    if (fourk_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(7, fourk_);
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @Override
  public boolean equals(final Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof DynDetailsReq)) {
      return super.equals(obj);
    }
    DynDetailsReq other = (DynDetailsReq) obj;

    if (getTeenagersMode()
        != other.getTeenagersMode()) return false;
    if (!getDynamicIds()
        .equals(other.getDynamicIds())) return false;
    if (getQn()
        != other.getQn()) return false;
    if (getFnver()
        != other.getFnver()) return false;
    if (getFnval()
        != other.getFnval()) return false;
    if (getForceHost()
        != other.getForceHost()) return false;
    if (getFourk()
        != other.getFourk()) return false;
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + TEENAGERS_MODE_FIELD_NUMBER;
    hash = (53 * hash) + getTeenagersMode();
    hash = (37 * hash) + DYNAMIC_IDS_FIELD_NUMBER;
    hash = (53 * hash) + getDynamicIds().hashCode();
    hash = (37 * hash) + QN_FIELD_NUMBER;
    hash = (53 * hash) + getQn();
    hash = (37 * hash) + FNVER_FIELD_NUMBER;
    hash = (53 * hash) + getFnver();
    hash = (37 * hash) + FNVAL_FIELD_NUMBER;
    hash = (53 * hash) + getFnval();
    hash = (37 * hash) + FORCE_HOST_FIELD_NUMBER;
    hash = (53 * hash) + getForceHost();
    hash = (37 * hash) + FOURK_FIELD_NUMBER;
    hash = (53 * hash) + getFourk();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static DynDetailsReq parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static DynDetailsReq parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static DynDetailsReq parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static DynDetailsReq parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static DynDetailsReq parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static DynDetailsReq parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static DynDetailsReq parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static DynDetailsReq parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static DynDetailsReq parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static DynDetailsReq parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static DynDetailsReq parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static DynDetailsReq parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(DynDetailsReq prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @Override
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
   * Protobuf type {@code bilibili.app.dynamic.v1.DynDetailsReq}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:bilibili.app.dynamic.v1.DynDetailsReq)
      DynDetailsReqOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return DynamicOuterClass.internal_static_bilibili_app_dynamic_v1_DynDetailsReq_descriptor;
    }

    @Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return DynamicOuterClass.internal_static_bilibili_app_dynamic_v1_DynDetailsReq_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              DynDetailsReq.class, Builder.class);
    }

    // Construct using com.bapis.bilibili.app.dynamic.v1.DynDetailsReq.newBuilder()
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
    @Override
    public Builder clear() {
      super.clear();
      teenagersMode_ = 0;

      dynamicIds_ = "";

      qn_ = 0;

      fnver_ = 0;

      fnval_ = 0;

      forceHost_ = 0;

      fourk_ = 0;

      return this;
    }

    @Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return DynamicOuterClass.internal_static_bilibili_app_dynamic_v1_DynDetailsReq_descriptor;
    }

    @Override
    public DynDetailsReq getDefaultInstanceForType() {
      return DynDetailsReq.getDefaultInstance();
    }

    @Override
    public DynDetailsReq build() {
      DynDetailsReq result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @Override
    public DynDetailsReq buildPartial() {
      DynDetailsReq result = new DynDetailsReq(this);
      result.teenagersMode_ = teenagersMode_;
      result.dynamicIds_ = dynamicIds_;
      result.qn_ = qn_;
      result.fnver_ = fnver_;
      result.fnval_ = fnval_;
      result.forceHost_ = forceHost_;
      result.fourk_ = fourk_;
      onBuilt();
      return result;
    }

    @Override
    public Builder clone() {
      return super.clone();
    }
    @Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        Object value) {
      return super.setField(field, value);
    }
    @Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        Object value) {
      return super.addRepeatedField(field, value);
    }
    @Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof DynDetailsReq) {
        return mergeFrom((DynDetailsReq)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(DynDetailsReq other) {
      if (other == DynDetailsReq.getDefaultInstance()) return this;
      if (other.getTeenagersMode() != 0) {
        setTeenagersMode(other.getTeenagersMode());
      }
      if (!other.getDynamicIds().isEmpty()) {
        dynamicIds_ = other.dynamicIds_;
        onChanged();
      }
      if (other.getQn() != 0) {
        setQn(other.getQn());
      }
      if (other.getFnver() != 0) {
        setFnver(other.getFnver());
      }
      if (other.getFnval() != 0) {
        setFnval(other.getFnval());
      }
      if (other.getForceHost() != 0) {
        setForceHost(other.getForceHost());
      }
      if (other.getFourk() != 0) {
        setFourk(other.getFourk());
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @Override
    public final boolean isInitialized() {
      return true;
    }

    @Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      DynDetailsReq parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (DynDetailsReq) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int teenagersMode_ ;
    /**
     * <pre>
     * 青少年模式 teenagers_mode=1 开启青少年模式
     * </pre>
     *
     * <code>int32 teenagers_mode = 1;</code>
     * @return The teenagersMode.
     */
    @Override
    public int getTeenagersMode() {
      return teenagersMode_;
    }
    /**
     * <pre>
     * 青少年模式 teenagers_mode=1 开启青少年模式
     * </pre>
     *
     * <code>int32 teenagers_mode = 1;</code>
     * @param value The teenagersMode to set.
     * @return This builder for chaining.
     */
    public Builder setTeenagersMode(int value) {
      
      teenagersMode_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 青少年模式 teenagers_mode=1 开启青少年模式
     * </pre>
     *
     * <code>int32 teenagers_mode = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearTeenagersMode() {
      
      teenagersMode_ = 0;
      onChanged();
      return this;
    }

    private Object dynamicIds_ = "";
    /**
     * <pre>
     * 动态id
     * </pre>
     *
     * <code>string dynamic_ids = 2;</code>
     * @return The dynamicIds.
     */
    public String getDynamicIds() {
      Object ref = dynamicIds_;
      if (!(ref instanceof String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        String s = bs.toStringUtf8();
        dynamicIds_ = s;
        return s;
      } else {
        return (String) ref;
      }
    }
    /**
     * <pre>
     * 动态id
     * </pre>
     *
     * <code>string dynamic_ids = 2;</code>
     * @return The bytes for dynamicIds.
     */
    public com.google.protobuf.ByteString
        getDynamicIdsBytes() {
      Object ref = dynamicIds_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (String) ref);
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
     * <code>string dynamic_ids = 2;</code>
     * @param value The dynamicIds to set.
     * @return This builder for chaining.
     */
    public Builder setDynamicIds(
        String value) {
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
     * <code>string dynamic_ids = 2;</code>
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
     * <code>string dynamic_ids = 2;</code>
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

    private int qn_ ;
    /**
     * <pre>
     * 秒开清晰度（秒开用）
     * </pre>
     *
     * <code>int32 qn = 3;</code>
     * @return The qn.
     */
    @Override
    public int getQn() {
      return qn_;
    }
    /**
     * <pre>
     * 秒开清晰度（秒开用）
     * </pre>
     *
     * <code>int32 qn = 3;</code>
     * @param value The qn to set.
     * @return This builder for chaining.
     */
    public Builder setQn(int value) {
      
      qn_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 秒开清晰度（秒开用）
     * </pre>
     *
     * <code>int32 qn = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearQn() {
      
      qn_ = 0;
      onChanged();
      return this;
    }

    private int fnver_ ;
    /**
     * <pre>
     * 功能版本号（秒开用）
     * </pre>
     *
     * <code>int32 fnver = 4;</code>
     * @return The fnver.
     */
    @Override
    public int getFnver() {
      return fnver_;
    }
    /**
     * <pre>
     * 功能版本号（秒开用）
     * </pre>
     *
     * <code>int32 fnver = 4;</code>
     * @param value The fnver to set.
     * @return This builder for chaining.
     */
    public Builder setFnver(int value) {
      
      fnver_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 功能版本号（秒开用）
     * </pre>
     *
     * <code>int32 fnver = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearFnver() {
      
      fnver_ = 0;
      onChanged();
      return this;
    }

    private int fnval_ ;
    /**
     * <pre>
     * 功能标识（秒开用）
     * </pre>
     *
     * <code>int32 fnval = 5;</code>
     * @return The fnval.
     */
    @Override
    public int getFnval() {
      return fnval_;
    }
    /**
     * <pre>
     * 功能标识（秒开用）
     * </pre>
     *
     * <code>int32 fnval = 5;</code>
     * @param value The fnval to set.
     * @return This builder for chaining.
     */
    public Builder setFnval(int value) {
      
      fnval_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 功能标识（秒开用）
     * </pre>
     *
     * <code>int32 fnval = 5;</code>
     * @return This builder for chaining.
     */
    public Builder clearFnval() {
      
      fnval_ = 0;
      onChanged();
      return this;
    }

    private int forceHost_ ;
    /**
     * <pre>
     * 返回url是否强制使用域名（秒开用）
     * </pre>
     *
     * <code>int32 force_host = 6;</code>
     * @return The forceHost.
     */
    @Override
    public int getForceHost() {
      return forceHost_;
    }
    /**
     * <pre>
     * 返回url是否强制使用域名（秒开用）
     * </pre>
     *
     * <code>int32 force_host = 6;</code>
     * @param value The forceHost to set.
     * @return This builder for chaining.
     */
    public Builder setForceHost(int value) {
      
      forceHost_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 返回url是否强制使用域名（秒开用）
     * </pre>
     *
     * <code>int32 force_host = 6;</code>
     * @return This builder for chaining.
     */
    public Builder clearForceHost() {
      
      forceHost_ = 0;
      onChanged();
      return this;
    }

    private int fourk_ ;
    /**
     * <pre>
     * 是否需要4k视频，fourk=1 表示需要，其他表示不需要
     * </pre>
     *
     * <code>int32 fourk = 7;</code>
     * @return The fourk.
     */
    @Override
    public int getFourk() {
      return fourk_;
    }
    /**
     * <pre>
     * 是否需要4k视频，fourk=1 表示需要，其他表示不需要
     * </pre>
     *
     * <code>int32 fourk = 7;</code>
     * @param value The fourk to set.
     * @return This builder for chaining.
     */
    public Builder setFourk(int value) {
      
      fourk_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 是否需要4k视频，fourk=1 表示需要，其他表示不需要
     * </pre>
     *
     * <code>int32 fourk = 7;</code>
     * @return This builder for chaining.
     */
    public Builder clearFourk() {
      
      fourk_ = 0;
      onChanged();
      return this;
    }
    @Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:bilibili.app.dynamic.v1.DynDetailsReq)
  }

  // @@protoc_insertion_point(class_scope:bilibili.app.dynamic.v1.DynDetailsReq)
  private static final DynDetailsReq DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new DynDetailsReq();
  }

  public static DynDetailsReq getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<DynDetailsReq>
      PARSER = new com.google.protobuf.AbstractParser<DynDetailsReq>() {
    @Override
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

  @Override
  public com.google.protobuf.Parser<DynDetailsReq> getParserForType() {
    return PARSER;
  }

  @Override
  public DynDetailsReq getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

