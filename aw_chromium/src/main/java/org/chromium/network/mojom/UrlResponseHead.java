// UrlResponseHead.java is auto generated by mojom_bindings_generator.py, do not edit


// Copyright 2014 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

// This file is autogenerated by:
//     mojo/public/tools/bindings/mojom_bindings_generator.py
// For:
//     services/network/public/mojom/url_response_head.mojom
//

package org.chromium.network.mojom;


public final class UrlResponseHead extends org.chromium.mojo.bindings.Struct {

    private static final int STRUCT_SIZE = 256;
    private static final org.chromium.mojo.bindings.DataHeader[] VERSION_ARRAY = new org.chromium.mojo.bindings.DataHeader[] {new org.chromium.mojo.bindings.DataHeader(256, 0)};
    private static final org.chromium.mojo.bindings.DataHeader DEFAULT_STRUCT_INFO = VERSION_ARRAY[0];
    public org.chromium.mojo_base.mojom.Time requestTime;
    public org.chromium.mojo_base.mojom.Time responseTime;
    public HttpResponseHeaders headers;
    public String mimeType;
    public String charset;
    public int ctPolicyCompliance;
    public long contentLength;
    public long encodedDataLength;
    public long encodedBodyLength;
    public boolean networkAccessed;
    public long appcacheId;
    public org.chromium.url.mojom.Url appcacheManifestUrl;
    public LoadTimingInfo loadTiming;
    public HttpRawRequestResponseInfo rawRequestResponseInfo;
    public boolean wasFetchedViaSpdy;
    public boolean wasAlpnNegotiated;
    public boolean wasAlternateProtocolAvailable;
    public int connectionInfo;
    public String alpnNegotiatedProtocol;
    public IpEndPoint remoteEndpoint;
    public boolean isValidated;
    public boolean wasFetchedViaCache;
    public org.chromium.proxy_resolver.mojom.ProxyServer proxyServer;
    public boolean wasFetchedViaServiceWorker;
    public int serviceWorkerResponseSource;
    public org.chromium.url.mojom.Url[] urlListViaServiceWorker;
    public int responseType;
    public long padding;
    public String cacheStorageCacheName;
    public int certStatus;
    public SslInfo sslInfo;
    public String[] corsExposedHeaderNames;
    public boolean didServiceWorkerNavigationPreload;
    public boolean shouldReportCorbBlocking;
    public boolean asyncRevalidationRequested;
    public boolean didMimeSniff;
    public boolean isSignedExchangeInnerResponse;
    public boolean wasInPrefetchCache;
    public boolean wasCookieInRequest;
    public boolean interceptedByPlugin;
    public boolean isLegacyTlsVersion;
    public boolean hasRangeRequested;
    public boolean timingAllowPassed;
    public AuthChallengeInfo authChallengeInfo;
    public org.chromium.mojo_base.mojom.TimeTicks requestStart;
    public org.chromium.mojo_base.mojom.TimeTicks responseStart;
    public ParsedHeaders parsedHeaders;
    public OriginPolicy originPolicy;
    public org.chromium.mojo_base.mojom.UnguessableToken recursivePrefetchToken;
    public String[] dnsAliases;
    public org.chromium.url.mojom.Url webBundleUrl;
    public boolean hasAuthorizationCoveredByWildcardOnPreflight;

    private UrlResponseHead(int version) {
        super(STRUCT_SIZE, version);
        this.contentLength = -1;
        this.encodedDataLength = -1;
        this.encodedBodyLength = -1;
        this.networkAccessed = false;
        this.appcacheId = 0;
        this.wasFetchedViaSpdy = false;
        this.wasAlpnNegotiated = false;
        this.wasAlternateProtocolAvailable = false;
        this.isValidated = false;
        this.wasFetchedViaCache = false;
        this.wasFetchedViaServiceWorker = false;
        this.serviceWorkerResponseSource = FetchResponseSource.UNSPECIFIED;
        this.responseType = FetchResponseType.DEFAULT;
        this.padding = 0;
        this.certStatus = 0;
        this.didServiceWorkerNavigationPreload = false;
        this.shouldReportCorbBlocking = false;
        this.asyncRevalidationRequested = false;
        this.didMimeSniff = false;
        this.isSignedExchangeInnerResponse = false;
        this.wasInPrefetchCache = false;
        this.wasCookieInRequest = false;
        this.interceptedByPlugin = false;
        this.isLegacyTlsVersion = false;
        this.hasRangeRequested = false;
        this.timingAllowPassed = false;
        this.hasAuthorizationCoveredByWildcardOnPreflight = false;
    }

    public UrlResponseHead() {
        this(0);
    }

    public static UrlResponseHead deserialize(org.chromium.mojo.bindings.Message message) {
        return decode(new org.chromium.mojo.bindings.Decoder(message));
    }

    /**
     * Similar to the method above, but deserializes from a |ByteBuffer| instance.
     *
     * @throws org.chromium.mojo.bindings.DeserializationException on deserialization failure.
     */
    public static UrlResponseHead deserialize(java.nio.ByteBuffer data) {
        return deserialize(new org.chromium.mojo.bindings.Message(
                data, new java.util.ArrayList<org.chromium.mojo.system.Handle>()));
    }

    public static UrlResponseHead decode(org.chromium.mojo.bindings.Decoder decoder0) {
        if (decoder0 == null) {
            return null;
        }
        decoder0.increaseStackDepth();
        UrlResponseHead result;
        try {
            org.chromium.mojo.bindings.DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
            final int elementsOrVersion = mainDataHeader.elementsOrVersion;
            result = new UrlResponseHead(elementsOrVersion);
                {
                    
                org.chromium.mojo.bindings.Decoder decoder1 = decoder0.readPointer(8, false);
                result.requestTime = org.chromium.mojo_base.mojom.Time.decode(decoder1);
                }
                {
                    
                org.chromium.mojo.bindings.Decoder decoder1 = decoder0.readPointer(16, false);
                result.responseTime = org.chromium.mojo_base.mojom.Time.decode(decoder1);
                }
                {
                    
                org.chromium.mojo.bindings.Decoder decoder1 = decoder0.readPointer(24, false);
                result.headers = HttpResponseHeaders.decode(decoder1);
                }
                {
                    
                result.mimeType = decoder0.readString(32, false);
                }
                {
                    
                result.charset = decoder0.readString(40, false);
                }
                {
                    
                result.ctPolicyCompliance = decoder0.readInt(48);
                    CtPolicyCompliance.validate(result.ctPolicyCompliance);
                    result.ctPolicyCompliance = CtPolicyCompliance.toKnownValue(result.ctPolicyCompliance);
                }
                {
                    
                result.networkAccessed = decoder0.readBoolean(52, 0);
                }
                {
                    
                result.wasFetchedViaSpdy = decoder0.readBoolean(52, 1);
                }
                {
                    
                result.wasAlpnNegotiated = decoder0.readBoolean(52, 2);
                }
                {
                    
                result.wasAlternateProtocolAvailable = decoder0.readBoolean(52, 3);
                }
                {
                    
                result.isValidated = decoder0.readBoolean(52, 4);
                }
                {
                    
                result.wasFetchedViaCache = decoder0.readBoolean(52, 5);
                }
                {
                    
                result.wasFetchedViaServiceWorker = decoder0.readBoolean(52, 6);
                }
                {
                    
                result.didServiceWorkerNavigationPreload = decoder0.readBoolean(52, 7);
                }
                {
                    
                result.shouldReportCorbBlocking = decoder0.readBoolean(53, 0);
                }
                {
                    
                result.asyncRevalidationRequested = decoder0.readBoolean(53, 1);
                }
                {
                    
                result.didMimeSniff = decoder0.readBoolean(53, 2);
                }
                {
                    
                result.isSignedExchangeInnerResponse = decoder0.readBoolean(53, 3);
                }
                {
                    
                result.wasInPrefetchCache = decoder0.readBoolean(53, 4);
                }
                {
                    
                result.wasCookieInRequest = decoder0.readBoolean(53, 5);
                }
                {
                    
                result.interceptedByPlugin = decoder0.readBoolean(53, 6);
                }
                {
                    
                result.isLegacyTlsVersion = decoder0.readBoolean(53, 7);
                }
                {
                    
                result.hasRangeRequested = decoder0.readBoolean(54, 0);
                }
                {
                    
                result.timingAllowPassed = decoder0.readBoolean(54, 1);
                }
                {
                    
                result.hasAuthorizationCoveredByWildcardOnPreflight = decoder0.readBoolean(54, 2);
                }
                {
                    
                result.contentLength = decoder0.readLong(56);
                }
                {
                    
                result.encodedDataLength = decoder0.readLong(64);
                }
                {
                    
                result.encodedBodyLength = decoder0.readLong(72);
                }
                {
                    
                result.appcacheId = decoder0.readLong(80);
                }
                {
                    
                org.chromium.mojo.bindings.Decoder decoder1 = decoder0.readPointer(88, false);
                result.appcacheManifestUrl = org.chromium.url.mojom.Url.decode(decoder1);
                }
                {
                    
                org.chromium.mojo.bindings.Decoder decoder1 = decoder0.readPointer(96, false);
                result.loadTiming = LoadTimingInfo.decode(decoder1);
                }
                {
                    
                org.chromium.mojo.bindings.Decoder decoder1 = decoder0.readPointer(104, true);
                result.rawRequestResponseInfo = HttpRawRequestResponseInfo.decode(decoder1);
                }
                {
                    
                result.connectionInfo = decoder0.readInt(112);
                    ConnectionInfo.validate(result.connectionInfo);
                    result.connectionInfo = ConnectionInfo.toKnownValue(result.connectionInfo);
                }
                {
                    
                result.serviceWorkerResponseSource = decoder0.readInt(116);
                    FetchResponseSource.validate(result.serviceWorkerResponseSource);
                    result.serviceWorkerResponseSource = FetchResponseSource.toKnownValue(result.serviceWorkerResponseSource);
                }
                {
                    
                result.alpnNegotiatedProtocol = decoder0.readString(120, false);
                }
                {
                    
                org.chromium.mojo.bindings.Decoder decoder1 = decoder0.readPointer(128, false);
                result.remoteEndpoint = IpEndPoint.decode(decoder1);
                }
                {
                    
                org.chromium.mojo.bindings.Decoder decoder1 = decoder0.readPointer(136, false);
                result.proxyServer = org.chromium.proxy_resolver.mojom.ProxyServer.decode(decoder1);
                }
                {
                    
                org.chromium.mojo.bindings.Decoder decoder1 = decoder0.readPointer(144, false);
                {
                    org.chromium.mojo.bindings.DataHeader si1 = decoder1.readDataHeaderForPointerArray(org.chromium.mojo.bindings.BindingsHelper.UNSPECIFIED_ARRAY_LENGTH);
                    result.urlListViaServiceWorker = new org.chromium.url.mojom.Url[si1.elementsOrVersion];
                    for (int i1 = 0; i1 < si1.elementsOrVersion; ++i1) {
                        
                        org.chromium.mojo.bindings.Decoder decoder2 = decoder1.readPointer(org.chromium.mojo.bindings.DataHeader.HEADER_SIZE + org.chromium.mojo.bindings.BindingsHelper.POINTER_SIZE * i1, false);
                        result.urlListViaServiceWorker[i1] = org.chromium.url.mojom.Url.decode(decoder2);
                    }
                }
                }
                {
                    
                result.responseType = decoder0.readInt(152);
                    FetchResponseType.validate(result.responseType);
                    result.responseType = FetchResponseType.toKnownValue(result.responseType);
                }
                {
                    
                result.certStatus = decoder0.readInt(156);
                }
                {
                    
                result.padding = decoder0.readLong(160);
                }
                {
                    
                result.cacheStorageCacheName = decoder0.readString(168, false);
                }
                {
                    
                org.chromium.mojo.bindings.Decoder decoder1 = decoder0.readPointer(176, true);
                result.sslInfo = SslInfo.decode(decoder1);
                }
                {
                    
                org.chromium.mojo.bindings.Decoder decoder1 = decoder0.readPointer(184, false);
                {
                    org.chromium.mojo.bindings.DataHeader si1 = decoder1.readDataHeaderForPointerArray(org.chromium.mojo.bindings.BindingsHelper.UNSPECIFIED_ARRAY_LENGTH);
                    result.corsExposedHeaderNames = new String[si1.elementsOrVersion];
                    for (int i1 = 0; i1 < si1.elementsOrVersion; ++i1) {
                        
                        result.corsExposedHeaderNames[i1] = decoder1.readString(org.chromium.mojo.bindings.DataHeader.HEADER_SIZE + org.chromium.mojo.bindings.BindingsHelper.POINTER_SIZE * i1, false);
                    }
                }
                }
                {
                    
                org.chromium.mojo.bindings.Decoder decoder1 = decoder0.readPointer(192, true);
                result.authChallengeInfo = AuthChallengeInfo.decode(decoder1);
                }
                {
                    
                org.chromium.mojo.bindings.Decoder decoder1 = decoder0.readPointer(200, false);
                result.requestStart = org.chromium.mojo_base.mojom.TimeTicks.decode(decoder1);
                }
                {
                    
                org.chromium.mojo.bindings.Decoder decoder1 = decoder0.readPointer(208, false);
                result.responseStart = org.chromium.mojo_base.mojom.TimeTicks.decode(decoder1);
                }
                {
                    
                org.chromium.mojo.bindings.Decoder decoder1 = decoder0.readPointer(216, true);
                result.parsedHeaders = ParsedHeaders.decode(decoder1);
                }
                {
                    
                org.chromium.mojo.bindings.Decoder decoder1 = decoder0.readPointer(224, true);
                result.originPolicy = OriginPolicy.decode(decoder1);
                }
                {
                    
                org.chromium.mojo.bindings.Decoder decoder1 = decoder0.readPointer(232, true);
                result.recursivePrefetchToken = org.chromium.mojo_base.mojom.UnguessableToken.decode(decoder1);
                }
                {
                    
                org.chromium.mojo.bindings.Decoder decoder1 = decoder0.readPointer(240, false);
                {
                    org.chromium.mojo.bindings.DataHeader si1 = decoder1.readDataHeaderForPointerArray(org.chromium.mojo.bindings.BindingsHelper.UNSPECIFIED_ARRAY_LENGTH);
                    result.dnsAliases = new String[si1.elementsOrVersion];
                    for (int i1 = 0; i1 < si1.elementsOrVersion; ++i1) {
                        
                        result.dnsAliases[i1] = decoder1.readString(org.chromium.mojo.bindings.DataHeader.HEADER_SIZE + org.chromium.mojo.bindings.BindingsHelper.POINTER_SIZE * i1, false);
                    }
                }
                }
                {
                    
                org.chromium.mojo.bindings.Decoder decoder1 = decoder0.readPointer(248, false);
                result.webBundleUrl = org.chromium.url.mojom.Url.decode(decoder1);
                }

        } finally {
            decoder0.decreaseStackDepth();
        }
        return result;
    }

    @Override
    protected void encode(org.chromium.mojo.bindings.Encoder encoder) {
        org.chromium.mojo.bindings.Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
        
        encoder0.encode(this.requestTime, 8, false);
        
        encoder0.encode(this.responseTime, 16, false);
        
        encoder0.encode(this.headers, 24, false);
        
        encoder0.encode(this.mimeType, 32, false);
        
        encoder0.encode(this.charset, 40, false);
        
        encoder0.encode(this.ctPolicyCompliance, 48);
        
        encoder0.encode(this.networkAccessed, 52, 0);
        
        encoder0.encode(this.wasFetchedViaSpdy, 52, 1);
        
        encoder0.encode(this.wasAlpnNegotiated, 52, 2);
        
        encoder0.encode(this.wasAlternateProtocolAvailable, 52, 3);
        
        encoder0.encode(this.isValidated, 52, 4);
        
        encoder0.encode(this.wasFetchedViaCache, 52, 5);
        
        encoder0.encode(this.wasFetchedViaServiceWorker, 52, 6);
        
        encoder0.encode(this.didServiceWorkerNavigationPreload, 52, 7);
        
        encoder0.encode(this.shouldReportCorbBlocking, 53, 0);
        
        encoder0.encode(this.asyncRevalidationRequested, 53, 1);
        
        encoder0.encode(this.didMimeSniff, 53, 2);
        
        encoder0.encode(this.isSignedExchangeInnerResponse, 53, 3);
        
        encoder0.encode(this.wasInPrefetchCache, 53, 4);
        
        encoder0.encode(this.wasCookieInRequest, 53, 5);
        
        encoder0.encode(this.interceptedByPlugin, 53, 6);
        
        encoder0.encode(this.isLegacyTlsVersion, 53, 7);
        
        encoder0.encode(this.hasRangeRequested, 54, 0);
        
        encoder0.encode(this.timingAllowPassed, 54, 1);
        
        encoder0.encode(this.hasAuthorizationCoveredByWildcardOnPreflight, 54, 2);
        
        encoder0.encode(this.contentLength, 56);
        
        encoder0.encode(this.encodedDataLength, 64);
        
        encoder0.encode(this.encodedBodyLength, 72);
        
        encoder0.encode(this.appcacheId, 80);
        
        encoder0.encode(this.appcacheManifestUrl, 88, false);
        
        encoder0.encode(this.loadTiming, 96, false);
        
        encoder0.encode(this.rawRequestResponseInfo, 104, true);
        
        encoder0.encode(this.connectionInfo, 112);
        
        encoder0.encode(this.serviceWorkerResponseSource, 116);
        
        encoder0.encode(this.alpnNegotiatedProtocol, 120, false);
        
        encoder0.encode(this.remoteEndpoint, 128, false);
        
        encoder0.encode(this.proxyServer, 136, false);
        
        if (this.urlListViaServiceWorker == null) {
            encoder0.encodeNullPointer(144, false);
        } else {
            org.chromium.mojo.bindings.Encoder encoder1 = encoder0.encodePointerArray(this.urlListViaServiceWorker.length, 144, org.chromium.mojo.bindings.BindingsHelper.UNSPECIFIED_ARRAY_LENGTH);
            for (int i0 = 0; i0 < this.urlListViaServiceWorker.length; ++i0) {
                
                encoder1.encode(this.urlListViaServiceWorker[i0], org.chromium.mojo.bindings.DataHeader.HEADER_SIZE + org.chromium.mojo.bindings.BindingsHelper.POINTER_SIZE * i0, false);
            }
        }
        
        encoder0.encode(this.responseType, 152);
        
        encoder0.encode(this.certStatus, 156);
        
        encoder0.encode(this.padding, 160);
        
        encoder0.encode(this.cacheStorageCacheName, 168, false);
        
        encoder0.encode(this.sslInfo, 176, true);
        
        if (this.corsExposedHeaderNames == null) {
            encoder0.encodeNullPointer(184, false);
        } else {
            org.chromium.mojo.bindings.Encoder encoder1 = encoder0.encodePointerArray(this.corsExposedHeaderNames.length, 184, org.chromium.mojo.bindings.BindingsHelper.UNSPECIFIED_ARRAY_LENGTH);
            for (int i0 = 0; i0 < this.corsExposedHeaderNames.length; ++i0) {
                
                encoder1.encode(this.corsExposedHeaderNames[i0], org.chromium.mojo.bindings.DataHeader.HEADER_SIZE + org.chromium.mojo.bindings.BindingsHelper.POINTER_SIZE * i0, false);
            }
        }
        
        encoder0.encode(this.authChallengeInfo, 192, true);
        
        encoder0.encode(this.requestStart, 200, false);
        
        encoder0.encode(this.responseStart, 208, false);
        
        encoder0.encode(this.parsedHeaders, 216, true);
        
        encoder0.encode(this.originPolicy, 224, true);
        
        encoder0.encode(this.recursivePrefetchToken, 232, true);
        
        if (this.dnsAliases == null) {
            encoder0.encodeNullPointer(240, false);
        } else {
            org.chromium.mojo.bindings.Encoder encoder1 = encoder0.encodePointerArray(this.dnsAliases.length, 240, org.chromium.mojo.bindings.BindingsHelper.UNSPECIFIED_ARRAY_LENGTH);
            for (int i0 = 0; i0 < this.dnsAliases.length; ++i0) {
                
                encoder1.encode(this.dnsAliases[i0], org.chromium.mojo.bindings.DataHeader.HEADER_SIZE + org.chromium.mojo.bindings.BindingsHelper.POINTER_SIZE * i0, false);
            }
        }
        
        encoder0.encode(this.webBundleUrl, 248, false);
    }
}