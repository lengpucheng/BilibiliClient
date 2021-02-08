// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: bilibili/app/dynamic/v1/dynamic.proto

package com.bapis.bilibili.app.dynamic.v1;

/**
 * <pre>
 * DynVideoPersonalReq 最近访问-个人feed流列表 请求参数
 * </pre>
 *
 * Protobuf type {@code bilibili.app.dynamic.v1.DynVideoPersonalReq}
 */
public final class DynVideoPersonalReq extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:bilibili.app.dynamic.v1.DynVideoPersonalReq)
    DynVideoPersonalReqOrBuilder {
private static final long serialVersionUID = 0L;
  // Use DynVideoPersonalReq.newBuilder() to construct.
  private DynVideoPersonalReq(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private DynVideoPersonalReq() {
    offset_ = "";
  }

  @Override
  @SuppressWarnings({"unused"})
  protected Object newInstance(
      UnusedPrivateParameter unused) {
    return new DynVideoPersonalReq();
  }

  @Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private DynVideoPersonalReq(
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
          case 16: {

            hostUid_ = input.readInt64();
            break;
          }
          case 26: {
            String s = input.readStringRequireUtf8();

            offset_ = s;
            break;
          }
          case 32: {

            page_ = input.readInt32();
            break;
          }
          case 40: {

            isPreload_ = input.readInt32();
            break;
          }
          case 48: {

            qn_ = input.readInt32();
            break;
          }
          case 56: {

            fnver_ = input.readInt32();
            break;
          }
          case 64: {

            fnval_ = input.readInt32();
            break;
          }
          case 72: {

            forceHost_ = input.readInt32();
            break;
          }
          case 80: {

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
    return DynamicOuterClass.internal_static_bilibili_app_dynamic_v1_DynVideoPersonalReq_descriptor;
  }

  @Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return DynamicOuterClass.internal_static_bilibili_app_dynamic_v1_DynVideoPersonalReq_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            DynVideoPersonalReq.class, Builder.class);
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

  public static final int HOST_UID_FIELD_NUMBER = 2;
  private long hostUid_;
  /**
   * <pre>
   * 被访问者的 UID
   * </pre>
   *
   * <code>int64 host_uid = 2;</code>
   * @return The hostUid.
   */
  @Override
  public long getHostUid() {
    return hostUid_;
  }

  public static final int OFFSET_FIELD_NUMBER = 3;
  private volatile Object offset_;
  /**
   * <pre>
   * 偏移量 第一页可传空
   * </pre>
   *
   * <code>string offset = 3;</code>
   * @return The offset.
   */
  @Override
  public String getOffset() {
    Object ref = offset_;
    if (ref instanceof String) {
      return (String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      String s = bs.toStringUtf8();
      offset_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * 偏移量 第一页可传空
   * </pre>
   *
   * <code>string offset = 3;</code>
   * @return The bytes for offset.
   */
  @Override
  public com.google.protobuf.ByteString
      getOffsetBytes() {
    Object ref = offset_;
    if (ref instanceof String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (String) ref);
      offset_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int PAGE_FIELD_NUMBER = 4;
  private int page_;
  /**
   * <pre>
   * 标明下拉几次
   * </pre>
   *
   * <code>int32 page = 4;</code>
   * @return The page.
   */
  @Override
  public int getPage() {
    return page_;
  }

  public static final int IS_PRELOAD_FIELD_NUMBER = 5;
  private int isPreload_;
  /**
   * <pre>
   * 是否是预加载
   * </pre>
   *
   * <code>int32 is_preload = 5;</code>
   * @return The isPreload.
   */
  @Override
  public int getIsPreload() {
    return isPreload_;
  }

  public static final int QN_FIELD_NUMBER = 6;
  private int qn_;
  /**
   * <pre>
   * 秒开清晰度（秒开用）
   * </pre>
   *
   * <code>int32 qn = 6;</code>
   * @return The qn.
   */
  @Override
  public int getQn() {
    return qn_;
  }

  public static final int FNVER_FIELD_NUMBER = 7;
  private int fnver_;
  /**
   * <pre>
   * 功能版本号（秒开用）
   * </pre>
   *
   * <code>int32 fnver = 7;</code>
   * @return The fnver.
   */
  @Override
  public int getFnver() {
    return fnver_;
  }

  public static final int FNVAL_FIELD_NUMBER = 8;
  private int fnval_;
  /**
   * <pre>
   * 功能标识（秒开用）
   * </pre>
   *
   * <code>int32 fnval = 8;</code>
   * @return The fnval.
   */
  @Override
  public int getFnval() {
    return fnval_;
  }

  public static final int FORCE_HOST_FIELD_NUMBER = 9;
  private int forceHost_;
  /**
   * <pre>
   * 返回url是否强制使用域名（秒开用）
   * </pre>
   *
   * <code>int32 force_host = 9;</code>
   * @return The forceHost.
   */
  @Override
  public int getForceHost() {
    return forceHost_;
  }

  public static final int FOURK_FIELD_NUMBER = 10;
  private int fourk_;
  /**
   * <pre>
   * 是否需要4k视频，fourk=1 表示需要，其他表示不需要
   * </pre>
   *
   * <code>int32 fourk = 10;</code>
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
    if (hostUid_ != 0L) {
      output.writeInt64(2, hostUid_);
    }
    if (!getOffsetBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, offset_);
    }
    if (page_ != 0) {
      output.writeInt32(4, page_);
    }
    if (isPreload_ != 0) {
      output.writeInt32(5, isPreload_);
    }
    if (qn_ != 0) {
      output.writeInt32(6, qn_);
    }
    if (fnver_ != 0) {
      output.writeInt32(7, fnver_);
    }
    if (fnval_ != 0) {
      output.writeInt32(8, fnval_);
    }
    if (forceHost_ != 0) {
      output.writeInt32(9, forceHost_);
    }
    if (fourk_ != 0) {
      output.writeInt32(10, fourk_);
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
    if (hostUid_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(2, hostUid_);
    }
    if (!getOffsetBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, offset_);
    }
    if (page_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(4, page_);
    }
    if (isPreload_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(5, isPreload_);
    }
    if (qn_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(6, qn_);
    }
    if (fnver_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(7, fnver_);
    }
    if (fnval_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(8, fnval_);
    }
    if (forceHost_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(9, forceHost_);
    }
    if (fourk_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(10, fourk_);
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
    if (!(obj instanceof DynVideoPersonalReq)) {
      return super.equals(obj);
    }
    DynVideoPersonalReq other = (DynVideoPersonalReq) obj;

    if (getTeenagersMode()
        != other.getTeenagersMode()) return false;
    if (getHostUid()
        != other.getHostUid()) return false;
    if (!getOffset()
        .equals(other.getOffset())) return false;
    if (getPage()
        != other.getPage()) return false;
    if (getIsPreload()
        != other.getIsPreload()) return false;
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
    hash = (37 * hash) + HOST_UID_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getHostUid());
    hash = (37 * hash) + OFFSET_FIELD_NUMBER;
    hash = (53 * hash) + getOffset().hashCode();
    hash = (37 * hash) + PAGE_FIELD_NUMBER;
    hash = (53 * hash) + getPage();
    hash = (37 * hash) + IS_PRELOAD_FIELD_NUMBER;
    hash = (53 * hash) + getIsPreload();
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

  public static DynVideoPersonalReq parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static DynVideoPersonalReq parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static DynVideoPersonalReq parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static DynVideoPersonalReq parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static DynVideoPersonalReq parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static DynVideoPersonalReq parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static DynVideoPersonalReq parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static DynVideoPersonalReq parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static DynVideoPersonalReq parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static DynVideoPersonalReq parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static DynVideoPersonalReq parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static DynVideoPersonalReq parseFrom(
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
  public static Builder newBuilder(DynVideoPersonalReq prototype) {
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
   * DynVideoPersonalReq 最近访问-个人feed流列表 请求参数
   * </pre>
   *
   * Protobuf type {@code bilibili.app.dynamic.v1.DynVideoPersonalReq}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:bilibili.app.dynamic.v1.DynVideoPersonalReq)
      DynVideoPersonalReqOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return DynamicOuterClass.internal_static_bilibili_app_dynamic_v1_DynVideoPersonalReq_descriptor;
    }

    @Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return DynamicOuterClass.internal_static_bilibili_app_dynamic_v1_DynVideoPersonalReq_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              DynVideoPersonalReq.class, Builder.class);
    }

    // Construct using com.bapis.bilibili.app.dynamic.v1.DynVideoPersonalReq.newBuilder()
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

      hostUid_ = 0L;

      offset_ = "";

      page_ = 0;

      isPreload_ = 0;

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
      return DynamicOuterClass.internal_static_bilibili_app_dynamic_v1_DynVideoPersonalReq_descriptor;
    }

    @Override
    public DynVideoPersonalReq getDefaultInstanceForType() {
      return DynVideoPersonalReq.getDefaultInstance();
    }

    @Override
    public DynVideoPersonalReq build() {
      DynVideoPersonalReq result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @Override
    public DynVideoPersonalReq buildPartial() {
      DynVideoPersonalReq result = new DynVideoPersonalReq(this);
      result.teenagersMode_ = teenagersMode_;
      result.hostUid_ = hostUid_;
      result.offset_ = offset_;
      result.page_ = page_;
      result.isPreload_ = isPreload_;
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
      if (other instanceof DynVideoPersonalReq) {
        return mergeFrom((DynVideoPersonalReq)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(DynVideoPersonalReq other) {
      if (other == DynVideoPersonalReq.getDefaultInstance()) return this;
      if (other.getTeenagersMode() != 0) {
        setTeenagersMode(other.getTeenagersMode());
      }
      if (other.getHostUid() != 0L) {
        setHostUid(other.getHostUid());
      }
      if (!other.getOffset().isEmpty()) {
        offset_ = other.offset_;
        onChanged();
      }
      if (other.getPage() != 0) {
        setPage(other.getPage());
      }
      if (other.getIsPreload() != 0) {
        setIsPreload(other.getIsPreload());
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
      DynVideoPersonalReq parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (DynVideoPersonalReq) e.getUnfinishedMessage();
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

    private long hostUid_ ;
    /**
     * <pre>
     * 被访问者的 UID
     * </pre>
     *
     * <code>int64 host_uid = 2;</code>
     * @return The hostUid.
     */
    @Override
    public long getHostUid() {
      return hostUid_;
    }
    /**
     * <pre>
     * 被访问者的 UID
     * </pre>
     *
     * <code>int64 host_uid = 2;</code>
     * @param value The hostUid to set.
     * @return This builder for chaining.
     */
    public Builder setHostUid(long value) {
      
      hostUid_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 被访问者的 UID
     * </pre>
     *
     * <code>int64 host_uid = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearHostUid() {
      
      hostUid_ = 0L;
      onChanged();
      return this;
    }

    private Object offset_ = "";
    /**
     * <pre>
     * 偏移量 第一页可传空
     * </pre>
     *
     * <code>string offset = 3;</code>
     * @return The offset.
     */
    public String getOffset() {
      Object ref = offset_;
      if (!(ref instanceof String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        String s = bs.toStringUtf8();
        offset_ = s;
        return s;
      } else {
        return (String) ref;
      }
    }
    /**
     * <pre>
     * 偏移量 第一页可传空
     * </pre>
     *
     * <code>string offset = 3;</code>
     * @return The bytes for offset.
     */
    public com.google.protobuf.ByteString
        getOffsetBytes() {
      Object ref = offset_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (String) ref);
        offset_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * 偏移量 第一页可传空
     * </pre>
     *
     * <code>string offset = 3;</code>
     * @param value The offset to set.
     * @return This builder for chaining.
     */
    public Builder setOffset(
        String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      offset_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 偏移量 第一页可传空
     * </pre>
     *
     * <code>string offset = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearOffset() {
      
      offset_ = getDefaultInstance().getOffset();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 偏移量 第一页可传空
     * </pre>
     *
     * <code>string offset = 3;</code>
     * @param value The bytes for offset to set.
     * @return This builder for chaining.
     */
    public Builder setOffsetBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      offset_ = value;
      onChanged();
      return this;
    }

    private int page_ ;
    /**
     * <pre>
     * 标明下拉几次
     * </pre>
     *
     * <code>int32 page = 4;</code>
     * @return The page.
     */
    @Override
    public int getPage() {
      return page_;
    }
    /**
     * <pre>
     * 标明下拉几次
     * </pre>
     *
     * <code>int32 page = 4;</code>
     * @param value The page to set.
     * @return This builder for chaining.
     */
    public Builder setPage(int value) {
      
      page_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 标明下拉几次
     * </pre>
     *
     * <code>int32 page = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearPage() {
      
      page_ = 0;
      onChanged();
      return this;
    }

    private int isPreload_ ;
    /**
     * <pre>
     * 是否是预加载
     * </pre>
     *
     * <code>int32 is_preload = 5;</code>
     * @return The isPreload.
     */
    @Override
    public int getIsPreload() {
      return isPreload_;
    }
    /**
     * <pre>
     * 是否是预加载
     * </pre>
     *
     * <code>int32 is_preload = 5;</code>
     * @param value The isPreload to set.
     * @return This builder for chaining.
     */
    public Builder setIsPreload(int value) {
      
      isPreload_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 是否是预加载
     * </pre>
     *
     * <code>int32 is_preload = 5;</code>
     * @return This builder for chaining.
     */
    public Builder clearIsPreload() {
      
      isPreload_ = 0;
      onChanged();
      return this;
    }

    private int qn_ ;
    /**
     * <pre>
     * 秒开清晰度（秒开用）
     * </pre>
     *
     * <code>int32 qn = 6;</code>
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
     * <code>int32 qn = 6;</code>
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
     * <code>int32 qn = 6;</code>
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
     * <code>int32 fnver = 7;</code>
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
     * <code>int32 fnver = 7;</code>
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
     * <code>int32 fnver = 7;</code>
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
     * <code>int32 fnval = 8;</code>
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
     * <code>int32 fnval = 8;</code>
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
     * <code>int32 fnval = 8;</code>
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
     * <code>int32 force_host = 9;</code>
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
     * <code>int32 force_host = 9;</code>
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
     * <code>int32 force_host = 9;</code>
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
     * <code>int32 fourk = 10;</code>
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
     * <code>int32 fourk = 10;</code>
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
     * <code>int32 fourk = 10;</code>
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


    // @@protoc_insertion_point(builder_scope:bilibili.app.dynamic.v1.DynVideoPersonalReq)
  }

  // @@protoc_insertion_point(class_scope:bilibili.app.dynamic.v1.DynVideoPersonalReq)
  private static final DynVideoPersonalReq DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new DynVideoPersonalReq();
  }

  public static DynVideoPersonalReq getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<DynVideoPersonalReq>
      PARSER = new com.google.protobuf.AbstractParser<DynVideoPersonalReq>() {
    @Override
    public DynVideoPersonalReq parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new DynVideoPersonalReq(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<DynVideoPersonalReq> parser() {
    return PARSER;
  }

  @Override
  public com.google.protobuf.Parser<DynVideoPersonalReq> getParserForType() {
    return PARSER;
  }

  @Override
  public DynVideoPersonalReq getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

