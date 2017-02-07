package com.ibm.browna.gritapp.Views.Assessments;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.ibm.browna.gritapp.R;

/**
 * Created by browna on 2/3/2017.
 */

public class SquadSendinviteFragment extends Fragment {

    Button mInviteButton;

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_squad_invite,null,false);

        mInviteButton =(Button) v.findViewById(R.id.send_squad_invites);
        mInviteButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ((AssessmentActivity)getActivity()).swapFragments(new SquadCongratsFragment());
            }
        });

        return v;
    }
}
