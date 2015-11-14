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

    /**
     * Color data
     */
    public static final int COLOR_RED_200 = Color.parseColor("#EF9A9A");
    public static final int COLOR_PINK_200 = Color.parseColor("#F48FB1");
    public static final int COLOR_PURPLE_200 = Color.parseColor("#CE93D8");
    public static final int COLOR_DEEP_PURPLE_200 = Color.parseColor("#B39DD8");
    public static final int COLOR_INDIGO_200 = Color.parseColor("#9FA8DA");
    public static final int COLOR_BLUE_200 = Color.parseColor("#90CAF9");
    public static final int COLOR_LIGHT_BLUE_200 = Color.parseColor("#81D4FA");
    public static final int COLOR_CYAN_200 = Color.parseColor("#80DEEA");
    public static final int COLOR_TEAL_200 = Color.parseColor("#80CBC4");
    public static final int COLOR_GREEN_200 = Color.parseColor("#A5D6A7");
    public static final int COLOR_LIGHT_GREEN_200 = Color.parseColor("#C5E1A5");
    public static final int COLOR_LIME_200 = Color.parseColor("#E6EE9C");
    public static final int COLOR_YELLOW_200 = Color.parseColor("#FFF59D");
    public static final int COLOR_AMBER_200 = Color.parseColor("#FFE082");
    public static final int COLOR_ORANGE_200 = Color.parseColor("#FFCC80");
    public static final int COLOR_DEEP_ORANGE_200 = Color.parseColor("#FFAB91");
    public static final int COLOR_BROWN_200 = Color.parseColor("#BCAAA4");
    public static final int COLOR_GREY_200 = Color.parseColor("#EEEEEE");
    public static final int COLOR_BLUE_GRAY_200 = Color.parseColor("#B0BEC5");

    /**
     * Other variables
     */
    private int fillColor;

    private Context mContext;

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

    public void setFillColor(int color) {
        fillColor = color;
    }

    public int getFillColor() {
        return fillColor;
    }
}
