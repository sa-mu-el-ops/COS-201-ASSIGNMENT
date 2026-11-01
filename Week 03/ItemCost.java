public class ItemCost {
    private String itemName;
    private double unitPrice;
    private int quantity;

    public ItemCost(String itemName, double unitPrice, int quantity) {
        this.itemName = itemName;
        this.unitPrice = unitPrice;
        this.quantity = quantity;
    }

    public String getItemName() {
        return itemName;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public int getQuantity() {
        return quantity;
    }

    public double calculateTotalCost() {
        return unitPrice * quantity;
    }

    public String toString() {
        return "Item: " + itemName + "\nUnit Price: $" + unitPrice + "\nQuantity: " + quantity
                + "\nTotal Cost: $" + calculateTotalCost();
    }

    public static void main(String[] args) {
        ItemCost book = new ItemCost("Java Programming Book", 15.75, 3);

        System.out.println(book.toString());
    }
}
