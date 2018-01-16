package com.company.QueueAndStack;

import java.util.Stack;

/**
 * Created by wsx on 2017/10/13.
 * 使用两个栈模拟队列
 */
public class MyQueue<E> {
    private Stack<E> s1=new Stack<E>();
    private Stack<E> s2=new Stack<E>();

    public synchronized void put(E e){
        s1.push(e);

    }
    public synchronized E pop(){
        if(s2.isEmpty()){
            while (!s1.isEmpty()){
                s2.push(s1.pop());
            }
        }
        return s2.pop();
    }
    public synchronized boolean empty(){
        return s1.isEmpty()&&s2.isEmpty();
    }
    public static void main(String[] args){
        MyQueue<Integer> myQueue=new MyQueue<>();
        myQueue.put(2);
        myQueue.put(3);
        System.out.println(myQueue.pop());
        myQueue.put(1);
        System.out.println(myQueue.pop());
        System.out.println(myQueue.pop());

    }
}
