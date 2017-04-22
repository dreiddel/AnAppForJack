package edu.uta.softeng.anappforjack;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

/**
 * Project: An App for Jack
 * Client:  Dr. Bahram Khalili, UTA CSE 3310 Software Engineering
 *
 * Author: Michael O'Leary
 * Description: Class defining a user account.
 *
 * To Do: Add a list of subscribing clients.
 **/
public class Account extends AppCompatActivity {

    String accountName;
    String accountPassword;
    String accountEmail;
    java.util.Collection accountInterests;

    Account(String name, String password, String email) {
        this.setAccountName(name);
        this.setAccountPassword(password);
        this.setAccountEmail(email);

    }

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

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_account);
    }
}