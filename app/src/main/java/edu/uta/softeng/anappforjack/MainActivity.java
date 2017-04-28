package edu.uta.softeng.anappforjack;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    protected void goToLogin(View view){
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
        Intent intent = new Intent (this, Account.class);
        startActivity(intent);
    }

    protected void goToInterest(View view){
        Intent intent = new Intent (this, Interest.class);
        startActivity(intent);
    }

}
