package edu.uta.softeng.anappforjack;

import android.content.Intent;
import android.graphics.Color;
import android.os.Handler;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Gravity;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

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
    public void navigationGoToLogin(View view){
        final Intent intent = new Intent (this, LoginActivity.class);
        final Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(intent);
                Toast.makeText(getApplicationContext(), "Successfully Logged Out", Toast.LENGTH_SHORT).show();
            }
        }, 200);
    }

    public void navigationGoToRegister(View view){
        final DrawerLayout mDrawerLayout = (DrawerLayout) findViewById(R.id.drawer_layout);
        final Intent intent = new Intent (this, RegisterActivity.class);
        final Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                startActivity(intent);
                mDrawerLayout.closeDrawer(Gravity.LEFT, false);
            }
        }, 400);
    }

    public void navigationGoToUserArea(View view){
        final DrawerLayout mDrawerLayout = (DrawerLayout) findViewById(R.id.drawer_layout);
        final Intent intent = new Intent (this, UserAreaActivity.class);
        final Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                startActivity(intent);
                mDrawerLayout.closeDrawer(Gravity.LEFT, false);
            }
        }, 400);
    }

    public void navigationGoToAccount(View view){
        final DrawerLayout mDrawerLayout = (DrawerLayout) findViewById(R.id.drawer_layout);
        final Intent intent = new Intent (this, Account.class);
        final Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                startActivity(intent);
                mDrawerLayout.closeDrawer(Gravity.LEFT, false);
            }
        }, 400);
    }
    /*
    public void navigationGoToInterest(View view){
        DrawerLayout mDrawerLayout = (DrawerLayout) findViewById(R.id.drawer_layout);
        Intent intent = new Intent (this, Interest.class);
        startActivity(intent);
        mDrawerLayout.closeDrawers();
    }
    */
    public void navigationGoToEvents(View view){
        final DrawerLayout mDrawerLayout = (DrawerLayout) findViewById(R.id.drawer_layout);
        final Intent intent = new Intent (this, EventActivity.class);
        final Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                startActivity(intent);
                mDrawerLayout.closeDrawer(Gravity.LEFT, false);
            }
        }, 400);
    }
    public void navigationGoToFriends(View view){
        final DrawerLayout mDrawerLayout = (DrawerLayout) findViewById(R.id.drawer_layout);
        final Intent intent = new Intent (this, FriendList.class);
        final Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                startActivity(intent);
                mDrawerLayout.closeDrawer(Gravity.LEFT, false);
            }
        }, 400);
    }
    /*
    public void navigationGoToMessaging(View view){
        DrawerLayout mDrawerLayout = (DrawerLayout) findViewById(R.id.drawer_layout);
        Intent intent = new Intent (this, Messaging.class);
        startActivity(intent);
        mDrawerLayout.closeDrawers();
    }
    */
    // - NAVIGATION FUNCTIONALITY
}
