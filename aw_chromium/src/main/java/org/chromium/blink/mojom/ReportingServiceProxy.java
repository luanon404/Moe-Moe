// ReportingServiceProxy.java is auto generated by mojom_bindings_generator.py, do not edit


// Copyright 2014 The Chromium Authors
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

// This file is autogenerated by:
//     mojo/public/tools/bindings/mojom_bindings_generator.py
// For:
//     third_party/blink/public/mojom/reporting/reporting.mojom
//

package org.chromium.blink.mojom;


public interface ReportingServiceProxy extends org.chromium.mojo.bindings.Interface {



    interface Proxy extends ReportingServiceProxy, org.chromium.mojo.bindings.Interface.Proxy {
    }

    Manager<ReportingServiceProxy, ReportingServiceProxy.Proxy> MANAGER = ReportingServiceProxy_Internal.MANAGER;

    void queueInterventionReport(
org.chromium.url.mojom.Url url, String id, String message, String sourceFile, int lineNumber, int columnNumber);


    void queueDeprecationReport(
org.chromium.url.mojom.Url url, String id, org.chromium.mojo_base.mojom.Time anticipatedRemoval, String message, String sourceFile, int lineNumber, int columnNumber);


    void queueCspViolationReport(
org.chromium.url.mojom.Url url, String group, String documentUrl, String referrer, String blockedUrl, String effectiveDirective, String originalPolicy, String sourceFile, String scriptSample, String disposition, short statusCode, int lineNumber, int columnNumber);


    void queuePermissionsPolicyViolationReport(
org.chromium.url.mojom.Url url, String endpoint, String policyId, String disposition, String message, String sourceFile, int lineNumber, int columnNumber);


    void queueDocumentPolicyViolationReport(
org.chromium.url.mojom.Url url, String group, String policyId, String disposition, String message, String sourceFile, int lineNumber, int columnNumber);


}