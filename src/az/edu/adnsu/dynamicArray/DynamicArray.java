package az.edu.adnsu.dynamicArray;

public class DynamicArray {

    public int[] items; // by default it is null

    public int countOfItems; // by default it is 0

    public DynamicArray(int length) {
        this.items = new int[length];
    }

    public void insert(int value) {

        if (items.length == countOfItems) {

            int[] newArray = new int[countOfItems * 2];

            for (int i = 0; i < countOfItems; i++) {
                newArray[i] = items[i];
            }

            items = newArray;

        }

        items[countOfItems] = value;
        countOfItems += 1;

    }

    public void removeAt(int index) {

        if (index < 0 || index > countOfItems) throw new IllegalStateException();

        for (int i = index; i < countOfItems - 1; i++) {
            items[i] = items[i + 1];
        }

        countOfItems -= 1;

    }

}
