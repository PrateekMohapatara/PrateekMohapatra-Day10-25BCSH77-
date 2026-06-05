/*
Student Marks System (Safe Input)

Create a program that:

Stores 5 student marks in an array
Takes index input from user
Displays mark
Add Exception Handling:
Handle invalid index
Handle invalid input (if user enters text instead of number)
*/
package day10_progs;
import java.util.Scanner;
import java.util.InputMismatchException;

public class student_marks {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {
            int arr[] = new int[5];

            System.out.print("Enter marks of 5 students → ");
            for (int i = 0; i < 5; i++) {
                arr[i] = sc.nextInt();
            }

            System.out.print("Enter index (0-4) → ");
            int index = sc.nextInt();

            System.out.println("Mark = " + arr[index]);
        }

        catch (InputMismatchException e) {
            System.out.println("Invalid input!");
        }

        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid index! Index should be between 0 and 4.");
        }

        sc.close();
    }
}
