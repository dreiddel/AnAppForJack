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

public class EventMakerActivity extends NavigationAppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_event_maker);

        //Add Toolbar and Remove Drawer Scrim
        Toolbar toolbar = (Toolbar) findViewById(R.id.app_bar);
        setSupportActionBar(toolbar);
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.setScrimColor(Color.TRANSPARENT);

        final EditText etEvent = (EditText) findViewById(R.id.etEvent);
        final EditText etLocation = (EditText) findViewById(R.id.etLocation);
        final EditText etTime = (EditText) findViewById(R.id.etTime);
        final Button bEventCreatorButton = (Button) findViewById(R.id.bEventCreatorButton);

        bEventCreatorButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final String strEvent = etEvent.getText().toString();
                final String strLocation = etLocation.getText().toString();
                final String strTime = etTime.getText().toString();

                Response.Listener<String> responseListener = new Response.Listener<String>() {
                    @Override
                    public void onResponse(String response) {


                        try {
                            JSONObject jsonResponse = new JSONObject(response);
                            boolean success = jsonResponse.getBoolean("success");
                            if (success) {
                                Intent intent = new Intent(EventMakerActivity.this, LoginActivity.class);
                                EventMakerActivity.this.startActivity(intent);
                            } else {
                                AlertDialog.Builder builder = new AlertDialog.Builder(EventMakerActivity.this);
                                builder.setMessage("Registration Failed")
                                        .setNegativeButton("Retry", null)
                                        .create()
                                        .show();
                            }
                        } catch (JSONException e) {
                            e.printStackTrace();
                        }

                    }
                };

                EventMakerRequest eventMakerRequest = new EventMakerRequest(strEvent, strLocation, strTime, responseListener);
                RequestQueue queue = Volley.newRequestQueue(EventMakerActivity.this);
                queue.add(eventMakerRequest);
            }
        });
    }

    }