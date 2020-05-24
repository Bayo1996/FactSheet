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

import com.HIVFactsheet.Teange.RHContr;
import com.HIVFactsheet.Teange.SexP;
import com.HIVFactsheet.Teange.Sexuallyhealth;
import com.HIVFactsheet.Teange.asexuallity;
import com.HIVFactsheet.Teange.next;
import com.HIVFactsheet.Teange.orientation;
import com.HIVFactsheet.Teange.queer;
import com.HIVFactsheet.Teange.sexlife;


public class teenagepreg extends AppCompatActivity implements   Animation.AnimationListener {
    private AlphaAnimation buttonClick = new AlphaAnimation(1F,0.8F);
    private WebView mWebView;
    Animation animZoomOut;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.teenage);
        Toolbar toolbar = findViewById(R.id.toolbar);
        TextView tool = (TextView) toolbar.findViewById(R.id.title);
        tool.setText("TEENAGE PREGNANCY");
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
                Intent intennnnt= new Intent(teenagepreg.this ,Sexuallyhealth.class);
                startActivity(intennnnt);
            }
        });
        Intent intnnt= new Intent(this, queer.class);
        Button bon= findViewById(R.id.button144);
        bon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                v.startAnimation(buttonClick);
                Intent intnnt= new Intent( teenagepreg.this,queer.class);
                startActivity(intnnt);
            }
        });
        Intent int4nnt= new Intent(this, abortion.class);
        Button bon4= findViewById(R.id.abortion);
        bon4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                v.startAnimation(buttonClick);
                Intent int4nnt= new Intent( teenagepreg.this, abortion.class);
                startActivity(int4nnt);
            }
        });
        Intent intennntt= new Intent(this, RHContr.class);
        Button but= findViewById(R.id.button145);
        but.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                v.startAnimation(buttonClick);
                Intent intennntt= new Intent( teenagepreg.this ,RHContr.class);
                startActivity(intennntt);
            }
        });
        Intent inte= new Intent(this, SexP.class);
        Button butnn= findViewById(R.id.button146);
        butnn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                v.startAnimation(buttonClick);
                Intent inte= new Intent( teenagepreg.this , SexP.class);
                startActivity(inte);
            }
        });

        Intent intte= new Intent(this,orientation.class);
        Button buttnn= findViewById(R.id.button147);
        buttnn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                v.startAnimation(buttonClick);
                Intent intte= new Intent( teenagepreg.this ,  orientation.class);
                startActivity(intte);
            }
        });
        Intent inttet= new Intent(this, asexuallity.class);
        Button buttnnt= findViewById(R.id.button148);
        buttnnt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                v.startAnimation(buttonClick);
                Intent inttet= new Intent( teenagepreg.this ,  asexuallity.class);
                startActivity(inttet);
            }
        });
        Intent intterg= new Intent(this,  next.class);
        Button buttnnrg= findViewById(R.id.button149);
        buttnnrg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                v.startAnimation(buttonClick);
                Intent intterg= new Intent( teenagepreg.this ,  next.class);
                startActivity(intterg);
            }
        });
        Intent intter= new Intent(this,  sexlife.class);
        Button buttnnr= findViewById(R.id.button150);
        buttnnr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                v.startAnimation(buttonClick);
                Intent intter= new Intent( teenagepreg.this ,  sexlife.class);
                startActivity(intter);
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
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if (id == android.R.id.home){
            onBackPressed();
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
    @Override
    public void onAnimationStart(Animation animation) {
        // TODO Auto-generated method stub

    }



}



