public class BST<T extends Comparable<T>> {
    private T datum;
    private BST<T> left;
    private BST<T> right;

    public BST(T datum) {
        this.datum = datum;
        left = null;
        right = null;
    }

    public T getDatum() {
        return datum;  // returns the datum of a node
    }
    public BST<T> getLeft() {
        return left;   // returns the left subtree
    }
    public BST<T> getRight() {
        return right;  // returns the right subtree
    }

    public void setLeft(BST<T> tree) {
        left = tree;
    }

    public void setRight(BST<T> tree) {
        right = tree;
    }

    public void insert(T datum) {
        if(this.datum.compareTo(datum) > 0){
            if(getLeft() == null){
                left = new BST<T>(datum);
            } else {
                left.insert(datum);
            }
        } else if(this.datum.compareTo(datum) < 0){
            if(getRight()==null){
                right = new BST<T>(datum);
            } else {
                right.insert(datum);
            }
        }
    }

    public String toString() {
        String s = "" + datum + ", ";
        if (left != null)
            s = left.toString() + s;
        if (right != null)
            s = s + right.toString();
        return s;
    }

    public int depth(){
        int lRet;
        int rRet;
        if(left == null && right == null){
            lRet = 1;
            rRet = 1;
        } else if(left == null){
            lRet = 1;
            rRet = 1 + right.depth();
        } else if(right == null) {
            rRet = 1;
            lRet = 1 + left.depth();
        } else {
            lRet = 1 + left.depth();
            rRet = 1 + right.depth();
        }

        return Math.max(lRet, rRet);
    }
}