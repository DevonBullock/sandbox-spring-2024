package org.example.sandbox.exception;
import java.util.Scanner;
public class HelloException {

    public static void main(String[] args) {
        try {
            throw new Exception("Hello, Exception!");
        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
            //do something
        } catch (NullPointerException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
            //do something
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            //finally do something
        }
        try {
            //do something
        } finally {
            // do something
        }
        //java 7 multi-try-catch
        try {
            //do somthing
        } catch(ArithmeticException | NullPointerException e) {
            e.printStackTrace();
        }
        try (Scanner scanner1 = new Scanner(System.in)) {
            //do something
        }

    }




}
