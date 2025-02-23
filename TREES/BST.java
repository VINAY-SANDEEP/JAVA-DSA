package TREES;

import java.util.*;

public class BST {
    static class Node {
        int data;
        Node left, right;
        Node(int data) {
            this.data = data;
            left = right = null;
        }
    }
    public static Node insert(Node root, int data) {
        if(root == null) {
            return new Node(data);
        }
        if(data < root.data) {
            root.left = insert(root.left, data);
        } else {
            root.right = insert(root.right, data);
        }
        return root;
    }
    public static void inorder(Node root) {
        if(root == null) {
            return;
        }
        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }
    public static boolean search(Node root, int key) { // O(H)
        if(root == null) {
            return false;
        }
        if(root.data == key) {
            return true;
        }
        if (root.data > key) {
            return search(root.left, key);
        }
        else {
            return search(root.right, key);
        }
    }
    public static Node delete(Node root,int val){
        if (root.data > val) {
            root.left = delete(root.left, val);
        }
        else if (root.data < val) {
            root.right = delete(root.right, val);
        }
        else{
            if (root.left == null && root.right == null) {
             return null;
        }
        if (root.left == null) {
            return root.right;
        }
        else if(root.right == null){
            return root.left;
        }
        Node IS = iorderSuccessor(root.right);
        root.data = IS.data;
        root.right = delete(root.right, IS.data);
    }
    return root;
}
    public static Node iorderSuccessor(Node root){
     while (root.left != null) {
        root = root.left;
     }
     return root;
    }
    public static void printRange(Node root,int x, int y){
        if (root == null) {
            return;
        }
        if (root.data >= x && root.data <= y) {
            printRange(root.left, x, y);
            System.out.print(root.data+" ");
            printRange(root.right, x, y);
        }
        else if (root.data >= y ) {
            printRange(root.left, x, y);
        }
        else{
            printRange(root.right, x, y);
        }
    }
    public static void printRootLeaf(Node root,ArrayList<Integer> path){
        if (root == null) {
            return;
        }
        path.add(root.data);
        if (root.left== null && root.right == null) {
            printPath(path);
        
        }
        else{
            printRootLeaf(root.left, path);
            printRootLeaf(root.right, path);
        }
         path.remove(path.size()-1);
     }
        public static void printPath(ArrayList<Integer> path) {
         for (int i = 0; i < path.size(); i++) {
              System.out.print(path.get(i) + " -> ");
            }   
        System.out.println();
     }
     public static void main(String[] args) {
        int arr[] = {5, 3, 7, 1, 4, 6, 8};
        Node root = null;
        for(int i = 0; i < arr.length; i++) {
            root = insert(root, arr[i]);
        }
        inorder(root);
        System.out.println();
        System.out.println(search(root, 4));
          delete(root, 7);
          inorder(root);
          printRange(root, 1, 4);
          printRootLeaf(root, new ArrayList<>());
    }
}
