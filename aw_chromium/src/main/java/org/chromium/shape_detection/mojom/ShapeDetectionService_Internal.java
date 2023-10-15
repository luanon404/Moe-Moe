// ShapeDetectionService_Internal.java is auto generated by mojom_bindings_generator.py, do not edit


// Copyright 2014 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

// This file is autogenerated by:
//     mojo/public/tools/bindings/mojom_bindings_generator.py
// For:
//     services/shape_detection/public/mojom/shape_detection_service.mojom
//

package org.chromium.shape_detection.mojom;

import org.chromium.mojo.bindings.InterfaceControlMessagesHelper;
import org.chromium.mojo.bindings.interfacecontrol.InterfaceControlMessagesConstants;


class ShapeDetectionService_Internal {

    public static final org.chromium.mojo.bindings.Interface.Manager<ShapeDetectionService, ShapeDetectionService.Proxy> MANAGER =
            new org.chromium.mojo.bindings.Interface.Manager<ShapeDetectionService, ShapeDetectionService.Proxy>() {

        @Override
        public String getName() {
            return "shape_detection.mojom.ShapeDetectionService";
        }

        @Override
        public int getVersion() {
          return 0;
        }

        @Override
        public Proxy buildProxy(org.chromium.mojo.system.Core core,
                                org.chromium.mojo.bindings.MessageReceiverWithResponder messageReceiver) {
            return new Proxy(core, messageReceiver);
        }

        @Override
        public Stub buildStub(org.chromium.mojo.system.Core core, ShapeDetectionService impl) {
            return new Stub(core, impl);
        }

        @Override
        public ShapeDetectionService[] buildArray(int size) {
          return new ShapeDetectionService[size];
        }
    };


    private static final int BIND_BARCODE_DETECTION_PROVIDER_ORDINAL = 0;

    private static final int BIND_FACE_DETECTION_PROVIDER_ORDINAL = 1;

    private static final int BIND_TEXT_DETECTION_ORDINAL = 2;


    static final class Proxy extends org.chromium.mojo.bindings.Interface.AbstractProxy implements ShapeDetectionService.Proxy {

        Proxy(org.chromium.mojo.system.Core core,
              org.chromium.mojo.bindings.MessageReceiverWithResponder messageReceiver) {
            super(core, messageReceiver);
        }


        @Override
        public void bindBarcodeDetectionProvider(
org.chromium.mojo.bindings.InterfaceRequest<BarcodeDetectionProvider> receiver) {

            ShapeDetectionServiceBindBarcodeDetectionProviderParams _message = new ShapeDetectionServiceBindBarcodeDetectionProviderParams();

            _message.receiver = receiver;


            getProxyHandler().getMessageReceiver().accept(
                    _message.serializeWithHeader(
                            getProxyHandler().getCore(),
                            new org.chromium.mojo.bindings.MessageHeader(BIND_BARCODE_DETECTION_PROVIDER_ORDINAL)));

        }


        @Override
        public void bindFaceDetectionProvider(
org.chromium.mojo.bindings.InterfaceRequest<FaceDetectionProvider> receiver) {

            ShapeDetectionServiceBindFaceDetectionProviderParams _message = new ShapeDetectionServiceBindFaceDetectionProviderParams();

            _message.receiver = receiver;


            getProxyHandler().getMessageReceiver().accept(
                    _message.serializeWithHeader(
                            getProxyHandler().getCore(),
                            new org.chromium.mojo.bindings.MessageHeader(BIND_FACE_DETECTION_PROVIDER_ORDINAL)));

        }


        @Override
        public void bindTextDetection(
org.chromium.mojo.bindings.InterfaceRequest<TextDetection> receiver) {

            ShapeDetectionServiceBindTextDetectionParams _message = new ShapeDetectionServiceBindTextDetectionParams();

            _message.receiver = receiver;


            getProxyHandler().getMessageReceiver().accept(
                    _message.serializeWithHeader(
                            getProxyHandler().getCore(),
                            new org.chromium.mojo.bindings.MessageHeader(BIND_TEXT_DETECTION_ORDINAL)));

        }


    }

    static final class Stub extends org.chromium.mojo.bindings.Interface.Stub<ShapeDetectionService> {

        Stub(org.chromium.mojo.system.Core core, ShapeDetectionService impl) {
            super(core, impl);
        }

        @Override
        public boolean accept(org.chromium.mojo.bindings.Message message) {
            try {
                org.chromium.mojo.bindings.ServiceMessage messageWithHeader =
                        message.asServiceMessage();
                org.chromium.mojo.bindings.MessageHeader header = messageWithHeader.getHeader();
                int flags = org.chromium.mojo.bindings.MessageHeader.NO_FLAG;
                if (header.hasFlag(org.chromium.mojo.bindings.MessageHeader.MESSAGE_IS_SYNC_FLAG)) {
                    flags = flags | org.chromium.mojo.bindings.MessageHeader.MESSAGE_IS_SYNC_FLAG;
                }
                if (!header.validateHeader(flags)) {
                    return false;
                }
                switch(header.getType()) {

                    case org.chromium.mojo.bindings.interfacecontrol.InterfaceControlMessagesConstants.RUN_OR_CLOSE_PIPE_MESSAGE_ID:
                        return org.chromium.mojo.bindings.InterfaceControlMessagesHelper.handleRunOrClosePipe(
                                ShapeDetectionService_Internal.MANAGER, messageWithHeader);





                    case BIND_BARCODE_DETECTION_PROVIDER_ORDINAL: {

                        ShapeDetectionServiceBindBarcodeDetectionProviderParams data =
                                ShapeDetectionServiceBindBarcodeDetectionProviderParams.deserialize(messageWithHeader.getPayload());

                        getImpl().bindBarcodeDetectionProvider(data.receiver);
                        return true;
                    }





                    case BIND_FACE_DETECTION_PROVIDER_ORDINAL: {

                        ShapeDetectionServiceBindFaceDetectionProviderParams data =
                                ShapeDetectionServiceBindFaceDetectionProviderParams.deserialize(messageWithHeader.getPayload());

                        getImpl().bindFaceDetectionProvider(data.receiver);
                        return true;
                    }





                    case BIND_TEXT_DETECTION_ORDINAL: {

                        ShapeDetectionServiceBindTextDetectionParams data =
                                ShapeDetectionServiceBindTextDetectionParams.deserialize(messageWithHeader.getPayload());

                        getImpl().bindTextDetection(data.receiver);
                        return true;
                    }


                    default:
                        return false;
                }
            } catch (org.chromium.mojo.bindings.DeserializationException e) {
                System.err.println(e);
                return false;
            }
        }

        @Override
        public boolean acceptWithResponder(org.chromium.mojo.bindings.Message message, org.chromium.mojo.bindings.MessageReceiver receiver) {
            try {
                org.chromium.mojo.bindings.ServiceMessage messageWithHeader =
                        message.asServiceMessage();
                org.chromium.mojo.bindings.MessageHeader header = messageWithHeader.getHeader();
                int flags = org.chromium.mojo.bindings.MessageHeader.MESSAGE_EXPECTS_RESPONSE_FLAG;
                if (header.hasFlag(org.chromium.mojo.bindings.MessageHeader.MESSAGE_IS_SYNC_FLAG)) {
                    flags = flags | org.chromium.mojo.bindings.MessageHeader.MESSAGE_IS_SYNC_FLAG;
                }
                if (!header.validateHeader(flags)) {
                    return false;
                }
                if (header.getType() == InterfaceControlMessagesConstants.RUN_MESSAGE_ID) {
                    return InterfaceControlMessagesHelper.handleRun(
                            getCore(), ShapeDetectionService_Internal.MANAGER, messageWithHeader, receiver);
                }
                return false;
            } catch (org.chromium.mojo.bindings.DeserializationException e) {
                System.err.println(e);
                return false;
            }
        }
    }


    
    static final class ShapeDetectionServiceBindBarcodeDetectionProviderParams extends org.chromium.mojo.bindings.Struct {

        private static final int STRUCT_SIZE = 16;
        private static final org.chromium.mojo.bindings.DataHeader[] VERSION_ARRAY = new org.chromium.mojo.bindings.DataHeader[] {new org.chromium.mojo.bindings.DataHeader(16, 0)};
        private static final org.chromium.mojo.bindings.DataHeader DEFAULT_STRUCT_INFO = VERSION_ARRAY[0];
        public org.chromium.mojo.bindings.InterfaceRequest<BarcodeDetectionProvider> receiver;

        private ShapeDetectionServiceBindBarcodeDetectionProviderParams(int version) {
            super(STRUCT_SIZE, version);
        }

        public ShapeDetectionServiceBindBarcodeDetectionProviderParams() {
            this(0);
        }

        public static ShapeDetectionServiceBindBarcodeDetectionProviderParams deserialize(org.chromium.mojo.bindings.Message message) {
            return decode(new org.chromium.mojo.bindings.Decoder(message));
        }

        /**
         * Similar to the method above, but deserializes from a |ByteBuffer| instance.
         *
         * @throws org.chromium.mojo.bindings.DeserializationException on deserialization failure.
         */
        public static ShapeDetectionServiceBindBarcodeDetectionProviderParams deserialize(java.nio.ByteBuffer data) {
            return deserialize(new org.chromium.mojo.bindings.Message(
                    data, new java.util.ArrayList<org.chromium.mojo.system.Handle>()));
        }

        public static ShapeDetectionServiceBindBarcodeDetectionProviderParams decode(org.chromium.mojo.bindings.Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            ShapeDetectionServiceBindBarcodeDetectionProviderParams result;
            try {
                org.chromium.mojo.bindings.DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                final int elementsOrVersion = mainDataHeader.elementsOrVersion;
                result = new ShapeDetectionServiceBindBarcodeDetectionProviderParams(elementsOrVersion);
                    {
                        
                    result.receiver = decoder0.readInterfaceRequest(8, false);
                    }

            } finally {
                decoder0.decreaseStackDepth();
            }
            return result;
        }

        @Override
        protected void encode(org.chromium.mojo.bindings.Encoder encoder) {
            org.chromium.mojo.bindings.Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
            
            encoder0.encode(this.receiver, 8, false);
        }
    }



    
    static final class ShapeDetectionServiceBindFaceDetectionProviderParams extends org.chromium.mojo.bindings.Struct {

        private static final int STRUCT_SIZE = 16;
        private static final org.chromium.mojo.bindings.DataHeader[] VERSION_ARRAY = new org.chromium.mojo.bindings.DataHeader[] {new org.chromium.mojo.bindings.DataHeader(16, 0)};
        private static final org.chromium.mojo.bindings.DataHeader DEFAULT_STRUCT_INFO = VERSION_ARRAY[0];
        public org.chromium.mojo.bindings.InterfaceRequest<FaceDetectionProvider> receiver;

        private ShapeDetectionServiceBindFaceDetectionProviderParams(int version) {
            super(STRUCT_SIZE, version);
        }

        public ShapeDetectionServiceBindFaceDetectionProviderParams() {
            this(0);
        }

        public static ShapeDetectionServiceBindFaceDetectionProviderParams deserialize(org.chromium.mojo.bindings.Message message) {
            return decode(new org.chromium.mojo.bindings.Decoder(message));
        }

        /**
         * Similar to the method above, but deserializes from a |ByteBuffer| instance.
         *
         * @throws org.chromium.mojo.bindings.DeserializationException on deserialization failure.
         */
        public static ShapeDetectionServiceBindFaceDetectionProviderParams deserialize(java.nio.ByteBuffer data) {
            return deserialize(new org.chromium.mojo.bindings.Message(
                    data, new java.util.ArrayList<org.chromium.mojo.system.Handle>()));
        }

        public static ShapeDetectionServiceBindFaceDetectionProviderParams decode(org.chromium.mojo.bindings.Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            ShapeDetectionServiceBindFaceDetectionProviderParams result;
            try {
                org.chromium.mojo.bindings.DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                final int elementsOrVersion = mainDataHeader.elementsOrVersion;
                result = new ShapeDetectionServiceBindFaceDetectionProviderParams(elementsOrVersion);
                    {
                        
                    result.receiver = decoder0.readInterfaceRequest(8, false);
                    }

            } finally {
                decoder0.decreaseStackDepth();
            }
            return result;
        }

        @Override
        protected void encode(org.chromium.mojo.bindings.Encoder encoder) {
            org.chromium.mojo.bindings.Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
            
            encoder0.encode(this.receiver, 8, false);
        }
    }



    
    static final class ShapeDetectionServiceBindTextDetectionParams extends org.chromium.mojo.bindings.Struct {

        private static final int STRUCT_SIZE = 16;
        private static final org.chromium.mojo.bindings.DataHeader[] VERSION_ARRAY = new org.chromium.mojo.bindings.DataHeader[] {new org.chromium.mojo.bindings.DataHeader(16, 0)};
        private static final org.chromium.mojo.bindings.DataHeader DEFAULT_STRUCT_INFO = VERSION_ARRAY[0];
        public org.chromium.mojo.bindings.InterfaceRequest<TextDetection> receiver;

        private ShapeDetectionServiceBindTextDetectionParams(int version) {
            super(STRUCT_SIZE, version);
        }

        public ShapeDetectionServiceBindTextDetectionParams() {
            this(0);
        }

        public static ShapeDetectionServiceBindTextDetectionParams deserialize(org.chromium.mojo.bindings.Message message) {
            return decode(new org.chromium.mojo.bindings.Decoder(message));
        }

        /**
         * Similar to the method above, but deserializes from a |ByteBuffer| instance.
         *
         * @throws org.chromium.mojo.bindings.DeserializationException on deserialization failure.
         */
        public static ShapeDetectionServiceBindTextDetectionParams deserialize(java.nio.ByteBuffer data) {
            return deserialize(new org.chromium.mojo.bindings.Message(
                    data, new java.util.ArrayList<org.chromium.mojo.system.Handle>()));
        }

        public static ShapeDetectionServiceBindTextDetectionParams decode(org.chromium.mojo.bindings.Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            ShapeDetectionServiceBindTextDetectionParams result;
            try {
                org.chromium.mojo.bindings.DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                final int elementsOrVersion = mainDataHeader.elementsOrVersion;
                result = new ShapeDetectionServiceBindTextDetectionParams(elementsOrVersion);
                    {
                        
                    result.receiver = decoder0.readInterfaceRequest(8, false);
                    }

            } finally {
                decoder0.decreaseStackDepth();
            }
            return result;
        }

        @Override
        protected void encode(org.chromium.mojo.bindings.Encoder encoder) {
            org.chromium.mojo.bindings.Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
            
            encoder0.encode(this.receiver, 8, false);
        }
    }



}
