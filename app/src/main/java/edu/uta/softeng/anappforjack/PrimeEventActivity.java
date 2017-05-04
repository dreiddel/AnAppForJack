package edu.uta.softeng.anappforjack;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

//Class for displaying events by Julian Ducharme, 1001014461

public class PrimeEventActivity extends NavigationAppCompatActivity {
    @Override
    protected void addNavigationMenu() {
        Toolbar toolbar = (Toolbar) findViewById(R.id.app_bar);
        setSupportActionBar(toolbar);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_prime_event);
        this.addNavigationMenu();


        /*TextView tvHeaderMsg = (TextView) findViewById(R.id.tvHeaderMsg);
        final Button bBack = (Button) findViewById(R.id.bTempEvent);
        final Button bNewEvent = (Button) findViewById (R.id.bNewEvent);

        String message = tvHeaderMsg.getText().toString();
        tvHeaderMsg.setText(message);

        bNewEvent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent eventIntent = new Intent(PrimeEventActivity.this, EventMakerActivity.class);
                PrimeEventActivity.this.startActivity(eventIntent);
            }
        });

        bBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent eventIntent = new Intent(PrimeEventActivity.this, Account.class);
                PrimeEventActivity.this.startActivity(eventIntent);
            }
        });*/
    }
}
