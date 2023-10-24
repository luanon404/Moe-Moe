// AxTreeUpdate.java is auto generated by mojom_bindings_generator.py, do not edit


// Copyright 2014 The Chromium Authors
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

// This file is autogenerated by:
//     mojo/public/tools/bindings/mojom_bindings_generator.py
// For:
//     ui/accessibility/mojom/ax_tree_update.mojom
//

package org.chromium.ax.mojom;

public final class AxTreeUpdate extends org.chromium.mojo.bindings.Struct {

    private static final int STRUCT_SIZE = 56;
    private static final org.chromium.mojo.bindings.DataHeader[] VERSION_ARRAY = new org.chromium.mojo.bindings.DataHeader[]{new org.chromium.mojo.bindings.DataHeader(56, 0)};
    private static final org.chromium.mojo.bindings.DataHeader DEFAULT_STRUCT_INFO = VERSION_ARRAY[0];
    public boolean hasTreeData;
    public AxTreeData treeData;
    public int nodeIdToClear;
    public int rootId;
    public AxNodeData[] nodes;
    public int eventFrom;
    public int eventFromAction;
    public EventIntent[] eventIntents;

    private AxTreeUpdate(int version) {
        super(STRUCT_SIZE, version);
    }

    public AxTreeUpdate() {
        this(0);
    }

    public static AxTreeUpdate deserialize(org.chromium.mojo.bindings.Message message) {
        return decode(new org.chromium.mojo.bindings.Decoder(message));
    }

    /**
     * Similar to the method above, but deserializes from a |ByteBuffer| instance.
     *
     * @throws org.chromium.mojo.bindings.DeserializationException on deserialization failure.
     */
    public static AxTreeUpdate deserialize(java.nio.ByteBuffer data) {
        return deserialize(new org.chromium.mojo.bindings.Message(data, new java.util.ArrayList<org.chromium.mojo.system.Handle>()));
    }

    @SuppressWarnings("unchecked")
    public static AxTreeUpdate decode(org.chromium.mojo.bindings.Decoder decoder0) {
        if (decoder0 == null) {
            return null;
        }
        decoder0.increaseStackDepth();
        AxTreeUpdate result;
        try {
            org.chromium.mojo.bindings.DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
            final int elementsOrVersion = mainDataHeader.elementsOrVersion;
            result = new AxTreeUpdate(elementsOrVersion);
            {

                result.hasTreeData = decoder0.readBoolean(8, 0);
            }
            {

                result.nodeIdToClear = decoder0.readInt(12);
            }
            {

                org.chromium.mojo.bindings.Decoder decoder1 = decoder0.readPointer(16, false);
                result.treeData = AxTreeData.decode(decoder1);
            }
            {

                result.rootId = decoder0.readInt(24);
            }
            {

                result.eventFrom = decoder0.readInt(28);
                EventFrom.validate(result.eventFrom);
                result.eventFrom = EventFrom.toKnownValue(result.eventFrom);
            }
            {

                org.chromium.mojo.bindings.Decoder decoder1 = decoder0.readPointer(32, false);
                {
                    org.chromium.mojo.bindings.DataHeader si1 = decoder1.readDataHeaderForPointerArray(org.chromium.mojo.bindings.BindingsHelper.UNSPECIFIED_ARRAY_LENGTH);
                    result.nodes = new AxNodeData[si1.elementsOrVersion];
                    for (int i1 = 0; i1 < si1.elementsOrVersion; ++i1) {

                        org.chromium.mojo.bindings.Decoder decoder2 = decoder1.readPointer(org.chromium.mojo.bindings.DataHeader.HEADER_SIZE + org.chromium.mojo.bindings.BindingsHelper.POINTER_SIZE * i1, false);
                        result.nodes[i1] = AxNodeData.decode(decoder2);
                    }
                }
            }
            {

                result.eventFromAction = decoder0.readInt(40);
                Action.validate(result.eventFromAction);
                result.eventFromAction = Action.toKnownValue(result.eventFromAction);
            }
            {

                org.chromium.mojo.bindings.Decoder decoder1 = decoder0.readPointer(48, false);
                {
                    org.chromium.mojo.bindings.DataHeader si1 = decoder1.readDataHeaderForPointerArray(org.chromium.mojo.bindings.BindingsHelper.UNSPECIFIED_ARRAY_LENGTH);
                    result.eventIntents = new EventIntent[si1.elementsOrVersion];
                    for (int i1 = 0; i1 < si1.elementsOrVersion; ++i1) {

                        org.chromium.mojo.bindings.Decoder decoder2 = decoder1.readPointer(org.chromium.mojo.bindings.DataHeader.HEADER_SIZE + org.chromium.mojo.bindings.BindingsHelper.POINTER_SIZE * i1, false);
                        result.eventIntents[i1] = EventIntent.decode(decoder2);
                    }
                }
            }

        } finally {
            decoder0.decreaseStackDepth();
        }
        return result;
    }

    @SuppressWarnings("unchecked")
    @Override
    protected final void encode(org.chromium.mojo.bindings.Encoder encoder) {
        org.chromium.mojo.bindings.Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);

        encoder0.encode(this.hasTreeData, 8, 0);

        encoder0.encode(this.nodeIdToClear, 12);

        encoder0.encode(this.treeData, 16, false);

        encoder0.encode(this.rootId, 24);

        encoder0.encode(this.eventFrom, 28);

        if (this.nodes == null) {
            encoder0.encodeNullPointer(32, false);
        } else {
            org.chromium.mojo.bindings.Encoder encoder1 = encoder0.encodePointerArray(this.nodes.length, 32, org.chromium.mojo.bindings.BindingsHelper.UNSPECIFIED_ARRAY_LENGTH);
            for (int i0 = 0; i0 < this.nodes.length; ++i0) {

                encoder1.encode(this.nodes[i0], org.chromium.mojo.bindings.DataHeader.HEADER_SIZE + org.chromium.mojo.bindings.BindingsHelper.POINTER_SIZE * i0, false);
            }
        }

        encoder0.encode(this.eventFromAction, 40);

        if (this.eventIntents == null) {
            encoder0.encodeNullPointer(48, false);
        } else {
            org.chromium.mojo.bindings.Encoder encoder1 = encoder0.encodePointerArray(this.eventIntents.length, 48, org.chromium.mojo.bindings.BindingsHelper.UNSPECIFIED_ARRAY_LENGTH);
            for (int i0 = 0; i0 < this.eventIntents.length; ++i0) {

                encoder1.encode(this.eventIntents[i0], org.chromium.mojo.bindings.DataHeader.HEADER_SIZE + org.chromium.mojo.bindings.BindingsHelper.POINTER_SIZE * i0, false);
            }
        }
    }
}