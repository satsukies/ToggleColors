package net.ddns.satsukies.togglecolors.sample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import net.ddns.satsukies.togglecolors.ToggleColors;
import net.ddns.satsukies.togglecolors.ToggleColorsListener;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ToggleColors toggle = (ToggleColors)findViewById(R.id.toggle);
        toggle.setOnCheckedChangeListener(new ToggleColorsListener());
        toggle.setSelectedBG(getResources().getColor(R.color.red200));
    }
}
