// Copyright 2015 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.
package org.chromium.ui

import org.chromium.base.annotations.CalledByNative

/**
 * Simple interface allowing customized response to an overscrolling pull input.
 */
interface OverscrollRefreshHandler {
    /**
     * Signals the start of an overscrolling pull.
     * @param type Type of the overscroll action.
     * @param startX X position of touch event at the beginning of overscroll.
     * @param startY Y position of touch event at the beginning of overscroll.
     * @param navigateForward `true` for forward navigation, `false` for back.
     * Used only for [OverscrollAction.HISTORY_NAVIGATION].
     * @return Whether the handler will consume the overscroll sequence.
     */
    @CalledByNative
    fun start(
        @OverscrollAction type: Int, startX: Float, startY: Float, navigateForward: Boolean
    ): Boolean

    /**
     * Signals a pull update.
     * @param xDelta The change in horizontal pull distance (positive if pulling down, negative if
     * up).
     * @param yDelta The change in vertical pull distance.
     */
    @CalledByNative
    fun pull(xDelta: Float, yDelta: Float)

    /**
     * Signals the release of the pull.
     * @param allowRefresh Whether the release signal should be allowed to trigger a refresh.
     */
    @CalledByNative
    fun release(allowRefresh: Boolean)

    /**
     * Reset the active pull state.
     */
    @CalledByNative
    fun reset()

    /**
     * Toggle whether the effect is active.
     * @param enabled Whether to enable the effect.
     * If disabled, the effect should deactive itself apropriately.
     */
    fun setEnabled(enabled: Boolean)
}