package zayne.foundationsfinal;

import android.app.Fragment;
import android.app.FragmentManager;
import android.content.ClipData;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import java.util.List;
import java.util.Stack;

import zayne.Harf.HarfForm;
import zayne.fragz.Dipthongs;
import zayne.fragz.Huroof;
import zayne.fragz.Intro;
import zayne.fragz.LamRules;
import zayne.fragz.LetterRecog;
import zayne.fragz.LongVowels;
import zayne.fragz.Mad;
import zayne.fragz.MeemRules;
import zayne.fragz.MiscRules;
import zayne.fragz.NoonRules;
import zayne.fragz.Shaddah;
import zayne.fragz.ShortVowels;
import zayne.fragz.Stopping;
import zayne.fragz.Sukoon;
import zayne.fragz.Tanween;

public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {
    //ImageButton button;
    private Toolbar toolbar;
    private boolean hints;
    private Bundle extras, bundle;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        toolbar.setTitleTextColor(Color.parseColor("#FDFFFC"));



        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();


        // this is where i grab the extras passed in from the settingsMenu
        extras = getIntent().getExtras();
        if(extras != null){
            hints = extras.getBoolean("hint");
        }




        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
        FragmentManager fm = getFragmentManager();
        toolbar.setTitle("Intro");
        fm.beginTransaction().replace(R.id.mainFrame, new Intro()).commit();
    }

    public void onBackPressed(View v) {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        FragmentManager fm = getFragmentManager();
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            finish();

           /* switch (v.getId()){
                case R.id.intro:
                    finish();
                    break;
                case R.id.huroof:
                    fm.beginTransaction().replace(R.id.mainFrame, new MainActivity()).commit();

            } */
        }
    }



    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();




        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {

            Intent i = new Intent(this, SettingsMenu.class);
            startActivity(i);


            return true;
        }


        return super.onOptionsItemSelected(item);
    }

    public Intent createEmailOnlyChooserIntent(Intent source,
                                               CharSequence chooserTitle) {
        Stack<Intent> intents = new Stack<Intent>();
        Intent i = new Intent(Intent.ACTION_SENDTO, Uri.fromParts("mailto",
                "zein.alameddine122@gmail.com", null));
        List<ResolveInfo> activities = getPackageManager()
                .queryIntentActivities(i, 0);

        for (ResolveInfo ri : activities) {
            Intent target = new Intent(source);
            target.setPackage(ri.activityInfo.packageName);
            intents.add(target);
        }

        if (!intents.isEmpty()) {
            Intent chooserIntent = Intent.createChooser(intents.remove(0),
                    chooserTitle);
            chooserIntent.putExtra(Intent.EXTRA_INITIAL_INTENTS,
                    intents.toArray(new Parcelable[intents.size()]));

            return chooserIntent;
        } else {
            return Intent.createChooser(source, chooserTitle);
        }
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.


        int id = item.getItemId();

        //passing data from settings to the rest of the app


        //passing the boolen to the fragments with these variables

        bundle = new Bundle();
        bundle.putBoolean("hints", hints);


        //All the fragments loaded here so oolean value can be passed in order to turn on/off toast hint
        FragmentManager fm = getFragmentManager();

        Fragment dip = new Dipthongs();
        Fragment alpha =new Huroof();
        Fragment forms = new LetterRecog();
        Fragment shortv = new ShortVowels();
        Fragment sukoon = new Sukoon();
        Fragment longv = new LongVowels();
        Fragment tanween = new Tanween();
        Fragment lam = new LamRules();
        Fragment shad = new Shaddah();
        Fragment madd = new Mad();
        dip.setArguments(bundle);

        //seting up the arguments to be passed to the fragments
        alpha.setArguments(bundle);
        forms.setArguments(bundle);
        shortv.setArguments(bundle);
        sukoon.setArguments(bundle);
        longv.setArguments(bundle);
        tanween.setArguments(bundle);
        lam.setArguments(bundle);
        shad.setArguments(bundle);
        madd.setArguments(bundle);




        if (id == R.id.intro) {

            fm.beginTransaction().replace(R.id.mainFrame, new Intro()).commit();

        } else if (id == R.id.alphabet) {
            fm.beginTransaction().replace(R.id.mainFrame, new Huroof()).commit();
            toolbar.setTitle("Alphabet");




        } else if (id == R.id.forms) {
            fm.beginTransaction().replace(R.id.mainFrame, new LetterRecog()).commit();
            toolbar.setTitle("forms");


        } else if (id == R.id.short_vowels) {

            fm.beginTransaction().replace(R.id.mainFrame, new ShortVowels()).commit();
            toolbar.setTitle("Short Vowel");
        } else if (id == R.id.tanween) {

            fm.beginTransaction().replace(R.id.mainFrame, new Tanween()).commit();
            toolbar.setTitle("tanween");

        } else if (id == R.id.sukoon) {

            fm.beginTransaction().replace(R.id.mainFrame, new Sukoon()).commit();
            toolbar.setTitle("sukoon");


        } else if (id == R.id.long_vowels) {

            fm.beginTransaction().replace(R.id.mainFrame, new LongVowels()).commit();
            toolbar.setTitle("long vowels");

        } else if (id == R.id.dipthongs) {
            fm.beginTransaction().replace(R.id.mainFrame, new Dipthongs()).add(R.id.mainFrame, dip, "tag").commit();
            toolbar.setTitle("dipthongs");

        } else if (id == R.id.lam_rules) {
            fm.beginTransaction().replace(R.id.mainFrame, new LamRules()).commit();
            toolbar.setTitle("lam rules");
        } else if (id == R.id.shaddah) {
            fm.beginTransaction().replace(R.id.mainFrame, new Shaddah()).commit();
            toolbar.setTitle("Shaddah");

        } else if (id == R.id.meem_rules) {
            fm.beginTransaction().replace(R.id.mainFrame, new MeemRules()).commit();
            toolbar.setTitle("Meem Rules");


        } else if (id == R.id.noon_rules) {
            fm.beginTransaction().replace(R.id.mainFrame, new NoonRules()).commit();
            toolbar.setTitle("Noon rules");

        } else if (id == R.id.stopping) {
            fm.beginTransaction().replace(R.id.mainFrame, new Stopping()).commit();
            toolbar.setTitle("Alphabet");

        } else if (id == R.id.madd) {
            fm.beginTransaction().replace(R.id.mainFrame, new Mad()).commit();
            toolbar.setTitle("Madd");

        } else if (id == R.id.misc_rules) {
            fm.beginTransaction().replace(R.id.mainFrame, new MiscRules()).commit();
            toolbar.setTitle("Misc. Rules");

        } else if (id == R.id.nav_share) {

        } else if (id == R.id.nav_send) {

            //TODO add an email layout with a send button and have them type a body and it will send all that info over to me

            Intent i = new Intent(Intent.ACTION_SEND);
            String subject = "zein.alameddine122@gmail.com";
            i.setData(Uri.parse("mailto:"));
            //i.setType("text/plain");
            i.putExtra(Intent.EXTRA_EMAIL, "zein.alameddine122@gmail.com");
            i.putExtra(Intent.EXTRA_SUBJECT, "Improvements");
            i.putExtra(Intent.EXTRA_TEXT   , "Message Body");

            //Uri data = Uri.parse("mailto:?subject=zein.alameddine122@gmail.com" + subject + "&body     ");

           // i.setData(data);
            startActivity(Intent.createChooser(i, "Send mail..."));


        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}
