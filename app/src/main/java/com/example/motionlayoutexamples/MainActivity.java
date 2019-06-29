package com.example.motionlayoutexamples;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button simpleAnimation = findViewById(R.id.simple_animation);
        simpleAnimation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, SimpleAnimationActivity.class);
                startActivity(intent);
            }
        });

        Button simpleOnClickAnimation = findViewById(R.id.simple_animation_on_click);
        simpleOnClickAnimation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, SimpleAnimationOnClickActivity.class);
                startActivity(intent);
            }
        });

        Button simpleOnSwipeAnimation = findViewById(R.id.simple_animation_on_swipe);
        simpleOnSwipeAnimation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, SimpleAnimationOnSwipeActivity.class);
                startActivity(intent);
            }
        });

        Button simpleCustomAttributeAnimation = findViewById(R.id.simple_animation_custom_attribute);
        simpleCustomAttributeAnimation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, SimpleAnimationCustomAttributeActivity.class);
                startActivity(intent);
            }
        });

        Button FilterViewAnimation = findViewById(R.id.animation_filter_view);
        FilterViewAnimation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, AnimationFilterViewActivity.class);
                startActivity(intent);
            }
        });

        Button animationKeyPosition = findViewById(R.id.animation_key_position);
        animationKeyPosition.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, AnimationKeyPositionActivity.class);
                startActivity(intent);
            }
        });

        Button animationKeyCycle = findViewById(R.id.animation_key_cycle);
        animationKeyCycle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, AnimationKeyCycleActivity.class);
                startActivity(intent);
            }
        });

        Button animationKeyPositionCycle = findViewById(R.id.animation_key_position_cycle);
        animationKeyPositionCycle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, AnimationKeyPositionCycleActivity.class);
                startActivity(intent);
            }
        });

        Button animationKeyAttribute = findViewById(R.id.animation_key_attribute);
        animationKeyAttribute.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, AnimationKeyAttributeActivity.class);
                startActivity(intent);
            }
        });

        Button animationKeyTimeCycle = findViewById(R.id.animation_key_time_cycle);
        animationKeyTimeCycle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, AnimationKeyTimeCycleActivity.class);
                startActivity(intent);
            }
        });

        Button rotatingEnd = findViewById(R.id.rotating_end);
        rotatingEnd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, RotatingEndActivity.class);
                startActivity(intent);
            }
        });
    }

}
