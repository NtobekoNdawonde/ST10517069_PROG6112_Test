
package gamingconsoleassignment;

public abstract class ConsoleSales implements IConsole {

    private String consoleType;
    private String storeName;
    private double totalSales;

    public ConsoleSales(String consoleType, String storeName, double totalSales) {
        this.consoleType = consoleType;
        this.storeName = storeName;
        this.totalSales = totalSales;
    }

    public String getConsoleType() {
        return consoleType;
    }

    public String getStoreName() {
        return storeName;
    }

    public double getTotalSales() {
        return totalSales;
    }
}