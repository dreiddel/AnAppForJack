package edu.uta.softeng.anappforjack;

import android.os.Bundle;

public class MainActivity extends NavigationAppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.addNavigationMenu();
    }
}
