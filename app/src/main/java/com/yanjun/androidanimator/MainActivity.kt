package com.yanjun.androidanimator

import android.graphics.drawable.AnimationDrawable
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.yanjun.androidanimator.util.ScaleAnimationUtil

class MainActivity : AppCompatActivity() {

    lateinit var mScaleAnimationUtil: ScaleAnimationUtil
    lateinit var mSignView: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mScaleAnimationUtil = ScaleAnimationUtil()

        //开始播放逐帧动画
        findViewById<Button>(R.id.start).setOnClickListener {
            start1()
        }

        //开始播放逐帧动画
        findViewById<Button>(R.id.stop).setOnClickListener {
            stop1()
        }

        mSignView = findViewById(R.id.tv_sign_in)
        mScaleAnimationUtil.runScaleAnimation(mSignView)

        //开始播放属性动画
        findViewById<Button>(R.id.bt2_start).setOnClickListener {
            mScaleAnimationUtil.runScaleAnimation(mSignView)
        }

        //暂定播放属性动画
        findViewById<Button>(R.id.bt2_stop).setOnClickListener {
            mScaleAnimationUtil.cancelAnimation()
        }

    }

    fun start1() {
        //开始播放逐帧动画
        val rewardView = findViewById<ImageView>(R.id.iv_reward)
        (rewardView.drawable as AnimationDrawable).start()
    }

    fun stop1() {
        //开始播放逐帧动画
        val rewardView = findViewById<ImageView>(R.id.iv_reward)
        (rewardView.drawable as AnimationDrawable).stop()
    }

}
