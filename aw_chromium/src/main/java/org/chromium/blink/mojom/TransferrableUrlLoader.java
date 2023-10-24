// TransferrableUrlLoader.java is auto generated by mojom_bindings_generator.py, do not edit


// Copyright 2014 The Chromium Authors
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

// This file is autogenerated by:
//     mojo/public/tools/bindings/mojom_bindings_generator.py
// For:
//     third_party/blink/public/mojom/loader/transferrable_url_loader.mojom
//

package org.chromium.blink.mojom;


public final class TransferrableUrlLoader extends org.chromium.mojo.bindings.Struct {

    private static final int STRUCT_SIZE = 40;
    private static final org.chromium.mojo.bindings.DataHeader[] VERSION_ARRAY = new org.chromium.mojo.bindings.DataHeader[] {new org.chromium.mojo.bindings.DataHeader(40, 0)};
    private static final org.chromium.mojo.bindings.DataHeader DEFAULT_STRUCT_INFO = VERSION_ARRAY[0];
    public org.chromium.url.mojom.Url url;
    public org.chromium.network.mojom.UrlLoader urlLoader;
    public org.chromium.mojo.bindings.InterfaceRequest<org.chromium.network.mojom.UrlLoaderClient> urlLoaderClient;
    public org.chromium.network.mojom.UrlResponseHead head;
    public org.chromium.mojo.system.DataPipe.ConsumerHandle body;

    private TransferrableUrlLoader(int version) {
        super(STRUCT_SIZE, version);
        this.body = org.chromium.mojo.system.InvalidHandle.INSTANCE;
    }

    public TransferrableUrlLoader() {
        this(0);
    }

    public static TransferrableUrlLoader deserialize(org.chromium.mojo.bindings.Message message) {
        return decode(new org.chromium.mojo.bindings.Decoder(message));
    }

    /**
     * Similar to the method above, but deserializes from a |ByteBuffer| instance.
     *
     * @throws org.chromium.mojo.bindings.DeserializationException on deserialization failure.
     */
    public static TransferrableUrlLoader deserialize(java.nio.ByteBuffer data) {
        return deserialize(new org.chromium.mojo.bindings.Message(
                data, new java.util.ArrayList<org.chromium.mojo.system.Handle>()));
    }

    @SuppressWarnings("unchecked")
    public static TransferrableUrlLoader decode(org.chromium.mojo.bindings.Decoder decoder0) {
        if (decoder0 == null) {
            return null;
        }
        decoder0.increaseStackDepth();
        TransferrableUrlLoader result;
        try {
            org.chromium.mojo.bindings.DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
            final int elementsOrVersion = mainDataHeader.elementsOrVersion;
            result = new TransferrableUrlLoader(elementsOrVersion);
                {
                    
                org.chromium.mojo.bindings.Decoder decoder1 = decoder0.readPointer(8, false);
                result.url = org.chromium.url.mojom.Url.decode(decoder1);
                }
                {
                    
                result.urlLoader = decoder0.readServiceInterface(16, false, org.chromium.network.mojom.UrlLoader.MANAGER);
                }
                {
                    
                result.urlLoaderClient = decoder0.readInterfaceRequest(24, false);
                }
                {
                    
                result.body = decoder0.readConsumerHandle(28, true);
                }
                {
                    
                org.chromium.mojo.bindings.Decoder decoder1 = decoder0.readPointer(32, false);
                result.head = org.chromium.network.mojom.UrlResponseHead.decode(decoder1);
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
        
        encoder0.encode(this.url, 8, false);
        
        encoder0.encode(this.urlLoader, 16, false, org.chromium.network.mojom.UrlLoader.MANAGER);
        
        encoder0.encode(this.urlLoaderClient, 24, false);
        
        encoder0.encode(this.body, 28, true);
        
        encoder0.encode(this.head, 32, false);
    }
}