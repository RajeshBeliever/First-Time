package Programs_Exercises;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AmazonQues {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] a = {2,4,5,5,3,4,4,2,3,6,7,6,5,8,9,6,7,9};
		
		ArrayList<Integer> al = new ArrayList<Integer>();
		
		for(int i=0; i<a.length; i++)
		{
			int k=0;
			if(!al.contains(a[i]))
			{
				al.add(a[i]);
				k++;
				for(int j=i+1; j<a.length; j++)
				{
					if(a[i]==a[j])
					{
						k++;
					}
				}	
				System.out.println(a[i]);
				System.out.println(k);
			}
		}
		
		List<Integer> numbers = Arrays.asList(2,4,5,5,3,4,4,2,3,6,7,6,5,8,9,6,7,9);
		numbers.stream().distinct().sorted().forEach(n->System.out.println("Unique numbers="+n));
		int count = numbers.size();
		//numbers.stream().sorted().filter(s->getNumberOfRepeatedNumbers(s,count)).map(s->s.MAX_VALUE).forEach(n->System.out.println("Unique numbers="+n));

	}

	private static int getNumberOfRepeatedNumbers(int s,int count, int numbers) {
		// TODO Auto-generated method stub
		int i,j,k=0;
		for(i=0; i<count; i++)
		{
			for(j=i+1; j<count; j++)
			{
				//if(numbers)
				{
					
				}
			}
		}
		
		return s;
	}
	
	

}
