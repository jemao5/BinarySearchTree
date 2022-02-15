public class Main {

    public static void main(String[] args) {
        BST<Integer> bsti = new BST<Integer>(12);
        bsti.insert(7);
        bsti.insert(19);
        // If printed in order, the below line should produce 7, 12, 19
        System.out.println(bsti);
        System.out.println(bsti.depth());
        randP rThousand = new randP(1000);
        BST<Integer> bst1k = new BST<Integer>(rThousand.nextInt());
        for(int i = 1; i < 1000; i++) {
            bst1k.insert(rThousand.nextInt());
        }
        System.out.println(bst1k.depth());
        System.out.println(bst1k.toString());
    }

}
