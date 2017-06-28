package datastructures;

import java.util.Arrays;
import java.util.Comparator;

public class JavaComparator {

	public static void main(String[] args) {

		Player[] players = new Player[5];
		players[0] = new Player("anna", 100);
		players[1] = new Player("otto", 75);
		players[2] = new Player("alice", 125);
		players[3] = new Player("jane", 75);
		players[4] = new Player("tanya", 10);

		MyComparator checker = new MyComparator();

		Arrays.sort(players, checker);
		for (int i = 0; i < players.length; i++) {
			System.out.printf("%s %s\n", players[i].name, players[i].score);
		}
	}

	static class MyComparator implements Comparator<Player> {

		@Override
		public int compare(Player a, Player b) {
			if (a.score == b.score) {
				return a.name.compareTo(b.name);
			}
			return b.score - a.score;
		}

	}

	static class Player {
		String name;
		int score;

		Player(String name, int score) {
			this.name = name;
			this.score = score;
		}
	}

}