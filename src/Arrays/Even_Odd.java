// src/Arrays/Even_Odd.java
package Arrays;

import java.util.Scanner;

public class Even_Odd {
     static void main(String[] ignoredArgs) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Array Size: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter the Element " + (i + 1) + ": ");
            arr[i] = sc.nextInt();
        }

        int evenCount = 0;
        int oddCount = 0;

        for (int num : arr) {
            if (num % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }

        System.out.println("Even elements in the array:");
        System.out.println("Count of even numbers: " + evenCount);

        System.out.println("\nOdd elements in the array:");
        System.out.println("Count of odd numbers: " + oddCount);

        sc.close();
    }
}
