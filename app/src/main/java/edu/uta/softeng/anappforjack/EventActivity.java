package edu.uta.softeng.anappforjack;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class EventActivity extends NavigationAppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_event);

        Intent intent = getIntent();
        String name = intent.getStringExtra("event");
        String location = intent.getStringExtra("location");
        String time = intent.getStringExtra("time");

        TextView tvWelcomeMsg = (TextView) findViewById(R.id.tvWelcomeMsg);
        EditText etUsername = (EditText) findViewById(R.id.etUsername);
        EditText etemail = (EditText) findViewById(R.id.etPlace);
        EditText etTime = (EditText) findViewById(R.id.etemail);
        // Display user details
        String message = "Event: ";
        tvWelcomeMsg.setText(message);
        etTime.setText(time);
        etemail.setText(location);
        etUsername.setText(name);
        final Button bTempEvent = (Button) findViewById(R.id.bTempEvent);

        bTempEvent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent eventIntent = new Intent(EventActivity.this, Account.class);
                EventActivity.this.startActivity(eventIntent);
            }
        });
    }
}
