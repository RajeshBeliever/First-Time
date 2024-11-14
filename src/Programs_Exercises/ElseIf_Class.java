package Programs_Exercises;

import java.util.Scanner;

public class ElseIf_Class {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner t= new Scanner(System.in);
		System.out.println("Enter a=");
		int a=t.nextInt();
		System.out.println("Enter b=");
		int b=t.nextInt();
		System.out.println("Enter c=");
		int c=t.nextInt();
		if(a>b && a>c)
		{
			System.out.println(a+" is greater than "+b+" and "+c);
		}
		else if(b>a && b>c)
		{
			System.out.println(b+" is greater than "+a+" and "+c);
		}
		else
		{
			System.out.println(c+" is greater than "+a+" and "+b);
		}
		
	}

}

