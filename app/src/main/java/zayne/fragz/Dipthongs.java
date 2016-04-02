package zayne.fragz;

import android.content.Intent;
import android.os.Bundle;
import android.app.Fragment;
import android.support.design.widget.Snackbar;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.Toast;
import android.widget.Toolbar;

import zayne.foundationsfinal.DipthongsN;
import zayne.foundationsfinal.R;


public class Dipthongs extends Fragment {

    ImageButton alif, ba, ta, tha, jeem, ha,
            kha, da, dha, ra, za, seen, sheen, saad, daad, taah,
            dhaa, ayn, ghayn, fa, qaf, kaf, lam, meem, noon, wow, haa, hamza, ya;

    private RelativeLayout mRoot;
    private boolean hint;




    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View huroof = inflater.inflate(R.layout.fragment_dipthongs, container, false);
       // Toolbar toolbar = (Toolbar)getActivity().findViewById(R.id.toolbar);




        Bundle bundle = getArguments();

        if(bundle != null){
            hint = bundle.getBoolean("hints");
        }



        if(hint){
        Toast.makeText(huroof.getContext(), "Click on a letter to view pronounciation", Toast.LENGTH_SHORT).show();}




        alif = (ImageButton) huroof.findViewById(R.id.alifButton);


        alif.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(view.getContext(), DipthongsN.class);
                i.putExtra("harf", 1);


                startActivity(i);

            }

        });


        ba = (ImageButton) huroof.findViewById(R.id.baButton);


        ba.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(view.getContext(), DipthongsN.class);
                i.putExtra("harf", 2);


                startActivity(i);

            }

        });
        ta = (ImageButton) huroof.findViewById(R.id.taButton);


        ta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(view.getContext(), DipthongsN.class);
                i.putExtra("harf", 3);


                startActivity(i);

            }

        });
        tha = (ImageButton) huroof.findViewById(R.id.thaButton);


        tha.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(view.getContext(), DipthongsN.class);
                i.putExtra("harf", 4);


                startActivity(i);

            }

        });

        jeem = (ImageButton) huroof.findViewById(R.id.jeemButton);


        jeem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(view.getContext(), DipthongsN.class);
                i.putExtra("harf", 5);


                startActivity(i);

            }

        });
        ha = (ImageButton) huroof.findViewById(R.id.haButton);


        ha.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(view.getContext(), DipthongsN.class);
                i.putExtra("harf", 6);


                startActivity(i);

            }

        });
        kha = (ImageButton) huroof.findViewById(R.id.khaButton);


        kha.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(view.getContext(), DipthongsN.class);
                i.putExtra("harf", 7);


                startActivity(i);

            }

        });

        da = (ImageButton) huroof.findViewById(R.id.daButton);


        da.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(view.getContext(), DipthongsN.class);
                i.putExtra("harf", 8);


                startActivity(i);

            }

        });

        dha = (ImageButton) huroof.findViewById(R.id.dhaButton);


        dha.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(view.getContext(), DipthongsN.class);
                i.putExtra("harf", 9);


                startActivity(i);

            }

        });

        ra = (ImageButton) huroof.findViewById(R.id.raButton);


        ra.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(view.getContext(), DipthongsN.class);
                i.putExtra("harf", 10);


                startActivity(i);

            }

        });

        za = (ImageButton) huroof.findViewById(R.id.zaButton);


        za.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(view.getContext(), DipthongsN.class);
                i.putExtra("harf", 11);


                startActivity(i);

            }

        });

        seen = (ImageButton) huroof.findViewById(R.id.seenButton);


        seen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(view.getContext(), DipthongsN.class);
                i.putExtra("harf", 12);


                startActivity(i);

            }

        });

        sheen = (ImageButton) huroof.findViewById(R.id.sheenButton);


        sheen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(view.getContext(), DipthongsN.class);
                i.putExtra("harf", 13);


                startActivity(i);

            }

        });
        saad = (ImageButton) huroof.findViewById(R.id.saadButton);


        saad.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(view.getContext(), DipthongsN.class);
                i.putExtra("harf", 14);


                startActivity(i);

            }

        });

        daad = (ImageButton) huroof.findViewById(R.id.daadButton);


        daad.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(view.getContext(), DipthongsN.class);
                i.putExtra("harf", 15);


                startActivity(i);

            }

        });
        taah = (ImageButton) huroof.findViewById(R.id.tahButton);


        taah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(view.getContext(), DipthongsN.class);
                i.putExtra("harf", 16);


                startActivity(i);

            }

        });

        dhaa = (ImageButton) huroof.findViewById(R.id.dhaaButton);


        dhaa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(view.getContext(), DipthongsN.class);
                i.putExtra("harf", 17);


                startActivity(i);

            }

        });

        ayn = (ImageButton) huroof.findViewById(R.id.aynButton);


        ayn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(view.getContext(), DipthongsN.class);
                i.putExtra("harf", 18);


                startActivity(i);

            }

        });

        ghayn = (ImageButton) huroof.findViewById(R.id.ghaynButton);


        ghayn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(view.getContext(), DipthongsN.class);
                i.putExtra("harf", 19);


                startActivity(i);

            }

        });

        fa = (ImageButton) huroof.findViewById(R.id.faButton);


        fa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(view.getContext(), DipthongsN.class);
                i.putExtra("harf", 20);


                startActivity(i);

            }

        });

        qaf = (ImageButton) huroof.findViewById(R.id.qafButton);


        qaf.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(view.getContext(), DipthongsN.class);
                i.putExtra("harf", 21);


                startActivity(i);

            }

        });

        kaf = (ImageButton) huroof.findViewById(R.id.kafButton);


        kaf.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(view.getContext(), DipthongsN.class);
                i.putExtra("harf", 22);


                startActivity(i);

            }

        });
        lam = (ImageButton) huroof.findViewById(R.id.lamButton);


        lam.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(view.getContext(), DipthongsN.class);
                i.putExtra("harf", 23);


                startActivity(i);

            }

        });
        meem = (ImageButton) huroof.findViewById(R.id.meemButton);


        meem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(view.getContext(), DipthongsN.class);
                i.putExtra("harf", 24);


                startActivity(i);

            }

        });
        noon = (ImageButton) huroof.findViewById(R.id.noonButton);


        noon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(view.getContext(), DipthongsN.class);
                i.putExtra("harf", 25);


                startActivity(i);

            }

        });
        wow = (ImageButton) huroof.findViewById(R.id.wowButton);


        wow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(view.getContext(), DipthongsN.class);
                i.putExtra("harf", 26);


                startActivity(i);

            }

        });
        haa = (ImageButton) huroof.findViewById(R.id.haaButton);


        haa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(view.getContext(), DipthongsN.class);
                i.putExtra("harf", 27);


                startActivity(i);

            }

        });
        hamza = (ImageButton) huroof.findViewById(R.id.hamzaButton);


        hamza.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(view.getContext(), DipthongsN.class);
                i.putExtra("harf", 28);


                startActivity(i);

            }

        });
        ya = (ImageButton) huroof.findViewById(R.id.yaButton);


        ya.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(view.getContext(), DipthongsN.class);
                i.putExtra("harf", 29);


                startActivity(i);

            }

        });
        return huroof;

    }

}
