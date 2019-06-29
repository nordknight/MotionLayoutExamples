package com.example.motionlayoutexamples;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.motion.widget.MotionLayout;

public class AnimationKeyPositionActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_animation_key_position);
        ((MotionLayout) findViewById(R.id.main_scene_container)).setTransitionListener(new MotionLayout.TransitionListener() {
            @Override
            public void onTransitionStarted(MotionLayout motionLayout, int i, int i1) {

            }

            @Override
            public void onTransitionChange(MotionLayout motionLayout, int i, int i1, float v) {

            }

            @Override
            public void onTransitionCompleted(MotionLayout motionLayout, int i) {
                if (motionLayout.getCurrentState() == motionLayout.getEndState()) {
                    motionLayout.transitionToStart();
                }
                if (motionLayout.getCurrentState() == motionLayout.getStartState()) {
                    motionLayout.transitionToEnd();
                }
            }

            @Override
            public void onTransitionTrigger(MotionLayout motionLayout, int i, boolean b, float v) {

            }
        });
    }
}
