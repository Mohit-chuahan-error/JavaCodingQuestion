package JavaBasicPrograms;

//Write a program to count digits in a number
public class Tenth {
public static void main(String[] args) {
	System.out.println(count(325664));
}
public static int count(int num) {
	
//	String str=Integer.toString(num);
//	String str2 = String.valueOf(num);
	
	int count=0;
	if(num==0) {
		return 1;
	}
	else {
		while(num>0) {
			num=num/10;
			count++;
			
		}
		
	}
	return count;
	
}

}
