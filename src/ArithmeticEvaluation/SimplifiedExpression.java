package ArithmeticEvaluation;
//this class will do the operation between the brackets
//(a+b)+(c+d) here the class will enter then add at first a and b then replace the + sign with a and b

import java.util.ArrayList;

public class SimplifiedExpression {
    public Node head = null;
    public Node tail = null;
    ArrayList<Character> obj = new ArrayList<>();
    EvaluateResult obj2 = new EvaluateResult();

    public double stringCompress(String str) {

        int bracketCounter = 1;
        for (int i = 0; i < str.length(); i++) {
            char[] ch = new char[str.length()];
            if (str.charAt(i) == '(') {
                int j = 0;
                while (str.charAt(i + 1) != ')') {
                    ch[j] = str.charAt(i + 1);
                    j++;
                    i++;
                }
                String str2 = String.valueOf(ch);
                double result = obj2.evaluate(str2);
                return result;
            }
        }
        return 0;
    }
    public String scanString (String str)
    {
        String[] compress = new String[str.length()];
        for (int i=0;i<str.length();i++)
        {
            if (str.charAt(i)=='(')
            {

            }
        }
        return null;
    }
}

