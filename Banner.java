import java.util.HashMap;
import java.util.Map;

public class Banner {

    private Map<Character, String[]> patterns;

    public Banner() {
        patterns = new HashMap<>();

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
                String[] pattern = patterns.get(ch);
                if (pattern != null) {
                    System.out.print(pattern[row] + "  ");
                }
            }
            System.out.println();
        }
    }
}