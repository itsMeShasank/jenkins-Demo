package org.example;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Calculator calculator = new Calculator();
        System.out.println(calculator.addTwoNumbers(1,1))
        System.out.println(calculator.subtractTwoNumbers(1,1));
        System.out.println(calculator.multiplyTwoNumbers(1,1));
    }
}
