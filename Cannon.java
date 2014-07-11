import zen.core.Zen;


public class Cannon 
{

	public static void main(String[] args) 
	{
		int x;
		x = 450;
		int y;
		y = 450;
		int ySpeed;
		ySpeed = -10; 
		
		Zen.create(700, 700);
		
		while(true)
		{
			Zen.setBackground("teal");
		
			Zen.setColor("red");
		
			Zen.fillRect(50, 50, 50, 100);
		
			Zen.fillOval(x, y, 50, 50);

			y = y + ySpeed;
			x = x - 20;
			ySpeed = ySpeed +1;
			
			if (Zen.isKeyPressed("space"))
			{
				y = 450;
				x = 450; 
				ySpeed = -10;
			}
			
			if (Zen.isKeyPressed("left"))
			{
				x = x - 40;
				ySpeed = -10;
			}
			
			if (Zen.isKeyPressed("right"))
			{
				x = x + 40;
				ySpeed = -10;
			}

			if (Zen.isKeyPressed("up"))
			{
				x = x + 40;
				ySpeed = -40;
			}
			if (Zen.isKeyPressed("down"))
			{
				x = x + 40;
				ySpeed = 40;
			}
			
			if(x > 50 && x < 100 && (y > 50 && y < 150))
			{
				Zen.fillRect(100, 100, 100, 100);
				Zen.drawText("You won!!!", 100, 100);
				//reset?
			}
			Zen.buffer(50);
		}
		
	}

}
