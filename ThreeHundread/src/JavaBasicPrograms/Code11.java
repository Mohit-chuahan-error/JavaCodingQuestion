package JavaBasicPrograms;
//Write a program to find sum of digits
public class Code11 {
public static void main(String[] args) {
	System.out.println(sum(76714));
}
public static int sum(int num) {
	
	int sum=0;
	while(num>0) {
		
		int rem=num%10;
		sum=sum+rem;
		num=num/10;
		
		
	}
	
	
	return sum;
	
}
}
