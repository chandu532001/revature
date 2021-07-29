package beginner_programs;

import java.util.Scanner;

public class SumOfArray {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size of an array");
		int n=sc.nextInt();
		int array[]=new int[n]; //create an array
		for (int i=0;i<n;i++) {
			System.out.println("enter array values");
			array[i]=sc.nextInt();
		}
		int s=0;
		for(int i=0;i<array.length;i++) {
			s=s+array[i];
		}
		System.out.println("sum of elements "+ s);

	}

}
