package com.neetCode250;

public class ValidAnagram {
    public static boolean anagram(String str1, String str2) {
        if(str1.length() != str2.length()) return false;
        int[] freqArray = new int[26];
        for(int i = 0; i < str1.length(); i++) {
            freqArray[str1.charAt(i) - 'a']++;
            freqArray[str2.charAt(i) - 'a']--;
        }
        for(int count: freqArray) {
            if(count!=0) return false;
        }
        return true;
    }
    public static void main(String[] args) {
        String str1 = "carrace";
        String str2 = "racecar";
        System.out.println(anagram(str1, str2));
    }
}
