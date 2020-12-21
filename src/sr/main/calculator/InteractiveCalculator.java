package sr.main.calculator;

import java.util.Scanner;

import sr.main.operations.AddOperation;
import sr.main.operations.DivOperation;
import sr.main.operations.MultOperation;
import sr.main.operations.SubOperation;

public class InteractiveCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter two numbers :");
		Scanner in = new Scanner (System.in);
		int A=0, B=0;
		A=in.nextInt();
		B=in.nextInt();
		System.out.println("Enter the arithmetic operation \r\n 1. Addition \r\n 2. Subtraction"
				+ "\r\n 3. multiplication \r\n 4. Division:");
		int op;
		op= in.nextInt();
		in.close();
		switch (op){
		case 1 :
			AddOperation add = new AddOperation (A,B);
			System.out.println("SUM ="+add.sum());
			break;
		case 2 :
			SubOperation sub = new SubOperation (A,B);
			System.out.println("Difference"+ sub.diff());
			break;
		case 3 :
			MultOperation prod = new MultOperation (A,B);
			System.out.println("Product ="+ prod.product());
			break;
		case 4 :
			DivOperation div = new DivOperation (A,B);
			if (B==0)
				{System.out.println("invalid entry"); 
				break;}
			
			else 
				System.out.println("Quotient ="+ div.quotient());
			break;
		default :
			System.out.println("invalid entry");
		}
	
		
		
	}

}
