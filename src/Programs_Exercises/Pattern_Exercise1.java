package Programs_Exercises;

public class Pattern_Exercise1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//1 2 3 4
		//5 6 7
		//8 9 
		//10
		
		int k=1;
		for(int i=1; i<=4; i++)
		{
			for(int j=i; j<=4; j++)
			{
				System.out.print(k);
				System.out.print(" ");
				k++;
			}
			System.out.println(" ");	
		}
		
		System.out.println("*********************");
		
		int h=1;
		for(int i=1; i<=4; i++)
		{
			for(int j=1; j<=i; j++)
			{
				System.out.print(h);
				System.out.print(" ");
				h++;
			}
			System.out.println(" ");	
		}
		
		System.out.println("*********************");
		
		int a=3,b,c=1;
		for(int i=1; i<=4; i++)
		{
			for(int j=1; j<=i; j++)
			{
				b = a*c;
				System.out.print(b);
				System.out.print(" ");
				c++;
			}
			System.out.println(" ");
		}
	}
	
		
	
	
	//1
	//2 3
	//4 5 6 
	//7 8 9 10
	
	

}
