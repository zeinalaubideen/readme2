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

    private TextView insert, fatt, dham, kas;
    private Button fatha, dhama, kasrah;
    private String[] position = {"fatha", "Dhama", "kasrah"};

    SoundPool harfs;
    private DescriptionParams huroof;
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

        // Load the Font and define typeface accordingly


        fatt = (TextView) findViewById(R.id.one);
        dham = (TextView) findViewById(R.id.two);
        kas = (TextView) findViewById(R.id.three);

        insert = (TextView) findViewById(R.id.insert);

        fatha = (Button) findViewById(R.id.first);
        dhama = (Button) findViewById(R.id.second);
        kasrah = (Button) findViewById(R.id.third);


        if (extras.getInt("harf") == 1) {

            getSupportActionBar().setTitle("اليف");

            String harf1 = "اٰ";
            String harf2= "اُوْا";
            String harf3 = "اِيْ";

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

            String harf1 = "بَا";
            String harf2= "بُوْا";
            String harf3 = "بِيْ";

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

            String harf1 = "تَا";
            String harf2= "تُوْا";
            String harf3 = "تِيْ";

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

            String harf1 = "ثَا";
            String harf2= "ثُوْا";
            String harf3 = "ثِيْ";

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

            String harf1 = "جَا";
            String harf2= "جُوْا";
            String harf3 = "جِيْ";

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

            String harf1 = "حَا";
            String harf2= "حُوْا";
            String harf3 = "حِيْ";

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

            String harf1 = "خَا";
            String harf2= "خُوْا";
            String harf3 = "خِيْ";

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

            String harf1 = "دَا";
            String harf2= "دُوْا";
            String harf3 = "دِيْ";

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


            String harf1 = "ذا";
            String harf2= "ذُوْا";
            String harf3 = "ذِيْ";

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

            String harf1 = "رَا";
            String harf2= "رُوْا";
            String harf3 = "رِيْ";

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

            String harf1 = "زَا";
            String harf2= "زُوْا";
            String harf3 = "زِيْ";

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

            String harf1 = "سَا";
            String harf2= "سُوْا";
            String harf3 = "سِيْ";

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

            String harf1 = "شَا";
            String harf2= "شُوْا";
            String harf3 = "شِيْ";

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

            String harf1 = "صَا";
            String harf2= "صُوْا";
            String harf3 = "صِيْ";

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


            String harf1 = "ضَا";
            String harf2= "ضُوْا";
            String harf3 = "ضِيْ";

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

            String harf1 = "طَا";
            String harf2= "طُوْا";
            String harf3 = "طِيْ";

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

            String harf1 = "ظَا";
            String harf2= "ظُوْا";
            String harf3 = "ظِيْ";

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

            String harf1 = "عَا";
            String harf2= "عُوْا";
            String harf3 = "عِيْ";

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

            String harf1 = "غَا";
            String harf2= "غُوْا";
            String harf3 = "غِيْ";

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

            String harf1 = "فَا";
            String harf2= "فُوْا";
            String harf3 = "فِيْ";

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

            String harf1 = "قَا";
            String harf2= "قُوْا";
            String harf3 = "قِيْ";

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

            String harf1 = "كَا";
            String harf2= "كُوْا";
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

