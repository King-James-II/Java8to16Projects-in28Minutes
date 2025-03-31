package com.codekoro.jpjoop;

public class MyChar {

	char myChar;

	public MyChar(char c) {
		// TODO Auto-generated constructor stub
		this.myChar = c;
	}

	public boolean isVowel() {
		// TODO Auto-generated method stub
		char lowerChar = Character.toLowerCase(myChar);
		if (lowerChar == '\u0061' || lowerChar == '\u0065' || lowerChar == '\u0069' || lowerChar == '\u0061' ||
				lowerChar == '\u006F' || lowerChar == '\u0075') {
			return true;
		}
		else {
			return false;
		}

	}

	public boolean isNumber() {
		// TODO Auto-generated method stub
		if (myChar >= '\u0030' && myChar <= '\u0039') {
			return true;
		}
		else {
			return false;
		}

	}

	public boolean isAlphabet() {
		// TODO Auto-generated method stub
		if ((myChar >= '\u0061' && myChar <= '\u007A') || (myChar >= '\u0041' && myChar <= '\u005A')) {
			return true;
		}
		else {
			return false;
		}

	}

	public static void printLowerCaseAlphabets() {
		// TODO Auto-generated method stub
		char lowerA = 'a';
		for (int i = 0; i< 26; i++) {
			System.out.print(lowerA++);
		}
		System.out.println("");

	}



	public static void printUpperCaseAlphabets() {
		// TODO Auto-generated method stub
		char lowerA = 'A';
		for (int i = 0; i< 26; i++) {
			System.out.print(lowerA++);
		}
		System.out.println("");
	}

	public boolean isConsonant() {
		// TODO Auto-generated method stub
		return !isVowel();
	}

}
