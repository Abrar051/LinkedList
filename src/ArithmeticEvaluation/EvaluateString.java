package ArithmeticEvaluation;

import java.util.Stack;


public class EvaluateString {


    public static int evaluate(String str) {
        char[] ch = str.toCharArray();
        Stack<Integer> values = new Stack<Integer>();
        Stack<Character> operator = new Stack<Character>();
        for (int i = 0; i < ch.length; i++) {
            if (ch[i] == ' ')
                continue;
            if (ch[i] >= '0' && ch[i] <= '9') {
                StringBuffer buff = new StringBuffer();
                while (i < ch.length && ch[i] >= '0' && ch[i] <= '9')
                    buff.append(ch[i++]);
                values.push(Integer.parseInt(buff.toString()));
                i--;
            }
            else if (ch[i] == '(')
                operator.push(ch[i]);
            else if (ch[i] == ')') {
                while (operator.peek() != '(')
                    values.push(operation(operator.pop(), values.pop(), values.pop()));
                operator.pop();
            } else if (ch[i] == '+' || ch[i] == '-' || ch[i] == '*' || ch[i] == '/') {
                while (!operator.empty() && signOperation(ch[i], operator.peek()))
                    values.push(operation(operator.pop(), values.pop(), values.pop()));
                operator.push(ch[i]);
            }
        }
        while (!operator.empty())
            values.push(operation(operator.pop(), values.pop(), values.pop()));
        return values.pop();
    }

    public static boolean signOperation (char op1, char op2) {
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

