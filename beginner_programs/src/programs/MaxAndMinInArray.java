package beginner_programs;

import java.util.Scanner;

public class MaxAndMinInArray {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size");
		int size=sc.nextInt();
		int arr[]=new int[size];
		for(int i=0;i<size;i++) {
			arr[i]=sc.nextInt();
		}
		int max=arr[0];
		int min=arr[0];
		for(int i=1;i<size;i++){
			if(arr[i]>max) {
				max=arr[i];
			}
			
		}
		
		for(int i=1;i<size;i++){
			if(arr[i]<min) {
				min=arr[i];
			}
			
		}
		
		
		System.out.println("maximum elemebnt in array "+max);
		System.out.println("mininmun element in array "+min);

	}

}
