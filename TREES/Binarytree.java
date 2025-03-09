package TREES;

import java.util.LinkedList;
import java.util.Queue;

import OOPS.statics;

public class Binarytree {
    class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    static class TreeBuilder {
        static int idx = -1;

        public static Node buildTree(int[] nodes, Binarytree bt) {
            idx++;
            if (idx >= nodes.length || nodes[idx] == -1) {
                return null;
            }
            Node newNode = bt.new Node(nodes[idx]); 
            newNode.left = buildTree(nodes, bt);
            newNode.right = buildTree(nodes, bt);
            return newNode;
        }
    }
    public static void preorder(Node root){
        if (root == null) {
            return;
        }
       System.out.print(root.data+" ");
         preorder(root.left);
         preorder(root.right);
    }
    public static void inorder(Node root){
        if (root == null) {
            return ;
        }
        inorder(root.left);
        System.out.print(root.data+" ");
        inorder(root.right);
    }
    public static void postorder(Node root){
        if (root == null) {
            return ;
        }
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.data+" ");
    }
    public static void levelOrder(Node root){
        if (root == null) {
            return ;
        }
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        while (!q.isEmpty()) {
            Node temp = q.poll();
            System.out.print(temp.data+" ");
            if (temp.left != null) {
                q.add(temp.left);
            }
            if (temp.right != null) {
                q.add(temp.right);
            }
        }
    }
    public static int countNodes(Node root){
        if (root == null) {
            return 0;
        }
        int left = countNodes(root.left);
        int right = countNodes(root.right);
        return left+right+1;
    }
    public static int height(Node root){
        if (root == null) {
            return 0;
        }
        int left = height(root.left);
        int right = height(root.right);
        return Math.max(left, right)+1;
    }
    public static int diameter(Node root){
        if (root == null) {
            return 0;
        }
        int left = height(root.left);
        int right = height(root.right);
        int ld = diameter(root.left);
        int rd = diameter(root.right);
        return Math.max(left+right+1, Math.max(ld, rd));
    }
    public static int sum(Node root){
        if (root == null) {
            return 0;
        }
        int left = sum(root.left);
        int right = sum(root.right);
        return left+right+root.data;
    }
    public static void nthlevel(Node root,int n){
        if (root == null) {
            return;
        }
        if (n == 1) {
            System.out.print(root.data + " ");
        }
        nthlevel(root.left, n-1);
        nthlevel(root.right, n-1);
    }
     public static Node insert(Node root, int key, Binarytree bt) {
        if (root == null) {
            return bt.new Node(key);
        }
        if (key < root.data) {
        root.left = insert(root.left, key, bt);
        } else if (key > root.data) {
            root.right = insert(root.right, key, bt);
        }
        return root;
    }
     public static  boolean search(Node root, int key) {
        if (root == null) return false;
        if (root.data == key) return true;
        return key < root.data ? search(root.left, key) : search(root.right, key);
    }
    public  static Node delete(Node root, int key) {
        if (root == null) return root;
        if (key < root.data) {
            root.left = delete(root.left, key);
        } else if (key > root.data) {
            root.right = delete(root.right, key);
        } else {
           
            if (root.left == null) return root.right;
            else if (root.right == null) return root.left;
            root.data = minValue(root.right);
            root.right = delete(root.right, root.data);
        }
        return root;
    }
    
     private static int minValue(Node root) {
        int minv = root.data;
        while (root.left != null) {
            minv = root.left.data;
            root = root.left;
        }
        return minv;
    }
    public static void main(String[] args) {
        int[] nodes = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};
        Binarytree bt = new Binarytree();
        Node root = TreeBuilder.buildTree(nodes, bt);
        bt.insert(root, 7, bt);

        System.out.println("Binary Tree Created Successfully!");
        preorder(root);
        System.out.println();
        inorder(root);
        System.out.println();
        postorder(root);
        System.out.println();
        levelOrder(root);
        System.out.println();
        System.out.println(countNodes(root));
        System.out.println(height(root));
        System.out.println(diameter(root));
        System.out.println(sum(root));
        nthlevel(root, 1);
        System.out.println();
        nthlevel(root, 2);
        System.out.println();
        nthlevel(root, 3);
    }
}
