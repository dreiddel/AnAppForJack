package edu.uta.softeng.anappforjack;

import android.content.Intent;
import android.graphics.Color;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends NavigationAppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar toolbar = (Toolbar) findViewById(R.id.app_bar);
        setSupportActionBar(toolbar);
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.setScrimColor(Color.TRANSPARENT);
    }

    /*protected void goToLogin(View view){
        Intent intent = new Intent (this, LoginActivity.class);
        startActivity(intent);
    }

    protected void goToRegister(View view){
        Intent intent = new Intent (this, RegisterActivity.class);
        startActivity(intent);
    }

    protected void goToUserArea(View view){
        Intent intent = new Intent (this, UserAreaActivity.class);
        startActivity(intent);
    }

    protected void goToAccount(View view){
        DrawerLayout mDrawerLayout = (DrawerLayout) findViewById(R.id.drawer_layout);
        mDrawerLayout.closeDrawers();
        Intent intent = new Intent (this, Account.class);
        startActivity(intent);
    }

    protected void goToInterest(View view){
        Intent intent = new Intent (this, Interest.class);
        startActivity(intent);
    }*/

}
