package orvnge.com.fragement;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class SliderBar extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {



    //private FragmentManager fManager;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_slider_bar);


        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);

        //fManager = getFragmentManager();
        //bindViews();
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

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.slider_bar, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }


        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        FragmentManager fm = getFragmentManager();
        //开启Fragment事务
        FragmentTransaction transaction = fm.beginTransaction();




        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.nav_camera) {


            // Handle the camera action
        } else if (id == R.id.nav_gallery) {

            transaction.add(R.id.id_toolbar, new f2()).commit();

        } else if (id == R.id.nav_slideshow) {

            Toast.makeText(SliderBar.this, "我是fragment", Toast.LENGTH_SHORT).show();


        } else if (id == R.id.nav_manage) {

        } else if (id == R.id.nav_share) {

            transaction.replace(R.id.id_toolbar, new Slider_Fragement()).commit();

        } else if (id == R.id.nav_send) {

            startActivity(new Intent(SliderBar.this,MainActivity.class));

        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }

//    @Override
//    public boolean onContextItemSelected(MenuItem item) {
//        FragmentManager fm = getFragmentManager();
//        // 开启Fragment事务
//        FragmentTransaction transaction = fm.beginTransaction();
//
//        switch (item.getItemId()){
//            case R.id.nav_gallery:
//                transaction.add(R.id.f1111, new f2()).commit();
//                break;
//            case R.id.nav_send:
//                startActivity(new Intent(SliderBar.this,MainActivity.class));
//                break;
//
//
////            case R.id.nav_manage:
////                Toast.makeText(getApplicationContext(), R.string, Toast.LENGTH_SHORT).show();
//
//        }
//        return true;
//    }

}
