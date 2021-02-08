// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: bilibili/app/dynamic/v2/dynamic.proto

package com.bapis.bilibili.app.dynamic.v2;

/**
 * <pre>
 * CardVideoFollowList 视频页-我的追番
 * </pre>
 *
 * Protobuf type {@code bilibili.app.dynamic.v2.CardVideoFollowList}
 */
public final class CardVideoFollowList extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:bilibili.app.dynamic.v2.CardVideoFollowList)
    CardVideoFollowListOrBuilder {
private static final long serialVersionUID = 0L;
  // Use CardVideoFollowList.newBuilder() to construct.
  private CardVideoFollowList(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private CardVideoFollowList() {
    viewAllLink_ = "";
    list_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new CardVideoFollowList();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private CardVideoFollowList(
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

            viewAllLink_ = s;
            break;
          }
          case 18: {
            if (!((mutable_bitField0_ & 0x00000001) != 0)) {
              list_ = new java.util.ArrayList<com.bapis.bilibili.app.dynamic.v2.FollowListItem>();
              mutable_bitField0_ |= 0x00000001;
            }
            list_.add(
                input.readMessage(com.bapis.bilibili.app.dynamic.v2.FollowListItem.parser(), extensionRegistry));
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
        list_ = java.util.Collections.unmodifiableList(list_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.bapis.bilibili.app.dynamic.v2.DynamicOuterClass.internal_static_bilibili_app_dynamic_v2_CardVideoFollowList_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.bapis.bilibili.app.dynamic.v2.DynamicOuterClass.internal_static_bilibili_app_dynamic_v2_CardVideoFollowList_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.bapis.bilibili.app.dynamic.v2.CardVideoFollowList.class, com.bapis.bilibili.app.dynamic.v2.CardVideoFollowList.Builder.class);
  }

  public static final int VIEW_ALL_LINK_FIELD_NUMBER = 1;
  private volatile java.lang.Object viewAllLink_;
  /**
   * <pre>
   * 查看全部（跳转链接）
   * </pre>
   *
   * <code>string view_all_link = 1;</code>
   * @return The viewAllLink.
   */
  @java.lang.Override
  public java.lang.String getViewAllLink() {
    java.lang.Object ref = viewAllLink_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      viewAllLink_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * 查看全部（跳转链接）
   * </pre>
   *
   * <code>string view_all_link = 1;</code>
   * @return The bytes for viewAllLink.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getViewAllLinkBytes() {
    java.lang.Object ref = viewAllLink_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      viewAllLink_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int LIST_FIELD_NUMBER = 2;
  private java.util.List<com.bapis.bilibili.app.dynamic.v2.FollowListItem> list_;
  /**
   * <pre>
   * 追番列表
   * </pre>
   *
   * <code>repeated .bilibili.app.dynamic.v2.FollowListItem list = 2;</code>
   */
  @java.lang.Override
  public java.util.List<com.bapis.bilibili.app.dynamic.v2.FollowListItem> getListList() {
    return list_;
  }
  /**
   * <pre>
   * 追番列表
   * </pre>
   *
   * <code>repeated .bilibili.app.dynamic.v2.FollowListItem list = 2;</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.bapis.bilibili.app.dynamic.v2.FollowListItemOrBuilder> 
      getListOrBuilderList() {
    return list_;
  }
  /**
   * <pre>
   * 追番列表
   * </pre>
   *
   * <code>repeated .bilibili.app.dynamic.v2.FollowListItem list = 2;</code>
   */
  @java.lang.Override
  public int getListCount() {
    return list_.size();
  }
  /**
   * <pre>
   * 追番列表
   * </pre>
   *
   * <code>repeated .bilibili.app.dynamic.v2.FollowListItem list = 2;</code>
   */
  @java.lang.Override
  public com.bapis.bilibili.app.dynamic.v2.FollowListItem getList(int index) {
    return list_.get(index);
  }
  /**
   * <pre>
   * 追番列表
   * </pre>
   *
   * <code>repeated .bilibili.app.dynamic.v2.FollowListItem list = 2;</code>
   */
  @java.lang.Override
  public com.bapis.bilibili.app.dynamic.v2.FollowListItemOrBuilder getListOrBuilder(
      int index) {
    return list_.get(index);
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
    if (!getViewAllLinkBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, viewAllLink_);
    }
    for (int i = 0; i < list_.size(); i++) {
      output.writeMessage(2, list_.get(i));
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getViewAllLinkBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, viewAllLink_);
    }
    for (int i = 0; i < list_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, list_.get(i));
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
    if (!(obj instanceof com.bapis.bilibili.app.dynamic.v2.CardVideoFollowList)) {
      return super.equals(obj);
    }
    com.bapis.bilibili.app.dynamic.v2.CardVideoFollowList other = (com.bapis.bilibili.app.dynamic.v2.CardVideoFollowList) obj;

    if (!getViewAllLink()
        .equals(other.getViewAllLink())) return false;
    if (!getListList()
        .equals(other.getListList())) return false;
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
    hash = (37 * hash) + VIEW_ALL_LINK_FIELD_NUMBER;
    hash = (53 * hash) + getViewAllLink().hashCode();
    if (getListCount() > 0) {
      hash = (37 * hash) + LIST_FIELD_NUMBER;
      hash = (53 * hash) + getListList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.bapis.bilibili.app.dynamic.v2.CardVideoFollowList parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.bapis.bilibili.app.dynamic.v2.CardVideoFollowList parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.bapis.bilibili.app.dynamic.v2.CardVideoFollowList parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.bapis.bilibili.app.dynamic.v2.CardVideoFollowList parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.bapis.bilibili.app.dynamic.v2.CardVideoFollowList parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.bapis.bilibili.app.dynamic.v2.CardVideoFollowList parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.bapis.bilibili.app.dynamic.v2.CardVideoFollowList parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.bapis.bilibili.app.dynamic.v2.CardVideoFollowList parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.bapis.bilibili.app.dynamic.v2.CardVideoFollowList parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.bapis.bilibili.app.dynamic.v2.CardVideoFollowList parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.bapis.bilibili.app.dynamic.v2.CardVideoFollowList parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.bapis.bilibili.app.dynamic.v2.CardVideoFollowList parseFrom(
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
  public static Builder newBuilder(com.bapis.bilibili.app.dynamic.v2.CardVideoFollowList prototype) {
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
   * CardVideoFollowList 视频页-我的追番
   * </pre>
   *
   * Protobuf type {@code bilibili.app.dynamic.v2.CardVideoFollowList}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:bilibili.app.dynamic.v2.CardVideoFollowList)
      com.bapis.bilibili.app.dynamic.v2.CardVideoFollowListOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.bapis.bilibili.app.dynamic.v2.DynamicOuterClass.internal_static_bilibili_app_dynamic_v2_CardVideoFollowList_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.bapis.bilibili.app.dynamic.v2.DynamicOuterClass.internal_static_bilibili_app_dynamic_v2_CardVideoFollowList_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.bapis.bilibili.app.dynamic.v2.CardVideoFollowList.class, com.bapis.bilibili.app.dynamic.v2.CardVideoFollowList.Builder.class);
    }

    // Construct using com.bapis.bilibili.app.dynamic.v2.CardVideoFollowList.newBuilder()
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
        getListFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      viewAllLink_ = "";

      if (listBuilder_ == null) {
        list_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        listBuilder_.clear();
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.bapis.bilibili.app.dynamic.v2.DynamicOuterClass.internal_static_bilibili_app_dynamic_v2_CardVideoFollowList_descriptor;
    }

    @java.lang.Override
    public com.bapis.bilibili.app.dynamic.v2.CardVideoFollowList getDefaultInstanceForType() {
      return com.bapis.bilibili.app.dynamic.v2.CardVideoFollowList.getDefaultInstance();
    }

    @java.lang.Override
    public com.bapis.bilibili.app.dynamic.v2.CardVideoFollowList build() {
      com.bapis.bilibili.app.dynamic.v2.CardVideoFollowList result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.bapis.bilibili.app.dynamic.v2.CardVideoFollowList buildPartial() {
      com.bapis.bilibili.app.dynamic.v2.CardVideoFollowList result = new com.bapis.bilibili.app.dynamic.v2.CardVideoFollowList(this);
      int from_bitField0_ = bitField0_;
      result.viewAllLink_ = viewAllLink_;
      if (listBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          list_ = java.util.Collections.unmodifiableList(list_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.list_ = list_;
      } else {
        result.list_ = listBuilder_.build();
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
      if (other instanceof com.bapis.bilibili.app.dynamic.v2.CardVideoFollowList) {
        return mergeFrom((com.bapis.bilibili.app.dynamic.v2.CardVideoFollowList)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.bapis.bilibili.app.dynamic.v2.CardVideoFollowList other) {
      if (other == com.bapis.bilibili.app.dynamic.v2.CardVideoFollowList.getDefaultInstance()) return this;
      if (!other.getViewAllLink().isEmpty()) {
        viewAllLink_ = other.viewAllLink_;
        onChanged();
      }
      if (listBuilder_ == null) {
        if (!other.list_.isEmpty()) {
          if (list_.isEmpty()) {
            list_ = other.list_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureListIsMutable();
            list_.addAll(other.list_);
          }
          onChanged();
        }
      } else {
        if (!other.list_.isEmpty()) {
          if (listBuilder_.isEmpty()) {
            listBuilder_.dispose();
            listBuilder_ = null;
            list_ = other.list_;
            bitField0_ = (bitField0_ & ~0x00000001);
            listBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getListFieldBuilder() : null;
          } else {
            listBuilder_.addAllMessages(other.list_);
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
      com.bapis.bilibili.app.dynamic.v2.CardVideoFollowList parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.bapis.bilibili.app.dynamic.v2.CardVideoFollowList) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.lang.Object viewAllLink_ = "";
    /**
     * <pre>
     * 查看全部（跳转链接）
     * </pre>
     *
     * <code>string view_all_link = 1;</code>
     * @return The viewAllLink.
     */
    public java.lang.String getViewAllLink() {
      java.lang.Object ref = viewAllLink_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        viewAllLink_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * 查看全部（跳转链接）
     * </pre>
     *
     * <code>string view_all_link = 1;</code>
     * @return The bytes for viewAllLink.
     */
    public com.google.protobuf.ByteString
        getViewAllLinkBytes() {
      java.lang.Object ref = viewAllLink_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        viewAllLink_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * 查看全部（跳转链接）
     * </pre>
     *
     * <code>string view_all_link = 1;</code>
     * @param value The viewAllLink to set.
     * @return This builder for chaining.
     */
    public Builder setViewAllLink(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      viewAllLink_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 查看全部（跳转链接）
     * </pre>
     *
     * <code>string view_all_link = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearViewAllLink() {
      
      viewAllLink_ = getDefaultInstance().getViewAllLink();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 查看全部（跳转链接）
     * </pre>
     *
     * <code>string view_all_link = 1;</code>
     * @param value The bytes for viewAllLink to set.
     * @return This builder for chaining.
     */
    public Builder setViewAllLinkBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      viewAllLink_ = value;
      onChanged();
      return this;
    }

    private java.util.List<com.bapis.bilibili.app.dynamic.v2.FollowListItem> list_ =
      java.util.Collections.emptyList();
    private void ensureListIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        list_ = new java.util.ArrayList<com.bapis.bilibili.app.dynamic.v2.FollowListItem>(list_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.bapis.bilibili.app.dynamic.v2.FollowListItem, com.bapis.bilibili.app.dynamic.v2.FollowListItem.Builder, com.bapis.bilibili.app.dynamic.v2.FollowListItemOrBuilder> listBuilder_;

    /**
     * <pre>
     * 追番列表
     * </pre>
     *
     * <code>repeated .bilibili.app.dynamic.v2.FollowListItem list = 2;</code>
     */
    public java.util.List<com.bapis.bilibili.app.dynamic.v2.FollowListItem> getListList() {
      if (listBuilder_ == null) {
        return java.util.Collections.unmodifiableList(list_);
      } else {
        return listBuilder_.getMessageList();
      }
    }
    /**
     * <pre>
     * 追番列表
     * </pre>
     *
     * <code>repeated .bilibili.app.dynamic.v2.FollowListItem list = 2;</code>
     */
    public int getListCount() {
      if (listBuilder_ == null) {
        return list_.size();
      } else {
        return listBuilder_.getCount();
      }
    }
    /**
     * <pre>
     * 追番列表
     * </pre>
     *
     * <code>repeated .bilibili.app.dynamic.v2.FollowListItem list = 2;</code>
     */
    public com.bapis.bilibili.app.dynamic.v2.FollowListItem getList(int index) {
      if (listBuilder_ == null) {
        return list_.get(index);
      } else {
        return listBuilder_.getMessage(index);
      }
    }
    /**
     * <pre>
     * 追番列表
     * </pre>
     *
     * <code>repeated .bilibili.app.dynamic.v2.FollowListItem list = 2;</code>
     */
    public Builder setList(
        int index, com.bapis.bilibili.app.dynamic.v2.FollowListItem value) {
      if (listBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureListIsMutable();
        list_.set(index, value);
        onChanged();
      } else {
        listBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * 追番列表
     * </pre>
     *
     * <code>repeated .bilibili.app.dynamic.v2.FollowListItem list = 2;</code>
     */
    public Builder setList(
        int index, com.bapis.bilibili.app.dynamic.v2.FollowListItem.Builder builderForValue) {
      if (listBuilder_ == null) {
        ensureListIsMutable();
        list_.set(index, builderForValue.build());
        onChanged();
      } else {
        listBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * 追番列表
     * </pre>
     *
     * <code>repeated .bilibili.app.dynamic.v2.FollowListItem list = 2;</code>
     */
    public Builder addList(com.bapis.bilibili.app.dynamic.v2.FollowListItem value) {
      if (listBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureListIsMutable();
        list_.add(value);
        onChanged();
      } else {
        listBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <pre>
     * 追番列表
     * </pre>
     *
     * <code>repeated .bilibili.app.dynamic.v2.FollowListItem list = 2;</code>
     */
    public Builder addList(
        int index, com.bapis.bilibili.app.dynamic.v2.FollowListItem value) {
      if (listBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureListIsMutable();
        list_.add(index, value);
        onChanged();
      } else {
        listBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * 追番列表
     * </pre>
     *
     * <code>repeated .bilibili.app.dynamic.v2.FollowListItem list = 2;</code>
     */
    public Builder addList(
        com.bapis.bilibili.app.dynamic.v2.FollowListItem.Builder builderForValue) {
      if (listBuilder_ == null) {
        ensureListIsMutable();
        list_.add(builderForValue.build());
        onChanged();
      } else {
        listBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * 追番列表
     * </pre>
     *
     * <code>repeated .bilibili.app.dynamic.v2.FollowListItem list = 2;</code>
     */
    public Builder addList(
        int index, com.bapis.bilibili.app.dynamic.v2.FollowListItem.Builder builderForValue) {
      if (listBuilder_ == null) {
        ensureListIsMutable();
        list_.add(index, builderForValue.build());
        onChanged();
      } else {
        listBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * 追番列表
     * </pre>
     *
     * <code>repeated .bilibili.app.dynamic.v2.FollowListItem list = 2;</code>
     */
    public Builder addAllList(
        java.lang.Iterable<? extends com.bapis.bilibili.app.dynamic.v2.FollowListItem> values) {
      if (listBuilder_ == null) {
        ensureListIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, list_);
        onChanged();
      } else {
        listBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <pre>
     * 追番列表
     * </pre>
     *
     * <code>repeated .bilibili.app.dynamic.v2.FollowListItem list = 2;</code>
     */
    public Builder clearList() {
      if (listBuilder_ == null) {
        list_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        listBuilder_.clear();
      }
      return this;
    }
    /**
     * <pre>
     * 追番列表
     * </pre>
     *
     * <code>repeated .bilibili.app.dynamic.v2.FollowListItem list = 2;</code>
     */
    public Builder removeList(int index) {
      if (listBuilder_ == null) {
        ensureListIsMutable();
        list_.remove(index);
        onChanged();
      } else {
        listBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <pre>
     * 追番列表
     * </pre>
     *
     * <code>repeated .bilibili.app.dynamic.v2.FollowListItem list = 2;</code>
     */
    public com.bapis.bilibili.app.dynamic.v2.FollowListItem.Builder getListBuilder(
        int index) {
      return getListFieldBuilder().getBuilder(index);
    }
    /**
     * <pre>
     * 追番列表
     * </pre>
     *
     * <code>repeated .bilibili.app.dynamic.v2.FollowListItem list = 2;</code>
     */
    public com.bapis.bilibili.app.dynamic.v2.FollowListItemOrBuilder getListOrBuilder(
        int index) {
      if (listBuilder_ == null) {
        return list_.get(index);  } else {
        return listBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <pre>
     * 追番列表
     * </pre>
     *
     * <code>repeated .bilibili.app.dynamic.v2.FollowListItem list = 2;</code>
     */
    public java.util.List<? extends com.bapis.bilibili.app.dynamic.v2.FollowListItemOrBuilder> 
         getListOrBuilderList() {
      if (listBuilder_ != null) {
        return listBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(list_);
      }
    }
    /**
     * <pre>
     * 追番列表
     * </pre>
     *
     * <code>repeated .bilibili.app.dynamic.v2.FollowListItem list = 2;</code>
     */
    public com.bapis.bilibili.app.dynamic.v2.FollowListItem.Builder addListBuilder() {
      return getListFieldBuilder().addBuilder(
          com.bapis.bilibili.app.dynamic.v2.FollowListItem.getDefaultInstance());
    }
    /**
     * <pre>
     * 追番列表
     * </pre>
     *
     * <code>repeated .bilibili.app.dynamic.v2.FollowListItem list = 2;</code>
     */
    public com.bapis.bilibili.app.dynamic.v2.FollowListItem.Builder addListBuilder(
        int index) {
      return getListFieldBuilder().addBuilder(
          index, com.bapis.bilibili.app.dynamic.v2.FollowListItem.getDefaultInstance());
    }
    /**
     * <pre>
     * 追番列表
     * </pre>
     *
     * <code>repeated .bilibili.app.dynamic.v2.FollowListItem list = 2;</code>
     */
    public java.util.List<com.bapis.bilibili.app.dynamic.v2.FollowListItem.Builder> 
         getListBuilderList() {
      return getListFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.bapis.bilibili.app.dynamic.v2.FollowListItem, com.bapis.bilibili.app.dynamic.v2.FollowListItem.Builder, com.bapis.bilibili.app.dynamic.v2.FollowListItemOrBuilder> 
        getListFieldBuilder() {
      if (listBuilder_ == null) {
        listBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.bapis.bilibili.app.dynamic.v2.FollowListItem, com.bapis.bilibili.app.dynamic.v2.FollowListItem.Builder, com.bapis.bilibili.app.dynamic.v2.FollowListItemOrBuilder>(
                list_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        list_ = null;
      }
      return listBuilder_;
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


    // @@protoc_insertion_point(builder_scope:bilibili.app.dynamic.v2.CardVideoFollowList)
  }

  // @@protoc_insertion_point(class_scope:bilibili.app.dynamic.v2.CardVideoFollowList)
  private static final com.bapis.bilibili.app.dynamic.v2.CardVideoFollowList DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.bapis.bilibili.app.dynamic.v2.CardVideoFollowList();
  }

  public static com.bapis.bilibili.app.dynamic.v2.CardVideoFollowList getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CardVideoFollowList>
      PARSER = new com.google.protobuf.AbstractParser<CardVideoFollowList>() {
    @java.lang.Override
    public CardVideoFollowList parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new CardVideoFollowList(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<CardVideoFollowList> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CardVideoFollowList> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.bapis.bilibili.app.dynamic.v2.CardVideoFollowList getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

