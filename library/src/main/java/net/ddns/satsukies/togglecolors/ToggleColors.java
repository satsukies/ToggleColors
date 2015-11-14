package net.ddns.satsukies.togglecolors;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.Switch;
import android.widget.ToggleButton;

/**
 * Created by satsukies on 15/11/14.
 */
public class ToggleColors extends Switch {

    public static final int COLOR_RED_500 = Color.rgb(244, 67, 54);
    private static int selectedBG;
    private static Drawable defaultBG;

    Context mContext;

    public ToggleColors(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        mContext = context;
    }

    public ToggleColors(Context context, AttributeSet attrs) {
        super(context, attrs);
        mContext = context;
    }

    public ToggleColors(Context context) {
        super(context);
    }

    public void setSelectedBG(int color){
        selectedBG = color;
    }

    public int getSelectedBG() {
        return selectedBG;
    }

    public void setDefaultBG(Drawable drawable){
        defaultBG = drawable;
    }

    public Drawable getDefaultBG(){
        return defaultBG;
    }
}
