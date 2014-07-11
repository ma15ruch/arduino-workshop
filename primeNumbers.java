
public class primeNumbers 
{

	
	public static void main(String[] args) 
	{
		
		
		int w;
		w = 2;
		//the number being checked
		
		int y;
		y = (int) Math.sqrt(w);
		
		int u;
		u = 2;
		//what the checked number is being divided by
		
		int v;
		v = 100;
		
		int t;
		
		/*while (w < y)
		{
			if (x % w == 0)
			{
				System.out.println("This number is composite, not prime.");
				return;
			}
			
			w = w + 1;
		}
		System.out.println("This number is prime.");*/
	
		while (w < v)//while ur still checking under 100
		{
			t = 0;
			u = 2;
			while (u <= y)//while the checked number is being divided by less than or equal to the square root of the checked number
			{
				if (w % u == 0)
				{
					t = t + 1;
				}
				u = u + 1;
			}
			
			if (t == 0)
			{
				System.out.println(w);
			}
			w = w +1;
		}
		
	}
	//find all the prime numbers until 100.

}
