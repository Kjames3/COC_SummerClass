import java.util.ArrayList;

public class ShoppingCart {
    private String customerName;
    private String currentDate;
    private ArrayList<String> cartItems;

    //Default constructor
    public ShoppingCart() {
        customerName = "none";
        currentDate = "January 1, 2016";
        cartItems = new ArrayList<String>();
    }

    //Regular constructor
    public ShoppingCart(String customerName, String currentDate) {
        this.customerName = customerName;
        this.currentDate = currentDate;
        cartItems = new ArrayList<String>();
    }

    public void addItem(String itemName) {
        cartItems.add(itemName);
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getCurrentDate() {
        return currentDate;
    }

    public void removeItem(String itemName) {
        cartItems.remove(itemName);
    }

    public void modifyItem(String itemName, String newDescription, int newPrice) {
        // Implement functionality to modify an item in the cart
        for (int i = 0; i < cartItems.size(); i++) {
            if (cartItems.get(i).equals(itemName)) {
                break;
            }
        }
    }

    public int getNumItemsInCart() {
        return cartItems.size();
    }

    public int getCostOfCart() {
        // Implement functionality to calculate the total cost of the cart items
        return 0;
    }

    public void printTotal() {

    }

    public void printDescription() {

    }
}
