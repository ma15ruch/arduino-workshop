//with mallet and hole
import zen.core.Zen;
import zen.game.Game;

public class WhackAMole extends Game {

	int score = 0;
	
	Mallet m;
	Hole h1;
	Hole h2;
	Hole h3;
	Hole h4;
	Hole h5;
	Hole h6;
	Hole h7;
	Hole h8;
	Hole h9;
	public static void main(String[] args) {
		WhackAMole w = new WhackAMole();
		w.setSize(650,650);
		w.run();
	}

	public void loop() {
		Zen.setBackground("teal");
		
		if (m.distanceTo(h1) < 100 && Zen.isKeyPressed("space") && h1.mole){
			h1.mole = false;
			score = score + 1;
		}
		
		if (m.distanceTo(h2) < 100 && Zen.isKeyPressed("space") && h2.mole){
			h2.mole = false;
			score = score + 1;
		}
		
		if (m.distanceTo(h3) < 100 && Zen.isKeyPressed("space") && h3.mole){
			h3.mole = false;
			score = score + 1;
		}
		
		if (m.distanceTo(h4) < 100 && Zen.isKeyPressed("space") && h4.mole){
			h4.mole = false;
			score = score + 1;
		}
		
		if (m.distanceTo(h5) < 100 && Zen.isKeyPressed("space") && h5.mole){
			h5.mole = false;
			score = score + 1;
		}
		
		if (m.distanceTo(h6) < 100 && Zen.isKeyPressed("space") && h6.mole){
			h6.mole = false;
			score = score + 1;
		}
		
		if (m.distanceTo(h7) < 100 && Zen.isKeyPressed("space") && h7.mole){
			h7.mole = false;
			score = score + 1;
		}
		
		if (m.distanceTo(h8) < 100 && Zen.isKeyPressed("space") && h8.mole){
			h8.mole = false;
			score = score + 1;
		}
		
		if (m.distanceTo(h9) < 100 && Zen.isKeyPressed("space") && h9.mole){
			h9.mole = false;
			score = score + 1;
		}
		
		Zen.setColor("white");
		Zen.drawText("Score = "+ score, 50, 50);
	}

	public void setup() {
		h1 = new Hole();
		addSprite(h1);
		h1.setX(100);
		h1.setY(100);
		
		h2 = new Hole();
		addSprite(h2);
		h2.setX(300);
		h2.setY(100);
		
		h3 = new Hole();
		addSprite(h3);
		h3.setX(500);
		h3.setY(100);
		
		h4 = new Hole();
		addSprite(h4);
		h4.setX(100);
		h4.setY(300);
		
		h5 = new Hole();
		addSprite(h5);
		h5.setX(300);
		h5.setY(300);
		
		h6 = new Hole();
		addSprite(h6);
		h6.setX(500);
		h6.setY(300);
		
		h7 = new Hole();
		addSprite(h7);
		h7.setX(100);
		h7.setY(500);
		
		h8 = new Hole();
		addSprite(h8);
		h8.setX(300);
		h8.setY(500);
		
		h9 = new Hole();
		addSprite(h9);
		h9.setX(500);
		h9.setY(500);
		
		m = new Mallet();
		addSprite(m);
		
	}

}
