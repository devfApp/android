package com.icaboalo.devfapp.ui.activity;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.NavigationView;
import android.support.design.widget.Snackbar;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;

import com.icaboalo.devfapp.R;
import com.icaboalo.devfapp.ui.fragment.ChallengeListFragment;
import com.icaboalo.devfapp.ui.fragment.EventListFragment;
import com.icaboalo.devfapp.ui.fragment.FileListFragment;
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
        replaceFragment(new FileListFragment());
        navigationViewClick();
    }

    private void navigationViewClick(){
        mNavigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(MenuItem item) {
                Fragment nFragment = null;
                switch (item.getItemId()) {
                    case R.id.files:
                        nFragment = new FileListFragment();
                        break;
                    case R.id.events:
                        nFragment = new EventListFragment();
                        break;
                    case R.id.challenges:
                        nFragment = new ChallengeListFragment();
                        break;
                }
                replaceFragment(nFragment);
                mDrawerLayout.closeDrawers();
                return false;
            }
        });
    }

    private void replaceFragment(Fragment fragment) {
        FragmentManager fragmentManager = getSupportFragmentManager();
        fragmentManager.beginTransaction().replace(R.id.container, fragment).commit();
    }
}
