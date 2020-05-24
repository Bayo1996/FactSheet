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


public class family extends AppCompatActivity implements Animation.AnimationListener{
    private AlphaAnimation buttonClick = new AlphaAnimation(1F,0.8F);
    private WebView mWebView;
    Animation animZoomOut;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.family);
        Toolbar toolbar = findViewById(R.id.toolbar);
        TextView tool = (TextView) toolbar.findViewById(R.id.title);
        tool.setText(" HIV and Family");
        setSupportActionBar(toolbar);
        if (getSupportActionBar() != null) {
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
            getSupportActionBar().setDisplayShowTitleEnabled(false);
            getSupportActionBar().setDisplayShowHomeEnabled(true);
            getSupportActionBar().setElevation(0);
        }
        final LinearLayoutCompat mlinear = findViewById(R.id.fam);
        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                mlinear.startAnimation(animZoomOut);
            }
        }, 0);
        Intent intennnnt= new Intent(this,PTCP.class);
        Button bn= findViewById(R.id.button131);
        bn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                v.startAnimation(buttonClick);
                Intent intennnnt= new Intent(family.this ,PTCP.class);
                startActivity(intennnnt);
            }
        });
        Intent intennnt= new Intent(this,infant.class);
        Button buton= findViewById(R.id.button132);
        buton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                v.startAnimation(buttonClick);
                Intent intennnt= new Intent( family.this ,infant.class);
                 startActivity(intennnt);
            }
        });
        Intent intentttt1= new Intent(this,pregnancy.class);
        Button buttttn1= findViewById(R.id.button400);
        buttttn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                v.startAnimation(buttonClick);
                Intent intentttt1= new Intent(family.this,pregnancy.class);
                startActivity(intentttt1);
            }
        });
        Intent intnt= new Intent(this, conception.class);
        Button buon= findViewById(R.id.button133);
        buon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                v.startAnimation(buttonClick);
                Intent intnt= new Intent( family.this,conception.class);
                startActivity(intnt);
            }
        });
        Intent intnnt= new Intent(this, childhiv.class);
        Button bon= findViewById(R.id.button134);
        bon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                v.startAnimation(buttonClick);
                Intent intnnt= new Intent( family.this,childhiv.class);
                startActivity(intnnt);
            }
        });
        Intent intennntt= new Intent(this,childdis.class);
        Button but= findViewById(R.id.button135);
        but.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                v.startAnimation(buttonClick);
                Intent intennntt= new Intent( family.this ,childdis.class);
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



