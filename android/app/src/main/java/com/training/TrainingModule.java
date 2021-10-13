package com.training;

import androidx.annotation.NonNull;

import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;

public class TrainingModule extends ReactContextBaseJavaModule {

    public TrainingModule(ReactApplicationContext context) {
        super(context);
    }

    @NonNull
    @Override
    public String getName() {
        return "TrainingModule";
    }

    @ReactMethod
    public void sayHello(String name, Callback callBack) {
        callBack.invoke("Hello " + name);
    }

}
