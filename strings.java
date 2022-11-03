package introJava;

import java.util.Scanner;

public class assignment1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		Scanner input1 = new Scanner(System.in);
		
		System.out.println("Enter the first string");
		String string1 = input.nextLine();
		System.out.println("Enter the second string");
		String string2 = input1.nextLine();
		String space = " ";
		
		char [] ch1 = string1.toCharArray();
		char [] ch2 = string2.toCharArray();
		
		if(ch1.length>ch2.length) {
			System.out.println(" " + string1);
			
			for(int i =0;i<ch2.length;i++) {
				if(ch1[i] == ch2[i]) {
					System.out.println(ch2[i]+space.repeat(i) + "+");
				}
				else {
					System.out.println(ch2[i]+space.repeat(i) + "-");
				}
			}
		}
		else {
			System.out.println(" " + string2);
			for(int i =0;i<ch1.length;i++) {
				if(ch1[i] == ch2[i]) {
					System.out.println(ch1[i]+space.repeat(i) + "+");
				}
				else {
					System.out.println(ch1[i]+space.repeat(i) + "-");
				}
			}
		}
	}

}
