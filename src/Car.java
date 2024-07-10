public class Car {
    private int modelYear;
    private int currentValue;
    private int purchasePrice;

    public void setModelYear(int modelYear) {
        this.modelYear = modelYear;
    }
    public int getModelYear() {
        return modelYear;
    }
    public void setPurchasePrice(int purchasePrice) {
        this.purchasePrice = purchasePrice;
    }
    public int getPurchasePrice() {
        return purchasePrice;
    }

    public void calculateCurrentValue(int currentYear) {
        double depreciationRate = 0.15;
        int carAge = currentYear - modelYear;

        //Car depreciation formula
        currentValue = (int) (purchasePrice * Math.pow(1 - depreciationRate, carAge));
    }
    public void printInfo() {
        System.out.println("Car's information:");
        System.out.printf("\tModel Year: %d\n", modelYear);
        System.out.printf("\tPurchase Price: $%d\n", purchasePrice);
        System.out.printf("\tCurrent Value: $%d\n", currentValue);
    }
}
