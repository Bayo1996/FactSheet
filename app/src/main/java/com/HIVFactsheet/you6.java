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

public class you6 extends Fragment {
    private AlphaAnimation buttonClick = new AlphaAnimation(1F,0.8F);
    private CardView mcardView;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fac, container, false);

        mcardView = rootView.findViewById(R.id.card_view1);
        mcardView.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        v.startAnimation(buttonClick);
                        startActivity(new Intent(getActivity(), TBprev.class));
                    }
                });
        mcardView = rootView.findViewById(R.id.card_view);
        mcardView.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        v.startAnimation(buttonClick);
                        startActivity(new Intent(getActivity(), TBtrans.class));
                    }
                });
        mcardView = rootView.findViewById(R.id.card_view3);
        mcardView.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        v.startAnimation(buttonClick);
                        startActivity(new Intent(getActivity(), rehabilitation.class));
                    }
                });
        mcardView = rootView.findViewById(R.id.card_view4);
        mcardView.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        v.startAnimation(buttonClick);
                        startActivity(new Intent(getActivity(), mentals.class));
                    }
                });
        mcardView = rootView.findViewById(R.id.card_view5);
        mcardView.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        v.startAnimation(buttonClick);
                        startActivity(new Intent(getActivity(), support.class));
                    }
                });
    return rootView;
    }
    }



