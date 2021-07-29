package beginner_programs;

import java.util.Scanner;

public class SearchingElementInArray {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		boolean ele=false;
		System.out.println("enter a number");
		int num=sc.nextInt();
		System.out.println("enter size of array");
		int size=sc.nextInt();
		int arr[]=new int[size];
		for(int i=0;i<size;i++) {
			arr[i]=sc.nextInt();
			if(arr[i]==num) {
				ele=true;
				break;
			}
		}
		if(ele==true) {
			System.out.println("element found");
		}
		else {
			System.out.println("element not found");
		}
	}

}
