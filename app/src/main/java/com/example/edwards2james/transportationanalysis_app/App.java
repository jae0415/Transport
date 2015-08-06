package com.example.edwards2james.transportationanalysis_app;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;


public class App extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_app);

    }

    public void onabtdataClick(View view) {
        Intent intent = new Intent(this, abtdata.class);
        startActivity(intent);
    }

    public void onexpenClick(View view) {
        Intent intent = new Intent(this, expen.class);
        startActivity(intent);
    }

    public void onAboutClick(View view) {
        Intent intent = new Intent(this, about.class);
        startActivity(intent);
    }

}