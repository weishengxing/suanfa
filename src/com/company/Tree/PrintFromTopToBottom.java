package com.company.Tree;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by wsx on 2018/1/18.
 * 从上往下打印二叉树的每个结点，同一层的结点按照从左到右的顺序打印。
 * tip：广搜
 */
public class PrintFromTopToBottom {
    public static void printFromTopToBottom(Node node){
        if(node==null){
            return;
        }
        Queue<Node> queue=new LinkedList<>();
        queue.add(node);
        while (!queue.isEmpty()){
            Node tempNode=queue.poll();
            System.out.print(tempNode.date+" ");
            if(tempNode.left!=null){
                queue.add(tempNode.left);
            }
            if(tempNode.right!=null){
                queue.add(tempNode.right);
            }
        }

    }
    public static void main(String[] args){
        Node root1=new Node();
        Node node1=new Node();
        Node node2=new Node();
        Node node3=new Node();
        Node node4=new Node();
        Node node5=new Node();
        Node node6=new Node();
        root1.left=node1;
        root1.right=node2;
        node1.left=node3;
        node1.right=node4;
        node4.left=node5;
        node4.right=node6;
        root1.date=8;
        node1.date=8;
        node2.date=7;
        node3.date=9;
        node4.date=2;
        node5.date=4;
        node6.date=7;
        printFromTopToBottom(root1);
    }
}
