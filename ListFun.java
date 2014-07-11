
public class ListFun 
{

	public static void main(String[] args) 
	{
		int[] array = { 1, 2, 3, 4};
		int total = 0;
		double repititions = 0;
		
		for (int x: array)
		{
			total = total + x;
			repititions = repititions + 1;
			
		}
		System.out.println("The total is " + total);
		System.out.println("The average is " + total  / repititions);
	}

}
