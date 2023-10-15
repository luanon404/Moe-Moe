// TextDetection.java is auto generated by mojom_bindings_generator.py, do not edit


// Copyright 2014 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

// This file is autogenerated by:
//     mojo/public/tools/bindings/mojom_bindings_generator.py
// For:
//     services/shape_detection/public/mojom/textdetection.mojom
//

package org.chromium.shape_detection.mojom;


public interface TextDetection extends org.chromium.mojo.bindings.Interface {



    interface Proxy extends TextDetection, org.chromium.mojo.bindings.Interface.Proxy {
    }

    Manager<TextDetection, TextDetection.Proxy> MANAGER = TextDetection_Internal.MANAGER;


    void detect(
org.chromium.skia.mojom.BitmapN32 bitmapData, 
DetectResponse callback);

    interface DetectResponse extends org.chromium.mojo.bindings.Callbacks.Callback1<TextDetectionResult[]> { }


}
