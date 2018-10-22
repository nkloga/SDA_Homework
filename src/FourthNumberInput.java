import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
Exercise N.4
Read numbers as long as user will input 5 numbers greater than 0 and 5 numbers smaller than 0 and then print their sum.
 */

public class FourthNumberInput {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int sumNumbers = 0;
        int maxCounter = 5;
        int minCounter = 5;
        while (maxCounter > 0 || minCounter > 0) {
            int numberEntered = Integer.valueOf(reader.readLine());
            if (numberEntered > 0) {
                maxCounter--;
            } else {
                minCounter--;
            }
            sumNumbers += numberEntered;
        }
        System.out.println("Sum of the numbers: " + sumNumbers);
    }
}