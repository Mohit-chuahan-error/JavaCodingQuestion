package StringProblem41;
//Count words in a sentence
public class Code44 {
	public static void main(String[] args) {
		int counter=0;
		String str="my Name is Mohit chauhan";
		 String[] words = str.split(" ");
	         counter = words.length;

	        System.out.println("Number of words: " + counter);
	}

}
