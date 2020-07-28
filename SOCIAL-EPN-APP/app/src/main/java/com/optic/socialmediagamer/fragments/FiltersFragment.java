package com.optic.socialmediagamer.fragments;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;

import com.optic.socialmediagamer.R;
import com.optic.socialmediagamer.activities.FiltersActivity;

/**
 * A simple {@link Fragment} subclass.
 */
public class FiltersFragment extends Fragment {

    View mView;
    CardView mCardViewPS4;
    CardView mCardViewXBOX;
    CardView mCardViewNINTENDO;
    CardView mCardViewPC;

    public FiltersFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        mView = inflater.inflate(R.layout.fragment_filters, container, false);
        mCardViewPS4 = mView.findViewById(R.id.cardViewPs4);
        mCardViewXBOX = mView.findViewById(R.id.cardViewXBOX);
        mCardViewNINTENDO = mView.findViewById(R.id.cardViewNINTENDO);
        mCardViewPC = mView.findViewById(R.id.cardViewPC);

        mCardViewPS4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                goToFilterActivity("FISICA Y MATEMÁTICAS");
            }
        });

        mCardViewXBOX.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                goToFilterActivity("INGLÉS");
            }
        });

        mCardViewNINTENDO.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                goToFilterActivity("REDES");
            }
        });

        mCardViewPC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                goToFilterActivity("INFORMÁTICA");
            }
        });

        return mView;
    }

    private void goToFilterActivity(String category) {
        Intent intent = new Intent(getContext(), FiltersActivity.class);
        intent.putExtra("category", category);
        startActivity(intent);
    }
}
