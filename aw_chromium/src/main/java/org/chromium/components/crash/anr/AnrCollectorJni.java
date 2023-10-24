//
// This file was generated by third_party/jni_zero/jni_generator.py
//
package org.chromium.components.crash.anr;

import org.jni_zero.CheckDiscard;
import org.jni_zero.GEN_JNI;
import org.jni_zero.JniStaticTestMocker;
import org.jni_zero.NativeLibraryLoadedStatus;

@CheckDiscard("crbug.com/993421")
class AnrCollectorJni implements AnrCollector.Natives {
    private static AnrCollector.Natives testInstance;

    public static final JniStaticTestMocker<AnrCollector.Natives> TEST_HOOKS = new JniStaticTestMocker<AnrCollector.Natives>() {
        @Override
        public void setInstanceForTesting(AnrCollector.Natives instance) {
            if (!GEN_JNI.TESTING_ENABLED) {
                throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
            }
            testInstance = instance;
        }
    };

    @Override
    public String getSharedLibraryBuildId() {
        return (String) GEN_JNI.org_chromium_components_crash_anr_AnrCollector_getSharedLibraryBuildId();
    }

    public static AnrCollector.Natives get() {
        if (GEN_JNI.TESTING_ENABLED) {
            if (testInstance != null) {
                return testInstance;
            }
            if (GEN_JNI.REQUIRE_MOCK) {
                throw new UnsupportedOperationException("No mock found for the native implementation of AnrCollector.Natives. " + "The current configuration requires implementations be mocked.");
            }
        }
        NativeLibraryLoadedStatus.checkLoaded();
        return new AnrCollectorJni();
    }
}