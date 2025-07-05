package com.interviewPractice;

public class CustomExceptionHandling  {
    public static void main(String[] args) throws CustomException{
       throw new CustomException("Hi, this is Aakriti!"); 
    }
}

class CustomException extends Exception {
    CustomException(String message) {
        super(message);
    }
}
