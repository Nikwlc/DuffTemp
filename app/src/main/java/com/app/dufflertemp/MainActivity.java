package com.app.dufflertemp;


import android.content.Intent;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    Fragment fragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //fragment = new FragmentCreatePost();
//        fragment = new FragmentListPosts();
//
//        FragmentManager fragmentManager = getSupportFragmentManager();
//        FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
//        ft.replace(R.id.frame_main, fragment);
//        ft.addToBackStack(null);
//        ft.commit();

        startActivity(new Intent(this, RadarViewActivity.class));

    }

    @Override
    public void onBackPressed() {
           // super.onBackPressed();
            finish();
    }
}
