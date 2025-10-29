public class ShoppingCart {
    public static void main(String[] args) {
        String[] prices = {"250", "499", "99", "abc", "100"};

        int totalPrice = 0;
        for (String price : prices) {
            try {
                int numericPrice = Integer.parseInt(price);
                totalPrice += numericPrice;
            } catch (NumberFormatException e) {
                System.out.println("Invalid price encountered: " + price + ". Skipping...");
            }
        }

        System.out.println("Total price = " + totalPrice);
    }
}
