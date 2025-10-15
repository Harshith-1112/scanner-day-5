public class GroceryBill {
    public static void main(String[] args) {
        // Example inputs
        double price = 49.99;   // price of one item
        int quantity = 3;       // quantity purchased

        // Calculate total
        double total = price * quantity;

        // Round down to nearest lower whole number
        int finalAmount = (int) Math.floor(total);

        System.out.println("Total bill: " + finalAmount);
    }
}