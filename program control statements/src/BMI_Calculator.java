import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static java.lang.Math.pow;
import static java.lang.Math.round;

public class BMI_Calculator {
    static double BMI;

    public static void main(String[] args) throws IOException {
        System.out.println("This is a BMI calculator");

        //class to read data from user
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));

        //get height from user in cm
        System.out.print("Please type in your height (cm): ");
        float height = Float.parseFloat(r.readLine());

        //Get weight from user in kg
        System.out.print("Please type in your weight (kg): ");
        float weight = Float.parseFloat(r.readLine());

        //pass the data as parameters to the getBMI method
        double BMI_Result = round(getBMI(height, weight));

        //output
        if (BMI_Result <= 16.00) System.out.println("Your BMI index is: %.2f" + BMI_Result + "which means Starvation");
        else if (BMI_Result >= 16.00 && BMI_Result <= 16.99)
            System.out.println("Your BMI index is: " + BMI_Result + " which means Emaciation");
        else if (BMI_Result >= 17.00 && BMI_Result <= 18.49)
            System.out.println("Your BMI index is: " + BMI_Result + " which means underweight");
        else if (BMI_Result >= 18.50 && BMI_Result <= 22.99)
            System.out.println("Your BMI index is: " + BMI_Result + " which means Normal, low range");
        else if (BMI_Result >= 23.00 && BMI_Result <= 24.99)
            System.out.println("Your BMI index is: " + BMI_Result + " which means Normal, high range");
        else if (BMI_Result >= 25.00 && BMI_Result <= 27.49)
            System.out.println("Your BMI index is: " + BMI_Result + " which means overweight, low range");
        else if (BMI_Result >= 27.50 && BMI_Result <= 29.99)
            System.out.println("Your BMI index is: " + BMI_Result + " which means overweight, high range");
        else if (BMI_Result >= 30 && BMI_Result <= 34.9)
            System.out.println("Your BMI index is: " + BMI_Result + " which means 1st degree obesity");
        else if (BMI_Result >= 35 && BMI_Result <= 39.9)
            System.out.println("Your BMI index is: " + BMI_Result + " which means 2nd degree obesity");
        else System.out.println("Your BMI index is: " + BMI_Result + " which means 3rd degree obesity");

    }

    //method to calculate BMI
    static double getBMI(float height, float weight) {
        float heightInMeters = height / 100; //converting heights in cm to meters
        BMI = (double) weight / (pow(heightInMeters, 2)); //formula to calculate BMI is kg/m^2
        return BMI;
    }

}
