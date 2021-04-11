package com.epam.tat.calculator.impl;

import com.epam.tat.calculator.ICalculator;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Calculator implements ICalculator {

    private int precision;

    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        try {
        System.out.println("Enter precision:");
        int precision = sc.nextInt();
        System.out.println("Enter a:");
        double a = sc.nextDouble();
        System.out.println("Enter b:");
        double b = sc.nextDouble();
        System.out.println("Enter the operation + - * /:");
        String operation = sc.next();
        sc.close();
        ICalculator calculator=new Calculator(precision);
        switch (operation){
            case"+":
                System.out.println(calculator.add(a,b));
                break;
            case "-":
                System.out.println(calculator.subtract(a,b));
                break;
            case "*":
                System.out.println(calculator.multiply(a,b));
                break;
            case "/":
                System.out.println(calculator.divide(a,b));
                break;
            default:
                System.out.println("Тип операции может быть + - * /");
        }



    }
        catch (InputMismatchException ae){
            System.out.println("Неверный формат введенных данных!");
        }
    }


    public Calculator(int precision ) {
        this.precision = precision;
    }

    @Override
    public double add(double a, double b) {
        double c=a+b;
        double scale=Math.pow(10,precision);
        c=Math.rint(c*scale)/scale;
        return c;
        //throw new UnsupportedOperationException("You need to implement this method");
    }

    @Override
    public double subtract(double a, double b) {
        double c=a-b;
        double scale=Math.pow(10,precision);
        c=Math.rint(c*scale)/scale;
        return c;
       // throw new UnsupportedOperationException("You need to implement this method");
    }

    @Override
    public double multiply(double a, double b) {
        double c=a*b;
        double scale=Math.pow(10,precision);
        c=Math.rint(c*scale)/scale;
        return c;
      //  throw new UnsupportedOperationException("You need to implement this method");
    }

    @Override
    public double divide(double a, double b) {
        double c=a/b;
        double scale=Math.pow(10,precision);
        c=Math.rint(c*scale)/scale;
        return c;
       // throw new UnsupportedOperationException("You need to implement this method");
    }
}
