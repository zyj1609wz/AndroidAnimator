package com.yanjun.androidanimator.util;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.view.View;

public class ScaleAnimationUtil {

    private AnimatorSet mAnimatorSet = new AnimatorSet();

    public void runScaleAnimation(final View view) {
        ObjectAnimator scaleX = ObjectAnimator.ofFloat(view, "scaleX", 1.0f, 1.06f, 0.9f);
        ObjectAnimator scaleY = ObjectAnimator.ofFloat(view, "scaleY", 1.0f, 1.06f, 0.9f);
        scaleX.setRepeatCount(ValueAnimator.INFINITE);
        scaleY.setRepeatCount(ValueAnimator.INFINITE);
        mAnimatorSet.playTogether(scaleX, scaleY);
        mAnimatorSet.setDuration(800);
        mAnimatorSet.setInterpolator(new BraetheInterpolator());
        mAnimatorSet.start();
    }

    public void cancelAnimation() {
        if (mAnimatorSet != null && mAnimatorSet.isRunning()) {
            mAnimatorSet.cancel();
        }
    }

}
