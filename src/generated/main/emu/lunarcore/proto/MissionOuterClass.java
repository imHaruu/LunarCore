// Code generated by protocol buffer compiler. Do not edit!
package emu.lunarcore.proto;

import java.io.IOException;
import us.hebi.quickbuf.FieldName;
import us.hebi.quickbuf.InvalidProtocolBufferException;
import us.hebi.quickbuf.JsonSink;
import us.hebi.quickbuf.JsonSource;
import us.hebi.quickbuf.MessageFactory;
import us.hebi.quickbuf.ProtoMessage;
import us.hebi.quickbuf.ProtoSink;
import us.hebi.quickbuf.ProtoSource;

public final class MissionOuterClass {
  /**
   * Protobuf type {@code Mission}
   */
  public static final class Mission extends ProtoMessage<Mission> implements Cloneable {
    private static final long serialVersionUID = 0L;

    /**
     * <code>optional uint32 progress = 3;</code>
     */
    private int progress;

    /**
     * <code>optional uint32 id = 5;</code>
     */
    private int id;

    /**
     * <code>optional .MissionStatus status = 6;</code>
     */
    private int status;

    private Mission() {
    }

    /**
     * @return a new empty instance of {@code Mission}
     */
    public static Mission newInstance() {
      return new Mission();
    }

    /**
     * <code>optional uint32 progress = 3;</code>
     * @return whether the progress field is set
     */
    public boolean hasProgress() {
      return (bitField0_ & 0x00000001) != 0;
    }

    /**
     * <code>optional uint32 progress = 3;</code>
     * @return this
     */
    public Mission clearProgress() {
      bitField0_ &= ~0x00000001;
      progress = 0;
      return this;
    }

    /**
     * <code>optional uint32 progress = 3;</code>
     * @return the progress
     */
    public int getProgress() {
      return progress;
    }

    /**
     * <code>optional uint32 progress = 3;</code>
     * @param value the progress to set
     * @return this
     */
    public Mission setProgress(final int value) {
      bitField0_ |= 0x00000001;
      progress = value;
      return this;
    }

    /**
     * <code>optional uint32 id = 5;</code>
     * @return whether the id field is set
     */
    public boolean hasId() {
      return (bitField0_ & 0x00000002) != 0;
    }

    /**
     * <code>optional uint32 id = 5;</code>
     * @return this
     */
    public Mission clearId() {
      bitField0_ &= ~0x00000002;
      id = 0;
      return this;
    }

    /**
     * <code>optional uint32 id = 5;</code>
     * @return the id
     */
    public int getId() {
      return id;
    }

    /**
     * <code>optional uint32 id = 5;</code>
     * @param value the id to set
     * @return this
     */
    public Mission setId(final int value) {
      bitField0_ |= 0x00000002;
      id = value;
      return this;
    }

    /**
     * <code>optional .MissionStatus status = 6;</code>
     * @return whether the status field is set
     */
    public boolean hasStatus() {
      return (bitField0_ & 0x00000004) != 0;
    }

    /**
     * <code>optional .MissionStatus status = 6;</code>
     * @return this
     */
    public Mission clearStatus() {
      bitField0_ &= ~0x00000004;
      status = 0;
      return this;
    }

    /**
     * <code>optional .MissionStatus status = 6;</code>
     * @return the status
     */
    public MissionStatusOuterClass.MissionStatus getStatus() {
      return MissionStatusOuterClass.MissionStatus.forNumber(status);
    }

    /**
     * Gets the value of the internal enum store. The result is
     * equivalent to {@link Mission#getStatus()}.getNumber().
     *
     * @return numeric wire representation
     */
    public int getStatusValue() {
      return status;
    }

    /**
     * Sets the value of the internal enum store. This does not
     * do any validity checks, so be sure to use appropriate value
     * constants from {@link MissionStatusOuterClass.MissionStatus}. Setting an invalid value
     * can cause {@link Mission#getStatus()} to return null
     *
     * @param value the numeric wire value to set
     * @return this
     */
    public Mission setStatusValue(final int value) {
      bitField0_ |= 0x00000004;
      status = value;
      return this;
    }

    /**
     * <code>optional .MissionStatus status = 6;</code>
     * @param value the status to set
     * @return this
     */
    public Mission setStatus(final MissionStatusOuterClass.MissionStatus value) {
      bitField0_ |= 0x00000004;
      status = value.getNumber();
      return this;
    }

    @Override
    public Mission copyFrom(final Mission other) {
      cachedSize = other.cachedSize;
      if ((bitField0_ | other.bitField0_) != 0) {
        bitField0_ = other.bitField0_;
        progress = other.progress;
        id = other.id;
        status = other.status;
      }
      return this;
    }

    @Override
    public Mission mergeFrom(final Mission other) {
      if (other.isEmpty()) {
        return this;
      }
      cachedSize = -1;
      if (other.hasProgress()) {
        setProgress(other.progress);
      }
      if (other.hasId()) {
        setId(other.id);
      }
      if (other.hasStatus()) {
        setStatusValue(other.status);
      }
      return this;
    }

    @Override
    public Mission clear() {
      if (isEmpty()) {
        return this;
      }
      cachedSize = -1;
      bitField0_ = 0;
      progress = 0;
      id = 0;
      status = 0;
      return this;
    }

    @Override
    public Mission clearQuick() {
      if (isEmpty()) {
        return this;
      }
      cachedSize = -1;
      bitField0_ = 0;
      return this;
    }

    @Override
    public boolean equals(Object o) {
      if (o == this) {
        return true;
      }
      if (!(o instanceof Mission)) {
        return false;
      }
      Mission other = (Mission) o;
      return bitField0_ == other.bitField0_
        && (!hasProgress() || progress == other.progress)
        && (!hasId() || id == other.id)
        && (!hasStatus() || status == other.status);
    }

    @Override
    public void writeTo(final ProtoSink output) throws IOException {
      if ((bitField0_ & 0x00000001) != 0) {
        output.writeRawByte((byte) 24);
        output.writeUInt32NoTag(progress);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        output.writeRawByte((byte) 40);
        output.writeUInt32NoTag(id);
      }
      if ((bitField0_ & 0x00000004) != 0) {
        output.writeRawByte((byte) 48);
        output.writeEnumNoTag(status);
      }
    }

    @Override
    protected int computeSerializedSize() {
      int size = 0;
      if ((bitField0_ & 0x00000001) != 0) {
        size += 1 + ProtoSink.computeUInt32SizeNoTag(progress);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        size += 1 + ProtoSink.computeUInt32SizeNoTag(id);
      }
      if ((bitField0_ & 0x00000004) != 0) {
        size += 1 + ProtoSink.computeEnumSizeNoTag(status);
      }
      return size;
    }

    @Override
    @SuppressWarnings("fallthrough")
    public Mission mergeFrom(final ProtoSource input) throws IOException {
      // Enabled Fall-Through Optimization (QuickBuffers)
      int tag = input.readTag();
      while (true) {
        switch (tag) {
          case 24: {
            // progress
            progress = input.readUInt32();
            bitField0_ |= 0x00000001;
            tag = input.readTag();
            if (tag != 40) {
              break;
            }
          }
          case 40: {
            // id
            id = input.readUInt32();
            bitField0_ |= 0x00000002;
            tag = input.readTag();
            if (tag != 48) {
              break;
            }
          }
          case 48: {
            // status
            final int value = input.readInt32();
            if (MissionStatusOuterClass.MissionStatus.forNumber(value) != null) {
              status = value;
              bitField0_ |= 0x00000004;
            }
            tag = input.readTag();
            if (tag != 0) {
              break;
            }
          }
          case 0: {
            return this;
          }
          default: {
            if (!input.skipField(tag)) {
              return this;
            }
            tag = input.readTag();
            break;
          }
        }
      }
    }

    @Override
    public void writeTo(final JsonSink output) throws IOException {
      output.beginObject();
      if ((bitField0_ & 0x00000001) != 0) {
        output.writeUInt32(FieldNames.progress, progress);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        output.writeUInt32(FieldNames.id, id);
      }
      if ((bitField0_ & 0x00000004) != 0) {
        output.writeEnum(FieldNames.status, status, MissionStatusOuterClass.MissionStatus.converter());
      }
      output.endObject();
    }

    @Override
    public Mission mergeFrom(final JsonSource input) throws IOException {
      if (!input.beginObject()) {
        return this;
      }
      while (!input.isAtEnd()) {
        switch (input.readFieldHash()) {
          case -1001078227: {
            if (input.isAtField(FieldNames.progress)) {
              if (!input.trySkipNullValue()) {
                progress = input.readUInt32();
                bitField0_ |= 0x00000001;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case 3355: {
            if (input.isAtField(FieldNames.id)) {
              if (!input.trySkipNullValue()) {
                id = input.readUInt32();
                bitField0_ |= 0x00000002;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case -892481550: {
            if (input.isAtField(FieldNames.status)) {
              if (!input.trySkipNullValue()) {
                final MissionStatusOuterClass.MissionStatus value = input.readEnum(MissionStatusOuterClass.MissionStatus.converter());
                if (value != null) {
                  status = value.getNumber();
                  bitField0_ |= 0x00000004;
                } else {
                  input.skipUnknownEnumValue();
                }
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          default: {
            input.skipUnknownField();
            break;
          }
        }
      }
      input.endObject();
      return this;
    }

    @Override
    public Mission clone() {
      return new Mission().copyFrom(this);
    }

    @Override
    public boolean isEmpty() {
      return ((bitField0_) == 0);
    }

    public static Mission parseFrom(final byte[] data) throws InvalidProtocolBufferException {
      return ProtoMessage.mergeFrom(new Mission(), data).checkInitialized();
    }

    public static Mission parseFrom(final ProtoSource input) throws IOException {
      return ProtoMessage.mergeFrom(new Mission(), input).checkInitialized();
    }

    public static Mission parseFrom(final JsonSource input) throws IOException {
      return ProtoMessage.mergeFrom(new Mission(), input).checkInitialized();
    }

    /**
     * @return factory for creating Mission messages
     */
    public static MessageFactory<Mission> getFactory() {
      return MissionFactory.INSTANCE;
    }

    private enum MissionFactory implements MessageFactory<Mission> {
      INSTANCE;

      @Override
      public Mission create() {
        return Mission.newInstance();
      }
    }

    /**
     * Contains name constants used for serializing JSON
     */
    static class FieldNames {
      static final FieldName progress = FieldName.forField("progress");

      static final FieldName id = FieldName.forField("id");

      static final FieldName status = FieldName.forField("status");
    }
  }
}
