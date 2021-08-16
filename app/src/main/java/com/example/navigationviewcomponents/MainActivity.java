package com.example.navigationviewcomponents;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;


import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.navigation.NavigationView;

public class MainActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener{
    DrawerLayout drawerLayout;
    @Override
    protected  void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
         drawerLayout=findViewById(R.id.draw);
        findViewById(R.id.img).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                drawerLayout.openDrawer(GravityCompat.START);
            }
        });
        NavigationView navigationView=findViewById(R.id.navigate);
        navigationView.setNavigationItemSelectedListener((NavigationView.OnNavigationItemSelectedListener) this);
        navigationView.setItemIconTintList(null);
    }
    @Override
    public void onBackPressed() {
        if (drawerLayout.isDrawerOpen(GravityCompat.START)){
            drawerLayout.closeDrawer( GravityCompat.START);
        }else {
            super.onBackPressed();
        }

    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        int id=item.getItemId();
        switch (id){
            case R.id.pro :
                Toast.makeText(getApplicationContext(),"User Profile is entered",Toast.LENGTH_SHORT).show();
                break;
            case R.id.note:
                Toast.makeText(getApplicationContext(),"Note Section is opened",Toast.LENGTH_SHORT).show();
                break;
            case R.id.mail:
                Toast.makeText(getApplicationContext(),"You entered the mail portion",Toast.LENGTH_SHORT).show();
                break;
            case R.id.collect:
                Toast.makeText(getApplicationContext(),"You are Under Cloud",Toast.LENGTH_SHORT).show();
                break;
            case R.id.book:
                Toast.makeText(getApplicationContext(),"Central Repositories containing all saved document",Toast.LENGTH_SHORT).show();
                break;
            case R.id.set:
                Toast.makeText(getApplicationContext(),"User is under Setting section",Toast.LENGTH_SHORT).show();
                break;
            case R.id.con:
                Toast.makeText(getApplicationContext(),"Help Box",Toast.LENGTH_SHORT).show();
                break;
            case R.id.info:
                Toast.makeText(getApplicationContext(),"Know about Us",Toast.LENGTH_SHORT).show();
                break;
        }
        drawerLayout.closeDrawer(GravityCompat.START);
        return true;
    }

}