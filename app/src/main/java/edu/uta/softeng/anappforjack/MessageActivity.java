package edu.uta.softeng.anappforjack;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

//Unused test page for oringinal registration/login features, code mainly by https://github.com/tonikami with modifications by Julian Ducharme.

public class MessageActivity extends NavigationAppCompatActivity {

    //Override to Remove Navigation Drawer Functions
    @Override
    protected void addNavigationMenu() {
        Toolbar toolbar = (Toolbar) findViewById(R.id.app_bar);
        setSupportActionBar(toolbar);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_message);
        this.addNavigationMenu();

        final Button bBack = (Button) findViewById(R.id.bBack);

        bBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent eventIntent = new Intent(MessageActivity.this, Account.class);
                MessageActivity.this.startActivity(eventIntent);
            }
        });




    }
}