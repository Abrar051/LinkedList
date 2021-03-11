package ArithmeticEvaluation; //main class of whole package
import java.util.*;
public class ArithmeticEvaluate {
    public static void main(String[] args) {
        ArithmeticExpressionEvaluation obj = new ArithmeticExpressionEvaluation();
        EvaluateResult obj2 = new EvaluateResult();
        Scanner input = new Scanner(System.in);
        System.out.println("Enter string to evaluate : ");
        String str = input.next();
        obj.transferToNode(str);
        //obj.evaluate();
        //System.out.println(obj.searchPrevious(obj.searchNode('+')).obj);
        //System.out.println(obj.result());
        System.out.println(obj2.evaluate(str));
    }
}
