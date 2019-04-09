package com.hfad.joke;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;


public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.v("MainActivity", "Created main activity");
    }

    public void onClick(View view){
        Intent intent = new Intent(this,DelayedMessageService.class);
        intent.putExtra(DelayedMessageService.EXTRA_MESSAGE,getResources().getString(R.string.button_response));
        startService(intent);
        //finish();      // If you run this statement , you will get complete working of STARTED THREAD (Intent Service)
    }

    protected void onDestroy(){
        super.onDestroy();
        Log.v("MainActivity", "Destroyed main activity");
    }
}
