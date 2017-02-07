package com.ibm.browna.gritapp.Views.Assessments;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;

import com.ibm.browna.gritapp.R;

/**
 * Created by browna on 2/3/2017.
 */

public class SquadAdderFragment extends Fragment {
    Button mInviteButton;
    ImageView mAdder1, mAdder2, mAdder3, mAdder4, mAdder5;
    Boolean one, two, three, four, five;

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_squad_adding_contacts,null,false);
        initViews(v);
        mInviteButton =(Button) v.findViewById(R.id.send_squad_invites);
        mInviteButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ((AssessmentActivity)getActivity()).swapFragments(new SquadSendinviteFragment());
            }
        });
        mAdder1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!one){
                    mAdder1.setImageDrawable(getActivity().getDrawable(R.drawable.contact_added));
                    one = true;
                }


            }
        });
        mAdder2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!two){
                    mAdder2.setImageDrawable(getActivity().getDrawable(R.drawable.contact_added));
                    two = true;
                }

            }
        });
        mAdder3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!three){
                    mAdder3.setImageDrawable(getActivity().getDrawable(R.drawable.contact_added));
                    three = true;
                }
            }
        });
        mAdder4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!four){
                    mAdder4.setImageDrawable(getActivity().getDrawable(R.drawable.contact_added));
                    four = true;
                }
            }
        });
        mAdder5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!five){
                    mAdder5.setImageDrawable(getActivity().getDrawable(R.drawable.contact_added));
                    five = true;
                }
            }
        });

        return v;
    }
    private void initViews(View v){
        mAdder1 = (ImageView) v.findViewById(R.id.plus1) ;
        mAdder2 = (ImageView) v.findViewById(R.id.plus2);
        mAdder3 = (ImageView) v.findViewById(R.id.plus3);
        mAdder4 = (ImageView) v.findViewById(R.id.plus4);
        mAdder5 = (ImageView) v.findViewById(R.id.plus5);
        one = false;
        two = false;
        three = false;
        four = false;
        five = false;
    }

}
