package StringProblem41;
//Check if string is palindrome.
public class Code42 {
	
	public static void main(String[] args) {
		System.out.println(palindrome("chauhan"));
	}
	public static String palindrome(String str) {
		StringBuilder strr=new StringBuilder(str);
		
		strr.reverse();
		if(str.equals(strr.toString())) {
			return "palindrome";
		}
		else {
			return "Not palindrome";
		}
		
		
		
	}

}
