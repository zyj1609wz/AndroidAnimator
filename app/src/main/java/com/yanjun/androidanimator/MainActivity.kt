package com.yanjun.androidanimator

import android.graphics.drawable.AnimationDrawable
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //开始播放逐帧动画
        findViewById<Button>(R.id.start).setOnClickListener {
            start1()
        }

        //开始播放逐帧动画
        findViewById<Button>(R.id.stop).setOnClickListener {
            stop1()
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
