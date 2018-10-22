import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ThirdNumberInput {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int maxNumber = 0;
        int minNumber = 0;
        int counter = 5;
        while (counter > 0) {
            int numberEntered = Integer.valueOf(reader.readLine());
            if (numberEntered > 0) {
                counter--;
                if (numberEntered > maxNumber) maxNumber = numberEntered;
            }
            if (numberEntered < minNumber) minNumber = numberEntered;
        }
        System.out.println("Max number: " + maxNumber);
        System.out.println("Min number: " + minNumber);
    }
}