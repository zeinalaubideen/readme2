package zayne.foundationsfinal;

import android.graphics.Color;
import android.graphics.Typeface;
import android.media.AudioManager;
import android.media.SoundPool;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

import com.github.amlcurran.showcaseview.ShowcaseView;
import com.github.amlcurran.showcaseview.targets.ActionViewTarget;

public class HuroofDescript extends AppCompatActivity {

    private TextView harf, insert;

    private DescriptionParams huroof;

    private  SoundLoader sounder;

    private int[] sounds = {R.raw.alif};/*, R.raw.ba, R.raw.ta, R.raw.tha, R.raw.jeem, R.raw.ha, R.raw.kha, R.raw.dal, R.raw.dhal, R.raw.ra, R.raw.zay,
            R.raw.seen, R.raw.sheen, R.raw.saad, R.raw.daad, R.raw.taah, R.raw.dhaa, R.raw.ayn, R.raw.ghayn, R.raw.fa, R.raw.qaf, R.raw.kaf, R.raw.lam,
            R.raw.meem, R.raw.noon, R.raw.wow, R.raw.haa, R.raw.hamza, R.raw.yaa};*/

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.content_alif);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        // Give path to the Font location
        //String Path2font = "Damascus.ttc";
        // Give label to TextView object defined in layout

        // Load the Font and define typeface accordingly
        //Typeface tf = Typeface.createFromAsset(getAssets(), Path2font);


        //this is to include a back button on the tool bar
        toolbar.setNavigationIcon(R.drawable.back);
        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });

        //this is used to chage the text relating to the makhraj of each harf
        insert = (TextView) findViewById(R.id.makhraj);
        harf = (TextView) findViewById(R.id.harf);
        //harf.setTypeface(tf);
        Bundle extras = getIntent().getExtras();



        if (extras.getInt("harf") == 1) {

            getSupportActionBar().setTitle("اليف");


            String arabic = "ا";
            String descript = "Empty portion of mouth (oral cavity)";

            huroof = new DescriptionParams(arabic, descript, harf, insert);
            sounder = new SoundLoader(this, harf, sounds[0]);
            sounder.playOne();

            huroof.intialDisplay();

        } else if (extras.getInt("harf") == 2) {

            getSupportActionBar().setTitle("بَاء");

            String arabic = "ب";
            String descript = "Both lips";

            huroof = new DescriptionParams(arabic, descript, harf, insert);
            sounder = new SoundLoader(this, harf, sounds[0]);
            sounder.playOne();

            huroof.intialDisplay();

        } else if (extras.getInt("harf") == 3) {
            getSupportActionBar().setTitle("تَاء");

            String arabic = "ت";
            String descript = "Tip of tongue touching gums of upper two front teeth";

            huroof = new DescriptionParams(arabic, descript, harf, insert);
            sounder = new SoundLoader(this, harf, sounds[0]);
            sounder.playOne();

            huroof.intialDisplay();




        } else if (extras.getInt("harf") == 4) {

            getSupportActionBar().setTitle("ثَاء");

            String arabic = "ث";
            String descript = "Tip of tongue touching edge of upper two front teeth";

            huroof = new DescriptionParams(arabic, descript, harf, insert);
            sounder = new SoundLoader(this, harf, sounds[0]);
            sounder.playOne();

            huroof.intialDisplay();


        } else if (extras.getInt("harf") == 5) {

            getSupportActionBar().setTitle("جِيم");

            String arabic = "ج";
            String descript = "Center of tongue touching upper palate";

            huroof = new DescriptionParams(arabic, descript, harf, insert);
            sounder = new SoundLoader(this, harf, sounds[0]);
            sounder.playOne();

            huroof.intialDisplay();



        } else if (extras.getInt("harf") == 6) {
            getSupportActionBar().setTitle("حَاء");

            String arabic = "ح";
            String descript = "Middle of the throat";

            huroof = new DescriptionParams(arabic, descript, harf, insert);
            sounder = new SoundLoader(this, harf, sounds[0]);
            sounder.playOne();

            huroof.intialDisplay();


        } else if (extras.getInt("harf") == 7) {
            getSupportActionBar().setTitle("خَاء");

            String arabic = "خ";
            String descript = "Top of the throat";

            huroof = new DescriptionParams(arabic, descript, harf, insert);
            sounder = new SoundLoader(this, harf, sounds[0]);
            sounder.playOne();

            huroof.intialDisplay();


        } else if (extras.getInt("harf") == 8) {
            getSupportActionBar().setTitle("دَال");

            String arabic = "د";
            String descript = "Tip of tongue touching gums of upper two front teeth";

            huroof = new DescriptionParams(arabic, descript, harf, insert);
            sounder = new SoundLoader(this, harf, sounds[0]);
            sounder.playOne();

            huroof.intialDisplay();


        } else if (extras.getInt("harf") == 9) {
            getSupportActionBar().setTitle("ذَال");

            String arabic = "ذ";
            String descript = "Tip of tongue touching edge of upper two front teeth";

            huroof = new DescriptionParams(arabic, descript, harf, insert);
            sounder = new SoundLoader(this, harf, sounds[0]);
            sounder.playOne();

            huroof.intialDisplay();


        } else if (extras.getInt("harf") == 10) {
            getSupportActionBar().setTitle("رَاء");

            String arabic = "ر";
            String descript = "Similar to ن, but excluding the canines and using top of tongue along with tip";

            huroof = new DescriptionParams(arabic, descript, harf, insert);
            sounder = new SoundLoader(this, harf, sounds[0]);
            sounder.playOne();

            huroof.intialDisplay();


        } else if (extras.getInt("harf") == 11) {
            getSupportActionBar().setTitle("زَاي");

            String arabic = "ز";
            String descript = "Tip of tongue touching edge of lower two front teeth along with upper two front teeth";

            huroof = new DescriptionParams(arabic, descript, harf, insert);
            sounder = new SoundLoader(this, harf, sounds[0]);
            sounder.playOne();

            huroof.intialDisplay();

        } else if (extras.getInt("harf") == 12) {
            getSupportActionBar().setTitle("سِين");

            String arabic = "س";
            String descript = "Tip of tongue touching edge of lower two front teeth along with upper two front teeth";

            huroof = new DescriptionParams(arabic, descript, harf, insert);
            sounder = new SoundLoader(this, harf, sounds[0]);
            sounder.playOne();

            huroof.intialDisplay();


        } else if (extras.getInt("harf") == 13) {
            getSupportActionBar().setTitle("شِين");

            String arabic = "ش";
            String descript = "Center of tongue touching upper palate";

            huroof = new DescriptionParams(arabic, descript, harf, insert);
            sounder = new SoundLoader(this, harf, sounds[0]);
            sounder.playOne();

            huroof.intialDisplay();

        } else if (extras.getInt("harf") == 14) {
            getSupportActionBar().setTitle("صَاد");

            String arabic = "ص";
            String descript = "Tip of tongue touching edge of lower two front teeth along with upper two front teeth";

            huroof = new DescriptionParams(arabic, descript, harf, insert);
            sounder = new SoundLoader(this, harf, sounds[0]);
            sounder.playOne();

            huroof.intialDisplay();

        } else if (extras.getInt("harf") == 15) {
            getSupportActionBar().setTitle("صَاد");

            String arabic = "ض";
            String descript = "Upturned left, right, or both sides of tongue touching inner gums of upper molars (left side is easiest)";

            huroof = new DescriptionParams(arabic, descript, harf, insert);
            sounder = new SoundLoader(this, harf, sounds[0]);
            sounder.playOne();

            huroof.intialDisplay();

        } else if (extras.getInt("harf") == 16) {

            getSupportActionBar().setTitle("طَاء");

            String arabic = "ط";
            String descript = "Tip of tongue touching gums of upper two front teeth";

            huroof = new DescriptionParams(arabic, descript, harf, insert);
            sounder = new SoundLoader(this, harf, sounds[0]);
            sounder.playOne();

            huroof.intialDisplay();

        } else if (extras.getInt("harf") == 17) {
            getSupportActionBar().setTitle("ظَاء");


            String arabic = "ظ";
            String descript = "Tip of tongue touching edge of upper two front teeth";

            huroof = new DescriptionParams(arabic, descript, harf, insert);
            sounder = new SoundLoader(this, harf, sounds[0]);
            sounder.playOne();

            huroof.intialDisplay();

        } else if (extras.getInt("harf") == 18) {
            getSupportActionBar().setTitle("عَينٍ");

            String arabic = "ع";
            String descript = "Middle of the throat";

            huroof = new DescriptionParams(arabic, descript, harf, insert);
            sounder = new SoundLoader(this, harf, sounds[0]);
            sounder.playOne();

            huroof.intialDisplay();

        } else if (extras.getInt("harf") == 19) {
            getSupportActionBar().setTitle("غَين");

            String arabic = "غ";
            String descript = "Top of the throat";

            huroof = new DescriptionParams(arabic, descript, harf, insert);
            sounder = new SoundLoader(this, harf, sounds[0]);
            sounder.playOne();

            huroof.intialDisplay();

        } else if (extras.getInt("harf") == 20) {
            getSupportActionBar().setTitle("فَاء");

            String arabic = "ف";
            String descript = "Rearmost of tongue touching upper palate";

            huroof = new DescriptionParams(arabic, descript, harf, insert);
            sounder = new SoundLoader(this, harf, sounds[0]);
            sounder.playOne();

            huroof.intialDisplay();

        } else if (extras.getInt("harf") == 21) {

            getSupportActionBar().setTitle("قَاف");


            String arabic = "ق";
            String descript = "Edge of upper two front teeth touching inner portion of lower lip";

            huroof = new DescriptionParams(arabic, descript, harf, insert);
            sounder = new SoundLoader(this, harf, sounds[0]);
            sounder.playOne();

            huroof.intialDisplay();

        } else if (extras.getInt("harf") == 22) {

            getSupportActionBar().setTitle("كَاف");

            String arabic = "ك";
            String descript = "Rear of tongue touching upper palate";

            huroof = new DescriptionParams(arabic, descript, harf, insert);
            sounder = new SoundLoader(this, harf, sounds[0]);
            sounder.playOne();

            huroof.intialDisplay();

        } else if (extras.getInt("harf") == 23) {

            getSupportActionBar().setTitle("لاَم");



            String arabic = "ل";
            String descript = "Edges (on either side or both sides) of tongue (from tip to side) touching gums of upper front teeth until premolars";

            huroof = new DescriptionParams(arabic, descript, harf, insert);
            sounder = new SoundLoader(this, harf, sounds[0]);
            sounder.playOne();

            huroof.intialDisplay();

        } else if (extras.getInt("harf") == 24) {
            getSupportActionBar().setTitle("مِيم");

            String arabic = "م";
            String descript = "Lips touching one another or from the nasal cavity only under special circumstances which will be explained later on";

            huroof = new DescriptionParams(arabic, descript, harf, insert);
            sounder = new SoundLoader(this, harf, sounds[0]);
            sounder.playOne();

            huroof.intialDisplay();

        } else if (extras.getInt("harf") == 25) {
            getSupportActionBar().setTitle("نُون");

            String arabic = "ن";
            String descript = "Edges (on either side or both sides) of tongue (from tip to side) touching gums of upper front teeth until canine or from the nasal cavity only under special circumstances which will be explained later on";

            huroof = new DescriptionParams(arabic, descript, harf, insert);
            sounder = new SoundLoader(this, harf, sounds[0]);
            sounder.playOne();

            huroof.intialDisplay();

        } else if (extras.getInt("harf") == 26) {
            getSupportActionBar().setTitle("وَاو");

            String arabic = "و";
            String descript = "Both lips";

            huroof = new DescriptionParams(arabic, descript, harf, insert);
            sounder = new SoundLoader(this, harf, sounds[0]);
            sounder.playOne();

            huroof.intialDisplay();

        } else if (extras.getInt("harf") == 27) {
            getSupportActionBar().setTitle("هَاء");

            String arabic = "ه";
            String descript = "Bottom of the throat";

            huroof = new DescriptionParams(arabic, descript, harf, insert);
            sounder = new SoundLoader(this, harf, sounds[0]);
            sounder.playOne();

            huroof.intialDisplay();

        } else if (extras.getInt("harf") == 28) {
            getSupportActionBar().setTitle("هَمزَة");

            String arabic = "ء";
            String descript = "Bottom of the throat";

            huroof = new DescriptionParams(arabic, descript, harf, insert);
            sounder = new SoundLoader(this, harf, sounds[0]);
            sounder.playOne();

            huroof.intialDisplay();

        } else if (extras.getInt("harf") == 29) {

            getSupportActionBar().setTitle("يَاء");

            String arabic = "ي";
            String descript = "Empty portion of mouth (oral cavity)";

            huroof = new DescriptionParams(arabic, descript, harf, insert);
            sounder = new SoundLoader(this, harf, sounds[0]);
            sounder.playOne();

            huroof.intialDisplay();

        }
    }
}


