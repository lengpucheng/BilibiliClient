// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: bilibili/app/dynamic/v1/dynamic.proto

package com.bapis.bilibili.app.dynamic.v1;

/**
 * <pre>
 * VipInfo 大会员信息
 * </pre>
 *
 * Protobuf type {@code bilibili.app.dynamic.v1.VipInfo}
 */
public final class VipInfo extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:bilibili.app.dynamic.v1.VipInfo)
    VipInfoOrBuilder {
private static final long serialVersionUID = 0L;
  // Use VipInfo.newBuilder() to construct.
  private VipInfo(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private VipInfo() {
  }

  @Override
  @SuppressWarnings({"unused"})
  protected Object newInstance(
      UnusedPrivateParameter unused) {
    return new VipInfo();
  }

  @Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private VipInfo(
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
          case 16: {

            status_ = input.readInt32();
            break;
          }
          case 24: {

            dueDate_ = input.readInt64();
            break;
          }
          case 34: {
            VipLabel.Builder subBuilder = null;
            if (label_ != null) {
              subBuilder = label_.toBuilder();
            }
            label_ = input.readMessage(VipLabel.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(label_);
              label_ = subBuilder.buildPartial();
            }

            break;
          }
          case 40: {

            themeType_ = input.readInt32();
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
    return DynamicOuterClass.internal_static_bilibili_app_dynamic_v1_VipInfo_descriptor;
  }

  @Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return DynamicOuterClass.internal_static_bilibili_app_dynamic_v1_VipInfo_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            VipInfo.class, Builder.class);
  }

  public static final int TYPE_FIELD_NUMBER = 1;
  private int type_;
  /**
   * <pre>
   * 大会员类型
   * </pre>
   *
   * <code>int32 Type = 1;</code>
   * @return The type.
   */
  @Override
  public int getType() {
    return type_;
  }

  public static final int STATUS_FIELD_NUMBER = 2;
  private int status_;
  /**
   * <pre>
   * 大会员状态
   * </pre>
   *
   * <code>int32 status = 2;</code>
   * @return The status.
   */
  @Override
  public int getStatus() {
    return status_;
  }

  public static final int DUE_DATE_FIELD_NUMBER = 3;
  private long dueDate_;
  /**
   * <pre>
   * 到期时间
   * </pre>
   *
   * <code>int64 due_date = 3;</code>
   * @return The dueDate.
   */
  @Override
  public long getDueDate() {
    return dueDate_;
  }

  public static final int LABEL_FIELD_NUMBER = 4;
  private VipLabel label_;
  /**
   * <pre>
   * 标签
   * </pre>
   *
   * <code>.bilibili.app.dynamic.v1.VipLabel label = 4;</code>
   * @return Whether the label field is set.
   */
  @Override
  public boolean hasLabel() {
    return label_ != null;
  }
  /**
   * <pre>
   * 标签
   * </pre>
   *
   * <code>.bilibili.app.dynamic.v1.VipLabel label = 4;</code>
   * @return The label.
   */
  @Override
  public VipLabel getLabel() {
    return label_ == null ? VipLabel.getDefaultInstance() : label_;
  }
  /**
   * <pre>
   * 标签
   * </pre>
   *
   * <code>.bilibili.app.dynamic.v1.VipLabel label = 4;</code>
   */
  @Override
  public VipLabelOrBuilder getLabelOrBuilder() {
    return getLabel();
  }

  public static final int THEME_TYPE_FIELD_NUMBER = 5;
  private int themeType_;
  /**
   * <pre>
   * 主题
   * </pre>
   *
   * <code>int32 theme_type = 5;</code>
   * @return The themeType.
   */
  @Override
  public int getThemeType() {
    return themeType_;
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
    if (status_ != 0) {
      output.writeInt32(2, status_);
    }
    if (dueDate_ != 0L) {
      output.writeInt64(3, dueDate_);
    }
    if (label_ != null) {
      output.writeMessage(4, getLabel());
    }
    if (themeType_ != 0) {
      output.writeInt32(5, themeType_);
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
    if (status_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(2, status_);
    }
    if (dueDate_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(3, dueDate_);
    }
    if (label_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(4, getLabel());
    }
    if (themeType_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(5, themeType_);
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
    if (!(obj instanceof VipInfo)) {
      return super.equals(obj);
    }
    VipInfo other = (VipInfo) obj;

    if (getType()
        != other.getType()) return false;
    if (getStatus()
        != other.getStatus()) return false;
    if (getDueDate()
        != other.getDueDate()) return false;
    if (hasLabel() != other.hasLabel()) return false;
    if (hasLabel()) {
      if (!getLabel()
          .equals(other.getLabel())) return false;
    }
    if (getThemeType()
        != other.getThemeType()) return false;
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
    hash = (37 * hash) + STATUS_FIELD_NUMBER;
    hash = (53 * hash) + getStatus();
    hash = (37 * hash) + DUE_DATE_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getDueDate());
    if (hasLabel()) {
      hash = (37 * hash) + LABEL_FIELD_NUMBER;
      hash = (53 * hash) + getLabel().hashCode();
    }
    hash = (37 * hash) + THEME_TYPE_FIELD_NUMBER;
    hash = (53 * hash) + getThemeType();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static VipInfo parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static VipInfo parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static VipInfo parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static VipInfo parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static VipInfo parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static VipInfo parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static VipInfo parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static VipInfo parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static VipInfo parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static VipInfo parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static VipInfo parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static VipInfo parseFrom(
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
  public static Builder newBuilder(VipInfo prototype) {
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
   * VipInfo 大会员信息
   * </pre>
   *
   * Protobuf type {@code bilibili.app.dynamic.v1.VipInfo}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:bilibili.app.dynamic.v1.VipInfo)
      VipInfoOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return DynamicOuterClass.internal_static_bilibili_app_dynamic_v1_VipInfo_descriptor;
    }

    @Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return DynamicOuterClass.internal_static_bilibili_app_dynamic_v1_VipInfo_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              VipInfo.class, Builder.class);
    }

    // Construct using com.bapis.bilibili.app.dynamic.v1.VipInfo.newBuilder()
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

      status_ = 0;

      dueDate_ = 0L;

      if (labelBuilder_ == null) {
        label_ = null;
      } else {
        label_ = null;
        labelBuilder_ = null;
      }
      themeType_ = 0;

      return this;
    }

    @Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return DynamicOuterClass.internal_static_bilibili_app_dynamic_v1_VipInfo_descriptor;
    }

    @Override
    public VipInfo getDefaultInstanceForType() {
      return VipInfo.getDefaultInstance();
    }

    @Override
    public VipInfo build() {
      VipInfo result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @Override
    public VipInfo buildPartial() {
      VipInfo result = new VipInfo(this);
      result.type_ = type_;
      result.status_ = status_;
      result.dueDate_ = dueDate_;
      if (labelBuilder_ == null) {
        result.label_ = label_;
      } else {
        result.label_ = labelBuilder_.build();
      }
      result.themeType_ = themeType_;
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
      if (other instanceof VipInfo) {
        return mergeFrom((VipInfo)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(VipInfo other) {
      if (other == VipInfo.getDefaultInstance()) return this;
      if (other.getType() != 0) {
        setType(other.getType());
      }
      if (other.getStatus() != 0) {
        setStatus(other.getStatus());
      }
      if (other.getDueDate() != 0L) {
        setDueDate(other.getDueDate());
      }
      if (other.hasLabel()) {
        mergeLabel(other.getLabel());
      }
      if (other.getThemeType() != 0) {
        setThemeType(other.getThemeType());
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
      VipInfo parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (VipInfo) e.getUnfinishedMessage();
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
     * 大会员类型
     * </pre>
     *
     * <code>int32 Type = 1;</code>
     * @return The type.
     */
    @Override
    public int getType() {
      return type_;
    }
    /**
     * <pre>
     * 大会员类型
     * </pre>
     *
     * <code>int32 Type = 1;</code>
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
     * 大会员类型
     * </pre>
     *
     * <code>int32 Type = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearType() {
      
      type_ = 0;
      onChanged();
      return this;
    }

    private int status_ ;
    /**
     * <pre>
     * 大会员状态
     * </pre>
     *
     * <code>int32 status = 2;</code>
     * @return The status.
     */
    @Override
    public int getStatus() {
      return status_;
    }
    /**
     * <pre>
     * 大会员状态
     * </pre>
     *
     * <code>int32 status = 2;</code>
     * @param value The status to set.
     * @return This builder for chaining.
     */
    public Builder setStatus(int value) {
      
      status_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 大会员状态
     * </pre>
     *
     * <code>int32 status = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearStatus() {
      
      status_ = 0;
      onChanged();
      return this;
    }

    private long dueDate_ ;
    /**
     * <pre>
     * 到期时间
     * </pre>
     *
     * <code>int64 due_date = 3;</code>
     * @return The dueDate.
     */
    @Override
    public long getDueDate() {
      return dueDate_;
    }
    /**
     * <pre>
     * 到期时间
     * </pre>
     *
     * <code>int64 due_date = 3;</code>
     * @param value The dueDate to set.
     * @return This builder for chaining.
     */
    public Builder setDueDate(long value) {
      
      dueDate_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 到期时间
     * </pre>
     *
     * <code>int64 due_date = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearDueDate() {
      
      dueDate_ = 0L;
      onChanged();
      return this;
    }

    private VipLabel label_;
    private com.google.protobuf.SingleFieldBuilderV3<
        VipLabel, VipLabel.Builder, VipLabelOrBuilder> labelBuilder_;
    /**
     * <pre>
     * 标签
     * </pre>
     *
     * <code>.bilibili.app.dynamic.v1.VipLabel label = 4;</code>
     * @return Whether the label field is set.
     */
    public boolean hasLabel() {
      return labelBuilder_ != null || label_ != null;
    }
    /**
     * <pre>
     * 标签
     * </pre>
     *
     * <code>.bilibili.app.dynamic.v1.VipLabel label = 4;</code>
     * @return The label.
     */
    public VipLabel getLabel() {
      if (labelBuilder_ == null) {
        return label_ == null ? VipLabel.getDefaultInstance() : label_;
      } else {
        return labelBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * 标签
     * </pre>
     *
     * <code>.bilibili.app.dynamic.v1.VipLabel label = 4;</code>
     */
    public Builder setLabel(VipLabel value) {
      if (labelBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        label_ = value;
        onChanged();
      } else {
        labelBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * 标签
     * </pre>
     *
     * <code>.bilibili.app.dynamic.v1.VipLabel label = 4;</code>
     */
    public Builder setLabel(
        VipLabel.Builder builderForValue) {
      if (labelBuilder_ == null) {
        label_ = builderForValue.build();
        onChanged();
      } else {
        labelBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * 标签
     * </pre>
     *
     * <code>.bilibili.app.dynamic.v1.VipLabel label = 4;</code>
     */
    public Builder mergeLabel(VipLabel value) {
      if (labelBuilder_ == null) {
        if (label_ != null) {
          label_ =
            VipLabel.newBuilder(label_).mergeFrom(value).buildPartial();
        } else {
          label_ = value;
        }
        onChanged();
      } else {
        labelBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * 标签
     * </pre>
     *
     * <code>.bilibili.app.dynamic.v1.VipLabel label = 4;</code>
     */
    public Builder clearLabel() {
      if (labelBuilder_ == null) {
        label_ = null;
        onChanged();
      } else {
        label_ = null;
        labelBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * 标签
     * </pre>
     *
     * <code>.bilibili.app.dynamic.v1.VipLabel label = 4;</code>
     */
    public VipLabel.Builder getLabelBuilder() {
      
      onChanged();
      return getLabelFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * 标签
     * </pre>
     *
     * <code>.bilibili.app.dynamic.v1.VipLabel label = 4;</code>
     */
    public VipLabelOrBuilder getLabelOrBuilder() {
      if (labelBuilder_ != null) {
        return labelBuilder_.getMessageOrBuilder();
      } else {
        return label_ == null ?
            VipLabel.getDefaultInstance() : label_;
      }
    }
    /**
     * <pre>
     * 标签
     * </pre>
     *
     * <code>.bilibili.app.dynamic.v1.VipLabel label = 4;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        VipLabel, VipLabel.Builder, VipLabelOrBuilder>
        getLabelFieldBuilder() {
      if (labelBuilder_ == null) {
        labelBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            VipLabel, VipLabel.Builder, VipLabelOrBuilder>(
                getLabel(),
                getParentForChildren(),
                isClean());
        label_ = null;
      }
      return labelBuilder_;
    }

    private int themeType_ ;
    /**
     * <pre>
     * 主题
     * </pre>
     *
     * <code>int32 theme_type = 5;</code>
     * @return The themeType.
     */
    @Override
    public int getThemeType() {
      return themeType_;
    }
    /**
     * <pre>
     * 主题
     * </pre>
     *
     * <code>int32 theme_type = 5;</code>
     * @param value The themeType to set.
     * @return This builder for chaining.
     */
    public Builder setThemeType(int value) {
      
      themeType_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 主题
     * </pre>
     *
     * <code>int32 theme_type = 5;</code>
     * @return This builder for chaining.
     */
    public Builder clearThemeType() {
      
      themeType_ = 0;
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


    // @@protoc_insertion_point(builder_scope:bilibili.app.dynamic.v1.VipInfo)
  }

  // @@protoc_insertion_point(class_scope:bilibili.app.dynamic.v1.VipInfo)
  private static final VipInfo DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new VipInfo();
  }

  public static VipInfo getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<VipInfo>
      PARSER = new com.google.protobuf.AbstractParser<VipInfo>() {
    @Override
    public VipInfo parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new VipInfo(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<VipInfo> parser() {
    return PARSER;
  }

  @Override
  public com.google.protobuf.Parser<VipInfo> getParserForType() {
    return PARSER;
  }

  @Override
  public VipInfo getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

