package org.sssta.colorlab.custom;

import android.content.Context;
import android.graphics.Color;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import org.sssta.colorlab.util.ReColor;

import java.util.Random;

/**
 * Created by Heaven on 2015/12/7.
 */
public class ColorView extends TextView{
    private int r=255,g=255,b=255;
    public ColorView(Context context) {
        super(context);
        init();
    }

    public ColorView(Context context, AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    public ColorView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init();
    }

    public ColorView(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
        init();
    }
    private void init(){
        setClickable(true);
        setAllCaps(true);
        setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                Random random = new Random();
                r = random.nextInt(255);
                g = random.nextInt(255);
                b = random.nextInt(255);
                update();
            }
        });
        update();
    }
    private void update(){
        setBackgroundColor(Color.argb(255, r, g, b));
        setText(ReColor.toColorString(r, g, b));
        setTextSize(20);

        if (r * g * b > (255*255*255)/8){
            setTextColor(Color.BLACK);
        }else {
            setTextColor(Color.WHITE);
        }
    }

}
