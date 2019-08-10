package com.example.bundle1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TableLayout;

import com.google.android.material.tabs.TabLayout;

public class DetailActivity extends AppCompatActivity {

    private ViewPager viewPager;
    private TabLayout Tablayout;
    Pegawai pegawaiDetail;
    TabFragmentAdapter pagerAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        Tablayout=(TabLayout)findViewById(R.id.tab_layout);
        viewPager=(ViewPager) findViewById(R.id.pager);

        Intent kirim=getIntent();
        pegawaiDetail=(Pegawai) getIntent().getSerializableExtra("xyz");
        pagerAdapter=new TabFragmentAdapter(getSupportFragmentManager(),pegawaiDetail);
        viewPager.setAdapter(pagerAdapter);
        Tablayout.setTabTextColors(getResources().getColor(R.color.colorBlue),getResources().getColor(R.color.colorAccent));
        Tablayout.setupWithViewPager(viewPager);
        Tablayout.setTabGravity(TabLayout.GRAVITY_FILL);
    }
}