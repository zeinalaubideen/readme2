package zayne.foundationsfinal;

import android.content.Context;
import android.media.AudioManager;
import android.media.SoundPool;
import android.view.View;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by zein on 4/4/16.
 */
public class SoundLoader {

    private Context context;

    private SoundPool harf;
    private TextView t1, t2,t3;

    private int sound1, sound2, sound3;

    private ArrayList<Integer> soundID;

    public SoundLoader(Context c,TextView tv1, TextView tv2, TextView tv3, int s1, int s2, int s3){
        context = c;
        t1= tv1;
        t2 = tv2;
        t3 = tv3;

        sound1 = s1;
        sound2 = s2;
        sound3 = s3;
        soundID = new ArrayList<>();

    }

    public SoundLoader(Context c , TextView tv1, int s1){
        context = c;
        t1 = tv1;
        sound1 = s1;
    }

    public void play(){
        harf = new SoundPool(1, AudioManager.STREAM_MUSIC, 0);
        final int a = harf.load(context, sound1, 1);
        final int b = harf.load(context, sound2, 1);
        final int c = harf.load(context, sound3, 1);

        soundID.add(a);
        soundID.add(b);
        soundID.add(c);



        t1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                harf.play(a, 1, 1, 1, 0, 1);
            }
        });
        t2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                harf.play(b, 1, 1, 1, 0, 1);
            }
        });
        t3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                harf.play(c, 1, 1, 1, 0, 1);
            }
        });

    }

    public void playTwo(){
        harf = new SoundPool(1, AudioManager.STREAM_MUSIC, 0);
        final int a = harf.load(context, sound1, 1);
        final int b = harf.load(context, sound2, 1);

        soundID.add(a);
        soundID.add(b);





        t1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                harf.play(a, 1, 1, 1, 0, 1);
            }
        });
        t2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                harf.play(b, 1, 1, 1, 0, 1);
            }
        });


    }
    public void playOne()
    {

        harf = new SoundPool(1, AudioManager.STREAM_MUSIC, 0);

        final int a = harf.load(context, sound1, 1);

        //soundID.add(a);


        t1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                harf.play(a, 1, 1, 1, 0, 1);
            }
        });

    }

    public void unload(){

        for(int i =0; i < soundID.size(); i++){
            ;
            harf.unload(soundID.get(i));
        }

    }

}
