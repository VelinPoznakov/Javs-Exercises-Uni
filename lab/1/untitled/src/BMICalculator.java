import java.util.Scanner;

public class BMICalculator {
    public static void printIntroduction(){
        System.out.println("This is a BMICalculator program.");
    }

    public static double getBMI(Scanner scanner){
        System.out.print("Enter your weight and height: ");
        double weight = scanner.nextDouble();
        double height = scanner.nextDouble();
        double[] info = {weight, height};
        return bmiFor(info);

    }

    public static double bmiFor(double[] info){
        return Math.round(info[0] * 703/(info[1]*info[1]));
    }

    // underweight, normal, overweight, obese.
    public static String getStatus(double num){
        if(num <= 18.5){
            return "Underweight";
        }
        else if(num <= 25){
            return "Normal";
        }
        else if(num <= 30){
            return "Overweight";
        }
        else{
            return "Obese";
        }
    }

    public static void reportResults(double num){
        String status = getStatus(num);

        System.out.println("Your result is: " + status + " and you are: " + status);
    }
}
