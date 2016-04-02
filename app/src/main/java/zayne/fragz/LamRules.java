package zayne.fragz;


import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import zayne.foundationsfinal.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class LamRules extends Fragment {


    public LamRules() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View huroof = inflater.inflate(R.layout.fragment_lam_rules, container, false);
        Toast.makeText(huroof.getContext(), "Please scroll through to see which letters belong in which group.", Toast.LENGTH_SHORT).show();

        return huroof;

    }

}
