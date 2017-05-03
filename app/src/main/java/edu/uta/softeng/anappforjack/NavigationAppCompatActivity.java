package edu.uta.softeng.anappforjack;

import android.content.Intent;
import android.graphics.Color;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;

/**
 * Created by Daakru Akaigia on 4/30/2017.
 */

public class NavigationAppCompatActivity extends AppCompatActivity {
    /*protected int savedDeviceWidth;
    protected int savedDeviceHeight;*/

    /*
    CLASS: addNavigationMenu
    ABOUT: Adds Toolbar and Removes Drawer Menu Scrim
    USAGE: Call with "this.addNavigationMenu();" in
            onCreate() Method of Subclass.
    */
    protected void addNavigationMenu() {
        Toolbar toolbar = (Toolbar) findViewById(R.id.app_bar);
        setSupportActionBar(toolbar);
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.setScrimColor(Color.TRANSPARENT);

        /*DisplayMetrics displayMetrics = new DisplayMetrics();
        WindowManager windowmanager = (WindowManager) getApplicationContext().getSystemService(Context.WINDOW_SERVICE);
        windowmanager.getDefaultDisplay().getMetrics(displayMetrics);
        savedDeviceWidth = displayMetrics.widthPixels;
        savedDeviceHeight = displayMetrics.heightPixels;*/
    }
    /*@Override
    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
        //Do stuff here
        ScrollView layout = (ScrollView) findViewById(R.id.navigation_drawer_layout_scrollview);
        // Gets the layout params that will allow you to resize the layout
        ViewGroup.LayoutParams params = layout.getLayoutParams();
        // Changes the height and width to the specified *pixels*
        int scrollViewHeightAdjustPX = (int) TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, 52, getResources().getDisplayMetrics());
        if (getResources().getConfiguration().orientation == 1) {
            params.height = (savedDeviceHeight - scrollViewHeightAdjustPX - android.R.attr.actionBarSize);
        }
        else if (getResources().getConfiguration().orientation == 1) {
            params.height = (savedDeviceWidth - scrollViewHeightAdjustPX - android.R.attr.actionBarSize);
        }
        layout.setLayoutParams(params);
        *//*LinearLayout layout1 = (LinearLayout) findViewById(R.id.navigation_drawer_layout_linear_logout);
        LinearLayout.LayoutParams params1 = (LinearLayout.LayoutParams) layout1.getLayoutParams();
        params1.weight = 2;
        layout1.setLayoutParams(params1);*//*
    }*/

    //Component in Adding Toolbar Functionality
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.main_menu,menu);
        return true;
    }

    //Component in Adding Toolbar Functionality
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();

        if (id==R.id.action_settings) {
            startActivity(new Intent(this, SettingsActivity.class));
        }
        return super.onOptionsItemSelected(item);
    }
    // + NAVIGATION FUNCTIONALITY
    public void goToLogin(View view){
        DrawerLayout mDrawerLayout = (DrawerLayout) findViewById(R.id.drawer_layout);
        mDrawerLayout.closeDrawers();
        Intent intent = new Intent (this, LoginActivity.class);
        intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(intent);
    }

    public void goToRegister(View view){
        DrawerLayout mDrawerLayout = (DrawerLayout) findViewById(R.id.drawer_layout);
        mDrawerLayout.closeDrawers();
        Intent intent = new Intent (this, RegisterActivity.class);
        startActivity(intent);
    }

    public void goToUserArea(View view){
        DrawerLayout mDrawerLayout = (DrawerLayout) findViewById(R.id.drawer_layout);
        mDrawerLayout.closeDrawers();
        Intent intent = new Intent (this, UserAreaActivity.class);
        startActivity(intent);
    }

    public void goToAccount(View view){
        DrawerLayout mDrawerLayout = (DrawerLayout) findViewById(R.id.drawer_layout);
        mDrawerLayout.closeDrawers();
        Intent intent = new Intent (this, Account.class);
        startActivity(intent);
    }
    /*
    public void goToInterest(View view){
        DrawerLayout mDrawerLayout = (DrawerLayout) findViewById(R.id.drawer_layout);
        mDrawerLayout.closeDrawers();
        Intent intent = new Intent (this, Interest.class);
        startActivity(intent);
    }
    */
    public void goToEvents(View view){
        DrawerLayout mDrawerLayout = (DrawerLayout) findViewById(R.id.drawer_layout);
        mDrawerLayout.closeDrawers();
        Intent intent = new Intent (this, EventActivity.class);
        startActivity(intent);
    }
    /*
    public void goToFriends(View view){
        DrawerLayout mDrawerLayout = (DrawerLayout) findViewById(R.id.drawer_layout);
        mDrawerLayout.closeDrawers();
        Intent intent = new Intent (this, Friends.class);
        startActivity(intent);
    }
    *//*
    public void goToMessaging(View view){
        DrawerLayout mDrawerLayout = (DrawerLayout) findViewById(R.id.drawer_layout);
        mDrawerLayout.closeDrawers();
        Intent intent = new Intent (this, Messaging.class);
        startActivity(intent);
    }
    */
    // - NAVIGATION FUNCTIONALITY
}
