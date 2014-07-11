import zen.core.Zen;
import zen.game.Sprite;


public class Player extends Sprite{

	public void draw() {
		Zen.setColor("pink");
		Zen.fillOval(getX(), getY(), 30, 30);
	}

	public void move() {
		if (Zen.isKeyPressed("up"))
		{
			changeY(-30);
		}
		
		if (Zen.isKeyPressed("down"))
		{
			changeY(30);
		}
		
		if (Zen.isKeyPressed("right"))
		{
			changeX(30);
		}
		
		if (Zen.isKeyPressed("left"))
		{
			changeX(-30);
		}
	}

	public void setup() {
		
	}

}
