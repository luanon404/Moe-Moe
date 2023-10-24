// ProxyConfigClient.java is auto generated by mojom_bindings_generator.py, do not edit


// Copyright 2014 The Chromium Authors
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

// This file is autogenerated by:
//     mojo/public/tools/bindings/mojom_bindings_generator.py
// For:
//     services/network/public/mojom/proxy_config_with_annotation.mojom
//

package org.chromium.network.mojom;

public interface ProxyConfigClient extends org.chromium.mojo.bindings.Interface {


    interface Proxy extends ProxyConfigClient, org.chromium.mojo.bindings.Interface.Proxy {
    }

    Manager<ProxyConfigClient, ProxyConfigClient.Proxy> MANAGER = ProxyConfigClient_Internal.MANAGER;

    void onProxyConfigUpdated(ProxyConfigWithAnnotation proxyConfig);


    void flushProxyConfig(

            FlushProxyConfig_Response callback);

    interface FlushProxyConfig_Response extends org.chromium.mojo.bindings.Callbacks.Callback0 {
    }


}