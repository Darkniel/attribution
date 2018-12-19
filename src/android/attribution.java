package com.neuraweb.cordova;

import org.apache.cordova.CallbackContext;
import org.apache.cordova.CordovaPlugin;
import org.apache.cordova.CordovaWebView;
import org.apache.cordova.PluginResult;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.util.Log;

/**
 * This class echoes a string called from JavaScript.
 */
public class attribution extends BroadcastReceiver {
    
    public void onReceive(Context context, Intent intent) {

        /************* Get referrer ************/
		
        String referrer = intent.getStringExtra("referrer");

        /****************** Save Referrer Value to SharedPreferences **********************/

        SharedPreferences sharedpreferences = PreferenceManager.getDefaultSharedPreferences(context);
        SharedPreferences.Editor edit = sharedpreferences.edit();
        edit.putString("referrer", referrer);
        edit.apply();
    }
}

