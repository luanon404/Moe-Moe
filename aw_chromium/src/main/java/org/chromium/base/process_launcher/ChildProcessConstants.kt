// Copyright 2017 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.
package org.chromium.base.process_launcher

/**
 * Constants to be used by child processes.
 */
interface ChildProcessConstants {
    companion object {
        // Below are the names for the items placed in the bind or start command intent.
        // Note that because that intent maybe reused if a service is restarted, none should be process
        // specific.
        const val EXTRA_BIND_TO_CALLER = "org.chromium.base.process_launcher.extra.bind_to_caller"

        // Below are the names for the items placed in the Bundle passed in the
        // IChildProcessService.setupConnection call, once the connection has been established.
        // Key for the command line.
        const val EXTRA_COMMAND_LINE = "org.chromium.base.process_launcher.extra.command_line"

        // Key for the file descriptors that should be mapped in the child process.
        const val EXTRA_FILES = "org.chromium.base.process_launcher.extra.extraFiles"

        // Key for the browser package name.
        const val EXTRA_BROWSER_PACKAGE_NAME =
            "org.chromium.base.process_launcher.extra.browser_package_name"
    }
}