package com.oops.banner;

import java.util.Scanner;

public class OOPSBannerApp {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter text to print as banner: ");
        String input = scanner.nextLine();

        Banner banner = new Banner();
        banner.print(input);

        scanner.close();
    }
}