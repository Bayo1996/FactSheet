package com.HIVFactsheet;
import android.annotation.SuppressLint;
import android.content.ContentUris;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.provider.CalendarContract;
import android.support.v4.app.Fragment;
import android.support.v7.app.AlertDialog;
import android.support.v7.widget.CardView;
import android.util.Log;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AlphaAnimation;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.TextSwitcher;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.ViewSwitcher;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GoogleApiAvailability;
import com.vorlonsoft.android.rate.AppRate;
import com.vorlonsoft.android.rate.OnClickButtonListener;
import com.vorlonsoft.android.rate.StoreType;

import static android.R.id.message;
/**
 * Created by Brian on 7/2/2017.
 */
@SuppressWarnings("ALL")
public class you extends Fragment {

    private AlphaAnimation buttonClick = new AlphaAnimation(1F,0.8F);
    private WebView page;
    private TextSwitcher Test ;
    private int stringIndex = 0;
    private TextView text;
    private String [] row = { "CONDOMS & LUBRICANTS" ,"SUPPORT GROUP", "PrEP", "PEP","ABSTINENCE","SMOKING","NUTRITION","ALCOHOL","STIs","VIRAL LOAD", "OPPORTUNISTIC INFECTIONS","SIDE EFFECTS", "ADHERENCE", "HIV & PREGNANCY", "MOTHER-to-CHILD-TRANSMISSION", "SUPPORT FOR FAMILY & CHILDREN", "TB & HIV", };
    private View rootView;
    private CardView mcardView;
    private Boolean exit = false ;
    long startMillis ;
    Button date;
    @SuppressLint("SetJavaScriptEnabled")
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState)
    {
        View root = inflater.inflate(R.layout.youhome, container, false);
        page = root.findViewById(R.id.view);
        Test = root.findViewById(R.id.TEST);
        Test.setFactory(new ViewSwitcher.ViewFactory() {
            @Override
            public View makeView() {
                text = new TextView(getActivity());
                text.setTextColor(getContext().getResources().getColor(R.color.colorAccentts));
                text.setGravity(Gravity.CENTER_HORIZONTAL);
                text.setTextSize(15);
                text.setTypeface(Typeface.defaultFromStyle(Typeface.BOLD));
                return text;
            }
        });
        Thread thread = new Thread() {
            @Override
            public void run() {
                try {
                    while(true) {
                        synchronized (this) {
                            wait(3000);
                            if (getActivity()!=null) {
                                getActivity().runOnUiThread(new Runnable() {
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
                            else{
                                return;
                            }
                        }
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };
        thread.start();

        Test.setText(row[stringIndex]);

        page.getSettings().setJavaScriptEnabled(true);
        page.loadUrl("file:///android_asset/refers/homee.php");
        page = root.findViewById(R.id.weview);
        page.getSettings().setJavaScriptEnabled(true);
        page.loadUrl("file:///android_asset/refers/home.php");
//        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
//        builder.setTitle("\t\t\tTalk to a Counselor");
//        builder.setItems(new CharSequence[]
//                        {"Call", "Send Message", "Send Email"},
//                new DialogInterface.OnClickListener() {
//                    public void onClick(DialogInterface dialog, int which) {
//                        // The 'which' argument contains the index position
//                        // of the selected item
//                        switch (which) {
//                            case 0:
//                                Intent callIntent = new Intent ( Intent.ACTION_DIAL);
//                                callIntent.setData( Uri .parse( "tel:+254708376169"));
//                                startActivity(callIntent);
//                                break;
//                            case 1:
//                                Uri uri = Uri .parse( "smsto:+254708376169" );
//                                Intent it = new Intent ( Intent .ACTION_SENDTO, uri);
//                                startActivity(it);
//                                break;
//                            case 2:
//                                Intent intent = new Intent( Intent.ACTION_SENDTO, Uri .fromParts("mailto" ,"bakarisalim91@gmail.com" , null ));
//                                intent.putExtra( Intent.EXTRA_TEXT, message);
//                                startActivity( Intent.createChooser(intent, " Email Via :" ));
//                                break;
//                        }
//                    }
//                });
//        builder.setNegativeButton("Close",
//                new DialogInterface.OnClickListener()
//                {
//                    public void onClick(DialogInterface dialog, int id)
//                    {
//                        dialog.cancel();
//                    }
//                });
//
//        builder.create().show();
//
////                Intent intents= new Intent(getActivity(),Main39Activity.class);
////                getActivity().startActivity(intents);

        mcardView = root.findViewById(R.id.card);
        mcardView.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        v.startAnimation(buttonClick);

                        startActivity(new Intent(getActivity(), overview.class));
                    }
                });
        mcardView = root.findViewById(R.id.support);
        mcardView.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        v.startAnimation(buttonClick);
                        startActivity(new Intent(getActivity(), Main41Activity.class));
                    }
                });
        mcardView = root.findViewById(R.id.cardd);
        mcardView.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        v.startAnimation(buttonClick);
                        startActivity(new Intent(getActivity(), Main40Activity.class));
                    }
                });
        mcardView = root.findViewById(R.id.carddd);
        mcardView.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        v.startAnimation(buttonClick);
                        startActivity(new Intent(getActivity(), testing.class));
                    }
                });
        mcardView = root.findViewById(R.id.cardt);
        mcardView.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        v.startAnimation(buttonClick);
                        startActivity(new Intent(getActivity(),transmission.class));
                    }
                });
        mcardView = root.findViewById(R.id.carddisc);
        mcardView.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        v.startAnimation(buttonClick);
                        startActivity(new Intent(getActivity(), you2.class));
                    }
                });
        mcardView = root.findViewById(R.id.TB);
        mcardView.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v)
                    {
                        v.startAnimation(buttonClick);
                        startActivity(new Intent(getActivity(), TB.class));
                    }
                });
        mcardView = root.findViewById(R.id.child);
        mcardView.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        v.startAnimation(buttonClick);
                        startActivity(new Intent(getActivity(), family.class));
                    }
                });
        mcardView = root.findViewById(R.id.sex);
        mcardView.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        v.startAnimation(buttonClick);
                        startActivity(new Intent(getActivity(), sexual.class));
                    }
                });
        mcardView = root.findViewById(R.id.carda);
        mcardView.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        v.startAnimation(buttonClick);
                        startActivity(new Intent(getActivity(), you8.class));
                    }
                });
        mcardView = root.findViewById(R.id.car);
        mcardView.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        v.startAnimation(buttonClick);
                        startActivity(new Intent(getActivity(), you11.class));
                    }
                });
        root.setFocusableInTouchMode( true );
        root.requestFocus();

        return root;
    }
}
