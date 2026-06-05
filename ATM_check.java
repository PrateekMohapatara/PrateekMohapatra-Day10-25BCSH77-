/*
ATM Multi-Level Exception System

Create a program that simulates ATM withdrawal.

Requirements:
Take balance and withdrawal amount
If withdrawal > balance → handle exception
If withdrawal amount is negative → handle exception
If input is invalid (text instead of number) → handle exception
Expected Output:
Transaction Successful / Insufficient Balance / Invalid Input
*/
package day10_progs;
import java.util.Scanner;
import java.util.InputMismatchException;//

public class atm_Multilevel_System {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter Balance : ");
            int bal = sc.nextInt();

            System.out.print("Enter Withdrawal Amount : ");
            int amt = sc.nextInt();

            if (amt < 0) {
                throw new IllegalArgumentException();
            }

            if (amt > bal) {
                throw new ArithmeticException();
            }

            bal -= amt;

            System.out.println("Transaction Successful");
            System.out.println("Remaining Balance : " + bal);
        }

        catch (InputMismatchException e) {
            System.out.println("Invalid Input");
        }

        catch (IllegalArgumentException e) {
            System.out.println("Invalid Input");
        }

        catch (ArithmeticException e) {
            System.out.println("Insufficient Balance");
        }

        sc.close();
    }
}
