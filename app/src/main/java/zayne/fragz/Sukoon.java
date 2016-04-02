package zayne.fragz;


import android.content.Intent;
import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.Toast;

import zayne.foundationsfinal.HuroofDescript;
import zayne.foundationsfinal.R;
import zayne.foundationsfinal.SukoonDescrip;

/**
 * A simple {@link Fragment} subclass.
 */
public class Sukoon extends Fragment {

    ImageButton alif, ba, ta, tha, jeem, ha,
            kha, da, dha, ra, za, seen, sheen, saad, daad, taah,
            dhaa, ayn, ghayn, fa, qaf, kaf, lam, meem, noon, wow, haa, hamza, ya;


    public Sukoon() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View huroof = inflater.inflate(R.layout.fragment_sukoon, container, false);

        Toast.makeText(huroof.getContext(), "Please click on the letters to hear how they are pronounced.", Toast.LENGTH_SHORT).show();



        ba = (ImageButton) huroof.findViewById(R.id.baButton);


        ba.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(view.getContext(), SukoonDescrip.class);
                i.putExtra("harf", 2);


                startActivity(i);

            }

        });
        ta = (ImageButton) huroof.findViewById(R.id.taButton);


        ta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(view.getContext(), SukoonDescrip.class);
                i.putExtra("harf", 3);


                startActivity(i);

            }

        });
        tha = (ImageButton) huroof.findViewById(R.id.thaButton);


        tha.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(view.getContext(), SukoonDescrip.class);
                i.putExtra("harf", 4);


                startActivity(i);

            }

        });

        jeem = (ImageButton) huroof.findViewById(R.id.jeemButton);


        jeem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(view.getContext(), SukoonDescrip.class);
                i.putExtra("harf", 5);


                startActivity(i);

            }

        });
        ha = (ImageButton) huroof.findViewById(R.id.haButton);


        ha.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(view.getContext(), SukoonDescrip.class);
                i.putExtra("harf", 6);


                startActivity(i);

            }

        });
        kha = (ImageButton) huroof.findViewById(R.id.khaButton);


        kha.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(view.getContext(), SukoonDescrip.class);
                i.putExtra("harf", 7);


                startActivity(i);

            }

        });

        da = (ImageButton) huroof.findViewById(R.id.daButton);


        da.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(view.getContext(), SukoonDescrip.class);
                i.putExtra("harf", 8);


                startActivity(i);

            }

        });

        dha = (ImageButton) huroof.findViewById(R.id.dhaButton);


        dha.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(view.getContext(), SukoonDescrip.class);
                i.putExtra("harf", 9);


                startActivity(i);

            }

        });

        ra = (ImageButton) huroof.findViewById(R.id.raButton);


        ra.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(view.getContext(), SukoonDescrip.class);
                i.putExtra("harf", 10);


                startActivity(i);

            }

        });

        za = (ImageButton) huroof.findViewById(R.id.zaButton);


        za.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(view.getContext(), SukoonDescrip.class);
                i.putExtra("harf", 11);


                startActivity(i);

            }

        });

        seen = (ImageButton) huroof.findViewById(R.id.seenButton);


        seen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(view.getContext(), SukoonDescrip.class);
                i.putExtra("harf", 12);


                startActivity(i);

            }

        });

        sheen = (ImageButton) huroof.findViewById(R.id.sheenButton);


        sheen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(view.getContext(), SukoonDescrip.class);
                i.putExtra("harf", 13);


                startActivity(i);

            }

        });
        saad = (ImageButton) huroof.findViewById(R.id.saadButton);


        saad.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(view.getContext(), SukoonDescrip.class);
                i.putExtra("harf", 14);


                startActivity(i);

            }

        });

        daad = (ImageButton) huroof.findViewById(R.id.daadButton);


        daad.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(view.getContext(), SukoonDescrip.class);
                i.putExtra("harf", 15);


                startActivity(i);

            }

        });
        taah = (ImageButton) huroof.findViewById(R.id.tahButton);


        taah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(view.getContext(), SukoonDescrip.class);
                i.putExtra("harf", 16);


                startActivity(i);

            }

        });

        dhaa = (ImageButton) huroof.findViewById(R.id.dhaaButton);


        dhaa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(view.getContext(), SukoonDescrip.class);
                i.putExtra("harf", 17);


                startActivity(i);

            }

        });

        ayn = (ImageButton) huroof.findViewById(R.id.aynButton);


        ayn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(view.getContext(), SukoonDescrip.class);
                i.putExtra("harf", 18);


                startActivity(i);

            }

        });

        ghayn = (ImageButton) huroof.findViewById(R.id.ghaynButton);


        ghayn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(view.getContext(), SukoonDescrip.class);
                i.putExtra("harf", 19);


                startActivity(i);

            }

        });

        fa = (ImageButton) huroof.findViewById(R.id.faButton);


        fa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(view.getContext(), SukoonDescrip.class);
                i.putExtra("harf", 20);


                startActivity(i);

            }

        });

        qaf = (ImageButton) huroof.findViewById(R.id.qafButton);


        qaf.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(view.getContext(), SukoonDescrip.class);
                i.putExtra("harf", 21);


                startActivity(i);

            }

        });

        kaf = (ImageButton) huroof.findViewById(R.id.kafButton);


        kaf.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(view.getContext(), SukoonDescrip.class);
                i.putExtra("harf", 22);


                startActivity(i);

            }

        });
        lam = (ImageButton) huroof.findViewById(R.id.lamButton);


        lam.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(view.getContext(), SukoonDescrip.class);
                i.putExtra("harf", 23);


                startActivity(i);

            }

        });
        meem = (ImageButton) huroof.findViewById(R.id.meemButton);


        meem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(view.getContext(), SukoonDescrip.class);
                i.putExtra("harf", 24);


                startActivity(i);

            }

        });
        noon = (ImageButton) huroof.findViewById(R.id.noonButton);


        noon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(view.getContext(), SukoonDescrip.class);
                i.putExtra("harf", 25);


                startActivity(i);

            }

        });
        wow = (ImageButton) huroof.findViewById(R.id.wowButton);


        wow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(view.getContext(), SukoonDescrip.class);
                i.putExtra("harf", 26);


                startActivity(i);

            }

        });
        haa = (ImageButton) huroof.findViewById(R.id.haaButton);


        haa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(view.getContext(), SukoonDescrip.class);
                i.putExtra("harf", 27);


                startActivity(i);

            }

        });
        hamza = (ImageButton) huroof.findViewById(R.id.hamzaButton);


        hamza.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(view.getContext(), SukoonDescrip.class);
                i.putExtra("harf", 28);


                startActivity(i);

            }

        });
        ya = (ImageButton) huroof.findViewById(R.id.yaButton);


        ya.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(view.getContext(), SukoonDescrip.class);
                i.putExtra("harf", 29);


                startActivity(i);

            }

        });

        return huroof;
    }

}
