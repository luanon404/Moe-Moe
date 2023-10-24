// SmartCardError.java is auto generated by mojom_bindings_generator.py, do not edit


// Copyright 2014 The Chromium Authors
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

// This file is autogenerated by:
//     mojo/public/tools/bindings/mojom_bindings_generator.py
// For:
//     services/device/public/mojom/smart_card.mojom
//

package org.chromium.device.mojom;

import androidx.annotation.IntDef;

public final class SmartCardError {
    private static final boolean IS_EXTENSIBLE = false;

    @IntDef({SmartCardError.REMOVED_CARD, SmartCardError.RESET_CARD, SmartCardError.UNPOWERED_CARD, SmartCardError.UNRESPONSIVE_CARD, SmartCardError.UNSUPPORTED_CARD, SmartCardError.READER_UNAVAILABLE, SmartCardError.SHARING_VIOLATION, SmartCardError.NOT_TRANSACTED, SmartCardError.NO_SMARTCARD, SmartCardError.PROTO_MISMATCH, SmartCardError.SYSTEM_CANCELLED, SmartCardError.NOT_READY, SmartCardError.CANCELLED, SmartCardError.INSUFFICIENT_BUFFER, SmartCardError.INVALID_HANDLE, SmartCardError.INVALID_PARAMETER, SmartCardError.INVALID_VALUE, SmartCardError.NO_MEMORY, SmartCardError.TIMEOUT, SmartCardError.UNKNOWN_READER, SmartCardError.UNSUPPORTED_FEATURE, SmartCardError.NO_READERS_AVAILABLE, SmartCardError.SERVICE_STOPPED, SmartCardError.NO_SERVICE, SmartCardError.COMM_ERROR, SmartCardError.INTERNAL_ERROR, SmartCardError.UNKNOWN_ERROR, SmartCardError.SERVER_TOO_BUSY, SmartCardError.UNEXPECTED, SmartCardError.SHUTDOWN, SmartCardError.UNKNOWN})
    public @interface EnumType {
    }

    public static final int REMOVED_CARD = 0;
    public static final int RESET_CARD = 1;
    public static final int UNPOWERED_CARD = 2;
    public static final int UNRESPONSIVE_CARD = 3;
    public static final int UNSUPPORTED_CARD = 4;
    public static final int READER_UNAVAILABLE = 5;
    public static final int SHARING_VIOLATION = 6;
    public static final int NOT_TRANSACTED = 7;
    public static final int NO_SMARTCARD = 8;
    public static final int PROTO_MISMATCH = 9;
    public static final int SYSTEM_CANCELLED = 10;
    public static final int NOT_READY = 11;
    public static final int CANCELLED = 12;
    public static final int INSUFFICIENT_BUFFER = 13;
    public static final int INVALID_HANDLE = 14;
    public static final int INVALID_PARAMETER = 15;
    public static final int INVALID_VALUE = 16;
    public static final int NO_MEMORY = 17;
    public static final int TIMEOUT = 18;
    public static final int UNKNOWN_READER = 19;
    public static final int UNSUPPORTED_FEATURE = 20;
    public static final int NO_READERS_AVAILABLE = 21;
    public static final int SERVICE_STOPPED = 22;
    public static final int NO_SERVICE = 23;
    public static final int COMM_ERROR = 24;
    public static final int INTERNAL_ERROR = 25;
    public static final int UNKNOWN_ERROR = 26;
    public static final int SERVER_TOO_BUSY = 27;
    public static final int UNEXPECTED = 28;
    public static final int SHUTDOWN = 29;
    public static final int UNKNOWN = 30;
    public static final int MIN_VALUE = 0;
    public static final int MAX_VALUE = 30;

    public static boolean isKnownValue(int value) {
        return value >= 0 && value <= 30;
    }

    public static void validate(int value) {
        if (IS_EXTENSIBLE || isKnownValue(value)) return;
        throw new org.chromium.mojo.bindings.DeserializationException("Invalid enum value.");
    }

    public static int toKnownValue(int value) {
        return value;
    }

    private SmartCardError() {
    }
}