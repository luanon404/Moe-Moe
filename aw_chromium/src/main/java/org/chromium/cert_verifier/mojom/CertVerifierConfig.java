// CertVerifierConfig.java is auto generated by mojom_bindings_generator.py, do not edit


// Copyright 2014 The Chromium Authors
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

// This file is autogenerated by:
//     mojo/public/tools/bindings/mojom_bindings_generator.py
// For:
//     services/network/public/mojom/cert_verifier_service.mojom
//

package org.chromium.cert_verifier.mojom;

public final class CertVerifierConfig extends org.chromium.mojo.bindings.Struct {

    private static final int STRUCT_SIZE = 32;
    private static final org.chromium.mojo.bindings.DataHeader[] VERSION_ARRAY = new org.chromium.mojo.bindings.DataHeader[]{new org.chromium.mojo.bindings.DataHeader(32, 0)};
    private static final org.chromium.mojo.bindings.DataHeader DEFAULT_STRUCT_INFO = VERSION_ARRAY[0];
    public boolean enableRevChecking;
    public boolean requireRevCheckingLocalAnchors;
    public boolean enableSha1LocalAnchors;
    public boolean disableSymantecEnforcement;
    public org.chromium.network.mojom.X509Certificate[] additionalTrustAnchors;
    public org.chromium.network.mojom.X509Certificate[] additionalUntrustedAuthorities;

    private CertVerifierConfig(int version) {
        super(STRUCT_SIZE, version);
    }

    public CertVerifierConfig() {
        this(0);
    }

    public static CertVerifierConfig deserialize(org.chromium.mojo.bindings.Message message) {
        return decode(new org.chromium.mojo.bindings.Decoder(message));
    }

    /**
     * Similar to the method above, but deserializes from a |ByteBuffer| instance.
     *
     * @throws org.chromium.mojo.bindings.DeserializationException on deserialization failure.
     */
    public static CertVerifierConfig deserialize(java.nio.ByteBuffer data) {
        return deserialize(new org.chromium.mojo.bindings.Message(data, new java.util.ArrayList<org.chromium.mojo.system.Handle>()));
    }

    @SuppressWarnings("unchecked")
    public static CertVerifierConfig decode(org.chromium.mojo.bindings.Decoder decoder0) {
        if (decoder0 == null) {
            return null;
        }
        decoder0.increaseStackDepth();
        CertVerifierConfig result;
        try {
            org.chromium.mojo.bindings.DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
            final int elementsOrVersion = mainDataHeader.elementsOrVersion;
            result = new CertVerifierConfig(elementsOrVersion);
            {

                result.enableRevChecking = decoder0.readBoolean(8, 0);
            }
            {

                result.requireRevCheckingLocalAnchors = decoder0.readBoolean(8, 1);
            }
            {

                result.enableSha1LocalAnchors = decoder0.readBoolean(8, 2);
            }
            {

                result.disableSymantecEnforcement = decoder0.readBoolean(8, 3);
            }
            {

                org.chromium.mojo.bindings.Decoder decoder1 = decoder0.readPointer(16, false);
                {
                    org.chromium.mojo.bindings.DataHeader si1 = decoder1.readDataHeaderForPointerArray(org.chromium.mojo.bindings.BindingsHelper.UNSPECIFIED_ARRAY_LENGTH);
                    result.additionalTrustAnchors = new org.chromium.network.mojom.X509Certificate[si1.elementsOrVersion];
                    for (int i1 = 0; i1 < si1.elementsOrVersion; ++i1) {

                        org.chromium.mojo.bindings.Decoder decoder2 = decoder1.readPointer(org.chromium.mojo.bindings.DataHeader.HEADER_SIZE + org.chromium.mojo.bindings.BindingsHelper.POINTER_SIZE * i1, false);
                        result.additionalTrustAnchors[i1] = org.chromium.network.mojom.X509Certificate.decode(decoder2);
                    }
                }
            }
            {

                org.chromium.mojo.bindings.Decoder decoder1 = decoder0.readPointer(24, false);
                {
                    org.chromium.mojo.bindings.DataHeader si1 = decoder1.readDataHeaderForPointerArray(org.chromium.mojo.bindings.BindingsHelper.UNSPECIFIED_ARRAY_LENGTH);
                    result.additionalUntrustedAuthorities = new org.chromium.network.mojom.X509Certificate[si1.elementsOrVersion];
                    for (int i1 = 0; i1 < si1.elementsOrVersion; ++i1) {

                        org.chromium.mojo.bindings.Decoder decoder2 = decoder1.readPointer(org.chromium.mojo.bindings.DataHeader.HEADER_SIZE + org.chromium.mojo.bindings.BindingsHelper.POINTER_SIZE * i1, false);
                        result.additionalUntrustedAuthorities[i1] = org.chromium.network.mojom.X509Certificate.decode(decoder2);
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

        encoder0.encode(this.enableRevChecking, 8, 0);

        encoder0.encode(this.requireRevCheckingLocalAnchors, 8, 1);

        encoder0.encode(this.enableSha1LocalAnchors, 8, 2);

        encoder0.encode(this.disableSymantecEnforcement, 8, 3);

        if (this.additionalTrustAnchors == null) {
            encoder0.encodeNullPointer(16, false);
        } else {
            org.chromium.mojo.bindings.Encoder encoder1 = encoder0.encodePointerArray(this.additionalTrustAnchors.length, 16, org.chromium.mojo.bindings.BindingsHelper.UNSPECIFIED_ARRAY_LENGTH);
            for (int i0 = 0; i0 < this.additionalTrustAnchors.length; ++i0) {

                encoder1.encode(this.additionalTrustAnchors[i0], org.chromium.mojo.bindings.DataHeader.HEADER_SIZE + org.chromium.mojo.bindings.BindingsHelper.POINTER_SIZE * i0, false);
            }
        }

        if (this.additionalUntrustedAuthorities == null) {
            encoder0.encodeNullPointer(24, false);
        } else {
            org.chromium.mojo.bindings.Encoder encoder1 = encoder0.encodePointerArray(this.additionalUntrustedAuthorities.length, 24, org.chromium.mojo.bindings.BindingsHelper.UNSPECIFIED_ARRAY_LENGTH);
            for (int i0 = 0; i0 < this.additionalUntrustedAuthorities.length; ++i0) {

                encoder1.encode(this.additionalUntrustedAuthorities[i0], org.chromium.mojo.bindings.DataHeader.HEADER_SIZE + org.chromium.mojo.bindings.BindingsHelper.POINTER_SIZE * i0, false);
            }
        }
    }
}