package ArithmeticEvaluation; //main class of whole package
import java.util.*;
public class ArithmeticEvaluate {
    public static void main(String[] args) {
        ArithmeticExpressionEvaluation obj = new ArithmeticExpressionEvaluation();
        EvaluateResult obj2 = new EvaluateResult();
        SimplifiedExpression obj3 = new SimplifiedExpression();
        EvaluateString obj4 = new EvaluateString();
        Scanner input = new Scanner(System.in);
        System.out.println("Enter string to evaluate : ");
        String str = input.next();
        //System.out.println(obj2.evaluate(str));
        System.out.println(obj3.stringCompress("(23+56)"));
        System.out.println(obj4.evaluate(str));
    }
}
