package com.crux.string;

import java.util.Scanner;

public class CamelCase {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        StringBuilder str1 = new StringBuilder(str.charAt(0));
        for(int i=0;i<str.length();i++){
            // System.out.println(str.charAt(i));
            if(i==str.length()-1 || Character.isUpperCase(str.charAt(i+1))){  //First condition is for last character. So it won't check for i+1 character (Index Out of bound error).
                str1.append(str.charAt(i));
                System.out.println(str1);
                str1.setLength(0);
            }
            else{
                str1.append(str.charAt(i));
            }

        }

    }
}
//IAmACompetitiveProgrammer