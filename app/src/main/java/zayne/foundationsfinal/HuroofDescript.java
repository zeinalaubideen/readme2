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
    int alif, ba, ta, tha, jeem, ha,
            kha, dal, dhal, ra, zay, seen, sheen, saad, daad, taah,
            dhaa, ayn, ghayn, fa, qaf, kaf, lam, meem, noon, wow, haa, hamza, ya;


    private TextView harf;

    private TextView insert;

    /*SoundPool harfs;
    int[] sounds = {R.raw.alif, R.raw.ba, R.raw.ta, R.raw.tha, R.raw.jeem, R.raw.ha, R.raw.kha, R.raw.dal, R.raw.dhal, R.raw.ra, R.raw.zay,
            R.raw.seen, R.raw.sheen, R.raw.saad, R.raw.daad, R.raw.taah, R.raw.dhaa, R.raw.ayn, R.raw.ghayn, R.raw.fa, R.raw.qaf, R.raw.kaf, R.raw.lam,
            R.raw.meem, R.raw.noon, R.raw.wow, R.raw.haa, R.raw.hamza, R.raw.yaa};*/

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.content_alif);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        // Give path to the Font location
        String Path2font = "Damascus.ttc";
// Give label to TextView object defined in layout

// Load the Font and define typeface accordingly
        Typeface tf = Typeface.createFromAsset(getAssets(), Path2font);


        //this is to include a back button on the tool bar
        toolbar.setNavigationIcon(R.drawable.back);
        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });
       // harf.setTextColor(Color.parseColor("#FDFFFC"));


        //this is used to change the image to the proper harf


        //this is used to chage the text relating to the makhraj of each harf
        insert = (TextView) findViewById(R.id.makhraj);
        harf = (TextView) findViewById(R.id.harf);
        harf.setTypeface(tf);
        Bundle extras = getIntent().getExtras();

        //This is where all the sound files are goiing to be placed
       /* harfs = new SoundPool(1, AudioManager.STREAM_MUSIC, 0);
        alif = harfs.load(this, sounds[0], 1);
        ba = harfs.load(this, sounds[1], 1);
        ta = harfs.load(this, sounds[2], 1);
        tha = harfs.load(this, sounds[3], 1);
        jeem = harfs.load(this, sounds[4], 1);
        ha = harfs.load(this, sounds[5], 1);
        kha = harfs.load(this, sounds[6], 1);
        dal = harfs.load(this, sounds[7], 1);
        dhal = harfs.load(this, sounds[8], 1);
        ra = harfs.load(this, sounds[9], 1);
        zay = harfs.load(this, sounds[10], 1);
        seen = harfs.load(this, sounds[11], 1);
        sheen = harfs.load(this, sounds[12], 1);
        saad = harfs.load(this, sounds[13], 1);
        daad = harfs.load(this, sounds[14], 1);
        taah = harfs.load(this, sounds[15], 1);
        dhaa = harfs.load(this, sounds[16], 1);
        ayn = harfs.load(this, sounds[17], 1);
        ghayn = harfs.load(this, sounds[18], 1);
        fa = harfs.load(this, sounds[19], 1);
        qaf = harfs.load(this, sounds[20], 1);
        kaf = harfs.load(this, sounds[21], 1);
        lam = harfs.load(this, sounds[22], 1);
        meem = harfs.load(this, sounds[23], 1);
        noon = harfs.load(this, sounds[24], 1);
        wow = harfs.load(this, sounds[25], 1);
        haa = harfs.load(this, sounds[26], 1);
        hamza = harfs.load(this, sounds[27], 1);
        ya = harfs.load(this, sounds[28], 1);





        if (extras.getInt("harf") == 1) {

            getSupportActionBar().setTitle("اليف");

            harf.setText("ا");


            insert.setText(R.string.alifMakhraj);


            harf.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    harfs.play(alif, 1, 1, 1, 1, 1);
                }
            });
        } else if (extras.getInt("harf") == 2) {

            harf.setText("ب");
            insert.setText(R.string.baMakhraj);


            harf.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    harfs.play(ba, 1, 1, 1, 1, 1);


                }
            });
        } else if (extras.getInt("harf") == 3) {

            harf.setText("ت");
            insert.setText(R.string.taMakhraj);


            harf.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    harfs.play(ta, 1, 1, 1, 1, 1);


                }
            });
        } else if (extras.getInt("harf") == 4) {

            harf.setText("ث");
            insert.setText(R.string.thaMakhraj);


            harf.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    harfs.play(tha, 1, 1, 1, 1, 1);


                }
            });
        } else if (extras.getInt("harf") == 5) {


            harf.setText("ج");
            insert.setText(R.string.jeemMakhraj);


            harf.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    harfs.play(jeem, 1, 1, 1, 1, 1);


                }
            });
        } else if (extras.getInt("harf") == 6) {

            harf.setText("ح");
            insert.setText(R.string.haMakhraj);


            harf.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    harfs.play(ha, 1, 1, 1, 1, 1);


                }
            });
        } else if (extras.getInt("harf") == 7) {

            harf.setText("خ");
            insert.setText(R.string.khaMakhraj);


            harf.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    harfs.play(kha, 1, 1, 1, 1, 1);

                }
            });
        } else if (extras.getInt("harf") == 8) {

            harf.setText("د");
            insert.setText(R.string.daMakhraj);


            harf.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    harfs.play(dal, 1, 1, 1, 1, 1);

                }
            });
        } else if (extras.getInt("harf") == 9) {

            harf.setText("ذ");
            ;
            insert.setText(R.string.dhaMakhraj);


            harf.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    harfs.play(dhal, 1, 1, 1, 1, 1);

                }
            });
        } else if (extras.getInt("harf") == 10) {

            harf.setText("ر");
            insert.setText(R.string.raMakhraj);


            harf.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    harfs.play(ra, 1, 1, 1, 1, 1);

                }
            });
        } else if (extras.getInt("harf") == 11) {

            harf.setText("ز");
            insert.setText(R.string.zaMakhraj);


            harf.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    harfs.play(zay, 1, 1, 1, 1, 1);

                }
            });
        } else if (extras.getInt("harf") == 12) {

            harf.setText("س");
            insert.setText(R.string.seenMakhraj);


            harf.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    harfs.play(seen, 1, 1, 1, 1, 1);

                }
            });
        } else if (extras.getInt("harf") == 13) {

            harf.setText("ش");
            insert.setText(R.string.sheenMakhraj);


            harf.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    harfs.play(sheen, 1, 1, 1, 1, 1);

                }
            });
        } else if (extras.getInt("harf") == 14) {

            harf.setText("ص");
            insert.setText(R.string.saadMakhraj);


            harf.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    harfs.play(saad, 1, 1, 1, 1, 1);

                }
            });
        } else if (extras.getInt("harf") == 15) {

            harf.setText("ض");
            insert.setText(R.string.daadMakhraj);


            harf.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    harfs.play(daad, 1, 1, 1, 1, 1);

                }
            });
        } else if (extras.getInt("harf") == 16) {

            harf.setText("ط");
            insert.setText(R.string.taahMakhraj);


            harf.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    harfs.play(taah, 1, 1, 1, 1, 1);

                }
            });
        } else if (extras.getInt("harf") == 17) {

            harf.setText("ظ");
            insert.setText(R.string.dhaaMakhraj);


            harf.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    harfs.play(dhaa, 1, 1, 1, 1, 1);

                }
            });
        } else if (extras.getInt("harf") == 18) {

            harf.setText("ع");
            insert.setText(R.string.aynMakhraj);


            harf.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    harfs.play(ayn, 1, 1, 1, 1, 1);

                }
            });
        } else if (extras.getInt("harf") == 19) {

            harf.setText("غ");
            insert.setText(R.string.ghaynMakhraj);


            harf.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    harfs.play(ghayn, 1, 1, 1, 1, 1);

                }
            });
        } else if (extras.getInt("harf") == 20) {

            harf.setText("ف");
            insert.setText(R.string.faMakhraj);


            harf.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    harfs.play(fa, 1, 1, 1, 1, 1);

                }
            });
        } else if (extras.getInt("harf") == 21) {

            harf.setText("ق");
            insert.setText(R.string.qafMakhraj);


            harf.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    harfs.play(qaf, 1, 1, 1, 1, 1);

                }
            });
        } else if (extras.getInt("harf") == 22) {

            harf.setText("ك");
            insert.setText(R.string.kafMakhraj);


            harf.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    harfs.play(kaf, 1, 1, 1, 1, 1);

                }
            });
        } else if (extras.getInt("harf") == 23) {

            harf.setText("ل");
            insert.setText(R.string.lamMakhraj);


            harf.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    harfs.play(lam, 1, 1, 1, 1, 1);

                }
            });
        } else if (extras.getInt("harf") == 24) {

            harf.setText("م");
            insert.setText(R.string.meemMakhraj);


            harf.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    harfs.play(meem, 1, 1, 1, 1, 1);

                }
            });
        } else if (extras.getInt("harf") == 25) {

            harf.setText("ن");
            insert.setText(R.string.noonMakhraj);


            harf.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    harfs.play(noon, 1, 1, 1, 1, 1);

                }
            });
        } else if (extras.getInt("harf") == 26) {

            harf.setText("و");
            insert.setText(R.string.wowMakhraj);


            harf.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    harfs.play(wow, 1, 1, 1, 1, 1);

                }
            });
        } else if (extras.getInt("harf") == 27) {

            harf.setText("ه");
            insert.setText(R.string.haaMakhraj);


            harf.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    harfs.play(haa, 1, 1, 1, 1, 1);

                }
            });
        } else if (extras.getInt("harf") == 28) {

            harf.setText("ء");
            insert.setText(R.string.hamzaMakhraj);


            harf.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    harfs.play(hamza, 1, 1, 1, 1, 1);

                }
            });
        } else if (extras.getInt("harf") == 29) {

            harf.setText("ي");
            insert.setText(R.string.yaMakhraj);


            harf.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    harfs.play(ya, 1, 1, 1, 1, 1);

                }
            });
        }*/

        if (extras.getInt("harf") == 1) {

            getSupportActionBar().setTitle("اليف");

            harf.setText("ا");


            insert.setText(R.string.alifMakhraj);


            harf.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    //harfs.play(alif, 1, 1, 1, 1, 1);
                }
            });
        } else if (extras.getInt("harf") == 2) {
            getSupportActionBar().setTitle("بَاء");


            harf.setText("ب");
            insert.setText(R.string.baMakhraj);


            harf.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                }
            });
        } else if (extras.getInt("harf") == 3) {
            getSupportActionBar().setTitle("تَاء");


            harf.setText("ت");
            insert.setText(R.string.taMakhraj);


            harf.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                }
            });
        } else if (extras.getInt("harf") == 4) {

            getSupportActionBar().setTitle("ثَاء");


            harf.setText("ث");
            insert.setText(R.string.thaMakhraj);


            harf.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                }
            });
        } else if (extras.getInt("harf") == 5) {

            getSupportActionBar().setTitle("جِيم");


            harf.setText("ج");
            insert.setText(R.string.jeemMakhraj);


            harf.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                }
            });
        } else if (extras.getInt("harf") == 6) {
            getSupportActionBar().setTitle("حَاء");


            harf.setText("ح");
            insert.setText(R.string.haMakhraj);


            harf.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                }
            });
        } else if (extras.getInt("harf") == 7) {
            getSupportActionBar().setTitle("خَاء");

            harf.setText("خ");
            insert.setText(R.string.khaMakhraj);


            harf.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                }
            });
        } else if (extras.getInt("harf") == 8) {
            getSupportActionBar().setTitle("دَال");


            harf.setText("د");
            insert.setText(R.string.daMakhraj);


            harf.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                }
            });
        } else if (extras.getInt("harf") == 9) {
            getSupportActionBar().setTitle("ذَال");


            harf.setText("ذ");
            ;
            insert.setText(R.string.dhaMakhraj);


            harf.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                }
            });
        } else if (extras.getInt("harf") == 10) {
            getSupportActionBar().setTitle("رَاء");


            harf.setText("ر");
            insert.setText(R.string.raMakhraj);


            harf.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                }
            });
        } else if (extras.getInt("harf") == 11) {
            getSupportActionBar().setTitle("زَاي");


            harf.setText("ز");
            insert.setText(R.string.zaMakhraj);


            harf.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                }
            });
        } else if (extras.getInt("harf") == 12) {
            getSupportActionBar().setTitle("سِين");


            harf.setText("س");
            insert.setText(R.string.seenMakhraj);


            harf.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                }
            });
        } else if (extras.getInt("harf") == 13) {
            getSupportActionBar().setTitle("شِين");


            harf.setText("ش");
            insert.setText(R.string.sheenMakhraj);


            harf.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                }
            });
        } else if (extras.getInt("harf") == 14) {
            getSupportActionBar().setTitle("صَاد");


            harf.setText("ص");
            insert.setText(R.string.saadMakhraj);


            harf.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                }
            });
        } else if (extras.getInt("harf") == 15) {
            getSupportActionBar().setTitle("صَاد");


            harf.setText("ض");
            insert.setText(R.string.daadMakhraj);


            harf.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                }
            });
        } else if (extras.getInt("harf") == 16) {

            getSupportActionBar().setTitle("طَاء");


            harf.setText("ط");
            insert.setText(R.string.taahMakhraj);


            harf.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                }
            });
        } else if (extras.getInt("harf") == 17) {
            getSupportActionBar().setTitle("ظَاء");


            harf.setText("ظ");
            insert.setText(R.string.dhaaMakhraj);


            harf.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                }
            });
        } else if (extras.getInt("harf") == 18) {
            getSupportActionBar().setTitle("عَينٍ");


            harf.setText("ع");
            insert.setText(R.string.aynMakhraj);


            harf.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                }
            });
        } else if (extras.getInt("harf") == 19) {
            getSupportActionBar().setTitle("غَين");


            harf.setText("غ");
            insert.setText(R.string.ghaynMakhraj);


            harf.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                }
            });
        } else if (extras.getInt("harf") == 20) {
            getSupportActionBar().setTitle("فَاء");


            harf.setText("ف");
            insert.setText(R.string.faMakhraj);


            harf.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                }
            });
        } else if (extras.getInt("harf") == 21) {

            getSupportActionBar().setTitle("قَاف");

            harf.setText("ق");
            insert.setText(R.string.qafMakhraj);


            harf.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                }
            });
        } else if (extras.getInt("harf") == 22) {

            getSupportActionBar().setTitle("كَاف");

            harf.setText("ك");
            insert.setText(R.string.kafMakhraj);


            harf.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                }
            });
        } else if (extras.getInt("harf") == 23) {

            getSupportActionBar().setTitle("لاَم");


            harf.setText("ل");
            insert.setText(R.string.lamMakhraj);


            harf.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                }
            });
        } else if (extras.getInt("harf") == 24) {
            getSupportActionBar().setTitle("مِيم");


            harf.setText("م");
            insert.setText(R.string.meemMakhraj);


            harf.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                }
            });
        } else if (extras.getInt("harf") == 25) {
            getSupportActionBar().setTitle("نُون");


            harf.setText("ن");
            insert.setText(R.string.noonMakhraj);


            harf.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                }
            });
        } else if (extras.getInt("harf") == 26) {
            getSupportActionBar().setTitle("وَاو");


            harf.setText("و");
            insert.setText(R.string.wowMakhraj);


            harf.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                }
            });
        } else if (extras.getInt("harf") == 27) {
            getSupportActionBar().setTitle("هَاء");


            harf.setText("ه");
            insert.setText(R.string.haaMakhraj);


            harf.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                }
            });
        } else if (extras.getInt("harf") == 28) {
            getSupportActionBar().setTitle("هَمزَة");


            harf.setText("ء");
            insert.setText(R.string.hamzaMakhraj);


            harf.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                }
            });
        } else if (extras.getInt("harf") == 29) {

            getSupportActionBar().setTitle("يَاء");



            harf.setText("ي");
            insert.setText(R.string.yaMakhraj);


            harf.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                }
            });
        }
    }
}


