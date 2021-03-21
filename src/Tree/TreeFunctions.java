package Tree;

public class TreeFunctions {
    public Node root = null;
    public Node tail = null;

    public Node getMinimumValue(Node current) {
        while (current.left != null) {
            current = current.left;
        }
        return current;
    }

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


    //display function


    public void display() {
        inorderArrange(root);
    }

    void inorderArrange(Node root) {
        if (root != null) {
            inorderArrange(root.left);
            System.out.print(root.data + " ");
            inorderArrange(root.right);
        }
    }

    /* / */


    public void findParent(Node node, int data, int parent) {
        if (node == null)
            return;
        if (node.data == data) {
            System.out.print(parent);
        } else {
            findParent(node.left, data, node.data);
            findParent(node.right, data, node.data);
        }
    }

    private int minValue(Node root) {
        int min = root.data;
        while (root.left != null) {
            min = root.left.data;
            root = root.left;
        }
        return min;
    }


    public void delete(int data) {
        root = delete(root, data);
    }

    public Node delete(Node root, int data) {
        if (root == null)
            return null;
        if (data < root.data)
            root.left = delete(root.left, data);
        else if (data > root.data)
            root.right = delete(root.right, data);
        else {
            // node with only one child or no child
            if (root.left == null)
                return root.right;
            else if (root.right == null)
                return root.left;
            root.data = minValue(root.right);
            root.right = delete(root.right, root.data);
        }

        return root;
    }


}
