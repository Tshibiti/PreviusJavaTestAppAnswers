package movieSaleReport;

public class MovieReport {

    public static void main(String[] args) {
        // Movies (1D array)
        String[] movies = {"Napoleon", "Oppenheimer"};

        // Ticket sales for Jan, Feb, Mar (2D array)
        int[][] sales = {
            {3000, 1500, 1700}, // Napoleon
            {3500, 1200, 1600} // Oppenheimer
        };

        // Months
        String[] months = {"JAN", "FEB", "MAR"};

        // Print heading
        System.out.println("MOVIE TICKET SALES REPORT - 2024");
        System.out.println();

        // Print months header
        System.out.print("\t\t\t");
        for (int i = 0; i < months.length; i++) {
            System.out.print(months[i] + "\t");
        }
        System.out.println();

        // Print line
        System.out.println("-------------------------------------------------------");

        // Track top movie
        int topTotal = 0;
        String topMovie = "";

        // Loop through movies
        for (int i = 0; i < movies.length; i++) {
            System.out.print(movies[i] + "\t");

            for (int j = 0; j < sales[i].length; j++) {
                System.out.print("\t" + sales[i][j]);
                //total += sales[i][j];
            }
            System.out.println();
        }
        System.out.println("");
        for (int i = 0; i < movies.length; i++) {
            int total = 0;
            for (int j = 0; j < sales[i].length; j++) {

                total += sales[i][j];

                // Track top performing movie
                if (total > topTotal) {
                    topTotal = total;
                    topMovie = movies[i];
                }

            }
            System.out.println("Total movie ticket sales for " + movies[i] + " " + total);// Show total sales after each movie
        }
        System.out.println("");
        // Print top performing movie
        System.out.println("Top performing movie: " + topMovie);
    }
}
