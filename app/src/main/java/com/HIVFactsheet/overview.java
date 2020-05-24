package com.HIVFactsheet;
import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.appcompat.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.TextView;

public class overview extends AppCompatActivity implements Animation.AnimationListener {
    private AlphaAnimation buttonClick = new AlphaAnimation(1F,0.8F);

    // Animation
    Animation animZoomOut;
    @SuppressLint("SetJavaScriptEnabled")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.act);
        Toolbar toolbar = findViewById(R.id.toolbar);
        TextView tool = (TextView) toolbar.findViewById(R.id.title);
        tool.setText("HIV Overview");
        setSupportActionBar(toolbar);
        if (getSupportActionBar() != null) {
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
            getSupportActionBar().setDisplayShowTitleEnabled(false);
            getSupportActionBar().setDisplayShowHomeEnabled(true);
            getSupportActionBar().setElevation(0);
        }
        final LinearLayoutCompat mlinear = findViewById(R.id.Linear);
        final WebView mWebView = findViewById(R.id.webview);
        mWebView.getSettings().setJavaScriptEnabled(true);

        Handler handlers = new Handler();
        handlers.postDelayed(new Runnable() {
            @Override
            public void run() {
                mWebView.loadUrl("file:///android_asset/refers/whatishiv.html");
            }
        }, 200);

        mWebView.getSettings().setBuiltInZoomControls( true );
        mWebView.getSettings().setDisplayZoomControls( false);
        mWebView.getSettings().setBuiltInZoomControls( true );
        mWebView.getSettings().setDisplayZoomControls( false);
        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                mlinear.startAnimation(animZoomOut);
            }
        }, 0);


        Intent intennnnt= new Intent(this,overview.class);

        Button bn= findViewById(R.id.button600);
        bn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                v.startAnimation(buttonClick);
                Intent intennnnt= new Intent(overview.this ,causes.class);
                startActivity(intennnnt);
            }
        });
        Intent intnnt= new Intent(this, overview.class);
        Button bon= findViewById(R.id.button602);
        bon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                v.startAnimation(buttonClick);
                Intent intnnt= new Intent( overview.this,mental.class);
                startActivity(intnnt);
            }
        });
        Intent intennntt= new Intent(this, overview.class);
        Button but= findViewById(R.id.button603);
        but.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                v.startAnimation(buttonClick);
                Intent intennntt= new Intent( overview.this ,sexualtrans.class);
                startActivity(intennntt);
            }
        });
        Intent inte= new Intent(this, overview.class);
        Button butnn= findViewById(R.id.button607);
        butnn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                v.startAnimation(buttonClick);
                Intent inte= new Intent( overview.this , tguideline.class);
                startActivity(inte);
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
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if (id == android.R.id.home){
            onBackPressed();
            return true;
        }
        return super.onOptionsItemSelected(item);
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
}