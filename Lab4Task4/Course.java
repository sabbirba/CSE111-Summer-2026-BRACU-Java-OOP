public class Shop {

    private String name;
    private String[] itemNames;
    private int[] itemPrices;
    private int itemCount;
    private int capacity;


    // Constructor 1
    public Shop(String name, int capacity) {

        this.name = name;
        this.capacity = capacity;

        itemNames = new String[capacity];
        itemPrices = new int[capacity];

        System.out.println(name + " shop created!");
    }


    // Constructor 2
    public Shop(int capacity) {

        name = "Mega";
        this.capacity = capacity;

        itemNames = new String[capacity];
        itemPrices = new int[capacity];

        System.out.println("Mega shop created!");
    }


    // Adds a normal item
    public void addItem(String item, int price) {

        if (itemCount >= capacity) {
            System.out.println(item + ", could not be added");
            return;
        }

        itemNames[itemCount] = item;
        itemPrices[itemCount] = price;

        itemCount++;
    }


    // Copies an item from another Shop object
    public void addItem(Shop sourceShop, String item) {

        int index = sourceShop.findItem(item);

        if (index == -1) {
            System.out.println(
                item + ", not found in " + sourceShop.name + "!"
            );
            return;
        }

        addItem(
            sourceShop.itemNames[index],
            sourceShop.itemPrices[index]
        );
    }


    // Checks whether an item can be purchased
    public void purchase(String item) {

        int index = findItem(item);

        if (index == -1) {
            System.out.println(
                item + ", is not available in this shop"
            );
        } else {
            System.out.println("Purchase Complete!");
        }
    }


    // Searches for an item and returns its index
    private int findItem(String item) {

        for (int i = 0; i < itemCount; i++) {

            if (itemNames[i].equals(item)) {
                return i;
            }
        }

        return -1;
    }


    // Displays Shop information
    public void info() {

        System.out.println("Shop Name: " + name);
        System.out.println("Item Details:");

        if (itemCount == 0) {
            System.out.println("No items in shop");
            return;
        }

        System.out.println(itemCount + " / " + capacity);

        for (int i = 0; i < itemCount; i++) {
            System.out.println(
                itemNames[i] + " - " + itemPrices[i] + " Tk"
            );
        }
    }
}