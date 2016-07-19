package com.exam.andex.widgetmenu;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;

/**
 * Created by Administrator on 2016-07-19.
 */
public class PaintView extends View {


    public PaintView (Context context){
        super(context);
    }
    public PaintView(Context context, AttributeSet attrs) {
        super(context, attrs);
        init(context);
    }

    public Paint paint;
    float oldX,oldY,thick = 5.0f;
    Context context;
    Bitmap vBitmap;
    Canvas vCanvas;


    @Override
    protected void onSizeChanged(int w, int h, int oldw, int oldh) {
        vBitmap = Bitmap.createBitmap(w, h, Bitmap.Config.RGB_565);
        vCanvas = new Canvas();
        vCanvas.setBitmap(vBitmap);
        vCanvas.drawColor(Color.WHITE);

    }

    private void init(Context context) {
        paint = new Paint();
        paint.setAntiAlias(true);
        paint.setStyle(Paint.Style.STROKE);
        paint.setColor(Color.BLACK);
        paint.setStrokeWidth(5.0f);
        paint.setStrokeCap(Paint.Cap.ROUND);

    }
    //reset 버튼
    public void setReset(){
        vCanvas = new Canvas();
        vCanvas.setBitmap(vBitmap);
        vCanvas.drawColor(Color.WHITE);
        invalidate();
        init(context);
    }

    public void setColor(int color){
        paint.setColor(color);
    }
    public void setThick(){
        if(thick < 50f){
            thick +=2;
            paint.setStrokeWidth(thick);
        }
    }
    public void setThin(){
        if(thick > 0f){
            thick -=2;
            paint.setStrokeWidth(thick);
        }
    }
    @Override
    protected void onDraw(Canvas canvas) {
        if(vBitmap != null){
            canvas.drawBitmap(vBitmap, 0,0, paint);
        }

    }
    @Override
    public boolean onTouchEvent(MotionEvent event) {
        int action = event.getAction();
        float curX = event.getX();
        float curY = event.getY();

        if(action == MotionEvent.ACTION_DOWN){
            oldX = curX;
            oldY = curY;
        }

        else if(action == MotionEvent.ACTION_MOVE){
            vCanvas.drawLine(oldX, oldY, curX, curY, paint);
            oldX = curX;
            oldY = curY;
        }
        invalidate();

        return true;
    }
}
