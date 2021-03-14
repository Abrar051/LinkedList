package ArithmeticEvaluation;

import java.util.Stack;

public class EvaluateString {


    public static int evaluate(String str) {
        char[] ch = str.toCharArray();
        Stack<Integer> values = new Stack<Integer>();
        Stack<Character> ops = new Stack<Character>();
        for (int i = 0; i < ch.length; i++) {
            if (ch[i] == ' ')
                continue;
            if (ch[i] >= '0' && ch[i] <= '9') {
                StringBuffer buff = new StringBuffer();
                while (i < ch.length && ch[i] >= '0' && ch[i] <= '9')
                    buff.append(ch[i++]);
                values.push(Integer.parseInt(buff.toString()));
                i--;
            } else if (ch[i] == '(')
                ops.push(ch[i]);
            else if (ch[i] == ')') {
                while (ops.peek() != '(')
                    values.push(operation(ops.pop(), values.pop(), values.pop()));
                ops.pop();
            } else if (ch[i] == '+' || ch[i] == '-' || ch[i] == '*' || ch[i] == '/') {
                while (!ops.empty() && presedence(ch[i], ops.peek()))
                    values.push(operation(ops.pop(), values.pop(), values.pop()));
                ops.push(ch[i]);
            }
        }
        while (!ops.empty())
            values.push(operation(ops.pop(), values.pop(), values.pop()));
        return values.pop();
    }

    public static boolean presedence(char op1, char op2) {
        if (op2 == '(' || op2 == ')')
            return false;
        if ((op1 == '*' || op1 == '/') && (op2 == '+' || op2 == '-'))
            return false;
        else
            return true;
    }

    public static int operation(char operator, int b, int a) {
        switch (operator) {
            case '+':
                return a + b;
            case '-':
                return a - b;
            case '*':
                return a * b;
            case '/':
                if (b == 0) {
                    System.out.println("Can't be divided by zero ");
                    return 0;
                } else {
                    return a / b;
                }
        }
        return 0;
    }
}

