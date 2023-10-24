// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: reporting_info.proto

package org.chromium.components.metrics;

public final class ReportingInfoOuterClass {
    private ReportingInfoOuterClass() {
    }

    public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {
    }

    public interface ReportingInfoOrBuilder extends
            // @@protoc_insertion_point(interface_extends:metrics.ReportingInfo)
            com.google.protobuf.MessageLiteOrBuilder {

        /**
         * <pre>
         * Number of times upload of the current report has been attempted.
         * </pre>
         *
         * <code>optional int32 attempt_count = 1;</code>
         *
         * @return Whether the attemptCount field is set.
         */
        boolean hasAttemptCount();

        /**
         * <pre>
         * Number of times upload of the current report has been attempted.
         * </pre>
         *
         * <code>optional int32 attempt_count = 1;</code>
         *
         * @return The attemptCount.
         */
        int getAttemptCount();

        /**
         * <pre>
         * The HTTP response/error code of the last upload attempt.
         * </pre>
         *
         * <code>optional int32 last_response_code = 2;</code>
         *
         * @return Whether the lastResponseCode field is set.
         */
        boolean hasLastResponseCode();

        /**
         * <pre>
         * The HTTP response/error code of the last upload attempt.
         * </pre>
         *
         * <code>optional int32 last_response_code = 2;</code>
         *
         * @return The lastResponseCode.
         */
        int getLastResponseCode();

        /**
         * <pre>
         * The NET_ERROR code of the last upload attempt.
         * See chromium's net/base/net_error_list.h for examples.
         * </pre>
         *
         * <code>optional int32 last_error_code = 3;</code>
         *
         * @return Whether the lastErrorCode field is set.
         */
        boolean hasLastErrorCode();

        /**
         * <pre>
         * The NET_ERROR code of the last upload attempt.
         * See chromium's net/base/net_error_list.h for examples.
         * </pre>
         *
         * <code>optional int32 last_error_code = 3;</code>
         *
         * @return The lastErrorCode.
         */
        int getLastErrorCode();

        /**
         * <pre>
         * True if the last upload attempt was over HTTPS.
         * </pre>
         *
         * <code>optional bool last_attempt_was_https = 4;</code>
         *
         * @return Whether the lastAttemptWasHttps field is set.
         */
        boolean hasLastAttemptWasHttps();

        /**
         * <pre>
         * True if the last upload attempt was over HTTPS.
         * </pre>
         *
         * <code>optional bool last_attempt_was_https = 4;</code>
         *
         * @return The lastAttemptWasHttps.
         */
        boolean getLastAttemptWasHttps();
    }

    /**
     * <pre>
     * Extra information attached to reports by client at upload time.
     * Next tag: 5
     * </pre>
     * <p>
     * Protobuf type {@code metrics.ReportingInfo}
     */
    public static final class ReportingInfo extends com.google.protobuf.GeneratedMessageLite<ReportingInfo, ReportingInfo.Builder> implements
            // @@protoc_insertion_point(message_implements:metrics.ReportingInfo)
            ReportingInfoOrBuilder {
        private ReportingInfo() {
        }

        private int bitField0_;
        public static final int ATTEMPT_COUNT_FIELD_NUMBER = 1;
        private int attemptCount_;

        /**
         * <pre>
         * Number of times upload of the current report has been attempted.
         * </pre>
         *
         * <code>optional int32 attempt_count = 1;</code>
         *
         * @return Whether the attemptCount field is set.
         */
        @java.lang.Override
        public boolean hasAttemptCount() {
            return ((bitField0_ & 0x00000001) != 0);
        }

        /**
         * <pre>
         * Number of times upload of the current report has been attempted.
         * </pre>
         *
         * <code>optional int32 attempt_count = 1;</code>
         *
         * @return The attemptCount.
         */
        @java.lang.Override
        public int getAttemptCount() {
            return attemptCount_;
        }

        /**
         * <pre>
         * Number of times upload of the current report has been attempted.
         * </pre>
         *
         * <code>optional int32 attempt_count = 1;</code>
         *
         * @param value The attemptCount to set.
         */
        private void setAttemptCount(int value) {
            bitField0_ |= 0x00000001;
            attemptCount_ = value;
        }

        /**
         * <pre>
         * Number of times upload of the current report has been attempted.
         * </pre>
         *
         * <code>optional int32 attempt_count = 1;</code>
         */
        private void clearAttemptCount() {
            bitField0_ = (bitField0_ & ~0x00000001);
            attemptCount_ = 0;
        }

        public static final int LAST_RESPONSE_CODE_FIELD_NUMBER = 2;
        private int lastResponseCode_;

        /**
         * <pre>
         * The HTTP response/error code of the last upload attempt.
         * </pre>
         *
         * <code>optional int32 last_response_code = 2;</code>
         *
         * @return Whether the lastResponseCode field is set.
         */
        @java.lang.Override
        public boolean hasLastResponseCode() {
            return ((bitField0_ & 0x00000002) != 0);
        }

        /**
         * <pre>
         * The HTTP response/error code of the last upload attempt.
         * </pre>
         *
         * <code>optional int32 last_response_code = 2;</code>
         *
         * @return The lastResponseCode.
         */
        @java.lang.Override
        public int getLastResponseCode() {
            return lastResponseCode_;
        }

        /**
         * <pre>
         * The HTTP response/error code of the last upload attempt.
         * </pre>
         *
         * <code>optional int32 last_response_code = 2;</code>
         *
         * @param value The lastResponseCode to set.
         */
        private void setLastResponseCode(int value) {
            bitField0_ |= 0x00000002;
            lastResponseCode_ = value;
        }

        /**
         * <pre>
         * The HTTP response/error code of the last upload attempt.
         * </pre>
         *
         * <code>optional int32 last_response_code = 2;</code>
         */
        private void clearLastResponseCode() {
            bitField0_ = (bitField0_ & ~0x00000002);
            lastResponseCode_ = 0;
        }

        public static final int LAST_ERROR_CODE_FIELD_NUMBER = 3;
        private int lastErrorCode_;

        /**
         * <pre>
         * The NET_ERROR code of the last upload attempt.
         * See chromium's net/base/net_error_list.h for examples.
         * </pre>
         *
         * <code>optional int32 last_error_code = 3;</code>
         *
         * @return Whether the lastErrorCode field is set.
         */
        @java.lang.Override
        public boolean hasLastErrorCode() {
            return ((bitField0_ & 0x00000004) != 0);
        }

        /**
         * <pre>
         * The NET_ERROR code of the last upload attempt.
         * See chromium's net/base/net_error_list.h for examples.
         * </pre>
         *
         * <code>optional int32 last_error_code = 3;</code>
         *
         * @return The lastErrorCode.
         */
        @java.lang.Override
        public int getLastErrorCode() {
            return lastErrorCode_;
        }

        /**
         * <pre>
         * The NET_ERROR code of the last upload attempt.
         * See chromium's net/base/net_error_list.h for examples.
         * </pre>
         *
         * <code>optional int32 last_error_code = 3;</code>
         *
         * @param value The lastErrorCode to set.
         */
        private void setLastErrorCode(int value) {
            bitField0_ |= 0x00000004;
            lastErrorCode_ = value;
        }

        /**
         * <pre>
         * The NET_ERROR code of the last upload attempt.
         * See chromium's net/base/net_error_list.h for examples.
         * </pre>
         *
         * <code>optional int32 last_error_code = 3;</code>
         */
        private void clearLastErrorCode() {
            bitField0_ = (bitField0_ & ~0x00000004);
            lastErrorCode_ = 0;
        }

        public static final int LAST_ATTEMPT_WAS_HTTPS_FIELD_NUMBER = 4;
        private boolean lastAttemptWasHttps_;

        /**
         * <pre>
         * True if the last upload attempt was over HTTPS.
         * </pre>
         *
         * <code>optional bool last_attempt_was_https = 4;</code>
         *
         * @return Whether the lastAttemptWasHttps field is set.
         */
        @java.lang.Override
        public boolean hasLastAttemptWasHttps() {
            return ((bitField0_ & 0x00000008) != 0);
        }

        /**
         * <pre>
         * True if the last upload attempt was over HTTPS.
         * </pre>
         *
         * <code>optional bool last_attempt_was_https = 4;</code>
         *
         * @return The lastAttemptWasHttps.
         */
        @java.lang.Override
        public boolean getLastAttemptWasHttps() {
            return lastAttemptWasHttps_;
        }

        /**
         * <pre>
         * True if the last upload attempt was over HTTPS.
         * </pre>
         *
         * <code>optional bool last_attempt_was_https = 4;</code>
         *
         * @param value The lastAttemptWasHttps to set.
         */
        private void setLastAttemptWasHttps(boolean value) {
            bitField0_ |= 0x00000008;
            lastAttemptWasHttps_ = value;
        }

        /**
         * <pre>
         * True if the last upload attempt was over HTTPS.
         * </pre>
         *
         * <code>optional bool last_attempt_was_https = 4;</code>
         */
        private void clearLastAttemptWasHttps() {
            bitField0_ = (bitField0_ & ~0x00000008);
            lastAttemptWasHttps_ = false;
        }

        public static org.chromium.components.metrics.ReportingInfoOuterClass.ReportingInfo parseFrom(java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
            return com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
        }

        public static org.chromium.components.metrics.ReportingInfoOuterClass.ReportingInfo parseFrom(java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry) throws com.google.protobuf.InvalidProtocolBufferException {
            return com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static org.chromium.components.metrics.ReportingInfoOuterClass.ReportingInfo parseFrom(com.google.protobuf.ByteString data) throws com.google.protobuf.InvalidProtocolBufferException {
            return com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
        }

        public static org.chromium.components.metrics.ReportingInfoOuterClass.ReportingInfo parseFrom(com.google.protobuf.ByteString data, com.google.protobuf.ExtensionRegistryLite extensionRegistry) throws com.google.protobuf.InvalidProtocolBufferException {
            return com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static org.chromium.components.metrics.ReportingInfoOuterClass.ReportingInfo parseFrom(byte[] data) throws com.google.protobuf.InvalidProtocolBufferException {
            return com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
        }

        public static org.chromium.components.metrics.ReportingInfoOuterClass.ReportingInfo parseFrom(byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry) throws com.google.protobuf.InvalidProtocolBufferException {
            return com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static org.chromium.components.metrics.ReportingInfoOuterClass.ReportingInfo parseFrom(java.io.InputStream input) throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
        }

        public static org.chromium.components.metrics.ReportingInfoOuterClass.ReportingInfo parseFrom(java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry) throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
        }

        public static org.chromium.components.metrics.ReportingInfoOuterClass.ReportingInfo parseDelimitedFrom(java.io.InputStream input) throws java.io.IOException {
            return parseDelimitedFrom(DEFAULT_INSTANCE, input);
        }

        public static org.chromium.components.metrics.ReportingInfoOuterClass.ReportingInfo parseDelimitedFrom(java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry) throws java.io.IOException {
            return parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
        }

        public static org.chromium.components.metrics.ReportingInfoOuterClass.ReportingInfo parseFrom(com.google.protobuf.CodedInputStream input) throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
        }

        public static org.chromium.components.metrics.ReportingInfoOuterClass.ReportingInfo parseFrom(com.google.protobuf.CodedInputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry) throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static Builder newBuilder(org.chromium.components.metrics.ReportingInfoOuterClass.ReportingInfo prototype) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(prototype);
        }

        /**
         * <pre>
         * Extra information attached to reports by client at upload time.
         * Next tag: 5
         * </pre>
         * <p>
         * Protobuf type {@code metrics.ReportingInfo}
         */
        public static final class Builder extends com.google.protobuf.GeneratedMessageLite.Builder<org.chromium.components.metrics.ReportingInfoOuterClass.ReportingInfo, Builder> implements
                // @@protoc_insertion_point(builder_implements:metrics.ReportingInfo)
                org.chromium.components.metrics.ReportingInfoOuterClass.ReportingInfoOrBuilder {
            // Construct using org.chromium.components.metrics.ReportingInfoOuterClass.ReportingInfo.newBuilder()
            private Builder() {
                super(DEFAULT_INSTANCE);
            }


            /**
             * <pre>
             * Number of times upload of the current report has been attempted.
             * </pre>
             *
             * <code>optional int32 attempt_count = 1;</code>
             *
             * @return Whether the attemptCount field is set.
             */
            @java.lang.Override
            public boolean hasAttemptCount() {
                return instance.hasAttemptCount();
            }

            /**
             * <pre>
             * Number of times upload of the current report has been attempted.
             * </pre>
             *
             * <code>optional int32 attempt_count = 1;</code>
             *
             * @return The attemptCount.
             */
            @java.lang.Override
            public int getAttemptCount() {
                return instance.getAttemptCount();
            }

            /**
             * <pre>
             * Number of times upload of the current report has been attempted.
             * </pre>
             *
             * <code>optional int32 attempt_count = 1;</code>
             *
             * @param value The attemptCount to set.
             * @return This builder for chaining.
             */
            public Builder setAttemptCount(int value) {
                copyOnWrite();
                instance.setAttemptCount(value);
                return this;
            }

            /**
             * <pre>
             * Number of times upload of the current report has been attempted.
             * </pre>
             *
             * <code>optional int32 attempt_count = 1;</code>
             *
             * @return This builder for chaining.
             */
            public Builder clearAttemptCount() {
                copyOnWrite();
                instance.clearAttemptCount();
                return this;
            }

            /**
             * <pre>
             * The HTTP response/error code of the last upload attempt.
             * </pre>
             *
             * <code>optional int32 last_response_code = 2;</code>
             *
             * @return Whether the lastResponseCode field is set.
             */
            @java.lang.Override
            public boolean hasLastResponseCode() {
                return instance.hasLastResponseCode();
            }

            /**
             * <pre>
             * The HTTP response/error code of the last upload attempt.
             * </pre>
             *
             * <code>optional int32 last_response_code = 2;</code>
             *
             * @return The lastResponseCode.
             */
            @java.lang.Override
            public int getLastResponseCode() {
                return instance.getLastResponseCode();
            }

            /**
             * <pre>
             * The HTTP response/error code of the last upload attempt.
             * </pre>
             *
             * <code>optional int32 last_response_code = 2;</code>
             *
             * @param value The lastResponseCode to set.
             * @return This builder for chaining.
             */
            public Builder setLastResponseCode(int value) {
                copyOnWrite();
                instance.setLastResponseCode(value);
                return this;
            }

            /**
             * <pre>
             * The HTTP response/error code of the last upload attempt.
             * </pre>
             *
             * <code>optional int32 last_response_code = 2;</code>
             *
             * @return This builder for chaining.
             */
            public Builder clearLastResponseCode() {
                copyOnWrite();
                instance.clearLastResponseCode();
                return this;
            }

            /**
             * <pre>
             * The NET_ERROR code of the last upload attempt.
             * See chromium's net/base/net_error_list.h for examples.
             * </pre>
             *
             * <code>optional int32 last_error_code = 3;</code>
             *
             * @return Whether the lastErrorCode field is set.
             */
            @java.lang.Override
            public boolean hasLastErrorCode() {
                return instance.hasLastErrorCode();
            }

            /**
             * <pre>
             * The NET_ERROR code of the last upload attempt.
             * See chromium's net/base/net_error_list.h for examples.
             * </pre>
             *
             * <code>optional int32 last_error_code = 3;</code>
             *
             * @return The lastErrorCode.
             */
            @java.lang.Override
            public int getLastErrorCode() {
                return instance.getLastErrorCode();
            }

            /**
             * <pre>
             * The NET_ERROR code of the last upload attempt.
             * See chromium's net/base/net_error_list.h for examples.
             * </pre>
             *
             * <code>optional int32 last_error_code = 3;</code>
             *
             * @param value The lastErrorCode to set.
             * @return This builder for chaining.
             */
            public Builder setLastErrorCode(int value) {
                copyOnWrite();
                instance.setLastErrorCode(value);
                return this;
            }

            /**
             * <pre>
             * The NET_ERROR code of the last upload attempt.
             * See chromium's net/base/net_error_list.h for examples.
             * </pre>
             *
             * <code>optional int32 last_error_code = 3;</code>
             *
             * @return This builder for chaining.
             */
            public Builder clearLastErrorCode() {
                copyOnWrite();
                instance.clearLastErrorCode();
                return this;
            }

            /**
             * <pre>
             * True if the last upload attempt was over HTTPS.
             * </pre>
             *
             * <code>optional bool last_attempt_was_https = 4;</code>
             *
             * @return Whether the lastAttemptWasHttps field is set.
             */
            @java.lang.Override
            public boolean hasLastAttemptWasHttps() {
                return instance.hasLastAttemptWasHttps();
            }

            /**
             * <pre>
             * True if the last upload attempt was over HTTPS.
             * </pre>
             *
             * <code>optional bool last_attempt_was_https = 4;</code>
             *
             * @return The lastAttemptWasHttps.
             */
            @java.lang.Override
            public boolean getLastAttemptWasHttps() {
                return instance.getLastAttemptWasHttps();
            }

            /**
             * <pre>
             * True if the last upload attempt was over HTTPS.
             * </pre>
             *
             * <code>optional bool last_attempt_was_https = 4;</code>
             *
             * @param value The lastAttemptWasHttps to set.
             * @return This builder for chaining.
             */
            public Builder setLastAttemptWasHttps(boolean value) {
                copyOnWrite();
                instance.setLastAttemptWasHttps(value);
                return this;
            }

            /**
             * <pre>
             * True if the last upload attempt was over HTTPS.
             * </pre>
             *
             * <code>optional bool last_attempt_was_https = 4;</code>
             *
             * @return This builder for chaining.
             */
            public Builder clearLastAttemptWasHttps() {
                copyOnWrite();
                instance.clearLastAttemptWasHttps();
                return this;
            }

            // @@protoc_insertion_point(builder_scope:metrics.ReportingInfo)
        }

        @java.lang.Override
        @java.lang.SuppressWarnings({"unchecked", "fallthrough"})
        protected final java.lang.Object dynamicMethod(com.google.protobuf.GeneratedMessageLite.MethodToInvoke method, java.lang.Object arg0, java.lang.Object arg1) {
            switch (method) {
                case NEW_MUTABLE_INSTANCE: {
                    return new org.chromium.components.metrics.ReportingInfoOuterClass.ReportingInfo();
                }
                case NEW_BUILDER: {
                    return new Builder();
                }
                case BUILD_MESSAGE_INFO: {
                    java.lang.Object[] objects = new java.lang.Object[]{"bitField0_", "attemptCount_", "lastResponseCode_", "lastErrorCode_", "lastAttemptWasHttps_",};
                    java.lang.String info = "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u1004\u0000\u0002" + "\u1004\u0001\u0003\u1004\u0002\u0004\u1007\u0003";
                    return newMessageInfo(DEFAULT_INSTANCE, info, objects);
                }
                // fall through
                case GET_DEFAULT_INSTANCE: {
                    return DEFAULT_INSTANCE;
                }
                case GET_PARSER: {
                    com.google.protobuf.Parser<org.chromium.components.metrics.ReportingInfoOuterClass.ReportingInfo> parser = PARSER;
                    if (parser == null) {
                        synchronized (org.chromium.components.metrics.ReportingInfoOuterClass.ReportingInfo.class) {
                            parser = PARSER;
                            if (parser == null) {
                                parser = new DefaultInstanceBasedParser<org.chromium.components.metrics.ReportingInfoOuterClass.ReportingInfo>(DEFAULT_INSTANCE);
                                PARSER = parser;
                            }
                        }
                    }
                    return parser;
                }
                case GET_MEMOIZED_IS_INITIALIZED: {
                    return (byte) 1;
                }
                case SET_MEMOIZED_IS_INITIALIZED: {
                    return null;
                }
            }
            throw new UnsupportedOperationException();
        }


        // @@protoc_insertion_point(class_scope:metrics.ReportingInfo)
        private static final org.chromium.components.metrics.ReportingInfoOuterClass.ReportingInfo DEFAULT_INSTANCE;

        static {
            ReportingInfo defaultInstance = new ReportingInfo();
            // New instances are implicitly immutable so no need to make
            // immutable.
            DEFAULT_INSTANCE = defaultInstance;
            com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(ReportingInfo.class, defaultInstance);
        }

        public static org.chromium.components.metrics.ReportingInfoOuterClass.ReportingInfo getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        private static volatile com.google.protobuf.Parser<ReportingInfo> PARSER;

        public static com.google.protobuf.Parser<ReportingInfo> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }
    }


    static {
    }

    // @@protoc_insertion_point(outer_class_scope)
}