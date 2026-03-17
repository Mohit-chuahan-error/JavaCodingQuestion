package StringProblem41;

//Reverse a string
public class Code41 {

	public static void main(String[] args) {
		System.out.println(reverseString("Mohit chauhan"));
	}
	
	public static String reverseString(String name) {
		
		
//		StringBuilder reverseName=new StringBuilder(name); 
//		reverseName.reverse();
//		return reverseName.toString();
		
		StringBuilder reverseName=new StringBuilder(); 
	for(int i=name.length()-1;i>=0;i--) {
		reverseName.append(name.charAt(i));
		
	}
		
		return reverseName.toString();
	}
}
