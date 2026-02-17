package com.oops.banner;

/**
 * OOPSBannerApp - UC4
 * Render OOPS banner using String Array and Loop
 *
 * @author Niraj
 * @version 4.0
 */
public class OOPSBannerApp {

    public static void main(String[] args) {

        // Step 1: Create String array of size 7
        String[] banner = new String[7];

        // Step 2: Populate array using String.join()

        banner[0] = String.join(" ",
                " ******** ",
                " ******** ",
                " ******** ",
                " ******** ");

        banner[1] = String.join(" ",
                " *      * ",
                " *      * ",
                " *      * ",
                " *        ");

        banner[2] = String.join(" ",
                " *      * ",
                " *      * ",
                " *      * ",
                " *        ");

        banner[3] = String.join(" ",
                " *      * ",
                " *      * ",
                " ******** ",
                " ******** ");

        banner[4] = String.join(" ",
                " *      * ",
                " *      * ",
                " *        ",
                "        * ");

        banner[5] = String.join(" ",
                " *      * ",
                " *      * ",
                " *        ",
                "        * ");

        banner[6] = String.join(" ",
                " ******** ",
                " ******** ",
                " *        ",
                " ******** ");

        // Step 3: Print using enhanced for-loop
        for (String line : banner) {
            System.out.println(line);
        }
    }
}
