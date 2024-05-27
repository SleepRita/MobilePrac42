package com.example.task42;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    FragmentManager fmanager = getSupportFragmentManager();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportFragmentManager().beginTransaction().add
                (R.id.f2, Fragment2.class, null).commit();
    }

    public void Fr1(View view){
        Fragment1 f1 = new Fragment1();
        FragmentTransaction ftransct = fmanager.beginTransaction();
        ftransct.replace(R.id.f3, f1, "f1");
        ftransct.commit();
    }

    public void Fr2(View view){
        Fragment2 f2 = new Fragment2();
        FragmentTransaction ftransct = fmanager.beginTransaction();
        ftransct.replace(R.id.f3, f2, "f2");
        ftransct.commit();
    }

    public void Fr3(View view){
        Fragment3 f3 = new Fragment3();
        FragmentTransaction ftransct = fmanager.beginTransaction();
        ftransct.replace(R.id.f3, f3, "f3");
        ftransct.commit();
    }
}