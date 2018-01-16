package com.company.Tree;

/**
 * Created by wsx on 2017/9/23.
 */
public class Node {
    public Node left;
    public Node right;
    public int date;
    public Node(int date){
        this.date=date;
        this.right=null;
        this.left=null;
    }
}
