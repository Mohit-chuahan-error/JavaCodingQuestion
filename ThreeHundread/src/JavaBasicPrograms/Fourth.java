package JavaBasicPrograms;

//Write a program to find the largest of three numbers. 
public class Fourth {
	public static void main(String[] args) {
		System.out.println(largest(34, -24, 67));

	}

	public static int largest(int a, int b, int c) {
//	
//	int num=a;
//	 if(num<b) {
//		num=b;
//	}
//	if(num<c) {
//		num=c;
//	}
//	return num;
//}

		return Math.max(a, Math.max(b, c));
	}
}
