package JavaBasicPrograms;

//Write a program to check Armstrong number
public class Code14 {

	public static void main(String[] args) {
	armstrong(1533);
			
	}
	
	public static void armstrong(int num) {

		int original=num;
		int arm=0;
		if(num==1 || num==0) {
			System.out.println("Armstrong Number");
		}
		else {
			int number=String.valueOf(num).length();
			for(int i=0;i<number;i++) {
		
				  int digit = num % 10;
				  arm += Math.pow(digit, number);
		            num = num / 10;
			}
			
			System.out.println(arm);
		}
		if (arm == original) {
		    System.out.println("Armstrong Number");
		} else {
		    System.out.println("Not Armstrong Number");
		}
		
		
		
		
//	int original=num;
//	int arm=0;
//	int digits=String.valueOf(num).length();
//	
//	while(num>0) {
//		
//		int digit=num%10;
//		arm=(int) (arm+Math.pow(digit,digits));
//		
//		num=num/10;
//	}
//		
//		if (arm == original) {
//		    System.out.println("Armstrong Number");
//		} else {
//		    System.out.println("Not Armstrong Number");
//		}
//
//		
//		
	}
	
	}
