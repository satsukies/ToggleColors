package net.ddns.satsukies.togglecolors;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.graphics.Color;
import android.view.View;
import android.view.ViewAnimationUtils;
import android.widget.CompoundButton;

/**
 * Created by satsukies on 15/11/14.
 */

/**
 * ToggleColors専用のCheck状態変化時のリスナークラス。
 */
public class ToggleColorsListener implements CompoundButton.OnCheckedChangeListener {

    /**
     * 背景色の変更処理と、それに伴うアニメーションが実装されている。
     * @param buttonView 状態が変化したSwitch
     * @param isChecked Switchの状態。trueがチェックされている状態。
     */
    @Override
    public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {

        final View parent = (View) buttonView.getParent();

        int cx = (buttonView.getLeft() + buttonView.getRight()) / 2;
        int cy = (buttonView.getTop() + buttonView.getBottom()) / 2;

        int finalRadius = Math.max(parent.getWidth(), parent.getHeight());

        if (isChecked) {
            parent.setBackgroundColor(((ToggleColors) buttonView).getFillColor());

            if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.LOLLIPOP) {
                Animator anim = ViewAnimationUtils.createCircularReveal(parent, cx, cy, 0, finalRadius);
                anim.start();
            }
        } else {
            if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.LOLLIPOP) {
                Animator anim2 = ViewAnimationUtils.createCircularReveal(parent, cx, cy, finalRadius, 0);
                anim2.addListener(new AnimatorListenerAdapter() {
                    @Override
                    public void onAnimationEnd(Animator animation) {
                        parent.setBackgroundColor(Color.TRANSPARENT);
                    }
                });
                anim2.start();
            } else {
                parent.setBackgroundColor(Color.TRANSPARENT);
            }
        }

    }
}
