package com.kelompok2.Activity;

import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.Fragment;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.navigation.NavigationBarView.OnItemSelectedListener;
import com.kelompok2.Activity.Fragment.ProfileFragment;
import com.kelompok2.Activity.Fragment.GalleryFragment;
import com.kelompok2.Activity.Fragment.ReviewFragment;
import com.kelompok2.Activity.Fragment.VendorFragment;
import com.kelompok2.Activity.Fragment.HomeFragment;
import com.kelompok2.anavel.R;

public class MainActivity extends AppCompatActivity implements OnItemSelectedListener{

    FloatingActionButton fab;
    DrawerLayout drawerLayout;

    private BottomNavigationView bottomNavigationView;
    private HomeFragment homeFragment = new HomeFragment();
    private VendorFragment vendorFragment = new VendorFragment();
    private GalleryFragment galleryFragment = new GalleryFragment();
    private ReviewFragment reviewFragment = new ReviewFragment();
    private ProfileFragment profileFragment = new ProfileFragment();



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        bottomNavigationView = findViewById(R.id.navigation_bar);
        bottomNavigationView.setOnItemSelectedListener(this);
        bottomNavigationView.setSelectedItemId(R.id.home);


    }


    private boolean loadFragment(Fragment fragment) {
        if (fragment != null) {
            getSupportFragmentManager()
                    .beginTransaction()
                    .replace(R.id.fragment_container_bar, fragment)
                    .commit();
            return true;
        }
        return false;
    }


    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        Fragment fragment = null;
        int selected = item.getItemId();

        if (selected == R.id.home) {
            fragment = new HomeFragment();
        } else if (selected == R.id.vendor) {
            fragment = new VendorFragment();
        } else if (selected == R.id.gallery) {
            fragment = new GalleryFragment();
        } else if (selected == R.id.review) {
            fragment = new ReviewFragment();
        } else if (selected == R.id.account) {
            fragment = new ProfileFragment();
        }

        return loadFragment(fragment);
    }
}
