// VideoMemoryUsageStats.java is auto generated by mojom_bindings_generator.py, do not edit


// Copyright 2014 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

// This file is autogenerated by:
//     mojo/public/tools/bindings/mojom_bindings_generator.py
// For:
//     gpu/ipc/common/memory_stats.mojom
//

package org.chromium.gpu.mojom;


public final class VideoMemoryUsageStats extends org.chromium.mojo.bindings.Struct {

    private static final int STRUCT_SIZE = 24;
    private static final org.chromium.mojo.bindings.DataHeader[] VERSION_ARRAY = new org.chromium.mojo.bindings.DataHeader[] {new org.chromium.mojo.bindings.DataHeader(24, 0)};
    private static final org.chromium.mojo.bindings.DataHeader DEFAULT_STRUCT_INFO = VERSION_ARRAY[0];
    public java.util.Map<Integer, VideoMemoryProcessStats> processMap;
    public long bytesAllocated;

    private VideoMemoryUsageStats(int version) {
        super(STRUCT_SIZE, version);
    }

    public VideoMemoryUsageStats() {
        this(0);
    }

    public static VideoMemoryUsageStats deserialize(org.chromium.mojo.bindings.Message message) {
        return decode(new org.chromium.mojo.bindings.Decoder(message));
    }

    /**
     * Similar to the method above, but deserializes from a |ByteBuffer| instance.
     *
     * @throws org.chromium.mojo.bindings.DeserializationException on deserialization failure.
     */
    public static VideoMemoryUsageStats deserialize(java.nio.ByteBuffer data) {
        return deserialize(new org.chromium.mojo.bindings.Message(
                data, new java.util.ArrayList<org.chromium.mojo.system.Handle>()));
    }

    public static VideoMemoryUsageStats decode(org.chromium.mojo.bindings.Decoder decoder0) {
        if (decoder0 == null) {
            return null;
        }
        decoder0.increaseStackDepth();
        VideoMemoryUsageStats result;
        try {
            org.chromium.mojo.bindings.DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
            final int elementsOrVersion = mainDataHeader.elementsOrVersion;
            result = new VideoMemoryUsageStats(elementsOrVersion);
                {
                    
                org.chromium.mojo.bindings.Decoder decoder1 = decoder0.readPointer(8, false);
                {
                    decoder1.readDataHeaderForMap();
                    int[] keys0;
                    VideoMemoryProcessStats[] values0;
                    {
                        
                        keys0 = decoder1.readInts(org.chromium.mojo.bindings.DataHeader.HEADER_SIZE, org.chromium.mojo.bindings.BindingsHelper.NOTHING_NULLABLE, org.chromium.mojo.bindings.BindingsHelper.UNSPECIFIED_ARRAY_LENGTH);
                    }
                    {
                        
                        org.chromium.mojo.bindings.Decoder decoder2 = decoder1.readPointer(org.chromium.mojo.bindings.DataHeader.HEADER_SIZE + org.chromium.mojo.bindings.BindingsHelper.POINTER_SIZE, false);
                        {
                            org.chromium.mojo.bindings.DataHeader si2 = decoder2.readDataHeaderForPointerArray(keys0.length);
                            values0 = new VideoMemoryProcessStats[si2.elementsOrVersion];
                            for (int i2 = 0; i2 < si2.elementsOrVersion; ++i2) {
                                
                                org.chromium.mojo.bindings.Decoder decoder3 = decoder2.readPointer(org.chromium.mojo.bindings.DataHeader.HEADER_SIZE + org.chromium.mojo.bindings.BindingsHelper.POINTER_SIZE * i2, false);
                                values0[i2] = VideoMemoryProcessStats.decode(decoder3);
                            }
                        }
                    }
                    result.processMap = new java.util.HashMap<Integer, VideoMemoryProcessStats>();
                    for (int index0 = 0; index0 < keys0.length; ++index0) {
                        result.processMap.put(keys0[index0],  values0[index0]);
                    }
                }
                }
                {
                    
                result.bytesAllocated = decoder0.readLong(16);
                }

        } finally {
            decoder0.decreaseStackDepth();
        }
        return result;
    }

    @Override
    protected void encode(org.chromium.mojo.bindings.Encoder encoder) {
        org.chromium.mojo.bindings.Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
        
        if (this.processMap == null) {
            encoder0.encodeNullPointer(8, false);
        } else {
            org.chromium.mojo.bindings.Encoder encoder1 = encoder0.encoderForMap(8);
            int size0 = this.processMap.size();
            int[] keys0 = new int[size0];
            VideoMemoryProcessStats[] values0 = new VideoMemoryProcessStats[size0];
            int index0 = 0;
            for (java.util.Map.Entry<Integer, VideoMemoryProcessStats> entry0 : this.processMap.entrySet()) {
                keys0[index0] = entry0.getKey();
                values0[index0] = entry0.getValue();
                ++index0;
            }
            
            encoder1.encode(keys0, org.chromium.mojo.bindings.DataHeader.HEADER_SIZE, org.chromium.mojo.bindings.BindingsHelper.NOTHING_NULLABLE, org.chromium.mojo.bindings.BindingsHelper.UNSPECIFIED_ARRAY_LENGTH);
            
            {
                org.chromium.mojo.bindings.Encoder encoder2 = encoder1.encodePointerArray(values0.length, org.chromium.mojo.bindings.DataHeader.HEADER_SIZE + org.chromium.mojo.bindings.BindingsHelper.POINTER_SIZE, org.chromium.mojo.bindings.BindingsHelper.UNSPECIFIED_ARRAY_LENGTH);
                for (int i1 = 0; i1 < values0.length; ++i1) {
                    
                    encoder2.encode(values0[i1], org.chromium.mojo.bindings.DataHeader.HEADER_SIZE + org.chromium.mojo.bindings.BindingsHelper.POINTER_SIZE * i1, false);
                }
            }
        }
        
        encoder0.encode(this.bytesAllocated, 16);
    }
}