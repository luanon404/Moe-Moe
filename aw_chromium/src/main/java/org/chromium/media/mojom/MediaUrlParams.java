// MediaUrlParams.java is auto generated by mojom_bindings_generator.py, do not edit


// Copyright 2014 The Chromium Authors
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

// This file is autogenerated by:
//     mojo/public/tools/bindings/mojom_bindings_generator.py
// For:
//     media/mojo/mojom/renderer.mojom
//

package org.chromium.media.mojom;

public final class MediaUrlParams extends org.chromium.mojo.bindings.Struct {

    private static final int STRUCT_SIZE = 40;
    private static final org.chromium.mojo.bindings.DataHeader[] VERSION_ARRAY = new org.chromium.mojo.bindings.DataHeader[]{new org.chromium.mojo.bindings.DataHeader(40, 0)};
    private static final org.chromium.mojo.bindings.DataHeader DEFAULT_STRUCT_INFO = VERSION_ARRAY[0];
    public org.chromium.url.mojom.Url mediaUrl;
    public org.chromium.network.mojom.SiteForCookies siteForCookies;
    public org.chromium.url.internal.mojom.Origin topFrameOrigin;
    public boolean hasStorageAccess;
    public boolean allowCredentials;
    public boolean isHls;

    private MediaUrlParams(int version) {
        super(STRUCT_SIZE, version);
    }

    public MediaUrlParams() {
        this(0);
    }

    public static MediaUrlParams deserialize(org.chromium.mojo.bindings.Message message) {
        return decode(new org.chromium.mojo.bindings.Decoder(message));
    }

    /**
     * Similar to the method above, but deserializes from a |ByteBuffer| instance.
     *
     * @throws org.chromium.mojo.bindings.DeserializationException on deserialization failure.
     */
    public static MediaUrlParams deserialize(java.nio.ByteBuffer data) {
        return deserialize(new org.chromium.mojo.bindings.Message(data, new java.util.ArrayList<org.chromium.mojo.system.Handle>()));
    }

    @SuppressWarnings("unchecked")
    public static MediaUrlParams decode(org.chromium.mojo.bindings.Decoder decoder0) {
        if (decoder0 == null) {
            return null;
        }
        decoder0.increaseStackDepth();
        MediaUrlParams result;
        try {
            org.chromium.mojo.bindings.DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
            final int elementsOrVersion = mainDataHeader.elementsOrVersion;
            result = new MediaUrlParams(elementsOrVersion);
            {

                org.chromium.mojo.bindings.Decoder decoder1 = decoder0.readPointer(8, false);
                result.mediaUrl = org.chromium.url.mojom.Url.decode(decoder1);
            }
            {

                org.chromium.mojo.bindings.Decoder decoder1 = decoder0.readPointer(16, false);
                result.siteForCookies = org.chromium.network.mojom.SiteForCookies.decode(decoder1);
            }
            {

                org.chromium.mojo.bindings.Decoder decoder1 = decoder0.readPointer(24, false);
                result.topFrameOrigin = org.chromium.url.internal.mojom.Origin.decode(decoder1);
            }
            {

                result.hasStorageAccess = decoder0.readBoolean(32, 0);
            }
            {

                result.allowCredentials = decoder0.readBoolean(32, 1);
            }
            {

                result.isHls = decoder0.readBoolean(32, 2);
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

        encoder0.encode(this.mediaUrl, 8, false);

        encoder0.encode(this.siteForCookies, 16, false);

        encoder0.encode(this.topFrameOrigin, 24, false);

        encoder0.encode(this.hasStorageAccess, 32, 0);

        encoder0.encode(this.allowCredentials, 32, 1);

        encoder0.encode(this.isHls, 32, 2);
    }
}