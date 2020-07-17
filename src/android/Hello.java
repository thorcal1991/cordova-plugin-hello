package com.example.plugin;

import org.apache.cordova.*;
import org.json.JSONArray;
import org.json.JSONException;

public class CheckMockLocation extends CordovaPlugin {

    @Override
    public boolean execute(String action, JSONArray data, CallbackContext callbackContext) throws JSONException {

        if (action.equals("greet")) {

            String name = data.getString(0);
            String message = "CheckMockLocation, " + name;
            callbackContext.success(message);

            return true;

        } else {
            
            return false;

        }
    }
}
