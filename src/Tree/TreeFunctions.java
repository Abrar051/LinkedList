package Tree;

public class TreeFunctions {
    public Node root = null;
    public int count =3;
    public void add(int data) {
        root = insert(root, data);
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

    void display1() {
        inorderRec(root);
    }

    void inorderRec(Node root) {
        if (root != null) {
            inorderRec(root.left);
            System.out.print(root.data + " ");
            inorderRec(root.right);
        }
    }

    Node delete(Node root,int data)
    {
        if (this.root == null) {
            return null;
        }
        if (data < root.data)
            root.left = delete(root,data);
        else if (data > root.data)
            root.right = delete(root,data);
        else {
            if (root.left == null)
                return root.right;
            else if (root.right == null)
                return root.left;
            root.data = minValue(root.right);
            root.right = delete(root.right,root.data);
        }
        return root;
    }

    public void deleteNew (int data)
    {

    }

    public void display() {
        display(root);
    }

    private void display(Node node) {
        if (node == null) {
            return;
        }

        display(node.left);
        System.out.printf("%s ", node.data);
        display(node.right);
    }

    public void printIn2d(Node root, int space)
    {

        // Base case
        if (root == null)
            return;

        // Increase distance between levels
        space += count;

        printIn2d(root.right, space);

        System.out.print("\n");
        for (int i = count; i < space; i++)
            System.out.print(" ");
        System.out.print(root.data + "\n");


        printIn2d(root.left, space);
    }

    public void print2D(Node root)
    {
        printIn2d(root, 0);
    }

    private int minValue(Node root) {
        int min = root.data;
        while (root.left != null)
        {
            min = root.left.data;
            root = root.left;
        }
        return min;
    }

}
