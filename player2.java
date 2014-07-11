package CTF;

import zen.core.Zen;
import zen.game.Sprite;

public class Player extends Sprite {

	String gamertag;
	String team = "red";

	boolean control = false;

	public void draw() {
		if (gamertag == "ruchi") {
			Zen.setColor("yellow");
		}

		else {
			Zen.setColor(team);
		}

		Zen.fillOval(getX() - 15, getY() - 15, 30, 30);

		Zen.setColor("black");
		Zen.drawText(gamertag, getX() - 20, getY() - 15);
	}

	public void move() {
		if (control == true) {
			if (Zen.isKeyPressed("left") && getX() > 15) {
				changeX(-7);
			}

			if (Zen.isKeyPressed("right") && getX() < 985) {
				changeX(7);
			}

			if (Zen.isKeyPressed("up") && getY() > 15) {
				changeY(-7);
			}

			if (Zen.isKeyPressed("down") && getY() < 485) {
				changeY(7);
			}
		}

		else {
			setX(Zen.readInt(gamertag + "x"));
			setY(Zen.readInt(gamertag + "y"));
		}
	}

	public void setup() {

	}

}
