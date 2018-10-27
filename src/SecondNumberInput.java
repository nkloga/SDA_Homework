import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
Exercise N.2
Read numbers as long as user will input 5 numbers greater than 0 and then print the largest of them.
NB! User can input more that 5 numbers, if he input negative value or 0

Issue fixed:
    if brackets
 */

public class SecondNumberInput {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int maxNumber = 0;
        int counter = 5;
        while (counter > 0) {
            int numberEntered = Integer.valueOf(reader.readLine());
            if (numberEntered <= 0) {
                System.out.println("Negative numbers or 0 are not supported");
                continue;
            }
            counter--;
            if (numberEntered > maxNumber) {
                maxNumber = numberEntered;
            }
        }
        System.out.println("Max number: " + maxNumber);
    }
}