// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: bilibili/app/dynamic/v1/dynamic.proto

package com.bapis.bilibili.app.dynamic.v1;

/**
 * <pre>
 * DynVideoPersonalReply 最近访问-个人feed流列表 返回值
 * </pre>
 *
 * Protobuf type {@code bilibili.app.dynamic.v1.DynVideoPersonalReply}
 */
public final class DynVideoPersonalReply extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:bilibili.app.dynamic.v1.DynVideoPersonalReply)
    DynVideoPersonalReplyOrBuilder {
private static final long serialVersionUID = 0L;
  // Use DynVideoPersonalReply.newBuilder() to construct.
  private DynVideoPersonalReply(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private DynVideoPersonalReply() {
    list_ = java.util.Collections.emptyList();
    offset_ = "";
    readOffset_ = "";
  }

  @Override
  @SuppressWarnings({"unused"})
  protected Object newInstance(
      UnusedPrivateParameter unused) {
    return new DynVideoPersonalReply();
  }

  @Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private DynVideoPersonalReply(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new NullPointerException();
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
              list_ = new java.util.ArrayList<DynamicItem>();
              mutable_bitField0_ |= 0x00000001;
            }
            list_.add(
                input.readMessage(DynamicItem.parser(), extensionRegistry));
            break;
          }
          case 18: {
            String s = input.readStringRequireUtf8();

            offset_ = s;
            break;
          }
          case 24: {

            hasMore_ = input.readInt32();
            break;
          }
          case 34: {
            String s = input.readStringRequireUtf8();

            readOffset_ = s;
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
    return DynamicOuterClass.internal_static_bilibili_app_dynamic_v1_DynVideoPersonalReply_descriptor;
  }

  @Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return DynamicOuterClass.internal_static_bilibili_app_dynamic_v1_DynVideoPersonalReply_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            DynVideoPersonalReply.class, Builder.class);
  }

  public static final int LIST_FIELD_NUMBER = 1;
  private java.util.List<DynamicItem> list_;
  /**
   * <pre>
   * 动态列表
   * </pre>
   *
   * <code>repeated .bilibili.app.dynamic.v1.DynamicItem list = 1;</code>
   */
  @Override
  public java.util.List<DynamicItem> getListList() {
    return list_;
  }
  /**
   * <pre>
   * 动态列表
   * </pre>
   *
   * <code>repeated .bilibili.app.dynamic.v1.DynamicItem list = 1;</code>
   */
  @Override
  public java.util.List<? extends DynamicItemOrBuilder>
      getListOrBuilderList() {
    return list_;
  }
  /**
   * <pre>
   * 动态列表
   * </pre>
   *
   * <code>repeated .bilibili.app.dynamic.v1.DynamicItem list = 1;</code>
   */
  @Override
  public int getListCount() {
    return list_.size();
  }
  /**
   * <pre>
   * 动态列表
   * </pre>
   *
   * <code>repeated .bilibili.app.dynamic.v1.DynamicItem list = 1;</code>
   */
  @Override
  public DynamicItem getList(int index) {
    return list_.get(index);
  }
  /**
   * <pre>
   * 动态列表
   * </pre>
   *
   * <code>repeated .bilibili.app.dynamic.v1.DynamicItem list = 1;</code>
   */
  @Override
  public DynamicItemOrBuilder getListOrBuilder(
      int index) {
    return list_.get(index);
  }

  public static final int OFFSET_FIELD_NUMBER = 2;
  private volatile Object offset_;
  /**
   * <pre>
   * 偏移量
   * </pre>
   *
   * <code>string offset = 2;</code>
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
   * 偏移量
   * </pre>
   *
   * <code>string offset = 2;</code>
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

  public static final int HAS_MORE_FIELD_NUMBER = 3;
  private int hasMore_;
  /**
   * <pre>
   * 是否还有更多数据
   * </pre>
   *
   * <code>int32 has_more = 3;</code>
   * @return The hasMore.
   */
  @Override
  public int getHasMore() {
    return hasMore_;
  }

  public static final int READ_OFFSET_FIELD_NUMBER = 4;
  private volatile Object readOffset_;
  /**
   * <pre>
   * 已读进度
   * </pre>
   *
   * <code>string read_offset = 4;</code>
   * @return The readOffset.
   */
  @Override
  public String getReadOffset() {
    Object ref = readOffset_;
    if (ref instanceof String) {
      return (String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      String s = bs.toStringUtf8();
      readOffset_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * 已读进度
   * </pre>
   *
   * <code>string read_offset = 4;</code>
   * @return The bytes for readOffset.
   */
  @Override
  public com.google.protobuf.ByteString
      getReadOffsetBytes() {
    Object ref = readOffset_;
    if (ref instanceof String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (String) ref);
      readOffset_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
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
    for (int i = 0; i < list_.size(); i++) {
      output.writeMessage(1, list_.get(i));
    }
    if (!getOffsetBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, offset_);
    }
    if (hasMore_ != 0) {
      output.writeInt32(3, hasMore_);
    }
    if (!getReadOffsetBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 4, readOffset_);
    }
    unknownFields.writeTo(output);
  }

  @Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < list_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, list_.get(i));
    }
    if (!getOffsetBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, offset_);
    }
    if (hasMore_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(3, hasMore_);
    }
    if (!getReadOffsetBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(4, readOffset_);
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
    if (!(obj instanceof DynVideoPersonalReply)) {
      return super.equals(obj);
    }
    DynVideoPersonalReply other = (DynVideoPersonalReply) obj;

    if (!getListList()
        .equals(other.getListList())) return false;
    if (!getOffset()
        .equals(other.getOffset())) return false;
    if (getHasMore()
        != other.getHasMore()) return false;
    if (!getReadOffset()
        .equals(other.getReadOffset())) return false;
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
    if (getListCount() > 0) {
      hash = (37 * hash) + LIST_FIELD_NUMBER;
      hash = (53 * hash) + getListList().hashCode();
    }
    hash = (37 * hash) + OFFSET_FIELD_NUMBER;
    hash = (53 * hash) + getOffset().hashCode();
    hash = (37 * hash) + HAS_MORE_FIELD_NUMBER;
    hash = (53 * hash) + getHasMore();
    hash = (37 * hash) + READ_OFFSET_FIELD_NUMBER;
    hash = (53 * hash) + getReadOffset().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static DynVideoPersonalReply parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static DynVideoPersonalReply parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static DynVideoPersonalReply parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static DynVideoPersonalReply parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static DynVideoPersonalReply parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static DynVideoPersonalReply parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static DynVideoPersonalReply parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static DynVideoPersonalReply parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static DynVideoPersonalReply parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static DynVideoPersonalReply parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static DynVideoPersonalReply parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static DynVideoPersonalReply parseFrom(
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
  public static Builder newBuilder(DynVideoPersonalReply prototype) {
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
   * DynVideoPersonalReply 最近访问-个人feed流列表 返回值
   * </pre>
   *
   * Protobuf type {@code bilibili.app.dynamic.v1.DynVideoPersonalReply}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:bilibili.app.dynamic.v1.DynVideoPersonalReply)
      DynVideoPersonalReplyOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return DynamicOuterClass.internal_static_bilibili_app_dynamic_v1_DynVideoPersonalReply_descriptor;
    }

    @Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return DynamicOuterClass.internal_static_bilibili_app_dynamic_v1_DynVideoPersonalReply_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              DynVideoPersonalReply.class, Builder.class);
    }

    // Construct using com.bapis.bilibili.app.dynamic.v1.DynVideoPersonalReply.newBuilder()
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
    @Override
    public Builder clear() {
      super.clear();
      if (listBuilder_ == null) {
        list_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        listBuilder_.clear();
      }
      offset_ = "";

      hasMore_ = 0;

      readOffset_ = "";

      return this;
    }

    @Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return DynamicOuterClass.internal_static_bilibili_app_dynamic_v1_DynVideoPersonalReply_descriptor;
    }

    @Override
    public DynVideoPersonalReply getDefaultInstanceForType() {
      return DynVideoPersonalReply.getDefaultInstance();
    }

    @Override
    public DynVideoPersonalReply build() {
      DynVideoPersonalReply result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @Override
    public DynVideoPersonalReply buildPartial() {
      DynVideoPersonalReply result = new DynVideoPersonalReply(this);
      int from_bitField0_ = bitField0_;
      if (listBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          list_ = java.util.Collections.unmodifiableList(list_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.list_ = list_;
      } else {
        result.list_ = listBuilder_.build();
      }
      result.offset_ = offset_;
      result.hasMore_ = hasMore_;
      result.readOffset_ = readOffset_;
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
      if (other instanceof DynVideoPersonalReply) {
        return mergeFrom((DynVideoPersonalReply)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(DynVideoPersonalReply other) {
      if (other == DynVideoPersonalReply.getDefaultInstance()) return this;
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
      if (!other.getOffset().isEmpty()) {
        offset_ = other.offset_;
        onChanged();
      }
      if (other.getHasMore() != 0) {
        setHasMore(other.getHasMore());
      }
      if (!other.getReadOffset().isEmpty()) {
        readOffset_ = other.readOffset_;
        onChanged();
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
      DynVideoPersonalReply parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (DynVideoPersonalReply) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.util.List<DynamicItem> list_ =
      java.util.Collections.emptyList();
    private void ensureListIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        list_ = new java.util.ArrayList<DynamicItem>(list_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        DynamicItem, DynamicItem.Builder, DynamicItemOrBuilder> listBuilder_;

    /**
     * <pre>
     * 动态列表
     * </pre>
     *
     * <code>repeated .bilibili.app.dynamic.v1.DynamicItem list = 1;</code>
     */
    public java.util.List<DynamicItem> getListList() {
      if (listBuilder_ == null) {
        return java.util.Collections.unmodifiableList(list_);
      } else {
        return listBuilder_.getMessageList();
      }
    }
    /**
     * <pre>
     * 动态列表
     * </pre>
     *
     * <code>repeated .bilibili.app.dynamic.v1.DynamicItem list = 1;</code>
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
     * 动态列表
     * </pre>
     *
     * <code>repeated .bilibili.app.dynamic.v1.DynamicItem list = 1;</code>
     */
    public DynamicItem getList(int index) {
      if (listBuilder_ == null) {
        return list_.get(index);
      } else {
        return listBuilder_.getMessage(index);
      }
    }
    /**
     * <pre>
     * 动态列表
     * </pre>
     *
     * <code>repeated .bilibili.app.dynamic.v1.DynamicItem list = 1;</code>
     */
    public Builder setList(
        int index, DynamicItem value) {
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
     * 动态列表
     * </pre>
     *
     * <code>repeated .bilibili.app.dynamic.v1.DynamicItem list = 1;</code>
     */
    public Builder setList(
        int index, DynamicItem.Builder builderForValue) {
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
     * 动态列表
     * </pre>
     *
     * <code>repeated .bilibili.app.dynamic.v1.DynamicItem list = 1;</code>
     */
    public Builder addList(DynamicItem value) {
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
     * 动态列表
     * </pre>
     *
     * <code>repeated .bilibili.app.dynamic.v1.DynamicItem list = 1;</code>
     */
    public Builder addList(
        int index, DynamicItem value) {
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
     * 动态列表
     * </pre>
     *
     * <code>repeated .bilibili.app.dynamic.v1.DynamicItem list = 1;</code>
     */
    public Builder addList(
        DynamicItem.Builder builderForValue) {
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
     * 动态列表
     * </pre>
     *
     * <code>repeated .bilibili.app.dynamic.v1.DynamicItem list = 1;</code>
     */
    public Builder addList(
        int index, DynamicItem.Builder builderForValue) {
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
     * 动态列表
     * </pre>
     *
     * <code>repeated .bilibili.app.dynamic.v1.DynamicItem list = 1;</code>
     */
    public Builder addAllList(
        Iterable<? extends DynamicItem> values) {
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
     * 动态列表
     * </pre>
     *
     * <code>repeated .bilibili.app.dynamic.v1.DynamicItem list = 1;</code>
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
     * 动态列表
     * </pre>
     *
     * <code>repeated .bilibili.app.dynamic.v1.DynamicItem list = 1;</code>
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
     * 动态列表
     * </pre>
     *
     * <code>repeated .bilibili.app.dynamic.v1.DynamicItem list = 1;</code>
     */
    public DynamicItem.Builder getListBuilder(
        int index) {
      return getListFieldBuilder().getBuilder(index);
    }
    /**
     * <pre>
     * 动态列表
     * </pre>
     *
     * <code>repeated .bilibili.app.dynamic.v1.DynamicItem list = 1;</code>
     */
    public DynamicItemOrBuilder getListOrBuilder(
        int index) {
      if (listBuilder_ == null) {
        return list_.get(index);  } else {
        return listBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <pre>
     * 动态列表
     * </pre>
     *
     * <code>repeated .bilibili.app.dynamic.v1.DynamicItem list = 1;</code>
     */
    public java.util.List<? extends DynamicItemOrBuilder>
         getListOrBuilderList() {
      if (listBuilder_ != null) {
        return listBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(list_);
      }
    }
    /**
     * <pre>
     * 动态列表
     * </pre>
     *
     * <code>repeated .bilibili.app.dynamic.v1.DynamicItem list = 1;</code>
     */
    public DynamicItem.Builder addListBuilder() {
      return getListFieldBuilder().addBuilder(
          DynamicItem.getDefaultInstance());
    }
    /**
     * <pre>
     * 动态列表
     * </pre>
     *
     * <code>repeated .bilibili.app.dynamic.v1.DynamicItem list = 1;</code>
     */
    public DynamicItem.Builder addListBuilder(
        int index) {
      return getListFieldBuilder().addBuilder(
          index, DynamicItem.getDefaultInstance());
    }
    /**
     * <pre>
     * 动态列表
     * </pre>
     *
     * <code>repeated .bilibili.app.dynamic.v1.DynamicItem list = 1;</code>
     */
    public java.util.List<DynamicItem.Builder>
         getListBuilderList() {
      return getListFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        DynamicItem, DynamicItem.Builder, DynamicItemOrBuilder>
        getListFieldBuilder() {
      if (listBuilder_ == null) {
        listBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            DynamicItem, DynamicItem.Builder, DynamicItemOrBuilder>(
                list_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        list_ = null;
      }
      return listBuilder_;
    }

    private Object offset_ = "";
    /**
     * <pre>
     * 偏移量
     * </pre>
     *
     * <code>string offset = 2;</code>
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
     * 偏移量
     * </pre>
     *
     * <code>string offset = 2;</code>
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
     * 偏移量
     * </pre>
     *
     * <code>string offset = 2;</code>
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
     * 偏移量
     * </pre>
     *
     * <code>string offset = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearOffset() {
      
      offset_ = getDefaultInstance().getOffset();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 偏移量
     * </pre>
     *
     * <code>string offset = 2;</code>
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

    private int hasMore_ ;
    /**
     * <pre>
     * 是否还有更多数据
     * </pre>
     *
     * <code>int32 has_more = 3;</code>
     * @return The hasMore.
     */
    @Override
    public int getHasMore() {
      return hasMore_;
    }
    /**
     * <pre>
     * 是否还有更多数据
     * </pre>
     *
     * <code>int32 has_more = 3;</code>
     * @param value The hasMore to set.
     * @return This builder for chaining.
     */
    public Builder setHasMore(int value) {
      
      hasMore_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 是否还有更多数据
     * </pre>
     *
     * <code>int32 has_more = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearHasMore() {
      
      hasMore_ = 0;
      onChanged();
      return this;
    }

    private Object readOffset_ = "";
    /**
     * <pre>
     * 已读进度
     * </pre>
     *
     * <code>string read_offset = 4;</code>
     * @return The readOffset.
     */
    public String getReadOffset() {
      Object ref = readOffset_;
      if (!(ref instanceof String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        String s = bs.toStringUtf8();
        readOffset_ = s;
        return s;
      } else {
        return (String) ref;
      }
    }
    /**
     * <pre>
     * 已读进度
     * </pre>
     *
     * <code>string read_offset = 4;</code>
     * @return The bytes for readOffset.
     */
    public com.google.protobuf.ByteString
        getReadOffsetBytes() {
      Object ref = readOffset_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (String) ref);
        readOffset_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * 已读进度
     * </pre>
     *
     * <code>string read_offset = 4;</code>
     * @param value The readOffset to set.
     * @return This builder for chaining.
     */
    public Builder setReadOffset(
        String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      readOffset_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 已读进度
     * </pre>
     *
     * <code>string read_offset = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearReadOffset() {
      
      readOffset_ = getDefaultInstance().getReadOffset();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 已读进度
     * </pre>
     *
     * <code>string read_offset = 4;</code>
     * @param value The bytes for readOffset to set.
     * @return This builder for chaining.
     */
    public Builder setReadOffsetBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      readOffset_ = value;
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


    // @@protoc_insertion_point(builder_scope:bilibili.app.dynamic.v1.DynVideoPersonalReply)
  }

  // @@protoc_insertion_point(class_scope:bilibili.app.dynamic.v1.DynVideoPersonalReply)
  private static final DynVideoPersonalReply DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new DynVideoPersonalReply();
  }

  public static DynVideoPersonalReply getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<DynVideoPersonalReply>
      PARSER = new com.google.protobuf.AbstractParser<DynVideoPersonalReply>() {
    @Override
    public DynVideoPersonalReply parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new DynVideoPersonalReply(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<DynVideoPersonalReply> parser() {
    return PARSER;
  }

  @Override
  public com.google.protobuf.Parser<DynVideoPersonalReply> getParserForType() {
    return PARSER;
  }

  @Override
  public DynVideoPersonalReply getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

