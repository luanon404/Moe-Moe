// InterestGroup.java is auto generated by mojom_bindings_generator.py, do not edit


// Copyright 2014 The Chromium Authors
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

// This file is autogenerated by:
//     mojo/public/tools/bindings/mojom_bindings_generator.py
// For:
//     third_party/blink/public/mojom/interest_group/interest_group_types.mojom
//

package org.chromium.blink.mojom;

import androidx.annotation.IntDef;


public final class InterestGroup extends org.chromium.mojo.bindings.Struct {

    private static final int STRUCT_SIZE = 184;
    private static final org.chromium.mojo.bindings.DataHeader[] VERSION_ARRAY = new org.chromium.mojo.bindings.DataHeader[] {new org.chromium.mojo.bindings.DataHeader(184, 0)};
    private static final org.chromium.mojo.bindings.DataHeader DEFAULT_STRUCT_INFO = VERSION_ARRAY[0];

    public static final class ExecutionMode {
        private static final boolean IS_EXTENSIBLE = true;
        @IntDef({

            ExecutionMode.COMPATIBILITY_MODE,
            ExecutionMode.GROUPED_BY_ORIGIN_MODE,
            ExecutionMode.FROZEN_CONTEXT})
        public @interface EnumType {}

        public static final int COMPATIBILITY_MODE = 0;
        public static final int GROUPED_BY_ORIGIN_MODE = 1;
        public static final int FROZEN_CONTEXT = 2;
        public static final int MIN_VALUE = 0;
        public static final int MAX_VALUE = 2;
        public static final int DEFAULT_VALUE = 0;

        public static boolean isKnownValue(int value) {
            return value >= 0 && value <= 2;
        }

        public static void validate(int value) {
            if (IS_EXTENSIBLE || isKnownValue(value)) return;
            throw new org.chromium.mojo.bindings.DeserializationException("Invalid enum value.");
        }

        public static int toKnownValue(int value) {
          if (isKnownValue(value)) {
            return value;
          }
          return DEFAULT_VALUE;
        }

        private ExecutionMode() {}
    }
    public org.chromium.mojo_base.mojom.Time expiry;
    public org.chromium.url.internal.mojom.Origin owner;
    public String name;
    public double priority;
    public boolean enableBiddingSignalsPrioritization;
    public java.util.Map<String, Double> priorityVector;
    public java.util.Map<String, Double> prioritySignalsOverrides;
    public java.util.Map<org.chromium.url.internal.mojom.Origin, SellerCapabilities> sellerCapabilities;
    public SellerCapabilities allSellersCapabilities;
    public int executionMode;
    public org.chromium.url.mojom.Url biddingUrl;
    public org.chromium.url.mojom.Url biddingWasmHelperUrl;
    public org.chromium.url.mojom.Url updateUrl;
    public org.chromium.url.mojom.Url trustedBiddingSignalsUrl;
    public String[] trustedBiddingSignalsKeys;
    public String userBiddingSignals;
    public InterestGroupAd[] ads;
    public InterestGroupAd[] adComponents;
    public java.util.Map<String, AdSize> adSizes;
    public java.util.Map<String, String[]> sizeGroups;
    public AuctionServerRequestFlags auctionServerRequestFlags;
    public byte[] additionalBidKey;
    public org.chromium.url.internal.mojom.Origin aggregationCoordinatorOrigin;

    private InterestGroup(int version) {
        super(STRUCT_SIZE, version);
        this.priority = (double) 0.0;
        this.executionMode = (int) InterestGroup.ExecutionMode.COMPATIBILITY_MODE;
    }

    public InterestGroup() {
        this(0);
    }

    public static InterestGroup deserialize(org.chromium.mojo.bindings.Message message) {
        return decode(new org.chromium.mojo.bindings.Decoder(message));
    }

    /**
     * Similar to the method above, but deserializes from a |ByteBuffer| instance.
     *
     * @throws org.chromium.mojo.bindings.DeserializationException on deserialization failure.
     */
    public static InterestGroup deserialize(java.nio.ByteBuffer data) {
        return deserialize(new org.chromium.mojo.bindings.Message(
                data, new java.util.ArrayList<org.chromium.mojo.system.Handle>()));
    }

    @SuppressWarnings("unchecked")
    public static InterestGroup decode(org.chromium.mojo.bindings.Decoder decoder0) {
        if (decoder0 == null) {
            return null;
        }
        decoder0.increaseStackDepth();
        InterestGroup result;
        try {
            org.chromium.mojo.bindings.DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
            final int elementsOrVersion = mainDataHeader.elementsOrVersion;
            result = new InterestGroup(elementsOrVersion);
                {
                    
                org.chromium.mojo.bindings.Decoder decoder1 = decoder0.readPointer(8, false);
                result.expiry = org.chromium.mojo_base.mojom.Time.decode(decoder1);
                }
                {
                    
                org.chromium.mojo.bindings.Decoder decoder1 = decoder0.readPointer(16, false);
                result.owner = org.chromium.url.internal.mojom.Origin.decode(decoder1);
                }
                {
                    
                result.name = decoder0.readString(24, false);
                }
                {
                    
                result.priority = decoder0.readDouble(32);
                }
                {
                    
                result.enableBiddingSignalsPrioritization = decoder0.readBoolean(40, 0);
                }
                {
                    
                result.executionMode = decoder0.readInt(44);
                    InterestGroup.ExecutionMode.validate(result.executionMode);
                    result.executionMode = InterestGroup.ExecutionMode.toKnownValue(result.executionMode);
                }
                {
                    
                org.chromium.mojo.bindings.Decoder decoder1 = decoder0.readPointer(48, true);
                if (decoder1 == null) {
                    result.priorityVector = null;
                } else {
                    decoder1.readDataHeaderForMap();
                    String[] keys0;
                    double[] values0;
                    {
                        
                        org.chromium.mojo.bindings.Decoder decoder2 = decoder1.readPointer(org.chromium.mojo.bindings.DataHeader.HEADER_SIZE, false);
                        {
                            org.chromium.mojo.bindings.DataHeader si2 = decoder2.readDataHeaderForPointerArray(org.chromium.mojo.bindings.BindingsHelper.UNSPECIFIED_ARRAY_LENGTH);
                            keys0 = new String[si2.elementsOrVersion];
                            for (int i2 = 0; i2 < si2.elementsOrVersion; ++i2) {
                                
                                keys0[i2] = decoder2.readString(org.chromium.mojo.bindings.DataHeader.HEADER_SIZE + org.chromium.mojo.bindings.BindingsHelper.POINTER_SIZE * i2, false);
                            }
                        }
                    }
                    {
                        
                        values0 = decoder1.readDoubles(org.chromium.mojo.bindings.DataHeader.HEADER_SIZE + org.chromium.mojo.bindings.BindingsHelper.POINTER_SIZE, org.chromium.mojo.bindings.BindingsHelper.NOTHING_NULLABLE, keys0.length);
                    }
                    result.priorityVector = new java.util.HashMap<String, Double>();
                    for (int index0 = 0; index0 < keys0.length; ++index0) {
                        result.priorityVector.put(keys0[index0],  values0[index0]);
                    }
                }
                }
                {
                    
                org.chromium.mojo.bindings.Decoder decoder1 = decoder0.readPointer(56, true);
                if (decoder1 == null) {
                    result.prioritySignalsOverrides = null;
                } else {
                    decoder1.readDataHeaderForMap();
                    String[] keys0;
                    double[] values0;
                    {
                        
                        org.chromium.mojo.bindings.Decoder decoder2 = decoder1.readPointer(org.chromium.mojo.bindings.DataHeader.HEADER_SIZE, false);
                        {
                            org.chromium.mojo.bindings.DataHeader si2 = decoder2.readDataHeaderForPointerArray(org.chromium.mojo.bindings.BindingsHelper.UNSPECIFIED_ARRAY_LENGTH);
                            keys0 = new String[si2.elementsOrVersion];
                            for (int i2 = 0; i2 < si2.elementsOrVersion; ++i2) {
                                
                                keys0[i2] = decoder2.readString(org.chromium.mojo.bindings.DataHeader.HEADER_SIZE + org.chromium.mojo.bindings.BindingsHelper.POINTER_SIZE * i2, false);
                            }
                        }
                    }
                    {
                        
                        values0 = decoder1.readDoubles(org.chromium.mojo.bindings.DataHeader.HEADER_SIZE + org.chromium.mojo.bindings.BindingsHelper.POINTER_SIZE, org.chromium.mojo.bindings.BindingsHelper.NOTHING_NULLABLE, keys0.length);
                    }
                    result.prioritySignalsOverrides = new java.util.HashMap<String, Double>();
                    for (int index0 = 0; index0 < keys0.length; ++index0) {
                        result.prioritySignalsOverrides.put(keys0[index0],  values0[index0]);
                    }
                }
                }
                {
                    
                org.chromium.mojo.bindings.Decoder decoder1 = decoder0.readPointer(64, true);
                if (decoder1 == null) {
                    result.sellerCapabilities = null;
                } else {
                    decoder1.readDataHeaderForMap();
                    org.chromium.url.internal.mojom.Origin[] keys0;
                    SellerCapabilities[] values0;
                    {
                        
                        org.chromium.mojo.bindings.Decoder decoder2 = decoder1.readPointer(org.chromium.mojo.bindings.DataHeader.HEADER_SIZE, false);
                        {
                            org.chromium.mojo.bindings.DataHeader si2 = decoder2.readDataHeaderForPointerArray(org.chromium.mojo.bindings.BindingsHelper.UNSPECIFIED_ARRAY_LENGTH);
                            keys0 = new org.chromium.url.internal.mojom.Origin[si2.elementsOrVersion];
                            for (int i2 = 0; i2 < si2.elementsOrVersion; ++i2) {
                                
                                org.chromium.mojo.bindings.Decoder decoder3 = decoder2.readPointer(org.chromium.mojo.bindings.DataHeader.HEADER_SIZE + org.chromium.mojo.bindings.BindingsHelper.POINTER_SIZE * i2, false);
                                keys0[i2] = org.chromium.url.internal.mojom.Origin.decode(decoder3);
                            }
                        }
                    }
                    {
                        
                        org.chromium.mojo.bindings.Decoder decoder2 = decoder1.readPointer(org.chromium.mojo.bindings.DataHeader.HEADER_SIZE + org.chromium.mojo.bindings.BindingsHelper.POINTER_SIZE, false);
                        {
                            org.chromium.mojo.bindings.DataHeader si2 = decoder2.readDataHeaderForPointerArray(keys0.length);
                            values0 = new SellerCapabilities[si2.elementsOrVersion];
                            for (int i2 = 0; i2 < si2.elementsOrVersion; ++i2) {
                                
                                org.chromium.mojo.bindings.Decoder decoder3 = decoder2.readPointer(org.chromium.mojo.bindings.DataHeader.HEADER_SIZE + org.chromium.mojo.bindings.BindingsHelper.POINTER_SIZE * i2, false);
                                values0[i2] = SellerCapabilities.decode(decoder3);
                            }
                        }
                    }
                    result.sellerCapabilities = new java.util.HashMap<org.chromium.url.internal.mojom.Origin, SellerCapabilities>();
                    for (int index0 = 0; index0 < keys0.length; ++index0) {
                        result.sellerCapabilities.put(keys0[index0],  values0[index0]);
                    }
                }
                }
                {
                    
                org.chromium.mojo.bindings.Decoder decoder1 = decoder0.readPointer(72, false);
                result.allSellersCapabilities = SellerCapabilities.decode(decoder1);
                }
                {
                    
                org.chromium.mojo.bindings.Decoder decoder1 = decoder0.readPointer(80, true);
                result.biddingUrl = org.chromium.url.mojom.Url.decode(decoder1);
                }
                {
                    
                org.chromium.mojo.bindings.Decoder decoder1 = decoder0.readPointer(88, true);
                result.biddingWasmHelperUrl = org.chromium.url.mojom.Url.decode(decoder1);
                }
                {
                    
                org.chromium.mojo.bindings.Decoder decoder1 = decoder0.readPointer(96, true);
                result.updateUrl = org.chromium.url.mojom.Url.decode(decoder1);
                }
                {
                    
                org.chromium.mojo.bindings.Decoder decoder1 = decoder0.readPointer(104, true);
                result.trustedBiddingSignalsUrl = org.chromium.url.mojom.Url.decode(decoder1);
                }
                {
                    
                org.chromium.mojo.bindings.Decoder decoder1 = decoder0.readPointer(112, true);
                if (decoder1 == null) {
                    result.trustedBiddingSignalsKeys = null;
                } else {
                    org.chromium.mojo.bindings.DataHeader si1 = decoder1.readDataHeaderForPointerArray(org.chromium.mojo.bindings.BindingsHelper.UNSPECIFIED_ARRAY_LENGTH);
                    result.trustedBiddingSignalsKeys = new String[si1.elementsOrVersion];
                    for (int i1 = 0; i1 < si1.elementsOrVersion; ++i1) {
                        
                        result.trustedBiddingSignalsKeys[i1] = decoder1.readString(org.chromium.mojo.bindings.DataHeader.HEADER_SIZE + org.chromium.mojo.bindings.BindingsHelper.POINTER_SIZE * i1, false);
                    }
                }
                }
                {
                    
                result.userBiddingSignals = decoder0.readString(120, true);
                }
                {
                    
                org.chromium.mojo.bindings.Decoder decoder1 = decoder0.readPointer(128, true);
                if (decoder1 == null) {
                    result.ads = null;
                } else {
                    org.chromium.mojo.bindings.DataHeader si1 = decoder1.readDataHeaderForPointerArray(org.chromium.mojo.bindings.BindingsHelper.UNSPECIFIED_ARRAY_LENGTH);
                    result.ads = new InterestGroupAd[si1.elementsOrVersion];
                    for (int i1 = 0; i1 < si1.elementsOrVersion; ++i1) {
                        
                        org.chromium.mojo.bindings.Decoder decoder2 = decoder1.readPointer(org.chromium.mojo.bindings.DataHeader.HEADER_SIZE + org.chromium.mojo.bindings.BindingsHelper.POINTER_SIZE * i1, false);
                        result.ads[i1] = InterestGroupAd.decode(decoder2);
                    }
                }
                }
                {
                    
                org.chromium.mojo.bindings.Decoder decoder1 = decoder0.readPointer(136, true);
                if (decoder1 == null) {
                    result.adComponents = null;
                } else {
                    org.chromium.mojo.bindings.DataHeader si1 = decoder1.readDataHeaderForPointerArray(org.chromium.mojo.bindings.BindingsHelper.UNSPECIFIED_ARRAY_LENGTH);
                    result.adComponents = new InterestGroupAd[si1.elementsOrVersion];
                    for (int i1 = 0; i1 < si1.elementsOrVersion; ++i1) {
                        
                        org.chromium.mojo.bindings.Decoder decoder2 = decoder1.readPointer(org.chromium.mojo.bindings.DataHeader.HEADER_SIZE + org.chromium.mojo.bindings.BindingsHelper.POINTER_SIZE * i1, false);
                        result.adComponents[i1] = InterestGroupAd.decode(decoder2);
                    }
                }
                }
                {
                    
                org.chromium.mojo.bindings.Decoder decoder1 = decoder0.readPointer(144, true);
                if (decoder1 == null) {
                    result.adSizes = null;
                } else {
                    decoder1.readDataHeaderForMap();
                    String[] keys0;
                    AdSize[] values0;
                    {
                        
                        org.chromium.mojo.bindings.Decoder decoder2 = decoder1.readPointer(org.chromium.mojo.bindings.DataHeader.HEADER_SIZE, false);
                        {
                            org.chromium.mojo.bindings.DataHeader si2 = decoder2.readDataHeaderForPointerArray(org.chromium.mojo.bindings.BindingsHelper.UNSPECIFIED_ARRAY_LENGTH);
                            keys0 = new String[si2.elementsOrVersion];
                            for (int i2 = 0; i2 < si2.elementsOrVersion; ++i2) {
                                
                                keys0[i2] = decoder2.readString(org.chromium.mojo.bindings.DataHeader.HEADER_SIZE + org.chromium.mojo.bindings.BindingsHelper.POINTER_SIZE * i2, false);
                            }
                        }
                    }
                    {
                        
                        org.chromium.mojo.bindings.Decoder decoder2 = decoder1.readPointer(org.chromium.mojo.bindings.DataHeader.HEADER_SIZE + org.chromium.mojo.bindings.BindingsHelper.POINTER_SIZE, false);
                        {
                            org.chromium.mojo.bindings.DataHeader si2 = decoder2.readDataHeaderForPointerArray(keys0.length);
                            values0 = new AdSize[si2.elementsOrVersion];
                            for (int i2 = 0; i2 < si2.elementsOrVersion; ++i2) {
                                
                                org.chromium.mojo.bindings.Decoder decoder3 = decoder2.readPointer(org.chromium.mojo.bindings.DataHeader.HEADER_SIZE + org.chromium.mojo.bindings.BindingsHelper.POINTER_SIZE * i2, false);
                                values0[i2] = AdSize.decode(decoder3);
                            }
                        }
                    }
                    result.adSizes = new java.util.HashMap<String, AdSize>();
                    for (int index0 = 0; index0 < keys0.length; ++index0) {
                        result.adSizes.put(keys0[index0],  values0[index0]);
                    }
                }
                }
                {
                    
                org.chromium.mojo.bindings.Decoder decoder1 = decoder0.readPointer(152, true);
                if (decoder1 == null) {
                    result.sizeGroups = null;
                } else {
                    decoder1.readDataHeaderForMap();
                    String[] keys0;
                    String[][] values0;
                    {
                        
                        org.chromium.mojo.bindings.Decoder decoder2 = decoder1.readPointer(org.chromium.mojo.bindings.DataHeader.HEADER_SIZE, false);
                        {
                            org.chromium.mojo.bindings.DataHeader si2 = decoder2.readDataHeaderForPointerArray(org.chromium.mojo.bindings.BindingsHelper.UNSPECIFIED_ARRAY_LENGTH);
                            keys0 = new String[si2.elementsOrVersion];
                            for (int i2 = 0; i2 < si2.elementsOrVersion; ++i2) {
                                
                                keys0[i2] = decoder2.readString(org.chromium.mojo.bindings.DataHeader.HEADER_SIZE + org.chromium.mojo.bindings.BindingsHelper.POINTER_SIZE * i2, false);
                            }
                        }
                    }
                    {
                        
                        org.chromium.mojo.bindings.Decoder decoder2 = decoder1.readPointer(org.chromium.mojo.bindings.DataHeader.HEADER_SIZE + org.chromium.mojo.bindings.BindingsHelper.POINTER_SIZE, false);
                        {
                            org.chromium.mojo.bindings.DataHeader si2 = decoder2.readDataHeaderForPointerArray(keys0.length);
                            values0 = new String[si2.elementsOrVersion][];
                            for (int i2 = 0; i2 < si2.elementsOrVersion; ++i2) {
                                
                                org.chromium.mojo.bindings.Decoder decoder3 = decoder2.readPointer(org.chromium.mojo.bindings.DataHeader.HEADER_SIZE + org.chromium.mojo.bindings.BindingsHelper.POINTER_SIZE * i2, false);
                                {
                                    org.chromium.mojo.bindings.DataHeader si3 = decoder3.readDataHeaderForPointerArray(org.chromium.mojo.bindings.BindingsHelper.UNSPECIFIED_ARRAY_LENGTH);
                                    values0[i2] = new String[si3.elementsOrVersion];
                                    for (int i3 = 0; i3 < si3.elementsOrVersion; ++i3) {
                                        
                                        values0[i2][i3] = decoder3.readString(org.chromium.mojo.bindings.DataHeader.HEADER_SIZE + org.chromium.mojo.bindings.BindingsHelper.POINTER_SIZE * i3, false);
                                    }
                                }
                            }
                        }
                    }
                    result.sizeGroups = new java.util.HashMap<String, String[]>();
                    for (int index0 = 0; index0 < keys0.length; ++index0) {
                        result.sizeGroups.put(keys0[index0],  values0[index0]);
                    }
                }
                }
                {
                    
                org.chromium.mojo.bindings.Decoder decoder1 = decoder0.readPointer(160, false);
                result.auctionServerRequestFlags = AuctionServerRequestFlags.decode(decoder1);
                }
                {
                    
                result.additionalBidKey = decoder0.readBytes(168, org.chromium.mojo.bindings.BindingsHelper.ARRAY_NULLABLE, 32);
                }
                {
                    
                org.chromium.mojo.bindings.Decoder decoder1 = decoder0.readPointer(176, true);
                result.aggregationCoordinatorOrigin = org.chromium.url.internal.mojom.Origin.decode(decoder1);
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
        
        encoder0.encode(this.expiry, 8, false);
        
        encoder0.encode(this.owner, 16, false);
        
        encoder0.encode(this.name, 24, false);
        
        encoder0.encode(this.priority, 32);
        
        encoder0.encode(this.enableBiddingSignalsPrioritization, 40, 0);
        
        encoder0.encode(this.executionMode, 44);
        
        if (this.priorityVector == null) {
            encoder0.encodeNullPointer(48, true);
        } else {
            org.chromium.mojo.bindings.Encoder encoder1 = encoder0.encoderForMap(48);
            int size0 = this.priorityVector.size();
            String[] keys0 = new String[size0];
            double[] values0 = new double[size0];
            int index0 = 0;
            for (java.util.Map.Entry<String, Double> entry0 : this.priorityVector.entrySet()) {
                keys0[index0] = entry0.getKey();
                values0[index0] = entry0.getValue();
                ++index0;
            }
            
            {
                org.chromium.mojo.bindings.Encoder encoder2 = encoder1.encodePointerArray(keys0.length, org.chromium.mojo.bindings.DataHeader.HEADER_SIZE, org.chromium.mojo.bindings.BindingsHelper.UNSPECIFIED_ARRAY_LENGTH);
                for (int i1 = 0; i1 < keys0.length; ++i1) {
                    
                    encoder2.encode(keys0[i1], org.chromium.mojo.bindings.DataHeader.HEADER_SIZE + org.chromium.mojo.bindings.BindingsHelper.POINTER_SIZE * i1, false);
                }
            }
            
            encoder1.encode(values0, org.chromium.mojo.bindings.DataHeader.HEADER_SIZE + org.chromium.mojo.bindings.BindingsHelper.POINTER_SIZE, org.chromium.mojo.bindings.BindingsHelper.NOTHING_NULLABLE, org.chromium.mojo.bindings.BindingsHelper.UNSPECIFIED_ARRAY_LENGTH);
        }
        
        if (this.prioritySignalsOverrides == null) {
            encoder0.encodeNullPointer(56, true);
        } else {
            org.chromium.mojo.bindings.Encoder encoder1 = encoder0.encoderForMap(56);
            int size0 = this.prioritySignalsOverrides.size();
            String[] keys0 = new String[size0];
            double[] values0 = new double[size0];
            int index0 = 0;
            for (java.util.Map.Entry<String, Double> entry0 : this.prioritySignalsOverrides.entrySet()) {
                keys0[index0] = entry0.getKey();
                values0[index0] = entry0.getValue();
                ++index0;
            }
            
            {
                org.chromium.mojo.bindings.Encoder encoder2 = encoder1.encodePointerArray(keys0.length, org.chromium.mojo.bindings.DataHeader.HEADER_SIZE, org.chromium.mojo.bindings.BindingsHelper.UNSPECIFIED_ARRAY_LENGTH);
                for (int i1 = 0; i1 < keys0.length; ++i1) {
                    
                    encoder2.encode(keys0[i1], org.chromium.mojo.bindings.DataHeader.HEADER_SIZE + org.chromium.mojo.bindings.BindingsHelper.POINTER_SIZE * i1, false);
                }
            }
            
            encoder1.encode(values0, org.chromium.mojo.bindings.DataHeader.HEADER_SIZE + org.chromium.mojo.bindings.BindingsHelper.POINTER_SIZE, org.chromium.mojo.bindings.BindingsHelper.NOTHING_NULLABLE, org.chromium.mojo.bindings.BindingsHelper.UNSPECIFIED_ARRAY_LENGTH);
        }
        
        if (this.sellerCapabilities == null) {
            encoder0.encodeNullPointer(64, true);
        } else {
            org.chromium.mojo.bindings.Encoder encoder1 = encoder0.encoderForMap(64);
            int size0 = this.sellerCapabilities.size();
            org.chromium.url.internal.mojom.Origin[] keys0 = new org.chromium.url.internal.mojom.Origin[size0];
            SellerCapabilities[] values0 = new SellerCapabilities[size0];
            int index0 = 0;
            for (java.util.Map.Entry<org.chromium.url.internal.mojom.Origin, SellerCapabilities> entry0 : this.sellerCapabilities.entrySet()) {
                keys0[index0] = entry0.getKey();
                values0[index0] = entry0.getValue();
                ++index0;
            }
            
            {
                org.chromium.mojo.bindings.Encoder encoder2 = encoder1.encodePointerArray(keys0.length, org.chromium.mojo.bindings.DataHeader.HEADER_SIZE, org.chromium.mojo.bindings.BindingsHelper.UNSPECIFIED_ARRAY_LENGTH);
                for (int i1 = 0; i1 < keys0.length; ++i1) {
                    
                    encoder2.encode(keys0[i1], org.chromium.mojo.bindings.DataHeader.HEADER_SIZE + org.chromium.mojo.bindings.BindingsHelper.POINTER_SIZE * i1, false);
                }
            }
            
            {
                org.chromium.mojo.bindings.Encoder encoder2 = encoder1.encodePointerArray(values0.length, org.chromium.mojo.bindings.DataHeader.HEADER_SIZE + org.chromium.mojo.bindings.BindingsHelper.POINTER_SIZE, org.chromium.mojo.bindings.BindingsHelper.UNSPECIFIED_ARRAY_LENGTH);
                for (int i1 = 0; i1 < values0.length; ++i1) {
                    
                    encoder2.encode(values0[i1], org.chromium.mojo.bindings.DataHeader.HEADER_SIZE + org.chromium.mojo.bindings.BindingsHelper.POINTER_SIZE * i1, false);
                }
            }
        }
        
        encoder0.encode(this.allSellersCapabilities, 72, false);
        
        encoder0.encode(this.biddingUrl, 80, true);
        
        encoder0.encode(this.biddingWasmHelperUrl, 88, true);
        
        encoder0.encode(this.updateUrl, 96, true);
        
        encoder0.encode(this.trustedBiddingSignalsUrl, 104, true);
        
        if (this.trustedBiddingSignalsKeys == null) {
            encoder0.encodeNullPointer(112, true);
        } else {
            org.chromium.mojo.bindings.Encoder encoder1 = encoder0.encodePointerArray(this.trustedBiddingSignalsKeys.length, 112, org.chromium.mojo.bindings.BindingsHelper.UNSPECIFIED_ARRAY_LENGTH);
            for (int i0 = 0; i0 < this.trustedBiddingSignalsKeys.length; ++i0) {
                
                encoder1.encode(this.trustedBiddingSignalsKeys[i0], org.chromium.mojo.bindings.DataHeader.HEADER_SIZE + org.chromium.mojo.bindings.BindingsHelper.POINTER_SIZE * i0, false);
            }
        }
        
        encoder0.encode(this.userBiddingSignals, 120, true);
        
        if (this.ads == null) {
            encoder0.encodeNullPointer(128, true);
        } else {
            org.chromium.mojo.bindings.Encoder encoder1 = encoder0.encodePointerArray(this.ads.length, 128, org.chromium.mojo.bindings.BindingsHelper.UNSPECIFIED_ARRAY_LENGTH);
            for (int i0 = 0; i0 < this.ads.length; ++i0) {
                
                encoder1.encode(this.ads[i0], org.chromium.mojo.bindings.DataHeader.HEADER_SIZE + org.chromium.mojo.bindings.BindingsHelper.POINTER_SIZE * i0, false);
            }
        }
        
        if (this.adComponents == null) {
            encoder0.encodeNullPointer(136, true);
        } else {
            org.chromium.mojo.bindings.Encoder encoder1 = encoder0.encodePointerArray(this.adComponents.length, 136, org.chromium.mojo.bindings.BindingsHelper.UNSPECIFIED_ARRAY_LENGTH);
            for (int i0 = 0; i0 < this.adComponents.length; ++i0) {
                
                encoder1.encode(this.adComponents[i0], org.chromium.mojo.bindings.DataHeader.HEADER_SIZE + org.chromium.mojo.bindings.BindingsHelper.POINTER_SIZE * i0, false);
            }
        }
        
        if (this.adSizes == null) {
            encoder0.encodeNullPointer(144, true);
        } else {
            org.chromium.mojo.bindings.Encoder encoder1 = encoder0.encoderForMap(144);
            int size0 = this.adSizes.size();
            String[] keys0 = new String[size0];
            AdSize[] values0 = new AdSize[size0];
            int index0 = 0;
            for (java.util.Map.Entry<String, AdSize> entry0 : this.adSizes.entrySet()) {
                keys0[index0] = entry0.getKey();
                values0[index0] = entry0.getValue();
                ++index0;
            }
            
            {
                org.chromium.mojo.bindings.Encoder encoder2 = encoder1.encodePointerArray(keys0.length, org.chromium.mojo.bindings.DataHeader.HEADER_SIZE, org.chromium.mojo.bindings.BindingsHelper.UNSPECIFIED_ARRAY_LENGTH);
                for (int i1 = 0; i1 < keys0.length; ++i1) {
                    
                    encoder2.encode(keys0[i1], org.chromium.mojo.bindings.DataHeader.HEADER_SIZE + org.chromium.mojo.bindings.BindingsHelper.POINTER_SIZE * i1, false);
                }
            }
            
            {
                org.chromium.mojo.bindings.Encoder encoder2 = encoder1.encodePointerArray(values0.length, org.chromium.mojo.bindings.DataHeader.HEADER_SIZE + org.chromium.mojo.bindings.BindingsHelper.POINTER_SIZE, org.chromium.mojo.bindings.BindingsHelper.UNSPECIFIED_ARRAY_LENGTH);
                for (int i1 = 0; i1 < values0.length; ++i1) {
                    
                    encoder2.encode(values0[i1], org.chromium.mojo.bindings.DataHeader.HEADER_SIZE + org.chromium.mojo.bindings.BindingsHelper.POINTER_SIZE * i1, false);
                }
            }
        }
        
        if (this.sizeGroups == null) {
            encoder0.encodeNullPointer(152, true);
        } else {
            org.chromium.mojo.bindings.Encoder encoder1 = encoder0.encoderForMap(152);
            int size0 = this.sizeGroups.size();
            String[] keys0 = new String[size0];
            String[][] values0 = new String[size0][];
            int index0 = 0;
            for (java.util.Map.Entry<String, String[]> entry0 : this.sizeGroups.entrySet()) {
                keys0[index0] = entry0.getKey();
                values0[index0] = entry0.getValue();
                ++index0;
            }
            
            {
                org.chromium.mojo.bindings.Encoder encoder2 = encoder1.encodePointerArray(keys0.length, org.chromium.mojo.bindings.DataHeader.HEADER_SIZE, org.chromium.mojo.bindings.BindingsHelper.UNSPECIFIED_ARRAY_LENGTH);
                for (int i1 = 0; i1 < keys0.length; ++i1) {
                    
                    encoder2.encode(keys0[i1], org.chromium.mojo.bindings.DataHeader.HEADER_SIZE + org.chromium.mojo.bindings.BindingsHelper.POINTER_SIZE * i1, false);
                }
            }
            
            {
                org.chromium.mojo.bindings.Encoder encoder2 = encoder1.encodePointerArray(values0.length, org.chromium.mojo.bindings.DataHeader.HEADER_SIZE + org.chromium.mojo.bindings.BindingsHelper.POINTER_SIZE, org.chromium.mojo.bindings.BindingsHelper.UNSPECIFIED_ARRAY_LENGTH);
                for (int i1 = 0; i1 < values0.length; ++i1) {
                    
                    if (values0[i1] == null) {
                        encoder2.encodeNullPointer(org.chromium.mojo.bindings.DataHeader.HEADER_SIZE + org.chromium.mojo.bindings.BindingsHelper.POINTER_SIZE * i1, false);
                    } else {
                        org.chromium.mojo.bindings.Encoder encoder3 = encoder2.encodePointerArray(values0[i1].length, org.chromium.mojo.bindings.DataHeader.HEADER_SIZE + org.chromium.mojo.bindings.BindingsHelper.POINTER_SIZE * i1, org.chromium.mojo.bindings.BindingsHelper.UNSPECIFIED_ARRAY_LENGTH);
                        for (int i2 = 0; i2 < values0[i1].length; ++i2) {
                            
                            encoder3.encode(values0[i1][i2], org.chromium.mojo.bindings.DataHeader.HEADER_SIZE + org.chromium.mojo.bindings.BindingsHelper.POINTER_SIZE * i2, false);
                        }
                    }
                }
            }
        }
        
        encoder0.encode(this.auctionServerRequestFlags, 160, false);
        
        encoder0.encode(this.additionalBidKey, 168, org.chromium.mojo.bindings.BindingsHelper.ARRAY_NULLABLE, 32);
        
        encoder0.encode(this.aggregationCoordinatorOrigin, 176, true);
    }
}