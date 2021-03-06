// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: bilibili/app/dynamic/v1/dynamic.proto

package com.bapis.bilibili.app.dynamic.v1;

/**
 * <pre>
 * OfficialVerify 认证信息
 * </pre>
 *
 * Protobuf type {@code bilibili.app.dynamic.v1.OfficialVerify}
 */
public final class OfficialVerify extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:bilibili.app.dynamic.v1.OfficialVerify)
    OfficialVerifyOrBuilder {
private static final long serialVersionUID = 0L;
  // Use OfficialVerify.newBuilder() to construct.
  private OfficialVerify(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private OfficialVerify() {
    desc_ = "";
  }

  @Override
  @SuppressWarnings({"unused"})
  protected Object newInstance(
      UnusedPrivateParameter unused) {
    return new OfficialVerify();
  }

  @Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private OfficialVerify(
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

            type_ = input.readInt32();
            break;
          }
          case 18: {
            String s = input.readStringRequireUtf8();

            desc_ = s;
            break;
          }
          case 24: {

            isAtten_ = input.readInt32();
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
    return DynamicOuterClass.internal_static_bilibili_app_dynamic_v1_OfficialVerify_descriptor;
  }

  @Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return DynamicOuterClass.internal_static_bilibili_app_dynamic_v1_OfficialVerify_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            OfficialVerify.class, Builder.class);
  }

  public static final int TYPE_FIELD_NUMBER = 1;
  private int type_;
  /**
   * <pre>
   * 0：个人；1：官方；127：未认证
   * </pre>
   *
   * <code>int32 type = 1;</code>
   * @return The type.
   */
  @Override
  public int getType() {
    return type_;
  }

  public static final int DESC_FIELD_NUMBER = 2;
  private volatile Object desc_;
  /**
   * <pre>
   * 认证描述
   * </pre>
   *
   * <code>string desc = 2;</code>
   * @return The desc.
   */
  @Override
  public String getDesc() {
    Object ref = desc_;
    if (ref instanceof String) {
      return (String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      String s = bs.toStringUtf8();
      desc_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * 认证描述
   * </pre>
   *
   * <code>string desc = 2;</code>
   * @return The bytes for desc.
   */
  @Override
  public com.google.protobuf.ByteString
      getDescBytes() {
    Object ref = desc_;
    if (ref instanceof String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (String) ref);
      desc_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int IS_ATTEN_FIELD_NUMBER = 3;
  private int isAtten_;
  /**
   * <code>int32 is_atten = 3;</code>
   * @return The isAtten.
   */
  @Override
  public int getIsAtten() {
    return isAtten_;
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
    if (type_ != 0) {
      output.writeInt32(1, type_);
    }
    if (!getDescBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, desc_);
    }
    if (isAtten_ != 0) {
      output.writeInt32(3, isAtten_);
    }
    unknownFields.writeTo(output);
  }

  @Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (type_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(1, type_);
    }
    if (!getDescBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, desc_);
    }
    if (isAtten_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(3, isAtten_);
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
    if (!(obj instanceof OfficialVerify)) {
      return super.equals(obj);
    }
    OfficialVerify other = (OfficialVerify) obj;

    if (getType()
        != other.getType()) return false;
    if (!getDesc()
        .equals(other.getDesc())) return false;
    if (getIsAtten()
        != other.getIsAtten()) return false;
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
    hash = (37 * hash) + TYPE_FIELD_NUMBER;
    hash = (53 * hash) + getType();
    hash = (37 * hash) + DESC_FIELD_NUMBER;
    hash = (53 * hash) + getDesc().hashCode();
    hash = (37 * hash) + IS_ATTEN_FIELD_NUMBER;
    hash = (53 * hash) + getIsAtten();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static OfficialVerify parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static OfficialVerify parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static OfficialVerify parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static OfficialVerify parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static OfficialVerify parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static OfficialVerify parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static OfficialVerify parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static OfficialVerify parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static OfficialVerify parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static OfficialVerify parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static OfficialVerify parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static OfficialVerify parseFrom(
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
  public static Builder newBuilder(OfficialVerify prototype) {
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
   * OfficialVerify 认证信息
   * </pre>
   *
   * Protobuf type {@code bilibili.app.dynamic.v1.OfficialVerify}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:bilibili.app.dynamic.v1.OfficialVerify)
      OfficialVerifyOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return DynamicOuterClass.internal_static_bilibili_app_dynamic_v1_OfficialVerify_descriptor;
    }

    @Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return DynamicOuterClass.internal_static_bilibili_app_dynamic_v1_OfficialVerify_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              OfficialVerify.class, Builder.class);
    }

    // Construct using com.bapis.bilibili.app.dynamic.v1.OfficialVerify.newBuilder()
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
      type_ = 0;

      desc_ = "";

      isAtten_ = 0;

      return this;
    }

    @Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return DynamicOuterClass.internal_static_bilibili_app_dynamic_v1_OfficialVerify_descriptor;
    }

    @Override
    public OfficialVerify getDefaultInstanceForType() {
      return OfficialVerify.getDefaultInstance();
    }

    @Override
    public OfficialVerify build() {
      OfficialVerify result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @Override
    public OfficialVerify buildPartial() {
      OfficialVerify result = new OfficialVerify(this);
      result.type_ = type_;
      result.desc_ = desc_;
      result.isAtten_ = isAtten_;
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
      if (other instanceof OfficialVerify) {
        return mergeFrom((OfficialVerify)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(OfficialVerify other) {
      if (other == OfficialVerify.getDefaultInstance()) return this;
      if (other.getType() != 0) {
        setType(other.getType());
      }
      if (!other.getDesc().isEmpty()) {
        desc_ = other.desc_;
        onChanged();
      }
      if (other.getIsAtten() != 0) {
        setIsAtten(other.getIsAtten());
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
      OfficialVerify parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (OfficialVerify) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int type_ ;
    /**
     * <pre>
     * 0：个人；1：官方；127：未认证
     * </pre>
     *
     * <code>int32 type = 1;</code>
     * @return The type.
     */
    @Override
    public int getType() {
      return type_;
    }
    /**
     * <pre>
     * 0：个人；1：官方；127：未认证
     * </pre>
     *
     * <code>int32 type = 1;</code>
     * @param value The type to set.
     * @return This builder for chaining.
     */
    public Builder setType(int value) {
      
      type_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 0：个人；1：官方；127：未认证
     * </pre>
     *
     * <code>int32 type = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearType() {
      
      type_ = 0;
      onChanged();
      return this;
    }

    private Object desc_ = "";
    /**
     * <pre>
     * 认证描述
     * </pre>
     *
     * <code>string desc = 2;</code>
     * @return The desc.
     */
    public String getDesc() {
      Object ref = desc_;
      if (!(ref instanceof String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        String s = bs.toStringUtf8();
        desc_ = s;
        return s;
      } else {
        return (String) ref;
      }
    }
    /**
     * <pre>
     * 认证描述
     * </pre>
     *
     * <code>string desc = 2;</code>
     * @return The bytes for desc.
     */
    public com.google.protobuf.ByteString
        getDescBytes() {
      Object ref = desc_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (String) ref);
        desc_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * 认证描述
     * </pre>
     *
     * <code>string desc = 2;</code>
     * @param value The desc to set.
     * @return This builder for chaining.
     */
    public Builder setDesc(
        String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      desc_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 认证描述
     * </pre>
     *
     * <code>string desc = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearDesc() {
      
      desc_ = getDefaultInstance().getDesc();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 认证描述
     * </pre>
     *
     * <code>string desc = 2;</code>
     * @param value The bytes for desc to set.
     * @return This builder for chaining.
     */
    public Builder setDescBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      desc_ = value;
      onChanged();
      return this;
    }

    private int isAtten_ ;
    /**
     * <code>int32 is_atten = 3;</code>
     * @return The isAtten.
     */
    @Override
    public int getIsAtten() {
      return isAtten_;
    }
    /**
     * <code>int32 is_atten = 3;</code>
     * @param value The isAtten to set.
     * @return This builder for chaining.
     */
    public Builder setIsAtten(int value) {
      
      isAtten_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 is_atten = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearIsAtten() {
      
      isAtten_ = 0;
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


    // @@protoc_insertion_point(builder_scope:bilibili.app.dynamic.v1.OfficialVerify)
  }

  // @@protoc_insertion_point(class_scope:bilibili.app.dynamic.v1.OfficialVerify)
  private static final OfficialVerify DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new OfficialVerify();
  }

  public static OfficialVerify getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<OfficialVerify>
      PARSER = new com.google.protobuf.AbstractParser<OfficialVerify>() {
    @Override
    public OfficialVerify parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new OfficialVerify(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<OfficialVerify> parser() {
    return PARSER;
  }

  @Override
  public com.google.protobuf.Parser<OfficialVerify> getParserForType() {
    return PARSER;
  }

  @Override
  public OfficialVerify getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

