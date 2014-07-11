import zen.core.Zen;
import zen.game.Sprite;

public class Hole extends Sprite {

	boolean mole = false;

	public void draw() {
		if (mole) {
			Zen.setColor("red");
		} else {
			Zen.setColor("black");
		}
		Zen.fillOval(getX(), getY(), 50, 50);
	}

	public void move() {
		if (Zen.dice(60) == 1) {
			mole = !mole;
		}
	}

	public void setup() {

	}

}
