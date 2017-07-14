package com.example.ds121.eventor;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.starting);
    }

    //functions


    //-----------------All Button----------------------------\\
    public void FLogo(View v) {
        setContentView(R.layout.activity_layout);
    }
    public void FSUNextPage(View v) {setContentView(R.layout.activity_layout);} // need to call activity inorder for this to work, upon call of new activity it will;
                                                                                // automatically open the setcontentview to activity_layout
    public void FSINextPage(View v) {setContentView(R.layout.activity_layout);} // ^ same as above ^

    public void fmap(View v) /* Use this as an example of calling an activity and passing savedInstanceState  */{
        Intent mapActivity = new Intent(this, MapActivity.class);   //create an intent to push bundle to another specified activity (MapActivity.class)
                                                                    //Shares all bundles with specified activity call.
        startActivity(mapActivity);                                 //Start activity included in the Intent mapActivity.
    }

    //-------------------Micro Button-------------------------\\
    @Override
    public void onStart() {
        super.onStart();
    }

    @Override
    public void onResume() {
        super.onResume();
    }

    @Override
    public void onPause() {
        super.onPause();
    }

    @Override
    public void onStop() {
        super.onStop();
    }

    @Override
    public void onLowMemory() {
        super.onLowMemory();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
    }
}