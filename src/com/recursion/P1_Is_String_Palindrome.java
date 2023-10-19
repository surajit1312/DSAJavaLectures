/**
 * 
 */
package com.recursion;

/**
 * Link: https://www.codingninjas.com/studio/problems/check-palindrome_4219630
 */
public class P1_Is_String_Palindrome {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String str1 = "abcba";
		boolean isPalndrme1 = isPalindrome(str1);
		System.out.println("Is " + str1 + " Palindrome: " + isPalndrme1);

		String str2 = "MALYALAM";
		boolean isPalndrme2 = isPalindrome(str2);
		System.out.println("Is " + str2 + " Palindrome: " + isPalndrme2);
	}

	private static boolean isPalindrome(String S) {
		int start = 0;
		int end = S.length() - 1;

		return checkPalindrome(S, start, end);
	}

	private static boolean checkPalindrome(String str, int start, int end) {
		if (str == null || str.equals("")) {
			return true;
		}
		if (start >= end) {
			return true;
		}
		if (str.charAt(start) != str.charAt(end)) {
			return false;
		}
		return checkPalindrome(str, start + 1, end - 1);
	}

}
