package com.example.trycomponent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void handleLogout(View view ){
        finish();
    }

    public void navigateSettingScreen(View view){
        startActivity(new Intent(this , setting.class));
    }
}