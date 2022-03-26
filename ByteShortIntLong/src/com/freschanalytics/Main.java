package com.freschanalytics;

public class Main {

    public static void main(String[] args) {

        // start the discussion with the integer type
        int myMinInt = Integer.MIN_VALUE;
        int myMaxInt = Integer.MAX_VALUE;

        System.out.println("Integer's minimum value: " + myMinInt);
        System.out.println("Integer's minimum value: " + myMaxInt);

        // follow up with bytes
        byte myMinByte = Byte.MIN_VALUE;
        byte myMaxByte = Byte.MAX_VALUE;

        System.out.println("Byte's minimum value: " + myMinByte);
        System.out.println("Byte's maximum value: " + myMaxByte);

        // follow up with shorts
        short myMinShort = Short.MIN_VALUE;
        short myMaxShort = Short.MAX_VALUE;

        System.out.println("Short's minimum value: " + myMinShort);
        System.out.println("Short's maximum value: " + myMaxShort);

        // follow up with Longs
        long myMinLong = Long.MIN_VALUE;
        long myMaxLong = Long.MAX_VALUE;

        System.out.println("Long's minimum value: " + myMinLong);
        System.out.println("Long's maximum value: " + myMaxLong);

        // casting
        byte myNewByte = (byte) (myMinByte / 2);
        short myNewShort = (short) (myMinShort / 2);

        System.out.println(myNewByte);
        System.out.println(myNewShort);
    }
}
