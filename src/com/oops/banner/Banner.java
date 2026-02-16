package com.oops.banner;

import java.util.HashMap;
import java.util.Map;

public class Banner {

    private Map<Character, String[]> patterns = new HashMap<>();

    public Banner() {
        registerDefaultPatterns();
    }

    private void registerDefaultPatterns() {
        patterns.put('O', new String[]{
                " *** ",
                "*   *",
                "*   *",
                "*   *",
                " *** "
        });

        patterns.put('P', new String[]{
                "**** ",
                "*   *",
                "**** ",
                "*    ",
                "*    "
        });

        patterns.put('S', new String[]{
                " ****",
                "*    ",
                " *** ",
                "    *",
                "**** "
        });
    }

    public void print(String text) {
        text = text.toUpperCase();

        for (int row = 0; row < 5; row++) {
            for (char ch : text.toCharArray()) {
                if (patterns.containsKey(ch)) {
                    System.out.print(patterns.get(ch)[row] + "  ");
                }
            }
            System.out.println();
        }
    }
}