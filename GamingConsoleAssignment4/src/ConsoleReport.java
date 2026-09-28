package gamingconsoleassignment;

public class ConsoleSalesReport extends ConsoleSales {

    public ConsoleSalesReport(String consoleType, String storeName, double totalSales) {
        super(consoleType, storeName, totalSales);
    }

    @Override
    public void printReport() {
        System.out.println("Console Type: " + getConsoleType());
        System.out.println("Store Name: " + getStoreName());
        System.out.println("Total Sales: R" + getTotalSales());
        System.out.println("-------------------------");
    }
}
