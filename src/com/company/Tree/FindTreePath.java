package com.company.Tree;

import java.util.Stack;

/**
 * Created by wsx on 2018/1/19.
 * 输入一颗二叉树和一个整数，打印出二叉树中结点值的和为输入整数的所
 * 有路径。从树的根节点开始往下一直到叶结点所经过的结点形成一条路径。
 */
public class FindTreePath {
    public static void init(Node node,int sum){
        if(node==null)
            return;
        Stack<Integer> stack=new Stack<>();
        findTreePath(node,sum,stack,0);

    }
    public static void findTreePath(Node node,int sum, Stack<Integer> stack,int currentSum){
        currentSum+=node.date;
        stack.push(node.date);
        if(node.left==null&&node.right==null){
            if(currentSum==sum){
                System.out.print("找到一条路径:");
                for(int path:stack){
                    System.out.print(path+" ");
                }
                System.out.println();

            }
        }
        if(node.left!=null){
            findTreePath(node.left,sum,stack,currentSum);
        }
        if(node.right!=null){
            findTreePath(node.right,sum,stack,currentSum);
        }
        currentSum-=node.date;
        stack.pop();

    }
    public static void main(String[] args){
        Node root1=new Node();
        Node node1=new Node();
        Node node2=new Node();
        Node node3=new Node();
        Node node4=new Node();
        root1.left=node1;
        root1.right=node2;
        node1.left=node3;
        node1.right=node4;
        root1.date=10;
        node1.date=5;
        node2.date=12;
        node3.date=4;
        node4.date=7;
        init(root1,22);

    }
}
