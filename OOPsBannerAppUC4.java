/**
 * UC4: Display "OOPS" banner using String array and loop
 * Improves modularity and reusability.
 *
 * @author Parth Mathur
 * @version 4.0
 */

public class OOPSBannerAppUC4 {

    public static void main(String[] args) {

        String[] banner = {

            String.join("  ", " ***** ", " ***** ", " ***** ", " ***** "),
            String.join("  ", "*     *", "*     *", "*     *", "*     "),
            String.join("  ", "*     *", "*     *", "*     *", "*     "),
            String.join("  ", "*     *", "*     *", "*     *", " *****"),
            String.join("  ", "*     *", "*     *", "*     *", "      *"),
            String.join("  ", "*     *", "*     *", "*     *", "      *"),
            String.join("  ", " ***** ", " ***** ", " ***** ", " ***** ")

        };

        for (String line : banner) {
            System.out.println(line);
        }
    }
}