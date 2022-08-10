package com.example.practice.self;

import java.util.Scanner;
import java.util.Stack;

public class Parenthesis_0811 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		
		for(int i = 0; i < T; i++) {
			System.out.println(sc.next()); //nextLine()쓰면 안 된다
		}
	}
	
	public static String solve(String s) {
		Stack<Character> stack = new Stack<>();
		
		for(int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			
			if(c == '(') {
				stack.push(c);
			}
			
			//닫는 괄호
			else if(stack.empty()) {
				return "NO";
			}
			
			else {
				stack.pop();
			}
		}
		
		
		if(stack.empty()) {
			return "YES";
		} else {
			return "NO";
		}
		
	}
}
