public class BinaryTree {
    private Node root;

    public BinaryTree() {

    }

    public void setRoot(Node root) {
        this.root = root;
    }

    public Node getRoot() {
        return this.root;
    }
    
    public DataElement rsearch(String vergleich) {
        return this.root.rsearch(vergleich);
    }
    
    public void rinsert(DataElement data) {
        if (this.root == null) {
            this.root = new Node(data);
        } else {
            this.root.rinsert(data);
        }
    }
}
