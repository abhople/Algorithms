/**
 * 
 */
package com.test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author Anup
 * Find Strings from a list, which matches a certain pattern
 */
public class PatternMatch {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		String pattern = "moon";
		List<String> strList = new ArrayList<String>();
		strList.add("leet");
		strList.add("toom");
		strList.add("meem");
		strList.add("reet");
		strList.add("0000");
		
		for(String s: strList) {
			System.out.println("Pattern for String " + s + " is:" + isPatternMatching(s, pattern));
		}
	}

	public static boolean isPatternMatching(String s, String pattern) {

		if (s.length() != pattern.length())
			return false;

		Map<Character,Character> map = new HashMap<Character, Character>();
		int t = 0;
		StringBuilder res = new StringBuilder("");
		while (t < s.length()) {
			char s1Char = s.charAt(t);
			char s2Char = pattern.charAt(t);
			
			if(!map.containsKey(s1Char)) {
				map.put(s1Char, s2Char);
				
			}
			res = res.append(map.get(s1Char));
			if(res.toString().equalsIgnoreCase(pattern)) return true;
			t++;
		}
		
		return false;

	}

}
