package com.oops.banner;

public class OOPSBannerApp {

    public static void main(String[] args) {
        printBanner();
    }

    public static void printBanner() {

        printLine(" ******** ", " ******** ", " ******** ", " ******** ");
        printLine(" *      * ", " *      * ", " *      * ", " *        ");
        printLine(" *      * ", " *      * ", " *      * ", " *        ");
        printLine(" *      * ", " *      * ", " ******** ", " ******** ");
        printLine(" *      * ", " *      * ", " *        ", "        * ");
        printLine(" *      * ", " *      * ", " *        ", "        * ");
        printLine(" ******** ", " ******** ", " *        ", " ******** ");
    }

    public static void printLine(String o1, String o2, String p, String s) {
        System.out.println(o1 + o2 + p + s);
    }
}