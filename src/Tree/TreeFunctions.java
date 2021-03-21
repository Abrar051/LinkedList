package Tree;

public class TreeFunctions {
    public Node root = null;
    public Node tail = null;

    public static Node getMinimumKey(Node current) {
        while (current.left != null) {
            current = current.left;
        }
        return current;
    }

    public void add(int data) {
        root = insert(root, data);
    }

    public void add2(int data) {
        Node newNode = new Node(data);
        Node current = root;
        if (root == null) {
            root = newNode;
            newNode.right = null;
            newNode.left = null;
        } else {
            while (current.left != null & current.right != null) {
                if (newNode.data > current.data) {
                    current = current.right;
                } else if (newNode.data < current.data) {
                    current = current.left;
                }
            }
            current = newNode;
        }
    }

    public void insert(int data) {
        Node newNode = new Node(data);
        Node current = root;
        if (root == null) {
            root = newNode;
            newNode.right = null;
            newNode.left = null;
        } else {
            if (data > current.data) {
                current.right = newNode;
                current = newNode;
                newNode.right = null;
                newNode.left = null;
            } else if (data < current.data) {
                current.left = newNode;
                root = newNode;
                newNode.right = null;
                newNode.left = null;
            }
        }
    }

    Node insert(Node root, int data) {
        if (root == null) {
            root = new Node(data);
            return root;
        }
        if (data < root.data)
            root.left = insert(root.left, data);//if data is less than root then goto left
        else if (data > root.data)
            root.right = insert(root.right, data);//if data is less than root then goto left
        return root;
    }

    public void display() {
        inorderRec(root);
    }

    void inorderRec(Node root) {
        if (root != null) {
            inorderRec(root.left);
            System.out.print(root.data + " ");
            inorderRec(root.right);
        }
    }


    public void display(Node node) {
        if (node == null) {
            return;
        }

        display(node.left);
        System.out.printf("%s ", node.data);
        display(node.right);
    }

    public Node delete(Node root, int data) {

        Node parent = null;


        Node current = root;


        while (current != null && current.data != data) {
            parent = current;
            if (data < current.data) {
                current = current.left;
            } else {
                current = current.right;
            }
        }
        if (current == null) {
            return root;
        }
        if (current.left == null && current.right == null) {
            if (current != root) {
                if (parent.left == current) {
                    parent.left = null;
                } else {
                    parent.right = null;
                }
            } else {
                root = null;
            }
        } else if (current.left != null && current.right != null) {
            Node successor = getMinimumKey(current.right);
            int val = successor.data;
            delete(root, successor.data);
            current.data = val;
        } else {
            Node child = (current.left != null) ? current.left : current.right;
            if (current != root) {
                if (current == parent.left) {
                    parent.left = child;
                } else {
                    parent.right = child;
                }
            } else {
                root = child;
            }
        }

        return root;
    }

    private int minValue(Node root) {
        int min = root.data;
        while (root.left != null) {
            min = root.left.data;
            root = root.left;
        }
        return min;
    }

}
