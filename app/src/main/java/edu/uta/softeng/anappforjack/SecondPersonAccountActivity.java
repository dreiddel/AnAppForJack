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

import com.android.volley.Response;

//Class intended for displaying pages of other users to primary logged on user. Based on 'Account.java' by Michael O'Leary, modified by Julian Ducharme, 1001014461.

public class SecondPersonAccountActivity  extends NavigationAppCompatActivity {



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
        protected void onCreate (Bundle savedInstanceState){

            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_second_pers_account);

            Intent intent = getIntent();
            String username = intent.getStringExtra("username");

            EditText editText = (EditText) findViewById(R.id.editText);

            editText.setText(username);

            //Add Toolbar and Remove Drawer Scrim
            this.addNavigationMenu();

            final Button friendButton = (Button) findViewById(R.id.friendButton);
            friendButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    RegisterActivity reg = new RegisterActivity();{
                        String thename = reg.pubUseName;
                        Intent eventIntent = new Intent(SecondPersonAccountActivity.this, Account.class);
                        eventIntent.putExtra("username", thename);
                        SecondPersonAccountActivity.this.startActivity(eventIntent);
                    }

                }
            });
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