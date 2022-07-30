package com.example.practice.self;

import java.util.LinkedList;

public class A_List {
	public static void main(String[] args) {
		//미리 몇 개가 필요한지 몰라도 쓸 수 있으면 좋을텐데 ...
		//필요에 따라 크기가 늘어나거나 줄어들면 좋을 것 같은데
		LinkedList<Integer> list = new LinkedList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(1,5);
		
		System.out.println(list);
	}

}

//List
//1. 여러 개의 데이터를 한꺼번에 다룰 수 있음
//2. 메모리상에 연속되지 않아도 됨
//3. 미리 공간을 확보해 놓지 않아도 됨
//4. 필요에 따라 데이터가 늘어나거나 줄어듬
//5. 첫 번째 위치로부터 index로 목표위치를 알려면 한칸한칸 이동하면서 찾아야 함 