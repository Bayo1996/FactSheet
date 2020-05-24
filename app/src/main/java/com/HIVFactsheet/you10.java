package com.HIVFactsheet;
import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.cardview.widget.CardView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AlphaAnimation;

/**
 * Created by Brian on 7/2/2017.
 */

public class you10 extends Fragment {

    private AlphaAnimation buttonClick = new AlphaAnimation(1F,0.8F);
    private CardView mcardView;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.you2, container, false);
        mcardView = rootView.findViewById(R.id.anatomy);
        mcardView.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        v.startAnimation(buttonClick);
                        startActivity(new Intent(getActivity(), anatomy.class));
                    }
                });
        mcardView = rootView.findViewById(R.id.carddd);
        mcardView.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        v.startAnimation(buttonClick);
                        startActivity(new Intent(getActivity(), sexuality.class));
                    }
                });
        mcardView = rootView.findViewById(R.id.cardt);
        mcardView.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        v.startAnimation(buttonClick);
                        startActivity(new Intent(getActivity(), SGBV.class));
                    }
                });
        mcardView = rootView.findViewById(R.id.cardd);
        mcardView.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        v.startAnimation(buttonClick);
                        startActivity(new Intent(getActivity(), gender.class));
                    }
                });
        mcardView = rootView.findViewById(R.id.TB);
        mcardView.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        v.startAnimation(buttonClick);
                        startActivity(new Intent(getActivity(), consent.class));
                    }
                });
        mcardView = rootView.findViewById(R.id.men);
        mcardView.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        v.startAnimation(buttonClick);
                        startActivity(new Intent(getActivity(), menstruation.class));
                    }
                });
        mcardView = rootView.findViewById(R.id.child);
        mcardView.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        v.startAnimation(buttonClick);
                        startActivity(new Intent(getActivity(), teenagepreg.class));
                    }
                });
        mcardView = rootView.findViewById(R.id.card);
        mcardView.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        v.startAnimation(buttonClick);
                        startActivity(new Intent(getActivity(), fp.class));
                    }
                });

        return rootView;
    }
}


