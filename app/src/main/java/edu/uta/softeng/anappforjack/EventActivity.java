package edu.uta.softeng.anappforjack;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

//class for displaying events by Julian Ducharme 1001014461

public class EventActivity extends NavigationAppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_event);
        this.addNavigationMenu();

        Intent intent = getIntent();
        String name = EventMakerActivity.pubEventName;
        String location = EventMakerActivity.pubEventLocation;
        String time = EventMakerActivity.pubEventTime;

        TextView tvWelcomeMsg = (TextView) findViewById(R.id.tvWelcomeMsg);
        EditText etUsername = (EditText) findViewById(R.id.etEvent);
        EditText etemail = (EditText) findViewById(R.id.etLocation);
        EditText etTime = (EditText) findViewById(R.id.etTime);
        String message = "Event: ";
        tvWelcomeMsg.setText(message);
        etTime.setText(time);
        etemail.setText(location);
        etUsername.setText(name);
        final Button bTempEvent = (Button) findViewById(R.id.bTempEvent);
        final Button bNewEvent = (Button) findViewById (R.id.bNewEvent);

        bNewEvent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent eventIntent = new Intent(EventActivity.this, EventMakerActivity.class);
                EventActivity.this.startActivity(eventIntent);
            }
        });

        bTempEvent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent eventIntent = new Intent(EventActivity.this, Account.class);
                EventActivity.this.startActivity(eventIntent);
            }
        });
    }
}
