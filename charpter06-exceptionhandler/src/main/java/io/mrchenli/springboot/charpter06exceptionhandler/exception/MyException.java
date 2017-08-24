package io.mrchenli.springboot.charpter06exceptionhandler.exception;

public class MyException extends RuntimeException{

    public MyException(String message) {
        super(message);
    }

}
