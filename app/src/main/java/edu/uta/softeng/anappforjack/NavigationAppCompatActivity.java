package edu.uta.softeng.anappforjack;

import android.content.Intent;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;

/**
 * Created by Daakru Akaigia on 4/30/2017.
 */

public class NavigationAppCompatActivity extends AppCompatActivity {

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.main_menu,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();

        if (id==R.id.action_settings) {
            startActivity(new Intent(this, SettingsActivity.class));
        }
        return super.onOptionsItemSelected(item);
    }

    protected void goToLogin(View view){
        DrawerLayout mDrawerLayout = (DrawerLayout) findViewById(R.id.drawer_layout);
        mDrawerLayout.closeDrawers();
        Intent intent = new Intent (this, LoginActivity.class);
        intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(intent);
    }

    protected void goToRegister(View view){
        DrawerLayout mDrawerLayout = (DrawerLayout) findViewById(R.id.drawer_layout);
        mDrawerLayout.closeDrawers();
        Intent intent = new Intent (this, RegisterActivity.class);
        startActivity(intent);
    }

    protected void goToUserArea(View view){
        DrawerLayout mDrawerLayout = (DrawerLayout) findViewById(R.id.drawer_layout);
        mDrawerLayout.closeDrawers();
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
        DrawerLayout mDrawerLayout = (DrawerLayout) findViewById(R.id.drawer_layout);
        mDrawerLayout.closeDrawers();
        Intent intent = new Intent (this, Interest.class);
        startActivity(intent);
    }
/*

    protected void goToEvents(View view){
        DrawerLayout mDrawerLayout = (DrawerLayout) findViewById(R.id.drawer_layout);
        mDrawerLayout.closeDrawers();
        Intent intent = new Intent (this, EventActivity.class);
        startActivity(intent);
    }
*/

    /*
    protected void goToFriends(View view){
        DrawerLayout mDrawerLayout = (DrawerLayout) findViewById(R.id.drawer_layout);
        mDrawerLayout.closeDrawers();
        Intent intent = new Intent (this, Friends.class);
        startActivity(intent);
    }
    */
    /*
    protected void goToMessaging(View view){
        DrawerLayout mDrawerLayout = (DrawerLayout) findViewById(R.id.drawer_layout);
        mDrawerLayout.closeDrawers();
        Intent intent = new Intent (this, Messaging.class);
        startActivity(intent);
    }
    */
}
