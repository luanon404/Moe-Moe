// CompositingModeReporter.java is auto generated by mojom_bindings_generator.py, do not edit


// Copyright 2014 The Chromium Authors
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

// This file is autogenerated by:
//     mojo/public/tools/bindings/mojom_bindings_generator.py
// For:
//     services/viz/public/mojom/compositing/compositing_mode_watcher.mojom
//

package org.chromium.viz.mojom;

public interface CompositingModeReporter extends org.chromium.mojo.bindings.Interface {


    interface Proxy extends CompositingModeReporter, org.chromium.mojo.bindings.Interface.Proxy {
    }

    Manager<CompositingModeReporter, CompositingModeReporter.Proxy> MANAGER = CompositingModeReporter_Internal.MANAGER;

    void addCompositingModeWatcher(CompositingModeWatcher watcher);


}