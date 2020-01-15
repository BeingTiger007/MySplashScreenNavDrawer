package com.example.mysplashscreen;

import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.drawerlayout.widget.DrawerLayout;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    DrawerLayout drawerLayout;
    Toolbar toolbar;
    ActionBarDrawerToggle actionBarDrawerToggle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setUpToolbar();
    }

    private void setUpToolbar() {
        drawerLayout = (DrawerLayout) findViewById(R.id.drawerlayout1);
        toolbar = (Toolbar) findViewById(R.id.toolbar1);
         setSupportActionBar(toolbar);
         actionBarDrawerToggle = new ActionBarDrawerToggle(this,drawerLayout,toolbar,R.string.app_name,R.string.app_name);
         drawerLayout.addDrawerListener(actionBarDrawerToggle);
         actionBarDrawerToggle.syncState();
    }
}
