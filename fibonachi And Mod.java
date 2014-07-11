public class FinalPractice {

	public static void main(String[] args) {
		int[] array = { 1, 2, 3, 4, 5, 765 };
		int a = 1;//the term being considered
		int b = 1;//the next term being considered
		int storage = 0;//storage variable
		
		for (int x: array)
		{
			if (x % 2 == 0)
			{
				System.out.println("" + x +" is even.");
			}
			else
			{
				System.out.println("" + x +" is odd.");
			}
		}
		
		//fibonachi
		
		System.out.println("1,1,2,3,5,8,13,21,34,55");
		
		while (a < 1000){
			System.out.println(a);
			storage = b;
			b = a + b;
			a = storage;
		}
	}
}
