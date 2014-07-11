import zen.core.Zen;
import zen.shape.Circle;

public class tag {

	public static void main(String[] args) {
		int ySpeed;
		ySpeed = 3;

		int ySpeed2;
		ySpeed2 = 3;

		int xSpeed;
		xSpeed = 3;

		int xSpeed2;
		xSpeed2 = -3;

		int it = 1;

		Circle ruchi = new Circle(30);
		ruchi.setX(15);
		ruchi.setY(15);

		Circle nupur = new Circle(30);
		nupur.setX(685);
		nupur.setY(15);

		ruchi.setColor("gray");
		nupur.setColor("green");

		Zen.create(700, 700);

		while (true) {
			Zen.setBackground("white");

			if (it == 1){
				//change color
				ruchi.setColor("green");
				nupur.setColor("gray");
			}
			
			if (it == 2)
			{
				//change color
				nupur.setColor("green");
				ruchi.setColor("gray");
			}
			ruchi.draw();
			nupur.draw();

			if (Zen.isKeyPressed("up") && nupur.getY() >= 20) {
				nupur.changeY(-10);
			}

			if (Zen.isKeyPressed("down") && nupur.getY() <= 680) {
				nupur.changeY(10);
			}

			if (Zen.isKeyPressed("left") && nupur.getX() >= 20) {
				nupur.changeX(-10);
			}

			if (Zen.isKeyPressed("right") && nupur.getX() <= 680) {
				nupur.changeX(10);
			}

			if (Zen.isKeyPressed("w") && ruchi.getY() >= 20) {
				ruchi.changeY(-10);
			}

			if (Zen.isKeyPressed("s") && ruchi.getY() <= 680) {
				ruchi.changeY(10);
			}

			if (Zen.isKeyPressed("a") && ruchi.getX() >= 20) {
				ruchi.changeX(-10);
			}

			if (Zen.isKeyPressed("d") && ruchi.getX() <= 680) {
				ruchi.changeX(10);
			}

			if (nupur.distanceTo(ruchi) < 30 && it == 1) {
				//change it
				it = 2;
				if ((700 - ruchi.getY()) > 60) {
					if ((ruchi.getY()) > 60) {
						if ((700 - ruchi.getX()) > 60) {
							if ((ruchi.getX()) > 60) {
								nupur.changeX(-1 * (ruchi.getX() - nupur.getX()));
								nupur.changeY(-1 * (ruchi.getY() - nupur.getY()));
								ruchi.changeX(-1 * (nupur.getX() - ruchi.getX()));
								ruchi.changeY(-1 * (nupur.getY() - ruchi.getY()));
							}
						}
					}
				}

				//change score
				
			}
			
			if (ruchi.distanceTo(nupur) < 30 && it == 2) {
				//change it
				it = 1;
				if ((700 - nupur.getY()) > 60) {
					if ((nupur.getY()) > 60) {
						if ((700 - nupur.getX()) > 60) {
							if ((nupur.getX()) > 60) {
								ruchi.changeX(-1 * (nupur.getX() - ruchi.getX()));
								ruchi.changeY(-1 * (nupur.getY() - ruchi.getY()));
								nupur.changeX(-1 * (ruchi.getX() - nupur.getX()));
								nupur.changeY(-1 * (ruchi.getY() - nupur.getY()));
							}
						}
					}
				}
				
				//change score

			}

			Zen.buffer(30);
		}
	}

}
