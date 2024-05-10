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

        ArrayList<String> groceriesTwo = new ArrayList<>(
                List.of("pickles", "mustard", "cheese"));
        System.out.println(groceriesTwo);
        // [pickles, mustard, cheese]

        // Adding groceriesTwo to groceries:
        groceries.addAll(groceriesTwo);
        System.out.println(groceries);
        // [apples, bananas, milk, eggs, yogurt, pickles, mustard, cheese]

        System.out.println("Third item = " + groceries.get(2));

        if (groceries.contains("mustard")) {
            System.out.println("list contains mustard");
        }

        groceries.add("yogurt"); // added another "yogurt" to the list
        System.out.println("first = " + groceries.indexOf("yogurt"));
        System.out.println("last = " + groceries.lastIndexOf("yogurt"));
    }
}
