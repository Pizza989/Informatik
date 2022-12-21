public class Node {
    private DataElement data;
    private Node nextLeft, nextRight;

    public Node(DataElement data) {
        this.data = data;
    }

    public void setLeft(Node left) {
        this.nextLeft = left;
    }

    public void setRight(Node right) {
        this.nextRight = right;
    }

    public Node getRight() {
        return this.nextRight;
    }

    public Node getLeft() {
        return this.nextLeft;
    }

    public void setData(DataElement data) {
        this.data = data;
    }

    public DataElement getData(){
        return this.data;
    }

    // rekursiv
    public DataElement rsearch(String vergleich){
        if(this.data.istGleich(vergleich)) {
            return this.data;
        } else {
            DataElement left = this.nextLeft != null? this.nextLeft.rsearch(vergleich) : null;
            DataElement right = this.nextRight != null ? this.nextRight.rsearch(vergleich) : null;
            if(left == null && right == null) {
                return null;
            } else {
                return left == null ? right : left;
            }
        }
    }

    public void rinsert(DataElement data) {
        if (data.istKleinerAls(this.data.getWord())) {

        } else if (data.istGrößerAls(this.data.getWord())) {

        }
    }
}
