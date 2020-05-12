package Exceptions;

import javax.management.Attribute;

public class InvalidAttributeException extends Throwable {
    public InvalidAttributeException(){
        System.out.println("An attribute must be between 3 and 20!");
    }
}
