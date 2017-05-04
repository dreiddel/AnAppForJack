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
import org.json.JSONException;
import org.json.JSONObject;
import android.app.AlertDialog;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.toolbox.Volley;

//Class for initial user registration by Julian Ducharme, 1001014461

public class RegisterActivity extends NavigationAppCompatActivity {
    //Override to Remove Navigation Drawer Functions
    @Override
    protected void addNavigationMenu() {
        Toolbar toolbar = (Toolbar) findViewById(R.id.app_bar);
        setSupportActionBar(toolbar);
    }

    public String pubUseName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        //Add Toolbar and Remove Drawer Scrim
        this.addNavigationMenu();
        final EditText etemail = (EditText) findViewById(R.id.etemail);
        final EditText etUsername = (EditText) findViewById(R.id.etUsername);
        final EditText etPassword = (EditText) findViewById(R.id.etPassword);
        final EditText etPasswordCheck = (EditText) findViewById(R.id.etPasswordCheck);
        final Button bRegisterButton = (Button) findViewById(R.id.bRegisterButton);

        bRegisterButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final String stremail = etemail.getText().toString();
                final String strUsername = etUsername.getText().toString();
                pubUseName = etUsername.getText().toString();
                final String strPassword = etPassword.getText().toString();
                final String strPasswordCheck = etPasswordCheck.getText().toString();

                Response.Listener<String> responseListener = new Response.Listener<String>() {
                    @Override
                    public void onResponse(String response) {
                        if (stremail.matches("")) {
                            AlertDialog.Builder builder = new AlertDialog.Builder(RegisterActivity.this);
                            builder.setMessage("Please enter an email address")
                                    .setNegativeButton("Retry", null)
                                    .create()
                                    .show();
                        } else if (strUsername.matches("")) {
                            AlertDialog.Builder builder = new AlertDialog.Builder(RegisterActivity.this);
                            builder.setMessage("Please enter a username")
                                    .setNegativeButton("Retry", null)
                                    .create()
                                    .show();
                        } else if (strPassword.equals(strPasswordCheck)) {


                            try {
                                JSONObject jsonResponse = new JSONObject(response);
                                boolean success = jsonResponse.getBoolean("success");
                                if (success) {
                                    Intent intent = new Intent(RegisterActivity.this, LoginActivity.class);
                                    RegisterActivity.this.startActivity(intent);
                                } else {
                                    AlertDialog.Builder builder = new AlertDialog.Builder(RegisterActivity.this);
                                    builder.setMessage("Failed to Register")
                                            .setNegativeButton("Retry", null)
                                            .create()
                                            .show();
                                }
                            } catch (JSONException e) {
                                e.printStackTrace();
                            }

                        } else {
                            AlertDialog.Builder builder = new AlertDialog.Builder(RegisterActivity.this);
                            builder.setMessage("Your given passwords do not match")
                                    .setNegativeButton("Retry", null)
                                    .create()
                                    .show();
                        }
                    }

                };

                RegisterRequest registerRequest = new RegisterRequest(stremail, strUsername, strPassword, strPasswordCheck, responseListener);
                RequestQueue queue = Volley.newRequestQueue(RegisterActivity.this);
                queue.add(registerRequest);
            }
        });
    }
}