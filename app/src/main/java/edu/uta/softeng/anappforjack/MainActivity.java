package edu.uta.softeng.anappforjack;

import android.content.Intent;
import android.graphics.Color;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.MotionEvent;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void perform_action(View v)
    {
        TextView tv1 = (TextView) findViewById(R.id.textView);
        tv1.setBackgroundResource(R.color.colorGrey6);
        //tv1.setBackgroundColor(getResources().getColor(R.color.colorGrey6));
        goToAccount(tv1);
        /* try {
            Thread.sleep(500);
        } catch(InterruptedException ex) {
            Thread.currentThread().interrupt();
        }
        tv1.setBackgroundColor(getResources().getColor(R.color.colorTransparent)); */
    }

    public void click_color(View v) {
        v.setOnTouchListener(new View.OnTouchListener() {
            public boolean onTouch(View v, MotionEvent event) {
                if (event.getAction() == android.view.MotionEvent.ACTION_DOWN) {
                    v.setBackgroundResource(R.color.colorGrey6);
                } else if (event.getAction() == android.view.MotionEvent.ACTION_UP) {
                    v.setBackgroundResource(R.color.colorTransparent);
                }
                return true;
            }
        });
    }

    protected void goToLogin(View view){
        Intent intent = new Intent (this, LoginActivity.class);
        startActivity(intent);
    }

    protected void goToRegister(View view){
        Intent intent = new Intent (this, RegisterActivity.class);
        startActivity(intent);
    }

    protected void goToUserArea(View view){
        Intent intent = new Intent (this, UserAreaActivity.class);
        startActivity(intent);
    }

    protected void goToAccount(View view){
        DrawerLayout mDrawerLayout = (DrawerLayout) findViewById(R.id.drawer_layout);
        mDrawerLayout.closeDrawers();
        Intent intent = new Intent (this, Account.class);
        startActivity(intent);
    }

    protected void goToInterest(View view){
        Intent intent = new Intent (this, Interest.class);
        startActivity(intent);
    }

}
