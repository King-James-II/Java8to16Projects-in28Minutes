package com.codekoro.oops.level2.interfaces;

public class ChessGame implements GamingConsole{

	@Override
	public void up() {
		System.out.println("Mario Jumps.");

	}

	@Override
	public void down() {
		System.out.println("Goes into tunnel");

	}

	@Override
	public void left() {


	}

	@Override
	public void right() {
		System.out.println("Mario moves foward.");

	}

}
