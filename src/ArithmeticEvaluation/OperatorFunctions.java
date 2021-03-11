package ArithmeticEvaluation;

import java.util.Stack;

public class OperatorFunctions {
    public double compute(String sequence) {
        Stack<Double> numberStack = new Stack<Double>();
        Stack<Calculator.Operator> operatorStack = new Stack<Calculator.Operator>();
        for (int i = 0; i < sequence.length(); i++) {
            try {
                int number = parseNumber(sequence, i);
                numberStack.push((double) number);

                i = i + Integer.toString(number).length();
                if (i >= sequence.length()) {
                    break;
                }

                Calculator.Operator op = parseOperator(sequence, i);
                collapseTop(numberStack, operatorStack, op);
                operatorStack.push(op);
            } catch (NumberFormatException ex) {
                return Integer.MIN_VALUE;
            }
        }
        collapseTop(numberStack, operatorStack, Calculator.Operator.BLANK);
        if (numberStack.size() == 1 && operatorStack.size() == 0) {
            return numberStack.pop();
        }
        return 0;
    }

    private void collapseTop(Stack<Double> numberStack, Stack<Calculator.Operator> operatorStack, Calculator.Operator futureTop) {
        while (numberStack.size() >= 2 && operatorStack.size() >= 1) {
            if (priorityOfOperator(futureTop) <= priorityOfOperator(operatorStack.peek())) {
                double second = numberStack.pop();
                double first = numberStack.pop();
                Calculator.Operator op = operatorStack.pop();
                double result = applyOp(first, op, second);
                numberStack.push(result);
            } else {
                break;
            }
        }
    }

    private double applyOp(double left, Calculator.Operator op, double right) {
        switch (op) {
            case ADD:
                return left + right;
            case SUBTRACT:
                return left - right;
            case MULTIPLY:
                return left * right;
            case DIVIDE:
                return left / right;
            default:
                return right;
        }

    }

    private int priorityOfOperator(Calculator.Operator op) {
        switch (op) {
            case ADD:
                return 1;
            case SUBTRACT:
                return 1;
            case MULTIPLY:
                return 2;
            case DIVIDE:
                return 2;
            case BLANK:
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

    private Calculator.Operator parseOperator(String sequence, int offset) {
        if (offset < sequence.length()) {
            char op = sequence.charAt(offset);
            switch (op) {
                case '+':
                    return Calculator.Operator.ADD;
                case '-':
                    return Calculator.Operator.SUBTRACT;
                case '*':
                    return Calculator.Operator.MULTIPLY;
                case '/':
                    return Calculator.Operator.DIVIDE;
            }
        }
        return Calculator.Operator.BLANK;
    }
}
