package com.example.crashlytics;

import com.google.firebase.crashlytics.FirebaseCrashlytics;



public class IpayLog {

    static void e(String key, String message){
        FirebaseCrashlytics crashlytics = FirebaseCrashlytics.getInstance();

        crashlytics.setCustomKey("my_string_key", "foo" /* string value */);

        crashlytics.setCustomKey("my_bool_key", true /* boolean value */);

        crashlytics.setCustomKey("my_double_key", 1.0 /* double value */);

        crashlytics.setCustomKey("my_float_key", 1.0f /* float value */);

        crashlytics.setCustomKey("my_int_key", 1 /* int value */);

        FirebaseCrashlytics.getInstance().setUserId("user123456789");

        FirebaseCrashlytics.getInstance().log("message");
        FirebaseCrashlytics.getInstance().log("recordException");
        FirebaseCrashlytics.getInstance().log("Test");

        try {

            throw new RuntimeException("Test Crash"); // Force a crash
        }catch (Exception e){
            FirebaseCrashlytics.getInstance().recordException(e);
            FirebaseCrashlytics.getInstance().log("Exception");
        }

    }
}
