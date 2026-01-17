package ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class Sum {
    static void main(String[] ignoredArgs) {
        ArrayList<Integer> arr = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the list");
        int n = sc.nextInt();
        System.out.println("Enter the elements of the list");
        for (int i = 0; i < n; i++) {
            arr.add(sc.nextInt());
        }
        int sum = 0;
        for (int num : arr) {
            sum += num;
        }
        System.out.println("The sum of the elements in the list is: " + sum);
        sc.close();
    }

}
