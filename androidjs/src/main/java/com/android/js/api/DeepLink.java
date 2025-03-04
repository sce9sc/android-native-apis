package com.android.js.api;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;

public class DeepLink {
    private Activity activity;

    public DeepLink(Activity activity){
        this.activity = activity;
    }

    public String getLink(){
        Intent intent = this.activity.getIntent();
        String action = intent.getAction();
        Uri data = intent.getData();
        if(data != null)
            return data.toString();
        else return "-1";
    }

    public String openLink(String url){
        Intent i = new Intent(Intent.ACTION_VIEW);
        i.setData(Uri.parse(url));
        startActivity(i);
        return "1";
    }
}
