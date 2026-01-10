package Arrays;

import java.util.Scanner;

public class Reverse {
    static void main(String[] ignoredArgs) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Array Size: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter the Element " + (i + 1) + ": ");
            arr[i] = sc.nextInt();
        }

        System.out.print("The original array is:");
        printArray(arr);

        reverseArray(arr);

        System.out.print("The reversed array is: ");
        printArray(arr);

        sc.close();
    }

    static void reverseArray(int[] arr) {
        int left = 0;
        int right = arr.length - 1;
        while (left < right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
    }

    static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
