import zen.core.Zen;


public class Drawing 
{

	public static void main(String[] args) 
	{
		int x;
		x = Zen.getMouseX();
		int y;
		y = Zen.getMouseY();
		
		Zen.create(500, 500);
		
		while (1<2)
		{
			Zen.setBackground("light green");
			
			Zen.setColor("blue");
			Zen.drawText("Hello", 100, 100);
			
			Zen.setColor("red");
		
			Zen.fillOval(x, y, 50, 50);
				
			x = Zen.getMouseX();
			y = Zen.getMouseY();
			
			Zen.sleep(20);
		}
	}

}
