package Arrays;

public class Search {
    static void main(String[] ignoredArgs) {
        java.util.Scanner sc = new java.util.Scanner(System.in);

        System.out.print("Enter the Array Size: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter the Element " + (i + 1) + ": ");
            arr[i] = sc.nextInt();
        }

        System.out.println();

        System.out.print("Enter the Element to Search: ");
        int target = sc.nextInt();
        boolean found = false;
        for (int i=0; i<arr.length; i++) {
            if (arr[i] == target) {
                System.out.println("Element " + target + " is found at index " + i + ".");
                found = true;
                break;
            }
        }
        System.out.println();
        if(!found) {
            System.out.println("Element " + target + " is not found in the array.");
        }
        sc.close();
    }
}
