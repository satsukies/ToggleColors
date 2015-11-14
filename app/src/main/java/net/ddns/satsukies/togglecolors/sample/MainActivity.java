package net.ddns.satsukies.togglecolors.sample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.CompoundButton;
import android.widget.TextView;

import net.ddns.satsukies.togglecolors.ToggleColors;
import net.ddns.satsukies.togglecolors.ToggleColorsListener;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final TextView label = (TextView)findViewById(R.id.label);
        label.setText("OFF");

        ToggleColors toggle = (ToggleColors)findViewById(R.id.toggle);
        toggle.setOnCheckedChangeListener(new ToggleColorsListener(){
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                super.onCheckedChanged(buttonView, isChecked);
                if(isChecked){
                    label.setText("ON");
                }else{
                    label.setText("OFF");
                }
            }
        });
        toggle.setFillColor(ToggleColors.COLOR_GREEN_200);

        ToggleColors toggle2 = (ToggleColors)findViewById(R.id.toggle2);
        toggle2.setOnCheckedChangeListener(new ToggleColorsListener());
        toggle2.setFillColor(ToggleColors.COLOR_ORANGE_200);

        ToggleColors toggle3 = (ToggleColors)findViewById(R.id.toggle3);
        toggle3.setOnCheckedChangeListener(new ToggleColorsListener());
        toggle3.setFillColor(ToggleColors.COLOR_BLUE_200);

        ToggleColors toggle4 = (ToggleColors)findViewById(R.id.toggle4);
        toggle4.setOnCheckedChangeListener(new ToggleColorsListener());
        toggle4.setFillColor(ToggleColors.COLOR_LIME_200);

        ToggleColors toggle5 = (ToggleColors)findViewById(R.id.toggle5);
        toggle5.setOnCheckedChangeListener(new ToggleColorsListener());
        toggle5.setFillColor(ToggleColors.COLOR_RED_200);

    }
}
