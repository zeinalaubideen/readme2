package zayne.Harf;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import zayne.foundationsfinal.MainActivity;
import zayne.foundationsfinal.R;

public class HarfForm extends AppCompatActivity {
    // ActionBar actionBar = getActionBar();

    private TextView alone, beg, mid, end;
    private Button start, beginning, middle, ending;
    private TextView changeText;

    private String[] position = {"Alone", "Beginning", "Middle", "End", "None", "None"};


    //each array here contains the harf and what it looks like in each position


    //this array is used repeadtedly to say whether the harf is at the beginning middle or end or if
    //it has no begeinning than it will say none
    int[] text = {R.string.Alone, R.string.none, R.string.Middle, R.string.End};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.harf_form);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        toolbar.setNavigationIcon(R.drawable.ic_menu_manage);
        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });

        // Give path to the Font location
        String Path2font = "Damascus.ttc";


        // Load the Font and define typeface accordingly
        Typeface tf = Typeface.createFromAsset(getAssets(), Path2font);


        // actionBar.setDisplayHomeAsUpEnabled(true);


        //this is used to change the image to the proper harf
        alone = (TextView) findViewById(R.id.one);
        beg = (TextView) findViewById(R.id.two);
        mid = (TextView) findViewById(R.id.three);
        end = (TextView) findViewById(R.id.four);

        alone.setTypeface(tf);
        beg.setTypeface(tf);
        mid.setTypeface(tf);
        end.setTypeface(tf);

        changeText = (TextView) findViewById(R.id.insert);


        //the same buttongs will be used repeadetly for all huroof
        start = (Button) findViewById(R.id.first);
        beginning = (Button) findViewById(R.id.second);
        middle = (Button) findViewById(R.id.third);
        ending = (Button) findViewById(R.id.fourth);

        //this will change the text explaing how the harf looks depending on its location in a word
        changeText = (TextView) findViewById(R.id.insert);

        Bundle extras = getIntent().getExtras();

        if (extras.getInt("harf") == 1) {

            getSupportActionBar().setTitle("اليف");

            alone.setText("ا");
            changeText.setText(position[0]);


            start.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    alone.setText("ا");
                    changeText.setText(position[0]);


                    //this will cause the other imageviews to be hidden and keep only one visible
                    alone.setVisibility(View.VISIBLE);
                    beg.setVisibility(View.GONE);
                    mid.setVisibility(View.GONE);
                    end.setVisibility(View.GONE);


                }
            });

            beginning.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    beg.setText("none");
                    changeText.setText(position[5]);


                    //this will cause the other imageviews to be hidden and keep only one visible
                    alone.setVisibility(View.GONE);
                    beg.setVisibility(View.VISIBLE);
                    mid.setVisibility(View.GONE);
                    end.setVisibility(View.GONE);

                }
            });
            middle.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    mid.setText("ـا");
                    changeText.setText(position[2]);


                    //this will cause the other imageviews to be hidden and keep only one visible
                    alone.setVisibility(View.GONE);
                    beg.setVisibility(View.GONE);
                    mid.setVisibility(View.VISIBLE);
                    end.setVisibility(View.GONE);

                }
            });
            ending.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    end.setText("ـا");
                    changeText.setText(position[3]);


                    //this will cause the other imageviews to be hidden and keep only one visible
                    alone.setVisibility(View.GONE);
                    beg.setVisibility(View.GONE);
                    mid.setVisibility(View.GONE);
                    end.setVisibility(View.VISIBLE);

                }
            });
        } else if (extras.getInt("harf") == 2) {

            getSupportActionBar().setTitle("بَاء");

            alone.setText("ب");
            changeText.setText(position[0]);


            start.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    alone.setText("ب");
                    changeText.setText(position[0]);


                    //this will cause the other imageviews to be hidden and keep only one visible
                    alone.setVisibility(View.VISIBLE);
                    beg.setVisibility(View.GONE);
                    mid.setVisibility(View.GONE);
                    end.setVisibility(View.GONE);


                }
            });

            beginning.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    beg.setText("بـ");
                    changeText.setText(position[5]);


                    //this will cause the other imageviews to be hidden and keep only one visible
                    alone.setVisibility(View.GONE);
                    beg.setVisibility(View.VISIBLE);
                    mid.setVisibility(View.GONE);
                    end.setVisibility(View.GONE);

                }
            });
            middle.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    mid.setText("ـبـ");
                    changeText.setText(position[2]);


                    //this will cause the other imageviews to be hidden and keep only one visible
                    alone.setVisibility(View.GONE);
                    beg.setVisibility(View.GONE);
                    mid.setVisibility(View.VISIBLE);
                    end.setVisibility(View.GONE);

                }
            });
            ending.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    end.setText("ـب");
                    changeText.setText(position[3]);


                    //this will cause the other imageviews to be hidden and keep only one visible
                    alone.setVisibility(View.GONE);
                    beg.setVisibility(View.GONE);
                    mid.setVisibility(View.GONE);
                    end.setVisibility(View.VISIBLE);

                }
            });
        } else if (extras.getInt("harf") == 3) {

            getSupportActionBar().setTitle("تَاء");

            alone.setText("ت");
            changeText.setText(position[0]);


            start.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    alone.setText("ت");
                    changeText.setText(position[0]);


                    //this will cause the other imageviews to be hidden and keep only one visible
                    alone.setVisibility(View.VISIBLE);
                    beg.setVisibility(View.GONE);
                    mid.setVisibility(View.GONE);
                    end.setVisibility(View.GONE);


                }
            });

            beginning.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    beg.setText("تـ");
                    changeText.setText(position[5]);


                    //this will cause the other imageviews to be hidden and keep only one visible
                    alone.setVisibility(View.GONE);
                    beg.setVisibility(View.VISIBLE);
                    mid.setVisibility(View.GONE);
                    end.setVisibility(View.GONE);

                }
            });
            middle.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    mid.setText("ـتـ ");
                    changeText.setText(position[2]);


                    //this will cause the other imageviews to be hidden and keep only one visible
                    alone.setVisibility(View.GONE);
                    beg.setVisibility(View.GONE);
                    mid.setVisibility(View.VISIBLE);
                    end.setVisibility(View.GONE);

                }
            });
            ending.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    end.setText("ـت ـة ة");
                    changeText.setText(position[3]);


                    //this will cause the other imageviews to be hidden and keep only one visible
                    alone.setVisibility(View.GONE);
                    beg.setVisibility(View.GONE);
                    mid.setVisibility(View.GONE);
                    end.setVisibility(View.VISIBLE);

                }
            });
        } else if (extras.getInt("harf") == 4) {

            getSupportActionBar().setTitle("ثَاء");

            alone.setText("ث");
            changeText.setText(position[0]);


            start.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    alone.setText("ث");
                    changeText.setText(position[0]);


                    //this will cause the other imageviews to be hidden and keep only one visible
                    alone.setVisibility(View.VISIBLE);
                    beg.setVisibility(View.GONE);
                    mid.setVisibility(View.GONE);
                    end.setVisibility(View.GONE);


                }
            });

            beginning.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    beg.setText("ثـ");
                    changeText.setText(position[5]);


                    //this will cause the other imageviews to be hidden and keep only one visible
                    alone.setVisibility(View.GONE);
                    beg.setVisibility(View.VISIBLE);
                    mid.setVisibility(View.GONE);
                    end.setVisibility(View.GONE);

                }
            });
            middle.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    mid.setText("ـثـ");
                    changeText.setText(position[2]);


                    //this will cause the other imageviews to be hidden and keep only one visible
                    alone.setVisibility(View.GONE);
                    beg.setVisibility(View.GONE);
                    mid.setVisibility(View.VISIBLE);
                    end.setVisibility(View.GONE);

                }
            });
            ending.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    end.setText("ـث");
                    changeText.setText(position[3]);


                    //this will cause the other imageviews to be hidden and keep only one visible
                    alone.setVisibility(View.GONE);
                    beg.setVisibility(View.GONE);
                    mid.setVisibility(View.GONE);
                    end.setVisibility(View.VISIBLE);

                }
            });
        } else if (extras.getInt("harf") == 5) {

            getSupportActionBar().setTitle("جِيم");

            alone.setText("ج");
            changeText.setText(position[0]);


            start.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    alone.setText("ج");
                    changeText.setText(position[0]);


                    //this will cause the other imageviews to be hidden and keep only one visible
                    alone.setVisibility(View.VISIBLE);
                    beg.setVisibility(View.GONE);
                    mid.setVisibility(View.GONE);
                    end.setVisibility(View.GONE);


                }
            });

            beginning.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    beg.setText("جـ");
                    changeText.setText(position[5]);


                    //this will cause the other imageviews to be hidden and keep only one visible
                    alone.setVisibility(View.GONE);
                    beg.setVisibility(View.VISIBLE);
                    mid.setVisibility(View.GONE);
                    end.setVisibility(View.GONE);

                }
            });
            middle.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    mid.setText("ـجـ");
                    changeText.setText(position[2]);


                    //this will cause the other imageviews to be hidden and keep only one visible
                    alone.setVisibility(View.GONE);
                    beg.setVisibility(View.GONE);
                    mid.setVisibility(View.VISIBLE);
                    end.setVisibility(View.GONE);

                }
            });
            ending.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    end.setText("ـج");
                    changeText.setText(position[3]);


                    //this will cause the other imageviews to be hidden and keep only one visible
                    alone.setVisibility(View.GONE);
                    beg.setVisibility(View.GONE);
                    mid.setVisibility(View.GONE);
                    end.setVisibility(View.VISIBLE);

                }
            });
        } else if (extras.getInt("harf") == 6) {

            getSupportActionBar().setTitle("حَاء");

            alone.setText("ح");
            changeText.setText(position[0]);


            start.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    alone.setText("ح");
                    changeText.setText(position[0]);


                    //this will cause the other imageviews to be hidden and keep only one visible
                    alone.setVisibility(View.VISIBLE);
                    beg.setVisibility(View.GONE);
                    mid.setVisibility(View.GONE);
                    end.setVisibility(View.GONE);


                }
            });

            beginning.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    beg.setText("حـ");
                    changeText.setText(position[5]);


                    //this will cause the other imageviews to be hidden and keep only one visible
                    alone.setVisibility(View.GONE);
                    beg.setVisibility(View.VISIBLE);
                    mid.setVisibility(View.GONE);
                    end.setVisibility(View.GONE);

                }
            });
            middle.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    mid.setText("ـحـ");
                    changeText.setText(position[2]);


                    //this will cause the other imageviews to be hidden and keep only one visible
                    alone.setVisibility(View.GONE);
                    beg.setVisibility(View.GONE);
                    mid.setVisibility(View.VISIBLE);
                    end.setVisibility(View.GONE);

                }
            });
            ending.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    end.setText("ـح");
                    changeText.setText(position[3]);


                    //this will cause the other imageviews to be hidden and keep only one visible
                    alone.setVisibility(View.GONE);
                    beg.setVisibility(View.GONE);
                    mid.setVisibility(View.GONE);
                    end.setVisibility(View.VISIBLE);

                }
            });
        } else if (extras.getInt("harf") == 7) {

            getSupportActionBar().setTitle("خَاء");

            alone.setText("خ");
            changeText.setText(position[0]);


            start.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    alone.setText("خ");
                    changeText.setText(position[0]);


                    //this will cause the other imageviews to be hidden and keep only one visible
                    alone.setVisibility(View.VISIBLE);
                    beg.setVisibility(View.GONE);
                    mid.setVisibility(View.GONE);
                    end.setVisibility(View.GONE);


                }
            });

            beginning.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    beg.setText("خـ ");
                    changeText.setText(position[5]);


                    //this will cause the other imageviews to be hidden and keep only one visible
                    alone.setVisibility(View.GONE);
                    beg.setVisibility(View.VISIBLE);
                    mid.setVisibility(View.GONE);
                    end.setVisibility(View.GONE);

                }
            });
            middle.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    mid.setText("ـخـ");
                    changeText.setText(position[2]);


                    //this will cause the other imageviews to be hidden and keep only one visible
                    alone.setVisibility(View.GONE);
                    beg.setVisibility(View.GONE);
                    mid.setVisibility(View.VISIBLE);
                    end.setVisibility(View.GONE);

                }
            });
            ending.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    end.setText("ـج");
                    changeText.setText(position[3]);


                    //this will cause the other imageviews to be hidden and keep only one visible
                    alone.setVisibility(View.GONE);
                    beg.setVisibility(View.GONE);
                    mid.setVisibility(View.GONE);
                    end.setVisibility(View.VISIBLE);

                }
            });
        }
        else if (extras.getInt("harf") == 8) {

            getSupportActionBar().setTitle("دَال");

            alone.setText("د");
            changeText.setText(position[0]);


            start.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    alone.setText("د");
                    changeText.setText(position[0]);


                    //this will cause the other imageviews to be hidden and keep only one visible
                    alone.setVisibility(View.VISIBLE);
                    beg.setVisibility(View.GONE);
                    mid.setVisibility(View.GONE);
                    end.setVisibility(View.GONE);


                }
            });

            beginning.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    beg.setText("none");
                    changeText.setText(position[5]);


                    //this will cause the other imageviews to be hidden and keep only one visible
                    alone.setVisibility(View.GONE);
                    beg.setVisibility(View.VISIBLE);
                    mid.setVisibility(View.GONE);
                    end.setVisibility(View.GONE);

                }
            });
            middle.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    mid.setText("ـد");
                    changeText.setText(position[2]);


                    //this will cause the other imageviews to be hidden and keep only one visible
                    alone.setVisibility(View.GONE);
                    beg.setVisibility(View.GONE);
                    mid.setVisibility(View.VISIBLE);
                    end.setVisibility(View.GONE);

                }
            });
            ending.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    end.setText("ـد");
                    changeText.setText(position[3]);


                    //this will cause the other imageviews to be hidden and keep only one visible
                    alone.setVisibility(View.GONE);
                    beg.setVisibility(View.GONE);
                    mid.setVisibility(View.GONE);
                    end.setVisibility(View.VISIBLE);

                }
            });
        } else if (extras.getInt("harf") == 9) {

            getSupportActionBar().setTitle("ذَال");

            alone.setText("ذ");
            changeText.setText(position[0]);


            start.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    alone.setText("ذ");
                    changeText.setText(position[0]);


                    //this will cause the other imageviews to be hidden and keep only one visible
                    alone.setVisibility(View.VISIBLE);
                    beg.setVisibility(View.GONE);
                    mid.setVisibility(View.GONE);
                    end.setVisibility(View.GONE);


                }
            });

            beginning.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    beg.setText("none");
                    changeText.setText(position[5]);


                    //this will cause the other imageviews to be hidden and keep only one visible
                    alone.setVisibility(View.GONE);
                    beg.setVisibility(View.VISIBLE);
                    mid.setVisibility(View.GONE);
                    end.setVisibility(View.GONE);

                }
            });
            middle.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    mid.setText("ـذ");
                    changeText.setText(position[2]);


                    //this will cause the other imageviews to be hidden and keep only one visible
                    alone.setVisibility(View.GONE);
                    beg.setVisibility(View.GONE);
                    mid.setVisibility(View.VISIBLE);
                    end.setVisibility(View.GONE);

                }
            });
            ending.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    end.setText("ـذ");
                    changeText.setText(position[3]);


                    //this will cause the other imageviews to be hidden and keep only one visible
                    alone.setVisibility(View.GONE);
                    beg.setVisibility(View.GONE);
                    mid.setVisibility(View.GONE);
                    end.setVisibility(View.VISIBLE);

                }
            });
        } else if (extras.getInt("harf") == 10) {

            getSupportActionBar().setTitle("رَاء");

            alone.setText("ر");
            changeText.setText(position[0]);


            start.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    alone.setText("ر");
                    changeText.setText(position[0]);


                    //this will cause the other imageviews to be hidden and keep only one visible
                    alone.setVisibility(View.VISIBLE);
                    beg.setVisibility(View.GONE);
                    mid.setVisibility(View.GONE);
                    end.setVisibility(View.GONE);


                }
            });

            beginning.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    beg.setText("none");
                    changeText.setText(position[5]);


                    //this will cause the other imageviews to be hidden and keep only one visible
                    alone.setVisibility(View.GONE);
                    beg.setVisibility(View.VISIBLE);
                    mid.setVisibility(View.GONE);
                    end.setVisibility(View.GONE);

                }
            });
            middle.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    mid.setText("ـر");
                    changeText.setText(position[2]);


                    //this will cause the other imageviews to be hidden and keep only one visible
                    alone.setVisibility(View.GONE);
                    beg.setVisibility(View.GONE);
                    mid.setVisibility(View.VISIBLE);
                    end.setVisibility(View.GONE);

                }
            });
            ending.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    end.setText("ـر");
                    changeText.setText(position[3]);


                    //this will cause the other imageviews to be hidden and keep only one visible
                    alone.setVisibility(View.GONE);
                    beg.setVisibility(View.GONE);
                    mid.setVisibility(View.GONE);
                    end.setVisibility(View.VISIBLE);

                }
            });
        } else if (extras.getInt("harf") == 11) {

            getSupportActionBar().setTitle("زَاي");

            alone.setText("ز");
            changeText.setText(position[0]);


            start.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    alone.setText("ز");
                    changeText.setText(position[0]);


                    //this will cause the other imageviews to be hidden and keep only one visible
                    alone.setVisibility(View.VISIBLE);
                    beg.setVisibility(View.GONE);
                    mid.setVisibility(View.GONE);
                    end.setVisibility(View.GONE);


                }
            });

            beginning.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    beg.setText("none");
                    changeText.setText(position[5]);


                    //this will cause the other imageviews to be hidden and keep only one visible
                    alone.setVisibility(View.GONE);
                    beg.setVisibility(View.VISIBLE);
                    mid.setVisibility(View.GONE);
                    end.setVisibility(View.GONE);

                }
            });
            middle.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    mid.setText("ـز");
                    changeText.setText(position[2]);


                    //this will cause the other imageviews to be hidden and keep only one visible
                    alone.setVisibility(View.GONE);
                    beg.setVisibility(View.GONE);
                    mid.setVisibility(View.VISIBLE);
                    end.setVisibility(View.GONE);

                }
            });
            ending.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    end.setText("ـز");
                    changeText.setText(position[3]);


                    //this will cause the other imageviews to be hidden and keep only one visible
                    alone.setVisibility(View.GONE);
                    beg.setVisibility(View.GONE);
                    mid.setVisibility(View.GONE);
                    end.setVisibility(View.VISIBLE);

                }
            });
        } else if (extras.getInt("harf") == 12) {

            getSupportActionBar().setTitle("سِين");

            alone.setText("س");
            changeText.setText(position[0]);


            start.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    alone.setText("س");
                    changeText.setText(position[0]);


                    //this will cause the other imageviews to be hidden and keep only one visible
                    alone.setVisibility(View.VISIBLE);
                    beg.setVisibility(View.GONE);
                    mid.setVisibility(View.GONE);
                    end.setVisibility(View.GONE);


                }
            });

            beginning.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    beg.setText("سـ");
                    changeText.setText(position[5]);


                    //this will cause the other imageviews to be hidden and keep only one visible
                    alone.setVisibility(View.GONE);
                    beg.setVisibility(View.VISIBLE);
                    mid.setVisibility(View.GONE);
                    end.setVisibility(View.GONE);

                }
            });
            middle.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    mid.setText("ـسـ");
                    changeText.setText(position[2]);


                    //this will cause the other imageviews to be hidden and keep only one visible
                    alone.setVisibility(View.GONE);
                    beg.setVisibility(View.GONE);
                    mid.setVisibility(View.VISIBLE);
                    end.setVisibility(View.GONE);

                }
            });
            ending.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    end.setText("ـس");
                    changeText.setText(position[3]);


                    //this will cause the other imageviews to be hidden and keep only one visible
                    alone.setVisibility(View.GONE);
                    beg.setVisibility(View.GONE);
                    mid.setVisibility(View.GONE);
                    end.setVisibility(View.VISIBLE);

                }
            });
        } else if (extras.getInt("harf") == 13) {

            getSupportActionBar().setTitle("شحين");

            alone.setText("ش");
            changeText.setText(position[0]);


            start.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    alone.setText("ش");
                    changeText.setText(position[0]);


                    //this will cause the other imageviews to be hidden and keep only one visible
                    alone.setVisibility(View.VISIBLE);
                    beg.setVisibility(View.GONE);
                    mid.setVisibility(View.GONE);
                    end.setVisibility(View.GONE);


                }
            });

            beginning.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    beg.setText("شـ");
                    changeText.setText(position[5]);


                    //this will cause the other imageviews to be hidden and keep only one visible
                    alone.setVisibility(View.GONE);
                    beg.setVisibility(View.VISIBLE);
                    mid.setVisibility(View.GONE);
                    end.setVisibility(View.GONE);

                }
            });
            middle.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    mid.setText("ـشـ ");
                    changeText.setText(position[2]);


                    //this will cause the other imageviews to be hidden and keep only one visible
                    alone.setVisibility(View.GONE);
                    beg.setVisibility(View.GONE);
                    mid.setVisibility(View.VISIBLE);
                    end.setVisibility(View.GONE);

                }
            });
            ending.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    end.setText("ـش");
                    changeText.setText(position[3]);


                    //this will cause the other imageviews to be hidden and keep only one visible
                    alone.setVisibility(View.GONE);
                    beg.setVisibility(View.GONE);
                    mid.setVisibility(View.GONE);
                    end.setVisibility(View.VISIBLE);

                }
            });
        }
        else if (extras.getInt("harf") == 14) {

            getSupportActionBar().setTitle("صَاد");

            alone.setText("ص");
            changeText.setText(position[0]);


            start.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    alone.setText("ص");
                    changeText.setText(position[0]);


                    //this will cause the other imageviews to be hidden and keep only one visible
                    alone.setVisibility(View.VISIBLE);
                    beg.setVisibility(View.GONE);
                    mid.setVisibility(View.GONE);
                    end.setVisibility(View.GONE);


                }
            });

            beginning.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    beg.setText("صـ");
                    changeText.setText(position[5]);


                    //this will cause the other imageviews to be hidden and keep only one visible
                    alone.setVisibility(View.GONE);
                    beg.setVisibility(View.VISIBLE);
                    mid.setVisibility(View.GONE);
                    end.setVisibility(View.GONE);

                }
            });
            middle.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    mid.setText("ـصـ");
                    changeText.setText(position[2]);


                    //this will cause the other imageviews to be hidden and keep only one visible
                    alone.setVisibility(View.GONE);
                    beg.setVisibility(View.GONE);
                    mid.setVisibility(View.VISIBLE);
                    end.setVisibility(View.GONE);

                }
            });
            ending.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    end.setText("ـص");
                    changeText.setText(position[3]);


                    //this will cause the other imageviews to be hidden and keep only one visible
                    alone.setVisibility(View.GONE);
                    beg.setVisibility(View.GONE);
                    mid.setVisibility(View.GONE);
                    end.setVisibility(View.VISIBLE);

                }
            });
        } else if (extras.getInt("harf") == 15) {

            getSupportActionBar().setTitle("صَاد");

            alone.setText("ض");
            changeText.setText(position[0]);


            start.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    alone.setText("ض");
                    changeText.setText(position[0]);


                    //this will cause the other imageviews to be hidden and keep only one visible
                    alone.setVisibility(View.VISIBLE);
                    beg.setVisibility(View.GONE);
                    mid.setVisibility(View.GONE);
                    end.setVisibility(View.GONE);


                }
            });

            beginning.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    beg.setText("ضـ");
                    changeText.setText(position[5]);


                    //this will cause the other imageviews to be hidden and keep only one visible
                    alone.setVisibility(View.GONE);
                    beg.setVisibility(View.VISIBLE);
                    mid.setVisibility(View.GONE);
                    end.setVisibility(View.GONE);

                }
            });
            middle.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    mid.setText("ـضـ");
                    changeText.setText(position[2]);


                    //this will cause the other imageviews to be hidden and keep only one visible
                    alone.setVisibility(View.GONE);
                    beg.setVisibility(View.GONE);
                    mid.setVisibility(View.VISIBLE);
                    end.setVisibility(View.GONE);

                }
            });
            ending.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    end.setText("ـض");
                    changeText.setText(position[3]);


                    //this will cause the other imageviews to be hidden and keep only one visible
                    alone.setVisibility(View.GONE);
                    beg.setVisibility(View.GONE);
                    mid.setVisibility(View.GONE);
                    end.setVisibility(View.VISIBLE);

                }
            });
        } else if (extras.getInt("harf") == 16) {

            getSupportActionBar().setTitle("طَاء");

            alone.setText("ط");
            changeText.setText(position[0]);


            start.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    alone.setText("ط");
                    changeText.setText(position[0]);


                    //this will cause the other imageviews to be hidden and keep only one visible
                    alone.setVisibility(View.VISIBLE);
                    beg.setVisibility(View.GONE);
                    mid.setVisibility(View.GONE);
                    end.setVisibility(View.GONE);


                }
            });

            beginning.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    beg.setText("طـ");
                    changeText.setText(position[5]);


                    //this will cause the other imageviews to be hidden and keep only one visible
                    alone.setVisibility(View.GONE);
                    beg.setVisibility(View.VISIBLE);
                    mid.setVisibility(View.GONE);
                    end.setVisibility(View.GONE);

                }
            });
            middle.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    mid.setText(" ـطـ ");
                    changeText.setText(position[2]);


                    //this will cause the other imageviews to be hidden and keep only one visible
                    alone.setVisibility(View.GONE);
                    beg.setVisibility(View.GONE);
                    mid.setVisibility(View.VISIBLE);
                    end.setVisibility(View.GONE);

                }
            });
            ending.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    end.setText("ـط");
                    changeText.setText(position[3]);


                    //this will cause the other imageviews to be hidden and keep only one visible
                    alone.setVisibility(View.GONE);
                    beg.setVisibility(View.GONE);
                    mid.setVisibility(View.GONE);
                    end.setVisibility(View.VISIBLE);

                }
            });
        } else if (extras.getInt("harf") == 17) {

            getSupportActionBar().setTitle("ظَاء");

            alone.setText("ظ");
            changeText.setText(position[0]);


            start.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    alone.setText("ظ");
                    changeText.setText(position[0]);


                    //this will cause the other imageviews to be hidden and keep only one visible
                    alone.setVisibility(View.VISIBLE);
                    beg.setVisibility(View.GONE);
                    mid.setVisibility(View.GONE);
                    end.setVisibility(View.GONE);


                }
            });

            beginning.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    beg.setText("ظـ");
                    changeText.setText(position[5]);


                    //this will cause the other imageviews to be hidden and keep only one visible
                    alone.setVisibility(View.GONE);
                    beg.setVisibility(View.VISIBLE);
                    mid.setVisibility(View.GONE);
                    end.setVisibility(View.GONE);

                }
            });
            middle.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    mid.setText("ـظـ");
                    changeText.setText(position[2]);


                    //this will cause the other imageviews to be hidden and keep only one visible
                    alone.setVisibility(View.GONE);
                    beg.setVisibility(View.GONE);
                    mid.setVisibility(View.VISIBLE);
                    end.setVisibility(View.GONE);

                }
            });
            ending.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    end.setText("ـظ");
                    changeText.setText(position[3]);


                    //this will cause the other imageviews to be hidden and keep only one visible
                    alone.setVisibility(View.GONE);
                    beg.setVisibility(View.GONE);
                    mid.setVisibility(View.GONE);
                    end.setVisibility(View.VISIBLE);

                }
            });
        } else if (extras.getInt("harf") == 18) {

            getSupportActionBar().setTitle("عَينٍ");

            alone.setText("ع");
            changeText.setText(position[0]);


            start.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    alone.setText("ع");
                    changeText.setText(position[0]);


                    //this will cause the other imageviews to be hidden and keep only one visible
                    alone.setVisibility(View.VISIBLE);
                    beg.setVisibility(View.GONE);
                    mid.setVisibility(View.GONE);
                    end.setVisibility(View.GONE);


                }
            });

            beginning.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    beg.setText("عـ");
                    changeText.setText(position[5]);


                    //this will cause the other imageviews to be hidden and keep only one visible
                    alone.setVisibility(View.GONE);
                    beg.setVisibility(View.VISIBLE);
                    mid.setVisibility(View.GONE);
                    end.setVisibility(View.GONE);

                }
            });
            middle.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    mid.setText("ـعـ");
                    changeText.setText(position[2]);


                    //this will cause the other imageviews to be hidden and keep only one visible
                    alone.setVisibility(View.GONE);
                    beg.setVisibility(View.GONE);
                    mid.setVisibility(View.VISIBLE);
                    end.setVisibility(View.GONE);

                }
            });
            ending.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    end.setText("ـع");
                    changeText.setText(position[3]);


                    //this will cause the other imageviews to be hidden and keep only one visible
                    alone.setVisibility(View.GONE);
                    beg.setVisibility(View.GONE);
                    mid.setVisibility(View.GONE);
                    end.setVisibility(View.VISIBLE);

                }
            });
        } else if (extras.getInt("harf") == 19) {

            getSupportActionBar().setTitle("غَين");

            alone.setText("غ");
            changeText.setText(position[0]);


            start.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    alone.setText("غ");
                    changeText.setText(position[0]);


                    //this will cause the other imageviews to be hidden and keep only one visible
                    alone.setVisibility(View.VISIBLE);
                    beg.setVisibility(View.GONE);
                    mid.setVisibility(View.GONE);
                    end.setVisibility(View.GONE);


                }
            });

            beginning.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    beg.setText("غـ");
                    changeText.setText(position[5]);


                    //this will cause the other imageviews to be hidden and keep only one visible
                    alone.setVisibility(View.GONE);
                    beg.setVisibility(View.VISIBLE);
                    mid.setVisibility(View.GONE);
                    end.setVisibility(View.GONE);

                }
            });
            middle.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    mid.setText("ـغـ");
                    changeText.setText(position[2]);


                    //this will cause the other imageviews to be hidden and keep only one visible
                    alone.setVisibility(View.GONE);
                    beg.setVisibility(View.GONE);
                    mid.setVisibility(View.VISIBLE);
                    end.setVisibility(View.GONE);

                }
            });
            ending.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    end.setText("ـغ");
                    changeText.setText(position[3]);


                    //this will cause the other imageviews to be hidden and keep only one visible
                    alone.setVisibility(View.GONE);
                    beg.setVisibility(View.GONE);
                    mid.setVisibility(View.GONE);
                    end.setVisibility(View.VISIBLE);

                }
            });
        }
        else if (extras.getInt("harf") == 20) {

            getSupportActionBar().setTitle("فَاء");

            alone.setText("ف");
            changeText.setText(position[0]);


            start.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    alone.setText("ف");
                    changeText.setText(position[0]);


                    //this will cause the other imageviews to be hidden and keep only one visible
                    alone.setVisibility(View.VISIBLE);
                    beg.setVisibility(View.GONE);
                    mid.setVisibility(View.GONE);
                    end.setVisibility(View.GONE);


                }
            });

            beginning.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    beg.setText("فـ ");
                    changeText.setText(position[5]);


                    //this will cause the other imageviews to be hidden and keep only one visible
                    alone.setVisibility(View.GONE);
                    beg.setVisibility(View.VISIBLE);
                    mid.setVisibility(View.GONE);
                    end.setVisibility(View.GONE);

                }
            });
            middle.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    mid.setText("ـفـ");
                    changeText.setText(position[2]);


                    //this will cause the other imageviews to be hidden and keep only one visible
                    alone.setVisibility(View.GONE);
                    beg.setVisibility(View.GONE);
                    mid.setVisibility(View.VISIBLE);
                    end.setVisibility(View.GONE);

                }
            });
            ending.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    end.setText("ـف");
                    changeText.setText(position[3]);


                    //this will cause the other imageviews to be hidden and keep only one visible
                    alone.setVisibility(View.GONE);
                    beg.setVisibility(View.GONE);
                    mid.setVisibility(View.GONE);
                    end.setVisibility(View.VISIBLE);

                }
            });
        } else if (extras.getInt("harf") == 21) {

            getSupportActionBar().setTitle("قَاف");

            alone.setText("ق");
            changeText.setText(position[0]);


            start.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    alone.setText("ق");
                    changeText.setText(position[0]);


                    //this will cause the other imageviews to be hidden and keep only one visible
                    alone.setVisibility(View.VISIBLE);
                    beg.setVisibility(View.GONE);
                    mid.setVisibility(View.GONE);
                    end.setVisibility(View.GONE);


                }
            });

            beginning.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    beg.setText("قـ");
                    changeText.setText(position[5]);


                    //this will cause the other imageviews to be hidden and keep only one visible
                    alone.setVisibility(View.GONE);
                    beg.setVisibility(View.VISIBLE);
                    mid.setVisibility(View.GONE);
                    end.setVisibility(View.GONE);

                }
            });
            middle.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    mid.setText("ـقـ");
                    changeText.setText(position[2]);


                    //this will cause the other imageviews to be hidden and keep only one visible
                    alone.setVisibility(View.GONE);
                    beg.setVisibility(View.GONE);
                    mid.setVisibility(View.VISIBLE);
                    end.setVisibility(View.GONE);

                }
            });
            ending.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    end.setText("ـق");
                    changeText.setText(position[3]);


                    //this will cause the other imageviews to be hidden and keep only one visible
                    alone.setVisibility(View.GONE);
                    beg.setVisibility(View.GONE);
                    mid.setVisibility(View.GONE);
                    end.setVisibility(View.VISIBLE);

                }
            });
        } else if (extras.getInt("harf") == 22) {

            getSupportActionBar().setTitle("كَاف");

            alone.setText("ك");
            changeText.setText(position[0]);


            start.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    alone.setText("ك");
                    changeText.setText(position[0]);


                    //this will cause the other imageviews to be hidden and keep only one visible
                    alone.setVisibility(View.VISIBLE);
                    beg.setVisibility(View.GONE);
                    mid.setVisibility(View.GONE);
                    end.setVisibility(View.GONE);


                }
            });

            beginning.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    beg.setText("كـ");
                    changeText.setText(position[5]);


                    //this will cause the other imageviews to be hidden and keep only one visible
                    alone.setVisibility(View.GONE);
                    beg.setVisibility(View.VISIBLE);
                    mid.setVisibility(View.GONE);
                    end.setVisibility(View.GONE);

                }
            });
            middle.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    mid.setText("ـكـ");
                    changeText.setText(position[2]);


                    //this will cause the other imageviews to be hidden and keep only one visible
                    alone.setVisibility(View.GONE);
                    beg.setVisibility(View.GONE);
                    mid.setVisibility(View.VISIBLE);
                    end.setVisibility(View.GONE);

                }
            });
            ending.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    end.setText("ـك");
                    changeText.setText(position[3]);


                    //this will cause the other imageviews to be hidden and keep only one visible
                    alone.setVisibility(View.GONE);
                    beg.setVisibility(View.GONE);
                    mid.setVisibility(View.GONE);
                    end.setVisibility(View.VISIBLE);

                }
            });
        } else if (extras.getInt("harf") == 23) {

            getSupportActionBar().setTitle("لاَم");

            alone.setText("ل");
            changeText.setText(position[0]);


            start.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    alone.setText("ل");
                    changeText.setText(position[0]);


                    //this will cause the other imageviews to be hidden and keep only one visible
                    alone.setVisibility(View.VISIBLE);
                    beg.setVisibility(View.GONE);
                    mid.setVisibility(View.GONE);
                    end.setVisibility(View.GONE);


                }
            });

            beginning.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    beg.setText("لـ");
                    changeText.setText(position[5]);


                    //this will cause the other imageviews to be hidden and keep only one visible
                    alone.setVisibility(View.GONE);
                    beg.setVisibility(View.VISIBLE);
                    mid.setVisibility(View.GONE);
                    end.setVisibility(View.GONE);

                }
            });
            middle.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    mid.setText("ـلـ");
                    changeText.setText(position[2]);


                    //this will cause the other imageviews to be hidden and keep only one visible
                    alone.setVisibility(View.GONE);
                    beg.setVisibility(View.GONE);
                    mid.setVisibility(View.VISIBLE);
                    end.setVisibility(View.GONE);

                }
            });
            ending.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    end.setText("ـل");
                    changeText.setText(position[3]);


                    //this will cause the other imageviews to be hidden and keep only one visible
                    alone.setVisibility(View.GONE);
                    beg.setVisibility(View.GONE);
                    mid.setVisibility(View.GONE);
                    end.setVisibility(View.VISIBLE);

                }
            });
        } else if (extras.getInt("harf") == 24) {

            getSupportActionBar().setTitle("مِيم");

            alone.setText("م");
            changeText.setText(position[0]);


            start.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    alone.setText("م");
                    changeText.setText(position[0]);


                    //this will cause the other imageviews to be hidden and keep only one visible
                    alone.setVisibility(View.VISIBLE);
                    beg.setVisibility(View.GONE);
                    mid.setVisibility(View.GONE);
                    end.setVisibility(View.GONE);


                }
            });

            beginning.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    beg.setText("مـ");
                    changeText.setText(position[5]);


                    //this will cause the other imageviews to be hidden and keep only one visible
                    alone.setVisibility(View.GONE);
                    beg.setVisibility(View.VISIBLE);
                    mid.setVisibility(View.GONE);
                    end.setVisibility(View.GONE);

                }
            });
            middle.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    mid.setText("ـمـ");
                    changeText.setText(position[2]);


                    //this will cause the other imageviews to be hidden and keep only one visible
                    alone.setVisibility(View.GONE);
                    beg.setVisibility(View.GONE);
                    mid.setVisibility(View.VISIBLE);
                    end.setVisibility(View.GONE);

                }
            });
            ending.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    end.setText("ـم");
                    changeText.setText(position[3]);


                    //this will cause the other imageviews to be hidden and keep only one visible
                    alone.setVisibility(View.GONE);
                    beg.setVisibility(View.GONE);
                    mid.setVisibility(View.GONE);
                    end.setVisibility(View.VISIBLE);

                }
            });
        } else if (extras.getInt("harf") == 25) {

            getSupportActionBar().setTitle("نُون");

            alone.setText("ن");
            changeText.setText(position[0]);


            start.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    alone.setText("ن");
                    changeText.setText(position[0]);


                    //this will cause the other imageviews to be hidden and keep only one visible
                    alone.setVisibility(View.VISIBLE);
                    beg.setVisibility(View.GONE);
                    mid.setVisibility(View.GONE);
                    end.setVisibility(View.GONE);


                }
            });

            beginning.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    beg.setText("نـ");
                    changeText.setText(position[5]);


                    //this will cause the other imageviews to be hidden and keep only one visible
                    alone.setVisibility(View.GONE);
                    beg.setVisibility(View.VISIBLE);
                    mid.setVisibility(View.GONE);
                    end.setVisibility(View.GONE);

                }
            });
            middle.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    mid.setText("ـنـ");
                    changeText.setText(position[2]);


                    //this will cause the other imageviews to be hidden and keep only one visible
                    alone.setVisibility(View.GONE);
                    beg.setVisibility(View.GONE);
                    mid.setVisibility(View.VISIBLE);
                    end.setVisibility(View.GONE);

                }
            });
            ending.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    end.setText("ـن");
                    changeText.setText(position[3]);


                    //this will cause the other imageviews to be hidden and keep only one visible
                    alone.setVisibility(View.GONE);
                    beg.setVisibility(View.GONE);
                    mid.setVisibility(View.GONE);
                    end.setVisibility(View.VISIBLE);

                }
            });
        }
        else if (extras.getInt("harf") == 26) {

            getSupportActionBar().setTitle("وَاو");

            alone.setText("و");
            changeText.setText(position[0]);


            start.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    alone.setText("و");
                    changeText.setText(position[0]);


                    //this will cause the other imageviews to be hidden and keep only one visible
                    alone.setVisibility(View.VISIBLE);
                    beg.setVisibility(View.GONE);
                    mid.setVisibility(View.GONE);
                    end.setVisibility(View.GONE);


                }
            });

            beginning.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    beg.setText("none");
                    changeText.setText(position[5]);


                    //this will cause the other imageviews to be hidden and keep only one visible
                    alone.setVisibility(View.GONE);
                    beg.setVisibility(View.VISIBLE);
                    mid.setVisibility(View.GONE);
                    end.setVisibility(View.GONE);

                }
            });
            middle.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    mid.setText("ـو");
                    changeText.setText(position[2]);


                    //this will cause the other imageviews to be hidden and keep only one visible
                    alone.setVisibility(View.GONE);
                    beg.setVisibility(View.GONE);
                    mid.setVisibility(View.VISIBLE);
                    end.setVisibility(View.GONE);

                }
            });
            ending.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    end.setText("ـو");
                    changeText.setText(position[3]);


                    //this will cause the other imageviews to be hidden and keep only one visible
                    alone.setVisibility(View.GONE);
                    beg.setVisibility(View.GONE);
                    mid.setVisibility(View.GONE);
                    end.setVisibility(View.VISIBLE);

                }
            });
        } else if (extras.getInt("harf") == 27) {

            getSupportActionBar().setTitle("هَاء");

            alone.setText("ه");
            changeText.setText(position[0]);


            start.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    alone.setText("ه");
                    changeText.setText(position[0]);


                    //this will cause the other imageviews to be hidden and keep only one visible
                    alone.setVisibility(View.VISIBLE);
                    beg.setVisibility(View.GONE);
                    mid.setVisibility(View.GONE);
                    end.setVisibility(View.GONE);


                }
            });

            beginning.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    beg.setText("هـ");
                    changeText.setText(position[5]);


                    //this will cause the other imageviews to be hidden and keep only one visible
                    alone.setVisibility(View.GONE);
                    beg.setVisibility(View.VISIBLE);
                    mid.setVisibility(View.GONE);
                    end.setVisibility(View.GONE);

                }
            });
            middle.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    mid.setText("ـهـ");
                    changeText.setText(position[2]);


                    //this will cause the other imageviews to be hidden and keep only one visible
                    alone.setVisibility(View.GONE);
                    beg.setVisibility(View.GONE);
                    mid.setVisibility(View.VISIBLE);
                    end.setVisibility(View.GONE);

                }
            });
            ending.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    end.setText("ـه");
                    changeText.setText(position[3]);


                    //this will cause the other imageviews to be hidden and keep only one visible
                    alone.setVisibility(View.GONE);
                    beg.setVisibility(View.GONE);
                    mid.setVisibility(View.GONE);
                    end.setVisibility(View.VISIBLE);

                }
            });
        } else if (extras.getInt("harf") == 28) {

            getSupportActionBar().setTitle("هَمزَة");

            alone.setText("ء");
            changeText.setText(position[0]);


            start.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    alone.setText("ء");
                    changeText.setText(position[0]);


                    //this will cause the other imageviews to be hidden and keep only one visible
                    alone.setVisibility(View.VISIBLE);
                    beg.setVisibility(View.GONE);
                    mid.setVisibility(View.GONE);
                    end.setVisibility(View.GONE);


                }
            });

            beginning.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    beg.setText("ءاأإٱئـ");
                    changeText.setText(position[5]);


                    //this will cause the other imageviews to be hidden and keep only one visible
                    alone.setVisibility(View.GONE);
                    beg.setVisibility(View.VISIBLE);
                    mid.setVisibility(View.GONE);
                    end.setVisibility(View.GONE);

                }
            });
            middle.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    mid.setText("ـئـ ـأ ـإ");
                    changeText.setText(position[2]);


                    //this will cause the other imageviews to be hidden and keep only one visible
                    alone.setVisibility(View.GONE);
                    beg.setVisibility(View.GONE);
                    mid.setVisibility(View.VISIBLE);
                    end.setVisibility(View.GONE);

                }
            });
            ending.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    end.setText("ـئ ـؤـإ ـأ ");
                    changeText.setText(position[3]);


                    //this will cause the other imageviews to be hidden and keep only one visible
                    alone.setVisibility(View.GONE);
                    beg.setVisibility(View.GONE);
                    mid.setVisibility(View.GONE);
                    end.setVisibility(View.VISIBLE);

                }
            });
        } else if (extras.getInt("harf") == 29) {

            getSupportActionBar().setTitle("يَاء");

            alone.setText("ي");
            changeText.setText(position[0]);


            start.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    alone.setText("ي");
                    changeText.setText(position[0]);


                    //this will cause the other imageviews to be hidden and keep only one visible
                    alone.setVisibility(View.VISIBLE);
                    beg.setVisibility(View.GONE);
                    mid.setVisibility(View.GONE);
                    end.setVisibility(View.GONE);


                }
            });

            beginning.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    beg.setText("يـ");
                    changeText.setText(position[5]);


                    //this will cause the other imageviews to be hidden and keep only one visible
                    alone.setVisibility(View.GONE);
                    beg.setVisibility(View.VISIBLE);
                    mid.setVisibility(View.GONE);
                    end.setVisibility(View.GONE);

                }
            });
            middle.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    mid.setText("ـيـ");
                    changeText.setText(position[2]);


                    //this will cause the other imageviews to be hidden and keep only one visible
                    alone.setVisibility(View.GONE);
                    beg.setVisibility(View.GONE);
                    mid.setVisibility(View.VISIBLE);
                    end.setVisibility(View.GONE);

                }
            });
            ending.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    end.setText("ـي");
                    changeText.setText(position[3]);


                    //this will cause the other imageviews to be hidden and keep only one visible
                    alone.setVisibility(View.GONE);
                    beg.setVisibility(View.GONE);
                    mid.setVisibility(View.GONE);
                    end.setVisibility(View.VISIBLE);

                }
            });
        }


    }

    public boolean onOptionsItemSelected(MenuItem item) {
        Intent myIntent = new Intent(getApplicationContext(), MainActivity.class);
        startActivityForResult(myIntent, 0);
        return true;

    }


}




