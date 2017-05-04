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

//Class for displaying results of friends based on interests by Julian Ducharme, 1001014461

public class FriendResultsActivity extends NavigationAppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_friend_results);

        Intent intent = getIntent();
        String username = intent.getStringExtra("interestsearch");

        EditText editText = (EditText) findViewById(R.id.editText);
        String newusername = "Those that like " + username + ":";
        editText.setText(newusername);

        Toolbar toolbar = (Toolbar) findViewById(R.id.app_bar);
        setSupportActionBar(toolbar);
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.setScrimColor(Color.TRANSPARENT);
        final Button friendButton = (Button) findViewById(R.id.friendButton);
        friendButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent eventIntent = new Intent(FriendResultsActivity.this, SecondPersonAccountActivity.class);
                FriendResultsActivity.this.startActivity(eventIntent);
            }
        });

    }


}