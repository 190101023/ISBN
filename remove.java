package introJava;

import java.util.Scanner;

public class remove {
	
	static void remove(String word,String ch) {
		String word1 ;
		word1 = word.replaceAll(ch, "");
		System.out.println(word1);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		remove("Example","a");
	}

}
