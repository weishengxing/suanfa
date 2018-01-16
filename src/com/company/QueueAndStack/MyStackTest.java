package com.company.QueueAndStack;

import com.company.QueueAndStack.MyStack;

public class MyStackTest {
	public static void main(String[] arg) {
		MyStack<String> stack = new MyStack<String>();
		for (String s : "the prefect code".split(" ")) {// LIFO
			stack.push(s);
		}
		System.out.println("test:" + stack.toString());
		while (!stack.empty()) {
			System.out.print(stack.peer() + " ");
			stack.pop();
		}
		System.out.println();
		for (char s : "写了个一句话倒起来说的程序".toCharArray()) {// 用例：正话反说
			stack.push(String.valueOf(s));
		}
		while (!stack.empty()) {
			System.out.print(stack.peer());
			stack.pop();
		}
	}

}
