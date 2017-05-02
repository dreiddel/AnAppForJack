package edu.uta.softeng.anappforjack;
        import android.content.Intent;
        import android.support.v7.app.AppCompatActivity;
        import android.os.Bundle;
        import android.view.View;
        import android.widget.Button;
        import android.widget.EditText;
        import android.widget.TextView;

public class UserAreaActivity extends NavigationAppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_area);

        Intent intent = getIntent();
        String email = intent.getStringExtra("email");
        String username = intent.getStringExtra("username");

        TextView tvWelcomeMsg = (TextView) findViewById(R.id.tvWelcomeMsg);
        EditText etUsername = (EditText) findViewById(R.id.etUsername);
        EditText etemail = (EditText) findViewById(R.id.etemail);
        // Display user details
        String message = email + " welcome to your user area";
        tvWelcomeMsg.setText(message);
        etemail.setText(email);
        etUsername.setText(username);
        final Button bTempEvent = (Button) findViewById(R.id.bTempEvent);

        bTempEvent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent eventIntent = new Intent(UserAreaActivity.this, EventMakerActivity.class);
                UserAreaActivity.this.startActivity(eventIntent);
            }
        });
    }
}
