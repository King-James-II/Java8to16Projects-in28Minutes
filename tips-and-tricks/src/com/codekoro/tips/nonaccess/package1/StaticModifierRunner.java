package com.codekoro.tips.nonaccess.package1;

class Player{
	private String name;
	private static int count;

	public Player(String name) {
		super();
		this.name = name;
		count++;
	}

	static public int getCount() {
//		System.out.println(name);
		return count;
	}

	public String getName() {
		System.out.println(count);
		return name;
	}

	public void setName(String name) {

		this.name = name;
	}

}

public class StaticModifierRunner {

	public static void main(String[] args) {
		System.out.println(Player.getCount());
		Player player1 = new Player("Yugi");
		System.out.println(Player.getCount());
		Player player2 = new Player("Kaiba");
		System.out.println(Player.getCount());
		Player player3 = new Player("Joey");
		System.out.println(Player.getCount());
		Player player4 = new Player("Mokuba	");
		System.out.println(Player.getCount());

	}

}
