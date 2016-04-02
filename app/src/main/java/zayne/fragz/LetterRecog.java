package zayne.fragz;

import android.content.Intent;
import android.os.Bundle;
import android.app.Fragment;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.Toast;

import zayne.Harf.HarfForm;
import zayne.foundationsfinal.HuroofDescript;
import zayne.foundationsfinal.R;


public class LetterRecog extends Fragment {

    private ImageView alif, ba, ta, tha, jeem, ha,
            kha, da, dha, ra, za, seen, sheen, saad, daad, taah,
            dhaa, ayn, ghayn, fa, qaf, kaf, lam, meem, noon, wow, haa, hamza, ya;
    ;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View letters = inflater.inflate(R.layout.fragment_letter_recog, container, false);

        Toast.makeText(letters.getContext(), "Please click on the letters to see the different forms theytake on.", Toast.LENGTH_SHORT).show();


        alif = (ImageView) letters.findViewById(R.id.alifButton);


        alif.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(view.getContext(), HarfForm.class);
                i.putExtra("harf", 1);


                startActivity(i);

            }

        });
        ba = (ImageView) letters.findViewById(R.id.baButton);


        ba.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(view.getContext(), HarfForm.class);
                i.putExtra("harf", 2);


                startActivity(i);

            }

        });
        ta = (ImageView) letters.findViewById(R.id.taButton);


        ta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(view.getContext(), HarfForm.class);
                i.putExtra("harf", 3);


                startActivity(i);

            }

        });
        tha = (ImageView) letters.findViewById(R.id.thaButton);


        tha.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(view.getContext(), HarfForm.class);
                i.putExtra("harf", 4);


                startActivity(i);

            }

        });

        jeem = (ImageView) letters.findViewById(R.id.jeemButton);


        jeem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(view.getContext(), HarfForm.class);
                i.putExtra("harf", 5);


                startActivity(i);

            }

        });
        ha = (ImageView) letters.findViewById(R.id.haButton);


        ha.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(view.getContext(), HarfForm.class);
                i.putExtra("harf", 6);


                startActivity(i);

            }

        });
        kha = (ImageView) letters.findViewById(R.id.khaButton);


        kha.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(view.getContext(), HarfForm.class);
                i.putExtra("harf", 7);


                startActivity(i);

            }

        });

        da = (ImageView) letters.findViewById(R.id.daButton);


        da.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(view.getContext(), HarfForm.class);
                i.putExtra("harf", 8);


                startActivity(i);

            }

        });

        dha = (ImageView) letters.findViewById(R.id.dhaButton);


        dha.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(view.getContext(), HarfForm.class);
                i.putExtra("harf", 9);


                startActivity(i);

            }

        });

        ra = (ImageView) letters.findViewById(R.id.raButton);


        ra.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(view.getContext(), HarfForm.class);
                i.putExtra("harf", 10);


                startActivity(i);

            }

        });

        za = (ImageView) letters.findViewById(R.id.zaButton);


        za.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(view.getContext(), HarfForm.class);
                i.putExtra("harf", 11);


                startActivity(i);

            }

        });

        seen = (ImageView) letters.findViewById(R.id.seenButton);


        seen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(view.getContext(), HarfForm.class);
                i.putExtra("harf", 12);


                startActivity(i);

            }

        });

        sheen = (ImageView) letters.findViewById(R.id.sheenButton);


        sheen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(view.getContext(), HarfForm.class);
                i.putExtra("harf", 13);


                startActivity(i);

            }

        });
        saad = (ImageView) letters.findViewById(R.id.saadButton);


        saad.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(view.getContext(), HarfForm.class);
                i.putExtra("harf", 14);


                startActivity(i);

            }

        });

        daad = (ImageView) letters.findViewById(R.id.daadButton);


        daad.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(view.getContext(), HarfForm.class);
                i.putExtra("harf", 15);


                startActivity(i);

            }

        });
        taah = (ImageView) letters.findViewById(R.id.tahButton);


        taah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(view.getContext(), HarfForm.class);
                i.putExtra("harf", 16);


                startActivity(i);

            }

        });

        dhaa = (ImageView) letters.findViewById(R.id.dhaaButton);


        dhaa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(view.getContext(), HarfForm.class);
                i.putExtra("harf", 17);


                startActivity(i);

            }

        });

        ayn = (ImageView) letters.findViewById(R.id.aynButton);


        ayn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(view.getContext(), HarfForm.class);
                i.putExtra("harf", 18);


                startActivity(i);

            }

        });

        ghayn = (ImageView) letters.findViewById(R.id.ghaynButton);


        ghayn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(view.getContext(), HarfForm.class);
                i.putExtra("harf", 19);


                startActivity(i);

            }

        });

        fa = (ImageView) letters.findViewById(R.id.faButton);


        fa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(view.getContext(), HarfForm.class);
                i.putExtra("harf", 20);


                startActivity(i);

            }

        });

        qaf = (ImageView) letters.findViewById(R.id.qafButton);


        qaf.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(view.getContext(), HarfForm.class);
                i.putExtra("harf", 21);


                startActivity(i);

            }

        });

        kaf = (ImageView) letters.findViewById(R.id.kafButton);


        kaf.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(view.getContext(), HarfForm.class);
                i.putExtra("harf", 22);


                startActivity(i);

            }

        });
        lam = (ImageView) letters.findViewById(R.id.lamButton);


        lam.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(view.getContext(), HarfForm.class);
                i.putExtra("harf", 23);


                startActivity(i);

            }

        });
        meem = (ImageView) letters.findViewById(R.id.meemButton);


        meem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(view.getContext(), HarfForm.class);
                i.putExtra("harf", 24);


                startActivity(i);

            }

        });
        noon = (ImageView) letters.findViewById(R.id.noonButton);


        noon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(view.getContext(), HarfForm.class);
                i.putExtra("harf", 25);


                startActivity(i);

            }

        });
        wow = (ImageView) letters.findViewById(R.id.wowButton);


        wow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(view.getContext(), HarfForm.class);
                i.putExtra("harf", 26);


                startActivity(i);

            }

        });
        haa = (ImageView) letters.findViewById(R.id.haaButton);


        haa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(view.getContext(), HarfForm.class);
                i.putExtra("harf", 27);


                startActivity(i);

            }

        });
        hamza = (ImageView) letters.findViewById(R.id.hamzaButton);


        hamza.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(view.getContext(), HarfForm.class);
                i.putExtra("harf", 28);


                startActivity(i);

            }

        });
        ya = (ImageView) letters.findViewById(R.id.yaButton);


        ya.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(view.getContext(), HarfForm.class);
                i.putExtra("harf", 29);


                startActivity(i);

            }

        });

        return letters;
    }



}
