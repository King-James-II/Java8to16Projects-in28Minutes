package com.codekoro.api.h;

public class RecordsRunner {
	record Person(String name, String email, String phoneNumber) {
//		Person(String name, String email, String phoneNumber) {
//			if (name == null)
//				throw new IllegalArgumentException("Name is null.");
//			this.name = name;
//			this.email = email;
//			this.phoneNumber = phoneNumber;
//		}
		Person {
			if (name == null) {
				throw new IllegalArgumentException("Name is null.");
			}
		}

		public String name() {
			System.out.println("Do more stuff");
			return name;
		}
	}
	public static void main(String[] args) {
		Person person = new Person("Riven", "riven@noxus.rule", "1337");
		Person person1 = new Person("Lux", "lux@demacia.rule", "8941");
		Person person2 = new Person("Garen", "garen@demacia.rule", "1235");
		Person person3 = new Person("Riven", "riven@noxus.rule", "1337");
		System.out.println(person);
		System.out.println(person.name());
		System.out.println(person.equals(person1));
		System.out.println(person.equals(person2));
		System.out.println(person.equals(person3));
	}

}
