/**
 * UC7: Display "OOPS" banner using CharacterPattern class
 * Implements better OOP design and centralized pattern storage.
 *
 * @author Parth Mathur
 * @version 7.0
 */

import java.util.HashMap;
import java.util.Map;

public class OOPSBannerAppUC7 {

    // Inner class to store character and pattern
    static class CharacterPattern {
        char character;
        String[] pattern;

        CharacterPattern(char character, String[] pattern) {
            this.character = character;
            this.pattern = pattern;
        }

        public String[] getPattern() {
            return pattern;
        }
    }

    public static void main(String[] args) {

        Map<Character, CharacterPattern> map = new HashMap<>();

        // Add patterns
        map.put('O', new CharacterPattern('O', new String[]{
                " ***** ",
                "*     *",
                "*     *",
                "*     *",
                "*     *",
                "*     *",
                " ***** "
        }));

        map.put('P', new CharacterPattern('P', new String[]{
                " ***** ",
                "*     *",
                "*     *",
                " ***** ",
                "*      ",
                "*      ",
                "*      "
        }));

        map.put('S', new CharacterPattern('S', new String[]{
                " ***** ",
                "*      ",
                "*      ",
                " ***** ",
                "      *",
                "      *",
                " ***** "
        }));

        String text = "OOPS";

        for (int i = 0; i < 7; i++) {
            StringBuilder line = new StringBuilder();

            for (char c : text.toCharArray()) {
                line.append(map.get(c).getPattern()[i]).append("  ");
            }

            System.out.println(line);
        }
    }
}