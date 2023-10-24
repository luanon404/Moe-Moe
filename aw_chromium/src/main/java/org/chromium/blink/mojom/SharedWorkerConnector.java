// SharedWorkerConnector.java is auto generated by mojom_bindings_generator.py, do not edit


// Copyright 2014 The Chromium Authors
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

// This file is autogenerated by:
//     mojo/public/tools/bindings/mojom_bindings_generator.py
// For:
//     third_party/blink/public/mojom/worker/shared_worker_connector.mojom
//

package org.chromium.blink.mojom;


public interface SharedWorkerConnector extends org.chromium.mojo.bindings.Interface {



    interface Proxy extends SharedWorkerConnector, org.chromium.mojo.bindings.Interface.Proxy {
    }

    Manager<SharedWorkerConnector, SharedWorkerConnector.Proxy> MANAGER = SharedWorkerConnector_Internal.MANAGER;

    void connect(
SharedWorkerInfo info, SharedWorkerClient client, int creationContextType, MessagePortDescriptor messagePort, BlobUrlToken blobUrlToken, long clientUkmSourceId);


}