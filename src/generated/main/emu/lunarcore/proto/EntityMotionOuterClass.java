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

public final class EntityMotionOuterClass {
  /**
   * Protobuf type {@code EntityMotion}
   */
  public static final class EntityMotion extends ProtoMessage<EntityMotion> implements Cloneable {
    private static final long serialVersionUID = 0L;

    /**
     * <code>optional uint32 map_layer = 11;</code>
     */
    private int mapLayer;

    /**
     * <code>optional uint32 entity_id = 15;</code>
     */
    private int entityId;

    /**
     * <code>optional .MotionInfo motion = 1;</code>
     */
    private final MotionInfoOuterClass.MotionInfo motion = MotionInfoOuterClass.MotionInfo.newInstance();

    private EntityMotion() {
    }

    /**
     * @return a new empty instance of {@code EntityMotion}
     */
    public static EntityMotion newInstance() {
      return new EntityMotion();
    }

    /**
     * <code>optional uint32 map_layer = 11;</code>
     * @return whether the mapLayer field is set
     */
    public boolean hasMapLayer() {
      return (bitField0_ & 0x00000001) != 0;
    }

    /**
     * <code>optional uint32 map_layer = 11;</code>
     * @return this
     */
    public EntityMotion clearMapLayer() {
      bitField0_ &= ~0x00000001;
      mapLayer = 0;
      return this;
    }

    /**
     * <code>optional uint32 map_layer = 11;</code>
     * @return the mapLayer
     */
    public int getMapLayer() {
      return mapLayer;
    }

    /**
     * <code>optional uint32 map_layer = 11;</code>
     * @param value the mapLayer to set
     * @return this
     */
    public EntityMotion setMapLayer(final int value) {
      bitField0_ |= 0x00000001;
      mapLayer = value;
      return this;
    }

    /**
     * <code>optional uint32 entity_id = 15;</code>
     * @return whether the entityId field is set
     */
    public boolean hasEntityId() {
      return (bitField0_ & 0x00000002) != 0;
    }

    /**
     * <code>optional uint32 entity_id = 15;</code>
     * @return this
     */
    public EntityMotion clearEntityId() {
      bitField0_ &= ~0x00000002;
      entityId = 0;
      return this;
    }

    /**
     * <code>optional uint32 entity_id = 15;</code>
     * @return the entityId
     */
    public int getEntityId() {
      return entityId;
    }

    /**
     * <code>optional uint32 entity_id = 15;</code>
     * @param value the entityId to set
     * @return this
     */
    public EntityMotion setEntityId(final int value) {
      bitField0_ |= 0x00000002;
      entityId = value;
      return this;
    }

    /**
     * <code>optional .MotionInfo motion = 1;</code>
     * @return whether the motion field is set
     */
    public boolean hasMotion() {
      return (bitField0_ & 0x00000004) != 0;
    }

    /**
     * <code>optional .MotionInfo motion = 1;</code>
     * @return this
     */
    public EntityMotion clearMotion() {
      bitField0_ &= ~0x00000004;
      motion.clear();
      return this;
    }

    /**
     * <code>optional .MotionInfo motion = 1;</code>
     *
     * This method returns the internal storage object without modifying any has state.
     * The returned object should not be modified and be treated as read-only.
     *
     * Use {@link #getMutableMotion()} if you want to modify it.
     *
     * @return internal storage object for reading
     */
    public MotionInfoOuterClass.MotionInfo getMotion() {
      return motion;
    }

    /**
     * <code>optional .MotionInfo motion = 1;</code>
     *
     * This method returns the internal storage object and sets the corresponding
     * has state. The returned object will become part of this message and its
     * contents may be modified as long as the has state is not cleared.
     *
     * @return internal storage object for modifications
     */
    public MotionInfoOuterClass.MotionInfo getMutableMotion() {
      bitField0_ |= 0x00000004;
      return motion;
    }

    /**
     * <code>optional .MotionInfo motion = 1;</code>
     * @param value the motion to set
     * @return this
     */
    public EntityMotion setMotion(final MotionInfoOuterClass.MotionInfo value) {
      bitField0_ |= 0x00000004;
      motion.copyFrom(value);
      return this;
    }

    @Override
    public EntityMotion copyFrom(final EntityMotion other) {
      cachedSize = other.cachedSize;
      if ((bitField0_ | other.bitField0_) != 0) {
        bitField0_ = other.bitField0_;
        mapLayer = other.mapLayer;
        entityId = other.entityId;
        motion.copyFrom(other.motion);
      }
      return this;
    }

    @Override
    public EntityMotion mergeFrom(final EntityMotion other) {
      if (other.isEmpty()) {
        return this;
      }
      cachedSize = -1;
      if (other.hasMapLayer()) {
        setMapLayer(other.mapLayer);
      }
      if (other.hasEntityId()) {
        setEntityId(other.entityId);
      }
      if (other.hasMotion()) {
        getMutableMotion().mergeFrom(other.motion);
      }
      return this;
    }

    @Override
    public EntityMotion clear() {
      if (isEmpty()) {
        return this;
      }
      cachedSize = -1;
      bitField0_ = 0;
      mapLayer = 0;
      entityId = 0;
      motion.clear();
      return this;
    }

    @Override
    public EntityMotion clearQuick() {
      if (isEmpty()) {
        return this;
      }
      cachedSize = -1;
      bitField0_ = 0;
      motion.clearQuick();
      return this;
    }

    @Override
    public boolean equals(Object o) {
      if (o == this) {
        return true;
      }
      if (!(o instanceof EntityMotion)) {
        return false;
      }
      EntityMotion other = (EntityMotion) o;
      return bitField0_ == other.bitField0_
        && (!hasMapLayer() || mapLayer == other.mapLayer)
        && (!hasEntityId() || entityId == other.entityId)
        && (!hasMotion() || motion.equals(other.motion));
    }

    @Override
    public void writeTo(final ProtoSink output) throws IOException {
      if ((bitField0_ & 0x00000001) != 0) {
        output.writeRawByte((byte) 88);
        output.writeUInt32NoTag(mapLayer);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        output.writeRawByte((byte) 120);
        output.writeUInt32NoTag(entityId);
      }
      if ((bitField0_ & 0x00000004) != 0) {
        output.writeRawByte((byte) 10);
        output.writeMessageNoTag(motion);
      }
    }

    @Override
    protected int computeSerializedSize() {
      int size = 0;
      if ((bitField0_ & 0x00000001) != 0) {
        size += 1 + ProtoSink.computeUInt32SizeNoTag(mapLayer);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        size += 1 + ProtoSink.computeUInt32SizeNoTag(entityId);
      }
      if ((bitField0_ & 0x00000004) != 0) {
        size += 1 + ProtoSink.computeMessageSizeNoTag(motion);
      }
      return size;
    }

    @Override
    @SuppressWarnings("fallthrough")
    public EntityMotion mergeFrom(final ProtoSource input) throws IOException {
      // Enabled Fall-Through Optimization (QuickBuffers)
      int tag = input.readTag();
      while (true) {
        switch (tag) {
          case 88: {
            // mapLayer
            mapLayer = input.readUInt32();
            bitField0_ |= 0x00000001;
            tag = input.readTag();
            if (tag != 120) {
              break;
            }
          }
          case 120: {
            // entityId
            entityId = input.readUInt32();
            bitField0_ |= 0x00000002;
            tag = input.readTag();
            if (tag != 10) {
              break;
            }
          }
          case 10: {
            // motion
            input.readMessage(motion);
            bitField0_ |= 0x00000004;
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
        output.writeUInt32(FieldNames.mapLayer, mapLayer);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        output.writeUInt32(FieldNames.entityId, entityId);
      }
      if ((bitField0_ & 0x00000004) != 0) {
        output.writeMessage(FieldNames.motion, motion);
      }
      output.endObject();
    }

    @Override
    public EntityMotion mergeFrom(final JsonSource input) throws IOException {
      if (!input.beginObject()) {
        return this;
      }
      while (!input.isAtEnd()) {
        switch (input.readFieldHash()) {
          case 160971093:
          case 1248553134: {
            if (input.isAtField(FieldNames.mapLayer)) {
              if (!input.trySkipNullValue()) {
                mapLayer = input.readUInt32();
                bitField0_ |= 0x00000001;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case -2102099874:
          case -740565257: {
            if (input.isAtField(FieldNames.entityId)) {
              if (!input.trySkipNullValue()) {
                entityId = input.readUInt32();
                bitField0_ |= 0x00000002;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case -1068318794: {
            if (input.isAtField(FieldNames.motion)) {
              if (!input.trySkipNullValue()) {
                input.readMessage(motion);
                bitField0_ |= 0x00000004;
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
    public EntityMotion clone() {
      return new EntityMotion().copyFrom(this);
    }

    @Override
    public boolean isEmpty() {
      return ((bitField0_) == 0);
    }

    public static EntityMotion parseFrom(final byte[] data) throws InvalidProtocolBufferException {
      return ProtoMessage.mergeFrom(new EntityMotion(), data).checkInitialized();
    }

    public static EntityMotion parseFrom(final ProtoSource input) throws IOException {
      return ProtoMessage.mergeFrom(new EntityMotion(), input).checkInitialized();
    }

    public static EntityMotion parseFrom(final JsonSource input) throws IOException {
      return ProtoMessage.mergeFrom(new EntityMotion(), input).checkInitialized();
    }

    /**
     * @return factory for creating EntityMotion messages
     */
    public static MessageFactory<EntityMotion> getFactory() {
      return EntityMotionFactory.INSTANCE;
    }

    private enum EntityMotionFactory implements MessageFactory<EntityMotion> {
      INSTANCE;

      @Override
      public EntityMotion create() {
        return EntityMotion.newInstance();
      }
    }

    /**
     * Contains name constants used for serializing JSON
     */
    static class FieldNames {
      static final FieldName mapLayer = FieldName.forField("mapLayer", "map_layer");

      static final FieldName entityId = FieldName.forField("entityId", "entity_id");

      static final FieldName motion = FieldName.forField("motion");
    }
  }
}
