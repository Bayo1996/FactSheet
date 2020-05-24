package com.HIVFactsheet;
import android.content.Intent;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.cardview.widget.CardView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AlphaAnimation;
import android.widget.Toast;

/**
 * Created by Brian on 7/2/2017.
 */

public class partners extends Fragment {
    private AlphaAnimation buttonClick = new AlphaAnimation(1F,0.8F);
    private CardView mcardView;

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.partner, container, false);

        mcardView = rootView.findViewById(R.id.card_view1);
        mcardView.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        v.startAnimation(buttonClick);
                        startActivity(new Intent(getActivity(), peereduc.class));
                    }
                });
        mcardView = rootView.findViewById(R.id.card);
        mcardView.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        v.startAnimation(buttonClick);
                        startActivity(new Intent(getActivity(), rafikiover.class));
                    }
                });
        mcardView = rootView.findViewById(R.id.card_view);
        mcardView.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        v.startAnimation(buttonClick);
                        startActivity(new Intent(getActivity(), aunty.class));
                    }
                });
        mcardView = rootView.findViewById(R.id.card_view5);
        mcardView.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        v.startAnimation(buttonClick);
                        Toast.makeText(getActivity(),"Adolescent Hub content not available at the moment", Toast.LENGTH_SHORT).show();
                    }
                });
        mcardView = rootView.findViewById(R.id.card_view4);
        mcardView.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        v.startAnimation(buttonClick);
                        startActivity(new Intent(getActivity(), one_to_one.class));
                    }
                });
        mcardView = rootView.findViewById(R.id.card_view3);
        mcardView.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        v.startAnimation(buttonClick);
                        startActivity(new Intent(getActivity(), iyapp.class));
                    }
                });
        return rootView;
    }
}



