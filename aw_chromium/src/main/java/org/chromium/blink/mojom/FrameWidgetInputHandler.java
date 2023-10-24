// FrameWidgetInputHandler.java is auto generated by mojom_bindings_generator.py, do not edit


// Copyright 2014 The Chromium Authors
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

// This file is autogenerated by:
//     mojo/public/tools/bindings/mojom_bindings_generator.py
// For:
//     third_party/blink/public/mojom/input/input_handler.mojom
//

package org.chromium.blink.mojom;


public interface FrameWidgetInputHandler extends org.chromium.mojo.bindings.Interface {



    interface Proxy extends FrameWidgetInputHandler, org.chromium.mojo.bindings.Interface.Proxy {
    }

    Manager<FrameWidgetInputHandler, FrameWidgetInputHandler.Proxy> MANAGER = FrameWidgetInputHandler_Internal.MANAGER;

    void addImeTextSpansToExistingText(
int start, int end, org.chromium.ui.mojom.ImeTextSpan[] imeTextSpans);


    void clearImeTextSpansByType(
int start, int end, int type);


    void setCompositionFromExistingText(
int start, int end, org.chromium.ui.mojom.ImeTextSpan[] imeTextSpans);


    void extendSelectionAndDelete(
int before, int after);


    void extendSelectionAndReplace(
int before, int after, org.chromium.mojo_base.mojom.String16 replacementText);


    void deleteSurroundingText(
int before, int after);


    void deleteSurroundingTextInCodePoints(
int before, int after);


    void setEditableSelectionOffsets(
int start, int end);


    void handleStylusWritingGestureAction(
StylusWritingGestureData gestureData, 
HandleStylusWritingGestureAction_Response callback);

    interface HandleStylusWritingGestureAction_Response extends org.chromium.mojo.bindings.Callbacks.Callback1<Integer> { }


    void executeEditCommand(
String command, org.chromium.mojo_base.mojom.String16 value);


    void undo(
);


    void redo(
);


    void cut(
);


    void copy(
);


    void copyToFindPboard(
);


    void centerSelection(
);


    void paste(
);


    void pasteAndMatchStyle(
);


    void delete(
);


    void selectAll(
);


    void collapseSelection(
);


    void replace(
org.chromium.mojo_base.mojom.String16 word);


    void replaceMisspelling(
org.chromium.mojo_base.mojom.String16 word);


    void selectRange(
org.chromium.gfx.mojom.Point base, org.chromium.gfx.mojom.Point extent);


    void adjustSelectionByCharacterOffset(
int start, int end, int behavior);


    void selectAroundCaret(
int granularity, boolean shouldShowHandle, boolean shouldShowContextMenu, 
SelectAroundCaret_Response callback);

    interface SelectAroundCaret_Response extends org.chromium.mojo.bindings.Callbacks.Callback1<SelectAroundCaretResult> { }


    void moveRangeSelectionExtent(
org.chromium.gfx.mojom.Point extent);


    void scrollFocusedEditableNodeIntoView(
);


    void waitForPageScaleAnimationForTesting(

WaitForPageScaleAnimationForTesting_Response callback);

    interface WaitForPageScaleAnimationForTesting_Response extends org.chromium.mojo.bindings.Callbacks.Callback0 { }


    void moveCaret(
org.chromium.gfx.mojom.Point point);


}