public class usercase {

    public static void main(String[] args) {


        String[] lines = {

            String.join("  ",
                    " ***** ",
                    " ***** ",
                    " ******",
                    " ***** "
            ),

            String.join("  ",
                    "*     *",
                    "*     *",
                    "*     *",
                    "*     "
            ),

            String.join("  ",
                    "*     *",
                    "*     *",
                    "****** ",
                    " ***** "
            ),

            String.join("  ",
                    "*     *",
                    "*     *",
                    "*      ",
                    "      *"
            ),

            String.join("  ",
                    " ***** ",
                    " ***** ",
                    "*      ",
                    " ***** "
            )
        };

        // Use a loop to print each line of the banner
        for (String line : lines) {
            System.out.println(line);
        }
    }
}