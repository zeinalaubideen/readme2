package zayne.foundationsfinal;

import android.graphics.Color;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class ShortVDescript extends AppCompatActivity {
   // private ImageView fatt, dham, kas;

    private TextView insert, fatt, dham, kas;
    private Button fatha, dhama, kasrah;
    private String[] position = {"fatha", "Dhama", "kasrah"};

    private int alif1, alif2, alif3, ba1, ba2, ba3, ta1, ta2, ta3, tha1, tha2, tha3,  jeem1, jeem2, jeem3, ha1, ha2, ha3,
            kha1, kha2, kha3, dal1, dal2, dal3, dhal1, dhal2, dhal3, ra1, ra2, ra3, zay1, zay2, zay3, seen1,
            seen2, seen3, sheen1, sheen2, sheen3, saad1, saad2, saad3, daad1, daad2, daad3, taah1, taah2, taah3,
            dhaa1, dhaa2, dhaa3, ayn1, ayn2, ayn3, ghayn1, ghayn2, ghayn3, fa1, fa2, fa3, qaf1, qaf2, qaf3, kaf1, kaf2, kaf3,
            lam1, lam2, lam3, meem1, meem2, meem3, noon1, noon2, noon3, wow1, wow2, wow3, haa1, haa2, haa3, hamza1, hamza2, hamza3,
            ya1, ya2, ya3;

            /* private SoundPool harfs;
   private int[] sounds = {R.raw.alif, R.raw.ba, R.raw.ta, R.raw.tha, R.raw.jeem, R.raw.ha, R.raw.kha, R.raw.dal, R.raw.dhal, R.raw.ra, R.raw.zay,
            R.raw.seen, R.raw.sheen, R.raw.saad, R.raw.daad, R.raw.taah, R.raw.dhaa, R.raw.ayn, R.raw.ghayn, R.raw.fa, R.raw.qaf, R.raw.kaf, R.raw.lam,
            R.raw.meem, R.raw.noon, R.raw.wow, R.raw.haa, R.raw.hamza, R.raw.yaa};*/



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.three_items);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        toolbar.setTitleTextColor(Color.parseColor("#247BA0"));
        toolbar.setTextAlignment(View.TEXT_ALIGNMENT_CENTER);



        //this is to include a back button on the tool bar

        toolbar.setNavigationIcon(R.drawable.back);
        toolbar.getNavigationIcon();
        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });

        Bundle extras = getIntent().getExtras();

        // Give path to the Font location
        //String Path2font = "Damascus.ttc";


        // Load the Font and define typeface accordingly
        //Typeface tf = Typeface.createFromAsset(getAssets(), Path2font);

        fatt = (TextView) findViewById(R.id.one);
        dham = (TextView) findViewById(R.id.two);
        kas = (TextView) findViewById(R.id.three);
        //dont want to use custom fonts anymore but here as a proof of concept
        //fatt.setTypeface(tf);
        //dham.setTypeface(tf);
        //as.setTypeface(tf);



        insert = (TextView) findViewById(R.id.insert);

        fatha = (Button) findViewById(R.id.first);
        dhama = (Button) findViewById(R.id.second);
        kasrah = (Button) findViewById(R.id.third);

        //this is where all the audio files will be offloaded from

        //This is where all the sound files are goiing to be placed
       /* harfs = new SoundPool(1, AudioManager.STREAM_MUSIC, 0);
        alifFat = harfs.load(this, sounds[0], 1);
        alifDham = harfs.load(this, sounds[1], 1);
        alifKas = harfs.load(this, sounds[2], 1);
        baFat = harfs.load(this, sounds[3], 1);
        baDham = harfs.load(this, sounds[4], 1);
        baKas = harfs.load(this, sounds[5], 1);
        taFat = harfs.load(this, sounds[6], 1);
        taDham = harfs.load(this, sounds[7], 1);
        taKas = harfs.load(this, sounds[8], 1);
        thaFat = harfs.load(this, sounds[9], 1);
        theDham = harfs.load(this, sounds[10], 1);
        thaKas = harfs.load(this, sounds[11], 1);
        jaFat = harfs.load(this, sounds[12], 1);
        jaDham = harfs.load(this, sounds[13], 1);
        jaKas = harfs.load(this, sounds[14], 1);
        haFat = harfs.load(this, sounds[15], 1);
        haDham = harfs.load(this, sounds[16], 1);
        haKas = harfs.load(this, sounds[17], 1);
        khaFat = harfs.load(this, sounds[18], 1);
        khaDham = harfs.load(this, sounds[19], 1);
        khaKas = harfs.load(this, sounds[20], 1);
        daFat = harfs.load(this, sounds[21], 1);
        daDham = harfs.load(this, sounds[22], 1);
        daKad = harfs.load(this, sounds[23], 1);
        dhaFat = harfs.load(this, sounds[24], 1);
        dhaDham = harfs.load(this, sounds[25], 1);
        dhakAS = harfs.load(this, sounds[26], 1);
        raFat = harfs.load(this, sounds[27], 1);
        raDham = harfs.load(this, sounds[28], 1);
         raKas = harfs.load(this, sounds[29], 1);
        zaFat = harfs.load(this, sounds[30], 1);
        zaDham = harfs.load(this, sounds[31], 1);
        zaKas = harfs.load(this, sounds[32], 1);
        seenFat = harfs.load(this, sounds[33], 1);
        seenDham = harfs.load(this, sounds[34], 1);
        seenKas = harfs.load(this, sounds[35], 1);
        shaanFat = harfs.load(this, sounds[36], 1);
        sheenDham = harfs.load(this, sounds[37], 1);
        sheenKas = harfs.load(this, sounds[38], 1);
        saadFat = harfs.load(this, sounds[39], 1);
        saadDham = harfs.load(this, sounds[40], 1);
        saadKas = harfs.load(this, sounds[41], 1);
        daadFat = harfs.load(this, sounds[42], 1);
        daadDham = harfs.load(this, sounds[43], 1);
        daadKas = harfs.load(this, sounds[44], 1);
        taaFat = harfs.load(this, sounds[45], 1);
        taaDham = harfs.load(this, sounds[46], 1);
        taaKas = harfs.load(this, sounds[47], 1);
        dhaaFat = harfs.load(this, sounds[48], 1);
        dhaaDham = harfs.load(this, sounds[49], 1);
        dhaaKas = harfs.load(this, sounds[50], 1);
        aynFat = harfs.load(this, sounds[51], 1);
        aynDham = harfs.load(this, sounds[52], 1);
        aynKas = harfs.load(this, sounds[53], 1);
        ghaynFat = harfs.load(this, sounds[54], 1);
        ghaynDham = harfs.load(this, sounds[55], 1);
        ghayKas = harfs.load(this, sounds[56], 1);
        faFat = harfs.load(this, sounds[57], 1);
        faDham = harfs.load(this, sounds[58], 1);
        faKas = harfs.load(this, sounds[59], 1);
        qafFat = harfs.load(this, sounds[60], 1);
        qafDham = harfs.load(this, sounds[61], 1);
       qafKas = harfs.load(this, sounds[62], 1);
        kafFat = harfs.load(this, sounds[63], 1);
        kafDham = harfs.load(this, sounds[64], 1);
        kafKas = harfs.load(this, sounds[65], 1);
        lamFat = harfs.load(this, sounds[66], 1);
        lamDham = harfs.load(this, sounds[67], 1);
        lamKas = harfs.load(this, sounds[68], 1);
        meemFat = harfs.load(this, sounds[69], 1);
        meemDham = harfs.load(this, sounds[70], 1);
        meemKas = harfs.load(this, sounds[71], 1);
        noonFat = harfs.load(this, sounds[72], 1);
        noonDham = harfs.load(this, sounds[73], 1);
        noonKas = harfs.load(this, sounds[74], 1);
        wowFat = harfs.load(this, sounds[75], 1);
        wowDham = harfs.load(this, sounds[76], 1);
        wowKas = harfs.load(this, sounds[77], 1);
        haaFat = harfs.load(this, sounds[78], 1);
        haaDham = harfs.load(this, sounds[79], 1);
        haaKas = harfs.load(this, sounds[80], 1);
        hmazaFat = harfs.load(this, sounds[81], 1);
        hamzaDham = harfs.load(this, sounds[82], 1);
        hamzaKad = harfs.load(this, sounds[83], 1);
        yaFat = harfs.load(this, sounds[84], 1);
        yaDham = harfs.load(this, sounds[85], 1);
        yakAS = harfs.load(this, sounds[86], 1);
        */

        if (extras.getInt("harf") == 1) {

            getSupportActionBar().setTitle("اليف");

            fatt.setText("اَ");
            insert.setText(position[0]);


            fatha.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    fatt.setText("اَ");
                    insert.setText(position[0]);


                    //this will cause the other imageviews to be hidden and keep only one visible
                    fatt.setVisibility(View.VISIBLE);
                    dham.setVisibility(View.GONE);
                    kas.setVisibility(View.GONE);


                }
            });

            dhama.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    dham.setText("اُ");
                    insert.setText(position[1]);


                    //this will cause the other imageviews to be hidden and keep only one visible
                    fatt.setVisibility(View.GONE);
                    dham.setVisibility(View.VISIBLE);
                    kas.setVisibility(View.GONE);


                }
            });
            kasrah.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    kas.setText("اِ");
                    insert.setText(position[2]);


                    //this will cause the other imageviews to be hidden and keep only one visible
                    fatt.setVisibility(View.GONE);
                    dham.setVisibility(View.GONE);
                    kas.setVisibility(View.VISIBLE);


                }
            });


        } else if (extras.getInt("harf") == 2) {

            //BA GOES HERE

            getSupportActionBar().setTitle("بَاء");

            fatt.setText("بَ");
            insert.setText(position[0]);


            fatha.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    fatt.setText("بَ");
                    insert.setText(position[0]);


                    //this will cause the other imageviews to be hidden and keep only one visible
                    fatt.setVisibility(View.VISIBLE);
                    dham.setVisibility(View.GONE);
                    kas.setVisibility(View.GONE);


                }
            });

            dhama.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    dham.setText("بُ");
                    insert.setText(position[1]);


                    //this will cause the other imageviews to be hidden and keep only one visible
                    fatt.setVisibility(View.GONE);
                    dham.setVisibility(View.VISIBLE);
                    kas.setVisibility(View.GONE);


                }
            });
            kasrah.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    kas.setText("بِ");
                    insert.setText(position[2]);


                    //this will cause the other imageviews to be hidden and keep only one visible
                    fatt.setVisibility(View.GONE);
                    dham.setVisibility(View.GONE);
                    kas.setVisibility(View.VISIBLE);


                }
            });
        }
        else if (extras.getInt("harf") == 3) {

            //TA GOES HERE

            getSupportActionBar().setTitle("تَاء");

            fatt.setText("تَ");
            insert.setText(position[0]);


            fatha.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    fatt.setText("تَ");
                    insert.setText(position[0]);


                    //this will cause the other imageviews to be hidden and keep only one visible
                    fatt.setVisibility(View.VISIBLE);
                    dham.setVisibility(View.GONE);
                    kas.setVisibility(View.GONE);


                }
            });

            dhama.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    dham.setText("تُ");
                    insert.setText(position[1]);


                    //this will cause the other imageviews to be hidden and keep only one visible
                    fatt.setVisibility(View.GONE);
                    dham.setVisibility(View.VISIBLE);
                    kas.setVisibility(View.GONE);


                }
            });
            kasrah.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    kas.setText("تِ");
                    insert.setText(position[2]);


                    //this will cause the other imageviews to be hidden and keep only one visible
                    fatt.setVisibility(View.GONE);
                    dham.setVisibility(View.GONE);
                    kas.setVisibility(View.VISIBLE);


                }
            });
        }
        else if (extras.getInt("harf") == 4) {

            //THA GOES HERE

            getSupportActionBar().setTitle("ثَاء");

            fatt.setText("ثَ");
            insert.setText(position[0]);


            fatha.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    fatt.setText("ثَ");
                    insert.setText(position[0]);


                    //this will cause the other imageviews to be hidden and keep only one visible
                    fatt.setVisibility(View.VISIBLE);
                    dham.setVisibility(View.GONE);
                    kas.setVisibility(View.GONE);


                }
            });

            dhama.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    dham.setText("ثُ");
                    insert.setText(position[1]);


                    //this will cause the other imageviews to be hidden and keep only one visible
                    fatt.setVisibility(View.GONE);
                    dham.setVisibility(View.VISIBLE);
                    kas.setVisibility(View.GONE);


                }
            });
            kasrah.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    kas.setText("ثِ");
                    insert.setText(position[2]);


                    //this will cause the other imageviews to be hidden and keep only one visible
                    fatt.setVisibility(View.GONE);
                    dham.setVisibility(View.GONE);
                    kas.setVisibility(View.VISIBLE);


                }
            });
        }
        else if (extras.getInt("harf") == 5) {

            //BA GOES HERE

            getSupportActionBar().setTitle("جِيم");

            fatt.setText("جَ");
            insert.setText(position[0]);


            fatha.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    fatt.setText("جَ");
                    insert.setText(position[0]);


                    //this will cause the other imageviews to be hidden and keep only one visible
                    fatt.setVisibility(View.VISIBLE);
                    dham.setVisibility(View.GONE);
                    kas.setVisibility(View.GONE);


                }
            });

            dhama.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    dham.setText("جُ");
                    insert.setText(position[1]);


                    //this will cause the other imageviews to be hidden and keep only one visible
                    fatt.setVisibility(View.GONE);
                    dham.setVisibility(View.VISIBLE);
                    kas.setVisibility(View.GONE);


                }
            });
            kasrah.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    kas.setText("جِ");
                    insert.setText(position[2]);


                    //this will cause the other imageviews to be hidden and keep only one visible
                    fatt.setVisibility(View.GONE);
                    dham.setVisibility(View.GONE);
                    kas.setVisibility(View.VISIBLE);


                }
            });
        }
        else if (extras.getInt("harf") == 6) {

            //BA GOES HERE

            getSupportActionBar().setTitle("حَاء");

            fatt.setText("حَ");
            insert.setText(position[0]);


            fatha.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    fatt.setText("حَ");
                    insert.setText(position[0]);


                    //this will cause the other imageviews to be hidden and keep only one visible
                    fatt.setVisibility(View.VISIBLE);
                    dham.setVisibility(View.GONE);
                    kas.setVisibility(View.GONE);


                }
            });

            dhama.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    dham.setText("حُ");
                    insert.setText(position[1]);


                    //this will cause the other imageviews to be hidden and keep only one visible
                    fatt.setVisibility(View.GONE);
                    dham.setVisibility(View.VISIBLE);
                    kas.setVisibility(View.GONE);


                }
            });
            kasrah.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    kas.setText("حِ");
                    insert.setText(position[2]);


                    //this will cause the other imageviews to be hidden and keep only one visible
                    fatt.setVisibility(View.GONE);
                    dham.setVisibility(View.GONE);
                    kas.setVisibility(View.VISIBLE);


                }
            });
        }
        else if (extras.getInt("harf") == 7) {

            //BA GOES HERE

            getSupportActionBar().setTitle("خَاء");

            fatt.setText("خَ");
            insert.setText(position[0]);


            fatha.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    fatt.setText("خَ");
                    insert.setText(position[0]);


                    //this will cause the other imageviews to be hidden and keep only one visible
                    fatt.setVisibility(View.VISIBLE);
                    dham.setVisibility(View.GONE);
                    kas.setVisibility(View.GONE);


                }
            });

            dhama.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    dham.setText("خُ");
                    insert.setText(position[1]);


                    //this will cause the other imageviews to be hidden and keep only one visible
                    fatt.setVisibility(View.GONE);
                    dham.setVisibility(View.VISIBLE);
                    kas.setVisibility(View.GONE);


                }
            });
            kasrah.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    kas.setText("خِ ");
                    insert.setText(position[2]);


                    //this will cause the other imageviews to be hidden and keep only one visible
                    fatt.setVisibility(View.GONE);
                    dham.setVisibility(View.GONE);
                    kas.setVisibility(View.VISIBLE);


                }
            });
        }
        else if (extras.getInt("harf") == 8) {

            //BA GOES HERE

            getSupportActionBar().setTitle("دَال");

            fatt.setText("دَ");
            insert.setText(position[0]);


            fatha.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    fatt.setText("دَ");
                    insert.setText(position[0]);


                    //this will cause the other imageviews to be hidden and keep only one visible
                    fatt.setVisibility(View.VISIBLE);
                    dham.setVisibility(View.GONE);
                    kas.setVisibility(View.GONE);


                }
            });

            dhama.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    dham.setText("دُ");
                    insert.setText(position[1]);


                    //this will cause the other imageviews to be hidden and keep only one visible
                    fatt.setVisibility(View.GONE);
                    dham.setVisibility(View.VISIBLE);
                    kas.setVisibility(View.GONE);


                }
            });
            kasrah.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    kas.setText("دِ");
                    insert.setText(position[2]);


                    //this will cause the other imageviews to be hidden and keep only one visible
                    fatt.setVisibility(View.GONE);
                    dham.setVisibility(View.GONE);
                    kas.setVisibility(View.VISIBLE);


                }
            });
        }
        else if (extras.getInt("harf") == 9) {

            //BA GOES HERE

            getSupportActionBar().setTitle("ذَال");

            fatt.setText("ذَ");
            insert.setText(position[0]);


            fatha.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    fatt.setText("ذَ");
                    insert.setText(position[0]);


                    //this will cause the other imageviews to be hidden and keep only one visible
                    fatt.setVisibility(View.VISIBLE);
                    dham.setVisibility(View.GONE);
                    kas.setVisibility(View.GONE);


                }
            });

            dhama.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    dham.setText("ذُ");
                    insert.setText(position[1]);


                    //this will cause the other imageviews to be hidden and keep only one visible
                    fatt.setVisibility(View.GONE);
                    dham.setVisibility(View.VISIBLE);
                    kas.setVisibility(View.GONE);


                }
            });
            kasrah.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    kas.setText("ذِ");
                    insert.setText(position[2]);


                    //this will cause the other imageviews to be hidden and keep only one visible
                    fatt.setVisibility(View.GONE);
                    dham.setVisibility(View.GONE);
                    kas.setVisibility(View.VISIBLE);


                }
            });
        }
        else if (extras.getInt("harf") == 10) {

            //TA GOES HERE

            getSupportActionBar().setTitle("رَاء");

            fatt.setText("رَ");
            insert.setText(position[0]);


            fatha.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    fatt.setText("رَ");
                    insert.setText(position[0]);


                    //this will cause the other imageviews to be hidden and keep only one visible
                    fatt.setVisibility(View.VISIBLE);
                    dham.setVisibility(View.GONE);
                    kas.setVisibility(View.GONE);


                }
            });

            dhama.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    dham.setText("رُ");
                    insert.setText(position[1]);


                    //this will cause the other imageviews to be hidden and keep only one visible
                    fatt.setVisibility(View.GONE);
                    dham.setVisibility(View.VISIBLE);
                    kas.setVisibility(View.GONE);


                }
            });
            kasrah.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    kas.setText("رِ");
                    insert.setText(position[2]);


                    //this will cause the other imageviews to be hidden and keep only one visible
                    fatt.setVisibility(View.GONE);
                    dham.setVisibility(View.GONE);
                    kas.setVisibility(View.VISIBLE);


                }
            });
        }
        else if (extras.getInt("harf") == 11) {

            //THA GOES HERE

            getSupportActionBar().setTitle("زَاي");

            fatt.setText("زَ");
            insert.setText(position[0]);


            fatha.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    fatt.setText("زَ");
                    insert.setText(position[0]);


                    //this will cause the other imageviews to be hidden and keep only one visible
                    fatt.setVisibility(View.VISIBLE);
                    dham.setVisibility(View.GONE);
                    kas.setVisibility(View.GONE);


                }
            });

            dhama.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    dham.setText("زُ");
                    insert.setText(position[1]);


                    //this will cause the other imageviews to be hidden and keep only one visible
                    fatt.setVisibility(View.GONE);
                    dham.setVisibility(View.VISIBLE);
                    kas.setVisibility(View.GONE);


                }
            });
            kasrah.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    kas.setText("زِ");
                    insert.setText(position[2]);


                    //this will cause the other imageviews to be hidden and keep only one visible
                    fatt.setVisibility(View.GONE);
                    dham.setVisibility(View.GONE);
                    kas.setVisibility(View.VISIBLE);


                }
            });
        }
        else if (extras.getInt("harf") == 12) {

            //BA GOES HERE

            getSupportActionBar().setTitle("سِين");

            fatt.setText("سَ");
            insert.setText(position[0]);


            fatha.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    fatt.setText("سَ");
                    insert.setText(position[0]);


                    //this will cause the other imageviews to be hidden and keep only one visible
                    fatt.setVisibility(View.VISIBLE);
                    dham.setVisibility(View.GONE);
                    kas.setVisibility(View.GONE);


                }
            });

            dhama.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    dham.setText("سُ");
                    insert.setText(position[1]);


                    //this will cause the other imageviews to be hidden and keep only one visible
                    fatt.setVisibility(View.GONE);
                    dham.setVisibility(View.VISIBLE);
                    kas.setVisibility(View.GONE);


                }
            });
            kasrah.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    kas.setText("سِ");
                    insert.setText(position[2]);


                    //this will cause the other imageviews to be hidden and keep only one visible
                    fatt.setVisibility(View.GONE);
                    dham.setVisibility(View.GONE);
                    kas.setVisibility(View.VISIBLE);


                }
            });
        }
        else if (extras.getInt("harf") == 13) {

            //BA GOES HERE

            getSupportActionBar().setTitle("شحين");

            fatt.setText("شَ");
            insert.setText(position[0]);


            fatha.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    fatt.setText("شَ");
                    insert.setText(position[0]);


                    //this will cause the other imageviews to be hidden and keep only one visible
                    fatt.setVisibility(View.VISIBLE);
                    dham.setVisibility(View.GONE);
                    kas.setVisibility(View.GONE);


                }
            });

            dhama.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    dham.setText("شُ");
                    insert.setText(position[1]);


                    //this will cause the other imageviews to be hidden and keep only one visible
                    fatt.setVisibility(View.GONE);
                    dham.setVisibility(View.VISIBLE);
                    kas.setVisibility(View.GONE);


                }
            });
            kasrah.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    kas.setText("شِ");
                    insert.setText(position[2]);


                    //this will cause the other imageviews to be hidden and keep only one visible
                    fatt.setVisibility(View.GONE);
                    dham.setVisibility(View.GONE);
                    kas.setVisibility(View.VISIBLE);


                }
            });
        }
        else if (extras.getInt("harf") == 14) {

            //BA GOES HERE

            getSupportActionBar().setTitle("صَاد");

            fatt.setText("صَ");
            insert.setText(position[0]);


            fatha.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    fatt.setText("صَ");
                    insert.setText(position[0]);


                    //this will cause the other imageviews to be hidden and keep only one visible
                    fatt.setVisibility(View.VISIBLE);
                    dham.setVisibility(View.GONE);
                    kas.setVisibility(View.GONE);


                }
            });

            dhama.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    dham.setText("صُ");
                    insert.setText(position[1]);


                    //this will cause the other imageviews to be hidden and keep only one visible
                    fatt.setVisibility(View.GONE);
                    dham.setVisibility(View.VISIBLE);
                    kas.setVisibility(View.GONE);


                }
            });
            kasrah.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    kas.setText("صِ");
                    insert.setText(position[2]);


                    //this will cause the other imageviews to be hidden and keep only one visible
                    fatt.setVisibility(View.GONE);
                    dham.setVisibility(View.GONE);
                    kas.setVisibility(View.VISIBLE);


                }
            });
        }
        else if (extras.getInt("harf") == 15) {

            //BA GOES HERE

            getSupportActionBar().setTitle("صَاد");

            fatt.setText("ضَ ");
            insert.setText(position[0]);


            fatha.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    fatt.setText("ضَ");
                    insert.setText(position[0]);


                    //this will cause the other imageviews to be hidden and keep only one visible
                    fatt.setVisibility(View.VISIBLE);
                    dham.setVisibility(View.GONE);
                    kas.setVisibility(View.GONE);


                }
            });

            dhama.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    dham.setText("ضُ");
                    insert.setText(position[1]);


                    //this will cause the other imageviews to be hidden and keep only one visible
                    fatt.setVisibility(View.GONE);
                    dham.setVisibility(View.VISIBLE);
                    kas.setVisibility(View.GONE);


                }
            });
            kasrah.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    kas.setText("ضِ");
                    insert.setText(position[2]);


                    //this will cause the other imageviews to be hidden and keep only one visible
                    fatt.setVisibility(View.GONE);
                    dham.setVisibility(View.GONE);
                    kas.setVisibility(View.VISIBLE);


                }
            });
        }
        else if (extras.getInt("harf") == 16) {

            //BA GOES HERE

            getSupportActionBar().setTitle("طَاء");

            fatt.setText("طَ");
            insert.setText(position[0]);


            fatha.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    fatt.setText("طَ");
                    insert.setText(position[0]);


                    //this will cause the other imageviews to be hidden and keep only one visible
                    fatt.setVisibility(View.VISIBLE);
                    dham.setVisibility(View.GONE);
                    kas.setVisibility(View.GONE);


                }
            });

            dhama.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    dham.setText("طُ");
                    insert.setText(position[1]);


                    //this will cause the other imageviews to be hidden and keep only one visible
                    fatt.setVisibility(View.GONE);
                    dham.setVisibility(View.VISIBLE);
                    kas.setVisibility(View.GONE);


                }
            });
            kasrah.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    kas.setText("طِ");
                    insert.setText(position[2]);


                    //this will cause the other imageviews to be hidden and keep only one visible
                    fatt.setVisibility(View.GONE);
                    dham.setVisibility(View.GONE);
                    kas.setVisibility(View.VISIBLE);


                }
            });
        }
        else if (extras.getInt("harf") == 17) {

            //TA GOES HERE

            getSupportActionBar().setTitle("ظَاء");

            fatt.setText("ظَ");
            insert.setText(position[0]);


            fatha.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    fatt.setText("ظَ");
                    insert.setText(position[0]);


                    //this will cause the other imageviews to be hidden and keep only one visible
                    fatt.setVisibility(View.VISIBLE);
                    dham.setVisibility(View.GONE);
                    kas.setVisibility(View.GONE);


                }
            });

            dhama.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    dham.setText("ظُ");
                    insert.setText(position[1]);


                    //this will cause the other imageviews to be hidden and keep only one visible
                    fatt.setVisibility(View.GONE);
                    dham.setVisibility(View.VISIBLE);
                    kas.setVisibility(View.GONE);


                }
            });
            kasrah.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    kas.setText("ظِ");
                    insert.setText(position[2]);


                    //this will cause the other imageviews to be hidden and keep only one visible
                    fatt.setVisibility(View.GONE);
                    dham.setVisibility(View.GONE);
                    kas.setVisibility(View.VISIBLE);


                }
            });
        }
        else if (extras.getInt("harf") == 18) {

            //THA GOES HERE

            getSupportActionBar().setTitle("عَينٍ");

            fatt.setText("عَ");
            insert.setText(position[0]);


            fatha.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    fatt.setText("عَ");
                    insert.setText(position[0]);


                    //this will cause the other imageviews to be hidden and keep only one visible
                    fatt.setVisibility(View.VISIBLE);
                    dham.setVisibility(View.GONE);
                    kas.setVisibility(View.GONE);


                }
            });

            dhama.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    dham.setText("عُ");
                    insert.setText(position[1]);


                    //this will cause the other imageviews to be hidden and keep only one visible
                    fatt.setVisibility(View.GONE);
                    dham.setVisibility(View.VISIBLE);
                    kas.setVisibility(View.GONE);


                }
            });
            kasrah.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    kas.setText("عِ");
                    insert.setText(position[2]);


                    //this will cause the other imageviews to be hidden and keep only one visible
                    fatt.setVisibility(View.GONE);
                    dham.setVisibility(View.GONE);
                    kas.setVisibility(View.VISIBLE);


                }
            });
        }
        else if (extras.getInt("harf") == 19) {

            //BA GOES HERE

            getSupportActionBar().setTitle("غَين");

            fatt.setText("غَ");
            insert.setText(position[0]);


            fatha.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    fatt.setText("غَ");
                    insert.setText(position[0]);


                    //this will cause the other imageviews to be hidden and keep only one visible
                    fatt.setVisibility(View.VISIBLE);
                    dham.setVisibility(View.GONE);
                    kas.setVisibility(View.GONE);


                }
            });

            dhama.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    dham.setText("غُ");
                    insert.setText(position[1]);


                    //this will cause the other imageviews to be hidden and keep only one visible
                    fatt.setVisibility(View.GONE);
                    dham.setVisibility(View.VISIBLE);
                    kas.setVisibility(View.GONE);


                }
            });
            kasrah.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    kas.setText("غِ ");
                    insert.setText(position[2]);


                    //this will cause the other imageviews to be hidden and keep only one visible
                    fatt.setVisibility(View.GONE);
                    dham.setVisibility(View.GONE);
                    kas.setVisibility(View.VISIBLE);


                }
            });
        }
        else if (extras.getInt("harf") == 20) {

            //BA GOES HERE

            getSupportActionBar().setTitle("فَاء");

            fatt.setText("فَ");
            insert.setText(position[0]);


            fatha.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    fatt.setText("فَ");
                    insert.setText(position[0]);


                    //this will cause the other imageviews to be hidden and keep only one visible
                    fatt.setVisibility(View.VISIBLE);
                    dham.setVisibility(View.GONE);
                    kas.setVisibility(View.GONE);


                }
            });

            dhama.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    dham.setText("فُ");
                    insert.setText(position[1]);


                    //this will cause the other imageviews to be hidden and keep only one visible
                    fatt.setVisibility(View.GONE);
                    dham.setVisibility(View.VISIBLE);
                    kas.setVisibility(View.GONE);


                }
            });
            kasrah.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    kas.setText("فِ");
                    insert.setText(position[2]);


                    //this will cause the other imageviews to be hidden and keep only one visible
                    fatt.setVisibility(View.GONE);
                    dham.setVisibility(View.GONE);
                    kas.setVisibility(View.VISIBLE);


                }
            });
        }
        else if (extras.getInt("harf") == 21) {

            //BA GOES HERE

            getSupportActionBar().setTitle("قَاف");

            fatt.setText("قَ");
            insert.setText(position[0]);


            fatha.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    fatt.setText("قَ");
                    insert.setText(position[0]);


                    //this will cause the other imageviews to be hidden and keep only one visible
                    fatt.setVisibility(View.VISIBLE);
                    dham.setVisibility(View.GONE);
                    kas.setVisibility(View.GONE);


                }
            });

            dhama.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    dham.setText("قُ");
                    insert.setText(position[1]);


                    //this will cause the other imageviews to be hidden and keep only one visible
                    fatt.setVisibility(View.GONE);
                    dham.setVisibility(View.VISIBLE);
                    kas.setVisibility(View.GONE);


                }
            });
            kasrah.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    kas.setText("قِ");
                    insert.setText(position[2]);


                    //this will cause the other imageviews to be hidden and keep only one visible
                    fatt.setVisibility(View.GONE);
                    dham.setVisibility(View.GONE);
                    kas.setVisibility(View.VISIBLE);


                }
            });
        }
        else if (extras.getInt("harf") == 22) {

            //BA GOES HERE

            getSupportActionBar().setTitle("كَاف");

            fatt.setText("كَ");
            insert.setText(position[0]);


            fatha.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    fatt.setText("كَ");
                    insert.setText(position[0]);


                    //this will cause the other imageviews to be hidden and keep only one visible
                    fatt.setVisibility(View.VISIBLE);
                    dham.setVisibility(View.GONE);
                    kas.setVisibility(View.GONE);


                }
            });

            dhama.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    dham.setText("كُ");
                    insert.setText(position[1]);


                    //this will cause the other imageviews to be hidden and keep only one visible
                    fatt.setVisibility(View.GONE);
                    dham.setVisibility(View.VISIBLE);
                    kas.setVisibility(View.GONE);


                }
            });
            kasrah.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    kas.setText("كِ");
                    insert.setText(position[2]);


                    //this will cause the other imageviews to be hidden and keep only one visible
                    fatt.setVisibility(View.GONE);
                    dham.setVisibility(View.GONE);
                    kas.setVisibility(View.VISIBLE);


                }
            });
        }
        else if (extras.getInt("harf") == 23) {

            //BA GOES HERE

            getSupportActionBar().setTitle("لاَم");

            fatt.setText("لَ");
            insert.setText(position[0]);


            fatha.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    fatt.setText("لَ");
                    insert.setText(position[0]);


                    //this will cause the other imageviews to be hidden and keep only one visible
                    fatt.setVisibility(View.VISIBLE);
                    dham.setVisibility(View.GONE);
                    kas.setVisibility(View.GONE);


                }
            });

            dhama.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    dham.setText("لُ");
                    insert.setText(position[1]);


                    //this will cause the other imageviews to be hidden and keep only one visible
                    fatt.setVisibility(View.GONE);
                    dham.setVisibility(View.VISIBLE);
                    kas.setVisibility(View.GONE);


                }
            });
            kasrah.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    kas.setText("لِ");
                    insert.setText(position[2]);


                    //this will cause the other imageviews to be hidden and keep only one visible
                    fatt.setVisibility(View.GONE);
                    dham.setVisibility(View.GONE);
                    kas.setVisibility(View.VISIBLE);


                }
            });
        }
        else if (extras.getInt("harf") == 24) {



            getSupportActionBar().setTitle("مِيم");

            fatt.setText("مَ");
            insert.setText(position[0]);


            fatha.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    fatt.setText("مَ");
                    insert.setText(position[0]);


                    //this will cause the other imageviews to be hidden and keep only one visible
                    fatt.setVisibility(View.VISIBLE);
                    dham.setVisibility(View.GONE);
                    kas.setVisibility(View.GONE);


                }
            });

            dhama.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    dham.setText("مُ");
                    insert.setText(position[1]);


                    //this will cause the other imageviews to be hidden and keep only one visible
                    fatt.setVisibility(View.GONE);
                    dham.setVisibility(View.VISIBLE);
                    kas.setVisibility(View.GONE);


                }
            });
            kasrah.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    kas.setText("مِ");
                    insert.setText(position[2]);


                    //this will cause the other imageviews to be hidden and keep only one visible
                    fatt.setVisibility(View.GONE);
                    dham.setVisibility(View.GONE);
                    kas.setVisibility(View.VISIBLE);


                }
            });
        }
        else if (extras.getInt("harf") == 25) {

            //THA GOES HERE

            getSupportActionBar().setTitle("نُون");

            fatt.setText("نَ");
            insert.setText(position[0]);


            fatha.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    fatt.setText("نَ");
                    insert.setText(position[0]);


                    //this will cause the other imageviews to be hidden and keep only one visible
                    fatt.setVisibility(View.VISIBLE);
                    dham.setVisibility(View.GONE);
                    kas.setVisibility(View.GONE);


                }
            });

            dhama.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    dham.setText("نُ");
                    insert.setText(position[1]);


                    //this will cause the other imageviews to be hidden and keep only one visible
                    fatt.setVisibility(View.GONE);
                    dham.setVisibility(View.VISIBLE);
                    kas.setVisibility(View.GONE);


                }
            });
            kasrah.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    kas.setText("نِ");
                    insert.setText(position[2]);


                    //this will cause the other imageviews to be hidden and keep only one visible
                    fatt.setVisibility(View.GONE);
                    dham.setVisibility(View.GONE);
                    kas.setVisibility(View.VISIBLE);


                }
            });
        }
        else if (extras.getInt("harf") == 26) {

            //BA GOES HERE

            getSupportActionBar().setTitle("وَاو");

            fatt.setText("وَ");
            insert.setText(position[0]);


            fatha.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    fatt.setText("وَ");
                    insert.setText(position[0]);


                    //this will cause the other imageviews to be hidden and keep only one visible
                    fatt.setVisibility(View.VISIBLE);
                    dham.setVisibility(View.GONE);
                    kas.setVisibility(View.GONE);


                }
            });

            dhama.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    dham.setText("وُ");
                    insert.setText(position[1]);


                    //this will cause the other imageviews to be hidden and keep only one visible
                    fatt.setVisibility(View.GONE);
                    dham.setVisibility(View.VISIBLE);
                    kas.setVisibility(View.GONE);


                }
            });
            kasrah.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    kas.setText("وِ");
                    insert.setText(position[2]);


                    //this will cause the other imageviews to be hidden and keep only one visible
                    fatt.setVisibility(View.GONE);
                    dham.setVisibility(View.GONE);
                    kas.setVisibility(View.VISIBLE);


                }
            });
        }
        else if (extras.getInt("harf") == 27) {

            //BA GOES HERE

            getSupportActionBar().setTitle("هَاء");

            fatt.setText("هـَ ");
            insert.setText(position[0]);


            fatha.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    fatt.setText("هـَ ");
                    insert.setText(position[0]);


                    //this will cause the other imageviews to be hidden and keep only one visible
                    fatt.setVisibility(View.VISIBLE);
                    dham.setVisibility(View.GONE);
                    kas.setVisibility(View.GONE);


                }
            });

            dhama.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    dham.setText("هُـ");
                    insert.setText(position[1]);


                    //this will cause the other imageviews to be hidden and keep only one visible
                    fatt.setVisibility(View.GONE);
                    dham.setVisibility(View.VISIBLE);
                    kas.setVisibility(View.GONE);


                }
            });
            kasrah.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    kas.setText("هـِ");
                    insert.setText(position[2]);


                    //this will cause the other imageviews to be hidden and keep only one visible
                    fatt.setVisibility(View.GONE);
                    dham.setVisibility(View.GONE);
                    kas.setVisibility(View.VISIBLE);


                }
            });
        }
        else if (extras.getInt("harf") == 28) {

            //BA GOES HERE

            getSupportActionBar().setTitle("هَمزَة");

            fatt.setText("ءَ");
            insert.setText(position[0]);


            fatha.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    fatt.setText("ءَ");
                    insert.setText(position[0]);


                    //this will cause the other imageviews to be hidden and keep only one visible
                    fatt.setVisibility(View.VISIBLE);
                    dham.setVisibility(View.GONE);
                    kas.setVisibility(View.GONE);


                }
            });

            dhama.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    dham.setText("ءُ");
                    insert.setText(position[1]);


                    //this will cause the other imageviews to be hidden and keep only one visible
                    fatt.setVisibility(View.GONE);
                    dham.setVisibility(View.VISIBLE);
                    kas.setVisibility(View.GONE);


                }
            });
            kasrah.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    kas.setText("ءِ");
                    insert.setText(position[2]);


                    //this will cause the other imageviews to be hidden and keep only one visible
                    fatt.setVisibility(View.GONE);
                    dham.setVisibility(View.GONE);
                    kas.setVisibility(View.VISIBLE);


                }
            });
        }
        else if (extras.getInt("harf") == 29) {

            //BA GOES HERE

            getSupportActionBar().setTitle("يَاء");

            fatt.setText("يَ");
            insert.setText(position[0]);


            fatha.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    fatt.setText("يَ");
                    insert.setText(position[0]);


                    //this will cause the other imageviews to be hidden and keep only one visible
                    fatt.setVisibility(View.VISIBLE);
                    dham.setVisibility(View.GONE);
                    kas.setVisibility(View.GONE);


                }
            });

            dhama.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    dham.setText("يُ");
                    insert.setText(position[1]);


                    //this will cause the other imageviews to be hidden and keep only one visible
                    fatt.setVisibility(View.GONE);
                    dham.setVisibility(View.VISIBLE);
                    kas.setVisibility(View.GONE);


                }
            });
            kasrah.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    kas.setText("يِ");
                    insert.setText(position[2]);


                    //this will cause the other imageviews to be hidden and keep only one visible
                    fatt.setVisibility(View.GONE);
                    dham.setVisibility(View.GONE);
                    kas.setVisibility(View.VISIBLE);


                }
            });
        }
    }
}

