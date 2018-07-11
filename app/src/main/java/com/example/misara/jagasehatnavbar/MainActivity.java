package com.example.misara.jagasehatnavbar;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.app.NotificationCompat;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

import java.util.Timer;

public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    private TextView text;
    public static final int NOTIFICATION_ID = 1;
    private Timer 

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

//        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
//        fab.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
//                        .setAction("Action", null).show();
//            }
//        });

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);

        FragmentManager managerHome = getFragmentManager();
        managerHome.beginTransaction()
                .replace(R.id.fragment, new DashboardFragment())
                .commit();

    }
//
    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
//            super.onBackPressed();
            FragmentManager home = getFragmentManager();
            home.beginTransaction()
                    .replace(R.id.fragment, new DashboardFragment())
                    .commit();
        }
    }
//opsi yg atas kanan
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
//        if (id == R.id.action_settings) {
//            return true;
//        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.nav_pg1) {
            // Handle the camera action
        } else if (id == R.id.nav_pg2) {

        } else if (id == R.id.nav_pg3) {

        } else if (id == R.id.nav_pg4) {

        } else if (id == R.id.nav_contact) {

        } else if (id == R.id.nav_share) {

        } else{
            FragmentManager managerdefault = getFragmentManager();
            managerdefault.beginTransaction()
                    .replace(R.id.fragment, new DashboardFragment())
                    .commit();
        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);

        switch (item.getItemId()) {
            case R.id.nav_pg1:
                FragmentManager pg1 = getFragmentManager();
                pg1.beginTransaction()
                        .replace(R.id.fragment, new Page1Fragment())
                        .commit();
                break;
            case R.id.nav_pg2:
                FragmentManager pg2 = getFragmentManager();
                pg2.beginTransaction()
                        .replace(R.id.fragment, new Page2Fragment())
                        .commit();
                break;
            case R.id.nav_pg3:
                FragmentManager pg3 = getFragmentManager();
                pg3.beginTransaction()
                        .replace(R.id.fragment, new Page3Fragment())
                        .commit();
                break;
            case R.id.nav_pg4:
                FragmentManager pg4 = getFragmentManager();
                pg4.beginTransaction()
                        .replace(R.id.fragment, new Page4Fragment())
                        .commit();
            case R.id.nav_share:
                Intent i = new Intent(android.content.Intent.ACTION_SEND);
                i.setType("text/plain");
                i.putExtra(android.content.Intent.EXTRA_TEXT, "My new app https://play.google.com/store/search?q=TECHHUBINDIAN");
                startActivity(Intent.createChooser(i,"Share Via"));
                break;
            case R.id.nav_contact:
                FragmentManager manager = getFragmentManager();
                manager.beginTransaction()
                        .replace(R.id.fragment, new KontakFragment())
                        .commit();
                break;
            default:
                FragmentManager manager1 = getFragmentManager();
                manager1.beginTransaction()
                        .replace(R.id.fragment, new DashboardFragment())
                        .commit();
        }

//        Toast.makeText(getApplicationContext(), "You click on menu share", Toast.LENGTH_SHORT).show();
        return true;
    }

    public void onClickPage1(View v) {
        FragmentManager pg1 = getFragmentManager();
        pg1.beginTransaction()
                .replace(R.id.fragment, new Page1Fragment())
                .commit();
    }

    public void onClickPage2(View v) {
        FragmentManager pg2 = getFragmentManager();
        pg2.beginTransaction()
                .replace(R.id.fragment, new Page2Fragment())
                .commit();
    }

    public void onClickPage3(View v) {
        FragmentManager pg3 = getFragmentManager();
        pg3.beginTransaction()
                .replace(R.id.fragment, new Page3Fragment())
                .commit();
    }

    public void onClickPage4(View v) {
        FragmentManager pg4 = getFragmentManager();
        pg4.beginTransaction()
                .replace(R.id.fragment, new Page4Fragment())
                .commit();
    }

    public void onClickHome (View v){
        FragmentManager manager1 = getFragmentManager();
        manager1.beginTransaction()
                .replace(R.id.fragment, new DashboardFragment())
                .commit();
    }

    public void onClickNext2 (View v){
        FragmentManager pg2 = getFragmentManager();
        pg2.beginTransaction()
                .replace(R.id.fragment, new Page2Fragment())
                .commit();
    }

    public void onClickNext3 (View v){
        FragmentManager pg3 = getFragmentManager();
        pg3.beginTransaction()
                .replace(R.id.fragment, new Page3Fragment())
                .commit();
    }

    public void onClickPrev1 (View v){
        FragmentManager pg1 = getFragmentManager();
        pg1.beginTransaction()
                .replace(R.id.fragment, new Page1Fragment())
                .commit();
    }

    public void onClickNext4 (View v){
        FragmentManager pg4 = getFragmentManager();
        pg4.beginTransaction()
                .replace(R.id.fragment, new Page4Fragment())
                .commit();
    }

    public void onClickPrev2 (View v) {
        FragmentManager pg2 = getFragmentManager();
        pg2.beginTransaction()
                .replace(R.id.fragment, new Page2Fragment())
                .commit();
    }

    public void onClickPrev3 (View v) {
        FragmentManager pg3 = getFragmentManager();
        pg3.beginTransaction()
                .replace(R.id.fragment, new Page3Fragment())
                .commit();
    }

    public void onClickCall (@NonNull  View v){
//        setContentView(R.layout.fragment_kontak);
//        text = findViewById(R.id.number);
        Intent i = new Intent(Intent.ACTION_DIAL, Uri.parse("081234567890"));
        startActivity(i);
    }

    public void tampilNotification(View view) {

        Intent intent = new Intent(Intent.ACTION_VIEW,
                Uri.parse("http://www.okedroid.com/"));
        //menginisialiasasi intent
        PendingIntent pendingIntent = PendingIntent.getActivity(this, 0, intent, 0);
        //untuk memanggil activity di Notification
        /*
Menmbangun atau mensetup Notification dengan NotificationCompat.Builder
 */
        NotificationCompat.Builder builder = (NotificationCompat.Builder) new NotificationCompat.Builder(this)
                .setSmallIcon(R.mipmap.ic_launcher) //ikon notification
                .setContentTitle("1 Postingan Baru")//judul konten
                .setContentIntent(pendingIntent)//memanggil object pending intent
                .setAutoCancel(true)//untuk menswipe atau menghapus notification
                .setContentText("Kunjungi blog okedroid.com"); //isi text

/*
Kemudian kita harus menambahkan Notification dengan menggunakan NotificationManager
 */

        NotificationManager notificationManager = (NotificationManager) getSystemService(Context.NOTIFICATION_SERVICE);

        notificationManager.notify(NOTIFICATION_ID, builder.build()
        );
    }
}
