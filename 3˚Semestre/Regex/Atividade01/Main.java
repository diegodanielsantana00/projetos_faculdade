
import java.util.regex.*; 

public class Main {
	public static void main(String[] args) {
        
		System.out.println(Pattern.matches("[a][a]+[b]+", "aabbb"));
		System.out.println(Pattern.matches("[a]{1}[b]+", "abbb"));
		System.out.println(Pattern.matches("[a]+[b][b][b]+", "aaaabbbb"));
		System.out.println(Pattern.matches("[a][a]+[b][b][b]+", "aaaabbbb"));
		System.out.println(Pattern.matches("[ab]{3}", "aab"));
		System.out.println(Pattern.matches("ab{1}", "ab"));
		System.out.println(Pattern.matches("ab{2}", "aabbb"));
		System.out.println(Pattern.matches("ab{2,}", "aabbb"));
		System.out.println(!Pattern.matches("ab{2,}", "aabbb"));
		System.out.println(Pattern.matches("ab{4,}", "aabbb"));
		System.out.println(Pattern.matches("a{2,}b", "aabbb"));
		System.out.println(Pattern.matches("a{1,}b{2,}", "aabbb"));
	}
}
