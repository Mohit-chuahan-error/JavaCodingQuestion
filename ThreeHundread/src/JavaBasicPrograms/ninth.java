package JavaBasicPrograms;
//Write a program to check whether a number is palindrome.
public class ninth {
public static void main(String[] args) {
	int num=76867;
	
	int num2=num;
	int revesenum=0;
	
	while(num>0) {
		int rem=num%10; 
		revesenum=revesenum*10+rem;
		
		num=num/10;
	}
	
	System.out.println(revesenum);
	if(num2==revesenum) {
		System.out.println("palindrome");
	}
	else {
		System.out.println("Not palindrome");
	}
}
}
