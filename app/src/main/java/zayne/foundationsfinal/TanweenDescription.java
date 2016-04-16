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
    private DescriptionParams huroof;



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




        if (extras.getInt("harf") == 1) {

            getSupportActionBar().setTitle("اليف");

            String harf1 = "اً";
            String harf2= "اٌ";
            String harf3 = "اٍ";

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

            //BA GOES HERE

            getSupportActionBar().setTitle("بَاء");


            String harf1 = "بًا";
            String harf2= "بٌ";
            String harf3 = "بٍ";

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


        }
        else if (extras.getInt("harf") == 3) {

            //TA GOES HERE

            getSupportActionBar().setTitle("تَاء");


            String harf1 = "تًا";
            String harf2= "تٌ";
            String harf3 = "تٍ";

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



        }
        else if (extras.getInt("harf") == 4) {

            //THA GOES HERE

            getSupportActionBar().setTitle("ثَاء");

            String harf1 = "ثًا";
            String harf2= "ثٌ";
            String harf3 = "ثٍ";

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



        }
        else if (extras.getInt("harf") == 5) {

            //BA GOES HERE

            getSupportActionBar().setTitle("جِيم");

            String harf1 = "جًا ";
            String harf2= "جٌ";
            String harf3 = "جٍ";

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
        }
        else if (extras.getInt("harf") == 6) {

            //BA GOES HERE

            getSupportActionBar().setTitle("حَاء");

            String harf1 = "حًا";
            String harf2= "حٌ";
            String harf3 = "حٍ";

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
        }
        else if (extras.getInt("harf") == 7) {

            //BA GOES HERE

            getSupportActionBar().setTitle("خَاء");

            String harf1 = "خًا";
            String harf2= "خٌ";
            String harf3 = "خٍ";

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
        }
        else if (extras.getInt("harf") == 8) {

            //BA GOES HERE

            getSupportActionBar().setTitle("دَال");

            String harf1 = "دًا";
            String harf2= "دٌ";
            String harf3 = "دٍ";

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
        }
        else if (extras.getInt("harf") == 9) {

            //BA GOES HERE

            getSupportActionBar().setTitle("ذَال");

            String harf1 = "ذًا";
            String harf2= "ذٌ";
            String harf3 = "ذٍ";

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
        }
        else if (extras.getInt("harf") == 10) {

            //TA GOES HERE

            getSupportActionBar().setTitle("رَاء");

            String harf1 = "رًا";
            String harf2= "رٌ";
            String harf3 = "رٍ";

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
        }
        else if (extras.getInt("harf") == 11) {

            //THA GOES HERE

            getSupportActionBar().setTitle("زَاي");

            String harf1 = "زًا";
            String harf2= "زٌ";
            String harf3 = "زٍ";

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
        }
        else if (extras.getInt("harf") == 12) {

            //BA GOES HERE

            getSupportActionBar().setTitle("سِين");

            String harf1 = "سًا";
            String harf2= "سٌ";
            String harf3 = "سٍ";

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
        }
        else if (extras.getInt("harf") == 13) {

            //BA GOES HERE

            getSupportActionBar().setTitle("شحين");

            String harf1 = "شًا";
            String harf2= "شٌ";
            String harf3 = "شٍ";

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
        }
        else if (extras.getInt("harf") == 14) {

            //BA GOES HERE

            getSupportActionBar().setTitle("صَاد");

            String harf1 = "صًا";
            String harf2= "صٌ";
            String harf3 = "صٍ";

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
        }
        else if (extras.getInt("harf") == 15) {

            //BA GOES HERE

            getSupportActionBar().setTitle("صَاد");

            String harf1 = "ضًا";
            String harf2= "ضٌ";
            String harf3 = "ضٍ";

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
        }
        else if (extras.getInt("harf") == 16) {

            //BA GOES HERE

            getSupportActionBar().setTitle("طَاء");

            String harf1 = "طًا ";
            String harf2= "طٌ";
            String harf3 = "طٍ";

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
        }
        else if (extras.getInt("harf") == 17) {

            //TA GOES HERE

            getSupportActionBar().setTitle("ظَاء");

            String harf1 = "ظًا";
            String harf2= "ظٌ";
            String harf3 = "ظٍ";

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
        }
        else if (extras.getInt("harf") == 18) {

            //THA GOES HERE

            getSupportActionBar().setTitle("عَينٍ");

            String harf1 = "عًا";
            String harf2= "عٌ";
            String harf3 = "عٍ";

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
        }
        else if (extras.getInt("harf") == 19) {

            //BA GOES HERE

            getSupportActionBar().setTitle("غَين");

            String harf1 = "غًا";
            String harf2= "غٌ";
            String harf3 = "غٍ";

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
        }
        else if (extras.getInt("harf") == 20) {

            //BA GOES HERE

            getSupportActionBar().setTitle("فَاء");

            String harf1 = "فًا";
            String harf2= "فٌ";
            String harf3 = "فٍ";

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
        }
        else if (extras.getInt("harf") == 21) {

            //BA GOES HERE

            getSupportActionBar().setTitle("قَاف");

            String harf1 = "قًا";
            String harf2= "قٌ";
            String harf3 = "قٍ";

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
        }
        else if (extras.getInt("harf") == 22) {

            //BA GOES HERE

            getSupportActionBar().setTitle("كَاف");

            String harf1 = "كًا";
            String harf2= "كٌ";
            String harf3 = "كٍ";

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
        }
        else if (extras.getInt("harf") == 23) {

            //BA GOES HERE

            getSupportActionBar().setTitle("لاَم");

            String harf1 = "لًا";
            String harf2= "ل" ;
            String harf3 = "لٍ";

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
        }
        else if (extras.getInt("harf") == 24) {



            getSupportActionBar().setTitle("مِيم");

            String harf1 = "مًا";
            String harf2= "مٌ";
            String harf3 = "مٍ";

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
        }
        else if (extras.getInt("harf") == 25) {

            //THA GOES HERE

            getSupportActionBar().setTitle("نُون");

            String harf1 = "نًا";
            String harf2= "نٌ";
            String harf3 = "نٍ";

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
        }
        else if (extras.getInt("harf") == 26) {

            //BA GOES HERE

            getSupportActionBar().setTitle("وَاو");

            String harf1 = "وًا";
            String harf2= "وٌ";
            String harf3 = "وٌ";

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
        }
        else if (extras.getInt("harf") == 27) {

            //BA GOES HERE

            getSupportActionBar().setTitle("هَاء");

            String harf1 = "هًا";
            String harf2= "هٌـ";
            String harf3 = "هـٍ";

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
        }
        else if (extras.getInt("harf") == 28) {

            //BA GOES HERE

            getSupportActionBar().setTitle("هَمزَة");

            String harf1 = "ءًا";
            String harf2= "ءٌ";
            String harf3 = "ءٍ";

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
        }
        else if (extras.getInt("harf") == 29) {

            //BA GOES HERE

            getSupportActionBar().setTitle("يَاء");

            String harf1 = "يًا";
            String harf2= "يٌ";
            String harf3 = "يٍ";

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
        }
    }
}
