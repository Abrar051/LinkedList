package ArithmeticEvaluation;

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

    public int operation(Node n1) {
        Node next = n1.next;
        Node previous = searchPrevious(n1);
        return result(previous.obj, next.obj, n1.obj);
    }


    public int result(char previous, char next, char sign) {
        while (true) {
            if (sign == '+') {
                return previous + next;
            } else if (sign == '-') {
                return previous - next;
            } else if (sign == '*') {
                return previous * next;
            } else if (sign == '/') {
                return previous / next;
            }
        }
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

    public Node searchPrevious(Node n) {
        Node current = head;
        Node previous;
        while (true) {
            if (head == null) {
                return null;
            } else if (current.next == n) {
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
