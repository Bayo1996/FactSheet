package com.HIVFactsheet;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AlphaAnimation;
import android.widget.Button;

/**
 * Created by Brian on 7/2/2017.
 */

public class treatment extends Fragment {
    private AlphaAnimation buttonClick = new AlphaAnimation(1F,0.8F);
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState)
    {
        View rootView = inflater.inflate(R.layout.treatment, container, false);
        Intent intent= new Intent(getActivity(),tguideline.class);
        Intent intent1= new Intent(getActivity(),strat.class);
        Button button1= rootView.findViewById(R.id.button152);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                v.startAnimation(buttonClick);
                Intent intent1= new Intent(getActivity(),strat.class);
                getActivity().startActivity(intent1);
            }
        });
        Intent intent2= new Intent(getActivity(), effects.class);
        Button buttn1= rootView.findViewById(R.id.button153);
        buttn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                v.startAnimation(buttonClick);
                Intent intent2= new Intent(getActivity(),effects.class);
                getActivity().startActivity(intent2);
            }
        });
        Intent intentttt= new Intent(getActivity(),adhere.class);
        Button buttttn= rootView.findViewById(R.id.button154);
        buttttn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                v.startAnimation(buttonClick);
                Intent intentttt= new Intent(getActivity(),adhere.class);
                getActivity().startActivity(intentttt);
            }
        });


        Intent intents= new Intent(getActivity(),dinter.class);
        Button butto= rootView.findViewById(R.id.button155);
        butto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                v.startAnimation(buttonClick);
                Intent intents= new Intent(getActivity(),dinter.class);
                getActivity().startActivity(intents);
            }
        });

        Intent intentt= new Intent(getActivity(),resist.class);
        Button buttn= rootView.findViewById(R.id.button156);
        buttn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                v.startAnimation(buttonClick);
                Intent intentt= new Intent(getActivity(),resist.class);
                getActivity().startActivity(intentt);
            }
        });

        Intent intennnt= new Intent(getActivity(),ctreat.class);
        Button buton= rootView.findViewById(R.id.button157);
        buton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                v.startAnimation(buttonClick);
                Intent intennnt= new Intent(getActivity(),ctreat.class);
                getActivity().startActivity(intennnt);
            }
        });
        Intent intennntt= new Intent(getActivity(),outcome.class);
        Button butonn= rootView.findViewById(R.id.button158);
        butonn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                v.startAnimation(buttonClick);
                Intent intennntt= new Intent(getActivity(),outcome.class);
                getActivity().startActivity(intennntt);
            }
        });


        return rootView ;
    }



}