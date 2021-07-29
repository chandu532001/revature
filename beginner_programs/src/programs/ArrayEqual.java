package beginner_programs;

import java.util.Scanner;

import java.util.Arrays;

public class ArrayEqual {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter size");
		int n=sc.nextInt();
		int arr1[]=new int[n]; 
		int arr2[]=new int[n];
		
		System.out.println("enter elements of 1st array");
		for(int i=0;i<n;i++) {
			arr1[i]=sc.nextInt();
		}
		
		System.out.println("enter elements of 2nd array");
		for(int i=0;i<n;i++) {
			arr2[i]=sc.nextInt();
		}
		
		boolean isEqual=Arrays.equals(arr1, arr2);
		if(isEqual==true) {
			System.out.println("two arrays are equal");
		}
		else {
			System.out.println("not equal");
		}

	}

}
