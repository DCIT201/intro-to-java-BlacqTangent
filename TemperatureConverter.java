import java.util.Scanner;
public class TemperatureConverter {

    public static void main(String[]args) {

      // Create a Scanner object to read input from user
        Scanner scanner = new Scanner(System.in);

        //Display the choices to the user
        System.out.println("Temperature Converter");
        System.out.println("1. Convert Celsius to Fahrenheit");
        System.out.println("2.Convert Fahrenheit to Celsius");
        System.out.print("Enter your choice (1 or 2):");

        int choice = scanner.nextInt();
        double temperature;

        if (choice ==1) {
            System.out.print("Enter the temperature in Celsius:");
            temperature = scanner.nextDouble();
            double fahrenheit = (temperature * 9 / 5) + 32;
            System.out.printf("%.2f Celsius is equal to %.2f Fahrenheit%n", temperature, fahrenheit);
        } else if (choice ==2) {
            System.out.print("Enter the temperature in Fahrenheit:");
            temperature = scanner.nextDouble();
            double celsius = (temperature - 32) * 5 / 9;
            System.out.printf("%.2f Fahrenheit is equal to %.2f Celsius%n", temperature, celsius);
        } else {
            System.out.println("Invalid choice. Please enter 1 or 2.");
        }
        scanner.close();
        }
        }






