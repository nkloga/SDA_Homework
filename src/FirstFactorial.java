import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FirstFactorial {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int readNumber = Integer.valueOf(reader.readLine());
        int result = 1;
        for (int i = 1; i < readNumber+1; i++) {
            result *= i;
        }
        System.out.println("Number entered: " + readNumber);
        System.out.println(readNumber + "! using loop = " + result);
        System.out.println(readNumber + "! using regression = " + factorial(readNumber));
    }

    public static int factorial(int number){
        int result = 1;
        while(true){
            if (number == 0) {
                return 1;
            }
            else  {
                return number*factorial(number - 1);
            }
        }
    }
}
