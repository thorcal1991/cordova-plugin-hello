package com.example.plugin;

import org.apache.cordova.*;
import org.json.JSONArray;
import org.json.JSONException;

public class CheckMockLocation extends CordovaPlugin {

    @Override
    public boolean execute(String action, JSONArray data, CallbackContext callbackContext) throws JSONException {

        if (action.equals("greet")) {

            callbackContext.success("MOCK LOCATIONNNN");

            return true;

        } else {
            
            return false;

        }
    }
}
