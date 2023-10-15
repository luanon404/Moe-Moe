// Copyright 2021 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.
package org.chromium.services.network

/**
 * Contains features that are specific to Network Service.
 */
object NetworkServiceFeatures {

    // Enables preprocessing requests with the Trust Tokens API Fetch flags set,
    // and handling their responses, according to the protocol.
    // (See https://github.com/WICG/trust-token-api.)
    const val TRUST_TOKENS = "TrustTokens"

}