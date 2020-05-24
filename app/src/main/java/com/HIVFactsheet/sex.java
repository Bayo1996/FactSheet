package com.HIVFactsheet;
import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AlphaAnimation;
import android.widget.Button;

/**
 * Created by Brian on 7/2/2017.
 */

public class sex extends Fragment {
    private AlphaAnimation buttonClick = new AlphaAnimation(1F,0.8F);
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState)
    {
        View rootView = inflater.inflate(R.layout.sex, container, false);
        Intent intennnnt= new Intent(getActivity(),sexual.class);
        Button bn= rootView.findViewById(R.id.button15);
        bn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                v.startAnimation(buttonClick);
                Intent intennnnt= new Intent(getActivity(),sexual.class);
                getActivity().startActivity(intennnnt);
            }
        });
        Intent intennnt= new Intent(getActivity(),contra.class);
        Button buton= rootView.findViewById(R.id.button16);
        buton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                v.startAnimation(buttonClick);
                Intent intennnt= new Intent(getActivity(),contra.class);
                getActivity().startActivity(intennnt);
            }
        });

        Intent intnt= new Intent(getActivity(), sti.class);
        Button buon= rootView.findViewById(R.id.button17);
        buon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                v.startAnimation(buttonClick);
                Intent intnt= new Intent(getActivity(),sti.class);
                getActivity().startActivity(intnt);
            }
        });


        return rootView ;
    }



}