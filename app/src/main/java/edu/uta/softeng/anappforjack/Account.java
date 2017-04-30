package edu.uta.softeng.anappforjack;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
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

        //Add Toolbar and Remove Drawer Scrim
        Toolbar toolbar = (Toolbar) findViewById(R.id.app_bar);
        setSupportActionBar(toolbar);
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.setScrimColor(Color.TRANSPARENT);

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
}