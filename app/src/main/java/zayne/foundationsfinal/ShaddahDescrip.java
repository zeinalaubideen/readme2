package zayne.foundationsfinal;

import android.graphics.Typeface;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class ShaddahDescrip extends AppCompatActivity {


    private TextView insert, fatt, dham, kas;
    private Button fatha, dhama, kasrah;
    private DescriptionParams huroof;
    private String[] position = {"fatha", "Dhama", "kasrah"};
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


        fatt = (TextView) findViewById(R.id.one);
        dham = (TextView) findViewById(R.id.two);
        kas = (TextView) findViewById(R.id.three);




        insert = (TextView) findViewById(R.id.insert);

        fatha = (Button) findViewById(R.id.first);
        dhama = (Button) findViewById(R.id.second);
        kasrah = (Button) findViewById(R.id.third);



        if (extras.getInt("harf") == 2) {

            getSupportActionBar().setTitle("بَاء");

            String harf1 = "اَبَّ";
            String harf2= "اُبَّ";
            String harf3 = "اِبَّ";

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

            String harf1 = "اَتَّ";
            String harf2= "اُتَّ";
            String harf3 = "اِتَّ";

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

            String harf1 = "اَثَّ";
            String harf2= "اُثَّ";
            String harf3 = "اِثَّ";

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

            String harf1 = "اَجَّ";
            String harf2= "اُجَّ";
            String harf3 = "اِجَّ";

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

            String harf1 = "اَحَّ";
            String harf2= "اُحَّ";
            String harf3 = "اِحَّ";

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

            String harf1 = "اَخَّ";
            String harf2= "اُخَّ";
            String harf3 = "اِخَّ";

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

            String harf1 = "اَدَّ";
            String harf2= "اُدَّ";
            String harf3 = "اِدَّ";

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


            String harf1 = "اَذَّ";
            String harf2= "اُذَّ";
            String harf3 = "اِذَّ";

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

            String harf1 = "اَرَّ";
            String harf2= "اُرَّ";
            String harf3 = "اِرَّ";

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

            String harf1 = "اَزَّ";
            String harf2= "اُزَّ";
            String harf3 = "اِزَّ";

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

            String harf1 = "اَسَّ";
            String harf2= "اُسَّ";
            String harf3 = "اِسَّ";

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

            String harf1 = "اَشَّ";
            String harf2= "اُشَّ";
            String harf3 = "اِشَّ";

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

            String harf1 = "اَصَّ";
            String harf2= "اُصَّ";
            String harf3 = "اِصَّ";

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


            String harf1 = "اَضَّ";
            String harf2= "اُضَّ";
            String harf3 = "اِضَّ";

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

            String harf1 = "اَطَّ";
            String harf2= "اُطَّ";
            String harf3 = "اِطَّ";

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

            String harf1 = "اَظَّ";
            String harf2= "اُظَّ";
            String harf3 = "اِظَّ";

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

            String harf1 = "اَعَّ";
            String harf2= "اُعَّ";
            String harf3 = "اِعَّ";

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

            String harf1 = "اَغَّ";
            String harf2= "اُغَّ";
            String harf3 = "اِغَّ";

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

            String harf1 = "اَفَّ";
            String harf2= "اُفَّ";
            String harf3 = "اِفَّ";

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

            String harf1 = "اَقَّ";
            String harf2= "اُقَّ";
            String harf3 = "اِقَّ";

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

            String harf1 = "اَكَّ";
            String harf2= "اُكَّ";
            String harf3 = "اِكَّ";

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

            String harf1 = "اَلَّ";
            String harf2= "اُلَّ";
            String harf3 = "اِلَّ";

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

            String harf1 = "اَمَّ";
            String harf2= "اُمَّ";
            String harf3 = "اِمَّ";

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

            String harf1 = "اَنَّ";
            String harf2= "اُنَّ";
            String harf3 = "اِنَّ";

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

            String harf1 = "اَوَّ";
            String harf2= "اُوَّ";
            String harf3 = "اِوَّ";

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

            String harf1 = "اَهَّ";
            String harf2= "اُهَّ";
            String harf3 = "اِهَّ";

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

            String harf1 = "اَءَّ";
            String harf2= "اُءَّ";
            String harf3 = "اِءَّ";

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

            String harf1 = "اَيَّ";
            String harf2= "اُيَّ";
            String harf3 = "اِيَّ";

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
