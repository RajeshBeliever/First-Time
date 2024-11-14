package Programs_Exercises;

import java.util.Scanner;

public class If_Class {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner t = new Scanner(System.in);
		System.out.println("Enter a=");
		int a=t.nextInt();
		System.out.println("Enter b=");
		int b=t.nextInt();
		if(a<b)
		{
			System.out.println(b+" is greater than "+a);
		}
		else
		{
			System.out.println(b+" is lesser than "+a);
		}
	}

}
