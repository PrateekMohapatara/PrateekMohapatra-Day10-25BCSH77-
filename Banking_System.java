/*
Banking System (Real-world Simulation)

Create a program that:

Takes account balance
Takes withdrawal amount
Rules:
If withdrawal > balance → throw and handle exception
If invalid input → handle exception
Output:
Withdrawal successful OR Insufficient balance
*/
package day10_progs;
import java.util.InputMismatchException;
import java .util.Scanner;
public class banking_system {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
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
