package com.example.customviews;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;

public class MyCustomView extends View {

    private int viewColor, textColor;
    private String viewText;
    private Paint paint;

    public MyCustomView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);

        paint = new Paint();

        TypedArray typedArray = context.getTheme().obtainStyledAttributes(attributeSet,
                R.styleable.MyCustomView, 0, 0);

        try {
            viewColor = typedArray.getInteger(R.styleable.MyCustomView_viewColor, 0);
            textColor = typedArray.getInteger(R.styleable.MyCustomView_textColor, 0);
            viewText = typedArray.getString(R.styleable.MyCustomView_viewText);
        } finally {
            typedArray.recycle();
        }
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        paint.setStyle(Paint.Style.FILL);
        paint.setAntiAlias(true);
        paint.setColor(viewColor);

        canvas.drawCircle(500, 500, 50, paint);

        paint.setColor(textColor);
        paint.setTextAlign(Paint.Align.CENTER);
        paint.setTextSize(60);

        canvas.drawText(viewText, 100, 100, paint);
    }

    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
    }

    public int getViewColor() {
        return viewColor;
    }

    public void setViewColor(int viewColor) {
        this.viewColor = viewColor;
        //Redraw
        invalidate();
        requestLayout();
    }

    public int getTextColor() {
        return textColor;
    }

    public void setTextColor(int textColor) {
        this.textColor = textColor;
        //Redraw
        invalidate();
        requestLayout();
    }

    public String getViewText() {
        return viewText;
    }

    public void setViewText(String viewText) {
        this.viewText = viewText;
        //Redraw
        invalidate();
        requestLayout();
    }
}
