package org.sssta.colorlab.util;

/**
 * Created by Heaven on 2015/12/7.
 */
public class ReColor {
    public static String toColorString(int r,int g,int b){
        return '#' + toColorStringPart(r) + toColorStringPart(g) + toColorStringPart(b);
    }
    private static String toColorStringPart(int number){
        String s = Integer.toHexString(number);
        while (s.length() < 2){
            s = '0' + s;
        }
        return s;
    }
}
