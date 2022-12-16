package introJava;

import java.util.Scanner;

public class rot13 {
	
	static String encode(String word) {
		
		String newString = "";
		for(int i =0;i<word.length();i++) {
			char a = (char) (word.charAt(i) + 13);
			newString = newString + Character.toString(a);
		}
		return newString;
	}
	static String decode(String word) {
		
		String newString = "";
		for(int i =0;i<word.length();i++) {
			char a = (char) (word.charAt(i) + 13);
			newString = newString + Character.toString(a);
		}
		return newString;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		System.out.println(encode("abcde"));
		System.out.println(decode("xya"));
	}

}
