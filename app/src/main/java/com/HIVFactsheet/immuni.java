package com.HIVFactsheet;
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
import android.widget.Button;
import android.widget.TextView;


public class immuni extends AppCompatActivity implements Animation.AnimationListener{
private AlphaAnimation buttonClick = new AlphaAnimation(1F,0.8F);
        Animation animZoomOut;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);
        Toolbar toolbar = findViewById(R.id.toolbar);
        final LinearLayoutCompat mlinear = findViewById(R.id.widget);
        TextView tool = (TextView) toolbar.findViewById(R.id.title);
        tool.setText("Immunization");
        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                mlinear.startAnimation(animZoomOut);
            }
        }, 0);
        setSupportActionBar(toolbar);
        if (getSupportActionBar() != null) {
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
            getSupportActionBar().setDisplayShowTitleEnabled(false);
            getSupportActionBar().setDisplayShowHomeEnabled(true);
            getSupportActionBar().setElevation(0);
        }
        Intent intennnnt = new Intent(this, immuni.class);
        Button bn = findViewById(R.id.button801);
        bn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                v.startAnimation(buttonClick);
                Intent intennnnt = new Intent(immuni.this, hiv.class);
                startActivity(intennnnt);
            }
        });
        Intent intnnt = new Intent(this, immuni.class);
        Button bon = findViewById(R.id.button802);
        bon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                v.startAnimation(buttonClick);
                Intent intnnt = new Intent(immuni.this, aids.class);
                startActivity(intnnt);
            }
        });
        Intent intennntt = new Intent(this, immuni.class);
        Button but = findViewById(R.id.button803);
        but.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                v.startAnimation(buttonClick);
                Intent intennntt = new Intent(immuni.this, change.class);
                startActivity(intennntt);
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
     public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if (id == android.R.id.home){
            onBackPressed();
            return false;
        }
        return super.onOptionsItemSelected(item);
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
