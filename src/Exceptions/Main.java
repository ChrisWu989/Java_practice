package Exceptions;

import javax.management.RuntimeErrorException;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        main.method1();
        try {
            method4();
        } catch (ClassNotFoundException e) {
            throw new RuntimeErrorException(e)
        }
    }

    private void method1() {
        method2();
    }
    private void method2() {
        method3();
    }
    private void method3(){
        int x = 9/0;
    }
    private void method4(){
        thrownew ClassNotFoundException();
        threet swita
    }
}
//make yourown global exception handler
// custom global exceptions


public void userexception extends exception {
    USerException (string message){
super(message)
    }
    
}