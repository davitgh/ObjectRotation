package com.davidgh.objectrotation;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

/**
 * Created by davidgh on 2/6/18.
 */

public class TriangleView extends View {

    public TriangleView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);


        int w = getWidth() / 2;
        int h = getHeight();

        Path path = new Path();
        path.moveTo( w, 0);
        path.lineTo( 0 , h);
        path.lineTo( 2 * w , h);
        path.lineTo( w , 0);
        path.close();

        Paint p = new Paint();
        p.setColor( Color.RED );

        canvas.drawPath(path, p);

    }
}
