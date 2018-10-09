package com.HIVFactsheet;
import android.annotation.SuppressLint;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutCompat;
import android.support.v7.widget.Toolbar;
import android.text.Html;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.inputmethod.InputMethodManager;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.HIVFactsheet.RH.RHContr;
import com.HIVFactsheet.RH.SexP;
import com.HIVFactsheet.RH.Sexuallyhealth;
import com.HIVFactsheet.RH.asexuallity;
import com.HIVFactsheet.RH.orientation;
import com.HIVFactsheet.RH.queer;
import com.HIVFactsheet.RH.sexlife;

import java.lang.reflect.Method;


public class sexuality extends AppCompatActivity implements  Animation.AnimationListener {
    private AlphaAnimation buttonClick = new AlphaAnimation(1F,0.8F);
    private WebView mWebView;
    Animation animZoomOut;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sexuality);
        Toolbar toolbar = findViewById(R.id.toolbar);
        TextView tool = (TextView) toolbar.findViewById(R.id.title);
        tool.setText("SEX and SEXUALITY");
        setSupportActionBar(toolbar);
        if (getSupportActionBar() != null) {
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
            getSupportActionBar().setDisplayShowTitleEnabled(false);
            getSupportActionBar().setDisplayShowHomeEnabled(true);
            getSupportActionBar().setElevation(0);
        }
        final LinearLayoutCompat mlinear = findViewById(R.id.tb);
        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                mlinear.startAnimation(animZoomOut);
            }
        }, 0);
        Intent intennnnt= new Intent(this,Sexuallyhealth.class);
        Button bn= findViewById(R.id.button141);
        bn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                v.startAnimation(buttonClick);
                Intent intennnnt= new Intent(sexuality.this ,Sexuallyhealth.class);
                startActivity(intennnnt);
            }
        });
        Intent intnnt= new Intent(this, sexlife.class);
        Button bon= findViewById(R.id.button144);
        bon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                v.startAnimation(buttonClick);
                Intent intnnt= new Intent( sexuality.this,sexlife.class);
                startActivity(intnnt);
            }
        });
        Intent intennntt= new Intent(this, SexP.class);
        Button but= findViewById(R.id.button145);
        but.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                v.startAnimation(buttonClick);
                Intent intennntt= new Intent( sexuality.this ,SexP.class);
                startActivity(intennntt);
            }
        });
        Intent inte= new Intent(this, orientation.class);
        Button butnn= findViewById(R.id.button146);
        butnn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                v.startAnimation(buttonClick);
                Intent inte= new Intent( sexuality.this , orientation.class);
                startActivity(inte);
            }
        });
        Intent intte= new Intent(this,queer.class);
        Button buttnn= findViewById(R.id.button147);
        buttnn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                v.startAnimation(buttonClick);
                Intent intte= new Intent( sexuality.this ,  queer.class);
                startActivity(intte);
            }
        });
        Intent inttet= new Intent(this, asexuallity.class);
        Button buttnnt= findViewById(R.id.button148);
        buttnnt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                v.startAnimation(buttonClick);
                Intent inttet= new Intent( sexuality.this ,  asexuallity.class);
                startActivity(inttet);
            }
        });
        Intent intter= new Intent(this,  RHContr.class);
        Button buttnnr= findViewById(R.id.button149);
        buttnnr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                v.startAnimation(buttonClick);
                Intent intter= new Intent( sexuality.this ,  RHContr.class);
                startActivity(intter);
            }
        });
        Intent inttery= new Intent(this,  RHContr.class);
        Button buttnnry= findViewById(R.id.button55);
        buttnnry.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                v.startAnimation(buttonClick);
                Intent inttery= new Intent( sexuality.this ,  sexlife.class);
                startActivity(inttery);
            }
        });

        // load the animation
        animZoomOut = AnimationUtils.loadAnimation(getApplicationContext(),
                R.anim.zoom_out);

        // set animation listener
        animZoomOut.setAnimationListener(this);

        // button click event


    }
    @Override
    public void onAnimationEnd(Animation animation) {
        // Take any action after completing the animation

        // check for zoom in animation
        if (animation == animZoomOut) {
        }

    }

    @Override
    public void onAnimationRepeat(Animation animation) {
        // TODO Auto-generated method stub

    }

    @Override
    public void onAnimationStart(Animation animation) {
        // TODO Auto-generated method stub

    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if (id == android.R.id.home){
            onBackPressed();
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

}



