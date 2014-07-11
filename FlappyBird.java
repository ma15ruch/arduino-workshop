import zen.core.Zen;


public class mysteryGame 
{

	
	public static void main(String[] args) 
	{
		int x;
		int y;
		int ySpeed;
		int z;
		x = 40;
		y = 240;
		ySpeed = 3;
		z = 500;
		
		Zen.create(500, 500);
		
		while (true)
		{
			Zen.setBackground("red");
			
			Zen.setColor("yellow");
			Zen.fillOval(x, y, 20, 20);
			
			Zen.setColor("green");
			Zen.fillRect(z, 0, 40, 200);
			Zen.fillRect(z, 300, 40, 200);
			
			z = z - 3;
			
			y = y + ySpeed;
			
			ySpeed = ySpeed + 1;
			
			if (y >= 480)
			{
				x = 40;
				y = 240;
				ySpeed = 3;
				z = 500;
			}
			
			if (z < -39)
			{
				z = 500;
			}
			
			if (Zen.isKeyPressed("space"))
			{
				ySpeed = -4;
			}
			
			if (x + 20 >= z && x <= z + 40 && (y <= 200 || y + 20 >= 300))
			{
				x = 40;
				y = 240;
				ySpeed = 3;
				z = 500;
			}
			
			/*if (Zen.isKeyPressed("left"))
			{
				x = x - 40;
				ySpeed = 3;
			}
			
			if (Zen.isKeyPressed("right"))
			{
				x = x + 40;
				ySpeed = 3;
			}

			if (Zen.isKeyPressed("up"))
			{
				ySpeed = -10;
				ySpeed = ySpeed * 8/8;
			}
			
			if (Zen.isKeyPressed("down"))
			{
				ySpeed = 10;
				ySpeed = ySpeed * 8/8;
			}*/
			
			Zen.buffer(20);
		}
	}

}
