package com.company.Tree;

/**
 * Created by wsx on 2017/9/23.
 * 二叉排序树
 */
public class BrinaryTree {
    public Node root;
    public void insert(int date){
        Node newNode=new Node(date);
        if(root==null){
            root=newNode;
        }else{
            Node parentNode;
            Node currentNode=root;
            while (true){
                parentNode=currentNode;
                if(date<currentNode.date){
                    currentNode=currentNode.left;
                    if(currentNode==null){
                        parentNode.left=newNode;
                        return;
                    }
                }else{
                    currentNode=currentNode.right;
                    if(currentNode==null){
                        parentNode.right=newNode;
                        return;
                    }
                }

            }
        }
    }
    public void bulidTree(int[] date){
        for(int i=0;i<date.length;i++){
            insert(date[i]);
        }
    }
    //中序遍历
    public void order(Node localNode){
        if(localNode!=null) {
            order(localNode.left);
            System.out.print(localNode.date + "  ");
            order(localNode.right);
        }
    }
    public void order(){
        order(root);
    }
    public  static void main(String[] args){
        int[] date={1,10,4,6,0,2,3,7,5,11,9,8};
        BrinaryTree brinaryTree=new BrinaryTree();
        brinaryTree.bulidTree(date);
        brinaryTree.order();
    }
}
