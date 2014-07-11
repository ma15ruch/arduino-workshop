import zen.core.Zen;
import zen.shape.Circle;


public class bouncyBallObjects 
{

	
	public static void main(String[] args) 
	{
		int ySpeed;
		ySpeed = 3;
		
		int ySpeed2;
		ySpeed2 = 3;
		
		int xSpeed;
		xSpeed = 3;
		
		int xSpeed2;
		xSpeed2 = -3;
		
		boolean gravity;
		gravity = true;
		
		Circle ruchi = new Circle(30);
		ruchi.setX(15);
		ruchi.setY(15);
		
		Circle nupur = new Circle(20);
		nupur.setX(690);
		nupur.setY(10);
		
		ruchi.setColor("pink");
		nupur.setColor("teal");
		
		Zen.create(700, 700);

		while (true)
		{
			Zen.setBackground("black");
			
			ruchi.draw();
			nupur.draw();
			
			ruchi.changeY(ySpeed);
			nupur.changeY(ySpeed2);
			
			if (gravity)
			{
				ySpeed = ySpeed + 1;
				ySpeed2 = ySpeed2 + 1;
			}
			
			else
			{
				ySpeed = ySpeed - 1;
				ySpeed2 = ySpeed2 - 1;
			}
			
			ruchi.changeX(xSpeed);
			nupur.changeX(xSpeed2);
			
			if (ruchi.getY() >= 685)
			{
				ruchi.setY(685);
				ySpeed = -ySpeed;
				ySpeed = ySpeed * 7/8;
			}
			
			if (ruchi.getX() >= 685)
			{
				ruchi.setX(685);
				xSpeed = -xSpeed;
			}
			
			if (ruchi.getX() <= 15)
			{
				ruchi.setX(15);
				xSpeed = -xSpeed;
			}
			
			if (nupur.getY() >= 690)
			{
				nupur.setY(690);
				ySpeed2 = -ySpeed2;
				ySpeed2 = ySpeed2 * 5/6;
			}
			
			if (nupur.getX() >= 690)
			{
				nupur.setX(690);
				xSpeed2 = -xSpeed2;
			}
			
			if (nupur.getX() <= 10)
			{
				nupur.setX(10);
				xSpeed2 = -xSpeed2;
			}
			
			if (Zen.isKeyPressed("space"))
			{
				ruchi.setX(15);
				ruchi.setY(15);
				
				nupur.setX(690);
				nupur.setY(10);
				
				ySpeed = 3;
				ySpeed2 = 3;
			}
			
			if (Zen.isKeyPressed("shift"))
			{
				gravity = !gravity;
			}
			
			if (!gravity)
			{
				
			}
			
			Zen.buffer(30);
		}
	}

}
