package com.example.mohamedelnhrawy.sculatask;

import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.example.mohamedelnhrawy.sculatask.adapter.Account_Header_Adapter;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener, View.OnClickListener {

    @BindView(R.id.ll_home)
    LinearLayout ll_home;

    @BindView(R.id.ll_myprofile)
    LinearLayout ll_myprofile;

    @BindView(R.id.ll_events)
    LinearLayout ll_events;

    @BindView(R.id.ll_favourites)
    LinearLayout ll_favourites;

    @BindView(R.id.rl_inbox)
    RelativeLayout rl_inbox;


    @BindView(R.id.ll_contactus)
    LinearLayout ll_contactus;

    @BindView(R.id.ll_feedback)
    LinearLayout ll_feedback;

    @BindView(R.id.ll_settings)
    LinearLayout ll_settings;


    @BindView(R.id.rl_addschool)
    RelativeLayout rl_addschool;

    @BindView(R.id.rl_myschools)
    RelativeLayout rl_myschools;

    @BindView(R.id.rl_guideline)
    RelativeLayout rl_guideline;

    @BindView(R.id.rl_logout)
    RelativeLayout rl_logout;

    @BindView(R.id.tv_operation)
    TextView tv_operation;

    @BindView(R.id.drawer_layout)
    DrawerLayout drawer;

    @OnClick(R.id.ib_back) void  back(){
        if (drawer!= null)
            drawer.closeDrawer(GravityCompat.START);
    }

    @BindView(R.id.rv_account_list)
            RecyclerView rv_account_list;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        ll_home.setOnClickListener(this);
        ll_myprofile.setOnClickListener(this);
        ll_events.setOnClickListener(this);
        ll_favourites.setOnClickListener(this);
        rl_inbox.setOnClickListener(this);

        ll_contactus.setOnClickListener(this);
        ll_feedback.setOnClickListener(this);
        ll_settings.setOnClickListener(this);


        rl_guideline.setOnClickListener(this);
        rl_myschools.setOnClickListener(this);
        rl_addschool.setOnClickListener(this);

        rl_logout.setOnClickListener(this);




        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);




        drawer.setScrimColor(getResources().getColor(R.color.black_transparent));

        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);



        setUpRecyclerView(2);
    }

    void setUpRecyclerView(int number) {
        rv_account_list.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false));
        rv_account_list.setNestedScrollingEnabled(false);
        rv_account_list.setAdapter(new Account_Header_Adapter(number));

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
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.nav_home) {
            // Handle the camera action
        } else if (id == R.id.nav_myprofile) {

        } else if (id == R.id.nav_events) {

        } else if (id == R.id.nav_favourites) {

        } else if (id == R.id.nav_inbox) {

        } else if (id == R.id.nav_send) {

        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }

    @Override
    public void onClick(View v) {


        switch (v.getId()){

            case R.id.ll_home:
                Check(ll_home);
                clearCheck(ll_myprofile);
                clearCheck(ll_events);
                clearCheck(ll_favourites);
                clearCheck(rl_inbox);
                clearsecCheck2();
                clearsecCheck3();
                setOperation(getResources().getString(R.string.home));

                break;

            case R.id.ll_myprofile:
                Check(ll_myprofile);
                clearCheck(rl_inbox);
                clearCheck(ll_events);
                clearCheck(ll_favourites);
                clearCheck(ll_home);
                clearsecCheck2();
                clearsecCheck3();
                setOperation(getResources().getString(R.string.myprofile));

                break;

            case R.id.ll_events:
                Check(ll_events);
                clearCheck(ll_myprofile);
                clearCheck(rl_inbox);
                clearCheck(ll_favourites);
                clearCheck(ll_home);
                clearsecCheck2();
                clearsecCheck3();
                setOperation(getResources().getString(R.string.events));

                break;

            case R.id.ll_favourites:
                Check(ll_favourites);
                clearCheck(ll_myprofile);
                clearCheck(rl_inbox);
                clearCheck(ll_events);
                clearCheck(ll_home);
                clearsecCheck2();
                clearsecCheck3();
                setOperation(getResources().getString(R.string.favourites));

                break;

            case R.id.rl_inbox:
                Check(rl_inbox);
                clearCheck(ll_favourites);
                clearCheck(ll_myprofile);
                clearCheck(ll_events);
                clearCheck(ll_home);
                clearsecCheck2();
                clearsecCheck3();
                setOperation(getResources().getString(R.string.inbox));


                break;

            case R.id.ll_contactus:
                Check(ll_contactus);
                clearCheck(ll_feedback);
                clearCheck(ll_settings);
                clearsecCheck3();
                clearsecCheck1();
                setOperation(getResources().getString(R.string.contactus));

                break;

            case R.id.ll_feedback:
                Check(ll_feedback);
                clearCheck(ll_contactus);
                clearCheck(ll_settings);
                clearsecCheck3();
                clearsecCheck1();
                setOperation(getResources().getString(R.string.feedback));

                break;

            case R.id.ll_settings:
                Check(ll_settings);
                clearCheck(ll_feedback);
                clearCheck(ll_contactus);
                clearsecCheck3();
                clearsecCheck1();
                setOperation(getResources().getString(R.string.action_settings));

                break;


            case R.id.rl_guideline:
                Check(rl_guideline);
                clearCheck(rl_myschools);
                clearCheck(rl_addschool);
                clearsecCheck1();
                clearsecCheck2();
                setOperation(getResources().getString(R.string.howuseit));
                break;

            case R.id.rl_myschools:
                Check(rl_myschools);
                clearCheck(rl_guideline);
                clearCheck(rl_addschool);
                clearsecCheck1();
                clearsecCheck2();
                setOperation(getResources().getString(R.string.myschools));

                break;

            case R.id.rl_addschool:
                Check(rl_addschool);
                clearCheck(rl_guideline);
                clearCheck(rl_myschools);
                clearsecCheck1();
                clearsecCheck2();
                setOperation(getResources().getString(R.string.addschool));

                break;

            case R.id.rl_logout:
                clearsecCheck1();
                clearsecCheck2();
                clearsecCheck3();
                setOperation(getResources().getString(R.string.logout));
                break;


        }

    }

    void clearsecCheck3(){
        clearCheck(rl_guideline);
        clearCheck(rl_myschools);
        clearCheck(rl_addschool);
        drawer.closeDrawer(GravityCompat.START);

    }

    void clearsecCheck2(){
        clearCheck(ll_contactus);
        clearCheck(ll_feedback);
        clearCheck(ll_settings);
        drawer.closeDrawer(GravityCompat.START);

    }

    void clearsecCheck1(){
        clearCheck(ll_myprofile);
        clearCheck(ll_events);
        clearCheck(ll_favourites);
        clearCheck(rl_inbox);
        clearCheck(ll_home);
        drawer.closeDrawer(GravityCompat.START);

    }


    void setOperation(String operation){
        tv_operation.setText(operation);
    }

    void clearCheck(View v){
        v.setBackgroundColor(getResources().getColor(R.color.white));
        drawer.closeDrawer(GravityCompat.START);

    }

    void Check(View v){
        v.setBackgroundColor(getResources().getColor(R.color.black_transparent));
        drawer.closeDrawer(GravityCompat.START);

    }

}
