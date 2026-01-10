package Arrays;

public class Min {
    public static  void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);

        System.out.print("Enter the Array Size: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter the Element " + (i + 1) + ": ");
            arr[i] = sc.nextInt();
        }

        int min = arr[0];
        for (int num : arr) {
            if (num < min) {
                min = num;
            }
        }
        System.out.println("The minimum element in the array is " + min);
        sc.close();
    }
}
