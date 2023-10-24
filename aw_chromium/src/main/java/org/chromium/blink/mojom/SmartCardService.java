// SmartCardService.java is auto generated by mojom_bindings_generator.py, do not edit


// Copyright 2014 The Chromium Authors
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

// This file is autogenerated by:
//     mojo/public/tools/bindings/mojom_bindings_generator.py
// For:
//     third_party/blink/public/mojom/smart_card/smart_card.mojom
//

package org.chromium.blink.mojom;


public interface SmartCardService extends org.chromium.mojo.bindings.Interface {



    interface Proxy extends SmartCardService, org.chromium.mojo.bindings.Interface.Proxy {
    }

    Manager<SmartCardService, SmartCardService.Proxy> MANAGER = SmartCardService_Internal.MANAGER;

    void createContext(

CreateContext_Response callback);

    interface CreateContext_Response extends org.chromium.mojo.bindings.Callbacks.Callback1<org.chromium.device.mojom.SmartCardCreateContextResult> { }


}