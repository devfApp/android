package com.icaboalo.devfapp.ui.activity;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.NavigationView;
import android.support.design.widget.Snackbar;
import android.support.v4.app.Fragment;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;

import com.icaboalo.devfapp.R;
import com.icaboalo.devfapp.util.VUtil;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnItemClick;

public class MainActivity extends AppCompatActivity {

    @Bind(R.id.app_bar)
    Toolbar mToolbar;

    @Bind(R.id.drawer_layout)
    DrawerLayout mDrawerLayout;

    @Bind(R.id.navigation_view)
    NavigationView mNavigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        setSupportActionBar(mToolbar);
        VUtil.replaceFragment(R.layout.activity_main, getSupportFragmentManager(), new Fragment());
        navigationViewClick();
    }

    private void navigationViewClick(){
        mNavigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(MenuItem item) {
                Fragment nFragment = null;
                switch (item.getItemId()){
                    case 0:
                        nFragment = null;
                        break;
                }
                VUtil.replaceFragment(R.layout.activity_main, getSupportFragmentManager(), new Fragment());
                mDrawerLayout.closeDrawers();
                return false;
            }
        });
    }
}
