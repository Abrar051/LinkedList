package ArithmeticEvaluation;

import java.util.Stack;
import java.util.Scanner;
public class Calculator {

    public enum Operator{ADD, SUBTRACT, MULTIPLY, DIVIDE, BLANK}

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        OperatorFunctions obj = new OperatorFunctions();
        String expression = input.next();
        Calculator calc = new Calculator();
        System.out.println(obj.compute(expression));
    }



}