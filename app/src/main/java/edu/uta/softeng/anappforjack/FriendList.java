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


    protected TextView[] generateTextViews(int textViewCount) {

        TextView[] textViewArray = new TextView[textViewCount];

        for(int i = 0; i < textViewCount; i++) {
            textViewArray[i] = new TextView(this);
        }

        return textViewArray;
    }
    /*private String[] users = {"Name", "People", "Other Name"};*/
    /*protected void usersFromDatabase(String[] Users, int userCount) {
        Users[0] = "A";

    }*/

    protected void setTextViews(int textViewCount, String[] users, LinearLayout ll) {
        TextView[] textViewArray = generateTextViews(textViewCount);

        for(int i = 0; i < textViewCount; i++) {
            textViewArray[i].setText(users[i]);

            textViewArray[i].setTextSize(TypedValue.COMPLEX_UNIT_PX,
                    getResources().getDimension(R.dimen.user_text_size));

            textViewArray[i].setHeight((int)TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP,
                    48, getResources().getDisplayMetrics()));

            textViewArray[i].setBackgroundResource(R.drawable.color_state_user_list);

            textViewArray[i].setPadding((int)TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP,
                    10, getResources().getDisplayMetrics()),
                    (int)TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP,
                            8, getResources().getDisplayMetrics()), 0, 0);
            ll.addView(textViewArray[i]);
            textViewArray[i].setOnClickListener(new View.OnClickListener() {

                @Override
                public void onClick(View view) {
                    Intent registerIntent = new Intent(FriendList.this, Account.class);
                    FriendList.this.startActivity(registerIntent);
                    /*Toast.makeText(getApplicationContext(), "ID : "+arg0.getId(), Toast.LENGTH_SHORT).show();*/
                }
            });
        }
    }
}
