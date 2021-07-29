package regex_expressions;

public class PanCard {

	public static void main(String[] args) {
		System.out.println(isvalid("ABCDE1234F"));
		System.out.println(isvalid("vysvuucgugcud"));

	}
	
	public static boolean isvalid(String pan) {
		return pan!=null && pan.matches("[A-Z]{5}[0-9]{4}[A-Z]{1}");
				}

}
