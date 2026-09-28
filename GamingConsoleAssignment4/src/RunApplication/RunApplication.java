
package gamingconsoleassignment;
public class RunApplication {
    public static void main(String[] args) {
        ConsoleSalesReport report1 =
                new ConsoleSalesReport("PS5", "Cape Town", 6000);
        ConsoleSalesReport report2 =
                new ConsoleSalesReport("XBOX", "Port Elizabeth", 9000);
        ConsoleSalesReport report3 =
                new ConsoleSalesReport("Nintendo Switch", "Pretoria", 3800);
        System.out.println("GAMING CONSOLE SALES REPORT");
        System.out.println("============================");
        report1.printReport();
        report2.printReport();
        report3.printReport();
    }
}
