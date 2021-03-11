package ArithmeticEvaluation;

import java.util.Stack;
import java.util.Scanner;
public class ArithmeticExpressionValidation {

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        OperatorFunctions obj = new OperatorFunctions();
        String str = input.next();
        System.out.println(obj.compute(str));
    }



}