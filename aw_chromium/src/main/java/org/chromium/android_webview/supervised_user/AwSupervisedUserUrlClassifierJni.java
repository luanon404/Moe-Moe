//
// This file was generated by third_party/jni_zero/jni_generator.py
//
package org.chromium.android_webview.supervised_user;

import org.jni_zero.CheckDiscard;
import org.jni_zero.GEN_JNI;
import org.jni_zero.JniStaticTestMocker;
import org.jni_zero.NativeLibraryLoadedStatus;

@CheckDiscard("crbug.com/993421")
class AwSupervisedUserUrlClassifierJni implements AwSupervisedUserUrlClassifier.Natives {
    private static AwSupervisedUserUrlClassifier.Natives testInstance;

    public static final JniStaticTestMocker<AwSupervisedUserUrlClassifier.Natives> TEST_HOOKS = new JniStaticTestMocker<AwSupervisedUserUrlClassifier.Natives>() {
        @Override
        public void setInstanceForTesting(AwSupervisedUserUrlClassifier.Natives instance) {
            if (!GEN_JNI.TESTING_ENABLED) {
                throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
            }
            testInstance = instance;
        }
    };

    @Override
    public void onShouldBlockUrlResult(long callbackPtr, boolean shouldBlock) {
        GEN_JNI.org_chromium_android_1webview_supervised_1user_AwSupervisedUserUrlClassifier_onShouldBlockUrlResult(callbackPtr, shouldBlock);
    }

    public static AwSupervisedUserUrlClassifier.Natives get() {
        if (GEN_JNI.TESTING_ENABLED) {
            if (testInstance != null) {
                return testInstance;
            }
            if (GEN_JNI.REQUIRE_MOCK) {
                throw new UnsupportedOperationException("No mock found for the native implementation of AwSupervisedUserUrlClassifier.Natives. " + "The current configuration requires implementations be mocked.");
            }
        }
        NativeLibraryLoadedStatus.checkLoaded();
        return new AwSupervisedUserUrlClassifierJni();
    }
}