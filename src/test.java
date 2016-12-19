import java.util.Scanner;

public class test {
	public static boolean isPalindrome(String in) {
		if (in.length() == 0 || in.length() == 1) {
			return true;
		}

		if (in.charAt(0) == in.charAt(in.length() - 1)) {
			return isPalindrome(in.substring(1, in.length() - 1));

		} else {
			
			return false;
			
		}
	}

	public static void main(String[] args) {

		Scanner src = new Scanner(System.in);
		System.out.println("What word would you like to test?");
		
		String input = src.nextLine();

		if (isPalindrome(input)) {
			
			System.out.println("It is a palindrome");
			
		} else {
			System.out.println("It is not a palindrome");
		}
	}
}
