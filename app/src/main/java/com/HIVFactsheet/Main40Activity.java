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
import android.webkit.WebView;
import android.widget.Button;
import android.widget.TextView;


public class Main40Activity extends AppCompatActivity implements Animation.AnimationListener {
    private AlphaAnimation buttonClick = new AlphaAnimation(1F,0.8F);
    private WebView mWebView;
    Animation animZoomOut;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.you10);
        Toolbar toolbar = findViewById(R.id.toolbar);
        TextView tool = (TextView) toolbar.findViewById(R.id.title);
        tool.setText("Healthy Living");
        setSupportActionBar(toolbar);
        if (getSupportActionBar() != null) {
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
            getSupportActionBar().setDisplayShowTitleEnabled(false);
            getSupportActionBar().setDisplayShowHomeEnabled(true);
            getSupportActionBar().setElevation(0);
        }
        final LinearLayoutCompat mlinear = findViewById(R.id.id);
        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                mlinear.startAnimation(animZoomOut);
            }
        }, 0);
        Button bn = findViewById(R.id.button39);
        bn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                v.startAnimation(buttonClick);
                startActivity(new Intent(Main40Activity.this, Main44Activity.class));
            }
        });
         Button buton = findViewById(R.id.button40);
         buton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                v.startAnimation(buttonClick);
                startActivity(new Intent(Main40Activity.this, Main45Activity.class));
            }
        });
        Button buton5 = findViewById(R.id.button345);
        buton5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                v.startAnimation(buttonClick);
                startActivity(new Intent(Main40Activity.this, policy.class));
            }
        });
        Intent intent= new Intent(this, nutri.class);
        Button button= findViewById(R.id.button200);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                v.startAnimation(buttonClick);
                startActivity(new Intent(Main40Activity.this, nutri.class));
            }
        });
        Intent intent1= new Intent(this,alcohol.class);
        Button button1= findViewById(R.id.button201);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                v.startAnimation(buttonClick);
                startActivity(new Intent(Main40Activity.this, alcohol.class));
            }
        });
        Intent intent2= new Intent(this, smoke.class);
        Button buttn1= findViewById(R.id.button203);
        buttn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                v.startAnimation(buttonClick);
                startActivity(new Intent(Main40Activity.this, smoke.class));
            }
        });
        Intent intentttt= new Intent(this,immuni.class);
        Button buttttn= findViewById(R.id.button204);
        buttttn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                v.startAnimation(buttonClick);
                startActivity(new Intent(Main40Activity.this, immuni.class));
            }
        });


        Intent intents= new Intent(this,sleep.class);
        Button butto= findViewById(R.id.button206);
        butto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                v.startAnimation(buttonClick);
                startActivity(new Intent(Main40Activity.this, sleep.class));
            }
        });
        Intent intent5= new Intent(this,lubric.class);
        Button butto1= findViewById(R.id.button9002);
        butto1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                v.startAnimation(buttonClick);
                startActivity(new Intent(Main40Activity.this, lubric.class));
            }
        });
        Intent intent6= new Intent(this,population.class);
        Button butto2= findViewById(R.id.button9001);
        butto2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                v.startAnimation(buttonClick);
                startActivity(new Intent(Main40Activity.this, population.class));
            }
        });

        Intent intentt= new Intent(this,liv.class);
        Button buttn= findViewById(R.id.button207);
        buttn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                v.startAnimation(buttonClick);
                startActivity(new Intent(Main40Activity.this, liv.class));
            }
        });
        // load the animation
        animZoomOut = AnimationUtils.loadAnimation(getApplicationContext(),
                R.anim.zoom_out);
        // set animation listener
        animZoomOut.setAnimationListener(this);
        // button click even
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
            return true;
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