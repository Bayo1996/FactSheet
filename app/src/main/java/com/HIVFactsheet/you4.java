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

/**
 * Created by Brian on 7/2/2017.
 */

public class you4 extends AppCompatActivity implements   Animation.AnimationListener{
    private AlphaAnimation buttonClick = new AlphaAnimation(1F,0.8F);
    Animation animZoomOut;
    static WebView page;

    @SuppressLint("SetJavaScriptEnabled")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.you4);
        Toolbar toolbar = findViewById(R.id.toolbar);
        TextView tool = (TextView) toolbar.findViewById(R.id.title);
        tool.setText("Viral Load");
        setSupportActionBar(toolbar);
        if (getSupportActionBar() != null) {
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
            getSupportActionBar().setDisplayShowTitleEnabled(false);
            getSupportActionBar().setDisplayShowHomeEnabled(true);
            getSupportActionBar().setElevation(0);
        }
        final LinearLayoutCompat mlinear = findViewById(R.id.you4);
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
                page.loadUrl("file:///android_asset/refers/teansoci.html");
            }
        }, 200);

        page.loadUrl("file:///android_asset/refers/teansoci.html");
        Intent intents = new Intent(this, Main35Activity.class);
        Button butto = findViewById(R.id.button30);
        butto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                v.startAnimation(buttonClick);
                Intent intents = new Intent(you4.this, Main35Activity.class);
                startActivity(intents);
            }
        });
        Intent intennnt = new Intent(this, Main36Activity.class);
        Button buton = findViewById(R.id.button31);
        buton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                v.startAnimation(buttonClick);
                Intent intennnt = new Intent(you4.this, Main36Activity.class);
                startActivity(intennnt);
            }
        });
        Intent intet = new Intent(this, Main37Activity.class);
        Button buon = findViewById(R.id.button32);
        buon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                v.startAnimation(buttonClick);
                Intent intet = new Intent(you4.this, Main37Activity.class);
                startActivity(intet);
            }
        });
        Intent intens = new Intent(this, Main38Activity.class);
        Button buttoo = findViewById(R.id.button33);
        buttoo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                v.startAnimation(buttonClick);
                Intent intens = new Intent(you4.this, Main38Activity.class);
                startActivity(intens);
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
