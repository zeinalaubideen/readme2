package zayne.fragz;


import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import zayne.foundationsfinal.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class Stopping extends Fragment {


    public Stopping() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        return inflater.inflate(R.layout.fragment_stopping, container, false);
    }

}
