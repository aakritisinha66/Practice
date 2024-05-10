package com.crux.recursion;

import java.util.Scanner;

//(Assuming n-1 is placed already):-
//Move (n-1) discs from source to helper 
//Move n from source to destination
//Move (n-1) discs from helper to destination  

public class TowerOfHanoi {
    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        move(n, "src", "dest", "helper" );
    }
    public static void move(int n, String src, String dest, String helper){
        if(n==0){
            return;
        }

        move(n-1, src, helper, dest);
        System.out.println("Moving "+n+"th disc from "+src+" to "+dest);
        move(n-1, helper, dest, src);
    }
    
}
