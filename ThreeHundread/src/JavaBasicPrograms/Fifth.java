package JavaBasicPrograms;

//Write a program to calculate factorial of a number.
public class Fifth {

	public static void main(String[] args) {

		System.out.println(factorial(4));
	}
	
	public static int factorial(int a) {
	
		int fact=1;
for(int i=a;i>1;i--) {
	
	fact=fact*i;
}
		
		
		return fact;
	}
}
