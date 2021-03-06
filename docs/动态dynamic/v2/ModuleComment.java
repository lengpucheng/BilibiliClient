// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: bilibili/app/dynamic/v2/dynamic.proto

package com.bapis.bilibili.app.dynamic.v2;

/**
 * <pre>
 * ModuleComment 评论外露模块
 * </pre>
 *
 * Protobuf type {@code bilibili.app.dynamic.v2.ModuleComment}
 */
public final class ModuleComment extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:bilibili.app.dynamic.v2.ModuleComment)
    ModuleCommentOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ModuleComment.newBuilder() to construct.
  private ModuleComment(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ModuleComment() {
    cmtShowItem_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ModuleComment();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private ModuleComment(
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
            if (!((mutable_bitField0_ & 0x00000001) != 0)) {
              cmtShowItem_ = new java.util.ArrayList<com.bapis.bilibili.app.dynamic.v2.CmtShowItem>();
              mutable_bitField0_ |= 0x00000001;
            }
            cmtShowItem_.add(
                input.readMessage(com.bapis.bilibili.app.dynamic.v2.CmtShowItem.parser(), extensionRegistry));
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
        cmtShowItem_ = java.util.Collections.unmodifiableList(cmtShowItem_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.bapis.bilibili.app.dynamic.v2.DynamicOuterClass.internal_static_bilibili_app_dynamic_v2_ModuleComment_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.bapis.bilibili.app.dynamic.v2.DynamicOuterClass.internal_static_bilibili_app_dynamic_v2_ModuleComment_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.bapis.bilibili.app.dynamic.v2.ModuleComment.class, com.bapis.bilibili.app.dynamic.v2.ModuleComment.Builder.class);
  }

  public static final int CMTSHOWITEM_FIELD_NUMBER = 1;
  private java.util.List<com.bapis.bilibili.app.dynamic.v2.CmtShowItem> cmtShowItem_;
  /**
   * <code>repeated .bilibili.app.dynamic.v2.CmtShowItem cmtShowItem = 1;</code>
   */
  @java.lang.Override
  public java.util.List<com.bapis.bilibili.app.dynamic.v2.CmtShowItem> getCmtShowItemList() {
    return cmtShowItem_;
  }
  /**
   * <code>repeated .bilibili.app.dynamic.v2.CmtShowItem cmtShowItem = 1;</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.bapis.bilibili.app.dynamic.v2.CmtShowItemOrBuilder> 
      getCmtShowItemOrBuilderList() {
    return cmtShowItem_;
  }
  /**
   * <code>repeated .bilibili.app.dynamic.v2.CmtShowItem cmtShowItem = 1;</code>
   */
  @java.lang.Override
  public int getCmtShowItemCount() {
    return cmtShowItem_.size();
  }
  /**
   * <code>repeated .bilibili.app.dynamic.v2.CmtShowItem cmtShowItem = 1;</code>
   */
  @java.lang.Override
  public com.bapis.bilibili.app.dynamic.v2.CmtShowItem getCmtShowItem(int index) {
    return cmtShowItem_.get(index);
  }
  /**
   * <code>repeated .bilibili.app.dynamic.v2.CmtShowItem cmtShowItem = 1;</code>
   */
  @java.lang.Override
  public com.bapis.bilibili.app.dynamic.v2.CmtShowItemOrBuilder getCmtShowItemOrBuilder(
      int index) {
    return cmtShowItem_.get(index);
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
    for (int i = 0; i < cmtShowItem_.size(); i++) {
      output.writeMessage(1, cmtShowItem_.get(i));
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < cmtShowItem_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, cmtShowItem_.get(i));
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
    if (!(obj instanceof com.bapis.bilibili.app.dynamic.v2.ModuleComment)) {
      return super.equals(obj);
    }
    com.bapis.bilibili.app.dynamic.v2.ModuleComment other = (com.bapis.bilibili.app.dynamic.v2.ModuleComment) obj;

    if (!getCmtShowItemList()
        .equals(other.getCmtShowItemList())) return false;
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
    if (getCmtShowItemCount() > 0) {
      hash = (37 * hash) + CMTSHOWITEM_FIELD_NUMBER;
      hash = (53 * hash) + getCmtShowItemList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.bapis.bilibili.app.dynamic.v2.ModuleComment parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.bapis.bilibili.app.dynamic.v2.ModuleComment parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.bapis.bilibili.app.dynamic.v2.ModuleComment parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.bapis.bilibili.app.dynamic.v2.ModuleComment parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.bapis.bilibili.app.dynamic.v2.ModuleComment parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.bapis.bilibili.app.dynamic.v2.ModuleComment parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.bapis.bilibili.app.dynamic.v2.ModuleComment parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.bapis.bilibili.app.dynamic.v2.ModuleComment parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.bapis.bilibili.app.dynamic.v2.ModuleComment parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.bapis.bilibili.app.dynamic.v2.ModuleComment parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.bapis.bilibili.app.dynamic.v2.ModuleComment parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.bapis.bilibili.app.dynamic.v2.ModuleComment parseFrom(
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
  public static Builder newBuilder(com.bapis.bilibili.app.dynamic.v2.ModuleComment prototype) {
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
   * ModuleComment 评论外露模块
   * </pre>
   *
   * Protobuf type {@code bilibili.app.dynamic.v2.ModuleComment}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:bilibili.app.dynamic.v2.ModuleComment)
      com.bapis.bilibili.app.dynamic.v2.ModuleCommentOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.bapis.bilibili.app.dynamic.v2.DynamicOuterClass.internal_static_bilibili_app_dynamic_v2_ModuleComment_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.bapis.bilibili.app.dynamic.v2.DynamicOuterClass.internal_static_bilibili_app_dynamic_v2_ModuleComment_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.bapis.bilibili.app.dynamic.v2.ModuleComment.class, com.bapis.bilibili.app.dynamic.v2.ModuleComment.Builder.class);
    }

    // Construct using com.bapis.bilibili.app.dynamic.v2.ModuleComment.newBuilder()
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
        getCmtShowItemFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (cmtShowItemBuilder_ == null) {
        cmtShowItem_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        cmtShowItemBuilder_.clear();
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.bapis.bilibili.app.dynamic.v2.DynamicOuterClass.internal_static_bilibili_app_dynamic_v2_ModuleComment_descriptor;
    }

    @java.lang.Override
    public com.bapis.bilibili.app.dynamic.v2.ModuleComment getDefaultInstanceForType() {
      return com.bapis.bilibili.app.dynamic.v2.ModuleComment.getDefaultInstance();
    }

    @java.lang.Override
    public com.bapis.bilibili.app.dynamic.v2.ModuleComment build() {
      com.bapis.bilibili.app.dynamic.v2.ModuleComment result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.bapis.bilibili.app.dynamic.v2.ModuleComment buildPartial() {
      com.bapis.bilibili.app.dynamic.v2.ModuleComment result = new com.bapis.bilibili.app.dynamic.v2.ModuleComment(this);
      int from_bitField0_ = bitField0_;
      if (cmtShowItemBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          cmtShowItem_ = java.util.Collections.unmodifiableList(cmtShowItem_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.cmtShowItem_ = cmtShowItem_;
      } else {
        result.cmtShowItem_ = cmtShowItemBuilder_.build();
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
      if (other instanceof com.bapis.bilibili.app.dynamic.v2.ModuleComment) {
        return mergeFrom((com.bapis.bilibili.app.dynamic.v2.ModuleComment)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.bapis.bilibili.app.dynamic.v2.ModuleComment other) {
      if (other == com.bapis.bilibili.app.dynamic.v2.ModuleComment.getDefaultInstance()) return this;
      if (cmtShowItemBuilder_ == null) {
        if (!other.cmtShowItem_.isEmpty()) {
          if (cmtShowItem_.isEmpty()) {
            cmtShowItem_ = other.cmtShowItem_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureCmtShowItemIsMutable();
            cmtShowItem_.addAll(other.cmtShowItem_);
          }
          onChanged();
        }
      } else {
        if (!other.cmtShowItem_.isEmpty()) {
          if (cmtShowItemBuilder_.isEmpty()) {
            cmtShowItemBuilder_.dispose();
            cmtShowItemBuilder_ = null;
            cmtShowItem_ = other.cmtShowItem_;
            bitField0_ = (bitField0_ & ~0x00000001);
            cmtShowItemBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getCmtShowItemFieldBuilder() : null;
          } else {
            cmtShowItemBuilder_.addAllMessages(other.cmtShowItem_);
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
      com.bapis.bilibili.app.dynamic.v2.ModuleComment parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.bapis.bilibili.app.dynamic.v2.ModuleComment) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.util.List<com.bapis.bilibili.app.dynamic.v2.CmtShowItem> cmtShowItem_ =
      java.util.Collections.emptyList();
    private void ensureCmtShowItemIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        cmtShowItem_ = new java.util.ArrayList<com.bapis.bilibili.app.dynamic.v2.CmtShowItem>(cmtShowItem_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.bapis.bilibili.app.dynamic.v2.CmtShowItem, com.bapis.bilibili.app.dynamic.v2.CmtShowItem.Builder, com.bapis.bilibili.app.dynamic.v2.CmtShowItemOrBuilder> cmtShowItemBuilder_;

    /**
     * <code>repeated .bilibili.app.dynamic.v2.CmtShowItem cmtShowItem = 1;</code>
     */
    public java.util.List<com.bapis.bilibili.app.dynamic.v2.CmtShowItem> getCmtShowItemList() {
      if (cmtShowItemBuilder_ == null) {
        return java.util.Collections.unmodifiableList(cmtShowItem_);
      } else {
        return cmtShowItemBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .bilibili.app.dynamic.v2.CmtShowItem cmtShowItem = 1;</code>
     */
    public int getCmtShowItemCount() {
      if (cmtShowItemBuilder_ == null) {
        return cmtShowItem_.size();
      } else {
        return cmtShowItemBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .bilibili.app.dynamic.v2.CmtShowItem cmtShowItem = 1;</code>
     */
    public com.bapis.bilibili.app.dynamic.v2.CmtShowItem getCmtShowItem(int index) {
      if (cmtShowItemBuilder_ == null) {
        return cmtShowItem_.get(index);
      } else {
        return cmtShowItemBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .bilibili.app.dynamic.v2.CmtShowItem cmtShowItem = 1;</code>
     */
    public Builder setCmtShowItem(
        int index, com.bapis.bilibili.app.dynamic.v2.CmtShowItem value) {
      if (cmtShowItemBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureCmtShowItemIsMutable();
        cmtShowItem_.set(index, value);
        onChanged();
      } else {
        cmtShowItemBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .bilibili.app.dynamic.v2.CmtShowItem cmtShowItem = 1;</code>
     */
    public Builder setCmtShowItem(
        int index, com.bapis.bilibili.app.dynamic.v2.CmtShowItem.Builder builderForValue) {
      if (cmtShowItemBuilder_ == null) {
        ensureCmtShowItemIsMutable();
        cmtShowItem_.set(index, builderForValue.build());
        onChanged();
      } else {
        cmtShowItemBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .bilibili.app.dynamic.v2.CmtShowItem cmtShowItem = 1;</code>
     */
    public Builder addCmtShowItem(com.bapis.bilibili.app.dynamic.v2.CmtShowItem value) {
      if (cmtShowItemBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureCmtShowItemIsMutable();
        cmtShowItem_.add(value);
        onChanged();
      } else {
        cmtShowItemBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .bilibili.app.dynamic.v2.CmtShowItem cmtShowItem = 1;</code>
     */
    public Builder addCmtShowItem(
        int index, com.bapis.bilibili.app.dynamic.v2.CmtShowItem value) {
      if (cmtShowItemBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureCmtShowItemIsMutable();
        cmtShowItem_.add(index, value);
        onChanged();
      } else {
        cmtShowItemBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .bilibili.app.dynamic.v2.CmtShowItem cmtShowItem = 1;</code>
     */
    public Builder addCmtShowItem(
        com.bapis.bilibili.app.dynamic.v2.CmtShowItem.Builder builderForValue) {
      if (cmtShowItemBuilder_ == null) {
        ensureCmtShowItemIsMutable();
        cmtShowItem_.add(builderForValue.build());
        onChanged();
      } else {
        cmtShowItemBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .bilibili.app.dynamic.v2.CmtShowItem cmtShowItem = 1;</code>
     */
    public Builder addCmtShowItem(
        int index, com.bapis.bilibili.app.dynamic.v2.CmtShowItem.Builder builderForValue) {
      if (cmtShowItemBuilder_ == null) {
        ensureCmtShowItemIsMutable();
        cmtShowItem_.add(index, builderForValue.build());
        onChanged();
      } else {
        cmtShowItemBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .bilibili.app.dynamic.v2.CmtShowItem cmtShowItem = 1;</code>
     */
    public Builder addAllCmtShowItem(
        java.lang.Iterable<? extends com.bapis.bilibili.app.dynamic.v2.CmtShowItem> values) {
      if (cmtShowItemBuilder_ == null) {
        ensureCmtShowItemIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, cmtShowItem_);
        onChanged();
      } else {
        cmtShowItemBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .bilibili.app.dynamic.v2.CmtShowItem cmtShowItem = 1;</code>
     */
    public Builder clearCmtShowItem() {
      if (cmtShowItemBuilder_ == null) {
        cmtShowItem_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        cmtShowItemBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .bilibili.app.dynamic.v2.CmtShowItem cmtShowItem = 1;</code>
     */
    public Builder removeCmtShowItem(int index) {
      if (cmtShowItemBuilder_ == null) {
        ensureCmtShowItemIsMutable();
        cmtShowItem_.remove(index);
        onChanged();
      } else {
        cmtShowItemBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .bilibili.app.dynamic.v2.CmtShowItem cmtShowItem = 1;</code>
     */
    public com.bapis.bilibili.app.dynamic.v2.CmtShowItem.Builder getCmtShowItemBuilder(
        int index) {
      return getCmtShowItemFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .bilibili.app.dynamic.v2.CmtShowItem cmtShowItem = 1;</code>
     */
    public com.bapis.bilibili.app.dynamic.v2.CmtShowItemOrBuilder getCmtShowItemOrBuilder(
        int index) {
      if (cmtShowItemBuilder_ == null) {
        return cmtShowItem_.get(index);  } else {
        return cmtShowItemBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .bilibili.app.dynamic.v2.CmtShowItem cmtShowItem = 1;</code>
     */
    public java.util.List<? extends com.bapis.bilibili.app.dynamic.v2.CmtShowItemOrBuilder> 
         getCmtShowItemOrBuilderList() {
      if (cmtShowItemBuilder_ != null) {
        return cmtShowItemBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(cmtShowItem_);
      }
    }
    /**
     * <code>repeated .bilibili.app.dynamic.v2.CmtShowItem cmtShowItem = 1;</code>
     */
    public com.bapis.bilibili.app.dynamic.v2.CmtShowItem.Builder addCmtShowItemBuilder() {
      return getCmtShowItemFieldBuilder().addBuilder(
          com.bapis.bilibili.app.dynamic.v2.CmtShowItem.getDefaultInstance());
    }
    /**
     * <code>repeated .bilibili.app.dynamic.v2.CmtShowItem cmtShowItem = 1;</code>
     */
    public com.bapis.bilibili.app.dynamic.v2.CmtShowItem.Builder addCmtShowItemBuilder(
        int index) {
      return getCmtShowItemFieldBuilder().addBuilder(
          index, com.bapis.bilibili.app.dynamic.v2.CmtShowItem.getDefaultInstance());
    }
    /**
     * <code>repeated .bilibili.app.dynamic.v2.CmtShowItem cmtShowItem = 1;</code>
     */
    public java.util.List<com.bapis.bilibili.app.dynamic.v2.CmtShowItem.Builder> 
         getCmtShowItemBuilderList() {
      return getCmtShowItemFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.bapis.bilibili.app.dynamic.v2.CmtShowItem, com.bapis.bilibili.app.dynamic.v2.CmtShowItem.Builder, com.bapis.bilibili.app.dynamic.v2.CmtShowItemOrBuilder> 
        getCmtShowItemFieldBuilder() {
      if (cmtShowItemBuilder_ == null) {
        cmtShowItemBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.bapis.bilibili.app.dynamic.v2.CmtShowItem, com.bapis.bilibili.app.dynamic.v2.CmtShowItem.Builder, com.bapis.bilibili.app.dynamic.v2.CmtShowItemOrBuilder>(
                cmtShowItem_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        cmtShowItem_ = null;
      }
      return cmtShowItemBuilder_;
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


    // @@protoc_insertion_point(builder_scope:bilibili.app.dynamic.v2.ModuleComment)
  }

  // @@protoc_insertion_point(class_scope:bilibili.app.dynamic.v2.ModuleComment)
  private static final com.bapis.bilibili.app.dynamic.v2.ModuleComment DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.bapis.bilibili.app.dynamic.v2.ModuleComment();
  }

  public static com.bapis.bilibili.app.dynamic.v2.ModuleComment getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ModuleComment>
      PARSER = new com.google.protobuf.AbstractParser<ModuleComment>() {
    @java.lang.Override
    public ModuleComment parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new ModuleComment(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<ModuleComment> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ModuleComment> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.bapis.bilibili.app.dynamic.v2.ModuleComment getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

