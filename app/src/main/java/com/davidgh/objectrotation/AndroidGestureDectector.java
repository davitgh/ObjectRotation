package com.davidgh.objectrotation;

/**
 * Created by davidgh on 2/6/18.
 */

import android.util.Log;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.widget.TextView;


public class AndroidGestureDectector implements
        GestureDetector.OnGestureListener,
        GestureDetector.OnDoubleTapListener {

    private TriangleView mTriangleView;
    private TextView mSpeed;
    private TextView mScroll;

    public AndroidGestureDectector(TriangleView mTriangleView, TextView mScroll, TextView mSpeed) {
        this.mTriangleView = (TriangleView) mTriangleView;
        this.mScroll = mScroll;
        this.mSpeed = mSpeed;
    }

    @Override
    public boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        return false;
    }

    @Override
    public boolean onDoubleTap(MotionEvent motionEvent) {
        return false;
    }

    @Override
    public boolean onDoubleTapEvent(MotionEvent motionEvent) {
        return false;
    }

    @Override
    public boolean onDown(MotionEvent motionEvent) {
        return false;
    }

    @Override
    public void onShowPress(MotionEvent motionEvent) {

    }

    @Override
    public boolean onSingleTapUp(MotionEvent motionEvent) {
        return false;
    }

    @Override
    public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent1, float v, float v1) {
        if (motionEvent.getX() < motionEvent1.getX()) {
            mTriangleView.setRotation(motionEvent.getX() - motionEvent1.getX());
            mScroll.setText("Gesture : Left to Right Scroll: " + motionEvent.getX() + " - " + motionEvent1.getX());
            mSpeed.setText("Speed : " + String.valueOf(v) + " pixels/second");
        }
        if (motionEvent.getX() > motionEvent1.getX()) {
            mTriangleView.setRotation(motionEvent.getX() - motionEvent1.getX());
            mScroll.setText("Gesture : Right to Left Scroll: " + motionEvent.getX() + " - " + motionEvent1.getX());
            mSpeed.setText("Speed : " +  String.valueOf(v) + " pixels/second");
        }
        if (motionEvent.getY() < motionEvent1.getY()) {
            mTriangleView.setRotation(motionEvent.getY() - motionEvent1.getY());

            mScroll.setText("Gesture : Up to Down Scroll: " + motionEvent.getY() + " - " + motionEvent1.getY());
            mSpeed.setText("Speed : " + String.valueOf(v1) + " pixels/second");
        }
        if (motionEvent.getY() > motionEvent1.getY()) {
            mTriangleView.setRotation(motionEvent.getY() - motionEvent1.getY());

            mScroll.setText("Gesture : Down to Up Scroll: " + motionEvent.getY() + " - " + motionEvent1.getY());
            mSpeed.setText("Speed : " + String.valueOf(v1) + " pixels/second");
        }

        return false;
    }

    @Override
    public void onLongPress(MotionEvent motionEvent) {

    }

    @Override
    public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent1, float v, float v1) {
        if (motionEvent.getX() < motionEvent1.getX()) {
            mTriangleView.setRotation(motionEvent.getX() - motionEvent1.getX());

            mScroll.setText("Gesture : Left to Right Fling: " + motionEvent.getX() + " - " + motionEvent1.getX());
            mSpeed.setText("Speed : " + String.valueOf(v) + " pixels/second");
        }
        if (motionEvent.getX() > motionEvent1.getX()) {
            mTriangleView.setRotation(motionEvent.getX() - motionEvent1.getX());

            mScroll.setText("Gesture : Right to Left Fling: " + motionEvent.getX() + " - " + motionEvent1.getX());
            mSpeed.setText("Speed : " + String.valueOf(v) + " pixels/second");
        }
        if (motionEvent.getY() < motionEvent1.getY()) {
            mTriangleView.setRotation(motionEvent.getY() - motionEvent1.getY());

            mScroll.setText("Gesture : Up to Down Fling: " + motionEvent.getY() + " - " + motionEvent1.getY());
            mSpeed.setText("Speed : " + String.valueOf(v1) + " pixels/second");
        }
        if (motionEvent.getY() > motionEvent1.getY()) {
            mTriangleView.setRotation(motionEvent.getY() - motionEvent1.getY());

            mScroll.setText("Gesture : Down to Up Fling: " + motionEvent.getY() + " - " + motionEvent1.getY());
            mSpeed.setText("Speed : " + String.valueOf(v1) + " pixels/second");
        }
        return false;
    }
}
