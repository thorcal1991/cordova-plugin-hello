package com.example.plugin;

import org.apache.cordova.*;
import org.json.JSONArray;
import org.json.JSONException;
import android.provider.Settings;

import android.content.Context;
import android.telephony.TelephonyManager;
import android.os.Build;
import android.os.Bundle;

public class CustomCode extends CordovaPlugin {

    @Override
    public boolean execute(String action, JSONArray data, CallbackContext callbackContext) throws JSONException {

        if (action.equals("checkdevelopermode")) {

            int adb = Settings.Secure.getInt(this.cordova.getActivity().getApplicationContext().getContentResolver(), Settings.Global.DEVELOPMENT_SETTINGS_ENABLED , 0);
            
            if(adb == 0) {
                callbackContext.success("punch");

            } else {
                callbackContext.success("izzabbab");
            }

            return true;
        }

        if (action.equals("getimei")) {

            String imei = "";

            TelephonyManager tMgr = (TelephonyManager)this.cordova.getActivity().getApplicationContext().getSystemService(Context.TELEPHONY_SERVICE);

            if (android.os.Build.VERSION.SDK_INT >= 26) {
                imei = tMgr.getImei();
                imei = (imei == null) ? "" : imei;
            } else {
                imei = tMgr.getDeviceId();
            }

            callbackContext.success(imei);
            return true;
        }

        return false;
    }
}
