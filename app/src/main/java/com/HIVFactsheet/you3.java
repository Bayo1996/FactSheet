package com.HIVFactsheet;
import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutCompat;
import android.support.v7.widget.Toolbar;
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

public class you3 extends AppCompatActivity implements   Animation.AnimationListener{
    private AlphaAnimation buttonClick = new AlphaAnimation(1F,0.8F);
    Animation animZoomOut;
    static WebView page;

    @SuppressLint("SetJavaScriptEnabled")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.you7);
        Toolbar toolbar = findViewById(R.id.toolbar);
        TextView tool = (TextView) toolbar.findViewById(R.id.title);
        tool.setText("HIV Testing");
        setSupportActionBar(toolbar);
        if (getSupportActionBar() != null) {
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
            getSupportActionBar().setDisplayShowTitleEnabled(false);
            getSupportActionBar().setDisplayShowHomeEnabled(true);
            getSupportActionBar().setElevation(0);
        }
        final LinearLayoutCompat mlinear = findViewById(R.id.you7);
        page = findViewById(R.id.webview);
        page.getSettings().setJavaScriptEnabled(true);
        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                mlinear.startAnimation(animZoomOut);
            }
        }, 0);

        page.getSettings().setJavaScriptEnabled(true);
        Handler handlers = new Handler();
        handlers.postDelayed(new Runnable() {
            @Override
            public void run() {
                page.loadUrl("file:///android_asset/refers/hivintr.html");
            }
        }, 200);

        page.loadUrl("file:///android_asset/refers/hivintr.html");
        Intent intents= new Intent(this, Main10Activity.class);
        Button butto= findViewById(R.id.button19);
        butto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                v.startAnimation(buttonClick);
                Intent intents= new Intent(you3.this, Main10Activity.class);
                startActivity(intents);
            }
        });

        Intent intennnt= new Intent(this, Main11Activity.class);
        Button buton= findViewById(R.id.button20);
        buton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                v.startAnimation(buttonClick);
                Intent intennnt= new Intent(you3.this, Main11Activity.class);
                startActivity(intennnt);
            }
        });
        Intent intennnet= new Intent(this, Main11Activity.class);
        Button butoen= findViewById(R.id.butto23);
        butoen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                v.startAnimation(buttonClick);
                Intent intennnet= new Intent(you3.this, TBprev.class);
                startActivity(intennnet);
            }
        });
        Intent intet= new Intent(this, Main12Activity.class);
        Button buon= findViewById(R.id.button21);
        buon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                v.startAnimation(buttonClick);
                Intent intet= new Intent(you3.this, Main12Activity.class);
                startActivity(intet);
            }
        });
        Intent intens= new Intent(this,Main13Activity.class);
        Button buttoo= findViewById(R.id.button22);
        buttoo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                v.startAnimation(buttonClick);
                Intent intens= new Intent(you3.this, Main13Activity.class);
                startActivity(intens);
            }
        });

        Intent intennn= new Intent(you3.this,Main14Activity.class);
        Button butonn= findViewById(R.id.button23);
        butonn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                v.startAnimation(buttonClick);
                Intent intennn= new Intent(you3.this, Main14Activity.class);
                startActivity(intennn);
            }
        });

        Intent intennnnn= new Intent(you3.this, Main15Activity.class);
        Button butonnnn= findViewById(R.id.button24);
        butonnnn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                v.startAnimation(buttonClick);
                Intent intennnnn= new Intent(you3.this, Main15Activity.class);
                startActivity(intennnnn);
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


