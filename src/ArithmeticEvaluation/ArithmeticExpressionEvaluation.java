package ArithmeticEvaluation;

import java.util.Arrays;

public class ArithmeticExpressionEvaluation {
    public Node head = null;
    public Node tail = null;

    public void evaluate() {
        Node current = head;
        while (current != null) {
            if (current.obj == '(') {
                System.out.println();
            } else if (current.obj == ' ') {
                System.out.println();
            } else if (current.obj == ' ') {
                System.out.println();
            }
            current = current.next;
        }
    }

    public void transferToNode(String str) {
        //first case head is null
        for (int i = 0; i < str.length(); i++) {
            addNode(str.charAt(i));
        }
    }

    public int result ()
    {
        Node current=head;
        Node n1;
        while (current!=null)
        {
            current=current.next;
            if (current.obj=='+' || current.obj=='-' || current.obj=='*' || current.obj=='/')
            {
                break;
            }
        }
        n1=current;
        int a= Integer.parseInt(String.valueOf(searchPrevious(current.obj).obj));
        int b = Integer.parseInt(String.valueOf(searchNode(current.next.obj).obj));
        //int a=searchPrevious(current.obj).obj;
        //int b= current.next.obj;
        if (n1.obj=='+')
        {
            return a+b;
        }
        else if (n1.obj=='-')
        {
            return a-b;
        }
        else if (n1.obj=='*')
        {
            return a*b;
        }
        else if (n1.obj=='/')
        {
            return a/b;
        }
        return 0;
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

    public int scanNumber (){

        return 0;
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

    public void addNode(char ch) {
        Node n = new Node(ch);
        if (head == null) {
            head = tail = n;
            tail.next = null;
        } else {
            tail.next = n;
            tail = n;
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
