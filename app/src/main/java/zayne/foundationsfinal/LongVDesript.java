package zayne.foundationsfinal;

import android.graphics.Typeface;
import android.media.AudioManager;
import android.media.SoundPool;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class LongVDesript extends AppCompatActivity {

    int alif1, alif2, alif3, ba1, ba2, ba3, ta1, ta2, ta3, tha1, tha2, tha3,  jeem1, jeem2, jeem3, ha1, ha2, ha3,
            kha1, kha2, kha3, dal1, dal2, dal3, dhal1, dhal2, dhal3, ra1, ra2, ra3, zay1, zay2, zay3, seen1,
            seen2, seen3, sheen1, sheen2, sheen3, saad1, saad2, saad3, daad1, daad2, daad3, taah1, taah2, taah3,
            dhaa1, dhaa2, dhaa3, ayn1, ayn2, ayn3, ghayn1, ghayn2, ghayn3, fa1, fa2, fa3, qaf1, qaf2, qaf3, kaf1, kaf2, kaf3,
            lam1, lam2, lam3, meem1, meem2, meem3, noon1, noon2, noon3, wow1, wow2, wow3, haa1, haa2, haa3, hamza1, hamza2, hamza3,
            ya1, ya2, ya3;


    private TextView insert, fatt, dham, kas;
    private Button fatha, dhama, kasrah;
    private String[] position = {"fatha", "Dhama", "kasrah"};

    SoundPool harfs;
    int[] sounds = {R.raw.alif, R.raw.wait}; /*, R.raw.ta, R.raw.tha, R.raw.jeem, R.raw.ha, R.raw.kha, R.raw.dal, R.raw.dhal, R.raw.ra, R.raw.zay,
            R.raw.seen, R.raw.sheen, R.raw.saad, R.raw.daad, R.raw.taah, R.raw.dhaa, R.raw.ayn, R.raw.ghayn, R.raw.fa, R.raw.qaf, R.raw.kaf, R.raw.lam,
            R.raw.meem, R.raw.noon, R.raw.wow, R.raw.haa, R.raw.hamza, R.raw.yaa};*/


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.three_items);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        //this is to include a back button on the tool bar

        toolbar.setNavigationIcon(R.drawable.back);
        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });

        Bundle extras = getIntent().getExtras();

        // Give path to the Font location



        // Load the Font and define typeface accordingly


        fatt = (TextView) findViewById(R.id.one);
        dham = (TextView) findViewById(R.id.two);
        kas = (TextView) findViewById(R.id.three);



        insert = (TextView) findViewById(R.id.insert);

        fatha = (Button) findViewById(R.id.first);
        dhama = (Button) findViewById(R.id.second);
        kasrah = (Button) findViewById(R.id.third);

        //this is where all the audio files will be offloaded from

        //This is where all the sound files are goiing to be placed
       harfs = new SoundPool(1, AudioManager.STREAM_MUSIC, 0);
       alif1 = harfs.load(this, sounds[0], 1);
        alif2 = harfs.load(this, sounds[1], 1);
       /* alif3 = harfs.load(this, sounds[2], 1);
        ba1 = harfs.load(this, sounds[3], 1);
        ba2 = harfs.load(this, sounds[4], 1);
        ba3 = harfs.load(this, sounds[5], 1);
        ta1 = harfs.load(this, sounds[6], 1);
        ta2 = harfs.load(this, sounds[7], 1);
        ta3 = harfs.load(this, sounds[8], 1);
        tha1 = harfs.load(this, sounds[9], 1);
        the2 = harfs.load(this, sounds[10], 1);
        tha3 = harfs.load(this, sounds[11], 1);
        ja1 = harfs.load(this, sounds[12], 1);
        ja2 = harfs.load(this, sounds[13], 1);
        ja3 = harfs.load(this, sounds[14], 1);
        ha1 = harfs.load(this, sounds[15], 1);
        ha2 = harfs.load(this, sounds[16], 1);
        ha3 = harfs.load(this, sounds[17], 1);
        kha1 = harfs.load(this, sounds[18], 1);
        kha2 = harfs.load(this, sounds[19], 1);
        kha3 = harfs.load(this, sounds[20], 1);
        dal1 = harfs.load(this, sounds[21], 1);
        dal2 = harfs.load(this, sounds[22], 1);
        dal3 = harfs.load(this, sounds[23], 1);
        dhal1 = harfs.load(this, sounds[24], 1);
        dhal2 = harfs.load(this, sounds[25], 1);
        dhal3 = harfs.load(this, sounds[26], 1);
        ra1 = harfs.load(this, sounds[27], 1);
        ra2 = harfs.load(this, sounds[28], 1);
         ra3 = harfs.load(this, sounds[29], 1);
        zay1 = harfs.load(this, sounds[30], 1);
        zay2 = harfs.load(this, sounds[31], 1);
        zay3 = harfs.load(this, sounds[32], 1);
        seen1 = harfs.load(this, sounds[33], 1);
        seen2 = harfs.load(this, sounds[34], 1);
        seen3 = harfs.load(this, sounds[35], 1);
        shaan1 = harfs.load(this, sounds[36], 1);
        sheen2 = harfs.load(this, sounds[37], 1);
        sheen3 = harfs.load(this, sounds[38], 1);
        saad1 = harfs.load(this, sounds[39], 1);
        saad2 = harfs.load(this, sounds[40], 1);
        saad3 = harfs.load(this, sounds[41], 1);
        daad1 = harfs.load(this, sounds[42], 1);
        daad2 = harfs.load(this, sounds[43], 1);
        daad3 = harfs.load(this, sounds[44], 1);
        taa1 = harfs.load(this, sounds[45], 1);
        taa2 = harfs.load(this, sounds[46], 1);
        taa3 = harfs.load(this, sounds[47], 1);
        dhaa1 = harfs.load(this, sounds[48], 1);
        dhaa2 = harfs.load(this, sounds[49], 1);
        dhaa3 = harfs.load(this, sounds[50], 1);
        ayn1 = harfs.load(this, sounds[51], 1);
        ayn2 = harfs.load(this, sounds[52], 1);
        ayn3 = harfs.load(this, sounds[53], 1);
        ghayn1 = harfs.load(this, sounds[54], 1);
        ghayn2 = harfs.load(this, sounds[55], 1);
        ghay3 = harfs.load(this, sounds[56], 1);
        fa1 = harfs.load(this, sounds[57], 1);
        fa2 = harfs.load(this, sounds[58], 1);
        fa3 = harfs.load(this, sounds[59], 1);
        qaf1 = harfs.load(this, sounds[60], 1);
        qaf2 = harfs.load(this, sounds[61], 1);
       qaf3 = harfs.load(this, sounds[62], 1);
        kaf1 = harfs.load(this, sounds[63], 1);
        kaf2 = harfs.load(this, sounds[64], 1);
        kaf3 = harfs.load(this, sounds[65], 1);
        lam1 = harfs.load(this, sounds[66], 1);
        lam2 = harfs.load(this, sounds[67], 1);
        lam3 = harfs.load(this, sounds[68], 1);
        meem1 = harfs.load(this, sounds[69], 1);
        meem2 = harfs.load(this, sounds[70], 1);
        meem3 = harfs.load(this, sounds[71], 1);
        noon1 = harfs.load(this, sounds[72], 1);
        noon2 = harfs.load(this, sounds[73], 1);
        noon3 = harfs.load(this, sounds[74], 1);
        wow1 = harfs.load(this, sounds[75], 1);
        wow2 = harfs.load(this, sounds[76], 1);
        wow3 = harfs.load(this, sounds[77], 1);
        haa1 = harfs.load(this, sounds[78], 1);
        haa2 = harfs.load(this, sounds[79], 1);
        haa3 = harfs.load(this, sounds[80], 1);
        hmaza1 = harfs.load(this, sounds[81], 1);
        hamza2 = harfs.load(this, sounds[82], 1);
        hamza3 = harfs.load(this, sounds[83], 1);
        ya1 = harfs.load(this, sounds[84], 1);
        ya2 = harfs.load(this, sounds[85], 1);
        ya3 = harfs.load(this, sounds[86], 1);
        */


        if (extras.getInt("harf") == 1) {

            getSupportActionBar().setTitle("اليف");

            fatt.setText("اٰ");
            insert.setText(position[0]);


            // all the audio will be loaded from here
            fatt.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    harfs.play(alif1, 1, 1, 1, 1, 1);
                }
            });

            dham.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    harfs.play(ba1, 1, 1, 1, 1, 1);
                }
            });

            kas.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    harfs.play(ba1, 1, 1, 1, 1, 1);
                }
            });


            fatha.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    fatt.setText("اٰ");
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

                    dham.setText("اُوْا");
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

                    kas.setText("اِيْ");
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


            fatt.setText("بَا");
            insert.setText(position[0]);

            // all the audio will be loaded from here
            fatt.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    harfs.play(alif1, 1, 1, 1, 1, 1);
                }
            });

            dham.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    harfs.play(ba1, 1, 1, 1, 1, 1);
                }
            });

            kas.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    harfs.play(ba1, 1, 1, 1, 1, 1);
                }
            });


            fatha.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    fatt.setText("بَا");
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

                    dham.setText(" بُوْا");
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

                    kas.setText("بِيْ");
                    insert.setText(position[2]);


                    //this will cause the other imageviews to be hidden and keep only one visible
                    fatt.setVisibility(View.GONE);
                    dham.setVisibility(View.GONE);
                    kas.setVisibility(View.VISIBLE);


                }
            });
        } else if (extras.getInt("harf") == 3) {

            //TA GOES HERE

            getSupportActionBar().setTitle("تَاء");

            fatt.setText("تَا");
            insert.setText(position[0]);

            // all the audio will be loaded from here
            fatt.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    harfs.play(alif1, 1, 1, 1, 1, 1);
                }
            });

            dham.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    harfs.play(ba1, 1, 1, 1, 1, 1);
                }
            });

            kas.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    harfs.play(ba1, 1, 1, 1, 1, 1);
                }
            });

            fatha.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    fatt.setText("تَا");
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

                    dham.setText("تُوْا");
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

                    kas.setText("تِيْ");
                    insert.setText(position[2]);


                    //this will cause the other imageviews to be hidden and keep only one visible
                    fatt.setVisibility(View.GONE);
                    dham.setVisibility(View.GONE);
                    kas.setVisibility(View.VISIBLE);


                }
            });
        } else if (extras.getInt("harf") == 4) {

            //THA GOES HERE

            getSupportActionBar().setTitle("ثَاء");

            fatt.setText("ثَا");
            insert.setText(position[0]);

            // all the audio will be loaded from here
            fatt.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    harfs.play(alif1, 1, 1, 1, 1, 1);
                }
            });

            dham.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    harfs.play(ba1, 1, 1, 1, 1, 1);
                }
            });

            kas.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    harfs.play(ba1, 1, 1, 1, 1, 1);
                }
            });




            fatha.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    fatt.setText("ثَا");
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

                    dham.setText("ثُوْا");
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

                    kas.setText("ثِيْ");
                    insert.setText(position[2]);


                    //this will cause the other imageviews to be hidden and keep only one visible
                    fatt.setVisibility(View.GONE);
                    dham.setVisibility(View.GONE);
                    kas.setVisibility(View.VISIBLE);


                }
            });
        } else if (extras.getInt("harf") == 5) {

            //BA GOES HERE

            getSupportActionBar().setTitle("جِيم");

            fatt.setText("جَا");
            insert.setText(position[0]);

            // all the audio will be loaded from here
            fatt.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    harfs.play(alif1, 1, 1, 1, 1, 1);
                }
            });

            dham.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    harfs.play(ba1, 1, 1, 1, 1, 1);
                }
            });

            kas.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    harfs.play(ba1, 1, 1, 1, 1, 1);
                }
            });




            fatha.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    fatt.setText("جَا");
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

                    dham.setText("جُوْا ");
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

                    kas.setText("جِيْ");
                    insert.setText(position[2]);


                    //this will cause the other imageviews to be hidden and keep only one visible
                    fatt.setVisibility(View.GONE);
                    dham.setVisibility(View.GONE);
                    kas.setVisibility(View.VISIBLE);


                }
            });
        } else if (extras.getInt("harf") == 6) {

            //BA GOES HERE

            getSupportActionBar().setTitle("حَاء");

            fatt.setText("حَا");
            insert.setText(position[0]);

            // all the audio will be loaded from here
            fatt.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    harfs.play(alif1, 1, 1, 1, 1, 1);
                }
            });

            dham.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    harfs.play(ba1, 1, 1, 1, 1, 1);
                }
            });

            kas.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    harfs.play(ba1, 1, 1, 1, 1, 1);
                }
            });



            fatha.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    fatt.setText("حَا");
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

                    dham.setText("حُوْا");
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

                    kas.setText("حِيْ");
                    insert.setText(position[2]);


                    //this will cause the other imageviews to be hidden and keep only one visible
                    fatt.setVisibility(View.GONE);
                    dham.setVisibility(View.GONE);
                    kas.setVisibility(View.VISIBLE);


                }
            });
        } else if (extras.getInt("harf") == 7) {

            //BA GOES HERE

            getSupportActionBar().setTitle("خَاء");

            fatt.setText("خَا");
            insert.setText(position[0]);

            // all the audio will be loaded from here
            fatt.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    harfs.play(alif1, 1, 1, 1, 1, 1);
                }
            });

            dham.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    harfs.play(ba1, 1, 1, 1, 1, 1);
                }
            });

            kas.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    harfs.play(ba1, 1, 1, 1, 1, 1);
                }
            });




            fatha.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    fatt.setText("خَا");
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

                    dham.setText("خُوْا");
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

                    kas.setText("خِيْ ");
                    insert.setText(position[2]);


                    //this will cause the other imageviews to be hidden and keep only one visible
                    fatt.setVisibility(View.GONE);
                    dham.setVisibility(View.GONE);
                    kas.setVisibility(View.VISIBLE);


                }
            });
        } else if (extras.getInt("harf") == 8) {

            //BA GOES HERE

            getSupportActionBar().setTitle("دَال");

            fatt.setText("دَا");
            insert.setText(position[0]);

            // all the audio will be loaded from here
            fatt.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    harfs.play(alif1, 1, 1, 1, 1, 1);
                }
            });

            dham.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    harfs.play(ba1, 1, 1, 1, 1, 1);
                }
            });

            kas.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    harfs.play(ba1, 1, 1, 1, 1, 1);
                }
            });



            fatha.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    fatt.setText("دَا");
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

                    dham.setText("دُوْا");
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

                    kas.setText("دِيْ");
                    insert.setText(position[2]);


                    //this will cause the other imageviews to be hidden and keep only one visible
                    fatt.setVisibility(View.GONE);
                    dham.setVisibility(View.GONE);
                    kas.setVisibility(View.VISIBLE);


                }
            });
        } else if (extras.getInt("harf") == 9) {

            //BA GOES HERE

            getSupportActionBar().setTitle("ذَال");

            fatt.setText("ذا");
            insert.setText(position[0]);

            // all the audio will be loaded from here
            fatt.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    harfs.play(alif1, 1, 1, 1, 1, 1);
                }
            });

            dham.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    harfs.play(ba1, 1, 1, 1, 1, 1);
                }
            });

            kas.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    harfs.play(ba1, 1, 1, 1, 1, 1);
                }
            });




            fatha.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    fatt.setText("ذا");
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

                    dham.setText(" ذُوْا ");
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

                    kas.setText("ذِيْ");
                    insert.setText(position[2]);


                    //this will cause the other imageviews to be hidden and keep only one visible
                    fatt.setVisibility(View.GONE);
                    dham.setVisibility(View.GONE);
                    kas.setVisibility(View.VISIBLE);


                }
            });
        } else if (extras.getInt("harf") == 10) {

            //TA GOES HERE

            getSupportActionBar().setTitle("رَاء");

            fatt.setText("رَا");
            insert.setText(position[0]);

            // all the audio will be loaded from here
            fatt.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    harfs.play(alif1, 1, 1, 1, 1, 1);
                }
            });

            dham.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    harfs.play(ba1, 1, 1, 1, 1, 1);
                }
            });

            kas.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    harfs.play(ba1, 1, 1, 1, 1, 1);
                }
            });



            fatha.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    fatt.setText("رَا");
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

                    dham.setText("رُوْا");
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

                    kas.setText("رِيْ");
                    insert.setText(position[2]);


                    //this will cause the other imageviews to be hidden and keep only one visible
                    fatt.setVisibility(View.GONE);
                    dham.setVisibility(View.GONE);
                    kas.setVisibility(View.VISIBLE);


                }
            });
        } else if (extras.getInt("harf") == 11) {

            //THA GOES HERE

            getSupportActionBar().setTitle("زَاي");

            fatt.setText("زَا");
            insert.setText(position[0]);

            // all the audio will be loaded from here
            fatt.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    harfs.play(alif1, 1, 1, 1, 1, 1);
                }
            });

            dham.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    harfs.play(ba1, 1, 1, 1, 1, 1);
                }
            });

            kas.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    harfs.play(ba1, 1, 1, 1, 1, 1);
                }
            });




            fatha.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    fatt.setText("زَا");
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

                    dham.setText("زُوْا");
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

                    kas.setText("زِيْ");
                    insert.setText(position[2]);


                    //this will cause the other imageviews to be hidden and keep only one visible
                    fatt.setVisibility(View.GONE);
                    dham.setVisibility(View.GONE);
                    kas.setVisibility(View.VISIBLE);


                }
            });
        } else if (extras.getInt("harf") == 12) {

            //BA GOES HERE

            getSupportActionBar().setTitle("سِين");

            fatt.setText("سَا");
            insert.setText(position[0]);


            // all the audio will be loaded from here
            fatt.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    harfs.play(alif1, 1, 1, 1, 1, 1);
                }
            });

            dham.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    harfs.play(ba1, 1, 1, 1, 1, 1);
                }
            });

            kas.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    harfs.play(ba1, 1, 1, 1, 1, 1);
                }
            });



            fatha.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    fatt.setText("سَا");
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

                    dham.setText("سُوْا");
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

                    kas.setText("سِيْ");
                    insert.setText(position[2]);


                    //this will cause the other imageviews to be hidden and keep only one visible
                    fatt.setVisibility(View.GONE);
                    dham.setVisibility(View.GONE);
                    kas.setVisibility(View.VISIBLE);


                }
            });
        } else if (extras.getInt("harf") == 13) {

            //BA GOES HERE

            getSupportActionBar().setTitle("شحين");

            fatt.setText("شَا");
            insert.setText(position[0]);

            // all the audio will be loaded from here
            fatt.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    harfs.play(alif1, 1, 1, 1, 1, 1);
                }
            });

            dham.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    harfs.play(ba1, 1, 1, 1, 1, 1);
                }
            });

            kas.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    harfs.play(ba1, 1, 1, 1, 1, 1);
                }
            });



            fatha.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    fatt.setText("شَا");
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

                    dham.setText(" شُوْا ");
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

                    kas.setText("شِيْ");
                    insert.setText(position[2]);


                    //this will cause the other imageviews to be hidden and keep only one visible
                    fatt.setVisibility(View.GONE);
                    dham.setVisibility(View.GONE);
                    kas.setVisibility(View.VISIBLE);


                }
            });
        } else if (extras.getInt("harf") == 14) {

            //BA GOES HERE

            getSupportActionBar().setTitle("صَاد");

            fatt.setText("صَا");
            insert.setText(position[0]);

            // all the audio will be loaded from here
            fatt.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    harfs.play(alif1, 1, 1, 1, 1, 1);
                }
            });

            dham.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    harfs.play(ba1, 1, 1, 1, 1, 1);
                }
            });

            kas.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    harfs.play(ba1, 1, 1, 1, 1, 1);
                }
            });




            fatha.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    fatt.setText("صَا");
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

                    dham.setText("صُوْا");
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

                    kas.setText("صِيْ");
                    insert.setText(position[2]);


                    //this will cause the other imageviews to be hidden and keep only one visible
                    fatt.setVisibility(View.GONE);
                    dham.setVisibility(View.GONE);
                    kas.setVisibility(View.VISIBLE);


                }
            });
        } else if (extras.getInt("harf") == 15) {

            //BA GOES HERE

            getSupportActionBar().setTitle("صَاد");

            fatt.setText("ضَا ");
            insert.setText(position[0]);

            // all the audio will be loaded from here
            fatt.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    harfs.play(alif1, 1, 1, 1, 1, 1);
                }
            });

            dham.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    harfs.play(ba1, 1, 1, 1, 1, 1);
                }
            });

            kas.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    harfs.play(ba1, 1, 1, 1, 1, 1);
                }
            });





            fatha.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    fatt.setText("ضَا");
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

                    dham.setText("ضُوْا");
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

                    kas.setText("ضِيْ");
                    insert.setText(position[2]);


                    //this will cause the other imageviews to be hidden and keep only one visible
                    fatt.setVisibility(View.GONE);
                    dham.setVisibility(View.GONE);
                    kas.setVisibility(View.VISIBLE);


                }
            });
        } else if (extras.getInt("harf") == 16) {

            //BA GOES HERE

            getSupportActionBar().setTitle("طَاء");

            fatt.setText("طَا");
            insert.setText(position[0]);

            // all the audio will be loaded from here
            fatt.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    harfs.play(alif1, 1, 1, 1, 1, 1);
                }
            });

            dham.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    harfs.play(ba1, 1, 1, 1, 1, 1);
                }
            });

            kas.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    harfs.play(ba1, 1, 1, 1, 1, 1);
                }
            });


            fatha.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    fatt.setText("طَا");
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

                    dham.setText("طُوْا");
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

                    kas.setText("طِيْ");
                    insert.setText(position[2]);


                    //this will cause the other imageviews to be hidden and keep only one visible
                    fatt.setVisibility(View.GONE);
                    dham.setVisibility(View.GONE);
                    kas.setVisibility(View.VISIBLE);


                }
            });
        } else if (extras.getInt("harf") == 17) {

            //TA GOES HERE

            getSupportActionBar().setTitle("ظَاء");

            fatt.setText("ظَا");
            insert.setText(position[0]);


            // all the audio will be loaded from here
            fatt.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    harfs.play(alif1, 1, 1, 1, 1, 1);
                }
            });

            dham.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    harfs.play(ba1, 1, 1, 1, 1, 1);
                }
            });

            kas.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    harfs.play(ba1, 1, 1, 1, 1, 1);
                }
            });

            fatha.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    fatt.setText("ظَا");
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

                    dham.setText("ظُوْا");
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

                    kas.setText("ظِيْ");
                    insert.setText(position[2]);


                    //this will cause the other imageviews to be hidden and keep only one visible
                    fatt.setVisibility(View.GONE);
                    dham.setVisibility(View.GONE);
                    kas.setVisibility(View.VISIBLE);


                }
            });
        } else if (extras.getInt("harf") == 18) {

            //THA GOES HERE

            getSupportActionBar().setTitle("عَينٍ");

            fatt.setText("عَا");
            insert.setText(position[0]);

            // all the audio will be loaded from here
            fatt.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    harfs.play(alif1, 1, 1, 1, 1, 1);
                }
            });

            dham.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    harfs.play(ba1, 1, 1, 1, 1, 1);
                }
            });

            kas.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    harfs.play(ba1, 1, 1, 1, 1, 1);
                }
            });

            fatha.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    fatt.setText("عَا");
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

                    dham.setText("عُوْا");
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

                    kas.setText("عِيْ");
                    insert.setText(position[2]);


                    //this will cause the other imageviews to be hidden and keep only one visible
                    fatt.setVisibility(View.GONE);
                    dham.setVisibility(View.GONE);
                    kas.setVisibility(View.VISIBLE);


                }
            });
        } else if (extras.getInt("harf") == 19) {

            //BA GOES HERE

            getSupportActionBar().setTitle("غَين");

            fatt.setText("غَا");
            insert.setText(position[0]);

            // all the audio will be loaded from here
            fatt.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    harfs.play(alif1, 1, 1, 1, 1, 1);
                }
            });

            dham.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    harfs.play(ba1, 1, 1, 1, 1, 1);
                }
            });

            kas.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    harfs.play(ba1, 1, 1, 1, 1, 1);
                }
            });


            fatha.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    fatt.setText("غَا");
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

                    dham.setText("غُوْا");
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

                    kas.setText("غِيْ ");
                    insert.setText(position[2]);


                    //this will cause the other imageviews to be hidden and keep only one visible
                    fatt.setVisibility(View.GONE);
                    dham.setVisibility(View.GONE);
                    kas.setVisibility(View.VISIBLE);


                }
            });
        } else if (extras.getInt("harf") == 20) {

            //BA GOES HERE

            getSupportActionBar().setTitle("فَاء");

            fatt.setText("فَا");
            insert.setText(position[0]);

            // all the audio will be loaded from here
            fatt.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    harfs.play(alif1, 1, 1, 1, 1, 1);
                }
            });

            dham.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    harfs.play(ba1, 1, 1, 1, 1, 1);
                }
            });

            kas.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    harfs.play(ba1, 1, 1, 1, 1, 1);
                }
            });


            fatha.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    fatt.setText("فَا");
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

                    dham.setText("فُوْا");
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

                    kas.setText("فِيْ");
                    insert.setText(position[2]);


                    //this will cause the other imageviews to be hidden and keep only one visible
                    fatt.setVisibility(View.GONE);
                    dham.setVisibility(View.GONE);
                    kas.setVisibility(View.VISIBLE);


                }
            });
        } else if (extras.getInt("harf") == 21) {

            //BA GOES HERE

            getSupportActionBar().setTitle("قَاف");

            fatt.setText("قَا ");
            insert.setText(position[0]);

            // all the audio will be loaded from here
            fatt.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    harfs.play(alif1, 1, 1, 1, 1, 1);
                }
            });

            dham.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    harfs.play(ba1, 1, 1, 1, 1, 1);
                }
            });

            kas.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    harfs.play(ba1, 1, 1, 1, 1, 1);
                }
            });


            fatha.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    fatt.setText("قَا ");
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

                    dham.setText("قُوْا");
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

                    kas.setText("قِيْ");
                    insert.setText(position[2]);


                    //this will cause the other imageviews to be hidden and keep only one visible
                    fatt.setVisibility(View.GONE);
                    dham.setVisibility(View.GONE);
                    kas.setVisibility(View.VISIBLE);


                }
            });
        } else if (extras.getInt("harf") == 22) {

            //BA GOES HERE

            getSupportActionBar().setTitle("كَاف");

            fatt.setText("كَا");
            insert.setText(position[0]);

            // all the audio will be loaded from here
            fatt.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    harfs.play(alif1, 1, 1, 1, 1, 1);
                }
            });

            dham.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    harfs.play(ba1, 1, 1, 1, 1, 1);
                }
            });

            kas.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    harfs.play(ba1, 1, 1, 1, 1, 1);
                }
            });


            fatha.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    fatt.setText("كَا");
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

                    dham.setText("كُوْا");
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

                    kas.setText("كِيْ");
                    insert.setText(position[2]);


                    //this will cause the other imageviews to be hidden and keep only one visible
                    fatt.setVisibility(View.GONE);
                    dham.setVisibility(View.GONE);
                    kas.setVisibility(View.VISIBLE);


                }
            });
        } else if (extras.getInt("harf") == 23) {

            //BA GOES HERE

            getSupportActionBar().setTitle("لاَم");

            fatt.setText("لَا ");
            insert.setText(position[0]);

            // all the audio will be loaded from here
            fatt.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    harfs.play(alif1, 1, 1, 1, 1, 1);
                }
            });

            dham.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    harfs.play(ba1, 1, 1, 1, 1, 1);
                }
            });

            kas.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    harfs.play(ba1, 1, 1, 1, 1, 1);
                }
            });


            fatha.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    fatt.setText("لَا ");
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

                    dham.setText("لُوْا");
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

                    kas.setText("لِيْ");
                    insert.setText(position[2]);


                    //this will cause the other imageviews to be hidden and keep only one visible
                    fatt.setVisibility(View.GONE);
                    dham.setVisibility(View.GONE);
                    kas.setVisibility(View.VISIBLE);


                }
            });
        } else if (extras.getInt("harf") == 24) {


            getSupportActionBar().setTitle("مِيم");

            fatt.setText("مَا");
            insert.setText(position[0]);

            // all the audio will be loaded from here
            fatt.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    harfs.play(alif1, 1, 1, 1, 1, 1);
                }
            });

            dham.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    harfs.play(ba1, 1, 1, 1, 1, 1);
                }
            });

            kas.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    harfs.play(ba1, 1, 1, 1, 1, 1);
                }
            });


            fatha.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    fatt.setText("مَا");
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

                    dham.setText("مُوْا");
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

                    kas.setText("مِيْ");
                    insert.setText(position[2]);


                    //this will cause the other imageviews to be hidden and keep only one visible
                    fatt.setVisibility(View.GONE);
                    dham.setVisibility(View.GONE);
                    kas.setVisibility(View.VISIBLE);


                }
            });
        } else if (extras.getInt("harf") == 25) {

            //THA GOES HERE

            getSupportActionBar().setTitle("نُون");

            fatt.setText("نَا");
            insert.setText(position[0]);

            // all the audio will be loaded from here
            fatt.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    harfs.play(alif1, 1, 1, 1, 1, 1);
                }
            });

            dham.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    harfs.play(ba1, 1, 1, 1, 1, 1);
                }
            });

            kas.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    harfs.play(ba1, 1, 1, 1, 1, 1);
                }
            });


            fatha.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    fatt.setText("نَا");
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

                    dham.setText("نُوْا");
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

                    kas.setText("نِيْ");
                    insert.setText(position[2]);


                    //this will cause the other imageviews to be hidden and keep only one visible
                    fatt.setVisibility(View.GONE);
                    dham.setVisibility(View.GONE);
                    kas.setVisibility(View.VISIBLE);


                }
            });
        } else if (extras.getInt("harf") == 26) {

            //BA GOES HERE

            getSupportActionBar().setTitle("وَاو");

            fatt.setText("وَا");
            insert.setText(position[0]);

            // all the audio will be loaded from here
            fatt.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    harfs.play(alif1, 1, 1, 1, 1, 1);
                }
            });

            dham.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    harfs.play(ba1, 1, 1, 1, 1, 1);
                }
            });

            kas.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    harfs.play(ba1, 1, 1, 1, 1, 1);
                }
            });


            fatha.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {



                    fatt.setText("وَا");
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

                    dham.setText("وُوْا");
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

                    kas.setText("وِيْ");
                    insert.setText(position[2]);


                    //this will cause the other imageviews to be hidden and keep only one visible
                    fatt.setVisibility(View.GONE);
                    dham.setVisibility(View.GONE);
                    kas.setVisibility(View.VISIBLE);


                }
            });
        } else if (extras.getInt("harf") == 27) {

            //BA GOES HERE

            getSupportActionBar().setTitle("هَاء");

            fatt.setText("هَا ");
            insert.setText(position[0]);

            // all the audio will be loaded from here
            fatt.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    harfs.play(alif1, 1, 1, 1, 1, 1);
                }
            });

            dham.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    harfs.play(ba1, 1, 1, 1, 1, 1);
                }
            });

            kas.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    harfs.play(ba1, 1, 1, 1, 1, 1);
                }
            });


            fatha.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    fatt.setText("هَا ");
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

                    dham.setText("هُوْا");
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

                    kas.setText("هِيْ");
                    insert.setText(position[2]);


                    //this will cause the other imageviews to be hidden and keep only one visible
                    fatt.setVisibility(View.GONE);
                    dham.setVisibility(View.GONE);
                    kas.setVisibility(View.VISIBLE);


                }
            });
        } else if (extras.getInt("harf") == 28) {

            //BA GOES HERE

            getSupportActionBar().setTitle("هَمزَة");

            fatt.setText("ءَا");
            insert.setText(position[0]);

            // all the audio will be loaded from here
            fatt.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    harfs.play(alif1, 1, 1, 1, 1, 1);
                }
            });

            dham.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    harfs.play(ba1, 1, 1, 1, 1, 1);
                }
            });

            kas.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    harfs.play(ba1, 1, 1, 1, 1, 1);
                }
            });


            fatha.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    fatt.setText("ءَا");
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

                    dham.setText("ءُوْا");
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

                    kas.setText("ءِيْ");
                    insert.setText(position[2]);


                    //this will cause the other imageviews to be hidden and keep only one visible
                    fatt.setVisibility(View.GONE);
                    dham.setVisibility(View.GONE);
                    kas.setVisibility(View.VISIBLE);


                }
            });
        } else if (extras.getInt("harf") == 29) {

            //BA GOES HERE

            getSupportActionBar().setTitle("يَاء");

            fatt.setText("يَا");
            insert.setText(position[0]);

            // all the audio will be loaded from here
            fatt.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    harfs.play(alif1, 1, 1, 1, 1, 1);
                }
            });

            dham.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    harfs.play(ba1, 1, 1, 1, 1, 1);
                }
            });

            kas.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    harfs.play(ba1, 1, 1, 1, 1, 1);
                }
            });


            fatha.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    fatt.setText("يَا");
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

                    dham.setText("يُوْا");
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

                    kas.setText("يَيْ");
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

