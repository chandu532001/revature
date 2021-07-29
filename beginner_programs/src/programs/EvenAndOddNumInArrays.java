package beginner_programs;

import java.util.Scanner;

public class EvenAndOddNumInArrays {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter size");
		int size=sc.nextInt();
		int array[]=new int[size];
		for(int i=0;i<size;i++) {
			array[i]=sc.nextInt();
		}
		
		System.out.println("even numbers");
		for(int i=0;i<array.length;i++) {
			if(array[i]%2==0) {
				System.out.println(array[i]);
			}
			
		}
		System.out.println("odd numbers");
		for(int i=0;i<array.length;i++) {
			if(array[i]%2!=0) {
				System.out.println(array[i]);
			}
			
		}

	}

}
