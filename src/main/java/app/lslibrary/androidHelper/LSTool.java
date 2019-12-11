package app.lslibrary.androidHelper;

import android.util.DisplayMetrics;

public abstract class LSTool
{
    public static float applyDimension(int unit, float value, DisplayMetrics metrics)
    {
        switch (unit)
        {
            //px：pixel
            case android.util.TypedValue.COMPLEX_UNIT_PX:
                return value;
            //dp（dip）
            case android.util.TypedValue.COMPLEX_UNIT_DIP:
                return value * metrics.density;
            //sp
            case android.util.TypedValue.COMPLEX_UNIT_SP:
                return value * metrics.scaledDensity;
            //pt ： 1/72英寸
            case android.util.TypedValue.COMPLEX_UNIT_PT:
                return value * metrics.xdpi * (1.0f/72);
            //in： inch 英寸
            case android.util.TypedValue.COMPLEX_UNIT_IN:
                return value * metrics.xdpi;
            //mm ： 毫米  1英寸=25.4毫米
            case android.util.TypedValue.COMPLEX_UNIT_MM:
                return value * metrics.xdpi * (1.0f/25.4f);
        }
        return 0;
    }
}