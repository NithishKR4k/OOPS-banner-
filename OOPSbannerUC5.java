/**
 * 00PSBannerApp UC5 - Render 00PS as Banner using Inline Array Initialization
 * 
 * This use case extends UC4 by defining and populating the String array in a more
 * concise way at the time of declaration using String.join() method to create each
 * line of the banner. This further enhances code readability and maintainability.
 * 
 * @author Developer
 * @version 5.0
 */

// Extend the user story 4 to further develop the 00PS Banner Application by 
// not only using String arrays to hold banner lines and printing them in 
// loop. But also by defining and populating the array in a more concise way 
// at the time of declaration using String.join() method to create each line 
// of the banner.
public class OOPSbannerUC5 {

    public static void main(String[] args) {

        String[] lines = {

            String.join("  ", " ***** ", " ***** ", " ***** ", " ***** "),
            String.join("  ", "*     *", "*     *", "*     *", "*      "),
            String.join("  ", "*     *", "*     *", "*     *", "*      "),
            String.join("  ", "*     *", "*     *", " ***** ", " ***** "),
            String.join("  ", "*     *", "*     *", "*      ", "      *"),
            String.join("  ", "*     *", "*     *", "*      ", "      *"),
            String.join("  ", " ***** ", " ***** ", "*      ", "****** ")

        };   // ✅ Make sure this exists

        for (String line : lines) {
            System.out.println(line);
        }
    }
}