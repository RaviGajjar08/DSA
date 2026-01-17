package Maths;

public class Count_Digit {
    static void main(String [] ignoredArgs){
        int n = 12345;
        int count = 0;
        while (n != 0) {
            n = n / 10;
            count++;
        }
        System.out.println("Number of digits: " + count);
    }
}
