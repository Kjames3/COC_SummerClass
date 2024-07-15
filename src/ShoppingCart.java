import java.util.ArrayList;

public class ShoppingCart {
    private String customerName;
    private String currentDate;
    private ArrayList<ItemToPurchase> cartItems;

    //Default constructor
    public ShoppingCart() {
        customerName = "none";
        currentDate = "January 1, 2016";
        cartItems = new ArrayList<ItemToPurchase>();
    }

    //Regular constructor
    public ShoppingCart(String customerName, String currentDate) {
        this.customerName = customerName;
        this.currentDate = currentDate;
        cartItems = new ArrayList<ItemToPurchase>();
    }

    // Add item to the cart
    public void addItem(ItemToPurchase itemName) {
        cartItems.add(itemName);
    }

    // Getters
    public String getCustomerName() {
        return customerName;
    }

    public String getDate() {
        return currentDate;
    }

    // Remove item from the cart
    public void removeItem(String itemName) {
        for (int i = 0; i < cartItems.size(); i++) {
            if (cartItems.get(i).getName().equals(itemName)) {
                cartItems.remove(i);
                return;
            }
        }
        System.out.println();
        System.out.println("Item not found in cart. Nothing removed.");
        System.out.println();
    }

    // Modify item in the cart
    public void modifyItem(ItemToPurchase item) {
        // Implement functionality to modify an item in the cart
        for (ItemToPurchase cartItem : cartItems) {
            if (cartItem.getName().equals(item.getName())) {
                if (!item.getDescription().equals("none")) {
                    cartItem.setDescription(item.getDescription());
                }
                if (item.getPrice() != 0) {
                    cartItem.setPrice(item.getPrice());
                }
                if (item.getQuantity() != 0) {
                    cartItem.setQuantity(item.getQuantity());
                }
                return;
            }
        }
        System.out.println("Item not found in cart. Nothing modified.");
        System.out.println();
    }

   // Get number of items in the cart
    public int getNumItemsInCart() {
        int totalItems = 0;
        for (ItemToPurchase item : cartItems) {
            totalItems += item.getQuantity();
        }
        return totalItems;
    }

    // Get total cost of the cart items
    public int getCostOfCart() {
        int totalCost = 0;
        for (ItemToPurchase item : cartItems) {
            totalCost += (item.getPrice() * item.getQuantity());
        }
        return totalCost;
    }

    public void printTotal() {
        System.out.println(customerName + "'s Shopping Cart - " + currentDate);
        System.out.println("Number of Items: " + getNumItemsInCart());
        System.out.println();

        if (cartItems.isEmpty()) {
            System.out.println("SHOPPING CART IS EMPTY");
            System.out.println();
            System.out.println("Total: $0");
            System.out.println();
        } else {
            for (ItemToPurchase item : cartItems) {
                item.printItemCost();
            }
            System.out.println();
            System.out.println("Total: $" + getCostOfCart());
            System.out.println();
        }
    }

    public void printDescription() {
        System.out.println(customerName + "'s Shopping Cart - " + currentDate);
        System.out.println("\nItem Descriptions");
        for (ItemToPurchase item : cartItems) {
            item.printItemDescription();
        }
    }
}
