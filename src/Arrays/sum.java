package Arrays;

import java.util.Scanner;

public class sum {
    static void main(String[] ignoredArgs) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Array Size: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter the Element " + (i + 1) + ": ");
            arr[i] = sc.nextInt();
        }

        int sum = 0;
        for (int num : arr) {
            sum += num;
        }
        System.out.println("The sum of array is  " + sum);
        sc.close();
    }
}
