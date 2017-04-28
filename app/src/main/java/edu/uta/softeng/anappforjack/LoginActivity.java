package edu.uta.softeng.anappforjack;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        final android.widget.EditText etPassword = (android.widget.EditText) findViewById(R.id.etPassword);
        final android.widget.EditText etUsername = (android.widget.EditText) findViewById(R.id.etUsername);
        final android.widget.Button button2 = (Button) findViewById(R.id.button2);
        final android.widget.TextView registerLink = (TextView) findViewById(R.id.bRegisterHere);

        registerLink.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent registerIntent = new Intent (LoginActivity.this, RegisterActivity.class);
                LoginActivity.this.startActivity(registerIntent);

            }
        });

    }
}
