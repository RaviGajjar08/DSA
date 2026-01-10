package Arrays;

public class Average {
    static void main(String[] ignoredArgs) {
        java.util.Scanner sc = new java.util.Scanner(System.in);

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
        double average = (double) sum / n;
        System.out.println("The average of array is " + average);
        sc.close();
    }
}
