package zayne.fragz;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import zayne.foundationsfinal.R;

/**
 * Created by zayne on 1/20/16.
 */
public class Intro extends Fragment {
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View intro = inflater.inflate(R.layout.intro, container, false);

        return intro;
    }
}
