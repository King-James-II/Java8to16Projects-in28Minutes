package com.codekoro.api.i;

sealed class Vehicle permits Car, Truck, Bike {}

// must be final, sealed, non-sealed
final class Car extends Vehicle {}
//class Dummy extends Car {}

non-sealed class Truck extends Vehicle {}
class Dummy1 extends Truck {}
class Dummy2 extends Truck {}

sealed class Bike extends Vehicle permits SuperBike {}
//class Dummy extends Vehicle {}
final class SuperBike extends Bike {}

public class SealedClassesRunner {

	public static void main(String[] args) {


	}

}
