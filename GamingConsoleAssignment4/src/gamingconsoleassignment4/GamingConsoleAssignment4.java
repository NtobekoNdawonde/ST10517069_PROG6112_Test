package gamingconsoleassignment;
public class GamingConsoleAssignment {
    public static void main(String[] args) {
        // Console names
        String[] consoles = {"PS5", "XBOX", "Nintendo Switch"};
        // Sales data
        int[][] sales = {
            {1000, 2000, 3000},  // Cape Town
            {2000, 3000, 4000},  // Port Elizabeth
            {1500, 1100, 1200}   // Pretoria
        };
        // City names
        String[] cities = {"Cape Town", "Port Elizabeth", "Pretoria"};
        // Display sales report
        System.out.println("GAMING CONSOLE SALES REPORT");
        System.out.println("============================");
        for (int i = 0; i < cities.length; i++) {
            int total = 0;
            System.out.println("\nCity: " + cities[i]);
            for (int j = 0; j < consoles.length; j++) {
                System.out.println(consoles[j] + ": " + sales[i][j]);
                total += sales[i][j];
            }
            System.out.println("Total Sales: " + total);
        }
        // Find city with highest sales
        int highestSales = 0;
        String highestCity = "";
        for (int i = 0; i < cities.length; i++) {
            int total = 0;
            for (int j = 0; j < consoles.length; j++) {
                total += sales[i][j];
            }
            if (total > highestSales) {
                highestSales = total;
                highestCity = cities[i];
            }
        }
        System.out.println("\n============================");
        System.out.println("Highest Sales: " + highestCity);
        System.out.println("Highest Total: " + highestSales);
    }
}

     
 
