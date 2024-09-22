//This Program let the user enter weight, feet, and inches to obtain BMI

import java.util.Scanner;

public class HealthAppBMI {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

//Input weight, feet, inches
//Input has to be double 
    System.out.print("Enter Weight: ");
    double weight = input.nextDouble();
    System.out.print("Enter Feet: ");
    double feet = input.nextDouble();
    System.out.print("Enter Inches: ");
    double inches = input.nextDouble();

//Conversion for  
    final double KILOGRAMS_PER_POUND = 0.45359237; // 1 lb = 0.45359237 kg
    final double METERS_PER_INCH = 0.0254; // 1 in = 0.0254 m

// BMI Calculation using the Metric system
    weight *= KILOGRAMS_PER_POUND; // weight times conversion 

    double heightInInches = (feet * 12) + inches; // convert height, feet to inches and then inches to meters
    double heightInMeters = heightInInches * METERS_PER_INCH;

    double bmi = weight / (Math.pow(heightInMeters, 2)); // bmi formula

// Output 
    System.out.println("BMI is " + bmi);
    if (bmi < 18.5)
    System.out.println("Underweight");

    else if (bmi < 25)
    System.out.println("Normal");

    else if (bmi < 30)
    System.out.println("Overweight");

    else
    System.out.println("Obese");

  }  
}