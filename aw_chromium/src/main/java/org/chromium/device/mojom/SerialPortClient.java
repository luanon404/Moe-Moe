// SerialPortClient.java is auto generated by mojom_bindings_generator.py, do not edit


// Copyright 2014 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

// This file is autogenerated by:
//     mojo/public/tools/bindings/mojom_bindings_generator.py
// For:
//     services/device/public/mojom/serial.mojom
//

package org.chromium.device.mojom;


public interface SerialPortClient extends org.chromium.mojo.bindings.Interface {



    interface Proxy extends SerialPortClient, org.chromium.mojo.bindings.Interface.Proxy {
    }

    Manager<SerialPortClient, SerialPortClient.Proxy> MANAGER = SerialPortClient_Internal.MANAGER;


    void onReadError(
int error);



    void onSendError(
int error);


}
