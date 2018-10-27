import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
Exercise N.4
Read numbers as long as user will input 5 numbers greater than 0 and
5 numbers smaller than 0 and then print their sum.

Issue fixed:
    it is possible to add more than 5 negative numbers, counter can go below 0, implement in two separate blocks
    even better to make a method that could be called twice
 */

public class FourthNumberInput {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int maxCounter = 5;
        int minCounter = 5;
        int sumNumbers = 0;

        while (true) {
            int numberEntered = Integer.valueOf(reader.readLine());
            if (numberEntered < 0) {
                if (minCounter > 0) {
                    sumNumbers += numberEntered;
                    minCounter--;
                }
            }

            if (numberEntered > 0) {
                if (maxCounter > 0) {
                    sumNumbers += numberEntered;
                    maxCounter--;
                }
            }

            if (maxCounter == 0 && minCounter == 0) {
                System.out.println("Sum of the numbers: " + sumNumbers);
                break;
            }
        }
    }
}

