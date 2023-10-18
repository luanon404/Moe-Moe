// Copyright 2020 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.
package org.chromium.base.process_launcher

/** Interface representing a connection to the Android service. Can be mocked in unit-tests.  */ /* package */
internal interface ChildServiceConnection {
    fun bindServiceConnection(): Boolean
    fun unbindServiceConnection()
    val isBound: Boolean
    fun updateGroupImportance(group: Int, importanceInGroup: Int)
    fun retire()
}