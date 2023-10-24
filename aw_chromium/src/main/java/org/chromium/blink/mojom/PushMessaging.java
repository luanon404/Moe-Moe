// PushMessaging.java is auto generated by mojom_bindings_generator.py, do not edit


// Copyright 2014 The Chromium Authors
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

// This file is autogenerated by:
//     mojo/public/tools/bindings/mojom_bindings_generator.py
// For:
//     third_party/blink/public/mojom/push_messaging/push_messaging.mojom
//

package org.chromium.blink.mojom;


public interface PushMessaging extends org.chromium.mojo.bindings.Interface {



    interface Proxy extends PushMessaging, org.chromium.mojo.bindings.Interface.Proxy {
    }

    Manager<PushMessaging, PushMessaging.Proxy> MANAGER = PushMessaging_Internal.MANAGER;

    void subscribe(
long serviceWorkerRegistrationId, PushSubscriptionOptions options, boolean userGesture, 
Subscribe_Response callback);

    interface Subscribe_Response extends org.chromium.mojo.bindings.Callbacks.Callback2<Integer, PushSubscription> { }


    void unsubscribe(
long serviceWorkerRegistrationId, 
Unsubscribe_Response callback);

    interface Unsubscribe_Response extends org.chromium.mojo.bindings.Callbacks.Callback3<Integer, Boolean, String> { }


    void getSubscription(
long serviceWorkerRegistrationId, 
GetSubscription_Response callback);

    interface GetSubscription_Response extends org.chromium.mojo.bindings.Callbacks.Callback2<Integer, PushSubscription> { }


}