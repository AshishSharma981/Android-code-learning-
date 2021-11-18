# Android-code-learning-

//Splash Screen Code in first in execute 

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class Splash extends Activity {

    /** Duration of wait **/
    private final int SPLASH_DISPLAY_LENGTH = 1000;

    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle icicle) {
        super.onCreate(icicle);
        setContentView(R.layout.splashscreen);

        /* New Handler to start the Menu-Activity 
         * and close this Splash-Screen after some seconds.*/
        new Handler().postDelayed(new Runnable(){
            @Override
            public void run() {
                /* Create an Intent that will start the Menu-Activity. */
                Intent mainIntent = new Intent(Splash.this,Menu.class);
                Splash.this.startActivity(mainIntent);
                Splash.this.finish();
            }
        }, SPLASH_DISPLAY_LENGTH);
    }
}












package com.app.androidcode;

import android.app.ProgressDialog;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.view.Menu;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;
import com.google.android.material.navigation.NavigationView;

import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

public class MainActivity extends AppCompatActivity {
    Intent intent = null, chooser=null;
    public Intent Intent;
    private AppBarConfiguration mAppBarConfiguration;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        NavigationView navigationView = findViewById(R.id.nav_view);
        // Passing each menu ID as a set of Ids because each
        // menu should be considered as top level destinations.
        mAppBarConfiguration = new AppBarConfiguration.Builder(
                R.id.nav_home, R.id.nav_gallery, R.id.nav_slideshow)
                .setDrawerLayout(drawer)
                .build();
        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment);
        NavigationUI.setupActionBarWithNavController(this, navController, mAppBarConfiguration);
        NavigationUI.setupWithNavController(navigationView, navController);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }








    @Override
    public boolean onSupportNavigateUp() {
        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment);
        return NavigationUI.navigateUp(navController, mAppBarConfiguration)
                || super.onSupportNavigateUp();
    }


    public void intro(View v) {
        Intent i = new Intent(MainActivity.this, MainActivity2.class);
        startActivity(i);

    }
    public void basics(View v) {
        Intent i = new Intent(MainActivity.this, MainActivity5.class);
        startActivity(i);

    }
    public void project(View v) {
        Intent i = new Intent(MainActivity.this,ProjectStructure .class);
        startActivity(i);

    }

    public void basic(View v) {
        Intent i = new Intent(MainActivity.this, MainActivity3.class);
        startActivity(i);

    }
    public void biginner(View v) {
        Intent i = new Intent(MainActivity.this, MainActivity5.class);
        startActivity(i);

    }
    public void layout(View v) {
        Intent i = new Intent(MainActivity.this, Layout.class);
        startActivity(i);
    }

    public void basicjava(View v) {
        Intent i = new Intent(MainActivity.this, Basicjava.class);
        startActivity(i);
    }

    public void quisejava(View v) {
        Intent i = new Intent(MainActivity.this, Quissejava.class);
        startActivity(i);
    }

    public void more(View v) {
        Intent = new Intent(Intent.ACTION_VIEW);
        Intent.setData(Uri.parse("https://play.google.com/store/search?q=android%20learning%20app&c=apps"));
        chooser = Intent.createChooser(Intent, "launch Play Store");
        startActivity(chooser);

    }
    public void gradel(View v) {
        Intent i = new Intent(MainActivity.this, Gradel.class);
        startActivity(i);

    }

    public void inter(View v) {
        Intent i = new Intent(MainActivity.this, MainActivity4.class);
        startActivity(i);

    }



    public boolean onNavigationItemSelected(MenuItem item) {

        switch (item.getItemId()) {
            case R.id.item:
                Intent = new Intent(Intent.ACTION_VIEW);
                Intent.setData(Uri.parse("https://ashishccom.blogspot.com/2020/08/privacy-policy-ashish-sharma-built.html"));
                chooser = Intent.createChooser(Intent, "launch Play Store");
                startActivity(chooser);
                break;
        }
        return true;
    }

}







