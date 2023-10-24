// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: omnibox_focus_type.proto

package org.chromium.components.metrics;

public final class OmniboxFocusTypeProtos {
    private OmniboxFocusTypeProtos() {
    }

    public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {
    }

    /**
     * <pre>
     * For search requests, this enum specifies how the user last interacted with
     * the UI control. This is used for both the omnibox and NTP realbox.
     * It is somewhat of a misnomer to call it OmniboxFocusType, since the enum now
     * covers UI interactions unrelated to focus. But we are keeping the old name to
     * match the "oft" CGI param.
     * These values are used as HTTP CGI parameter values. Entries should not be
     * renumbered and numeric values should never be reused.
     * </pre>
     * <p>
     * Protobuf enum {@code metrics.OmniboxFocusType}
     */
    public enum OmniboxFocusType implements com.google.protobuf.Internal.EnumLite {
        /**
         * <pre>
         * The default value. This is used for any search requests without any
         * special interaction annotation, including: normal omnibox searches,
         * as-you-type omnibox suggestions, as well as non-omnibox searches.
         * </pre>
         *
         * <code>INTERACTION_DEFAULT = 0;</code>
         */
        INTERACTION_DEFAULT(0),
        /**
         * <pre>
         * This search request is triggered by the user focusing the omnibox.
         * </pre>
         *
         * <code>INTERACTION_FOCUS = 1;</code>
         */
        INTERACTION_FOCUS(1),
        /**
         * <pre>
         * This search request is triggered by the user deleting all of the
         * omnibox permanent text at once, i.e. user is on "https://example.com",
         * does Ctrl+L which selects the whole URL, then presses Backspace.
         * Note that INTERACTION_CLOBBER applies in fairly limited circumstances. For
         * example, the following cases do NOT qualify and are instead marked as
         * INTERACTION_DEFAULT:
         *  - User deletes their own typed text.
         *  - User deletes the permanent text one character at a time.
         *  - User uses Cut (Ctrl+X) to delete the permanent text.
         * </pre>
         *
         * <code>INTERACTION_CLOBBER = 2;</code>
         */
        INTERACTION_CLOBBER(2),
        ;

        /**
         * <pre>
         * The default value. This is used for any search requests without any
         * special interaction annotation, including: normal omnibox searches,
         * as-you-type omnibox suggestions, as well as non-omnibox searches.
         * </pre>
         *
         * <code>INTERACTION_DEFAULT = 0;</code>
         */
        public static final int INTERACTION_DEFAULT_VALUE = 0;
        /**
         * <pre>
         * This search request is triggered by the user focusing the omnibox.
         * </pre>
         *
         * <code>INTERACTION_FOCUS = 1;</code>
         */
        public static final int INTERACTION_FOCUS_VALUE = 1;
        /**
         * <pre>
         * This search request is triggered by the user deleting all of the
         * omnibox permanent text at once, i.e. user is on "https://example.com",
         * does Ctrl+L which selects the whole URL, then presses Backspace.
         * Note that INTERACTION_CLOBBER applies in fairly limited circumstances. For
         * example, the following cases do NOT qualify and are instead marked as
         * INTERACTION_DEFAULT:
         *  - User deletes their own typed text.
         *  - User deletes the permanent text one character at a time.
         *  - User uses Cut (Ctrl+X) to delete the permanent text.
         * </pre>
         *
         * <code>INTERACTION_CLOBBER = 2;</code>
         */
        public static final int INTERACTION_CLOBBER_VALUE = 2;


        @java.lang.Override
        public final int getNumber() {
            return value;
        }

        /**
         * @param value The number of the enum to look for.
         * @return The enum associated with the given number.
         * @deprecated Use {@link #forNumber(int)} instead.
         */
        @java.lang.Deprecated
        public static OmniboxFocusType valueOf(int value) {
            return forNumber(value);
        }

        public static OmniboxFocusType forNumber(int value) {
            switch (value) {
                case 0:
                    return INTERACTION_DEFAULT;
                case 1:
                    return INTERACTION_FOCUS;
                case 2:
                    return INTERACTION_CLOBBER;
                default:
                    return null;
            }
        }

        public static com.google.protobuf.Internal.EnumLiteMap<OmniboxFocusType> internalGetValueMap() {
            return internalValueMap;
        }

        private static final com.google.protobuf.Internal.EnumLiteMap<OmniboxFocusType> internalValueMap = new com.google.protobuf.Internal.EnumLiteMap<OmniboxFocusType>() {
            @java.lang.Override
            public OmniboxFocusType findValueByNumber(int number) {
                return OmniboxFocusType.forNumber(number);
            }
        };

        public static com.google.protobuf.Internal.EnumVerifier internalGetVerifier() {
            return OmniboxFocusTypeVerifier.INSTANCE;
        }

        private static final class OmniboxFocusTypeVerifier implements com.google.protobuf.Internal.EnumVerifier {
            static final com.google.protobuf.Internal.EnumVerifier INSTANCE = new OmniboxFocusTypeVerifier();

            @java.lang.Override
            public boolean isInRange(int number) {
                return OmniboxFocusType.forNumber(number) != null;
            }
        }

        private final int value;

        OmniboxFocusType(int value) {
            this.value = value;
        }

        // @@protoc_insertion_point(enum_scope:metrics.OmniboxFocusType)
    }


    static {
    }

    // @@protoc_insertion_point(outer_class_scope)
}