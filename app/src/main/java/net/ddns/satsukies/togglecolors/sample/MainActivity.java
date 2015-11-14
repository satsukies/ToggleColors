package net.ddns.satsukies.togglecolors.sample;

import android.graphics.Color;
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
        toggle.setFillColor(ToggleColors.COLOR_GREEN_200);

        ToggleColors toggle2 = (ToggleColors)findViewById(R.id.toggle2);
        toggle2.setOnCheckedChangeListener(new ToggleColorsListener());
        toggle2.setFillColor(ToggleColors.COLOR_ORANGE_200);

    }
}
