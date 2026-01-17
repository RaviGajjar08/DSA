package ArrayList;

import java.util.ArrayList;

public class ArrayListOperation {
    static void main(String[] ignoredArgs) {
        ArrayList<Integer> list = new ArrayList<>();
        // Adding elements to the ArrayList
        list.add(10);
        list.add(20);
        list.add(30);

        // Printing the elements of the ArrayList
        System.out.println("ArrayList elements: " + list);

        //Adding element at specific index
        list.add(1, 15);
        System.out.println("ArrayList after adding 15 at index 1: " + list);

        // Updating an element
        list.set(1, 25);
        System.out.println("ArrayList after update: " + list);

        // Accessing elements by index
        System.out.println("Element at index 1: " + list.get(1));

        // Removing an element
        list.remove(2);
        System.out.println("ArrayList after removing element at index 2: " + list);

        // Size of the ArrayList
        System.out.println("Size of the ArrayList: " + list.size());

        //Find the index of an element
        System.out.println("Index of element 30: " + list.indexOf(30));

        //Remove all elements
        list.clear();
        System.out.println("ArrayList after clearing all elements: " + list);

        //String Representation
        list.add(100);
        list.add(200);
        System.out.println("String representation of ArrayList: " + list.toString());


    }
}
