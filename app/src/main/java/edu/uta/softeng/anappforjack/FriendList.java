package edu.uta.softeng.anappforjack;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

public class FriendList extends NavigationAppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_friend_list);
        this.addNavigationMenu();

        String[] users = {"Name", "People", "Other Name", "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P"};
        LinearLayout ll = (LinearLayout) findViewById(R.id.friend_list);
        setTextViews(19, users, ll);
    }


    protected TextView[][] generateTextViews(int textViewCount) {

        TextView[][] textViewArray = new TextView[3][textViewCount];

        for(int i = 0; i < textViewCount; i++) {
            textViewArray[0][i] = (TextView)getLayoutInflater().inflate(R.layout.text_view_style, null);
            textViewArray[1][i] = (TextView)getLayoutInflater().inflate(R.layout.user_list_divider, null);
            textViewArray[2][i] = (TextView)getLayoutInflater().inflate(R.layout.user_list_divider_light, null);
        }

        return textViewArray;
    }
    /*private String[] users = {"Name", "People", "Other Name"};*/
    /*protected void usersFromDatabase(String[] Users, int userCount) {
        Users[0] = "A";

    }*/

    protected void setTextViews(int textViewCount, String[] users, LinearLayout ll) {
        TextView[][] textViewArray = generateTextViews(textViewCount);
        /*TextView user_list_div = new TextView(this);*/
        TextView user_list_div = (TextView)getLayoutInflater().inflate(R.layout.user_list_divider, null);

        for(int i = 0; i < textViewCount; i++) {
            textViewArray[0][i].setText(users[i]);

            /*textViewArray[i].setTextSize(TypedValue.COMPLEX_UNIT_PX,
                    getResources().getDimension(R.dimen.user_text_size));

            textViewArray[i].setHeight((int)TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP,
                    48, getResources().getDisplayMetrics()));

            textViewArray[i].setBackgroundResource(R.drawable.color_state_user_list);

            textViewArray[i].setPadding((int)TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP,
                    10, getResources().getDisplayMetrics()),
                    (int)TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP,
                            8, getResources().getDisplayMetrics()), 0, 0);*/
            ll.addView(textViewArray[0][i]);
            textViewArray[0][i].setOnClickListener(new View.OnClickListener() {

                @Override
                public void onClick(View view) {
                    Intent registerIntent = new Intent(FriendList.this, Account.class);
                    FriendList.this.startActivity(registerIntent);
                    /*Toast.makeText(getApplicationContext(), "ID : "+arg0.getId(), Toast.LENGTH_SHORT).show();*/
                }
            });
            ll.addView(textViewArray[1][i]);
            ll.addView(textViewArray[2][i]);
        }
    }
}
