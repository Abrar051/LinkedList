package new1;


class Node {
    int data;
    Node next;
    public Node(int data) {
        this.data = data;
        this.next = null;
    }

    @Override
    public String toString() {
        return "Last Node{" +
                "data=" + data +
                ", next=" + next +
                '}';
    }
}
