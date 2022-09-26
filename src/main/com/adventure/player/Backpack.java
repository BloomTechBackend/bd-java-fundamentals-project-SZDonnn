package main.com.adventure.player;

import main.com.adventure.world.objects.Tangible;

/**
 * Stores any Tangible item up to the MAX_CAPACITY.
 */
public class Backpack {

    private static final int MAX_CAPACITY = 5;
    private final Tangible[] items = new Tangible[MAX_CAPACITY];

    /**
     * Adds an item to the backpack array only if there's an empty space in the array.
     *
     * @param item - item to add to the backpack array.
     * @return - true if the item is added. Otherwise, false.
     */
    public boolean addItem(Tangible item) {
        //TODO Complete the function
        boolean isItemAdded = false;
        for (int index = 0; index < MAX_CAPACITY; index++) {
            if (items[index] == null) {
                items[index] = item;
                isItemAdded = true;
                break;
            }
        }
        return isItemAdded;
    }

    /**
     * Checks each backpack item's name to see if it matches the given name.
     *
     * @param name - the name of the item to search for.
     * @return - the item if it exists. Otherwise, null.
     */
    public Tangible getItem(String name) {
        //TODO Complete the function
        Tangible getThisItem = null;
        for (int index = 0; index < MAX_CAPACITY; index++) {
            if (items[index] != null) {
                if (name.equals(items[index].getName())) {
                    getThisItem = items[index];
                    break;
                }
            }
        }
        return getThisItem;
    }

    /**
     * Checks if the given item exists in the backpack based on the item's name, and removes the item if it's found.
     *
     * @param item - item to remove
     * @return - true if the item was removed. Otherwise, false.
     */
    public boolean removeItem(Tangible item) {
        //TODO Complete the function
        boolean isItemRemoved = false;
        for (int index = 0; index < MAX_CAPACITY; index++) {
            if (item == items[index]) {
                items[index] = null;
                isItemRemoved = true;
                break;
            }
        }
        return isItemRemoved;
    }

    /**
     * Prints the contents of the backpack. Before printing the contents, the following line should
     * be printed:
     * <p>
     * "Here are the items in your backpack:"
     * <p>
     * Then each item should be printed with " - " before it.
     */
    public void printItems() {
        //TODO Complete the function
        System.out.println("Here are the items in your backpack:");
        for (int i = 0; i < MAX_CAPACITY; i++) {
            System.out.println(" - " + items[i]);
        }
    }
}
