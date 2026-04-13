/**
 * UC8: Final version using HashMap and rendering function
 * Demonstrates clean separation of data and logic.
 *
 * @author Parth Mathur
 * @version 8.0
 */

import java.util.HashMap;
import java.util.Map;

public class OOPSBannerAppUC8 {

    public static void main(String[] args) {

        Map<Character, String[]> patterns = createPatternMap();

        String text = "OOPS";

        renderBanner(text, patterns);
    }

    // Create and return map
    public static Map<Character, String[]> createPatternMap() {

        Map<Character, String[]> map = new HashMap<>();

        map.put('O', new String[]{
                " ***** ",
                "*     *",
                "*     *",
                "*     *",
                "*     *",
                "*     *",
                " ***** "
        });

        map.put('P', new String[]{
                " ***** ",
                "*     *",
                "*     *",
                " ***** ",
                "*      ",
                "*      ",
                "*      "
        });

        map.put('S', new String[]{
                " ***** ",
                "*      ",
                "*      ",
                " ***** ",
                "      *",
                "      *",
                " ***** "
        });

        return map;
    }

    public static void renderBanner(String text, Map<Character, String[]> map) {

        int height = 7;

        for (int i = 0; i < height; i++) {

            StringBuilder line = new StringBuilder();

            for (char c : text.toCharArray()) {

                line.append(map.get(c)[i]).append("  ");
            }

            System.out.println(line);
        }
    }
}