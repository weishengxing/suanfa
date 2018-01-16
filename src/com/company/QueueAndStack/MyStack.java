package com.company.QueueAndStack;

import java.util.LinkedList;

public class MyStack <T>{
	LinkedList<T> myStack=new LinkedList<T>();
	
	public synchronized void push(T e){
		myStack.add(e);
	}
	
	public T peer(){
		return myStack.getFirst();
	}
	
	public void pop(){
		myStack.removeFirst();
	}
	
    public boolean empty() {  
	      return myStack.isEmpty();  
    }  
  
    @Override  
	 public String toString() {  
	     return myStack.toString();  
	  }  
	  
}
