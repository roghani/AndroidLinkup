package com.znv.linkup.core.util;

import android.graphics.Bitmap;
import android.graphics.Matrix;

/**
 * 图片缩放处理类
 * 
 * @author yzb
 * 
 */
public class ImageUtil {

    /**
     * 根据大小缩放图片
     * 
     * @param bitmap
     *            当前图片
     * @param newSizeX
     *            缩放后的宽度
     * @param newSizeY
     *            缩放后的高度
     * @return 缩放后的图片
     */
    public static Bitmap scaleBitmap(Bitmap bitmap, int newSizeX, int newSizeY) {
        float scaleX = (float) (newSizeX * 1.0 / bitmap.getWidth());
        float scaleY = (float) (newSizeY * 1.0 / bitmap.getHeight());
        return scaleBitmap(bitmap, scaleX, scaleY);
    }

    /**
     * 根据比例缩放图片
     * 
     * @param bitmap
     *            当前图片
     * @param scaleX
     *            宽度缩放比例
     * @param scaleY
     *            高度缩放比例
     * @return 缩放后的图片
     */
    public static Bitmap scaleBitmap(Bitmap bitmap, float scaleX, float scaleY) {
        Matrix matrix = new Matrix();
        matrix.postScale(scaleX, scaleY);
        return Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true);
    }
}
