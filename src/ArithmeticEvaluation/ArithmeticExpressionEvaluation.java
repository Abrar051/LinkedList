package ArithmeticEvaluation;

import java.util.ArrayList;
import java.util.Arrays;

public class ArithmeticExpressionEvaluation {
    public Node head = null;
    public Node tail = null;
    ArrayList<Character> obj= new ArrayList();


    public void transferToNode(String str) {
        //first case head is null
        for (int i = 0; i < str.length(); i++) {
            addNode(str.charAt(i));
        }
    }


    public void operation (Node sign)
    {
        int result;
        int a= Integer.parseInt(String.valueOf(searchPrevious(sign.obj).obj));
        int b = Integer.parseInt(String.valueOf(searchNode(sign.next.obj).obj));
        if (sign.obj=='+')
        {
            result = a+b;
        }
        else if (sign.obj=='-')
        {
            result = a-b;
        }
        else if (sign.obj=='*')
        {
            result = a*b;
        }
        else if (sign.obj=='/')
        {
            result = a/b;
        }

    }

    public void intToChar (int i)
    {

    }
    public boolean result1(char c) {

        char[] obj = {'+','-','*','/'};
        return Arrays.asList(obj).contains(c);
    }


    public Node searchNode(char ch) {
        Node current = head;
        while (true) {
            if (head == null) {
                System.out.println("No match found");
                return null;
            } else if (current.obj == ch) {
                return current;
            }
            current = current.next;
        }
    }

    public int scanNumber (String str){
        int power=0,result=1;
        for (int i=0;i<str.length();i++)
        {
            if (Character.isDigit(str.charAt(i))==true)//started scanning number
            {
                obj.add(str.charAt(i));
                power++;
                if (Character.isDigit(str.charAt(i))==false)
                {
                    break;
                }
            }
        }
        for (int i=0;i<power;i++)
        {
            result= Integer.parseInt(String.valueOf(obj.get(i)));
        }
        return result;
    }
    public Node searchPrevious(char n) {
        Node current = head;
        Node previous;
        while (true) {
            if (head == null) {
                return null;
            } else if (current.next.obj == n) {
                return current;
            }
            current = current.next;
        }
    }

    public void addNode(char data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            newNode.back = tail;
            newNode.next = head;
            head.back = newNode;
            tail = newNode;
        }
    }


    public void display() {
        Node current = head;
        while (current != null) {
            if (head == null) {
                System.out.println("List is empty");
            } else {
                System.out.println(current.obj + " ");
            }
            current = current.next;
        }
    }
}
