package zayne.foundationsfinal;

import android.view.View;
import android.widget.TextView;

/**
 * Created by zein on 3/30/16.
 */
public class DescriptionParams {

    private String  harf;
    private String[] descritopns;
    private TextView harf1, harf2, harf3;

    DescriptionParams(String letter, TextView t1, TextView t2, TextView t3){
        harf = letter;
        harf1 = t1;
        harf2 = t2;
        harf3 = t3;
    }

    public void setup(){
        harf1.setText(harf);
        harf1.setVisibility(View.VISIBLE);
        harf2.setVisibility(View.GONE);
        harf3.setVisibility(View.GONE);
    }



}
