package beginner_programs;

import java.util.Scanner;

public class CountEvenOdd {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int even=0;
		int odd=0;
		while(num!=0) {
			int rev=num%10;
			if(rev%2==0) {
				even=even+1;
			}
			else {
				odd=odd+1;
			}
			num=num/10;
		}
		System.out.println("even count "+ even);
		System.out.println("odd count "+ odd);

	}

}
