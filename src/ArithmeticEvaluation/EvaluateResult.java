package ArithmeticEvaluation;

import java.util.Stack;
//step 4 : calculate final result of the expression
public class EvaluateResult {
    public Double evaluate(String input) {
        /* Create stacks for operators and operands */
        Stack<Integer> operator = new Stack<Integer>();
        Stack<Double> value = new Stack<Double>();
        /* Create temporary stacks for operators and operands */
        Stack<Integer> optmp = new Stack<Integer>();
        Stack<Double> valtmp = new Stack<Double>();
        input = "0" + input;
        input = input.replaceAll("-", "+-");
        /* Store operands and operators in respective stacks */
        String temp = "";
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (ch == '-')
                temp = "-" + temp;
            else if (ch != '+' && ch != '*' && ch != '/')
                temp = temp + ch;
            else {
                value.push(Double.parseDouble(temp));
                operator.push((int) ch);
                temp = "";
            }
        }
        value.push(Double.parseDouble(temp));
        char operators[] = {'/', '*', '+'};
        /* Evaluation of expression */
        for (int i = 0; i < 3; i++) {
            boolean it = false;
            while (!operator.isEmpty()) {
                int opt = operator.pop();
                double v1 = value.pop();
                double v2 = value.pop();
                if (opt == operators[i]) {
                    /* if operator matches evaluate and store in temporary stack */
                    if (i == 0) {
                        valtmp.push(v2 / v1);
                        it = true;
                        break;
                    } else if (i == 1) {
                        valtmp.push(v2 * v1);
                        it = true;
                        break;
                    } else if (i == 2) {
                        valtmp.push(v2 + v1);
                        it = true;
                        break;
                    }
                } else {
                    valtmp.push(v1);
                    value.push(v2);
                    optmp.push(opt);
                }
            }
            /* Push back all elements from temporary stacks to main stacks */
            while (!valtmp.isEmpty())
                value.push(valtmp.pop());
            while (!optmp.isEmpty())
                operator.push(optmp.pop());
            /* Iterate again for same operator */
            if (it)
                i--;
        }
        return value.pop();
    }
}
