package com.hand.order.utils;

import java.util.Random;

/**
 * @author Ashuang
 * @date 2018/10/17
 */

public class KeyUtil {

    public static String getKeys() {
        Random random = new Random();
        Integer number = random.nextInt(1000000) + random.nextInt(100000);
        return System.currentTimeMillis() + String.valueOf(number);
    }

}
