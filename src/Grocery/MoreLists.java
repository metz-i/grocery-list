package Grocery;

import java.util.ArrayList;
import java.util.List;

public class MoreLists {

    public static void main(String[] args) {

        String[] items = {"apples", "bananas", "milk", "eggs"};

        List<String> list = List.of(items);
        System.out.println(list);
        // returns:
        // [apples, bananas, milk, eggs]

        System.out.println(list.getClass().getName());
        // returns:
        // java.util.ImmutableCollections$ListN

        // list.add("yogurt");

        ArrayList<String> groceries = new ArrayList<>(list);
        groceries.add("yogurt");
        System.out.println(groceries);
        // [apples, bananas, milk, eggs, yogurt]

    }
}
