package JavaBasicPrograms;
//Write a program to print ASCII value of a character.
public class Code20 {
public static void main(String[] args) {
	char ch='c';
	
	
	System.out.println((int)ch);
	
	if(ch >= 'A' && ch <= 'Z') {
	    System.out.println("Capital Letter");
	}
	else if(ch >= 'a' && ch <= 'z') {
	    System.out.println("Small Letter");
	}
}
}
