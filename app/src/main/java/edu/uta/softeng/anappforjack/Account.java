package edu.uta.softeng.anappforjack;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

/**
 * Project: An App for Jack
 * Client:  Dr. Bahram Khalili, UTA CSE 3310 Software Engineering
 *
 * Author: Michael O'Leary
 * Description: Class defining a user account.
 *
 * To Do: Add a list of subscribing clients.
 **/
public class Account extends NavigationAppCompatActivity {

    /*
    String getAccountName() {
        return this.accountName;
    }
    String getAccountPassword() {
        return this.accountPassword;
    }
    String getAccountEmail() {
        return this.accountEmail;
    }
    void setAccountName(String name) {
        this.accountName = name;
    }
    void setAccountPassword(String password) {
        this.accountPassword = password;
    }
    void setAccountEmail(String email) {
        this.accountEmail = email;
    }
    */
    // Variables for Toolbar Support
    //private Toolbar toolbar;
    //private DrawerLayout drawer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_account);
        //Adds Toolbar and Removes Drawer Menu Scrim
        this.addNavigationMenu();

        Intent intent = getIntent();
        String username = intent.getStringExtra("username");

        EditText editText = (EditText) findViewById(R.id.editText);

        editText.setText(username);

        final Button eventButton = (Button) findViewById(R.id.eventButton);
        final Button friendButton = (Button) findViewById(R.id.friendButton);
        eventButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent eventIntent = new Intent(Account.this, EventMakerActivity.class);
                Account.this.startActivity(eventIntent);
            }
        });

        friendButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent eventIntent = new Intent(Account.this, FriendSearchActivity.class);
                Account.this.startActivity(eventIntent);
            }
        });
    }
    public void goToEventMaker(View view){
        Intent intent = new Intent (this, EventMakerActivity.class);
        startActivity(intent);
    }

    public void goToMain(View view) {
        Intent intent = new Intent (this, MainActivity.class);
        startActivity(intent);
    }

        // Add Toolbar Support
        /*toolbar = (Toolbar) findViewById(R.id.app_bar);
        setSupportActionBar(toolbar);
        drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.setScrimColor(Color.TRANSPARENT);*/
        /*
        String accountName;
        String accountPassword;
        String accountEmail;
        java.util.Collection accountInterests;

        this.setAccountName(name);
        this.setAccountPassword(password);
        this.setAccountEmail(email);

        */


}