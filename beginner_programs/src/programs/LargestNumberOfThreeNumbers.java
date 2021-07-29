package beginner_programs;

public class LargestNumberOfThreeNumbers {

	public static void main(String[] args) {
		int a=20;
		int b=20;
		int c=30; 
		if(a>b && a>c) {
			System.out.println("a is larger number "+a);
		}
		else if(b>a && b>c) {
			System.out.println("b is larger number "+b);
		}
		else {
			System.out.println("c is larger number "+c);
		}

	}

}
