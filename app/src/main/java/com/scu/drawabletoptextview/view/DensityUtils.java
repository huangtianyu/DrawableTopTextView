package com.scu.drawabletoptextview.view;

import android.content.Context;


/**
 * 不同单位之间的转换工具类
 * @Description: 如果有现成的代码可以合并

 * @Title: 			DensityUtils.java 

 * @Package 		com.qihoo.browser.util 

 * @Author 			Hanyonglu@360.cn 

 * @DateTime 		2014-6-27 下午12:03:28 

 * @Version 		V6.3.0
 */
public class DensityUtils {
    // 所有UI界面标准参数
    public static final int STANDARD_SCREEN_WIDTH = 720;
    public static final int STANDARD_SCREEN_HEIGHT = 1280;
    public static final int STANDARD_SCREEN_DENSITY = 320; // DPI

    /**
	 * 根据手机的分辨率从 dp 的单位 转成为 px(像素)
	 * @param context
	 * @param dpValue
	 * @return
	 */
	public static int dip2px(Context context, float dpValue) {
		final float scale = context.getResources().getDisplayMetrics().density;
		return (int) (dpValue * scale + 0.5f);  
	}  
	

    /** 
     * 将sp值转换为px值，保证文字大小不变 
     *  
     * @param spValue 
     * @param fontScale 
     *            （DisplayMetrics类中属性scaledDensity） 
     * @return 
     */  
    public static int sp2px(Context context, float spValue) {
        final float fontScale = context.getResources().getDisplayMetrics().scaledDensity;  
        return (int) (spValue * fontScale + 0.5f);  
    }

    /**
     * 将PX转化为标准屏幕的dip值
     *
     * @param px
     *
     * @return 运行设备上的dip值
     */
    private static int px2dipWithStand(int px) {
        return (px * 160) / STANDARD_SCREEN_DENSITY;
    }

    /**
     * 将输入的标准屏幕的数据转化成本机的数据
     *
     * @param px
     * @return
     */
    public static int pxStand2Local(Context context, int px) {
        int localPx = 0;
        int standDip = px2dipWithStand(px);
        localPx = DensityUtils.dip2px(context, standDip);
        return localPx;
    }
}
