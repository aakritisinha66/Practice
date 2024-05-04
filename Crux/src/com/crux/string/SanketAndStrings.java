package com.crux.string;

import java.util.Scanner;

public class SanketAndStrings {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();

        sc.nextLine(); // Consume the newline character
        String str = sc.nextLine();
        int maxSubStr = process(str, k);
        System.out.println(maxSubStr);
    }

    public static int process(String str, int k) {
        int l = 0;
        int r = 0;
        int maxc = 0;
        while (l < str.length()) {
            int currMax = 0;
            int count = k;
            while (count != -1 && r<str.length()) {
                if (str.charAt(r) == 'a') {
                    r++;
                    currMax++;
                } else {
                    count = count - 1;
                    currMax++;
                    r++;
                    if (count < 0) {
                        currMax--;
                    }
                }
            }
            maxc = Math.max(currMax, maxc);
            l++;
        }
        return maxc;
    }

}


// The issue you're encountering here is related to how Scanner handles input. When you use nextInt(), it reads an integer from the input buffer but leaves the newline character (\n) in the buffer. Then, when you call nextLine(), it consumes that newline character and returns an empty string.

// To fix this issue, you can add an additional sc.nextLine() after nextInt() to consume the newline character before reading the actual string input.
