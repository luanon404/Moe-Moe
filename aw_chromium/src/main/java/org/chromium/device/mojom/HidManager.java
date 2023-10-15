// HidManager.java is auto generated by mojom_bindings_generator.py, do not edit


// Copyright 2014 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

// This file is autogenerated by:
//     mojo/public/tools/bindings/mojom_bindings_generator.py
// For:
//     services/device/public/mojom/hid.mojom
//

package org.chromium.device.mojom;


public interface HidManager extends org.chromium.mojo.bindings.Interface {



    interface Proxy extends HidManager, org.chromium.mojo.bindings.Interface.Proxy {
    }

    Manager<HidManager, HidManager.Proxy> MANAGER = HidManager_Internal.MANAGER;


    void getDevicesAndSetClient(
org.chromium.mojo.bindings.AssociatedInterfaceNotSupported client, 
GetDevicesAndSetClientResponse callback);

    interface GetDevicesAndSetClientResponse extends org.chromium.mojo.bindings.Callbacks.Callback1<HidDeviceInfo[]> { }



    void getDevices(

GetDevicesResponse callback);

    interface GetDevicesResponse extends org.chromium.mojo.bindings.Callbacks.Callback1<HidDeviceInfo[]> { }



    void connect(
String deviceGuid, HidConnectionClient connectionClient, HidConnectionWatcher watcher, boolean allowProtectedReports, 
ConnectResponse callback);

    interface ConnectResponse extends org.chromium.mojo.bindings.Callbacks.Callback1<HidConnection> { }



    void addReceiver(
org.chromium.mojo.bindings.InterfaceRequest<HidManager> receiver);


}
