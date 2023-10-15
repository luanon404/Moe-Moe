// ColorSpace.java is auto generated by mojom_bindings_generator.py, do not edit


// Copyright 2014 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

// This file is autogenerated by:
//     mojo/public/tools/bindings/mojom_bindings_generator.py
// For:
//     ui/gfx/mojom/color_space.mojom
//

package org.chromium.gfx.mojom;


public final class ColorSpace extends org.chromium.mojo.bindings.Struct {

    private static final int STRUCT_SIZE = 40;
    private static final org.chromium.mojo.bindings.DataHeader[] VERSION_ARRAY = new org.chromium.mojo.bindings.DataHeader[] {new org.chromium.mojo.bindings.DataHeader(40, 0)};
    private static final org.chromium.mojo.bindings.DataHeader DEFAULT_STRUCT_INFO = VERSION_ARRAY[0];
    public int primaries;
    public int transfer;
    public int matrix;
    public int range;
    public float[] customPrimaryMatrix;
    public float[] transferParams;

    private ColorSpace(int version) {
        super(STRUCT_SIZE, version);
    }

    public ColorSpace() {
        this(0);
    }

    public static ColorSpace deserialize(org.chromium.mojo.bindings.Message message) {
        return decode(new org.chromium.mojo.bindings.Decoder(message));
    }

    /**
     * Similar to the method above, but deserializes from a |ByteBuffer| instance.
     *
     * @throws org.chromium.mojo.bindings.DeserializationException on deserialization failure.
     */
    public static ColorSpace deserialize(java.nio.ByteBuffer data) {
        return deserialize(new org.chromium.mojo.bindings.Message(
                data, new java.util.ArrayList<org.chromium.mojo.system.Handle>()));
    }

    public static ColorSpace decode(org.chromium.mojo.bindings.Decoder decoder0) {
        if (decoder0 == null) {
            return null;
        }
        decoder0.increaseStackDepth();
        ColorSpace result;
        try {
            org.chromium.mojo.bindings.DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
            final int elementsOrVersion = mainDataHeader.elementsOrVersion;
            result = new ColorSpace(elementsOrVersion);
                {
                    
                result.primaries = decoder0.readInt(8);
                    ColorSpacePrimaryId.validate(result.primaries);
                    result.primaries = ColorSpacePrimaryId.toKnownValue(result.primaries);
                }
                {
                    
                result.transfer = decoder0.readInt(12);
                    ColorSpaceTransferId.validate(result.transfer);
                    result.transfer = ColorSpaceTransferId.toKnownValue(result.transfer);
                }
                {
                    
                result.matrix = decoder0.readInt(16);
                    ColorSpaceMatrixId.validate(result.matrix);
                    result.matrix = ColorSpaceMatrixId.toKnownValue(result.matrix);
                }
                {
                    
                result.range = decoder0.readInt(20);
                    ColorSpaceRangeId.validate(result.range);
                    result.range = ColorSpaceRangeId.toKnownValue(result.range);
                }
                {
                    
                result.customPrimaryMatrix = decoder0.readFloats(24, org.chromium.mojo.bindings.BindingsHelper.NOTHING_NULLABLE, 9);
                }
                {
                    
                result.transferParams = decoder0.readFloats(32, org.chromium.mojo.bindings.BindingsHelper.NOTHING_NULLABLE, 7);
                }

        } finally {
            decoder0.decreaseStackDepth();
        }
        return result;
    }

    @Override
    protected void encode(org.chromium.mojo.bindings.Encoder encoder) {
        org.chromium.mojo.bindings.Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
        
        encoder0.encode(this.primaries, 8);
        
        encoder0.encode(this.transfer, 12);
        
        encoder0.encode(this.matrix, 16);
        
        encoder0.encode(this.range, 20);
        
        encoder0.encode(this.customPrimaryMatrix, 24, org.chromium.mojo.bindings.BindingsHelper.NOTHING_NULLABLE, 9);
        
        encoder0.encode(this.transferParams, 32, org.chromium.mojo.bindings.BindingsHelper.NOTHING_NULLABLE, 7);
    }
}