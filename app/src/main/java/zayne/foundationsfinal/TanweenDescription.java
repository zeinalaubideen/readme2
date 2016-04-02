package zayne.foundationsfinal;

import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class TanweenDescription extends AppCompatActivity {

    private TextView insert, fatt, dham, kas;
    private Button fatha, dhama, kasrah;
    private String[] position = {"Fathatan", "Dhamatan", "Kasrahtan"};


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



        fatt = (TextView) findViewById(R.id.one);
        dham = (TextView) findViewById(R.id.two);
        kas = (TextView) findViewById(R.id.three);




        insert = (TextView) findViewById(R.id.insert);

        fatha = (Button) findViewById(R.id.first);
        dhama = (Button) findViewById(R.id.second);
        kasrah = (Button) findViewById(R.id.third);
        fatha.setText("Fathatan");
        dhama.setText("Dhamatan");
        kasrah.setText("Kasratan");
        //this is where all the audio files will be offloaded from

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
        ya = harfs.load(this, sounds[28], 1);*/


        if (extras.getInt("harf") == 1) {

            getSupportActionBar().setTitle("اليف");

            fatt.setText("اً");
            fatt.setPadding(0, 10, 0, 0);
            insert.setText(position[0]);



            fatha.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    fatt.setText("اً");

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

                    dham.setText("اٌ");
                    dham.setPadding(0,10,0,0);
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

                    kas.setText("اٍ");
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

            fatt.setText("بًا");
            insert.setText(position[0]);


            fatha.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    fatt.setText("بًا");
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

                    dham.setText("بٌ");
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

                    kas.setText("بٍ");
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

            fatt.setText("تًا");
            insert.setText(position[0]);


            fatha.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    fatt.setText("تًا");
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

                    dham.setText("تٌ");
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

                    kas.setText("تٍ");
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

            fatt.setText("ثًا");
            insert.setText(position[0]);


            fatha.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    fatt.setText("ثًا");
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

                    dham.setText("ثٌ");
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

                    kas.setText("ثٍ");
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

            fatt.setText("جًا");
            insert.setText(position[0]);


            fatha.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    fatt.setText("جًا");
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

                    dham.setText("جٌ");
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

                    kas.setText("جٍ");
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

            fatt.setText("حًا");
            insert.setText(position[0]);


            fatha.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    fatt.setText("حًا");
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

                    dham.setText("حٌ");
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

                    kas.setText("حٍ");
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

            fatt.setText("خًا");
            insert.setText(position[0]);


            fatha.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    fatt.setText("خًا");
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

                    dham.setText("خٌ ");
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

                    kas.setText("خٍ ");
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

            fatt.setText("دًا");
            insert.setText(position[0]);


            fatha.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    fatt.setText("دًا");
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

                    dham.setText("دٌ");
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

                    kas.setText("دٍ");
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

            fatt.setText("ذًا");
            insert.setText(position[0]);


            fatha.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    fatt.setText("ذًا");
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

                    dham.setText("ذٌ");
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

                    kas.setText("ذٍ");
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

            fatt.setText("رًا");
            insert.setText(position[0]);


            fatha.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    fatt.setText("رًا");
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

                    dham.setText("رٌ");
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

                    kas.setText("رٍ");
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

            fatt.setText("زًا");
            insert.setText(position[0]);


            fatha.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    fatt.setText("زًا");
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

                    dham.setText("زٌ");
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

                    kas.setText("زٍ");
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

            fatt.setText("سًا");
            insert.setText(position[0]);


            fatha.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    fatt.setText("سًا");
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

                    dham.setText("سٌ");
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

                    kas.setText("سٍ");
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

            fatt.setText("شًا");
            insert.setText(position[0]);


            fatha.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    fatt.setText("شًا");
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

                    dham.setText("شٌ");
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

                    kas.setText("شٍ ");
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

            fatt.setText("صًا");
            insert.setText(position[0]);


            fatha.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    fatt.setText("صًا");
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

                    dham.setText("صٌ");
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

                    kas.setText("صٍ");
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

            fatt.setText("ضًا ");
            insert.setText(position[0]);


            fatha.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    fatt.setText("ضًا");
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

                    dham.setText("ضٌ");
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

                    kas.setText("ضٍ");
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

            fatt.setText("طًا");
            insert.setText(position[0]);


            fatha.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    fatt.setText("طًا");
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

                    dham.setText("طٌ");
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

                    kas.setText("طٍ");
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

            fatt.setText("ظًا");
            insert.setText(position[0]);


            fatha.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    fatt.setText("ظًا");
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

                    dham.setText("ظٌ");
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

                    kas.setText("ظٍ");
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

            fatt.setText("عًا");
            insert.setText(position[0]);


            fatha.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    fatt.setText("عًا");
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

                    dham.setText("عٌ");
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

                    kas.setText("عٍ ");
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

            fatt.setText("غًا");
            insert.setText(position[0]);


            fatha.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    fatt.setText("غًا");
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

                    dham.setText("غٌ");
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

                    kas.setText("غٍ ");
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

            fatt.setText("فًا");
            insert.setText(position[0]);


            fatha.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    fatt.setText("فًا");
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

                    dham.setText("فٌ");
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

                    kas.setText("فٍ");
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

            fatt.setText("قًا");
            insert.setText(position[0]);


            fatha.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    fatt.setText("قًا");
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

                    dham.setText("قٌ");
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

                    kas.setText("قٍ");
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

            fatt.setText("كًا");
            insert.setText(position[0]);


            fatha.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    fatt.setText("كًا");
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

                    dham.setText("كٌ");
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

                    kas.setText("كٍ");
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

            fatt.setText("لًا  ");
            insert.setText(position[0]);


            fatha.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    fatt.setText("لًا ");
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

                    dham.setText("لٌ");
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

                    kas.setText("لٍ");
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

            fatt.setText("مًا");
            insert.setText(position[0]);


            fatha.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    fatt.setText("مًا");
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

                    dham.setText("مٌ");
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

                    kas.setText("مٍ");
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

            fatt.setText("نًا");
            insert.setText(position[0]);


            fatha.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    fatt.setText("نًا");
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

                    dham.setText("نٌ ");
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

                    kas.setText("نٍ");
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

            fatt.setText("وًا");
            insert.setText(position[0]);


            fatha.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    fatt.setText("وًا");
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

                    dham.setText("وٌ");
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

                    kas.setText("وٍ");
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

            fatt.setText("هًا ");
            insert.setText(position[0]);


            fatha.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    fatt.setText("هًا ");
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

                    dham.setText("هٌـ");
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

                    kas.setText("هـٍ");
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

            fatt.setText("ءًا");
            insert.setText(position[0]);


            fatha.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    fatt.setText("ءًا");
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

                    dham.setText("ءٌ");
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

                    kas.setText("ءٍ");
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

            fatt.setText("يًا");
            insert.setText(position[0]);


            fatha.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    fatt.setText("يًا");
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

                    dham.setText("يٌ");
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

                    kas.setText("يٍ");
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
