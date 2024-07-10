public class ItemToPurchase {
    private String itemName;
    private String itemDescription;
    private int itemPrice;
    private int itemQuantity;

    //Default constructor
    public ItemToPurchase() {
        itemName = "none";
        itemDescription = "none";
        itemPrice = 0;
        itemQuantity = 0;
    }

    //Regular constructor
    public ItemToPurchase(String name, String description, int price, int quantity) {
        itemName = name;
        itemDescription = description;
        itemPrice = price;
        itemQuantity = quantity;
    }

    public void setName(String name) {
        this.itemName = name;
    }

    public void setDescription(String description) {
        this.itemDescription = description;
    }

    public void setPrice(int price) {
        this.itemPrice = price;
    }

    public void setQuantity(int quantity) {
        this.itemQuantity = quantity;
    }

    public String getName() {
        return itemName;
    }

    public String getDescription() {
        return itemDescription;
    }

    public int getPrice() {
        return itemPrice;
    }

    public int getQuantity() {
        return itemQuantity;
    }

    public void printItemCost() {
        System.out.printf("%s %s @ $%d = $%d\n", itemName, itemQuantity, itemPrice, (itemPrice * itemQuantity));
    }

    public void printItemDescription() {
        System.out.printf("%s: %s\n", itemName, itemDescription);
    }
}
