package JavaBasicPrograms;

//Write a program to reverse a number
public class Eight {

	public static void main(String[] args) {
		
		System.out.println(reverse(8769));
	}
	
	public static int reverse(int num) {
		
		int revesenum=0;
		
		while(num>0) {
			int rem=num%10; 
			revesenum=revesenum*10+rem;
			
			num=num/10;
		}
		
		return revesenum;
		
		
	}
}
