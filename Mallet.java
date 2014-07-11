import zen.core.Zen;
import zen.game.Sprite;

public class Mallet extends Sprite {

	boolean whacking = false;

	public void draw() {
		if (whacking) {
			Zen.setColor("brown");
			Zen.fillRect(getX(), getY() - 30, 60, 30);
			Zen.setColor("gray");
			Zen.fillRect(getX() + 60, getY() - 50, 40, 70);
		} 
		else {
			Zen.setColor("brown");
			Zen.fillRect(getX() - 30, getY() - 60, 30, 60);
			Zen.setColor("gray");
			Zen.fillRect(getX() - 50, getY() - 100, 70, 40);
		}
	}

	public void move() {
		follow(Zen.getMouse());

		whacking = Zen.isKeyPressed("space");
	}

	public void setup() {

	}

}
