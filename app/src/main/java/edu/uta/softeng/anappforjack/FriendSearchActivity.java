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

//Class to search for friend's based on user's interest by Julian Ducharme, 1001014461

public class FriendSearchActivity extends NavigationAppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_friend_search);

        //Add Toolbar and Remove Drawer Scrim
        Toolbar toolbar = (Toolbar) findViewById(R.id.app_bar);
        setSupportActionBar(toolbar);
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.setScrimColor(Color.TRANSPARENT);

        final EditText etInterestSearch = (EditText) findViewById(R.id.etInterestSearch);

        final Button bFriendSearchButton = (Button) findViewById(R.id.bFriendSearchButton);

        bFriendSearchButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                final String strInterestSearch = etInterestSearch.getText().toString();
                Intent eventIntent = new Intent(FriendSearchActivity.this, FriendResultsActivity.class);
                eventIntent.putExtra("interestsearch", strInterestSearch);
                FriendSearchActivity.this.startActivity(eventIntent);
            }
        });
    }

}