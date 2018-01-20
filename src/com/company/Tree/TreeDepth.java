package com.company.Tree;

/**
 * Created by wsx on 2018/1/20.
 * 输入一棵二叉树的根结点，求该树的深度。从根结点到叶结点依次经过
 * 的结点（含根、叶结点）形成树的一条路径，最长路径的长度为树的深度。
 */
public class TreeDepth {
    public static int treeDeth(Node node){
        if(node==null)
            return 0;
        int left=treeDeth(node.left);
        int right=treeDeth(node.right);
        return left>right?left+1:right+1;
    }
    //判断是否为平衡二叉树
    public static Boolean isBirnaryTree(Node node){
        if(node==null)
            return true;
        int left=treeDeth(node.left);
        int right=treeDeth(node.right);
        int dif=left-right;
        if(dif>1||dif<-1){
            return false;
        }
        return isBirnaryTree(node.left)&&isBirnaryTree(node.right);
    }

    public static void main(String[] args){
        Node root=new Node();
        Node node1=new Node();
        Node node2=new Node();
        Node node3=new Node();
        Node node4=new Node();
        Node node5=new Node();
        Node node6=new Node();
        root.left=node1;
        root.right=node2;
        node1.left=node3;
        node1.right=node4;
        node2.right=node5;
        node4.left=node6;
        root.date=1;
        node1.date=2;
        node2.date=3;
        node3.date=4;
        node4.date=5;
        node5.date=6;
        node6.date=7;
        System.out.println("树的深度："+treeDeth(root));
        System.out.println("是否为平衡二叉树"+isBirnaryTree(root));
    }
}
