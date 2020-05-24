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


public class peereduc extends AppCompatActivity implements Animation.AnimationListener {
    private AlphaAnimation buttonClick = new AlphaAnimation(1F,0.8F);
    private WebView mWebView;
    Animation animZoomOut;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.peereduc);
        Toolbar toolbar = findViewById(R.id.toolbar);
        TextView tool = (TextView) toolbar.findViewById(R.id.title);
        tool.setText("Peer Education");
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

        Button buton5 = findViewById(R.id.button345);
        buton5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                v.startAnimation(buttonClick);
                startActivity(new Intent(peereduc.this, plifeskills.class));
            }
        });
        Intent intent= new Intent(this, pfs.class);
        Button button= findViewById(R.id.button200);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                v.startAnimation(buttonClick);
                startActivity(new Intent(peereduc.this, pfs.class));
            }
        });
        Intent intent1= new Intent(this,pcauncelling.class);
        Button button1= findViewById(R.id.button201);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                v.startAnimation(buttonClick);
                startActivity(new Intent(peereduc.this, pcauncelling.class));
            }
        });
        Intent intent2= new Intent(this, phelp.class);
        Button buttn1= findViewById(R.id.button203);
        buttn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                v.startAnimation(buttonClick);
                startActivity(new Intent(peereduc.this, phelp.class));
            }
        });
        Intent intentttt= new Intent(this,assault.class);
        Button buttttn= findViewById(R.id.button204);
        buttttn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                v.startAnimation(buttonClick);
                startActivity(new Intent(peereduc.this, assault.class));
            }
        });
        Intent intents= new Intent(this,pmental.class);
        Button butto= findViewById(R.id.button206);
        butto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                v.startAnimation(buttonClick);
                startActivity(new Intent(peereduc.this, pmental.class));
            }
        });
        Intent intent5= new Intent(this,preferral.class);
        Button butto1= findViewById(R.id.button9002);
        butto1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                v.startAnimation(buttonClick);
                startActivity(new Intent(peereduc.this, pment.class));
            }
        });
        Intent intent6= new Intent(this,pment.class);
        Button butto2= findViewById(R.id.button9001);
        butto2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                v.startAnimation(buttonClick);
                startActivity(new Intent(peereduc.this, preferral.class));
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