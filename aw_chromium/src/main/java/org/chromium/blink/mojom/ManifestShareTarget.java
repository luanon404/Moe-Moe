// ManifestShareTarget.java is auto generated by mojom_bindings_generator.py, do not edit


// Copyright 2014 The Chromium Authors
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

// This file is autogenerated by:
//     mojo/public/tools/bindings/mojom_bindings_generator.py
// For:
//     third_party/blink/public/mojom/manifest/manifest.mojom
//

package org.chromium.blink.mojom;

import androidx.annotation.IntDef;


public final class ManifestShareTarget extends org.chromium.mojo.bindings.Struct {

    private static final int STRUCT_SIZE = 32;
    private static final org.chromium.mojo.bindings.DataHeader[] VERSION_ARRAY = new org.chromium.mojo.bindings.DataHeader[] {new org.chromium.mojo.bindings.DataHeader(32, 0)};
    private static final org.chromium.mojo.bindings.DataHeader DEFAULT_STRUCT_INFO = VERSION_ARRAY[0];

    public static final class Method {
        private static final boolean IS_EXTENSIBLE = false;
        @IntDef({

            Method.GET,
            Method.POST})
        public @interface EnumType {}

        public static final int GET = 0;
        public static final int POST = 1;
        public static final int MIN_VALUE = 0;
        public static final int MAX_VALUE = 1;

        public static boolean isKnownValue(int value) {
            return value >= 0 && value <= 1;
        }

        public static void validate(int value) {
            if (IS_EXTENSIBLE || isKnownValue(value)) return;
            throw new org.chromium.mojo.bindings.DeserializationException("Invalid enum value.");
        }

        public static int toKnownValue(int value) {
          return value;
        }

        private Method() {}
    }

    public static final class Enctype {
        private static final boolean IS_EXTENSIBLE = false;
        @IntDef({

            Enctype.FORM_URL_ENCODED,
            Enctype.MULTIPART_FORM_DATA})
        public @interface EnumType {}

        public static final int FORM_URL_ENCODED = 0;
        public static final int MULTIPART_FORM_DATA = 1;
        public static final int MIN_VALUE = 0;
        public static final int MAX_VALUE = 1;

        public static boolean isKnownValue(int value) {
            return value >= 0 && value <= 1;
        }

        public static void validate(int value) {
            if (IS_EXTENSIBLE || isKnownValue(value)) return;
            throw new org.chromium.mojo.bindings.DeserializationException("Invalid enum value.");
        }

        public static int toKnownValue(int value) {
          return value;
        }

        private Enctype() {}
    }
    public org.chromium.url.mojom.Url action;
    public int method;
    public int enctype;
    public ManifestShareTargetParams params;

    private ManifestShareTarget(int version) {
        super(STRUCT_SIZE, version);
    }

    public ManifestShareTarget() {
        this(0);
    }

    public static ManifestShareTarget deserialize(org.chromium.mojo.bindings.Message message) {
        return decode(new org.chromium.mojo.bindings.Decoder(message));
    }

    /**
     * Similar to the method above, but deserializes from a |ByteBuffer| instance.
     *
     * @throws org.chromium.mojo.bindings.DeserializationException on deserialization failure.
     */
    public static ManifestShareTarget deserialize(java.nio.ByteBuffer data) {
        return deserialize(new org.chromium.mojo.bindings.Message(
                data, new java.util.ArrayList<org.chromium.mojo.system.Handle>()));
    }

    @SuppressWarnings("unchecked")
    public static ManifestShareTarget decode(org.chromium.mojo.bindings.Decoder decoder0) {
        if (decoder0 == null) {
            return null;
        }
        decoder0.increaseStackDepth();
        ManifestShareTarget result;
        try {
            org.chromium.mojo.bindings.DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
            final int elementsOrVersion = mainDataHeader.elementsOrVersion;
            result = new ManifestShareTarget(elementsOrVersion);
                {
                    
                org.chromium.mojo.bindings.Decoder decoder1 = decoder0.readPointer(8, false);
                result.action = org.chromium.url.mojom.Url.decode(decoder1);
                }
                {
                    
                result.method = decoder0.readInt(16);
                    ManifestShareTarget.Method.validate(result.method);
                    result.method = ManifestShareTarget.Method.toKnownValue(result.method);
                }
                {
                    
                result.enctype = decoder0.readInt(20);
                    ManifestShareTarget.Enctype.validate(result.enctype);
                    result.enctype = ManifestShareTarget.Enctype.toKnownValue(result.enctype);
                }
                {
                    
                org.chromium.mojo.bindings.Decoder decoder1 = decoder0.readPointer(24, false);
                result.params = ManifestShareTargetParams.decode(decoder1);
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
        
        encoder0.encode(this.action, 8, false);
        
        encoder0.encode(this.method, 16);
        
        encoder0.encode(this.enctype, 20);
        
        encoder0.encode(this.params, 24, false);
    }
}