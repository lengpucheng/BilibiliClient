// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: bilibili/app/dynamic/v1/dynamic.proto

package com.bapis.bilibili.app.dynamic.v1;

/**
 * <pre>
 * 动态同城物料extend模块
 * </pre>
 *
 * Protobuf type {@code bilibili.app.dynamic.v1.DynOurCityModuleExtend}
 */
public final class DynOurCityModuleExtend extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:bilibili.app.dynamic.v1.DynOurCityModuleExtend)
    DynOurCityModuleExtendOrBuilder {
private static final long serialVersionUID = 0L;
  // Use DynOurCityModuleExtend.newBuilder() to construct.
  private DynOurCityModuleExtend(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private DynOurCityModuleExtend() {
    type_ = "";
  }

  @Override
  @SuppressWarnings({"unused"})
  protected Object newInstance(
      UnusedPrivateParameter unused) {
    return new DynOurCityModuleExtend();
  }

  @Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private DynOurCityModuleExtend(
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
          case 10: {
            String s = input.readStringRequireUtf8();

            type_ = s;
            break;
          }
          case 18: {
            DynOurCityModuleExtendLBS.Builder subBuilder = null;
            if (extendCase_ == 2) {
              subBuilder = ((DynOurCityModuleExtendLBS) extend_).toBuilder();
            }
            extend_ =
                input.readMessage(DynOurCityModuleExtendLBS.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom((DynOurCityModuleExtendLBS) extend_);
              extend_ = subBuilder.buildPartial();
            }
            extendCase_ = 2;
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
    return DynamicOuterClass.internal_static_bilibili_app_dynamic_v1_DynOurCityModuleExtend_descriptor;
  }

  @Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return DynamicOuterClass.internal_static_bilibili_app_dynamic_v1_DynOurCityModuleExtend_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            DynOurCityModuleExtend.class, Builder.class);
  }

  private int extendCase_ = 0;
  private Object extend_;
  public enum ExtendCase
      implements com.google.protobuf.Internal.EnumLite,
          com.google.protobuf.AbstractMessage.InternalOneOfEnum {
    EXTEND_LBS(2),
    EXTEND_NOT_SET(0);
    private final int value;
    private ExtendCase(int value) {
      this.value = value;
    }
    /**
     * @param value The number of the enum to look for.
     * @return The enum associated with the given number.
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @Deprecated
    public static ExtendCase valueOf(int value) {
      return forNumber(value);
    }

    public static ExtendCase forNumber(int value) {
      switch (value) {
        case 2: return EXTEND_LBS;
        case 0: return EXTEND_NOT_SET;
        default: return null;
      }
    }
    public int getNumber() {
      return this.value;
    }
  };

  public ExtendCase
  getExtendCase() {
    return ExtendCase.forNumber(
        extendCase_);
  }

  public static final int TYPE_FIELD_NUMBER = 1;
  private volatile Object type_;
  /**
   * <code>string type = 1;</code>
   * @return The type.
   */
  @Override
  public String getType() {
    Object ref = type_;
    if (ref instanceof String) {
      return (String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      String s = bs.toStringUtf8();
      type_ = s;
      return s;
    }
  }
  /**
   * <code>string type = 1;</code>
   * @return The bytes for type.
   */
  @Override
  public com.google.protobuf.ByteString
      getTypeBytes() {
    Object ref = type_;
    if (ref instanceof String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (String) ref);
      type_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int EXTEND_LBS_FIELD_NUMBER = 2;
  /**
   * <code>.bilibili.app.dynamic.v1.DynOurCityModuleExtendLBS extend_lbs = 2;</code>
   * @return Whether the extendLbs field is set.
   */
  @Override
  public boolean hasExtendLbs() {
    return extendCase_ == 2;
  }
  /**
   * <code>.bilibili.app.dynamic.v1.DynOurCityModuleExtendLBS extend_lbs = 2;</code>
   * @return The extendLbs.
   */
  @Override
  public DynOurCityModuleExtendLBS getExtendLbs() {
    if (extendCase_ == 2) {
       return (DynOurCityModuleExtendLBS) extend_;
    }
    return DynOurCityModuleExtendLBS.getDefaultInstance();
  }
  /**
   * <code>.bilibili.app.dynamic.v1.DynOurCityModuleExtendLBS extend_lbs = 2;</code>
   */
  @Override
  public DynOurCityModuleExtendLBSOrBuilder getExtendLbsOrBuilder() {
    if (extendCase_ == 2) {
       return (DynOurCityModuleExtendLBS) extend_;
    }
    return DynOurCityModuleExtendLBS.getDefaultInstance();
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
    if (!getTypeBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, type_);
    }
    if (extendCase_ == 2) {
      output.writeMessage(2, (DynOurCityModuleExtendLBS) extend_);
    }
    unknownFields.writeTo(output);
  }

  @Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getTypeBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, type_);
    }
    if (extendCase_ == 2) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, (DynOurCityModuleExtendLBS) extend_);
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
    if (!(obj instanceof DynOurCityModuleExtend)) {
      return super.equals(obj);
    }
    DynOurCityModuleExtend other = (DynOurCityModuleExtend) obj;

    if (!getType()
        .equals(other.getType())) return false;
    if (!getExtendCase().equals(other.getExtendCase())) return false;
    switch (extendCase_) {
      case 2:
        if (!getExtendLbs()
            .equals(other.getExtendLbs())) return false;
        break;
      case 0:
      default:
    }
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
    hash = (53 * hash) + getType().hashCode();
    switch (extendCase_) {
      case 2:
        hash = (37 * hash) + EXTEND_LBS_FIELD_NUMBER;
        hash = (53 * hash) + getExtendLbs().hashCode();
        break;
      case 0:
      default:
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static DynOurCityModuleExtend parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static DynOurCityModuleExtend parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static DynOurCityModuleExtend parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static DynOurCityModuleExtend parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static DynOurCityModuleExtend parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static DynOurCityModuleExtend parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static DynOurCityModuleExtend parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static DynOurCityModuleExtend parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static DynOurCityModuleExtend parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static DynOurCityModuleExtend parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static DynOurCityModuleExtend parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static DynOurCityModuleExtend parseFrom(
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
  public static Builder newBuilder(DynOurCityModuleExtend prototype) {
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
   * 动态同城物料extend模块
   * </pre>
   *
   * Protobuf type {@code bilibili.app.dynamic.v1.DynOurCityModuleExtend}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:bilibili.app.dynamic.v1.DynOurCityModuleExtend)
      DynOurCityModuleExtendOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return DynamicOuterClass.internal_static_bilibili_app_dynamic_v1_DynOurCityModuleExtend_descriptor;
    }

    @Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return DynamicOuterClass.internal_static_bilibili_app_dynamic_v1_DynOurCityModuleExtend_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              DynOurCityModuleExtend.class, Builder.class);
    }

    // Construct using com.bapis.bilibili.app.dynamic.v1.DynOurCityModuleExtend.newBuilder()
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
      type_ = "";

      extendCase_ = 0;
      extend_ = null;
      return this;
    }

    @Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return DynamicOuterClass.internal_static_bilibili_app_dynamic_v1_DynOurCityModuleExtend_descriptor;
    }

    @Override
    public DynOurCityModuleExtend getDefaultInstanceForType() {
      return DynOurCityModuleExtend.getDefaultInstance();
    }

    @Override
    public DynOurCityModuleExtend build() {
      DynOurCityModuleExtend result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @Override
    public DynOurCityModuleExtend buildPartial() {
      DynOurCityModuleExtend result = new DynOurCityModuleExtend(this);
      result.type_ = type_;
      if (extendCase_ == 2) {
        if (extendLbsBuilder_ == null) {
          result.extend_ = extend_;
        } else {
          result.extend_ = extendLbsBuilder_.build();
        }
      }
      result.extendCase_ = extendCase_;
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
      if (other instanceof DynOurCityModuleExtend) {
        return mergeFrom((DynOurCityModuleExtend)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(DynOurCityModuleExtend other) {
      if (other == DynOurCityModuleExtend.getDefaultInstance()) return this;
      if (!other.getType().isEmpty()) {
        type_ = other.type_;
        onChanged();
      }
      switch (other.getExtendCase()) {
        case EXTEND_LBS: {
          mergeExtendLbs(other.getExtendLbs());
          break;
        }
        case EXTEND_NOT_SET: {
          break;
        }
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
      DynOurCityModuleExtend parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (DynOurCityModuleExtend) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int extendCase_ = 0;
    private Object extend_;
    public ExtendCase
        getExtendCase() {
      return ExtendCase.forNumber(
          extendCase_);
    }

    public Builder clearExtend() {
      extendCase_ = 0;
      extend_ = null;
      onChanged();
      return this;
    }


    private Object type_ = "";
    /**
     * <code>string type = 1;</code>
     * @return The type.
     */
    public String getType() {
      Object ref = type_;
      if (!(ref instanceof String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        String s = bs.toStringUtf8();
        type_ = s;
        return s;
      } else {
        return (String) ref;
      }
    }
    /**
     * <code>string type = 1;</code>
     * @return The bytes for type.
     */
    public com.google.protobuf.ByteString
        getTypeBytes() {
      Object ref = type_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (String) ref);
        type_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string type = 1;</code>
     * @param value The type to set.
     * @return This builder for chaining.
     */
    public Builder setType(
        String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      type_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string type = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearType() {
      
      type_ = getDefaultInstance().getType();
      onChanged();
      return this;
    }
    /**
     * <code>string type = 1;</code>
     * @param value The bytes for type to set.
     * @return This builder for chaining.
     */
    public Builder setTypeBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      type_ = value;
      onChanged();
      return this;
    }

    private com.google.protobuf.SingleFieldBuilderV3<
        DynOurCityModuleExtendLBS, DynOurCityModuleExtendLBS.Builder, DynOurCityModuleExtendLBSOrBuilder> extendLbsBuilder_;
    /**
     * <code>.bilibili.app.dynamic.v1.DynOurCityModuleExtendLBS extend_lbs = 2;</code>
     * @return Whether the extendLbs field is set.
     */
    @Override
    public boolean hasExtendLbs() {
      return extendCase_ == 2;
    }
    /**
     * <code>.bilibili.app.dynamic.v1.DynOurCityModuleExtendLBS extend_lbs = 2;</code>
     * @return The extendLbs.
     */
    @Override
    public DynOurCityModuleExtendLBS getExtendLbs() {
      if (extendLbsBuilder_ == null) {
        if (extendCase_ == 2) {
          return (DynOurCityModuleExtendLBS) extend_;
        }
        return DynOurCityModuleExtendLBS.getDefaultInstance();
      } else {
        if (extendCase_ == 2) {
          return extendLbsBuilder_.getMessage();
        }
        return DynOurCityModuleExtendLBS.getDefaultInstance();
      }
    }
    /**
     * <code>.bilibili.app.dynamic.v1.DynOurCityModuleExtendLBS extend_lbs = 2;</code>
     */
    public Builder setExtendLbs(DynOurCityModuleExtendLBS value) {
      if (extendLbsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        extend_ = value;
        onChanged();
      } else {
        extendLbsBuilder_.setMessage(value);
      }
      extendCase_ = 2;
      return this;
    }
    /**
     * <code>.bilibili.app.dynamic.v1.DynOurCityModuleExtendLBS extend_lbs = 2;</code>
     */
    public Builder setExtendLbs(
        DynOurCityModuleExtendLBS.Builder builderForValue) {
      if (extendLbsBuilder_ == null) {
        extend_ = builderForValue.build();
        onChanged();
      } else {
        extendLbsBuilder_.setMessage(builderForValue.build());
      }
      extendCase_ = 2;
      return this;
    }
    /**
     * <code>.bilibili.app.dynamic.v1.DynOurCityModuleExtendLBS extend_lbs = 2;</code>
     */
    public Builder mergeExtendLbs(DynOurCityModuleExtendLBS value) {
      if (extendLbsBuilder_ == null) {
        if (extendCase_ == 2 &&
            extend_ != DynOurCityModuleExtendLBS.getDefaultInstance()) {
          extend_ = DynOurCityModuleExtendLBS.newBuilder((DynOurCityModuleExtendLBS) extend_)
              .mergeFrom(value).buildPartial();
        } else {
          extend_ = value;
        }
        onChanged();
      } else {
        if (extendCase_ == 2) {
          extendLbsBuilder_.mergeFrom(value);
        }
        extendLbsBuilder_.setMessage(value);
      }
      extendCase_ = 2;
      return this;
    }
    /**
     * <code>.bilibili.app.dynamic.v1.DynOurCityModuleExtendLBS extend_lbs = 2;</code>
     */
    public Builder clearExtendLbs() {
      if (extendLbsBuilder_ == null) {
        if (extendCase_ == 2) {
          extendCase_ = 0;
          extend_ = null;
          onChanged();
        }
      } else {
        if (extendCase_ == 2) {
          extendCase_ = 0;
          extend_ = null;
        }
        extendLbsBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>.bilibili.app.dynamic.v1.DynOurCityModuleExtendLBS extend_lbs = 2;</code>
     */
    public DynOurCityModuleExtendLBS.Builder getExtendLbsBuilder() {
      return getExtendLbsFieldBuilder().getBuilder();
    }
    /**
     * <code>.bilibili.app.dynamic.v1.DynOurCityModuleExtendLBS extend_lbs = 2;</code>
     */
    @Override
    public DynOurCityModuleExtendLBSOrBuilder getExtendLbsOrBuilder() {
      if ((extendCase_ == 2) && (extendLbsBuilder_ != null)) {
        return extendLbsBuilder_.getMessageOrBuilder();
      } else {
        if (extendCase_ == 2) {
          return (DynOurCityModuleExtendLBS) extend_;
        }
        return DynOurCityModuleExtendLBS.getDefaultInstance();
      }
    }
    /**
     * <code>.bilibili.app.dynamic.v1.DynOurCityModuleExtendLBS extend_lbs = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        DynOurCityModuleExtendLBS, DynOurCityModuleExtendLBS.Builder, DynOurCityModuleExtendLBSOrBuilder>
        getExtendLbsFieldBuilder() {
      if (extendLbsBuilder_ == null) {
        if (!(extendCase_ == 2)) {
          extend_ = DynOurCityModuleExtendLBS.getDefaultInstance();
        }
        extendLbsBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            DynOurCityModuleExtendLBS, DynOurCityModuleExtendLBS.Builder, DynOurCityModuleExtendLBSOrBuilder>(
                (DynOurCityModuleExtendLBS) extend_,
                getParentForChildren(),
                isClean());
        extend_ = null;
      }
      extendCase_ = 2;
      onChanged();;
      return extendLbsBuilder_;
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


    // @@protoc_insertion_point(builder_scope:bilibili.app.dynamic.v1.DynOurCityModuleExtend)
  }

  // @@protoc_insertion_point(class_scope:bilibili.app.dynamic.v1.DynOurCityModuleExtend)
  private static final DynOurCityModuleExtend DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new DynOurCityModuleExtend();
  }

  public static DynOurCityModuleExtend getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<DynOurCityModuleExtend>
      PARSER = new com.google.protobuf.AbstractParser<DynOurCityModuleExtend>() {
    @Override
    public DynOurCityModuleExtend parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new DynOurCityModuleExtend(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<DynOurCityModuleExtend> parser() {
    return PARSER;
  }

  @Override
  public com.google.protobuf.Parser<DynOurCityModuleExtend> getParserForType() {
    return PARSER;
  }

  @Override
  public DynOurCityModuleExtend getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

