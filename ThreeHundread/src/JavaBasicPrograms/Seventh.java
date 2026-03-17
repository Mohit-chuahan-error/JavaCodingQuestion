package JavaBasicPrograms;
//Write a program to check whether a number is prime.
public class Seventh {
	public static void main(String[] args) {
		System.out.println(prime(11));
	}

	public static String prime(int num){
		
		if(num==0 || num==1) {
			return "prime number";
		}
		
	for(int i=2;i<num;i++) {
		
		if(num%i==0) {
			return "not prime number";
		}
		}
		return " prime number";
	}
	
}
