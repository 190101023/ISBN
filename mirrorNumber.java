package introJava;

import java.util.Scanner;

public class mirrorNumber {
	
	private static int[] array;
	private static int count;
	
	public mirrorNumber(){
		array = new int[10];
		count =0;
	}
	 
	public static void Mirror(int n) {

		if(n >1) {
			array[count] = n;
			count += 1;
			System.out.print(n + ",");
			Mirror(n/2);
		}
		else if(n<-1) {
			array[count] = n;
			count += 1;
			System.out.print(n + ",");
			Mirror(n/2);	
		}
		else if(n == 1 || n == -1) {
			System.out.print(n + ",");
			count -=1;
			Mirror(0);
		}
		else if(n == 0 && count >=0) {
			System.out.print(array[count]+",");
			count -= 1;
			Mirror(0);
		}
		
		}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		mirrorNumber mir = new mirrorNumber();
		
		Scanner input = new Scanner(System.in);
		System.out.print("Please enter a number: ");
		int n = input.nextInt();
		Mirror(n);
		
	}

}
