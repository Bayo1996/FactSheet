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

/**
 * Created by Brian on 7/2/2017.
 */

public class testing extends AppCompatActivity  implements Animation.AnimationListener{
    private AlphaAnimation buttonClick = new AlphaAnimation(1F,0.8F);
    private WebView mWebView;
    Animation animZoomOut;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.test);
        Toolbar toolbar = findViewById(R.id.toolbar);
        TextView tool = (TextView) toolbar.findViewById(R.id.title);
        tool.setText("Testing and Treatment");
        setSupportActionBar(toolbar);
        if (getSupportActionBar() != null) {
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
            getSupportActionBar().setDisplayShowTitleEnabled(false);
            getSupportActionBar().setDisplayShowHomeEnabled(true);
            getSupportActionBar().setElevation(0);
        }
        final LinearLayoutCompat mlinear = findViewById(R.id.line);
        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                mlinear.startAnimation(animZoomOut);
            }
        }, 0);
        Intent intent = new Intent(this, you3.class);
        Button button = findViewById(R.id.button103);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                v.startAnimation(buttonClick);
                Intent intent = new Intent(testing.this, you3.class);
                startActivity(intent);
            }
        });
        Intent intents = new Intent(this, you4.class);
        Button butto = findViewById(R.id.button102);
        butto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                v.startAnimation(buttonClick);
                Intent intents = new Intent(testing.this, you4.class);
                startActivity(intents);
            }
        });

        Intent intennnt = new Intent(this, you5.class);
        Button buton = findViewById(R.id.button100);
        buton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                v.startAnimation(buttonClick);
                Intent intennnt = new Intent(testing.this, you5.class);
                startActivity(intennnt);
            }
        });
        Intent intent1 = new Intent(this, strat.class);
        Button button1 = findViewById(R.id.button152);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                v.startAnimation(buttonClick);
                Intent intent1 = new Intent(testing.this, strat.class);
                startActivity(intent1);
            }
        });
        Intent intent2 = new Intent(this, effects.class);
        Button buttn1 = findViewById(R.id.button153);
        buttn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                v.startAnimation(buttonClick);
                Intent intent2 = new Intent(testing.this, effects.class);
                startActivity(intent2);
            }
        });
        Intent intentttt = new Intent(this, adhere.class);
        Button buttttn = findViewById(R.id.button154);
        buttttn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                v.startAnimation(buttonClick);
                Intent intentttt = new Intent(testing.this, adhere.class);
                startActivity(intentttt);
            }
        });


        Intent intentss = new Intent(this, dinter.class);
        Button buttoo = findViewById(R.id.button155);
        buttoo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                v.startAnimation(buttonClick);
                Intent intentss = new Intent(testing.this, dinter.class);
                startActivity(intentss);
            }
        });

        Intent intentt = new Intent(this, resist.class);
        Button buttn = findViewById(R.id.button156);
        buttn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                v.startAnimation(buttonClick);
                Intent intentt = new Intent(testing.this, resist.class);
                startActivity(intentt);
            }
        });

        Intent intennntt = new Intent(this, ctreat.class);
        Button butonn = findViewById(R.id.button157);
        butonn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                v.startAnimation(buttonClick);
                Intent intennntt = new Intent(testing.this, ctreat.class);
                startActivity(intennntt);
            }
        });
        Intent intennnttt = new Intent(this, outcome.class);
        Button butonnn = findViewById(R.id.button158);
        butonnn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                v.startAnimation(buttonClick);
                Intent intennntt = new Intent(testing.this, outcome.class);
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
