package com.neetCode250;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class groupAnagrams {
    public static List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> unique = new HashMap<>();
        for (int i = 0; i < strs.length; i++) {
            char[] arr = strs[i].toCharArray();
            Arrays.sort(arr);
            String key = new String(arr);

            if (!unique.containsKey(key)) {
                unique.put(key, new ArrayList<>());
            }
            unique.get(key).add(strs[i]);
        }
        // System.out.println(unique.values());
        List<List<String>> result = new ArrayList<>(unique.values());
        return result;
    }

    public static void main(String[] args) {
        String[] input = { "act", "pots", "tops", "cat", "stop", "hat" };
        List<List<String>> result = groupAnagrams(input);

        for (List<String> group : result) {
            System.out.println(group);
        }
    }

}
