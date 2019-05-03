package com.online;

import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.widget.TableLayout;


import adapter.ViewPagerAdapter;
import fragment.LoginFragment;
import fragment.RegisterFragment;

public class MainActivity extends AppCompatActivity {

    TableLayout tabLayout;
    ViewPager viewPager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tabLayout = findViewById(R.id.tabId);
        viewPager = findViewById(R.id.viewPager);
        ViewPagerAdapter viewPagerAdapter = new ViewPagerAdapter(getSupportFragmentManager());
//        viewPagerAdapter.addFragment(new LoginFragment(this),"Login");
        viewPagerAdapter.addFragment(new RegisterFragment(),"Register");
        viewPager.setAdapter(viewPagerAdapter);
        tabLayout.setupWithViewPager(viewPager);


    }



}
