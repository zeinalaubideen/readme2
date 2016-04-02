package zayne.foundationsfinal;

import android.graphics.Typeface;
import android.media.AudioManager;
import android.media.SoundPool;
import android.os.Bundle;

import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import zayne.Harf.HarfForm;

public class DipthongsN extends AppCompatActivity {

    private TextView fatha, damha, kasra;


    private TextView insert;
    private Button harfOne, harfTwo, kasrahtan;
    private SoundPool harfs;


    int alif1, alif2, alif3, ba1, ba2, ba3, ta1, ta2, ta3, tha1, tha2, tha3,  jeem1, jeem2, jeem3, ha1, ha2, ha3,
            kha1, kha2, kha3, dal1, dal2, dal3, dhal1, dhal2, dhal3, ra1, ra2, ra3, zay1, zay2, zay3, seen1,
            seen2, seen3, sheen1, sheen2, sheen3, saad1, saad2, saad3, daad1, daad2, daad3, taah1, taah2, taah3,
            dhaa1, dhaa2, dhaa3, ayn1, ayn2, ayn3, ghayn1, ghayn2, ghayn3, fa1, fa2, fa3, qaf1, qaf2, qaf3, kaf1, kaf2, kaf3,
            lam1, lam2, lam3, meem1, meem2, meem3, noon1, noon2, noon3, wow1, wow2, wow3, haa1, haa2, haa3, hamza1, hamza2, hamza3,
            ya1, ya2, ya3;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.three_items);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        // Give path to the Font location

// Apply the font to your TextView object



        toolbar.setNavigationIcon(R.drawable.back);
        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });

        Bundle extras = getIntent().getExtras();
        fatha = (TextView) findViewById(R.id.one);
        damha = (TextView) findViewById(R.id.two);
        kasra = (TextView) findViewById(R.id.three);
        kasra.setVisibility(View.GONE);



        insert = (TextView) findViewById(R.id.insert);

        harfOne = (Button) findViewById(R.id.first);
        harfTwo = (Button) findViewById(R.id.second);
        kasrahtan = (Button) findViewById(R.id.third);
        kasrahtan.setVisibility(View.GONE);
        harfOne.setText("و");
        harfTwo.setText("ي");

        //this is where all the audio files will be offloaded from

        //This is where all the sound files are goiing to be placed
       harfs = new SoundPool(1, AudioManager.STREAM_MUSIC, 0);
       /* ay = harfs.load(this, sounds[0], 1);
       // TODO skip the 1,1 clip alifDham = harfs.load(this, sounds[1], 1);
        aw = harfs.load(this, sounds[2], 1);
        bay = harfs.load(this, sounds[3], 1);
        baw = harfs.load(this, sounds[4], 1);
        tay = harfs.load(this, sounds[5], 1);
        taw = harfs.load(this, sounds[6], 1);
        thay = harfs.load(this, sounds[7], 1);
        tahw = harfs.load(this, sounds[8], 1);
        jay = harfs.load(this, sounds[9], 1);
        jaw = harfs.load(this, sounds[10], 1);
        hay = harfs.load(this, sounds[11], 1);
        haw = harfs.load(this, sounds[12], 1);
        khay = harfs.load(this, sounds[13], 1);
        khaw = harfs.load(this, sounds[14], 1);
        day = harfs.load(this, sounds[15], 1);
        daw = harfs.load(this, sounds[16], 1);
        dhay = harfs.load(this, sounds[17], 1);
        dhaw = harfs.load(this, sounds[18], 1);
        ray = harfs.load(this, sounds[19], 1);
        raw = harfs.load(this, sounds[20], 1);
        zay = harfs.load(this, sounds[21], 1);
        zaw = harfs.load(this, sounds[22], 1);
        seeny = harfs.load(this, sounds[23], 1);
        seenw = harfs.load(this, sounds[24], 1);
        sheeny = harfs.load(this, sounds[25], 1);
        sheenw = harfs.load(this, sounds[26], 1);
        saady = harfs.load(this, sounds[27], 1);
        saadw = harfs.load(this, sounds[28], 1);
        daady = harfs.load(this, sounds[29], 1);
        daadw = harfs.load(this, sounds[30], 1);
        taay = harfs.load(this, sounds[31], 1);
        taaw = harfs.load(this, sounds[32], 1);
        dhaay = harfs.load(this, sounds[33], 1);
        dhaaw = harfs.load(this, sounds[34], 1);
        ayny = harfs.load(this, sounds[35], 1);
        aynw = harfs.load(this, sounds[36], 1);
        ghayny = harfs.load(this, sounds[37], 1);
        ghaynw = harfs.load(this, sounds[38], 1);
        fay = harfs.load(this, sounds[39], 1);
        faw = harfs.load(this, sounds[40], 1);
        qay = harfs.load(this, sounds[41], 1);
        qaw = harfs.load(this, sounds[42], 1);
        kay = harfs.load(this, sounds[43], 1);
        kaw = harfs.load(this, sounds[44], 1);
        lay = harfs.load(this, sounds[45], 1);
        law = harfs.load(this, sounds[46], 1);
        meemy = harfs.load(this, sounds[47], 1);
        meemw = harfs.load(this, sounds[48], 1);
        noony = harfs.load(this, sounds[49], 1);
        noonw = harfs.load(this, sounds[50], 1);
        wowy = harfs.load(this, sounds[51], 1);
        woww = harfs.load(this, sounds[52], 1);
        haay = harfs.load(this, sounds[53], 1);
        haaw = harfs.load(this, sounds[54], 1);
        hamzay = harfs.load(this, sounds[55], 1);
        hamzaw = harfs.load(this, sounds[56], 1);
        yay = harfs.load(this, sounds[57], 1);
        yaw = harfs.load(this, sounds[58], 1);*/







        if (extras.getInt("harf") == 1) {

            getSupportActionBar().setTitle("اليف");

            fatha.setText("اَوْ");



            harfOne.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    //fatha.setText("اَوْ");


                    //this will cause the other imageviews to be hidden and keep only one visible
                    //fatha.setVisibility(View.VISIBLE);
                    //damha.setVisibility(View.GONE);
                    //kasra.setVisibility(View.GONE);
                    String harf = "اَوْ";

                    DescriptionParams d = new DescriptionParams(harf, fatha, damha,kasra);
                    d.setup();


                }
            });

            harfTwo.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {




                    //this will cause the other imageviews to be hidden and keep only one visible
                    String harf ="اَىْ";

                    DescriptionParams d = new DescriptionParams(harf, damha, fatha,kasra);
                    d.setup();

                }
            });



        } else if (extras.getInt("harf") == 2) {

            //BA GOES HERE

            getSupportActionBar().setTitle("بَاء");

            fatha.setText("بَوْ");


            harfOne.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {



                    String harf = "بَوْ";

                    DescriptionParams d = new DescriptionParams(harf, fatha, damha,kasra);
                    d.setup();



                }
            });

            harfTwo.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {



                    String harf ="بَىْ";

                    DescriptionParams d = new DescriptionParams(harf, damha, fatha,kasra);
                    d.setup();




                }
            });


        }
        else if (extras.getInt("harf") == 3) {

            //TA GOES HERE

            getSupportActionBar().setTitle("تَاء");

            fatha.setText("تَوْ");


            harfOne.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    fatha.setText("تَوْ");


                    //this will cause the other imageviews to be hidden and keep only one visible
                    fatha.setVisibility(View.VISIBLE);
                    damha.setVisibility(View.GONE);



                }
            });

            harfTwo.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    damha.setText("تَىْ");


                    //this will cause the other imageviews to be hidden and keep only one visible
                    fatha.setVisibility(View.GONE);
                    damha.setVisibility(View.VISIBLE);



                }
            });

        }
        else if (extras.getInt("harf") == 4) {

            //THA GOES HERE

            getSupportActionBar().setTitle("ثَاء");

            fatha.setText("ثَوْ");


            harfOne.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    fatha.setText("ثَوْ");


                    //this will cause the other imageviews to be hidden and keep only one visible
                    fatha.setVisibility(View.VISIBLE);
                    damha.setVisibility(View.GONE);



                }
            });

            harfTwo.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    damha.setText("ثَىْ");


                    //this will cause the other imageviews to be hidden and keep only one visible
                    fatha.setVisibility(View.GONE);
                    damha.setVisibility(View.VISIBLE);



                }
            });

        }
        else if (extras.getInt("harf") == 5) {

            //BA GOES HERE

            getSupportActionBar().setTitle("جِيم");

            fatha.setText("جَوْ");



            harfOne.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    fatha.setText("جَوْ");


                    //this will cause the other imageviews to be hidden and keep only one visible
                    fatha.setVisibility(View.VISIBLE);
                    damha.setVisibility(View.GONE);



                }
            });

            harfTwo.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    damha.setText("جَىْ");


                    //this will cause the other imageviews to be hidden and keep only one visible
                    fatha.setVisibility(View.GONE);
                    damha.setVisibility(View.VISIBLE);



                }
            });

        }
        else if (extras.getInt("harf") == 6) {

            //BA GOES HERE

            getSupportActionBar().setTitle("حَاء");

            fatha.setText("حَوْ");


            harfOne.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    fatha.setText("حَوْ");


                    //this will cause the other imageviews to be hidden and keep only one visible
                    fatha.setVisibility(View.VISIBLE);
                    damha.setVisibility(View.GONE);



                }
            });

            harfTwo.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    damha.setText("حَىْ");


                    //this will cause the other imageviews to be hidden and keep only one visible
                    fatha.setVisibility(View.GONE);
                    damha.setVisibility(View.VISIBLE);



                }
            });

        }
        else if (extras.getInt("harf") == 7) {

            //BA GOES HERE

            getSupportActionBar().setTitle("خَاء");

            fatha.setText("خَوْ");


            harfOne.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    fatha.setText("خَوْ");


                    //this will cause the other imageviews to be hidden and keep only one visible
                    fatha.setVisibility(View.VISIBLE);
                    damha.setVisibility(View.GONE);



                }
            });

            harfTwo.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    damha.setText("خَىْ");


                    //this will cause the other imageviews to be hidden and keep only one visible
                    fatha.setVisibility(View.GONE);
                    damha.setVisibility(View.VISIBLE);



                }
            });

        }
        else if (extras.getInt("harf") == 8) {

            //BA GOES HERE

            getSupportActionBar().setTitle("دَال");

            fatha.setText("دَوْ");


            harfOne.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    fatha.setText("دَوْ");


                    //this will cause the other imageviews to be hidden and keep only one visible
                    fatha.setVisibility(View.VISIBLE);
                    damha.setVisibility(View.GONE);



                }
            });

            harfTwo.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    damha.setText("دَىْ");


                    //this will cause the other imageviews to be hidden and keep only one visible
                    fatha.setVisibility(View.GONE);
                    damha.setVisibility(View.VISIBLE);



                }
            });

        }
        else if (extras.getInt("harf") == 9) {

            //BA GOES HERE

            getSupportActionBar().setTitle("ذَال");

            fatha.setText("ذَوْ");


            harfOne.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    fatha.setText("ذَوْ");


                    //this will cause the other imageviews to be hidden and keep only one visible
                    fatha.setVisibility(View.VISIBLE);
                    damha.setVisibility(View.GONE);



                }
            });

            harfTwo.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    damha.setText("ذَىْ");


                    //this will cause the other imageviews to be hidden and keep only one visible
                    fatha.setVisibility(View.GONE);
                    damha.setVisibility(View.VISIBLE);



                }
            });

        }
        else if (extras.getInt("harf") == 10) {

            //TA GOES HERE

            getSupportActionBar().setTitle("رَاء");

            fatha.setText("رَوْ");


            harfOne.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    fatha.setText("رَوْ");


                    //this will cause the other imageviews to be hidden and keep only one visible
                    fatha.setVisibility(View.VISIBLE);
                    damha.setVisibility(View.GONE);



                }
            });

            harfTwo.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    damha.setText("رَىْ");


                    //this will cause the other imageviews to be hidden and keep only one visible
                    fatha.setVisibility(View.GONE);
                    damha.setVisibility(View.VISIBLE);



                }
            });

        }
        else if (extras.getInt("harf") == 11) {

            //THA GOES HERE

            getSupportActionBar().setTitle("زَاي");

            fatha.setText("زَوْ");


            harfOne.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    fatha.setText("زَوْ");


                    //this will cause the other imageviews to be hidden and keep only one visible
                    fatha.setVisibility(View.VISIBLE);
                    damha.setVisibility(View.GONE);



                }
            });

            harfTwo.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    damha.setText("زَىْ");


                    //this will cause the other imageviews to be hidden and keep only one visible
                    fatha.setVisibility(View.GONE);
                    damha.setVisibility(View.VISIBLE);



                }
            });

        }
        else if (extras.getInt("harf") == 12) {



            getSupportActionBar().setTitle("سِين");

            fatha.setText("سَوْ");


            harfOne.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    fatha.setText("سَوْ");


                    //this will cause the other imageviews to be hidden and keep only one visible
                    fatha.setVisibility(View.VISIBLE);
                    damha.setVisibility(View.GONE);



                }
            });

            harfTwo.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    damha.setText("سَىْ");


                    //this will cause the other imageviews to be hidden and keep only one visible
                    fatha.setVisibility(View.GONE);
                    damha.setVisibility(View.VISIBLE);



                }
            });

        }
        else if (extras.getInt("harf") == 13) {

            //BA GOES HERE

            getSupportActionBar().setTitle("شِين");

            fatha.setText("شَوْ");


            harfOne.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    fatha.setText("شَوْ");


                    //this will cause the other imageviews to be hidden and keep only one visible
                    fatha.setVisibility(View.VISIBLE);
                    damha.setVisibility(View.GONE);



                }
            });

            harfTwo.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    damha.setText("شَىْ");


                    //this will cause the other imageviews to be hidden and keep only one visible
                    fatha.setVisibility(View.GONE);
                    damha.setVisibility(View.VISIBLE);



                }
            });

        }
        else if (extras.getInt("harf") == 14) {

            //BA GOES HERE

            getSupportActionBar().setTitle("صَاد");

            fatha.setText("صَوْ");


            harfOne.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    fatha.setText("صَوْ");


                    //this will cause the other imageviews to be hidden and keep only one visible
                    fatha.setVisibility(View.VISIBLE);
                    damha.setVisibility(View.GONE);



                }
            });

            harfTwo.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    damha.setText("صَىْ");


                    //this will cause the other imageviews to be hidden and keep only one visible
                    fatha.setVisibility(View.GONE);
                    damha.setVisibility(View.VISIBLE);



                }
            });

        }
        else if (extras.getInt("harf") == 15) {

            //BA GOES HERE

            getSupportActionBar().setTitle("صَاد");

            fatha.setText("ضَوْ");


            harfOne.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    fatha.setText("ضَوْ");


                    //this will cause the other imageviews to be hidden and keep only one visible
                    fatha.setVisibility(View.VISIBLE);
                    damha.setVisibility(View.GONE);



                }
            });

            harfTwo.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    damha.setText("ضَىْ");


                    //this will cause the other imageviews to be hidden and keep only one visible
                    fatha.setVisibility(View.GONE);
                    damha.setVisibility(View.VISIBLE);



                }
            });

        }
        else if (extras.getInt("harf") == 16) {

            //BA GOES HERE

            getSupportActionBar().setTitle("طَاء");

            fatha.setText("طَوْ");


            harfOne.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    fatha.setText("طَوْ");


                    //this will cause the other imageviews to be hidden and keep only one visible
                    fatha.setVisibility(View.VISIBLE);
                    damha.setVisibility(View.GONE);



                }
            });

            harfTwo.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    damha.setText("طَىْ");


                    //this will cause the other imageviews to be hidden and keep only one visible
                    fatha.setVisibility(View.GONE);
                    damha.setVisibility(View.VISIBLE);



                }
            });

        }
        else if (extras.getInt("harf") == 17) {

            //TA GOES HERE

            getSupportActionBar().setTitle("ظَاء");

            fatha.setText("ظَوْ");


            harfOne.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    fatha.setText("ظَوْ");


                    //this will cause the other imageviews to be hidden and keep only one visible
                    fatha.setVisibility(View.VISIBLE);
                    damha.setVisibility(View.GONE);



                }
            });

            harfTwo.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    damha.setText("ظَىْ");


                    //this will cause the other imageviews to be hidden and keep only one visible
                    fatha.setVisibility(View.GONE);
                    damha.setVisibility(View.VISIBLE);



                }
            });

        }
        else if (extras.getInt("harf") == 18) {

            //THA GOES HERE

            getSupportActionBar().setTitle("عَينٍ");

            fatha.setText("عَوْ");


            harfOne.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    fatha.setText("عَوْ");


                    //this will cause the other imageviews to be hidden and keep only one visible
                    fatha.setVisibility(View.VISIBLE);
                    damha.setVisibility(View.GONE);



                }
            });

            harfTwo.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    damha.setText("عَىْ");


                    //this will cause the other imageviews to be hidden and keep only one visible
                    fatha.setVisibility(View.GONE);
                    damha.setVisibility(View.VISIBLE);



                }
            });

        }
        else if (extras.getInt("harf") == 19) {

            //BA GOES HERE

            getSupportActionBar().setTitle("غَين");

            fatha.setText("غَوْ");


            harfOne.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    fatha.setText("غَوْ");


                    //this will cause the other imageviews to be hidden and keep only one visible
                    fatha.setVisibility(View.VISIBLE);
                    damha.setVisibility(View.GONE);



                }
            });

            harfTwo.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    damha.setText("غَىْ");


                    //this will cause the other imageviews to be hidden and keep only one visible
                    fatha.setVisibility(View.GONE);
                    damha.setVisibility(View.VISIBLE);



                }
            });

        }
        else if (extras.getInt("harf") == 20) {

            //BA GOES HERE

            getSupportActionBar().setTitle("فَاء");

            fatha.setText("فَوْ");


            harfOne.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    fatha.setText("فَوْ");


                    //this will cause the other imageviews to be hidden and keep only one visible
                    fatha.setVisibility(View.VISIBLE);
                    damha.setVisibility(View.GONE);



                }
            });

            harfTwo.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    damha.setText("فَىْ");


                    //this will cause the other imageviews to be hidden and keep only one visible
                    fatha.setVisibility(View.GONE);
                    damha.setVisibility(View.VISIBLE);



                }
            });

        }
        else if (extras.getInt("harf") == 21) {

            //BA GOES HERE

            getSupportActionBar().setTitle("قَاف");

            fatha.setText("قَوْ");


            harfOne.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    fatha.setText("قَوْ");


                    //this will cause the other imageviews to be hidden and keep only one visible
                    fatha.setVisibility(View.VISIBLE);
                    damha.setVisibility(View.GONE);



                }
            });

            harfTwo.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    damha.setText("قَىْ");


                    //this will cause the other imageviews to be hidden and keep only one visible
                    fatha.setVisibility(View.GONE);
                    damha.setVisibility(View.VISIBLE);



                }
            });

        }
        else if (extras.getInt("harf") == 22) {

            //BA GOES HERE

            getSupportActionBar().setTitle("كَاف");

            fatha.setText("كَوْ");


            harfOne.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    fatha.setText("كَوْ");


                    //this will cause the other imageviews to be hidden and keep only one visible
                    fatha.setVisibility(View.VISIBLE);
                    damha.setVisibility(View.GONE);



                }
            });

            harfTwo.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    damha.setText("كَىْ");


                    //this will cause the other imageviews to be hidden and keep only one visible
                    fatha.setVisibility(View.GONE);
                    damha.setVisibility(View.VISIBLE);



                }
            });

        }
        else if (extras.getInt("harf") == 23) {

            //BA GOES HERE

            getSupportActionBar().setTitle("لاَم");

            fatha.setText("لَوْ");


            harfOne.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    fatha.setText("لَوْ");


                    //this will cause the other imageviews to be hidden and keep only one visible
                    fatha.setVisibility(View.VISIBLE);
                    damha.setVisibility(View.GONE);



                }
            });

            harfTwo.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    damha.setText("لَىْ");


                    //this will cause the other imageviews to be hidden and keep only one visible
                    fatha.setVisibility(View.GONE);
                    damha.setVisibility(View.VISIBLE);



                }
            });

        }
        else if (extras.getInt("harf") == 24) {

            //TA GOES HERE

            getSupportActionBar().setTitle("مِيم");

            fatha.setText("مَوْ");


            harfOne.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    fatha.setText("مَوْ");


                    //this will cause the other imageviews to be hidden and keep only one visible
                    fatha.setVisibility(View.VISIBLE);
                    damha.setVisibility(View.GONE);



                }
            });

            harfTwo.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    damha.setText("مَىْ");


                    //this will cause the other imageviews to be hidden and keep only one visible
                    fatha.setVisibility(View.GONE);
                    damha.setVisibility(View.VISIBLE);



                }
            });

        }
        else if (extras.getInt("harf") == 25) {

            //THA GOES HERE

            getSupportActionBar().setTitle("نُون");

            fatha.setText("نَوْ");


            harfOne.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    fatha.setText("نَوْ");


                    //this will cause the other imageviews to be hidden and keep only one visible
                    fatha.setVisibility(View.VISIBLE);
                    damha.setVisibility(View.GONE);



                }
            });

            harfTwo.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    damha.setText("نَىْ");


                    //this will cause the other imageviews to be hidden and keep only one visible
                    fatha.setVisibility(View.GONE);
                    damha.setVisibility(View.VISIBLE);


                }
            });

        }
        else if (extras.getInt("harf") == 26) {

            //BA GOES HERE

            getSupportActionBar().setTitle("وَاو");

            fatha.setText("وَوْ");


            harfOne.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    fatha.setText("وَوْ");


                    //this will cause the other imageviews to be hidden and keep only one visible
                    fatha.setVisibility(View.VISIBLE);
                    damha.setVisibility(View.GONE);



                }
            });

            harfTwo.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    damha.setText("وَىْ");


                    //this will cause the other imageviews to be hidden and keep only one visible
                    fatha.setVisibility(View.GONE);
                    damha.setVisibility(View.VISIBLE);



                }
            });

        }
        else if (extras.getInt("harf") == 27) {

            //BA GOES HERE

            getSupportActionBar().setTitle("هَاء");

            fatha.setText("هَوْ");


            harfOne.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    fatha.setText("هَوْ");


                    //this will cause the other imageviews to be hidden and keep only one visible
                    fatha.setVisibility(View.VISIBLE);
                    damha.setVisibility(View.GONE);



                }
            });

            harfTwo.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    damha.setText("هَىْ");


                    //this will cause the other imageviews to be hidden and keep only one visible
                    fatha.setVisibility(View.GONE);
                    damha.setVisibility(View.VISIBLE);



                }
            });

        }
        else if (extras.getInt("harf") == 28) {

            //BA GOES HERE

            getSupportActionBar().setTitle("هَمزَة");

            fatha.setText("ءَوْ");


            harfOne.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    fatha.setText("ءَوْ");


                    //this will cause the other imageviews to be hidden and keep only one visible
                    fatha.setVisibility(View.VISIBLE);
                    damha.setVisibility(View.GONE);



                }
            });

            harfTwo.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    damha.setText("ءَىْ");


                    //this will cause the other imageviews to be hidden and keep only one visible
                    fatha.setVisibility(View.GONE);
                    damha.setVisibility(View.VISIBLE);



                }
            });

        }
        else if (extras.getInt("harf") == 29) {

            //BA GOES HERE

            getSupportActionBar().setTitle("يَاء");

            fatha.setText("يَوْ");


            harfOne.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    fatha.setText("يَوْ");


                    //this will cause the other imageviews to be hidden and keep only one visible
                    fatha.setVisibility(View.VISIBLE);
                    damha.setVisibility(View.GONE);



                }
            });

            harfTwo.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    damha.setText("يَىْ");


                    //this will cause the other imageviews to be hidden and keep only one visible
                    fatha.setVisibility(View.GONE);
                    damha.setVisibility(View.VISIBLE);



                }
            });

        }


    }
    @Override
    protected void onPause(){
    super.onPause();
    harfs.release();
    harfs = null;
    }



}


