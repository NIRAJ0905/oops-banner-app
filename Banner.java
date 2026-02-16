import java.util.HashMap;
import java.util.Map;

public class Banner {

    private Map<Character, String[]> patterns = new HashMap<>();

    public Banner() {
        registerDefaultPatterns();
    }

    private void registerDefaultPatterns() {
        addPattern('O', new String[]{
            " *** ",
            "*   *",
            "*   *",
            "*   *",
            " *** "
        });

        addPattern('P', new String[]{
            "**** ",
            "*   *",
            "**** ",
            "*    ",
            "*    "
        });

        addPattern('S', new String[]{
            " ****",
            "*    ",
            " *** ",
            "    *",
            "**** "
        });
    }

    public void addPattern(char ch, String[] pattern) {
        patterns.put(ch, pattern);
    }

    public void print(String text) {
        text = text.toUpperCase();

        for (int row = 0; row < 5; row++) {
            for (char ch : text.toCharArray()) {
                String[] p = patterns.get(ch);
                if (p != null) {
                    System.out.print(p[row] + "  ");
                }
            }
            System.out.println();
        }
    }
}