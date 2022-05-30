import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SimpleCalculator {
    //declare global variables
    static double diff, sum, prod, quot;
    public static void main(String[] args) throws IOException {
        System.out.println("This is a simple calculator. it can help you find \n a) Sum \n b) Difference \n c) Product \n d) Quotient");

        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));

        //get first number
        System.out.print("To begin please type in the first number: ");
        double firstValue = Double.parseDouble(r.readLine());

        //get second number
        System.out.print("Please type in the second number: ");
        double secondValue =  Double.parseDouble(r.readLine());

        double difference = findDifference(firstValue, secondValue);
        double sum = findSum(firstValue, secondValue);
        double product = findProduct(firstValue, secondValue);
        double quotient = findQuotient(firstValue, secondValue);

        //outputs for final result
        System.out.println("___________________________");
        System.out.printf("The Difference is: " + difference + "\nThe Sum is: " + sum + "\nThe Product is: " + product + "\nThe Quotient is: %.2f" , quotient);

    }

    //method to find the difference of two numbers
    static double findDifference(double a, double b) {
        diff = a - b;
        return diff;
    }

    //method to find the product of two numbers
    static double findProduct(double a, double b) {
        prod = a * b;
        return prod;
    }

    //method to find the sum of two numbers
    static double findSum(double a, double b) {
        sum = a + b;
        return sum;
    }

    //method to find the quotient of two numbers
    static double findQuotient(double a, double b) {
        quot = a / b;
        return quot;
    }

}
