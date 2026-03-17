package JavaBasicPrograms;


// Write a program to check whether a number is even or odd
public class Third {
public static void main(String[] args) {
	System.out.println(oddorEven(41));
}

public static String oddorEven(int i) {
	
	if(i%2==0) {
		return "even";
	}
	else {
		return "Odd";
	}

	
}
}
