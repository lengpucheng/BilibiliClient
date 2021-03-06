// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: bilibili/app/dynamic/v2/dynamic.proto

package com.bapis.bilibili.app.dynamic.v2;

/**
 * <pre>
 * ThreePointAutoPlay 三点-自动播放
 * </pre>
 *
 * Protobuf type {@code bilibili.app.dynamic.v2.ThreePointAutoPlay}
 */
public final class ThreePointAutoPlay extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:bilibili.app.dynamic.v2.ThreePointAutoPlay)
    ThreePointAutoPlayOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ThreePointAutoPlay.newBuilder() to construct.
  private ThreePointAutoPlay(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ThreePointAutoPlay() {
    openIcon_ = "";
    openText_ = "";
    closeIcon_ = "";
    closeText_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ThreePointAutoPlay();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private ThreePointAutoPlay(
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

            openIcon_ = s;
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            openText_ = s;
            break;
          }
          case 26: {
            java.lang.String s = input.readStringRequireUtf8();

            closeIcon_ = s;
            break;
          }
          case 34: {
            java.lang.String s = input.readStringRequireUtf8();

            closeText_ = s;
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
    return com.bapis.bilibili.app.dynamic.v2.DynamicOuterClass.internal_static_bilibili_app_dynamic_v2_ThreePointAutoPlay_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.bapis.bilibili.app.dynamic.v2.DynamicOuterClass.internal_static_bilibili_app_dynamic_v2_ThreePointAutoPlay_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.bapis.bilibili.app.dynamic.v2.ThreePointAutoPlay.class, com.bapis.bilibili.app.dynamic.v2.ThreePointAutoPlay.Builder.class);
  }

  public static final int OPEN_ICON_FIELD_NUMBER = 1;
  private volatile java.lang.Object openIcon_;
  /**
   * <pre>
   * open icon
   * </pre>
   *
   * <code>string open_icon = 1;</code>
   * @return The openIcon.
   */
  @java.lang.Override
  public java.lang.String getOpenIcon() {
    java.lang.Object ref = openIcon_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      openIcon_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * open icon
   * </pre>
   *
   * <code>string open_icon = 1;</code>
   * @return The bytes for openIcon.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getOpenIconBytes() {
    java.lang.Object ref = openIcon_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      openIcon_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int OPEN_TEXT_FIELD_NUMBER = 2;
  private volatile java.lang.Object openText_;
  /**
   * <pre>
   * 开启时显示文案
   * </pre>
   *
   * <code>string open_text = 2;</code>
   * @return The openText.
   */
  @java.lang.Override
  public java.lang.String getOpenText() {
    java.lang.Object ref = openText_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      openText_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * 开启时显示文案
   * </pre>
   *
   * <code>string open_text = 2;</code>
   * @return The bytes for openText.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getOpenTextBytes() {
    java.lang.Object ref = openText_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      openText_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int CLOSE_ICON_FIELD_NUMBER = 3;
  private volatile java.lang.Object closeIcon_;
  /**
   * <pre>
   * close icon
   * </pre>
   *
   * <code>string close_icon = 3;</code>
   * @return The closeIcon.
   */
  @java.lang.Override
  public java.lang.String getCloseIcon() {
    java.lang.Object ref = closeIcon_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      closeIcon_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * close icon
   * </pre>
   *
   * <code>string close_icon = 3;</code>
   * @return The bytes for closeIcon.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getCloseIconBytes() {
    java.lang.Object ref = closeIcon_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      closeIcon_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int CLOSE_TEXT_FIELD_NUMBER = 4;
  private volatile java.lang.Object closeText_;
  /**
   * <pre>
   * 关闭时显示文案
   * </pre>
   *
   * <code>string close_text = 4;</code>
   * @return The closeText.
   */
  @java.lang.Override
  public java.lang.String getCloseText() {
    java.lang.Object ref = closeText_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      closeText_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * 关闭时显示文案
   * </pre>
   *
   * <code>string close_text = 4;</code>
   * @return The bytes for closeText.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getCloseTextBytes() {
    java.lang.Object ref = closeText_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      closeText_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
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
    if (!getOpenIconBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, openIcon_);
    }
    if (!getOpenTextBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, openText_);
    }
    if (!getCloseIconBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, closeIcon_);
    }
    if (!getCloseTextBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 4, closeText_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getOpenIconBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, openIcon_);
    }
    if (!getOpenTextBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, openText_);
    }
    if (!getCloseIconBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, closeIcon_);
    }
    if (!getCloseTextBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(4, closeText_);
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
    if (!(obj instanceof com.bapis.bilibili.app.dynamic.v2.ThreePointAutoPlay)) {
      return super.equals(obj);
    }
    com.bapis.bilibili.app.dynamic.v2.ThreePointAutoPlay other = (com.bapis.bilibili.app.dynamic.v2.ThreePointAutoPlay) obj;

    if (!getOpenIcon()
        .equals(other.getOpenIcon())) return false;
    if (!getOpenText()
        .equals(other.getOpenText())) return false;
    if (!getCloseIcon()
        .equals(other.getCloseIcon())) return false;
    if (!getCloseText()
        .equals(other.getCloseText())) return false;
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
    hash = (37 * hash) + OPEN_ICON_FIELD_NUMBER;
    hash = (53 * hash) + getOpenIcon().hashCode();
    hash = (37 * hash) + OPEN_TEXT_FIELD_NUMBER;
    hash = (53 * hash) + getOpenText().hashCode();
    hash = (37 * hash) + CLOSE_ICON_FIELD_NUMBER;
    hash = (53 * hash) + getCloseIcon().hashCode();
    hash = (37 * hash) + CLOSE_TEXT_FIELD_NUMBER;
    hash = (53 * hash) + getCloseText().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.bapis.bilibili.app.dynamic.v2.ThreePointAutoPlay parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.bapis.bilibili.app.dynamic.v2.ThreePointAutoPlay parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.bapis.bilibili.app.dynamic.v2.ThreePointAutoPlay parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.bapis.bilibili.app.dynamic.v2.ThreePointAutoPlay parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.bapis.bilibili.app.dynamic.v2.ThreePointAutoPlay parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.bapis.bilibili.app.dynamic.v2.ThreePointAutoPlay parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.bapis.bilibili.app.dynamic.v2.ThreePointAutoPlay parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.bapis.bilibili.app.dynamic.v2.ThreePointAutoPlay parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.bapis.bilibili.app.dynamic.v2.ThreePointAutoPlay parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.bapis.bilibili.app.dynamic.v2.ThreePointAutoPlay parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.bapis.bilibili.app.dynamic.v2.ThreePointAutoPlay parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.bapis.bilibili.app.dynamic.v2.ThreePointAutoPlay parseFrom(
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
  public static Builder newBuilder(com.bapis.bilibili.app.dynamic.v2.ThreePointAutoPlay prototype) {
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
   * ThreePointAutoPlay 三点-自动播放
   * </pre>
   *
   * Protobuf type {@code bilibili.app.dynamic.v2.ThreePointAutoPlay}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:bilibili.app.dynamic.v2.ThreePointAutoPlay)
      com.bapis.bilibili.app.dynamic.v2.ThreePointAutoPlayOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.bapis.bilibili.app.dynamic.v2.DynamicOuterClass.internal_static_bilibili_app_dynamic_v2_ThreePointAutoPlay_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.bapis.bilibili.app.dynamic.v2.DynamicOuterClass.internal_static_bilibili_app_dynamic_v2_ThreePointAutoPlay_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.bapis.bilibili.app.dynamic.v2.ThreePointAutoPlay.class, com.bapis.bilibili.app.dynamic.v2.ThreePointAutoPlay.Builder.class);
    }

    // Construct using com.bapis.bilibili.app.dynamic.v2.ThreePointAutoPlay.newBuilder()
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
      openIcon_ = "";

      openText_ = "";

      closeIcon_ = "";

      closeText_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.bapis.bilibili.app.dynamic.v2.DynamicOuterClass.internal_static_bilibili_app_dynamic_v2_ThreePointAutoPlay_descriptor;
    }

    @java.lang.Override
    public com.bapis.bilibili.app.dynamic.v2.ThreePointAutoPlay getDefaultInstanceForType() {
      return com.bapis.bilibili.app.dynamic.v2.ThreePointAutoPlay.getDefaultInstance();
    }

    @java.lang.Override
    public com.bapis.bilibili.app.dynamic.v2.ThreePointAutoPlay build() {
      com.bapis.bilibili.app.dynamic.v2.ThreePointAutoPlay result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.bapis.bilibili.app.dynamic.v2.ThreePointAutoPlay buildPartial() {
      com.bapis.bilibili.app.dynamic.v2.ThreePointAutoPlay result = new com.bapis.bilibili.app.dynamic.v2.ThreePointAutoPlay(this);
      result.openIcon_ = openIcon_;
      result.openText_ = openText_;
      result.closeIcon_ = closeIcon_;
      result.closeText_ = closeText_;
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
      if (other instanceof com.bapis.bilibili.app.dynamic.v2.ThreePointAutoPlay) {
        return mergeFrom((com.bapis.bilibili.app.dynamic.v2.ThreePointAutoPlay)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.bapis.bilibili.app.dynamic.v2.ThreePointAutoPlay other) {
      if (other == com.bapis.bilibili.app.dynamic.v2.ThreePointAutoPlay.getDefaultInstance()) return this;
      if (!other.getOpenIcon().isEmpty()) {
        openIcon_ = other.openIcon_;
        onChanged();
      }
      if (!other.getOpenText().isEmpty()) {
        openText_ = other.openText_;
        onChanged();
      }
      if (!other.getCloseIcon().isEmpty()) {
        closeIcon_ = other.closeIcon_;
        onChanged();
      }
      if (!other.getCloseText().isEmpty()) {
        closeText_ = other.closeText_;
        onChanged();
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
      com.bapis.bilibili.app.dynamic.v2.ThreePointAutoPlay parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.bapis.bilibili.app.dynamic.v2.ThreePointAutoPlay) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object openIcon_ = "";
    /**
     * <pre>
     * open icon
     * </pre>
     *
     * <code>string open_icon = 1;</code>
     * @return The openIcon.
     */
    public java.lang.String getOpenIcon() {
      java.lang.Object ref = openIcon_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        openIcon_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * open icon
     * </pre>
     *
     * <code>string open_icon = 1;</code>
     * @return The bytes for openIcon.
     */
    public com.google.protobuf.ByteString
        getOpenIconBytes() {
      java.lang.Object ref = openIcon_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        openIcon_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * open icon
     * </pre>
     *
     * <code>string open_icon = 1;</code>
     * @param value The openIcon to set.
     * @return This builder for chaining.
     */
    public Builder setOpenIcon(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      openIcon_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * open icon
     * </pre>
     *
     * <code>string open_icon = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearOpenIcon() {
      
      openIcon_ = getDefaultInstance().getOpenIcon();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * open icon
     * </pre>
     *
     * <code>string open_icon = 1;</code>
     * @param value The bytes for openIcon to set.
     * @return This builder for chaining.
     */
    public Builder setOpenIconBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      openIcon_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object openText_ = "";
    /**
     * <pre>
     * 开启时显示文案
     * </pre>
     *
     * <code>string open_text = 2;</code>
     * @return The openText.
     */
    public java.lang.String getOpenText() {
      java.lang.Object ref = openText_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        openText_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * 开启时显示文案
     * </pre>
     *
     * <code>string open_text = 2;</code>
     * @return The bytes for openText.
     */
    public com.google.protobuf.ByteString
        getOpenTextBytes() {
      java.lang.Object ref = openText_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        openText_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * 开启时显示文案
     * </pre>
     *
     * <code>string open_text = 2;</code>
     * @param value The openText to set.
     * @return This builder for chaining.
     */
    public Builder setOpenText(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      openText_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 开启时显示文案
     * </pre>
     *
     * <code>string open_text = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearOpenText() {
      
      openText_ = getDefaultInstance().getOpenText();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 开启时显示文案
     * </pre>
     *
     * <code>string open_text = 2;</code>
     * @param value The bytes for openText to set.
     * @return This builder for chaining.
     */
    public Builder setOpenTextBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      openText_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object closeIcon_ = "";
    /**
     * <pre>
     * close icon
     * </pre>
     *
     * <code>string close_icon = 3;</code>
     * @return The closeIcon.
     */
    public java.lang.String getCloseIcon() {
      java.lang.Object ref = closeIcon_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        closeIcon_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * close icon
     * </pre>
     *
     * <code>string close_icon = 3;</code>
     * @return The bytes for closeIcon.
     */
    public com.google.protobuf.ByteString
        getCloseIconBytes() {
      java.lang.Object ref = closeIcon_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        closeIcon_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * close icon
     * </pre>
     *
     * <code>string close_icon = 3;</code>
     * @param value The closeIcon to set.
     * @return This builder for chaining.
     */
    public Builder setCloseIcon(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      closeIcon_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * close icon
     * </pre>
     *
     * <code>string close_icon = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearCloseIcon() {
      
      closeIcon_ = getDefaultInstance().getCloseIcon();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * close icon
     * </pre>
     *
     * <code>string close_icon = 3;</code>
     * @param value The bytes for closeIcon to set.
     * @return This builder for chaining.
     */
    public Builder setCloseIconBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      closeIcon_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object closeText_ = "";
    /**
     * <pre>
     * 关闭时显示文案
     * </pre>
     *
     * <code>string close_text = 4;</code>
     * @return The closeText.
     */
    public java.lang.String getCloseText() {
      java.lang.Object ref = closeText_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        closeText_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * 关闭时显示文案
     * </pre>
     *
     * <code>string close_text = 4;</code>
     * @return The bytes for closeText.
     */
    public com.google.protobuf.ByteString
        getCloseTextBytes() {
      java.lang.Object ref = closeText_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        closeText_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * 关闭时显示文案
     * </pre>
     *
     * <code>string close_text = 4;</code>
     * @param value The closeText to set.
     * @return This builder for chaining.
     */
    public Builder setCloseText(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      closeText_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 关闭时显示文案
     * </pre>
     *
     * <code>string close_text = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearCloseText() {
      
      closeText_ = getDefaultInstance().getCloseText();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 关闭时显示文案
     * </pre>
     *
     * <code>string close_text = 4;</code>
     * @param value The bytes for closeText to set.
     * @return This builder for chaining.
     */
    public Builder setCloseTextBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      closeText_ = value;
      onChanged();
      return this;
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


    // @@protoc_insertion_point(builder_scope:bilibili.app.dynamic.v2.ThreePointAutoPlay)
  }

  // @@protoc_insertion_point(class_scope:bilibili.app.dynamic.v2.ThreePointAutoPlay)
  private static final com.bapis.bilibili.app.dynamic.v2.ThreePointAutoPlay DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.bapis.bilibili.app.dynamic.v2.ThreePointAutoPlay();
  }

  public static com.bapis.bilibili.app.dynamic.v2.ThreePointAutoPlay getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ThreePointAutoPlay>
      PARSER = new com.google.protobuf.AbstractParser<ThreePointAutoPlay>() {
    @java.lang.Override
    public ThreePointAutoPlay parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new ThreePointAutoPlay(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<ThreePointAutoPlay> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ThreePointAutoPlay> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.bapis.bilibili.app.dynamic.v2.ThreePointAutoPlay getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

