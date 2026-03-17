package StringProblem41;

import java.util.HashSet;
import java.util.LinkedHashSet;

//Remove duplicate characters.
public class Code45 {
	public static void main(String[] args) {
		System.out.println(removeDuplicate("Chauhan"));
	}

	public static String removeDuplicate(String str) {

		LinkedHashSet<Character> hs = new LinkedHashSet<>();
//		for (char ch : str.toCharArray()) {
//			hs.add(ch);
//		}
//		StringBuilder sb = new StringBuilder();
//		for (char ch : hs) {
//			sb.append(ch);
//		}
		
		String result = "";
		
		  for(char ch : str.toCharArray()) {
	            if(!hs.contains(ch)) {
	                hs.add(ch);
	                result += ch;
	            }
	        }
		  return result;
		//return sb.toString();
	}
}
