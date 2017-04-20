package edu.uta.softeng.anappforjack;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;

public class RegisterActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        final android.widget.EditText etPasswordCheck = (android.widget.EditText) findViewById(R.id.etPasswordCheck);
        final android.widget.EditText etPassword = (android.widget.EditText) findViewById(R.id.etPassword);
        final android.widget.EditText etUsername = (android.widget.EditText) findViewById(R.id.etUsername);
        final android.widget.EditText etemail = (android.widget.EditText) findViewById(R.id.etemail);

        final android.widget.Button button = (Button) findViewById(R.id.button);
    }
}
