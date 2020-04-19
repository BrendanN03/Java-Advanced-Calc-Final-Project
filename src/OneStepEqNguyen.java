//Brendan Nguyen
//02/13/2020
//OneStepEqNguyen.java
//Version 1.0
//program that solves quadratic equations
import java.util.Scanner;
public class OneStepEqNguyen 
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the coefficients for your quadratic equation:\na= ");
		double a = input.nextDouble(); //declares a as first coefficient
		System.out.print("b= ");
		double b = input.nextDouble(); //declares b as second coefficient
		System.out.print("c= ");
		double c = input.nextDouble(); //declares c as third coefficient
		System.out.println("\n"+a+"x^2 + "+b+"x + "+c+" = 0\n");
		input.close(); //optional line of code that closes scanner
		
		if(a ==0 && b==0 && c==0) 					//for special case where all three coefficients are 0
			{System.out.println("x = All Real Numbers");}
		else if(a == 0 && b == 0) 					//for special cases where both a and b are 0
			{System.out.println("x = No Solution");}
		else if(a == 0) 							//for special cases where a=0 which is out of the quadratic formula domain
			{System.out.println("x = "+(-c/b));}
		else if(c == 0) 							//for special cases where c=0 making the solution 0
			{System.out.println("x = 0.0");}
		else if((b*b-(4*a*c)) < 0) 					//for all imaginary solutions where the discriminant is less than 0
		{
			if(b == 0) 								//for imaginary solutions where b is 0 creating a cleaner solution
			{System.out.println("No Real Solutions, but Two Imaginary Solutions\nx = +/- " + (Math.sqrt(4*a*c)/(2*a)) + "i");}
			else									//for all imaginary solutions where b is not 0
			{System.out.println("No Real Solutions, but Two Imaginary Solutions\nx = "
					+ -b/(2*a) + " +/- " + Math.sqrt(-1*(b*b - (4*a*c)))/(2*a)+ "i");}	
		}
		else if((b*b-(4*a*c)) == 0) 				//for solutions where the discriminant is 0 and there is only one solution
			{System.out.println("x = "+(-b/(2*a)));}
		else 										//plugs in variables into actual quadratic formula for all non-special cases
			{System.out.println("x = "+(-b + Math.sqrt(b*b - (4*a*c)))/(2*a)
			+" and\nx = "+(-b - Math.sqrt(b*b - (4*a*c)))/(2*a));}
	}
}

