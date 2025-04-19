package com.codekoro.api.i;

sealed interface Flyable permits Bird, Aeroplane, Helicopter {}

final class Bird implements Flyable {}

sealed class Aeroplane implements Flyable permits Boeing {}

final class Boeing extends Aeroplane {}

non-sealed class Helicopter implements Flyable {}

public class SealedInterfacesRunner {

	public static void main(String[] args) {


	}

}
