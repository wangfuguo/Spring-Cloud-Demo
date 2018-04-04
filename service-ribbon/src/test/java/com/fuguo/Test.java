package com.fuguo;

import java.math.RoundingMode;
import java.text.DecimalFormat;

/**
 * 功能描述: TODO
 *
 * @author 00938658-王富国
 * @date 2017-12-29 14:35
 * @since V1.0.0
 */
public class Test {

    public static void main(String[] args){
        String str = "1.211";
        System.out.println(str.substring(str.indexOf(".") + 1, str.indexOf(".") + 2));
        System.out.println(stringToFloat1("0.299999"));
        System.out.println(formatFloat(1.284f));
    }

    private static Float stringToFloat1(String string) {
        Float f = Float.parseFloat(string);
        String str = string.substring(0, string.indexOf(".") + 2);
        return formatFloat(Float.parseFloat(str));
    }

    private static Float stringToFloat(String string) {
        Float f = Float.parseFloat(string);
        return formatFloat(f);
    }

    private static Float formatFloat(Float f) {
        DecimalFormat df = new DecimalFormat("######0.0");
        df.setRoundingMode(RoundingMode.DOWN);
        return Float.parseFloat(df.format(f));
    }
}
