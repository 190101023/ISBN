package introJava;

public class pascal {
	
	static void pascal(int order) {
		
		int num;
		int space;
		
		for(int i = 0;i <order;i++) {
			space = order;
			while(space>i) {
				System.out.print(" ");
				space --;
			}
			num = 1;
			for(int j = 0; j <= i;j++) {
				System.out.print(num + " ");
				num = num *(i-j)/(j+1);
			}
			
			System.out.print("\n");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		pascal(7);
	}

}
