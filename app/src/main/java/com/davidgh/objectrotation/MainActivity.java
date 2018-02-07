package com.davidgh.objectrotation;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import android.view.GestureDetector;
import android.view.MotionEvent;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "Davidgh -> ";
    private GestureDetector mDetector;

    // Android Layout
    private TriangleView mTriangle;

    private TextView mSpeed;
    private TextView mScroll;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mScroll = (TextView) findViewById(R.id.tv_scroll);
        mSpeed = (TextView) findViewById(R.id.tv_speed);

        mTriangle = (TriangleView) findViewById(R.id.triangle);

        AndroidGestureDectector androidGestureDectector = new AndroidGestureDectector(mTriangle, mScroll, mSpeed);
        mDetector = new GestureDetector(MainActivity.this, androidGestureDectector);

    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        mDetector.onTouchEvent(event);
        return super.onTouchEvent(event);
    }
}



