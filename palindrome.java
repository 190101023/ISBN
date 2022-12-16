package introJava;

public class palindrome {
	
	static  boolean palindrome(String word) {
		
		boolean a = false;
		String reverse ="";
		for(int i = word.length()-1; i >=0 ;i--) {
			reverse = reverse + word.charAt(i);
		}
		
		if(word.equals(reverse)) {
			a = true;
		}
		return a;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(palindrome("ey edip adanada pide ye"));
		
	}
	
}
