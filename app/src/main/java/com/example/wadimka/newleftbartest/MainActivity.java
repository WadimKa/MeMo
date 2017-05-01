package com.example.wadimka.newleftbartest;

import android.os.Bundle;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;
import android.widget.Toast;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {
    TextView title, text;
    String [] arrayForBodyText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        title = (TextView) findViewById(R.id.titleForScreen);
        text = (TextView) findViewById(R.id.justText);
        arrayForBodyText = getResources().getStringArray(R.array.text);


        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);



    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {


        title.setText(item.getTitle());
        switch (item.getItemId()){
            case R.id.MIN:splitStringsWithOut(arrayForBodyText[0]);
                break;
            case R.id.DIN:splitStringsWithOut(arrayForBodyText[1]);
                break;
            case R.id.UDIN:splitStringsWithOut(arrayForBodyText[2]);
                break;

            case R.id.SDSK:splitStrings(arrayForBodyText[3]);
                break;
            case R.id.LIVEZONE:splitStrings(arrayForBodyText[4]);
                break;
            case R.id.DK:splitStrings(arrayForBodyText[5]);
                break;
            case R.id.SVID:splitStrings(arrayForBodyText[6]);
                break;
            case R.id.KPP:splitStrings(arrayForBodyText[7]);
                break;
            case R.id.KVO:splitStrings(arrayForBodyText[8]);
                break;
            case R.id.OG:splitStrings(arrayForBodyText[9]);
                break;
            case R.id.TSO:splitStrings(arrayForBodyText[10]);
                break;


            case R.id.s26:splitStrings(arrayForBodyText[11]);
                break;
            case R.id.s27:splitStrings(arrayForBodyText[12]);
                break;
            case R.id.s28:splitStrings(arrayForBodyText[13]);
                break;
            case R.id.s29:splitStrings(arrayForBodyText[14]);
                break;

            case R.id.SHLIVEZONE:splitStrings(arrayForBodyText[15]);
                break;
            case R.id.SHDK:splitStrings(arrayForBodyText[16]);
                break;
            case R.id.SH:splitStrings(arrayForBodyText[17]);
                break;
            case R.id.SHSOCKET:splitStrings(arrayForBodyText[18]);
                break;
            case R.id.LAW:splitStrings(arrayForBodyText[19]);
                break;
            case R.id.PROV:splitStrings(arrayForBodyText[20]);
                break;
            case R.id.TREV:splitStrings(arrayForBodyText[21]);
                break;
            case R.id.NADZ:splitStrings(arrayForBodyText[22]);
                break;
            case R.id.MAG:splitStrings(arrayForBodyText[23]);
                break;
            case R.id.PROD:splitStrings(arrayForBodyText[24]);
                break;
        }


        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }

    public void splitStrings(String stringForSplit){
        StringBuilder stringBuilder = new StringBuilder();
        String[] array = stringForSplit.split(";");
        for (String line : array){
            stringBuilder.append(line);
            stringBuilder.append("\n");
             stringBuilder.append("\n");
        }
        text.setText(stringBuilder.toString());
    }
    public void splitStringsWithOut(String stringForSplit){
        StringBuilder stringBuilder = new StringBuilder();
        String[] array = stringForSplit.split(";");
        for (String line : array){
            stringBuilder.append(line);
            stringBuilder.append("\n");
            //stringBuilder.append("\n");
        }
        text.setText(stringBuilder.toString());
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();

        if (id == R.id.action_settings) {
            title.setText("About the author");
            splitStringsWithOut(arrayForBodyText[25]);
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
