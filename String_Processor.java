/*
String Processor with Exception Safety

Create a program that:

Takes a string input

Performs:

substring operation
charAt operation
Requirements:

Handle:

StringIndexOutOfBoundsException
Example:
Invalid index handled safely
*/
package day10_progs;
import java.util.Scanner;
public class string_processor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		System.out.print("Enter a String : ");
		String str=sc.nextLine();
		try {
		System.out.println(str.substring(0,5));
		System.out.println(str.charAt(7));
		}
		catch(StringIndexOutOfBoundsException e){
			System.out.print("Out of index\n");
		}
		sc.close();
		
	}

}
