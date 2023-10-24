// HostResolver.java is auto generated by mojom_bindings_generator.py, do not edit


// Copyright 2014 The Chromium Authors
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

// This file is autogenerated by:
//     mojo/public/tools/bindings/mojom_bindings_generator.py
// For:
//     services/network/public/mojom/host_resolver.mojom
//

package org.chromium.network.mojom;

public interface HostResolver extends org.chromium.mojo.bindings.Interface {


    interface Proxy extends HostResolver, org.chromium.mojo.bindings.Interface.Proxy {
    }

    Manager<HostResolver, HostResolver.Proxy> MANAGER = HostResolver_Internal.MANAGER;

    void resolveHost(HostResolverHost host, NetworkAnonymizationKey networkAnonymizationKey, ResolveHostParameters optionalParameters, ResolveHostClient responseClient);


    void mdnsListen(HostPortPair host, int queryType, MdnsListenClient responseClient, MdnsListen_Response callback);

    interface MdnsListen_Response extends org.chromium.mojo.bindings.Callbacks.Callback1<Integer> {
    }


}