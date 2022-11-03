package introJava;

import java.util.Scanner;

public class isbn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the 9 digits of number");
		int number = input.nextInt();
		int [] ary = new int[9];
		int sum = 0;
		int k = 10;
		System.out.println("Input: "+number);
		
		for(int i = 8;i>=0;i--) {
			ary[i] = number % 10;
			number = number /10;
		}
		for(int i = 0; i<9; i++) {
			sum = sum + (ary[i]*k);
			k--;
		}
		
		System.out.print("Formated ISPN: ");
		for(int i = 0;i<9;i++) {
			System.out.print(ary[i]);
			if(i==0 ||i==3 || i==8) {
				System.out.print("-");
			}
		}
		
		if((11-sum%11) == 10) {
			System.out.print("X");
		}
		else {
			System.out.println((11-sum%11));
		}
	}

}
