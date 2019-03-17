package com.kam.coursechat.hacktheglobe;

public class globalData {
    static boolean isUrban = true;

    public static boolean getArea () {
        return isUrban;
    }

    public static void toggleArea () {
        isUrban = !isUrban;
    }

}
