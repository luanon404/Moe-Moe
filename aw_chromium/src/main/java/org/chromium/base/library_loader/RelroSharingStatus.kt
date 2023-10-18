// Copyright 2021 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.
// This file is autogenerated by
//     java_cpp_enum.py
// From
//     ../../base/android/linker/modern_linker_jni.h
package org.chromium.base.library_loader

import androidx.annotation.IntDef
import org.chromium.base.library_loader.RelroSharingStatus

@IntDef(
    RelroSharingStatus.NOT_ATTEMPTED,
    RelroSharingStatus.SHARED,
    RelroSharingStatus.NOT_IDENTICAL,
    RelroSharingStatus.COUNT
)
@Retention(
    AnnotationRetention.SOURCE
)
annotation class RelroSharingStatus {
    companion object {
        const val NOT_ATTEMPTED = 0
        const val SHARED = 1
        const val NOT_IDENTICAL = 2
        const val COUNT = 3
    }
}