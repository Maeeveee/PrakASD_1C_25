package P14;

public class BinaryTree25 {
    Node25 root;
    int size;

    public BinaryTree25() {
        root = null;

    }

    public boolean isEmpty() {
        return root == null;
    }

    public void add(int data) {
        if (isEmpty()) {
            root = new Node25(data);
        }else{
            Node25 current = root;
            while(true){
                if (data<current.data) {
                    if (current.left == null) {
                        current.left = new Node25(data);
                        break;
                    }else{
                        current = current.left;
                    }
                }else if (data>current.data) {
                    if (current.right == null) {
                        current.right = new Node25(data);
                    }else{
                        current = current.right;
                    }
                }else{
                    break;
                }
            }
        }
    }
    public boolean find(int data) {
        Node25 current = root;
        while (current != null) {
            if (current.data == data) {
                return true;
            }else if (data<current.data) {
                current = current.left;
            }else{
                current = current.right;
            }
        }
        return false;
    }
    public void traversePreOrder(Node25 node) {
        if (node != null) {
            System.out.print(" "+node.data);
            traversePreOrder(node.left);
            traversePreOrder(node.right);
        }
    }
    public void traversePostOrder(Node25 node) {
        if (node != null) {
            traversePostOrder(node.left);
            traversePostOrder(node.right);
            System.out.print(" "+node.data);
        }
    }
    public void traverseInOrder(Node25 node) {
        if (node != null) {
            traverseInOrder(node.left);
            System.out.print(" "+node.data);
            traverseInOrder(node.right);
        }
    }
    public Node25 getSuccessor(Node25 del){
        Node25 successor = del.right;
        Node25 successorParent = del;
        while (successor.left != null) {
            successorParent = successor;
            successor = successor.left;
        }
        if (successor != del.right) {
            successorParent.left = successor.right;
            successor.right = del.right;
        }
        return successor;
    }

    public void delete(int data) {
        if (isEmpty()) {
            System.out.println("Tree kosong");
            return;
        }
        Node25 parent = root;
        Node25 current = root;
        boolean isLeftChild = false;
        while (current != null&&current.data!=data) {
            parent = current;
            if (data<current.data) {
                current = current.left;
                isLeftChild = true;
            }else if (data>current.data) {
                current = current.right;
                isLeftChild = false;
            }
        }
        if (current == null) {
            System.out.println("tidak dapat menemukan data");
            return;
        }else{
            if (current.left == null && current.right == null) {
                if (current==root) {
                    root = null;
                }else{
                    if (isLeftChild) {
                        parent.left = null;
                    }else{
                        parent.right = null;
                    }
                }
            }else if (current.left==null) {
                if (current==root) {
                    root = current.right;
                }else if (isLeftChild) {
                    parent.left = current.right;
                }else{
                    parent.right = current.right;
                }
            }else if (current.right==null) {
                if (isLeftChild) {
                    root = current.left;
                }else if (isLeftChild) {
                    parent.left = current.left;  
                }else{
                    parent.right = current.left;
                }
            }else{
                Node25 successor = getSuccessor(current);
                if (current==root) {
                    root = successor;
                }else{
                    if (isLeftChild) {
                        parent.left = successor;
                    }else{
                        parent.right = successor;
                    }
                    successor.left = current.left;
                }
            }
        }
    }
    //Latihan Praktikum nomor 1
    public void addRecursive(int data) {
        root = addRecursive(root, data);
    }
    public Node25 addRecursive(Node25 currrent, int data) {
        if (currrent == null) {
            return new Node25(data);
        }
        if (data<currrent.data) {
            currrent.left = addRecursive(currrent.left, data);
        }else if (data>currrent.data) {
            currrent.right = addRecursive(currrent.right, data);
        }else{
            return currrent;
        }
        return currrent;
    }
    //Latihan praktikum nomor 2
    public int findMinValue() {
        if (isEmpty()) {
            System.out.println("Tree kosong");
            return -1;
        }

        Node25 current = root;
        while (current.left != null) {
            current = current.left;
        }
        return current.data;
    }

    public int findMaxValue() {
        if (isEmpty()) {
            System.out.println("Tree kosong");
            return -1;
        }

        Node25 current = root;
        while (current.right != null) {
            current = current.right;
        }
        return current.data;
    }
    //Latihan praktikum nomor 3
    public void displayLeafNodes(){
        displayLeafNodes(root);
    }
    public void displayLeafNodes(Node25 node){
        if (node == null) {
            return;
        }
        if (node.left == null && node.right == null) {
            System.out.print(" "+node.data);
        }
        displayLeafNodes(node.left);
        displayLeafNodes(node.right);
    }

    //Latihan praktikum nomor 4
    public int countLeafNodes(){
        return countLeafNodes(root);
    }
    public int countLeafNodes(Node25 node){
        if (node == null) {
            return 0;
        }
        if (node.left == null && node.right == null) {
            return 1;
        }
        int leftCount = countLeafNodes(node.left);
        int rightCount = countLeafNodes(node.right);
        return leftCount + rightCount;
    }
}
