// InterfaceProvider_Internal.java is auto generated by mojom_bindings_generator.py, do not edit


// Copyright 2014 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

// This file is autogenerated by:
//     mojo/public/tools/bindings/mojom_bindings_generator.py
// For:
//     services/service_manager/public/mojom/interface_provider.mojom
//

package org.chromium.service_manager.mojom;

import org.chromium.mojo.bindings.InterfaceControlMessagesHelper;
import org.chromium.mojo.bindings.interfacecontrol.InterfaceControlMessagesConstants;


class InterfaceProvider_Internal {

    public static final org.chromium.mojo.bindings.Interface.Manager<InterfaceProvider, InterfaceProvider.Proxy> MANAGER =
            new org.chromium.mojo.bindings.Interface.Manager<InterfaceProvider, InterfaceProvider.Proxy>() {

        @Override
        public String getName() {
            return "service_manager.mojom.InterfaceProvider";
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
        public Stub buildStub(org.chromium.mojo.system.Core core, InterfaceProvider impl) {
            return new Stub(core, impl);
        }

        @Override
        public InterfaceProvider[] buildArray(int size) {
          return new InterfaceProvider[size];
        }
    };


    private static final int GET_INTERFACE_ORDINAL = 0;


    static final class Proxy extends org.chromium.mojo.bindings.Interface.AbstractProxy implements InterfaceProvider.Proxy {

        Proxy(org.chromium.mojo.system.Core core,
              org.chromium.mojo.bindings.MessageReceiverWithResponder messageReceiver) {
            super(core, messageReceiver);
        }


        @Override
        public void getInterface(
String interfaceName, org.chromium.mojo.system.MessagePipeHandle pipe) {

            InterfaceProviderGetInterfaceParams _message = new InterfaceProviderGetInterfaceParams();

            _message.interfaceName = interfaceName;

            _message.pipe = pipe;


            getProxyHandler().getMessageReceiver().accept(
                    _message.serializeWithHeader(
                            getProxyHandler().getCore(),
                            new org.chromium.mojo.bindings.MessageHeader(GET_INTERFACE_ORDINAL)));

        }


    }

    static final class Stub extends org.chromium.mojo.bindings.Interface.Stub<InterfaceProvider> {

        Stub(org.chromium.mojo.system.Core core, InterfaceProvider impl) {
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
                                InterfaceProvider_Internal.MANAGER, messageWithHeader);





                    case GET_INTERFACE_ORDINAL: {

                        InterfaceProviderGetInterfaceParams data =
                                InterfaceProviderGetInterfaceParams.deserialize(messageWithHeader.getPayload());

                        getImpl().getInterface(data.interfaceName, data.pipe);
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
                            getCore(), InterfaceProvider_Internal.MANAGER, messageWithHeader, receiver);
                }
                return false;
            } catch (org.chromium.mojo.bindings.DeserializationException e) {
                System.err.println(e);
                return false;
            }
        }
    }


    
    static final class InterfaceProviderGetInterfaceParams extends org.chromium.mojo.bindings.Struct {

        private static final int STRUCT_SIZE = 24;
        private static final org.chromium.mojo.bindings.DataHeader[] VERSION_ARRAY = new org.chromium.mojo.bindings.DataHeader[] {new org.chromium.mojo.bindings.DataHeader(24, 0)};
        private static final org.chromium.mojo.bindings.DataHeader DEFAULT_STRUCT_INFO = VERSION_ARRAY[0];
        public String interfaceName;
        public org.chromium.mojo.system.MessagePipeHandle pipe;

        private InterfaceProviderGetInterfaceParams(int version) {
            super(STRUCT_SIZE, version);
            this.pipe = org.chromium.mojo.system.InvalidHandle.INSTANCE;
        }

        public InterfaceProviderGetInterfaceParams() {
            this(0);
        }

        public static InterfaceProviderGetInterfaceParams deserialize(org.chromium.mojo.bindings.Message message) {
            return decode(new org.chromium.mojo.bindings.Decoder(message));
        }

        /**
         * Similar to the method above, but deserializes from a |ByteBuffer| instance.
         *
         * @throws org.chromium.mojo.bindings.DeserializationException on deserialization failure.
         */
        public static InterfaceProviderGetInterfaceParams deserialize(java.nio.ByteBuffer data) {
            return deserialize(new org.chromium.mojo.bindings.Message(
                    data, new java.util.ArrayList<org.chromium.mojo.system.Handle>()));
        }

        public static InterfaceProviderGetInterfaceParams decode(org.chromium.mojo.bindings.Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            InterfaceProviderGetInterfaceParams result;
            try {
                org.chromium.mojo.bindings.DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                final int elementsOrVersion = mainDataHeader.elementsOrVersion;
                result = new InterfaceProviderGetInterfaceParams(elementsOrVersion);
                    {
                        
                    result.interfaceName = decoder0.readString(8, false);
                    }
                    {
                        
                    result.pipe = decoder0.readMessagePipeHandle(16, false);
                    }

            } finally {
                decoder0.decreaseStackDepth();
            }
            return result;
        }

        @Override
        protected void encode(org.chromium.mojo.bindings.Encoder encoder) {
            org.chromium.mojo.bindings.Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
            
            encoder0.encode(this.interfaceName, 8, false);
            
            encoder0.encode(this.pipe, 16, false);
        }
    }



}
