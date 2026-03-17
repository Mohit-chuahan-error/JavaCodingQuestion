package JavaBasicPrograms;

//Write a program to generate Fibonacci series
public class Sixth {
public static void main(String[] args) {
	
	fibonacci(6);
	
}
public static void fibonacci(int num) {
	
	int a=0,b=1,c;
	
	System.out.print( a+" "+b+" ");
	while(num>0) {
		
		c=a+b;
		b=c;
		a=b;
		System.out.print(c+" ");
		
		
		num--;
	}
}



}
