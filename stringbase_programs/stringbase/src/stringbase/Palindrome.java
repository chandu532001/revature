package stringbase;

public class Palindrome {

	public static void main(String[] args) {
		System.out.println(ispalindrome("madam"));
		System.out.println(ispalindrome("madame"));

	}
	public static boolean ispalindrome(String s) {
		StringBuilder sb=new StringBuilder(s);
		sb.reverse();
		String s1=sb.toString();
		return s.equals(s1);
		
		
	}

}
