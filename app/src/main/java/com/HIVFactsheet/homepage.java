package com.HIVFactsheet;
import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.TextSwitcher;
import android.widget.TextView;
import android.widget.ViewSwitcher;


public class homepage extends Activity
{
    private TextSwitcher Test ;
    private int stringIndex = 0;
    private TextView text;
    public Button button;
    private String [] row = { "one" ,"two", "three"};
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_help);
        Test = findViewById(R.id.TEST);
        Test.setFactory(new ViewSwitcher.ViewFactory() {
            @Override
            public View makeView() {
                text = new TextView(homepage.this);
                text.setTextColor(Color.BLACK);
                text.setGravity(Gravity.CENTER_HORIZONTAL);
                text.setTextSize(60);
                return text;
            }
        });
        Thread thread = new Thread() {
            @Override
            public void run() {
                try {
                    while(true) {
                        synchronized (this) {
                            wait(2000);

                            runOnUiThread(new Runnable() {
                                @Override
                                public void run() {
                                    if (stringIndex == row.length - 1) {
                                        stringIndex = 0;
                                        Test.setText(row[stringIndex]);
                                    } else {
                                        Test.setText(row[++stringIndex]);
                                    }
                                }
                            });
                        }
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };

        thread.start();

        Test.setText(row[stringIndex]);
    }




//        animBlink = AnimationUtils.loadAnimation(getApplicationContext(),
//                R.anim.blink);
//
//        // set animation listener
//        animBlink.setAnimationListener(this);
//
//        // button click event
//                Test.setVisibility(View.VISIBLE);
//
//                // start the animation
//                Test.startAnimation(animBlink);



//    WebView mWebView;
//    private AlphaAnimation buttonClick = new AlphaAnimation(1F,0.8F);
//    private LinearLayout container;
//    private Button nextButton, closeButton;
//    private EditText findBox;
//    /** Called when the activity is first created. */
//    @SuppressLint("SetJavaScriptEnabled")
//    @Override
//    public void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.homepage);
//        CardView mcardView = findViewById(R.id.card_view);
//        mcardView.setOnClickListener(
//                new View.OnClickListener() {
//                    @Override
//                    public void onClick(View v) {
//                        v.startAnimation(buttonClick);
//                        startActivity(new Intent(homepage.this, MainActivity.class));
//                        overridePendingTransition(0,0);
//
////                        new Handler().postDelayed(new Runnable() {
////                            @Override
////                            public void run() {
////
////                            }
////                        }, TIME_OUT);
////
//                       }
//                });
//        mcardView = findViewById(R.id.card);
//        mcardView.setOnClickListener(
//                new View.OnClickListener() {
//                    @Override
//                    public void onClick(View v) {
//                        v.startAnimation(buttonClick);
//
////                        try{
////                            Intent i = new Intent("android.intent.action.MAIN");
////                            i.setComponent(ComponentName.unflattenFromString("com.android.chrome/com.android.chrome.MAIN"));
////                            i.addCategory("android.intent.category.LAUNCHER");
////                            i.setData(Uri.parse("https://viralload.nascop.org/"));
////                            startActivity(i);
////                        }
////                        catch (ActivityNotFoundException e){
////
////
////                        }
//                        startActivity(new Intent(homepage.this, videos.class));
//                    }
//                });
//        mcardView = findViewById(R.id.cardvv);
//        mcardView.setOnClickListener(
//                new View.OnClickListener() {
//                    @Override
//                    public void onClick(View v) {
//                        android.support.v7.app.AlertDialog.Builder builder = new android.support.v7.app.AlertDialog.Builder(homepage.this);
//                        builder.setTitle("\t\t\tTalk to a Counselor");
//                        builder.setItems(new CharSequence[]
//                                        {"Call", "Send Message", "Send Email"},
//                                new DialogInterface.OnClickListener() {
//                                    public void onClick(DialogInterface dialog, int which) {
//                                        // The 'which' argument contains the index position
//                                        // of the selected item
//                                        switch (which) {
//                                            case 0:
//                                                Intent callIntent = new Intent ( Intent.ACTION_DIAL);
//                                                callIntent.setData( Uri.parse( "tel:+254708376169"));
//                                                startActivity(callIntent);
//                                                break;
//
//                                            case 1:
//                                                Uri uri = Uri .parse( "smsto:+254708376169" );
//                                                Intent it = new Intent ( Intent .ACTION_SENDTO, uri);
//                                                startActivity(it);
//                                                break;
//                                            case 2:
//                                                Intent intent = new Intent( Intent.ACTION_SENDTO, Uri .fromParts("mailto" ,"bakarisalim91@gmail.com" , null ));
//                                                intent.putExtra( Intent.EXTRA_TEXT, message);
//                                                startActivity( Intent.createChooser(intent, " Email Via :" ));
//                                                break;
//                                        }
//                                    }
//                                });
//                        builder.setNegativeButton("Close",
//                                new DialogInterface.OnClickListener()
//                                {
//                                    public void onClick(DialogInterface dialog, int id)
//                                    {
//                                        dialog.cancel();
//                                    }
//                                });
//
//                        builder.create().show();
//                    }
//                });
//
//}

}

