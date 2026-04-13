/**
 * UC6: Display "OOPS" banner using static helper methods
 * Improves modularity and reusability using DRY principle.
 *
 * @author Parth Mathur
 * @version 6.0
 */

public class OOPSBannerAppUC6 {

    public static void main(String[] args) {

        String[] o = getO();
        String[] p = getP();
        String[] s = getS();

        for (int i = 0; i < o.length; i++) {
            System.out.println(
                o[i] + "  " + o[i] + "  " + p[i] + "  " + s[i]
            );
        }
    }

    // Function for letter O
    public static String[] getO() {
        return new String[]{
            " ***** ",
            "*     *",
            "*     *",
            "*     *",
            "*     *",
            "*     *",
            " ***** "
        };
    }

    // Function for letter P
    public static String[] getP() {
        return new String[]{
            " ***** ",
            "*     *",
            "*     *",
            " ***** ",
            "*      ",
            "*      ",
            "*      "
        };
    }

    // Function for letter S
    public static String[] getS() {
        return new String[]{
            " ***** ",
            "*      ",
            "*      ",
            " ***** ",
            "      *",
            "      *",
            " ***** "
        };
    }
}