// P2pSocketClient_Internal.java is auto generated by mojom_bindings_generator.py, do not edit


// Copyright 2014 The Chromium Authors
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

// This file is autogenerated by:
//     mojo/public/tools/bindings/mojom_bindings_generator.py
// For:
//     services/network/public/mojom/p2p.mojom
//

package org.chromium.network.mojom;

class P2pSocketClient_Internal {

    public static final org.chromium.mojo.bindings.Interface.Manager<P2pSocketClient, P2pSocketClient.Proxy> MANAGER = new org.chromium.mojo.bindings.Interface.Manager<P2pSocketClient, P2pSocketClient.Proxy>() {

        @Override
        public String getName() {
            return "network.mojom.P2PSocketClient";
        }

        @Override
        public int getVersion() {
            return 0;
        }

        @Override
        public Proxy buildProxy(org.chromium.mojo.system.Core core, org.chromium.mojo.bindings.MessageReceiverWithResponder messageReceiver) {
            return new Proxy(core, messageReceiver);
        }

        @Override
        public Stub buildStub(org.chromium.mojo.system.Core core, P2pSocketClient impl) {
            return new Stub(core, impl);
        }

        @Override
        public P2pSocketClient[] buildArray(int size) {
            return new P2pSocketClient[size];
        }
    };


    private static final int SOCKET_CREATED_ORDINAL = 0;

    private static final int SEND_COMPLETE_ORDINAL = 1;

    private static final int SEND_BATCH_COMPLETE_ORDINAL = 2;

    private static final int DATA_RECEIVED_ORDINAL = 3;


    static final class Proxy extends org.chromium.mojo.bindings.Interface.AbstractProxy implements P2pSocketClient.Proxy {

        Proxy(org.chromium.mojo.system.Core core, org.chromium.mojo.bindings.MessageReceiverWithResponder messageReceiver) {
            super(core, messageReceiver);
        }


        @Override
        public void socketCreated(IpEndPoint localAddress, IpEndPoint remoteAddress) {

            P2pSocketClientSocketCreatedParams _message = new P2pSocketClientSocketCreatedParams();

            _message.localAddress = localAddress;

            _message.remoteAddress = remoteAddress;


            getProxyHandler().getMessageReceiver().accept(_message.serializeWithHeader(getProxyHandler().getCore(), new org.chromium.mojo.bindings.MessageHeader(SOCKET_CREATED_ORDINAL)));

        }


        @Override
        public void sendComplete(P2pSendPacketMetrics sendMetrics) {

            P2pSocketClientSendCompleteParams _message = new P2pSocketClientSendCompleteParams();

            _message.sendMetrics = sendMetrics;


            getProxyHandler().getMessageReceiver().accept(_message.serializeWithHeader(getProxyHandler().getCore(), new org.chromium.mojo.bindings.MessageHeader(SEND_COMPLETE_ORDINAL)));

        }


        @Override
        public void sendBatchComplete(P2pSendPacketMetrics[] sendMetricsBatch) {

            P2pSocketClientSendBatchCompleteParams _message = new P2pSocketClientSendBatchCompleteParams();

            _message.sendMetricsBatch = sendMetricsBatch;


            getProxyHandler().getMessageReceiver().accept(_message.serializeWithHeader(getProxyHandler().getCore(), new org.chromium.mojo.bindings.MessageHeader(SEND_BATCH_COMPLETE_ORDINAL)));

        }


        @Override
        public void dataReceived(P2pReceivedPacket[] packets) {

            P2pSocketClientDataReceivedParams _message = new P2pSocketClientDataReceivedParams();

            _message.packets = packets;


            getProxyHandler().getMessageReceiver().accept(_message.serializeWithHeader(getProxyHandler().getCore(), new org.chromium.mojo.bindings.MessageHeader(DATA_RECEIVED_ORDINAL)));

        }


    }

    static final class Stub extends org.chromium.mojo.bindings.Interface.Stub<P2pSocketClient> {

        Stub(org.chromium.mojo.system.Core core, P2pSocketClient impl) {
            super(core, impl);
        }

        @Override
        public boolean accept(org.chromium.mojo.bindings.Message message) {
            try {
                org.chromium.mojo.bindings.ServiceMessage messageWithHeader = message.asServiceMessage();
                org.chromium.mojo.bindings.MessageHeader header = messageWithHeader.getHeader();
                int flags = org.chromium.mojo.bindings.MessageHeader.NO_FLAG;
                if (header.hasFlag(org.chromium.mojo.bindings.MessageHeader.MESSAGE_IS_SYNC_FLAG)) {
                    flags = flags | org.chromium.mojo.bindings.MessageHeader.MESSAGE_IS_SYNC_FLAG;
                }
                if (!header.validateHeader(flags)) {
                    return false;
                }
                switch (header.getType()) {

                    case org.chromium.mojo.bindings.interfacecontrol.InterfaceControlMessagesConstants.RUN_OR_CLOSE_PIPE_MESSAGE_ID:
                        return org.chromium.mojo.bindings.InterfaceControlMessagesHelper.handleRunOrClosePipe(P2pSocketClient_Internal.MANAGER, messageWithHeader);


                    case SOCKET_CREATED_ORDINAL: {

                        P2pSocketClientSocketCreatedParams data = P2pSocketClientSocketCreatedParams.deserialize(messageWithHeader.getPayload());

                        getImpl().socketCreated(data.localAddress, data.remoteAddress);
                        return true;
                    }


                    case SEND_COMPLETE_ORDINAL: {

                        P2pSocketClientSendCompleteParams data = P2pSocketClientSendCompleteParams.deserialize(messageWithHeader.getPayload());

                        getImpl().sendComplete(data.sendMetrics);
                        return true;
                    }


                    case SEND_BATCH_COMPLETE_ORDINAL: {

                        P2pSocketClientSendBatchCompleteParams data = P2pSocketClientSendBatchCompleteParams.deserialize(messageWithHeader.getPayload());

                        getImpl().sendBatchComplete(data.sendMetricsBatch);
                        return true;
                    }


                    case DATA_RECEIVED_ORDINAL: {

                        P2pSocketClientDataReceivedParams data = P2pSocketClientDataReceivedParams.deserialize(messageWithHeader.getPayload());

                        getImpl().dataReceived(data.packets);
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
                org.chromium.mojo.bindings.ServiceMessage messageWithHeader = message.asServiceMessage();
                org.chromium.mojo.bindings.MessageHeader header = messageWithHeader.getHeader();
                int flags = org.chromium.mojo.bindings.MessageHeader.MESSAGE_EXPECTS_RESPONSE_FLAG;
                if (header.hasFlag(org.chromium.mojo.bindings.MessageHeader.MESSAGE_IS_SYNC_FLAG)) {
                    flags = flags | org.chromium.mojo.bindings.MessageHeader.MESSAGE_IS_SYNC_FLAG;
                }
                if (!header.validateHeader(flags)) {
                    return false;
                }
                switch (header.getType()) {

                    case org.chromium.mojo.bindings.interfacecontrol.InterfaceControlMessagesConstants.RUN_MESSAGE_ID:
                        return org.chromium.mojo.bindings.InterfaceControlMessagesHelper.handleRun(getCore(), P2pSocketClient_Internal.MANAGER, messageWithHeader, receiver);


                    default:
                        return false;
                }
            } catch (org.chromium.mojo.bindings.DeserializationException e) {
                System.err.println(e);
                return false;
            }
        }
    }


    static final class P2pSocketClientSocketCreatedParams extends org.chromium.mojo.bindings.Struct {

        private static final int STRUCT_SIZE = 24;
        private static final org.chromium.mojo.bindings.DataHeader[] VERSION_ARRAY = new org.chromium.mojo.bindings.DataHeader[]{new org.chromium.mojo.bindings.DataHeader(24, 0)};
        private static final org.chromium.mojo.bindings.DataHeader DEFAULT_STRUCT_INFO = VERSION_ARRAY[0];
        public IpEndPoint localAddress;
        public IpEndPoint remoteAddress;

        private P2pSocketClientSocketCreatedParams(int version) {
            super(STRUCT_SIZE, version);
        }

        public P2pSocketClientSocketCreatedParams() {
            this(0);
        }

        public static P2pSocketClientSocketCreatedParams deserialize(org.chromium.mojo.bindings.Message message) {
            return decode(new org.chromium.mojo.bindings.Decoder(message));
        }

        /**
         * Similar to the method above, but deserializes from a |ByteBuffer| instance.
         *
         * @throws org.chromium.mojo.bindings.DeserializationException on deserialization failure.
         */
        public static P2pSocketClientSocketCreatedParams deserialize(java.nio.ByteBuffer data) {
            return deserialize(new org.chromium.mojo.bindings.Message(data, new java.util.ArrayList<org.chromium.mojo.system.Handle>()));
        }

        @SuppressWarnings("unchecked")
        public static P2pSocketClientSocketCreatedParams decode(org.chromium.mojo.bindings.Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            P2pSocketClientSocketCreatedParams result;
            try {
                org.chromium.mojo.bindings.DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                final int elementsOrVersion = mainDataHeader.elementsOrVersion;
                result = new P2pSocketClientSocketCreatedParams(elementsOrVersion);
                {

                    org.chromium.mojo.bindings.Decoder decoder1 = decoder0.readPointer(8, false);
                    result.localAddress = IpEndPoint.decode(decoder1);
                }
                {

                    org.chromium.mojo.bindings.Decoder decoder1 = decoder0.readPointer(16, false);
                    result.remoteAddress = IpEndPoint.decode(decoder1);
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

            encoder0.encode(this.localAddress, 8, false);

            encoder0.encode(this.remoteAddress, 16, false);
        }
    }


    static final class P2pSocketClientSendCompleteParams extends org.chromium.mojo.bindings.Struct {

        private static final int STRUCT_SIZE = 16;
        private static final org.chromium.mojo.bindings.DataHeader[] VERSION_ARRAY = new org.chromium.mojo.bindings.DataHeader[]{new org.chromium.mojo.bindings.DataHeader(16, 0)};
        private static final org.chromium.mojo.bindings.DataHeader DEFAULT_STRUCT_INFO = VERSION_ARRAY[0];
        public P2pSendPacketMetrics sendMetrics;

        private P2pSocketClientSendCompleteParams(int version) {
            super(STRUCT_SIZE, version);
        }

        public P2pSocketClientSendCompleteParams() {
            this(0);
        }

        public static P2pSocketClientSendCompleteParams deserialize(org.chromium.mojo.bindings.Message message) {
            return decode(new org.chromium.mojo.bindings.Decoder(message));
        }

        /**
         * Similar to the method above, but deserializes from a |ByteBuffer| instance.
         *
         * @throws org.chromium.mojo.bindings.DeserializationException on deserialization failure.
         */
        public static P2pSocketClientSendCompleteParams deserialize(java.nio.ByteBuffer data) {
            return deserialize(new org.chromium.mojo.bindings.Message(data, new java.util.ArrayList<org.chromium.mojo.system.Handle>()));
        }

        @SuppressWarnings("unchecked")
        public static P2pSocketClientSendCompleteParams decode(org.chromium.mojo.bindings.Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            P2pSocketClientSendCompleteParams result;
            try {
                org.chromium.mojo.bindings.DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                final int elementsOrVersion = mainDataHeader.elementsOrVersion;
                result = new P2pSocketClientSendCompleteParams(elementsOrVersion);
                {

                    org.chromium.mojo.bindings.Decoder decoder1 = decoder0.readPointer(8, false);
                    result.sendMetrics = P2pSendPacketMetrics.decode(decoder1);
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

            encoder0.encode(this.sendMetrics, 8, false);
        }
    }


    static final class P2pSocketClientSendBatchCompleteParams extends org.chromium.mojo.bindings.Struct {

        private static final int STRUCT_SIZE = 16;
        private static final org.chromium.mojo.bindings.DataHeader[] VERSION_ARRAY = new org.chromium.mojo.bindings.DataHeader[]{new org.chromium.mojo.bindings.DataHeader(16, 0)};
        private static final org.chromium.mojo.bindings.DataHeader DEFAULT_STRUCT_INFO = VERSION_ARRAY[0];
        public P2pSendPacketMetrics[] sendMetricsBatch;

        private P2pSocketClientSendBatchCompleteParams(int version) {
            super(STRUCT_SIZE, version);
        }

        public P2pSocketClientSendBatchCompleteParams() {
            this(0);
        }

        public static P2pSocketClientSendBatchCompleteParams deserialize(org.chromium.mojo.bindings.Message message) {
            return decode(new org.chromium.mojo.bindings.Decoder(message));
        }

        /**
         * Similar to the method above, but deserializes from a |ByteBuffer| instance.
         *
         * @throws org.chromium.mojo.bindings.DeserializationException on deserialization failure.
         */
        public static P2pSocketClientSendBatchCompleteParams deserialize(java.nio.ByteBuffer data) {
            return deserialize(new org.chromium.mojo.bindings.Message(data, new java.util.ArrayList<org.chromium.mojo.system.Handle>()));
        }

        @SuppressWarnings("unchecked")
        public static P2pSocketClientSendBatchCompleteParams decode(org.chromium.mojo.bindings.Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            P2pSocketClientSendBatchCompleteParams result;
            try {
                org.chromium.mojo.bindings.DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                final int elementsOrVersion = mainDataHeader.elementsOrVersion;
                result = new P2pSocketClientSendBatchCompleteParams(elementsOrVersion);
                {

                    org.chromium.mojo.bindings.Decoder decoder1 = decoder0.readPointer(8, false);
                    {
                        org.chromium.mojo.bindings.DataHeader si1 = decoder1.readDataHeaderForPointerArray(org.chromium.mojo.bindings.BindingsHelper.UNSPECIFIED_ARRAY_LENGTH);
                        result.sendMetricsBatch = new P2pSendPacketMetrics[si1.elementsOrVersion];
                        for (int i1 = 0; i1 < si1.elementsOrVersion; ++i1) {

                            org.chromium.mojo.bindings.Decoder decoder2 = decoder1.readPointer(org.chromium.mojo.bindings.DataHeader.HEADER_SIZE + org.chromium.mojo.bindings.BindingsHelper.POINTER_SIZE * i1, false);
                            result.sendMetricsBatch[i1] = P2pSendPacketMetrics.decode(decoder2);
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

            if (this.sendMetricsBatch == null) {
                encoder0.encodeNullPointer(8, false);
            } else {
                org.chromium.mojo.bindings.Encoder encoder1 = encoder0.encodePointerArray(this.sendMetricsBatch.length, 8, org.chromium.mojo.bindings.BindingsHelper.UNSPECIFIED_ARRAY_LENGTH);
                for (int i0 = 0; i0 < this.sendMetricsBatch.length; ++i0) {

                    encoder1.encode(this.sendMetricsBatch[i0], org.chromium.mojo.bindings.DataHeader.HEADER_SIZE + org.chromium.mojo.bindings.BindingsHelper.POINTER_SIZE * i0, false);
                }
            }
        }
    }


    static final class P2pSocketClientDataReceivedParams extends org.chromium.mojo.bindings.Struct {

        private static final int STRUCT_SIZE = 16;
        private static final org.chromium.mojo.bindings.DataHeader[] VERSION_ARRAY = new org.chromium.mojo.bindings.DataHeader[]{new org.chromium.mojo.bindings.DataHeader(16, 0)};
        private static final org.chromium.mojo.bindings.DataHeader DEFAULT_STRUCT_INFO = VERSION_ARRAY[0];
        public P2pReceivedPacket[] packets;

        private P2pSocketClientDataReceivedParams(int version) {
            super(STRUCT_SIZE, version);
        }

        public P2pSocketClientDataReceivedParams() {
            this(0);
        }

        public static P2pSocketClientDataReceivedParams deserialize(org.chromium.mojo.bindings.Message message) {
            return decode(new org.chromium.mojo.bindings.Decoder(message));
        }

        /**
         * Similar to the method above, but deserializes from a |ByteBuffer| instance.
         *
         * @throws org.chromium.mojo.bindings.DeserializationException on deserialization failure.
         */
        public static P2pSocketClientDataReceivedParams deserialize(java.nio.ByteBuffer data) {
            return deserialize(new org.chromium.mojo.bindings.Message(data, new java.util.ArrayList<org.chromium.mojo.system.Handle>()));
        }

        @SuppressWarnings("unchecked")
        public static P2pSocketClientDataReceivedParams decode(org.chromium.mojo.bindings.Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            P2pSocketClientDataReceivedParams result;
            try {
                org.chromium.mojo.bindings.DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                final int elementsOrVersion = mainDataHeader.elementsOrVersion;
                result = new P2pSocketClientDataReceivedParams(elementsOrVersion);
                {

                    org.chromium.mojo.bindings.Decoder decoder1 = decoder0.readPointer(8, false);
                    {
                        org.chromium.mojo.bindings.DataHeader si1 = decoder1.readDataHeaderForPointerArray(org.chromium.mojo.bindings.BindingsHelper.UNSPECIFIED_ARRAY_LENGTH);
                        result.packets = new P2pReceivedPacket[si1.elementsOrVersion];
                        for (int i1 = 0; i1 < si1.elementsOrVersion; ++i1) {

                            org.chromium.mojo.bindings.Decoder decoder2 = decoder1.readPointer(org.chromium.mojo.bindings.DataHeader.HEADER_SIZE + org.chromium.mojo.bindings.BindingsHelper.POINTER_SIZE * i1, false);
                            result.packets[i1] = P2pReceivedPacket.decode(decoder2);
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

            if (this.packets == null) {
                encoder0.encodeNullPointer(8, false);
            } else {
                org.chromium.mojo.bindings.Encoder encoder1 = encoder0.encodePointerArray(this.packets.length, 8, org.chromium.mojo.bindings.BindingsHelper.UNSPECIFIED_ARRAY_LENGTH);
                for (int i0 = 0; i0 < this.packets.length; ++i0) {

                    encoder1.encode(this.packets[i0], org.chromium.mojo.bindings.DataHeader.HEADER_SIZE + org.chromium.mojo.bindings.BindingsHelper.POINTER_SIZE * i0, false);
                }
            }
        }
    }


}