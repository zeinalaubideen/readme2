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


    private DescriptionParams huroof;
    private TextView insert;
    private Button harfOne, harfTwo, kasrahtan;
    private SoundPool harfs;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.three_items);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        // Give path to the Font location

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



        if (extras.getInt("harf") == 1) {

            getSupportActionBar().setTitle("اليف");

            String harf1 = "اَوْ";
            String harf2= "اَىْ";

            huroof = new DescriptionParams(harf1, harf2, fatha, damha);
            huroof.displayTOne();

            // all the audio will be loaded from here
            SoundLoader alif = new SoundLoader(this, fatha, damha, null,R.raw.alif,R.raw.alif,0);
            alif.playTwo();

            harfOne.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {huroof.displayTOne();
                }
            });
            harfTwo.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {huroof.displayTTwo();

                }
            });



        } else if (extras.getInt("harf") == 2) {



            getSupportActionBar().setTitle("بَاء");

            String harf1 = "بَوْ";
            String harf2= "بَىْ";


            huroof = new DescriptionParams(harf1, harf2, fatha, damha);
            huroof.displayTOne();

            // all the audio will be loaded from here
            SoundLoader alif = new SoundLoader(this, fatha, damha, null,R.raw.alif,R.raw.alif,0);
            alif.playTwo();

            harfOne.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {huroof.displayTOne();
                }
            });
            harfTwo.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    huroof.displayTTwo();

                }
            });

        }
        else if (extras.getInt("harf") == 3) {

            //TA GOES HERE

            getSupportActionBar().setTitle("تَاء");

            String harf1 = "تَوْ";
            String harf2= "تَىْ";


            huroof = new DescriptionParams(harf1, harf2, fatha, damha);
            huroof.displayTOne();

            // all the audio will be loaded from here
            SoundLoader alif = new SoundLoader(this, fatha, damha, null,R.raw.alif,R.raw.alif,0);
            alif.playTwo();

            harfOne.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {huroof.displayTOne();
                }
            });
            harfTwo.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    huroof.displayTTwo();

                }
            });

        }
        else if (extras.getInt("harf") == 4) {

            //THA GOES HERE

            getSupportActionBar().setTitle("ثَاء");

            String harf1 = "ثَوْ";
            String harf2= "ثَىْ";


            huroof = new DescriptionParams(harf1, harf2, fatha, damha);
            huroof.displayTOne();

            // all the audio will be loaded from here
            SoundLoader alif = new SoundLoader(this, fatha, damha, null,R.raw.alif,R.raw.alif,0);
            alif.playTwo();

            harfOne.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {huroof.displayTOne();
                }
            });
            harfTwo.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    huroof.displayTTwo();

                }
            });


        }
        else if (extras.getInt("harf") == 5) {


            getSupportActionBar().setTitle("جِيم");

            String harf1 = "جَوْ";
            String harf2= "جَىْ";


            huroof = new DescriptionParams(harf1, harf2, fatha, damha);
            huroof.displayTOne();

            // all the audio will be loaded from here
            SoundLoader alif = new SoundLoader(this, fatha, damha, null,R.raw.alif,R.raw.alif,0);
            alif.playTwo();

            harfOne.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {huroof.displayTOne();
                }
            });
            harfTwo.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    huroof.displayTTwo();

                }
            });

        }
        else if (extras.getInt("harf") == 6) {

            getSupportActionBar().setTitle("حَاء");

            String harf1 = "حَوْ";
            String harf2= "حَىْ";


            huroof = new DescriptionParams(harf1, harf2, fatha, damha);
            huroof.displayTOne();

            // all the audio will be loaded from here
            SoundLoader alif = new SoundLoader(this, fatha, damha, null,R.raw.alif,R.raw.alif,0);
            alif.playTwo();

            harfOne.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {huroof.displayTOne();
                }
            });
            harfTwo.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    huroof.displayTTwo();

                }
            });
        }
        else if (extras.getInt("harf") == 7) {



            getSupportActionBar().setTitle("خَاء");

            String harf1 = "خَوْ";
            String harf2= "خَىْ";


            huroof = new DescriptionParams(harf1, harf2, fatha, damha);
            huroof.displayTOne();

            // all the audio will be loaded from here
            SoundLoader alif = new SoundLoader(this, fatha, damha, null,R.raw.alif,R.raw.alif,0);
            alif.playTwo();

            harfOne.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {huroof.displayTOne();
                }
            });
            harfTwo.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    huroof.displayTTwo();

                }
            });

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




}


