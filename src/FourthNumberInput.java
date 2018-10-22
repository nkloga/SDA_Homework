import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

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