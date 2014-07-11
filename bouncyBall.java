import zen.core.Zen;


public class bouncyBall 
{

	
	public static void main(String[] args) 
	{
		int x;
		x = 0;
		int y;
		y = 0;
		int ySpeed;
		ySpeed = 10;
		int xSpeed;
		xSpeed = 3;

		Zen.create(800, 700);

		while (true)
		{
			Zen.setBackground("light blue");
			
			Zen.setColor("red");
			Zen.fillOval(x, y, 20, 20);
			
			y = y + ySpeed;
			x = x + xSpeed;
			ySpeed = ySpeed +1;
			
			if (y >= 680)
			{
				y = 680;
				ySpeed = -ySpeed;
				ySpeed = ySpeed * 7/8;
			}
			
			if (x >= 780)
			{
				x = 780;
				xSpeed = -xSpeed;
			}
			
			if (x <= 0)
			{
				x = 0;
				xSpeed = -xSpeed;
			}
			
			if (Zen.isKeyPressed("space"))
			{
				y = 0;
				x = 0; 
				ySpeed = 10;
			}
			Zen.buffer(30);
		}
	}

}
