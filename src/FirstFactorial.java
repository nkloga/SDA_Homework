import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
Exercise N.1
Read one number and print its factorial using only multiplication.
1. Make that task with cycle
+ you can try make that task with recursion

Issue fixed:
    use => instead of  > something + 1
    factorial had while???
 */

public class FirstFactorial {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int readNumber = Integer.valueOf(reader.readLine());
        int result = 1;
        for (int i = 1; i <= readNumber; i++) {
            result *= i;
        }
        System.out.println("Number entered: " + readNumber);
        System.out.println(readNumber + "! using loop = " + result);
        System.out.println(readNumber + "! using regression = " + factorial(readNumber));
    }

    public static int factorial(int number) {
            if (number == 0) {
                return 1;
            } else {
                return number * factorial(number - 1);
            }
        }
    }
