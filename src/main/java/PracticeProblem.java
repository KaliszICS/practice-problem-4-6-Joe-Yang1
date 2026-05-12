/**

        * File: 4.6

        * Author: Joe Yang

        * Date Created: April 20, 2026

        * Date Last Modified: April 20, 2026

        */

import java.util.Scanner;

public class PracticeProblem {

	public static void main(String args[]){}

	public static int intChecker(){
		Scanner input = new Scanner(System.in);

		int num; 

	while (true){
		System.out.print("Input an integer: ");

		if (input.hasNextInt()){
			num = input.nextInt();

			return num;
		}

		else{
			System.out.print("Input an integer: ");
			input.nextLine();
			
		}
	}
}

	public static double doubleChecker(){

		Scanner input2 = new Scanner(System.in);
		double num2;

		while (true){
			System.out.print("Input a number: ");

			if (input2.hasNextDouble()){
				num2 = input2.nextDouble();

				return num2;
			}

			else{
				System.out.print("Input a number: ");
				input2.nextLine();
			}
		}
	}

	public static boolean booleanChecker(){
		Scanner input3 = new Scanner(System.in);
		boolean result;

		while (true){
			System.out.print("Input a boolean: ");

			if (input3.hasNextBoolean()){
				return input3.nextBoolean();
			}

			else{
				System.out.print("Input a boolean: ");
				input3.nextLine();
			}
		}

		
	}

	public static boolean multipleIntChecker(){
		Scanner input4 = new Scanner(System.in);
		int counter = 0;

		while (counter < 4){

			System.out.print("Input an integer: ");
			if (input4.hasNextInt()){
				input4.nextInt();
				counter++;


			}

			else{
				input4.nextLine();
			}
		}

		return true;
	}

}


