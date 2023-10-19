/**
 * 
 */
package com.recursion;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Link: https://www.codingninjas.com/studio/problems/subsequences-of-string_985087
 */
public class P3_Possible_String_Subsequences {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String input1 = "abc";
		ArrayList<String> result1 = subsequences(input1);
		System.out.println("Possible subsequences of " + input1 + " are: " + result1);
	}

	private static ArrayList<String> subsequences(String str) {
		ArrayList<String> result = new ArrayList<String>();
		String s = "";
		getAllSubsequences(str, s, result, 0);
		Collections.sort(result);
		return result;
	}

	private static void getAllSubsequences(String str, String s, ArrayList<String> result, int index) {
		if (index == str.length()) {
			if (!s.equals("")) {
				result.add(s);
			}
			return;
		}
		// Take subsequence
		getAllSubsequences(str, s + str.charAt(index), result, index + 1);
		// Not Take subsequence
		getAllSubsequences(str, s, result, index + 1);
	}

}
