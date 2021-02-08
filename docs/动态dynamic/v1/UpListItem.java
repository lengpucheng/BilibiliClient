// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: bilibili/app/dynamic/v1/dynamic.proto

package com.bapis.bilibili.app.dynamic.v1;

/**
 * <pre>
 * UpListItem up主列表
 * </pre>
 *
 * Protobuf type {@code bilibili.app.dynamic.v1.UpListItem}
 */
public final class UpListItem extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:bilibili.app.dynamic.v1.UpListItem)
    UpListItemOrBuilder {
private static final long serialVersionUID = 0L;
  // Use UpListItem.newBuilder() to construct.
  private UpListItem(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private UpListItem() {
    face_ = "";
    name_ = "";
  }

  @Override
  @SuppressWarnings({"unused"})
  protected Object newInstance(
      UnusedPrivateParameter unused) {
    return new UpListItem();
  }

  @Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private UpListItem(
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

            hasUpdate_ = input.readInt32();
            break;
          }
          case 18: {
            String s = input.readStringRequireUtf8();

            face_ = s;
            break;
          }
          case 26: {
            String s = input.readStringRequireUtf8();

            name_ = s;
            break;
          }
          case 32: {

            uid_ = input.readInt64();
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
    return DynamicOuterClass.internal_static_bilibili_app_dynamic_v1_UpListItem_descriptor;
  }

  @Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return DynamicOuterClass.internal_static_bilibili_app_dynamic_v1_UpListItem_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            UpListItem.class, Builder.class);
  }

  public static final int HAS_UPDATE_FIELD_NUMBER = 1;
  private int hasUpdate_;
  /**
   * <pre>
   * 是否有更新，0没有，1有
   * </pre>
   *
   * <code>int32 has_update = 1;</code>
   * @return The hasUpdate.
   */
  @Override
  public int getHasUpdate() {
    return hasUpdate_;
  }

  public static final int FACE_FIELD_NUMBER = 2;
  private volatile Object face_;
  /**
   * <pre>
   * up主头像
   * </pre>
   *
   * <code>string face = 2;</code>
   * @return The face.
   */
  @Override
  public String getFace() {
    Object ref = face_;
    if (ref instanceof String) {
      return (String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      String s = bs.toStringUtf8();
      face_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * up主头像
   * </pre>
   *
   * <code>string face = 2;</code>
   * @return The bytes for face.
   */
  @Override
  public com.google.protobuf.ByteString
      getFaceBytes() {
    Object ref = face_;
    if (ref instanceof String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (String) ref);
      face_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int NAME_FIELD_NUMBER = 3;
  private volatile Object name_;
  /**
   * <pre>
   * up主昵称
   * </pre>
   *
   * <code>string name = 3;</code>
   * @return The name.
   */
  @Override
  public String getName() {
    Object ref = name_;
    if (ref instanceof String) {
      return (String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      String s = bs.toStringUtf8();
      name_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * up主昵称
   * </pre>
   *
   * <code>string name = 3;</code>
   * @return The bytes for name.
   */
  @Override
  public com.google.protobuf.ByteString
      getNameBytes() {
    Object ref = name_;
    if (ref instanceof String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (String) ref);
      name_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int UID_FIELD_NUMBER = 4;
  private long uid_;
  /**
   * <pre>
   * up主uid
   * </pre>
   *
   * <code>int64 uid = 4;</code>
   * @return The uid.
   */
  @Override
  public long getUid() {
    return uid_;
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
    if (hasUpdate_ != 0) {
      output.writeInt32(1, hasUpdate_);
    }
    if (!getFaceBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, face_);
    }
    if (!getNameBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, name_);
    }
    if (uid_ != 0L) {
      output.writeInt64(4, uid_);
    }
    unknownFields.writeTo(output);
  }

  @Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (hasUpdate_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(1, hasUpdate_);
    }
    if (!getFaceBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, face_);
    }
    if (!getNameBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, name_);
    }
    if (uid_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(4, uid_);
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
    if (!(obj instanceof UpListItem)) {
      return super.equals(obj);
    }
    UpListItem other = (UpListItem) obj;

    if (getHasUpdate()
        != other.getHasUpdate()) return false;
    if (!getFace()
        .equals(other.getFace())) return false;
    if (!getName()
        .equals(other.getName())) return false;
    if (getUid()
        != other.getUid()) return false;
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
    hash = (37 * hash) + HAS_UPDATE_FIELD_NUMBER;
    hash = (53 * hash) + getHasUpdate();
    hash = (37 * hash) + FACE_FIELD_NUMBER;
    hash = (53 * hash) + getFace().hashCode();
    hash = (37 * hash) + NAME_FIELD_NUMBER;
    hash = (53 * hash) + getName().hashCode();
    hash = (37 * hash) + UID_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getUid());
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static UpListItem parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static UpListItem parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static UpListItem parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static UpListItem parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static UpListItem parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static UpListItem parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static UpListItem parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static UpListItem parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static UpListItem parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static UpListItem parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static UpListItem parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static UpListItem parseFrom(
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
  public static Builder newBuilder(UpListItem prototype) {
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
   * UpListItem up主列表
   * </pre>
   *
   * Protobuf type {@code bilibili.app.dynamic.v1.UpListItem}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:bilibili.app.dynamic.v1.UpListItem)
      UpListItemOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return DynamicOuterClass.internal_static_bilibili_app_dynamic_v1_UpListItem_descriptor;
    }

    @Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return DynamicOuterClass.internal_static_bilibili_app_dynamic_v1_UpListItem_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              UpListItem.class, Builder.class);
    }

    // Construct using com.bapis.bilibili.app.dynamic.v1.UpListItem.newBuilder()
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
      hasUpdate_ = 0;

      face_ = "";

      name_ = "";

      uid_ = 0L;

      return this;
    }

    @Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return DynamicOuterClass.internal_static_bilibili_app_dynamic_v1_UpListItem_descriptor;
    }

    @Override
    public UpListItem getDefaultInstanceForType() {
      return UpListItem.getDefaultInstance();
    }

    @Override
    public UpListItem build() {
      UpListItem result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @Override
    public UpListItem buildPartial() {
      UpListItem result = new UpListItem(this);
      result.hasUpdate_ = hasUpdate_;
      result.face_ = face_;
      result.name_ = name_;
      result.uid_ = uid_;
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
      if (other instanceof UpListItem) {
        return mergeFrom((UpListItem)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(UpListItem other) {
      if (other == UpListItem.getDefaultInstance()) return this;
      if (other.getHasUpdate() != 0) {
        setHasUpdate(other.getHasUpdate());
      }
      if (!other.getFace().isEmpty()) {
        face_ = other.face_;
        onChanged();
      }
      if (!other.getName().isEmpty()) {
        name_ = other.name_;
        onChanged();
      }
      if (other.getUid() != 0L) {
        setUid(other.getUid());
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
      UpListItem parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (UpListItem) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int hasUpdate_ ;
    /**
     * <pre>
     * 是否有更新，0没有，1有
     * </pre>
     *
     * <code>int32 has_update = 1;</code>
     * @return The hasUpdate.
     */
    @Override
    public int getHasUpdate() {
      return hasUpdate_;
    }
    /**
     * <pre>
     * 是否有更新，0没有，1有
     * </pre>
     *
     * <code>int32 has_update = 1;</code>
     * @param value The hasUpdate to set.
     * @return This builder for chaining.
     */
    public Builder setHasUpdate(int value) {
      
      hasUpdate_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 是否有更新，0没有，1有
     * </pre>
     *
     * <code>int32 has_update = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearHasUpdate() {
      
      hasUpdate_ = 0;
      onChanged();
      return this;
    }

    private Object face_ = "";
    /**
     * <pre>
     * up主头像
     * </pre>
     *
     * <code>string face = 2;</code>
     * @return The face.
     */
    public String getFace() {
      Object ref = face_;
      if (!(ref instanceof String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        String s = bs.toStringUtf8();
        face_ = s;
        return s;
      } else {
        return (String) ref;
      }
    }
    /**
     * <pre>
     * up主头像
     * </pre>
     *
     * <code>string face = 2;</code>
     * @return The bytes for face.
     */
    public com.google.protobuf.ByteString
        getFaceBytes() {
      Object ref = face_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (String) ref);
        face_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * up主头像
     * </pre>
     *
     * <code>string face = 2;</code>
     * @param value The face to set.
     * @return This builder for chaining.
     */
    public Builder setFace(
        String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      face_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * up主头像
     * </pre>
     *
     * <code>string face = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearFace() {
      
      face_ = getDefaultInstance().getFace();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * up主头像
     * </pre>
     *
     * <code>string face = 2;</code>
     * @param value The bytes for face to set.
     * @return This builder for chaining.
     */
    public Builder setFaceBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      face_ = value;
      onChanged();
      return this;
    }

    private Object name_ = "";
    /**
     * <pre>
     * up主昵称
     * </pre>
     *
     * <code>string name = 3;</code>
     * @return The name.
     */
    public String getName() {
      Object ref = name_;
      if (!(ref instanceof String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        String s = bs.toStringUtf8();
        name_ = s;
        return s;
      } else {
        return (String) ref;
      }
    }
    /**
     * <pre>
     * up主昵称
     * </pre>
     *
     * <code>string name = 3;</code>
     * @return The bytes for name.
     */
    public com.google.protobuf.ByteString
        getNameBytes() {
      Object ref = name_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (String) ref);
        name_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * up主昵称
     * </pre>
     *
     * <code>string name = 3;</code>
     * @param value The name to set.
     * @return This builder for chaining.
     */
    public Builder setName(
        String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      name_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * up主昵称
     * </pre>
     *
     * <code>string name = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearName() {
      
      name_ = getDefaultInstance().getName();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * up主昵称
     * </pre>
     *
     * <code>string name = 3;</code>
     * @param value The bytes for name to set.
     * @return This builder for chaining.
     */
    public Builder setNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      name_ = value;
      onChanged();
      return this;
    }

    private long uid_ ;
    /**
     * <pre>
     * up主uid
     * </pre>
     *
     * <code>int64 uid = 4;</code>
     * @return The uid.
     */
    @Override
    public long getUid() {
      return uid_;
    }
    /**
     * <pre>
     * up主uid
     * </pre>
     *
     * <code>int64 uid = 4;</code>
     * @param value The uid to set.
     * @return This builder for chaining.
     */
    public Builder setUid(long value) {
      
      uid_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * up主uid
     * </pre>
     *
     * <code>int64 uid = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearUid() {
      
      uid_ = 0L;
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


    // @@protoc_insertion_point(builder_scope:bilibili.app.dynamic.v1.UpListItem)
  }

  // @@protoc_insertion_point(class_scope:bilibili.app.dynamic.v1.UpListItem)
  private static final UpListItem DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new UpListItem();
  }

  public static UpListItem getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<UpListItem>
      PARSER = new com.google.protobuf.AbstractParser<UpListItem>() {
    @Override
    public UpListItem parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new UpListItem(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<UpListItem> parser() {
    return PARSER;
  }

  @Override
  public com.google.protobuf.Parser<UpListItem> getParserForType() {
    return PARSER;
  }

  @Override
  public UpListItem getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

