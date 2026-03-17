package StringProblem41;

public class Code43 {
public static void main(String[] args) {
	 String str = "Hello World".toLowerCase().replace(" ", "");
	
	int vowels=0;
	int consonants=0;
	for(Character ch:str.toCharArray()) {
		if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
		    vowels++;
        } else {
            consonants++;
        }
	}
		 System.out.println("Vowels: " + vowels);
	        System.out.println("Consonants: " + consonants);
	
	
	        long vowels1 = str.chars()
	                .filter(c -> "aeiou".indexOf(c) != -1)
	                .count();

	        long consonants1 = str.chars()
	                .filter(c -> Character.isLetter(c))
	                .filter(c -> "aeiou".indexOf(c) == -1)
	                .count();
	        System.out.println("Vowels: " + vowels1);
	        System.out.println("Consonants: " + consonants1);
}

}
