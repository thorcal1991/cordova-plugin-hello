package com.example.plugin;

import org.apache.cordova.*;
import org.json.JSONArray;
import org.json.JSONException;
import android.provider.Settings;

public class CheckMockLocation extends CordovaPlugin {

    @Override
    public boolean execute(String action, JSONArray data, CallbackContext callbackContext) throws JSONException {

        if (action.equals("greet")) {
            
            int adb = Settings.Secure.getInt(this.getContentResolver(), Settings.Global.DEVELOPMENT_SETTINGS_ENABLED , 0);
            
            if(adb == 0) {
                callbackContext.success("punch");

            } else {
                callbackContext.success("izzabbab");
            }

            
            return true;

        } else {
            
            return false;

        }
    }
}
