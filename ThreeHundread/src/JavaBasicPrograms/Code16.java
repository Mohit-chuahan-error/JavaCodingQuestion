package JavaBasicPrograms;

public class Code16 {

	public static void main(String[] args) {
		int a = 18;
		int b = 14;
		int c=a;
		int d=b;
		while(b != 0) {
		    int temp = b;
		    b = a % b;
		    a = temp;
		}
		int lcm=(c*d)/a;
		
		System.out.println(lcm);
	
	}
}
