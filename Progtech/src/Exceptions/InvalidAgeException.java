package Exceptions;

public class InvalidAgeException extends Throwable {
    public InvalidAgeException(int age){
        System.out.println("The character must be 12 or older!");
    }
}
