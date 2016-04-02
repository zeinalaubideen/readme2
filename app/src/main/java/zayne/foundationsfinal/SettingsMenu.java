package zayne.foundationsfinal;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.CompoundButton;
import android.widget.Switch;

public class SettingsMenu extends AppCompatActivity {

    private boolean hint;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings_menu);

        Switch onOffToggle = (Switch)findViewById(R.id.toggle);
        onOffToggle.setChecked(false);
        hint = true;


        onOffToggle.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {

            @Override
            public void onCheckedChanged(CompoundButton buttonView,
                                         boolean isChecked) {

                if (isChecked) {
                   hint = true;
                } else {
                    hint = false;
                }

            }
        });
        Intent i = new Intent(this, MainActivity.class);

        i.putExtra("hint", hint);
        startActivity(i);

    }
}
