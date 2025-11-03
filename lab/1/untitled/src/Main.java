import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        int i = 1;
//        int y = 2;
//        int z = i +y;
//        System.out.println(z);
//
//        String firstName = "John";
//        String lastName = "Smith";
//        System.out.println(firstName + " " + lastName);
//
//        Scanner sc = new Scanner(System.in);
//        String name = sc.nextLine();
//        System.out.println(name);
//        sc.close();

//        int[] arr = {1, 2, 3};
//        testingMethod(arr);
//        System.out.println(Arrays.toString(arr));


//        Scanner scanner = new Scanner(System.in);
//        BMICalculator.printIntroduction();
//        double res = BMICalculator.getBMI(scanner);
//        System.out.println("Your body mass index is: " + res);
//        BMICalculator.reportResults(res);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = scanner.nextLine();
        System.out.println("Enter your age: ");
        int age = scanner.nextInt();
        System.out.println("Enter your work experience: ");
        int workExperience = scanner.nextInt();
        System.out.println("Enter your dream salary: ");
        double salary = scanner.nextDouble();
        System.out.println("Enter your number of skills: ");
        int skills = scanner.nextInt();
        String[] skillNames = new String[skills];
        for (int i = 0; i < skills; i++) {
            skillNames[i] = scanner.nextLine();
        }
        System.out.println("Enter where do you live");
        String live = scanner.nextLine();

        String typeOfSkills = Arrays.toString(skillNames);

        System.out.println("I am " + name
        + " and I am " + age + " years old and I have " + workExperience +
                " work experience and I want " + salary + "BGN per month " +
                "and live in " + live + "and have experience with " + typeOfSkills);









    }

    public static void testingMethod(int[] arr) {
        for (int i = 0; i < arr.length; i++){
            arr[i]++;
        }
    }
}