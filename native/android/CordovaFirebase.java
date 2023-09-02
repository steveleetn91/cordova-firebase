package org.apache.cordova;
import org.apache.cordova.CordovaPlugin;
import org.apache.cordova.CallbackContext;

import android.content.Intent;
import android.util.Log;

import com.google.android.gms.auth.api.signin.GoogleSignIn;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInClient;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.tasks.Task;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import com.google.firebase.analytics.FirebaseAnalytics;
class CordovaFirebase extends CordovaPlugin {
    private static final String TAG = "GoogleSignInInit";
    private FirebaseAnalytics mFirebaseAnalytics;
    @Override
    public void initialize(CordovaInterface cordova, CordovaWebView webView) {
        super.initialize(cordova, webView);
        mFirebaseAnalytics = FirebaseAnalytics.getInstance(this.cordova.getActivity());
    }
}