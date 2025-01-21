// Calculate and output the total cost of a number of items

public class Cost {

    public static void main(String[] args) {

        // Create variables of different data types
        int items = 50;
        float costPerItem = 9.99f;
        float totalCost = items * costPerItem;
        char currency = '$';

        // Print number of items
        System.out.println("Number of items: " + items);

        // Print cost per item with currency
        System.out.println("Cost per item: " + costPerItem + currency);

        // Print total cost with currency
        System.out.println("Total cost = " + totalCost + currency);
    }
}
