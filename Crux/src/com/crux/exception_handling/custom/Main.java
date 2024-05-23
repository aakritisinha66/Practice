package com.crux.exception_handling.custom;

public class Main {

    public static void main(String[] args) {
        try {
            custom();
        }
        catch(CustomException ex) {
            System.out.println(ex.getMessage());
        }
    }
    public static void custom() throws CustomException {
        if(true){
            throw new CustomException("This is custom exception");
        }
    }
    
}
