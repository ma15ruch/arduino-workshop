//with player2 and flag2
package CTF;

import zen.core.Zen;
import zen.game.Game;

public class CTF extends Game {

	Player ruchi;
	Player yash;
	Player kunal;
	Player catherine;
	Player rishi;
	Player jason;
	Player petra;
	Player joseph;
	Player jamsheed;
	Player ryan;
	Player heewon;
	Player wan;
	Player rohan;
	Player chirag;
	Player naina;
	Player arthur;

	public static void main(String[] args) {
		Zen.connect("westeros");
		CTF r = new CTF();
		r.setSize(1000, 500);
		r.run();
	}

	public void loop() {
		Zen.setBackground("green");
		Zen.setColor("white");
		Zen.fillRect(499, 0, 2, 500);

		Zen.write("ruchix", ruchi.getX());
		Zen.write("ruchiy", ruchi.getY());

		if (ruchi.getX() < 500 && ruchi.distanceTo(yash) < 20) {
			ruchi.set(985, 250);
		}
		
		if (ruchi.getX() < 500 && ruchi.distanceTo(ryan) < 20) {
			ruchi.set(985, 250);
		}
		
		if (ruchi.getX() < 500 && ruchi.distanceTo(heewon) < 20) {
			ruchi.set(985, 250);
		}

		if (ruchi.getX() < 500 && ruchi.distanceTo(wan) < 20) {
			ruchi.set(985, 250);
		}
		
		if (ruchi.getX() < 500 && ruchi.distanceTo(rohan) < 20) {
			ruchi.set(985, 250);
		}
		
		if (ruchi.getX() < 500 && ruchi.distanceTo(chirag) < 20) {
			ruchi.set(985, 250);
		}
		
		if (ruchi.getX() < 500 && ruchi.distanceTo(naina) < 20) {
			ruchi.set(985, 250);
		}
		
		if (ruchi.getX() < 500 && ruchi.distanceTo(arthur) < 20) {
			ruchi.set(985, 250);
		}
	}

	public void setup() {
		// red

		ruchi = new Player();
		ruchi.gamertag = "ruchi";
		ruchi.control = true;
		addSprite(ruchi);
		ruchi.team = "red";

		kunal = new Player();
		kunal.gamertag = "kunal";
		addSprite(kunal);
		kunal.team = "red";

		catherine = new Player();
		catherine.gamertag = "catherine";
		addSprite(catherine);
		catherine.team = "red";

		rishi = new Player();
		rishi.gamertag = "rishi";
		addSprite(rishi);
		rishi.team = "red";

		jason = new Player();
		jason.gamertag = "jason";
		addSprite(jason);
		jason.team = "red";

		petra = new Player();
		petra.gamertag = "petra";
		addSprite(petra);
		petra.team = "red";

		joseph = new Player();
		joseph.gamertag = "joseph";
		addSprite(joseph);
		joseph.team = "red";

		jamsheed = new Player();
		jamsheed.gamertag = "jamsheed";
		addSprite(jamsheed);
		jamsheed.team = "red";

		// blue

		yash = new Player();
		yash.gamertag = "yash";
		addSprite(yash);
		yash.team = "blue";

		ryan = new Player();
		ryan.gamertag = "ryan";
		addSprite(ryan);
		ryan.team = "blue";

		heewon = new Player();
		heewon.gamertag = "heewon";
		addSprite(heewon);
		heewon.team = "blue";

		wan = new Player();
		wan.gamertag = "wan";
		addSprite(wan);
		wan.team = "blue";

		rohan = new Player();
		rohan.gamertag = "rohan";
		addSprite(rohan);
		rohan.team = "blue";

		chirag = new Player();
		chirag.gamertag = "chirag";
		addSprite(chirag);
		chirag.team = "blue";

		naina = new Player();
		naina.gamertag = "naina";
		addSprite(naina);
		naina.team = "blue";

		arthur = new Player();
		arthur.gamertag = "arthur";
		addSprite(arthur);
		arthur.team = "blue";
	}

}
