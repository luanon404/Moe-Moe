// MediaStreamRequestResult.java is auto generated by mojom_bindings_generator.py, do not edit


// Copyright 2014 The Chromium Authors
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

// This file is autogenerated by:
//     mojo/public/tools/bindings/mojom_bindings_generator.py
// For:
//     third_party/blink/public/mojom/mediastream/media_stream.mojom
//

package org.chromium.blink.mojom;

import androidx.annotation.IntDef;

public final class MediaStreamRequestResult {
    private static final boolean IS_EXTENSIBLE = false;
    @IntDef({

        MediaStreamRequestResult.OK,
        MediaStreamRequestResult.PERMISSION_DENIED,
        MediaStreamRequestResult.PERMISSION_DISMISSED,
        MediaStreamRequestResult.INVALID_STATE,
        MediaStreamRequestResult.NO_HARDWARE,
        MediaStreamRequestResult.INVALID_SECURITY_ORIGIN,
        MediaStreamRequestResult.TAB_CAPTURE_FAILURE,
        MediaStreamRequestResult.SCREEN_CAPTURE_FAILURE,
        MediaStreamRequestResult.CAPTURE_FAILURE,
        MediaStreamRequestResult.CONSTRAINT_NOT_SATISFIED,
        MediaStreamRequestResult.TRACK_START_FAILURE_AUDIO,
        MediaStreamRequestResult.TRACK_START_FAILURE_VIDEO,
        MediaStreamRequestResult.NOT_SUPPORTED,
        MediaStreamRequestResult.FAILED_DUE_TO_SHUTDOWN,
        MediaStreamRequestResult.KILL_SWITCH_ON,
        MediaStreamRequestResult.SYSTEM_PERMISSION_DENIED,
        MediaStreamRequestResult.DEVICE_IN_USE,
        MediaStreamRequestResult.NUM_MEDIA_REQUEST_RESULTS})
    public @interface EnumType {}

    public static final int OK = 0;
    public static final int PERMISSION_DENIED = 1;
    public static final int PERMISSION_DISMISSED = 2;
    public static final int INVALID_STATE = 3;
    public static final int NO_HARDWARE = 4;
    public static final int INVALID_SECURITY_ORIGIN = 5;
    public static final int TAB_CAPTURE_FAILURE = 6;
    public static final int SCREEN_CAPTURE_FAILURE = 7;
    public static final int CAPTURE_FAILURE = 8;
    public static final int CONSTRAINT_NOT_SATISFIED = 9;
    public static final int TRACK_START_FAILURE_AUDIO = 10;
    public static final int TRACK_START_FAILURE_VIDEO = 11;
    public static final int NOT_SUPPORTED = 12;
    public static final int FAILED_DUE_TO_SHUTDOWN = 13;
    public static final int KILL_SWITCH_ON = 14;
    public static final int SYSTEM_PERMISSION_DENIED = 15;
    public static final int DEVICE_IN_USE = 16;
    public static final int NUM_MEDIA_REQUEST_RESULTS = 17;
    public static final int MIN_VALUE = 0;
    public static final int MAX_VALUE = 17;

    public static boolean isKnownValue(int value) {
        return value >= 0 && value <= 17;
    }

    public static void validate(int value) {
        if (IS_EXTENSIBLE || isKnownValue(value)) return;
        throw new org.chromium.mojo.bindings.DeserializationException("Invalid enum value.");
    }

    public static int toKnownValue(int value) {
      return value;
    }

    private MediaStreamRequestResult() {}
}