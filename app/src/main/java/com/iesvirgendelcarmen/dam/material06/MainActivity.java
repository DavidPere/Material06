package com.iesvirgendelcarmen.dam.material06;

import android.graphics.Color;
import android.support.design.widget.TabLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final TabLayout tabLayout = (TabLayout)findViewById(R.id.tab1);
        TabLayout.Tab primerTab = tabLayout.newTab();
        primerTab.setText("TAB 1");
            primerTab.setIcon(R.mipmap.ic_launcher);
                    tabLayout.addTab(primerTab);

        TabLayout.Tab segundoTab = tabLayout.newTab();
        segundoTab.setText("TAB 2");
        segundoTab.setIcon(R.drawable.icono1);
        tabLayout.addTab(segundoTab);

        TabLayout.Tab tercerTab= tabLayout.newTab();
        tercerTab.setText("TAB 3");
        tercerTab.setIcon(R.drawable.icono2);
        tabLayout.addTab(tercerTab,1,true);

        tabLayout.setTabGravity(tabLayout.GRAVITY_CENTER);
        tabLayout.setTabGravity(tabLayout.GRAVITY_FILL);
        tabLayout.setTabMode(tabLayout.MODE_SCROLLABLE);
        tabLayout.setTabMode(tabLayout.MODE_FIXED);

        tabLayout.setTabTextColors(Color.RED, Color.WHITE);
        tabLayout.setTabTextColors(Color.argb(255,50,50,50), Color.argb(255,0,200,200));
        tabLayout.setSelectedTabIndicatorColor(Color.GREEN);
        tabLayout.setSelectedTabIndicatorHeight(12);


        tabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener(){
            public void onTabSelected(TabLayout.Tab tab) {
              int elegida = tabLayout.getSelectedTabPosition();
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }



        });





    }


}
