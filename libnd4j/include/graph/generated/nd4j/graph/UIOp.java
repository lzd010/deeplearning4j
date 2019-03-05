// automatically generated by the FlatBuffers compiler, do not modify

package nd4j.graph;

import java.nio.*;
import java.lang.*;
import java.util.*;
import com.google.flatbuffers.*;

@SuppressWarnings("unused")
public final class UIOp extends Table {
  public static UIOp getRootAsUIOp(ByteBuffer _bb) { return getRootAsUIOp(_bb, new UIOp()); }
  public static UIOp getRootAsUIOp(ByteBuffer _bb, UIOp obj) { _bb.order(ByteOrder.LITTLE_ENDIAN); return (obj.__assign(_bb.getInt(_bb.position()) + _bb.position(), _bb)); }
  public void __init(int _i, ByteBuffer _bb) { bb_pos = _i; bb = _bb; }
  public UIOp __assign(int _i, ByteBuffer _bb) { __init(_i, _bb); return this; }

  public String name() { int o = __offset(4); return o != 0 ? __string(o + bb_pos) : null; }
  public ByteBuffer nameAsByteBuffer() { return __vector_as_bytebuffer(4, 1); }
  public ByteBuffer nameInByteBuffer(ByteBuffer _bb) { return __vector_in_bytebuffer(_bb, 4, 1); }
  public String opName() { int o = __offset(6); return o != 0 ? __string(o + bb_pos) : null; }
  public ByteBuffer opNameAsByteBuffer() { return __vector_as_bytebuffer(6, 1); }
  public ByteBuffer opNameInByteBuffer(ByteBuffer _bb) { return __vector_in_bytebuffer(_bb, 6, 1); }
  public String inputs(int j) { int o = __offset(8); return o != 0 ? __string(__vector(o) + j * 4) : null; }
  public int inputsLength() { int o = __offset(8); return o != 0 ? __vector_len(o) : 0; }
  public String outputs(int j) { int o = __offset(10); return o != 0 ? __string(__vector(o) + j * 4) : null; }
  public int outputsLength() { int o = __offset(10); return o != 0 ? __vector_len(o) : 0; }
  public String controlDeps(int j) { int o = __offset(12); return o != 0 ? __string(__vector(o) + j * 4) : null; }
  public int controlDepsLength() { int o = __offset(12); return o != 0 ? __vector_len(o) : 0; }
  public String uiLabelExtra() { int o = __offset(14); return o != 0 ? __string(o + bb_pos) : null; }
  public ByteBuffer uiLabelExtraAsByteBuffer() { return __vector_as_bytebuffer(14, 1); }
  public ByteBuffer uiLabelExtraInByteBuffer(ByteBuffer _bb) { return __vector_in_bytebuffer(_bb, 14, 1); }

  public static int createUIOp(FlatBufferBuilder builder,
      int nameOffset,
      int opNameOffset,
      int inputsOffset,
      int outputsOffset,
      int controlDepsOffset,
      int uiLabelExtraOffset) {
    builder.startObject(6);
    UIOp.addUiLabelExtra(builder, uiLabelExtraOffset);
    UIOp.addControlDeps(builder, controlDepsOffset);
    UIOp.addOutputs(builder, outputsOffset);
    UIOp.addInputs(builder, inputsOffset);
    UIOp.addOpName(builder, opNameOffset);
    UIOp.addName(builder, nameOffset);
    return UIOp.endUIOp(builder);
  }

  public static void startUIOp(FlatBufferBuilder builder) { builder.startObject(6); }
  public static void addName(FlatBufferBuilder builder, int nameOffset) { builder.addOffset(0, nameOffset, 0); }
  public static void addOpName(FlatBufferBuilder builder, int opNameOffset) { builder.addOffset(1, opNameOffset, 0); }
  public static void addInputs(FlatBufferBuilder builder, int inputsOffset) { builder.addOffset(2, inputsOffset, 0); }
  public static int createInputsVector(FlatBufferBuilder builder, int[] data) { builder.startVector(4, data.length, 4); for (int i = data.length - 1; i >= 0; i--) builder.addOffset(data[i]); return builder.endVector(); }
  public static void startInputsVector(FlatBufferBuilder builder, int numElems) { builder.startVector(4, numElems, 4); }
  public static void addOutputs(FlatBufferBuilder builder, int outputsOffset) { builder.addOffset(3, outputsOffset, 0); }
  public static int createOutputsVector(FlatBufferBuilder builder, int[] data) { builder.startVector(4, data.length, 4); for (int i = data.length - 1; i >= 0; i--) builder.addOffset(data[i]); return builder.endVector(); }
  public static void startOutputsVector(FlatBufferBuilder builder, int numElems) { builder.startVector(4, numElems, 4); }
  public static void addControlDeps(FlatBufferBuilder builder, int controlDepsOffset) { builder.addOffset(4, controlDepsOffset, 0); }
  public static int createControlDepsVector(FlatBufferBuilder builder, int[] data) { builder.startVector(4, data.length, 4); for (int i = data.length - 1; i >= 0; i--) builder.addOffset(data[i]); return builder.endVector(); }
  public static void startControlDepsVector(FlatBufferBuilder builder, int numElems) { builder.startVector(4, numElems, 4); }
  public static void addUiLabelExtra(FlatBufferBuilder builder, int uiLabelExtraOffset) { builder.addOffset(5, uiLabelExtraOffset, 0); }
  public static int endUIOp(FlatBufferBuilder builder) {
    int o = builder.endObject();
    return o;
  }
}
