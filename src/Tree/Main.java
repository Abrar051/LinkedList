package Tree;

public class Main {
    public static void main(String[] args) {
        TreeFunctions treeFunctions = new TreeFunctions();
        Node root = new Node(100);
        treeFunctions.add(100);
        treeFunctions.add(20);
        treeFunctions.add(10);
        treeFunctions.add(40);
        treeFunctions.add(500);
        treeFunctions.add(250);
        treeFunctions.add(800);
        treeFunctions.display();
        //treeFunctions.delete(root,800);
        //System.out.println(treeFunctions.root.data);
    }
}
