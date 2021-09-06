package com.binarytreedemo;

public class BinaryTree {

    static class Node{
        int data;
        Node left;
        Node right;

        public Node(int data) {
            this.data = data;
            left = null;
            right = null;
        }
    }

    public void insertElement(Node node , int data){
        if(data < node.data){
            if(node.left != null){
                insertElement(node.left,data);
            }
            else{
                node.left= new Node(data);
            }
        }
        else if(data>node.data){
            if(node.right != null){
                insertElement(node.right,data);
            }
            else{
                node.right= new Node(data);
            }
        }
    }
    //To print

    public void traverseTree(Node node){
        if(node != null){
            traverseTree(node.left);        //traversing all left node-inorder traversing
            System.out.println(node.data + "");
            traverseTree(node.right);
        }
    }

    public static void main(String [] args){
        BinaryTree binaryTree = new BinaryTree();
        Node node = new Node(56);  //head node

        binaryTree.insertElement(node,30);
        binaryTree.insertElement(node,70);
        binaryTree.insertElement(node,3);
        binaryTree.insertElement(node,11);
        binaryTree.insertElement(node,16);
        binaryTree.insertElement(node,22);
        binaryTree.insertElement(node,40);
        binaryTree.insertElement(node,60);
        binaryTree.insertElement(node,95);
        binaryTree.insertElement(node,65);
        binaryTree.insertElement(node,63);
        binaryTree.insertElement(node,67);

        System.out.println("Display Node");
        binaryTree.traverseTree(node);

    }
}
