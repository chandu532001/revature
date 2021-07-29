package regex_expressions;

public class PhoneNumber {

	public static void main(String[] args) {
		System.out.println(isvalid("+91-8919753751"));
	}
	
	public static boolean isvalid(String phone) {
		return phone.matches("\\+91-[0-9]{10}");
	}

}  
