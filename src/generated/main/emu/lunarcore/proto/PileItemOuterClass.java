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

public final class PileItemOuterClass {
  /**
   * Protobuf type {@code PileItem}
   */
  public static final class PileItem extends ProtoMessage<PileItem> implements Cloneable {
    private static final long serialVersionUID = 0L;

    /**
     * <code>optional uint32 item_num = 12;</code>
     */
    private int itemNum;

    /**
     * <code>optional uint32 item_id = 14;</code>
     */
    private int itemId;

    private PileItem() {
    }

    /**
     * @return a new empty instance of {@code PileItem}
     */
    public static PileItem newInstance() {
      return new PileItem();
    }

    /**
     * <code>optional uint32 item_num = 12;</code>
     * @return whether the itemNum field is set
     */
    public boolean hasItemNum() {
      return (bitField0_ & 0x00000001) != 0;
    }

    /**
     * <code>optional uint32 item_num = 12;</code>
     * @return this
     */
    public PileItem clearItemNum() {
      bitField0_ &= ~0x00000001;
      itemNum = 0;
      return this;
    }

    /**
     * <code>optional uint32 item_num = 12;</code>
     * @return the itemNum
     */
    public int getItemNum() {
      return itemNum;
    }

    /**
     * <code>optional uint32 item_num = 12;</code>
     * @param value the itemNum to set
     * @return this
     */
    public PileItem setItemNum(final int value) {
      bitField0_ |= 0x00000001;
      itemNum = value;
      return this;
    }

    /**
     * <code>optional uint32 item_id = 14;</code>
     * @return whether the itemId field is set
     */
    public boolean hasItemId() {
      return (bitField0_ & 0x00000002) != 0;
    }

    /**
     * <code>optional uint32 item_id = 14;</code>
     * @return this
     */
    public PileItem clearItemId() {
      bitField0_ &= ~0x00000002;
      itemId = 0;
      return this;
    }

    /**
     * <code>optional uint32 item_id = 14;</code>
     * @return the itemId
     */
    public int getItemId() {
      return itemId;
    }

    /**
     * <code>optional uint32 item_id = 14;</code>
     * @param value the itemId to set
     * @return this
     */
    public PileItem setItemId(final int value) {
      bitField0_ |= 0x00000002;
      itemId = value;
      return this;
    }

    @Override
    public PileItem copyFrom(final PileItem other) {
      cachedSize = other.cachedSize;
      if ((bitField0_ | other.bitField0_) != 0) {
        bitField0_ = other.bitField0_;
        itemNum = other.itemNum;
        itemId = other.itemId;
      }
      return this;
    }

    @Override
    public PileItem mergeFrom(final PileItem other) {
      if (other.isEmpty()) {
        return this;
      }
      cachedSize = -1;
      if (other.hasItemNum()) {
        setItemNum(other.itemNum);
      }
      if (other.hasItemId()) {
        setItemId(other.itemId);
      }
      return this;
    }

    @Override
    public PileItem clear() {
      if (isEmpty()) {
        return this;
      }
      cachedSize = -1;
      bitField0_ = 0;
      itemNum = 0;
      itemId = 0;
      return this;
    }

    @Override
    public PileItem clearQuick() {
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
      if (!(o instanceof PileItem)) {
        return false;
      }
      PileItem other = (PileItem) o;
      return bitField0_ == other.bitField0_
        && (!hasItemNum() || itemNum == other.itemNum)
        && (!hasItemId() || itemId == other.itemId);
    }

    @Override
    public void writeTo(final ProtoSink output) throws IOException {
      if ((bitField0_ & 0x00000001) != 0) {
        output.writeRawByte((byte) 96);
        output.writeUInt32NoTag(itemNum);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        output.writeRawByte((byte) 112);
        output.writeUInt32NoTag(itemId);
      }
    }

    @Override
    protected int computeSerializedSize() {
      int size = 0;
      if ((bitField0_ & 0x00000001) != 0) {
        size += 1 + ProtoSink.computeUInt32SizeNoTag(itemNum);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        size += 1 + ProtoSink.computeUInt32SizeNoTag(itemId);
      }
      return size;
    }

    @Override
    @SuppressWarnings("fallthrough")
    public PileItem mergeFrom(final ProtoSource input) throws IOException {
      // Enabled Fall-Through Optimization (QuickBuffers)
      int tag = input.readTag();
      while (true) {
        switch (tag) {
          case 96: {
            // itemNum
            itemNum = input.readUInt32();
            bitField0_ |= 0x00000001;
            tag = input.readTag();
            if (tag != 112) {
              break;
            }
          }
          case 112: {
            // itemId
            itemId = input.readUInt32();
            bitField0_ |= 0x00000002;
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
        output.writeUInt32(FieldNames.itemNum, itemNum);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        output.writeUInt32(FieldNames.itemId, itemId);
      }
      output.endObject();
    }

    @Override
    public PileItem mergeFrom(final JsonSource input) throws IOException {
      if (!input.beginObject()) {
        return this;
      }
      while (!input.isAtEnd()) {
        switch (input.readFieldHash()) {
          case 2116189043:
          case 1177850970: {
            if (input.isAtField(FieldNames.itemNum)) {
              if (!input.trySkipNullValue()) {
                itemNum = input.readUInt32();
                bitField0_ |= 0x00000001;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case -1178662002:
          case 2116204999: {
            if (input.isAtField(FieldNames.itemId)) {
              if (!input.trySkipNullValue()) {
                itemId = input.readUInt32();
                bitField0_ |= 0x00000002;
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
    public PileItem clone() {
      return new PileItem().copyFrom(this);
    }

    @Override
    public boolean isEmpty() {
      return ((bitField0_) == 0);
    }

    public static PileItem parseFrom(final byte[] data) throws InvalidProtocolBufferException {
      return ProtoMessage.mergeFrom(new PileItem(), data).checkInitialized();
    }

    public static PileItem parseFrom(final ProtoSource input) throws IOException {
      return ProtoMessage.mergeFrom(new PileItem(), input).checkInitialized();
    }

    public static PileItem parseFrom(final JsonSource input) throws IOException {
      return ProtoMessage.mergeFrom(new PileItem(), input).checkInitialized();
    }

    /**
     * @return factory for creating PileItem messages
     */
    public static MessageFactory<PileItem> getFactory() {
      return PileItemFactory.INSTANCE;
    }

    private enum PileItemFactory implements MessageFactory<PileItem> {
      INSTANCE;

      @Override
      public PileItem create() {
        return PileItem.newInstance();
      }
    }

    /**
     * Contains name constants used for serializing JSON
     */
    static class FieldNames {
      static final FieldName itemNum = FieldName.forField("itemNum", "item_num");

      static final FieldName itemId = FieldName.forField("itemId", "item_id");
    }
  }
}
