package org.openjdk.jmc.flightrecorder.parser;

import java.nio.*;

public class ByteBufferWrapper {

    private final ByteBuffer buffer;

    public ByteBufferWrapper(ByteBuffer buffer) {
        this.buffer = buffer;
    }

    public ByteBufferWrapper view(@SuppressWarnings("unused") int size) {
        return this;
    }

    public ByteBufferWrapper slice() {
        return new ByteBufferWrapper(buffer.slice());
    }

    public ByteBuffer getBuffer() {
        return buffer;
    }

    public static ByteBufferWrapper wrap(byte[] data) {
        return new ByteBufferWrapper(ByteBuffer.wrap(data));
    }

    public int limit() {
        return buffer.limit();
    }

    public Buffer position(int index) {
        return buffer.position(index);
    }

    public ByteBuffer get(byte[] bytes) {
        return buffer.get(bytes);
    }

    public void get(byte[] dst, int off, int len) {
        buffer.get(dst, off, len);
    }

    public byte get() {
        return buffer.get();
    }

    public byte get(int index) {
        return buffer.get(index);
    }

    public short getShort() {
        return buffer.getShort();
    }

    public short getShort(int index) {
        return buffer.getShort(index);
    }

    public int getInt() {
        return buffer.getInt();
    }

    public int getInt(int index) {
        return buffer.getInt(index);
    }

    public long getLong() {
        return buffer.getLong();
    }

    public long getLong(int index) {
        return buffer.getLong(index);
    }

    public float getFloat() {
        return buffer.getFloat();
    }

    public float getFloat(int index) {
        return buffer.getFloat(index);
    }

    public double getDouble() {
        return buffer.getDouble();
    }

    public double getDouble(int index) {
        return buffer.getDouble(index);
    }

    public boolean hasArray() {
        return buffer.hasArray();
    }

    public byte[] array() {
        return buffer.array();
    }
}
