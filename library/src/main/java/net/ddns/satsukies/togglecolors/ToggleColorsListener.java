package net.ddns.satsukies.togglecolors;

import android.graphics.Color;
import android.view.View;
import android.widget.CompoundButton;

/**
 * Created by satsukies on 15/11/14.
 */
public class ToggleColorsListener implements CompoundButton.OnCheckedChangeListener {

    @Override
    public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {

        View parent = (View) buttonView.getParent();

//        ToggleColors.setDefaultBG(parent.getBackground());

        if(isChecked) {
            parent.setBackgroundColor(((ToggleColors)buttonView).getSelectedBG());
        }else{
//            parent.setBackgroundColor(ToggleColors.getDefaultBG());
            parent.setBackgroundColor(Color.TRANSPARENT);
        }

    }
}
