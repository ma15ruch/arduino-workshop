//with player and follower
import zen.core.Zen;
import zen.game.Game;


public class CTF extends Game{
	Player Ruchi;
	Follower Joseph;
	public static void main(String[] args) {
		Zen.connect("shinjuku");
		CTF g = new CTF();
		g.setSize (900, 700);
		g.run();
	}

	public void loop() {
		Zen.setBackground("white");
		
		Zen.write("Ruchix", Ruchi.getX());
		Zen.write("Ruchiy", Ruchi.getY());
		
		Joseph.setX(Zen.readInt("JosephX"));
		Joseph.setY(Zen.readInt("JosephY"));
	}

	public void setup() {
		Ruchi = new Player();
		addSprite(Ruchi);
		
		Joseph = new Follower();
		addSprite (Joseph);
	}

}
