package zayne.foundationsfinal;

import android.view.View;
import android.widget.TextView;

import org.w3c.dom.Text;

/**
 * Created by zein on 3/30/16.
 */
public class DescriptionParams {

    private String  harfOne, harfTwo, harfThree, dOne, dTwo, dThree;
    private String[] descritopns;
    private TextView harf1, harf2, harf3, harfDes;

    DescriptionParams(String h1, String h2, String h3, String d1, String d2, String d3, TextView t1, TextView t2, TextView t3, TextView harfy){
        harfOne = h1;
        harfTwo = h2;
        harfThree = h3;
        dOne = d1;
        dTwo = d2;
        dThree =d3;
        harf1 = t1;
        harf2 = t2;
        harf3 = t3;
        harfDes = harfy;
    }

    DescriptionParams(String h1, String h2, TextView t1, TextView t2 ){
        harfOne = h1;
        harfTwo = h2;

        harf1 = t1;
        harf2 = t2;

    }

    DescriptionParams(String letter, String describe,  TextView harfDesBox, TextView t1, TextView t2, TextView t3){
        harfOne = letter;
        dOne = describe;
        harf1 = t1;
        harf2 = t2;
        harf3 = t3;
        harfDes = harfDesBox;

    }

    public void intialDisplay(){
        harf1.setText(harfOne);
        harf2.setText(harfTwo);

    }

    public void setup(){
        harf1.setText(harfOne);
        harf1.setVisibility(View.VISIBLE);
        harf2.setVisibility(View.GONE);
        harf3.setVisibility(View.GONE);
    }

    public void setupTwo(){
        harf1.setText(harfOne);
        harfDes.setText(dOne);
        harf1.setVisibility(View.VISIBLE);
        harf2.setVisibility(View.GONE);
        harf3.setVisibility(View.GONE);
    }

    public void displayone(){
        harf1.setText(harfOne);
        harfDes.setText(dOne);
        harf1.setVisibility(View.VISIBLE);
        harf2.setVisibility(View.GONE);
        harf3.setVisibility(View.GONE);

    }

    public void displayTwo(){
        harf2.setText(harfTwo);
        harfDes.setText(dTwo);
        harf1.setVisibility(View.GONE);
        harf2.setVisibility(View.VISIBLE);
        harf3.setVisibility(View.GONE);

    }

    public void displayThree(){
        harf3.setText(harfThree);
        harfDes.setText(dThree);
        harf1.setVisibility(View.GONE);
        harf2.setVisibility(View.GONE);
        harf3.setVisibility(View.VISIBLE);

    }

    public void displayTOne(){
        harf1.setText(harfOne);

        harf1.setVisibility(View.VISIBLE);
        harf2.setVisibility(View.GONE);


    }

    public void displayTTwo(){

        harf2.setText(harfTwo);
        harf1.setVisibility(View.GONE);
        harf2.setVisibility(View.VISIBLE);

    }



}
