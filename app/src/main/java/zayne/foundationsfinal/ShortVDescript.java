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
    private DescriptionParams huroof;

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



        if (extras.getInt("harf") == 1) {

            getSupportActionBar().setTitle("اليف");

            String harf1 = "اَ";
            String harf2= "اُ";
            String harf3 = "اِ";

            huroof = new DescriptionParams(harf1, harf2, harf3, position[0],position[1], position[2], fatt, dham, kas, insert);
            huroof.displayone();

            // all the audio will be loaded from here

            SoundLoader alif = new SoundLoader(this, fatt, dham, kas,R.raw.alif,R.raw.alif,R.raw.wait);
            alif.play();

            fatha.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {huroof.displayone();}});

            dhama.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    huroof.displayTwo();

                }
            });

            kasrah.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    huroof.displayThree();

                }
            });


        } else if (extras.getInt("harf") == 2) {

            getSupportActionBar().setTitle("بَاء");

            String harf1 = "بَ";
            String harf2= "بُ";
            String harf3 = "بِ";

            huroof = new DescriptionParams(harf1, harf2, harf3, position[0],position[1], position[2], fatt, dham, kas, insert);
            huroof.displayone();

            // all the audio will be loaded from here
            SoundLoader alif = new SoundLoader(this, fatt, dham, kas,R.raw.alif,R.raw.alif,R.raw.wait);
            alif.play();

            fatha.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {huroof.displayone();
                }
            });
            dhama.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {huroof.displayTwo();

                }
            });
            kasrah.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {huroof.displayThree();}});

        } else if (extras.getInt("harf") == 3) {

            getSupportActionBar().setTitle("تَاء");

            String harf1 = "تَ";
            String harf2= "تُ";
            String harf3 = "تِ";

            huroof = new DescriptionParams(harf1, harf2, harf3, position[0],position[1], position[2], fatt, dham, kas, insert);
            huroof.displayone();

            // all the audio will be loaded from here
            SoundLoader alif = new SoundLoader(this, fatt, dham, kas,R.raw.alif,R.raw.alif,R.raw.wait);
            alif.play();

            fatha.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    huroof.displayone();

                }
            });
            dhama.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    huroof.displayTwo();

                }
            });
            kasrah.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    huroof.displayThree();

                }
            });

        } else if (extras.getInt("harf") == 4) {

            //THA GOES HERE

            getSupportActionBar().setTitle("ثَاء");

            String harf1 = "ثَ";
            String harf2= "ثُ";
            String harf3 = "ثِ";

            huroof = new DescriptionParams(harf1, harf2, harf3, position[0],position[1], position[2], fatt, dham, kas, insert);
            huroof.displayone();

            // all the audio will be loaded from here
            SoundLoader alif = new SoundLoader(this, fatt, dham, kas,R.raw.alif,R.raw.alif,R.raw.wait);
            alif.play();

            fatha.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    huroof.displayone();
                }
            });
            dhama.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    huroof.displayTwo();

                }
            });
            kasrah.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    huroof.displayThree();     }
            });

        } else if (extras.getInt("harf") == 5) {

            getSupportActionBar().setTitle("جِيم");

            String harf1 = "جَ";
            String harf2= "جُ";
            String harf3 = "جِ";

            huroof = new DescriptionParams(harf1, harf2, harf3, position[0],position[1], position[2], fatt, dham, kas, insert);
            huroof.displayone();

            // all the audio will be loaded from here
            SoundLoader alif = new SoundLoader(this, fatt, dham, kas,R.raw.alif,R.raw.alif,R.raw.wait);
            alif.play();

            fatha.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    huroof.displayone();
                }
            });
            dhama.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    huroof.displayTwo();

                }
            });
            kasrah.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    huroof.displayThree();
                }
            });


        } else if (extras.getInt("harf") == 6) {

            getSupportActionBar().setTitle("حَاء");

            String harf1 = "حَ";
            String harf2= "حُ";
            String harf3 = "حِ";

            huroof = new DescriptionParams(harf1, harf2, harf3,
                    position[0],position[1], position[2], fatt, dham, kas, insert);

            huroof.displayone();

            // all the audio will be loaded from here
            SoundLoader alif = new SoundLoader(this, fatt, dham, kas,R.raw.alif,R.raw.alif,R.raw.wait);
            alif.play();

            fatha.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    huroof.displayone();
                }
            });
            dhama.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    huroof.displayTwo();

                }
            });
            kasrah.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    huroof.displayThree();     }
            });

        } else if (extras.getInt("harf") == 7) {

            getSupportActionBar().setTitle("خَاء");

            String harf1 = "خَ";
            String harf2= "خُ";
            String harf3 = "خِ";

            huroof = new DescriptionParams(harf1, harf2, harf3, position[0],position[1], position[2], fatt, dham, kas, insert);
            huroof.displayone();

            // all the audio will be loaded from here
            SoundLoader alif = new SoundLoader(this, fatt, dham, kas,R.raw.alif,R.raw.alif,R.raw.wait);
            alif.play();

            fatha.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    huroof.displayone();
                }
            });
            dhama.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    huroof.displayTwo();

                }
            });
            kasrah.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    huroof.displayThree();
                }
            });

        } else if (extras.getInt("harf") == 8) {

            getSupportActionBar().setTitle("دَال");

            String harf1 = "دَ";
            String harf2= "دُ";
            String harf3 = "دِ";

            huroof = new DescriptionParams(harf1, harf2, harf3, position[0],position[1], position[2], fatt, dham, kas, insert);
            huroof.displayone();

            // all the audio will be loaded from here
            SoundLoader alif = new SoundLoader(this, fatt, dham, kas,R.raw.alif,R.raw.alif,R.raw.wait);
            alif.play();

            fatha.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    huroof.displayone();
                }
            });
            dhama.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    huroof.displayTwo();

                }
            });
            kasrah.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    huroof.displayThree();
                }
            });

        } else if (extras.getInt("harf") == 9) {

            //BA GOES HERE

            getSupportActionBar().setTitle("ذَال");


            String harf1 = "ذَ";
            String harf2= "ذُ";
            String harf3 = "ذِ";

            huroof = new DescriptionParams(harf1, harf2, harf3, position[0],position[1], position[2], fatt, dham, kas, insert);
            huroof.displayone();

            // all the audio will be loaded from here
            SoundLoader alif = new SoundLoader(this, fatt, dham, kas,R.raw.alif,R.raw.alif,R.raw.wait);
            alif.play();

            fatha.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    huroof.displayone();
                }
            });
            dhama.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    huroof.displayTwo();

                }
            });
            kasrah.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    huroof.displayThree();
                }
            });

        } else if (extras.getInt("harf") == 10) {


            getSupportActionBar().setTitle("رَاء");

            String harf1 = "رَ";
            String harf2= "رُ";
            String harf3 = "رِ";

            huroof = new DescriptionParams(harf1, harf2, harf3, position[0],position[1], position[2], fatt, dham, kas, insert);
            huroof.displayone();

            // all the audio will be loaded from here
            SoundLoader alif = new SoundLoader(this, fatt, dham, kas,R.raw.alif,R.raw.alif,R.raw.wait);
            alif.play();

            fatha.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    huroof.displayone();
                }
            });
            dhama.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    huroof.displayTwo();

                }
            });
            kasrah.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    huroof.displayThree();
                }
            });

        } else if (extras.getInt("harf") == 11) {

            getSupportActionBar().setTitle("زَاي");

            String harf1 = "زَ";
            String harf2= "زُ";
            String harf3 = "زِ";

            huroof = new DescriptionParams(harf1, harf2, harf3, position[0],position[1], position[2], fatt, dham, kas, insert);
            huroof.displayone();

            // all the audio will be loaded from here
            SoundLoader alif = new SoundLoader(this, fatt, dham, kas,R.raw.alif,R.raw.alif,R.raw.wait);
            alif.play();

            fatha.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    huroof.displayone();
                }
            });
            dhama.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    huroof.displayTwo();

                }
            });
            kasrah.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    huroof.displayThree();
                }
            });

        } else if (extras.getInt("harf") == 12) {

            getSupportActionBar().setTitle("سِين");

            String harf1 = "سَ";
            String harf2= "سُ";
            String harf3 = "سِ شَ";

            huroof = new DescriptionParams(harf1, harf2, harf3, position[0],position[1], position[2], fatt, dham, kas, insert);
            huroof.displayone();

            // all the audio will be loaded from here
            SoundLoader alif = new SoundLoader(this, fatt, dham, kas,R.raw.alif,R.raw.alif,R.raw.wait);
            alif.play();

            fatha.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    huroof.displayone();
                }
            });
            dhama.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    huroof.displayTwo();

                }
            });
            kasrah.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    huroof.displayThree();
                }
            });

        } else if (extras.getInt("harf") == 13) {

            //BA GOES HERE

            getSupportActionBar().setTitle("شحين");

            String harf1 = "شَ";
            String harf2= "شُ";
            String harf3 = "شِ";

            huroof = new DescriptionParams(harf1, harf2, harf3, position[0],position[1], position[2], fatt, dham, kas, insert);
            huroof.displayone();

            // all the audio will be loaded from here
            SoundLoader alif = new SoundLoader(this, fatt, dham, kas,R.raw.alif,R.raw.alif,R.raw.wait);
            alif.play();

            fatha.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    huroof.displayone();
                }
            });
            dhama.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    huroof.displayTwo();

                }
            });
            kasrah.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    huroof.displayThree();
                }
            });

        } else if (extras.getInt("harf") == 14) {

            //BA GOES HERE

            getSupportActionBar().setTitle("صَاد");

            String harf1 = "صَ";
            String harf2= "صُ";
            String harf3 = "صِ";

            huroof = new DescriptionParams(harf1, harf2, harf3, position[0],position[1], position[2], fatt, dham, kas, insert);
            huroof.displayone();

            // all the audio will be loaded from here
            SoundLoader alif = new SoundLoader(this, fatt, dham, kas,R.raw.alif,R.raw.alif,R.raw.wait);
            alif.play();

            fatha.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    huroof.displayone();
                }
            });
            dhama.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    huroof.displayTwo();

                }
            });
            kasrah.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    huroof.displayThree();
                }
            });

        } else if (extras.getInt("harf") == 15) {

            //BA GOES HERE

            getSupportActionBar().setTitle("صَاد");


            String harf1 = "ضَ";
            String harf2= "ضُ";
            String harf3 = "ضِ";

            huroof = new DescriptionParams(harf1, harf2, harf3, position[0],position[1], position[2], fatt, dham, kas, insert);
            huroof.displayone();

            // all the audio will be loaded from here
            SoundLoader alif = new SoundLoader(this, fatt, dham, kas,R.raw.alif,R.raw.alif,R.raw.wait);
            alif.play();

            fatha.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    huroof.displayone();
                }
            });
            dhama.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    huroof.displayTwo();

                }
            });
            kasrah.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    huroof.displayThree();
                }
            });

        } else if (extras.getInt("harf") == 16) {

            //BA GOES HERE

            getSupportActionBar().setTitle("طَاء");

            String harf1 = "طَ";
            String harf2= "طُ";
            String harf3 = "طِ";

            huroof = new DescriptionParams(harf1, harf2, harf3, position[0],position[1], position[2], fatt, dham, kas, insert);
            huroof.displayone();

            // all the audio will be loaded from here
            SoundLoader alif = new SoundLoader(this, fatt, dham, kas,R.raw.alif,R.raw.alif,R.raw.wait);
            alif.play();

            fatha.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    huroof.displayone();
                }
            });
            dhama.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    huroof.displayTwo();

                }
            });
            kasrah.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    huroof.displayThree();
                }
            });

        } else if (extras.getInt("harf") == 17) {

            //TA GOES HERE

            getSupportActionBar().setTitle("ظَاء");

            String harf1 = "ظَ";
            String harf2= "ظُ";
            String harf3 = "ظِ";

            huroof = new DescriptionParams(harf1, harf2, harf3, position[0],position[1], position[2], fatt, dham, kas, insert);
            huroof.displayone();

            // all the audio will be loaded from here
            SoundLoader alif = new SoundLoader(this, fatt, dham, kas,R.raw.alif,R.raw.alif,R.raw.wait);
            alif.play();

            fatha.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    huroof.displayone();
                }
            });
            dhama.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    huroof.displayTwo();

                }
            });
            kasrah.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    huroof.displayThree();
                }
            });

        } else if (extras.getInt("harf") == 18) {

            //THA GOES HERE

            getSupportActionBar().setTitle("عَينٍ");

            String harf1 = "عَ";
            String harf2= "عُ";
            String harf3 = "عِ";

            huroof = new DescriptionParams(harf1, harf2, harf3, position[0],position[1], position[2], fatt, dham, kas, insert);
            huroof.displayone();

            // all the audio will be loaded from here
            SoundLoader alif = new SoundLoader(this, fatt, dham, kas,R.raw.alif,R.raw.alif,R.raw.wait);
            alif.play();

            fatha.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    huroof.displayone();
                }
            });
            dhama.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    huroof.displayTwo();

                }
            });
            kasrah.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    huroof.displayThree();
                }
            });

        } else if (extras.getInt("harf") == 19) {

            //BA GOES HERE

            getSupportActionBar().setTitle("غَين");

            String harf1 = "غَ";
            String harf2= "غُ";
            String harf3 = "غِ";

            huroof = new DescriptionParams(harf1, harf2, harf3, position[0],position[1], position[2], fatt, dham, kas, insert);
            huroof.displayone();

            // all the audio will be loaded from here
            SoundLoader alif = new SoundLoader(this, fatt, dham, kas,R.raw.alif,R.raw.alif,R.raw.wait);
            alif.play();

            fatha.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    huroof.displayone();
                }
            });
            dhama.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    huroof.displayTwo();

                }
            });
            kasrah.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    huroof.displayThree();
                }
            });

        } else if (extras.getInt("harf") == 20) {

            //BA GOES HERE

            getSupportActionBar().setTitle("فَاء");

            String harf1 = "فَ";
            String harf2= "فُ";
            String harf3 = "فِ";

            huroof = new DescriptionParams(harf1, harf2, harf3, position[0],position[1], position[2], fatt, dham, kas, insert);
            huroof.displayone();

            // all the audio will be loaded from here
            SoundLoader alif = new SoundLoader(this, fatt, dham, kas,R.raw.alif,R.raw.alif,R.raw.wait);
            alif.play();

            fatha.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    huroof.displayone();
                }
            });
            dhama.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    huroof.displayTwo();

                }
            });
            kasrah.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    huroof.displayThree();
                }
            });

        } else if (extras.getInt("harf") == 21) {

            //BA GOES HERE

            getSupportActionBar().setTitle("قَاف");

            String harf1 = "قَ";
            String harf2= "قُ";
            String harf3 = "قِ";

            huroof = new DescriptionParams(harf1, harf2, harf3, position[0],position[1], position[2], fatt, dham, kas, insert);
            huroof.displayone();

            // all the audio will be loaded from here
            SoundLoader alif = new SoundLoader(this, fatt, dham, kas,R.raw.alif,R.raw.alif,R.raw.wait);
            alif.play();

            fatha.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    huroof.displayone();
                }
            });
            dhama.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    huroof.displayTwo();

                }
            });
            kasrah.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    huroof.displayThree();
                }
            });

        } else if (extras.getInt("harf") == 22) {

            //BA GOES HERE

            getSupportActionBar().setTitle("كَاف");

            String harf1 = "كَ";
            String harf2= "كُ";
            String harf3 = "كِيْ";

            huroof = new DescriptionParams(harf1, harf2, harf3, position[0],position[1], position[2], fatt, dham, kas, insert);
            huroof.displayone();

            // all the audio will be loaded from here
            SoundLoader alif = new SoundLoader(this, fatt, dham, kas,R.raw.alif,R.raw.alif,R.raw.wait);
            alif.play();

            fatha.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    huroof.displayone();
                }
            });
            dhama.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    huroof.displayTwo();

                }
            });
            kasrah.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    huroof.displayThree();
                }
            });

        } else if (extras.getInt("harf") == 23) {

            //BA GOES HERE

            getSupportActionBar().setTitle("لاَم");

            String harf1 = "لَا";
            String harf2= "لُوْا";
            String harf3 = "لِيْ";

            huroof = new DescriptionParams(harf1, harf2, harf3, position[0],position[1], position[2], fatt, dham, kas, insert);
            huroof.displayone();

            // all the audio will be loaded from here
            SoundLoader alif = new SoundLoader(this, fatt, dham, kas,R.raw.alif,R.raw.alif,R.raw.wait);
            alif.play();

            fatha.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    huroof.displayone();
                }
            });
            dhama.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    huroof.displayTwo();

                }
            });
            kasrah.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    huroof.displayThree();
                }
            });

        } else if (extras.getInt("harf") == 24) {


            getSupportActionBar().setTitle("مِيم");

            String harf1 = "مَا";
            String harf2= "مُوْا";
            String harf3 = "مِيْ";

            huroof = new DescriptionParams(harf1, harf2, harf3, position[0],position[1], position[2], fatt, dham, kas, insert);
            huroof.displayone();

            // all the audio will be loaded from here
            SoundLoader alif = new SoundLoader(this, fatt, dham, kas,R.raw.alif,R.raw.alif,R.raw.wait);
            alif.play();

            fatha.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    huroof.displayone();
                }
            });
            dhama.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    huroof.displayTwo();

                }
            });
            kasrah.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    huroof.displayThree();
                }
            });

        } else if (extras.getInt("harf") == 25) {

            //THA GOES HERE

            getSupportActionBar().setTitle("نُون");

            String harf1 = "نَا";
            String harf2= "نُوْا";
            String harf3 = "نِيْ";

            huroof = new DescriptionParams(harf1, harf2, harf3, position[0],position[1], position[2], fatt, dham, kas, insert);
            huroof.displayone();

            // all the audio will be loaded from here
            SoundLoader alif = new SoundLoader(this, fatt, dham, kas,R.raw.alif,R.raw.alif,R.raw.wait);
            alif.play();

            fatha.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    huroof.displayone();
                }
            });
            dhama.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    huroof.displayTwo();

                }
            });
            kasrah.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    huroof.displayThree();
                }
            });

        } else if (extras.getInt("harf") == 26) {

            //BA GOES HERE

            getSupportActionBar().setTitle("وَاو");

            String harf1 = "وَا";
            String harf2= "وُوْا";
            String harf3 = "وِيْ";

            huroof = new DescriptionParams(harf1, harf2, harf3, position[0],position[1], position[2], fatt, dham, kas, insert);
            huroof.displayone();

            // all the audio will be loaded from here
            SoundLoader alif = new SoundLoader(this, fatt, dham, kas,R.raw.alif,R.raw.alif,R.raw.wait);
            alif.play();

            fatha.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    huroof.displayone();
                }
            });
            dhama.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    huroof.displayTwo();

                }
            });
            kasrah.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    huroof.displayThree();
                }
            });

        } else if (extras.getInt("harf") == 27) {

            //BA GOES HERE

            getSupportActionBar().setTitle("هَاء");

            String harf1 = "هَا";
            String harf2= "هُوْا";
            String harf3 = "هِيْ";

            huroof = new DescriptionParams(harf1, harf2, harf3, position[0],position[1], position[2], fatt, dham, kas, insert);
            huroof.displayone();

            // all the audio will be loaded from here
            SoundLoader alif = new SoundLoader(this, fatt, dham, kas,R.raw.alif,R.raw.alif,R.raw.wait);
            alif.play();

            fatha.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    huroof.displayone();
                }
            });
            dhama.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    huroof.displayTwo();

                }
            });
            kasrah.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    huroof.displayThree();
                }
            });

        } else if (extras.getInt("harf") == 28) {

            //BA GOES HERE

            getSupportActionBar().setTitle("هَمزَة");

            String harf1 = "ءَا";
            String harf2= "ءُوْا";
            String harf3 = "ءِيْ";

            huroof = new DescriptionParams(harf1, harf2, harf3, position[0],position[1], position[2], fatt, dham, kas, insert);
            huroof.displayone();

            // all the audio will be loaded from here
            SoundLoader alif = new SoundLoader(this, fatt, dham, kas,R.raw.alif,R.raw.alif,R.raw.wait);
            alif.play();

            fatha.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    huroof.displayone();
                }
            });
            dhama.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    huroof.displayTwo();

                }
            });
            kasrah.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    huroof.displayThree();
                }
            });

        } else if (extras.getInt("harf") == 29) {

            //BA GOES HERE

            getSupportActionBar().setTitle("يَاء");

            String harf1 = "يَا";
            String harf2= "يُوْا";
            String harf3 = "يَيْ";

            huroof = new DescriptionParams(harf1, harf2, harf3, position[0],position[1], position[2], fatt, dham, kas, insert);
            huroof.displayone();

            // all the audio will be loaded from here
            SoundLoader alif = new SoundLoader(this, fatt, dham, kas,R.raw.alif,R.raw.alif,R.raw.wait);
            alif.play();

            fatha.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    huroof.displayone();
                }
            });
            dhama.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    huroof.displayTwo();

                }
            });
            kasrah.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    huroof.displayThree();
                }
            });

        }
    }
}

