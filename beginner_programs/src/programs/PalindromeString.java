package beginner_programs;

import java.util.Scanner;

public class PalindromeString {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		String temp=str;
		System.out.println(temp);
		String rev="";
		int len=str.length();
		for(int i=len-1;i>=0;i--) {
			rev=rev+str.charAt(i);
		}
		System.out.println(rev);
		if(temp.equals(rev)) {
			System.out.println("palindrome string");
		}
		else {
			System.out.println("not palindrome string");
		}

	}

}
