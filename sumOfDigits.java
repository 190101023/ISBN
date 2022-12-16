package introJava;

import java.util.Scanner;

public class sumOfDigits {
	
	private int[] array;
	private int count;
	
	public sumOfDigits(){
		array = new int[1];
		count = 2;		
	}
	public void growSize() {
		int[] temp =null;
		temp = new int[count];
		
		for(int i = 0;i <count-1;i++) {
			temp[i] = array[i];
		}
		array = temp;
		count +=1;
	}
	 public int find(int index) {
		 
		 System.out.print("Numbers Found: ");
		 for(int i = 0; i<array.length;i++) {
			 System.out.print(array[i]+" ");
		 }
		 if(index <array.length) {
			 System.out.print("\nCorresponding number of the specified index: ");
			 return array[index];
		 }
		 else {
			 System.out.print("\nError: ");
			 return -1;
		 }
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub	
		sumOfDigits sum = new sumOfDigits();
		
		Scanner input = new Scanner(System.in);
		System.out.print("Please enter the key value: ");
		int key = input.nextInt();
		System.out.print("Please enter the index value: ");
		int index = input.nextInt();
		
		int arrayCount =0;
		
		for(int i = 10; i<100;i++) {			
			if((i%10 + i/10) == key) {
				sum.array[arrayCount] = i;
				arrayCount +=1;
			}
			if(i/10 != key && (i%10 + i/10) == key) {
				sum.growSize();
			}
			}
		
		System.out.println(sum.find(index));

		
		
		
		
	}

}
