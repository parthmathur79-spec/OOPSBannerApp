/**
 * UC5: Display "OOPS" banner using inline array initialization
 * with String.join() for concise and readable code.
 *
 * @author Parth Mathur
 * @version 5.0
 */

public class OOPSBannerAppUC5 {

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