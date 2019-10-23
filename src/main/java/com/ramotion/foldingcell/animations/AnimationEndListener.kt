package com.ramotion.foldingcell.animations

import android.view.animation.Animation

/**
 * Just sugar for code clean
 */
abstract class AnimationEndListener : Animation.AnimationListener {

    override fun onAnimationStart(animation: Animation) {
        // do nothing
    }

    override fun onAnimationRepeat(animation: Animation) {
        // do nothing
    }

}
