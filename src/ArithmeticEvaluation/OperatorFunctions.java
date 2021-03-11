package ArithmeticEvaluation;

import java.util.Stack;

public class OperatorFunctions {
    public double compute(String str) {
        Stack<Double> numberStack = new Stack<Double>();
        Stack<Operator> operatorStack = new Stack<Operator>();
        for (int i = 0; i < str.length(); i++) {
            try {
                int number = parseNumber(str, i);
                numberStack.push((double) number);

                i = i + Integer.toString(number).length();
                if (i >= str.length()) {
                    break;
                }

                Operator op = parseOperator(str, i);
                collapseTop(numberStack, operatorStack, op);
                operatorStack.push(op);
            } catch (NumberFormatException ex) {
                return Integer.MIN_VALUE;
            }
        }
        collapseTop(numberStack, operatorStack, Operator.blank);
        if (numberStack.size() == 1 && operatorStack.size() == 0) {
            return numberStack.pop();
        }
        return 0;
    }

    private void collapseTop(Stack<Double> numberStack, Stack<Operator> operatorStack, Operator futureTop) {
        while (numberStack.size() >= 2 && operatorStack.size() >= 1) {
            if (priorityOfOperator(futureTop) <= priorityOfOperator(operatorStack.peek())) {
                double second = numberStack.pop();
                double first = numberStack.pop();
                Operator op = operatorStack.pop();
                double result = applyOp(first, op, second);
                numberStack.push(result);
            } else {
                break;
            }
        }
    }

    private double applyOp(double left, Operator op, double right) {
        switch (op) {
            case add:
                return left + right;
            case subtract:
                return left - right;
            case multiply:
                return left * right;
            case divide:
                return left / right;
            default:
                return right;
        }

    }

    private int priorityOfOperator(Operator op) {
        switch (op) {
            case add:
            case subtract:
                return 1;
            case multiply:
            case divide:
                return 2;
            case blank:
                return 0;
        }
        return 0;
    }

    private int parseNumber(String sequence, int offset) {
        StringBuilder sb = new StringBuilder();
        while (offset < sequence.length() && Character.isDigit(sequence.charAt(offset))) {
            sb.append(sequence.charAt(offset));
            offset++;
        }
        return Integer.parseInt(sb.toString());
    }

    private Operator parseOperator(String sequence, int offset) {
        if (offset < sequence.length()) {
            char op = sequence.charAt(offset);
            switch (op) {
                case '+':
                    return Operator.add;
                case '-':
                    return Operator.subtract;
                case '*':
                    return Operator.multiply;
                case '/':
                    return Operator.divide;
            }
        }
        return Operator.blank;
    }
}
